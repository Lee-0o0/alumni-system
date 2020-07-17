package com.lee.service;

import com.lee.domain.MyClass;

import java.util.List;

public interface MyClassService {
    public List<MyClass> findAll();
    public MyClass findById(int id);
    public boolean insert(MyClass myClass);
    public boolean update(MyClass myClass);
    public boolean delete(int id);
    public List<MyClass> findByGradeAndMajor(String grade,String major);
    public List<MyClass> findByMajorAndGradeAndClass(String major,String grade,String myclass);
}
