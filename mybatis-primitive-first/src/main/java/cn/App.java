package cn;

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
        System.out.println( "Hello World!" );

        SqlSession sqlSession=null;
        try {
            sqlSession = Factory.getSqlSession();
            //这样写缺点很明显，代码中使用test.selectAllUser指定User.xml中要执行的sql，使代码人配置文件耦合
            //需要解耦
            List<User> users = sqlSession.selectList("test.selectAllUser");
        } catch (Exception exp) {
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }
}
