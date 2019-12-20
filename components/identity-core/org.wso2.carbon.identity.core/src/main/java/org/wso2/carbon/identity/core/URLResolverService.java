package org.wso2.carbon.identity.core;

import java.util.Map;

public interface URLResolverService {

    String resolveUrl(String urlContext, boolean addProxyContextPath, boolean addWebContextRoot, String tenantDomain,
                      Map<String, Object> properties) throws URLResolverException;
}
