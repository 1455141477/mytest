package test;

import com.service.ReaderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReaderTest {
    @Test
    public void testService(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationcontext.xml");
        ReaderService service=(ReaderService) ac.getBean("readerService");
        service.findAll();
    }
}
