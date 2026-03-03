package com.training.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.struts2.dispatcher.HttpParameters;

public class AccountSecurityInterceptor extends AbstractInterceptor {
    
//    Map<String, Object> params = invocation.getInvocationContext().getParameters();
//    String username = params.get("username") != null
//            ? ((String[]) params.get("username"))[0]
//            : null;
    
    
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {

        System.out.println("Security Check Before Action");

        HttpParameters params = invocation.getInvocationContext().getParameters();

        String username = params.contains("username")
                ? params.get("username").getValue()
                : null;

        if ("blockedUser".equals(username)) {
            System.out.println("Account is Locked!");
            return "locked";
        }

        String result = invocation.invoke();

        System.out.println("After Action Execution");

        return result;
        }

}