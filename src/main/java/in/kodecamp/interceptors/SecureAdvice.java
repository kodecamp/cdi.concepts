package in.kodecamp.interceptors;
import java.util.List;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Secured 
public class SecureAdvice {

  @AroundInvoke
  public Object validate(InvocationContext ctx) throws Exception {
    System.out.println("@@@ SecureInterceptor: class : " + ctx.getClass());
    System.out.println("@@@ SecureInterceptor method : " + ctx.getMethod());
    List<String> items = (List)ctx.proceed();
    items.add("Item : Added in Interceptor");
    return items;
  }
}