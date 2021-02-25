package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 创建sqlSessionFactory工具类及其对象
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        InputStream inputStream = null;

        try {
            //使用Mybatis，就是利用该工具类获取sqlSessionFacitory对象
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //创建对象
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
