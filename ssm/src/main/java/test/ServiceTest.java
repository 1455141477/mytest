package test;

import com.domain.Manager;
import com.service.ManagerService;
import com.utils.BookException;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void testLogin(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ManagerService ms=(ManagerService) ac.getBean("managerService");
        boolean b;
        try {
            b = ms.login(new Manager("root","roott"));
        } catch (BookException e) {
            System.out.println(e.getMessage());
        }
    }
}
