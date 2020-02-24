package com.service.impl;

import com.dao.ReaderDao;
import com.domain.Book;
import com.domain.Reader;
import com.service.ReaderService;
import com.utils.BookException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("readerService")
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    private ReaderDao readerDao;

    /**
     * 查找所有读者
     * @return
     */
    @Override
    public List<Reader> findAll() {
        return readerDao.findAll();
    }

    /**
     * 通过名字查找读者
     * @param name
     * @return
     */
    @Override
    public Reader findReaderByName(String name) {
        Reader reader=readerDao.findByName(name);
        return reader;
    }

    @Override
    public Reader findReaderByUsername(String username) {
        Reader reader=readerDao.findReaderByUsername(username);
        return reader;
    }

    /**
     * 更改读者
     * @param reader
     */
    @Override
    public void updateReader(Reader reader) throws BookException {
        Reader reader1=readerDao.findReaderByUsername(reader.getUsername());
        if(reader.getReaderid()!=reader1.getReaderid()){
            if(reader1!=null){
                throw new BookException("您要修改的用户名已经存在");
            }
        }
        readerDao.updateReader(reader);
    }

    @Override
    public void deleteReader(int id) {
        readerDao.deleteReader(id);
    }

    /**
     * 添加读者
     * @param reader
     * @throws BookException
     */
    @Override
    public void addReader(Reader reader) throws BookException {
        Reader r2=readerDao.findReaderByUsername(reader.getUsername());
/*        System.out.println(r2.getUsername());*/
        if(r2!=null){
            throw new BookException("您要添加的读者用户名已经被注册过");
        }
        readerDao.addReader(reader);
    }

    /**
     * 通过id查找读者
     * @param id
     * @return
     */
    @Override
    public Reader findReaderById(int id) {
        Reader reader=readerDao.findReaderById(id);
        return reader;
    }
}
