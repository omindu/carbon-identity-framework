package org.wso2.carbon.identity.core;

import org.wso2.carbon.identity.base.IdentityException;

public class URLResolverException extends IdentityException {

    public URLResolverException(String message) {
        super(message);
    }

    public URLResolverException(String errorCode, String message) {
        super(errorCode, message);
    }

    public URLResolverException(String message, Throwable cause) {
        super(message, cause);
    }

    public URLResolverException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }
}
