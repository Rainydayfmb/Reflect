package dynamicProxy.client;

import dynamicProxy.CglibProxy.CglibProxy;
import dynamicProxy.JDKProxy.IuserManager;
import dynamicProxy.JDKProxy.impl.UserManagerImpl;
import dynamicProxy.JDKProxy.proxy.UserManagerProxy;

/**
 * Author:Fmb
 * Description:
 * Date:18:55 2018/10/26
 * Modified By：
 */
public class client {
    public static void main(String[] args) {

        System.out.println("====JDK动态代理开始====");
        UserManagerProxy userManagerProxy = new UserManagerProxy();
        IuserManager userManagerJDK = (IuserManager) userManagerProxy.getProxy(new UserManagerImpl());
        userManagerJDK.addUser("fmb","123456");

        System.out.println("====cglib动态代理开始====");
        CglibProxy cglibProxy = new CglibProxy();
        IuserManager iuserManager = (IuserManager)cglibProxy.getProxy(new UserManagerImpl());
        iuserManager.addUser("fmbcglib","123456");

    }
}
