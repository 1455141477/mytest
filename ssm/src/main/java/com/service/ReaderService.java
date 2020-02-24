package com.service;

import com.domain.Reader;
import com.utils.BookException;

import java.util.List;
public interface ReaderService {
    List<Reader> findAll();
    void addReader(Reader reader) throws BookException;
    Reader findReaderById(int id);
    Reader findReaderByName(String name);
    Reader findReaderByUsername(String username);
    void updateReader(Reader reader) throws BookException;
    void deleteReader(int id);
}
