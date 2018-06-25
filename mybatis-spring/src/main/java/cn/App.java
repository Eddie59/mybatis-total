package cn;

import cn.model.User;
import cn.service.UserService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        UserService userService= applicationContext.getBean("userService", UserService.class);
        List<User> userList=userService.getAllUser();
    }
}
