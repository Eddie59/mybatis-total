package cn.service;

import cn.dao.IUser;
import cn.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService class
 *
 * @author Administrator
 * @date
 */
@Service(value = "userService")
public class UserService {

    @Autowired
    IUser userMapper;

    public List<User> getAllUser(){
        return userMapper.getUsers();
    }

}
