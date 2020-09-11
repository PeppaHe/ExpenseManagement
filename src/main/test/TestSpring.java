import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author: hq
 * @create time:2020/9/11 10:52
 * @desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:SpringMVC_Mybatis.xml"})
public class TestSpring {
//    @Autowired
//    private DataSource dataSource;
//    @Test
//    public void test() throws SQLException {
//        System.out.println(dataSource.getConnection());
//    }


}
