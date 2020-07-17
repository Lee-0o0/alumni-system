package com.lee.mapper;

import com.lee.domain.MyComment;
import com.lee.domain.MyCommentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MyCommentMapper {
    int countByExample(MyCommentExample example);

    int deleteByExample(MyCommentExample example);

    int deleteByPrimaryKey(Integer mycommentId);

    int insert(MyComment record);

    int insertSelective(MyComment record);

    List<MyComment> selectByExample(MyCommentExample example);

    MyComment selectByPrimaryKey(Integer mycommentId);

    int updateByExampleSelective(@Param("record") MyComment record, @Param("example") MyCommentExample example);

    int updateByExample(@Param("record") MyComment record, @Param("example") MyCommentExample example);

    int updateByPrimaryKeySelective(MyComment record);

    int updateByPrimaryKey(MyComment record);
}