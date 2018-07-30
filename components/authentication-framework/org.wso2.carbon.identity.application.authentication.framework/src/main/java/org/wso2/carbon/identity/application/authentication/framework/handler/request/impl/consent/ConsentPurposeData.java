/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.application.authentication.framework.handler.request.impl.consent;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the claim purposes required for a particular service provider
 */
public class ConsentPurposeData {

    private List<ApplicationConsentPurpose> consentMandatoryPurposes = new ArrayList<>();
    private List<ApplicationConsentPurpose> purposesWithConsent = new ArrayList<>();

    public List<ApplicationConsentPurpose> getConsentMandatoryPurposes() {

        return consentMandatoryPurposes;
    }

    public void setConsentMandatoryPurposes(List<ApplicationConsentPurpose> consentMandatoryPurposes) {

        this.consentMandatoryPurposes = consentMandatoryPurposes;
    }

    public List<ApplicationConsentPurpose> getPurposesWithConsent() {

        return purposesWithConsent;
    }

    public void setPurposesWithConsent(List<ApplicationConsentPurpose> purposesWithConsent) {

        this.purposesWithConsent = purposesWithConsent;
    }
}
