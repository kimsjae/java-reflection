package ex02;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        String path = "/updatePassword";

        UserController con = new UserController();

        Method[] methods = con.getClass().getDeclaredMethods();
        //System.out.println(methods.length);

        for(Method method : methods) {
            //System.out.println(method.getName());
            RequestMapping rm = method.getDeclaredAnnotation(RequestMapping.class);

            if (rm == null) {
                continue;
            }
            if (rm.uri().equals(path)) {
                try {
                    method.invoke(con); // con.login();이랑 같음
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
