package cn;

import cn.model.User;
import cn.service.UserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService=context.getBean("userService",UserService.class);

        //调用内置的方法
        EntityWrapper<User> ew=new EntityWrapper<>();
        userService.selectCount(ew);

        //调用自己写的方法
        List<User> users = userService.getUserEddie();
    }
}
