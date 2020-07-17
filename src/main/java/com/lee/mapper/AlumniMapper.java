package com.lee.mapper;

import com.lee.domain.Alumni;
import com.lee.domain.AlumniExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AlumniMapper {
    int countByExample(AlumniExample example);

    int deleteByExample(AlumniExample example);

    int deleteByPrimaryKey(String alumniNumber);

    int insert(Alumni record);

    int insertSelective(Alumni record);

    List<Alumni> selectByExample(AlumniExample example);

    Alumni selectByPrimaryKey(String alumniNumber);

    int updateByExampleSelective(@Param("record") Alumni record, @Param("example") AlumniExample example);

    int updateByExample(@Param("record") Alumni record, @Param("example") AlumniExample example);

    int updateByPrimaryKeySelective(Alumni record);

    int updateByPrimaryKey(Alumni record);
}