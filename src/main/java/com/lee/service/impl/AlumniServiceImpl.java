package com.lee.service.impl;

import com.lee.domain.Alumni;
import com.lee.domain.AlumniExample;
import com.lee.mapper.AlumniMapper;
import com.lee.service.AlumniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumniServiceImpl implements AlumniService {

    @Autowired private AlumniMapper alumniMapper;

    /**
     * 查询所有校友信息
     * @return
     */
    @Override
    public List<Alumni> findAll() {
        return alumniMapper.selectByExample(null);
    }

    /**
     * 根据校友学号查询信息
     * @param alumniNumber
     * @return
     */
    @Override
    public Alumni findByNumber(String alumniNumber) {
        return alumniMapper.selectByPrimaryKey(alumniNumber);
    }

    /**
     * 查询某个班级下的所有同学
     * @param classId
     * @return
     */
    @Override
    public List<Alumni> findByClassId(int classId) {
        AlumniExample alumniExample = new AlumniExample();
        alumniExample.createCriteria().andAlumniClassEqualTo(classId);
        return alumniMapper.selectByExample(alumniExample);
    }

    /**
     * 新增校友
     * @param alumni
     * @return
     */
    @Override
    public boolean insert(Alumni alumni) {
        return alumniMapper.insert(alumni) == 1;
    }

    /**
     * 修改校友信息
     * @param alumni
     * @return
     */
    @Override
    public boolean update(Alumni alumni) {
        return alumniMapper.updateByPrimaryKeySelective(alumni) == 1;
    }

    /**
     * 删除校友
     * @param alumniNumber
     * @return
     */
    @Override
    public boolean delete(String alumniNumber) {
        return alumniMapper.deleteByPrimaryKey(alumniNumber) == 1;
    }

    @Override
    public boolean batchInsert(List<Alumni> alumnis) {
        try{
            for (Alumni alumni:alumnis){
                alumniMapper.insert(alumni);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean joinClass(String alumniNumber, int classId) {
        Alumni alumni = alumniMapper.selectByPrimaryKey(alumniNumber);
        Integer alumniClass = alumni.getAlumniClass();
        //如果有班级了，不能重复加入
        if (alumniClass != null  ) return false;
        alumni.setAlumniClass(classId);
        int i = alumniMapper.updateByPrimaryKeySelective(alumni);
        return i == 1;
    }

    @Override
    public boolean updateWithNull(Alumni alumni){
        return alumniMapper.updateByPrimaryKey(alumni) == 1;
    }
}
