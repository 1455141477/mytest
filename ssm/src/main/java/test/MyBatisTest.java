package test;

import com.dao.ReaderDao;
import com.domain.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private InputStream is;
    private ReaderDao readerDao;
    @Before
    public void init() throws IOException{
        is= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        sqlSessionFactory=sqlSessionFactoryBuilder.build(is);
        sqlSession=sqlSessionFactory.openSession();
        readerDao=sqlSession.getMapper(ReaderDao.class);
    }
    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        is.close();
    }
    @Test
    public void testFindAll(){
        List<Reader> list=readerDao.findAll();
        for (Reader reader:list){
            System.out.println(reader);
        }
    }
}
