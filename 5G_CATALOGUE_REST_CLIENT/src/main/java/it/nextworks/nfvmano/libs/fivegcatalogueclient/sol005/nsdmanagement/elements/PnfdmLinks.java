/*
 * Copyright 2018 Nextworks s.r.l.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.nextworks.nfvmano.libs.fivegcatalogueclient.sol005.nsdmanagement.elements;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This type represents the links to resources that a PNFD management
 * notification can contain.
 */
@ApiModel(description = "This type represents the links to resources that a PNFD management notification can contain.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-23T16:31:35.952+02:00")

public class PnfdmLinks {
    @JsonProperty("pnfdInfo")
    private String pnfdInfo = null;

    @JsonProperty("subscription")
    private String subscription = null;

    public PnfdmLinks pnfdInfo(String pnfdInfo) {
        this.pnfdInfo = pnfdInfo;
        return this;
    }

    /**
     * Get pnfdInfo
     *
     * @return pnfdInfo
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getPnfdInfo() {
        return pnfdInfo;
    }

    public void setPnfdInfo(String pnfdInfo) {
        this.pnfdInfo = pnfdInfo;
    }

    public PnfdmLinks subscription(String subscription) {
        this.subscription = subscription;
        return this;
    }

    /**
     * Get subscription
     *
     * @return subscription
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PnfdmLinks pnfdmLinks = (PnfdmLinks) o;
        return Objects.equals(this.pnfdInfo, pnfdmLinks.pnfdInfo)
                && Objects.equals(this.subscription, pnfdmLinks.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnfdInfo, subscription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PnfdmLinks {\n");

        sb.append("    pnfdInfo: ").append(toIndentedString(pnfdInfo)).append("\n");
        sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}