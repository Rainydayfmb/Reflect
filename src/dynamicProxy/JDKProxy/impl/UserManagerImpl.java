package dynamicProxy.JDKProxy.impl;

import dynamicProxy.JDKProxy.IuserManager;

/**
 * Author:Fmb
 * Description:
 * Date:18:45 2018/10/26
 * Modified By：
 */
public class UserManagerImpl implements IuserManager {

    @Override
    public void addUser(String id, String password) {
        System.out.println("调用了UserManagerImpl.addUser方法");
    }
}
