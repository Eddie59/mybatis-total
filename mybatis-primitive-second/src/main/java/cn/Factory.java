package cn;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Factory class
 *
 * @author Administrator
 * @date
 */
public class Factory {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            //Resources mybatis提供的用来处理静态资源的类
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception exp) {
            System.out.println(exp);
        }

    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

}
