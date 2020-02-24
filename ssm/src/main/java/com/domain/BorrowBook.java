package com.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowBook {
    private int bbid;
    private Reader reader;
    private Book book;
    private Date btime;
    private Date rtime;

    @Override
    public String toString() {
        return "BorrowBook{" +
                "bbid=" + bbid +
                ", reader=" + reader +
                ", book=" + book +
                ", btime=" + btime +
                ", rtime=" + rtime +
                '}';
    }

    public int getBbid() {
        return bbid;
    }

    public void setBbid(int bbid) {
        this.bbid = bbid;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBtime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(btime);
    }

    public void setBtime(Date btime) {
        this.btime = btime;
    }

    public String getRtime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(rtime);
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }
}
