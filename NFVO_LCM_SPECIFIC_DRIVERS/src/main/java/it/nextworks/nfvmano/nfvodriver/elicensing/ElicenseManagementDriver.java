package it.nextworks.nfvmano.nfvodriver.elicensing;


import io.swagger.client.elma.ApiException;
import io.swagger.client.elma.model.RegistrationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.swagger.client.elma.ApiClient;
import io.swagger.client.elma.api.DefaultApi;
import io.swagger.client.elma.model.CheckLicensing;
import io.swagger.client.elma.model.Domains;
import it.nextworks.nfvmano.libs.ifa.common.exceptions.FailedOperationException;

import java.util.HashMap;
import java.util.Map;

public class ElicenseManagementDriver implements ElicenseManagementProviderInterface {

    private String elicensingManagerAddress =null;
    private Map<String, String> metadata=new HashMap<>();
    private static final Logger log = LoggerFactory.getLogger(ElicenseManagementDriver.class);
    private DefaultApi api = new DefaultApi();
    private String domainId;

    public ElicenseManagementDriver(String elicensingManagerAddress,String domainId){
        this.elicensingManagerAddress=elicensingManagerAddress;
        api.setApiClient(new ApiClient().setBasePath(elicensingManagerAddress).setDebugging(true));
        this.domainId=domainId;

    }

    @Override
    public void activateElicenseManagement(Map<String, String> metadata) throws FailedOperationException {
        log.debug("Requesting elicense management creation."+metadata);
        CheckLicensing body = new CheckLicensing();
        Domains d = new Domains();
        d.domainDID(domainId);
        d.addNsdItem(metadata.get("NSD_ID"));
        d.setNstId(metadata.get("NS_ID"));
        body.addDomainsItem(d);
        body.setProductID(metadata.get("product_id"));
        try {
            RegistrationResponse response = api.elicensemanagercoreElmcFrontOperationsCheckLicensing(body);
        } catch (ApiException e) {
            log.error("Error activating license",e);
            throw new FailedOperationException(e);
        }
    }

    @Override
    public void terminateElicenseManagement() throws FailedOperationException {

    }
}