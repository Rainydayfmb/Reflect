package dynamicProxy.CglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Author:Fmb
 * Description:
 * Date:19:42 2018/10/26
 * Modified By：
 */
public class CglibProxy implements MethodInterceptor{

    private Object targetObject;

    public Object getProxy(Object targetObject){
        this.targetObject = targetObject;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        return proxyObj;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        if("addUser".equals(method.getName())){
            chechPerssion();
        }
        obj = method.invoke(targetObject,args);
        return obj;
    }

    private void chechPerssion() {
        System.out.println("cglib检查权限");
    }
}
