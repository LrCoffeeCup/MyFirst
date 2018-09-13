import com.entity.StudentEntity;
import com.services.StudentServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*
*@ClassName:SpringHibernateTest
 @Description:TODO
 @Author:
 @Date:2018/9/12 15:25 
 @Version:v1.0
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class SpringHibernate {
    @Autowired
    StudentServices studentServices;

    @Test
    public void testGet(){

        StudentEntity studentEntity = studentServices.find(1);
        System.out.println(studentEntity);
    }

}
