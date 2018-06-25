package cn;

import cn.mapper.IUser;
import cn.model.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SqlSession sqlSession=null;
        try {
            sqlSession = Factory.getSqlSession();
            //List<User> users = sqlSession.selectList("test.selectAllUser");
            //mybatis使用java的动态代理，内部新建一个IUser的实现类，所以要使用接口；
            //这样和配置文件解耦了
            IUser userMapper= sqlSession.getMapper(IUser.class);
            List<User> users =userMapper.getUsers();

        } catch (Exception exp) {
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
