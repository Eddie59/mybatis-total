package cn.service;


import cn.mapper.IUser;
import cn.model.User;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService class
 * 继承了ServiceImpl，UserService有了内置的17种方法
 * @author Administrator
 * @date
 */
@Service(value = "userService")
public class UserService extends ServiceImpl<IUser,User> {

    @Autowired
    IUser userMapper;

    public List<User> getUserEddie(){
        return userMapper.getUsers_eddie();
    }

}
