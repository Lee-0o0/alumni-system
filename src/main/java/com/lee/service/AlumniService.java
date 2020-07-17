package com.lee.service;

import com.lee.domain.Alumni;

import java.util.List;

public interface AlumniService {
    //查询所有校友信息
    public List<Alumni> findAll();
    //查询某个校友的具体信息
    public Alumni findByNumber(String alumniNumber);
    //查询某个班级下的所有同学
    public List<Alumni> findByClassId(int classId);
    //新增校友
    public boolean insert(Alumni alumni);
    //更新校友
    public boolean update(Alumni alumni);
    //删除校友
    public boolean delete(String alumniNumber);
    //批量插入校友信息
    public boolean batchInsert(List<Alumni> alumnis);
    //加入班级
    public boolean joinClass(String alumniNumber,int classId);
    //更新校友信息，包括空字段
    public boolean updateWithNull(Alumni alumni);
}
