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

import org.wso2.carbon.consent.mgt.core.model.Purpose;

/**
 * Represents a consent purpose associated with an application.
 */
public class ApplicationConsentPurpose {

    private Purpose purpose;
    private int displayOrder;

    public ApplicationConsentPurpose(Purpose purpose, int displayOrder) {

        this.purpose = purpose;
        this.displayOrder = displayOrder;
    }

    public Purpose getPurpose() {

        return purpose;
    }

    public int getDisplayOrder() {

        return displayOrder;
    }

    public void setPurpose(Purpose purpose) {

        this.purpose = purpose;
    }

    public void setDisplayOrder(int displayOrder) {

        this.displayOrder = displayOrder;
    }

    @Override
    public int hashCode() {

        return purpose != null ? purpose.getId() : 0;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ApplicationConsentPurpose that = (ApplicationConsentPurpose) obj;

        if (this.getPurpose() == null || that.getPurpose() == null) {
            return false;
        }

        return this.getPurpose().getId().equals(that.getPurpose().getId());
    }
}
