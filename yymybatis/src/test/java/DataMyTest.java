import dao.TestDataMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.TestData;
import utils.MybatisUtils;

public class DataMyTest {

    @Test
    public void test() {
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            //执行SQL
            //方式一：getMapper
            TestDataMapper mapper = sqlSession.getMapper(TestDataMapper.class);
            TestData testData = mapper.selectByPrimaryKey(13830L);
            System.out.println(testData);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭sqlSession
            sqlSession.close();
        }


    }
}
