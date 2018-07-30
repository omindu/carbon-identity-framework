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

import java.util.List;

public class UserConsentPurposeInput {

    private List<UserConsentPurposeEntry> approvedPurposes;
    private List<UserConsentPurposeEntry> disapprovedPurposes;

    public List<UserConsentPurposeEntry> getApprovedPurposes() {

        return approvedPurposes;
    }

    public void setApprovedPurposes(List<UserConsentPurposeEntry> approvedPurposes) {

        this.approvedPurposes = approvedPurposes;
    }

    public List<UserConsentPurposeEntry> getDisapprovedPurposes() {

        return disapprovedPurposes;
    }

    public void setDisapprovedPurposes(List<UserConsentPurposeEntry> disapprovedPurposes) {

        this.disapprovedPurposes = disapprovedPurposes;
    }
}
