package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.Usr;
import com.ampserver.mbg.model.UsrExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UsrMapper {
    long countByExample(UsrExample example);

    int deleteByExample(UsrExample example);

    int deleteByPrimaryKey(Integer pk_id);

    int insert(Usr record);

    int insertSelective(Usr record);

    List<Usr> selectByExampleWithRowbounds(UsrExample example, RowBounds rowBounds);

    List<Usr> selectByExample(UsrExample example);

    Usr selectByPrimaryKey(Integer pk_id);

    int updateByExampleSelective(@Param("record") Usr record, @Param("example") UsrExample example);

    int updateByExample(@Param("record") Usr record, @Param("example") UsrExample example);

    int updateByPrimaryKeySelective(Usr record);

    int updateByPrimaryKey(Usr record);
}