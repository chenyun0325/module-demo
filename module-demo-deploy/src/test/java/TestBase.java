import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by chenyun on 16/3/24.
 */
@SuppressWarnings("SpringContextConfigurationInspection")
@ContextConfiguration(locations = {"classpath:data-source-beans.xml","classpath:service-beans.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class TestBase {

}
