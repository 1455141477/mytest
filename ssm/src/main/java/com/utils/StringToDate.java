package com.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("参数不能为空！");
        }
        DateFormat df=new SimpleDateFormat("yyyy年mm月dd日");
        try{
            Date date=df.parse(s);
            return date;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
