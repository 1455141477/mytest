package test;

import com.dao.BookDao;
import com.dao.ManagerDao;
import com.dao.ReaderDao;
import com.domain.Book;
import com.domain.Manager;
import com.domain.Reader;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DaoTest {
    @Test
    public void testfindByName(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ManagerDao md=(ManagerDao) ac.getBean("managerDao");
        Manager m=md.findByUserName("root");
        System.out.println(m);
    }
    @Test
    public void testInsertManager(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ManagerDao md=(ManagerDao) ac.getBean("managerDao");
        Manager manager=new Manager("zhangsan","12345","张三");
        md.addManager(manager);
    }
    @Test
    public void testUpdateReader(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ReaderDao readerDao=(ReaderDao) ac.getBean("readerDao");
        Reader reader=new Reader();
        reader.setName("张三1");
        reader.setPhone("223232");
        reader.setAge(32);
        reader.setSex("女");
        reader.setDept("计算机系");
        reader.setUsername("123");
        reader.setPassword("123");
        readerDao.addReader(reader);
    }
    @Test
    public void testByreaderIdFindBook(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BookDao bookDao=(BookDao) ac.getBean("bookDao");
        List<Book> books=bookDao.findByReaderId(1);
        for (Book book:books){
            System.out.println(book.toString());
        }
    }
}
