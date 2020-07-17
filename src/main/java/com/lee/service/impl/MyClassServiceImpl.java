package com.lee.service.impl;

import com.lee.domain.Alumni;
import com.lee.domain.MyClass;
import com.lee.domain.MyClassExample;
import com.lee.mapper.AlumniMapper;
import com.lee.mapper.MyClassMapper;
import com.lee.service.AlumniService;
import com.lee.service.MyClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MyClassServiceImpl implements MyClassService {

    @Autowired private MyClassMapper myClassMapper;
    @Autowired private AlumniMapper alumniMapper;

    @Override
    public List<MyClass> findAll() {
        return myClassMapper.selectByExample(null);
    }

    @Override
    public MyClass findById(int id) {
        return myClassMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean insert(MyClass myClass) {
        myClass.setClassCreateTime(LocalDate.now()); // 设置创建时间
        myClass.setClassNumberOfMember(1); // 设置创建时班级人数
        // 查询创建人是否存在
        String classCreator = myClass.getClassCreator();
        Alumni alumni = alumniMapper.selectByPrimaryKey(classCreator);
        int i = 0;
        if (alumni != null) {
            i = myClassMapper.insert(myClass);
        }
        if (i == 1) {
            alumni.setAlumniClass(myClass.getClassId());
            alumniMapper.updateByPrimaryKeySelective(alumni);
        }
        return i == 1;
    }

    @Override
    public boolean update(MyClass myClass) {
        return myClassMapper.updateByPrimaryKeySelective(myClass) == 1;
    }

    @Override
    public boolean delete(int id) {
        return myClassMapper.deleteByPrimaryKey(id) == 1;
    }

    @Override
    public List<MyClass> findByGradeAndMajor(String grade, String major) {
        MyClassExample myClassExample = new MyClassExample();
        myClassExample.createCriteria().andClassGradeEqualTo(grade)
                                        .andClassMajorEqualTo(major);
        List<MyClass> gradeClass = myClassMapper.selectByExample(myClassExample);
        return gradeClass;
    }

    @Override
    public List<MyClass> findByMajorAndGradeAndClass(String major, String grade, String myclass) {
        MyClassExample myClassExample = new MyClassExample();
        myClassExample.createCriteria().andClassMajorEqualTo(major)
                .andClassGradeEqualTo(grade).andClassClassEqualTo(myclass);
        List<MyClass> list = myClassMapper.selectByExample(myClassExample);
        return list;
    }
}
