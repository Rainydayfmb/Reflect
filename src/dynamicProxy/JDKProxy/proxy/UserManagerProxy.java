package dynamicProxy.JDKProxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author:Fmb
 * Description:
 * Date:18:48 2018/10/26
 * Modified By：
 */
public class UserManagerProxy implements InvocationHandler {

    private Object targetObject;

    /**
     * @Description:获得对象代理
     * @Date: 2018/10/26 18:52
     * @param targetObject
     * @Return:java.lang.Object
     */
    public Object getProxy(Object targetObject){
        this.targetObject=targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        checkPermission();
        Object ret=null;
        ret=method.invoke(targetObject,args);
        return ret;
    }

    private void checkPermission(){
        System.out.println("====检查权限====");
    }
}
