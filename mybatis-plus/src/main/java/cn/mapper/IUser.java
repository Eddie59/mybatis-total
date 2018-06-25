package cn.mapper;

import cn.model.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * IUser class
 * 继承了BaseMapper<T> 内置的17种方法，这样就不用写增删改查的方法了，直接使用内置的方法
 * @author Administrator
 * @date
 */
public interface IUser extends BaseMapper<User>{
    /**
     * 自己定义的方法
     */
    List<User> getUsers_eddie();
}
