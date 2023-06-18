package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.Assets;
import com.ampserver.mbg.model.AssetsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface AssetsMapper {
    long countByExample(AssetsExample example);

    int deleteByExample(AssetsExample example);

    int deleteByPrimaryKey(Integer pk_Id);

    int insert(Assets record);

    int insertSelective(Assets record);

    List<Assets> selectByExampleWithRowbounds(AssetsExample example, RowBounds rowBounds);

    List<Assets> selectByExample(AssetsExample example);

    Assets selectByPrimaryKey(Integer pk_Id);

    int updateByExampleSelective(@Param("record") Assets record, @Param("example") AssetsExample example);

    int updateByExample(@Param("record") Assets record, @Param("example") AssetsExample example);

    int updateByPrimaryKeySelective(Assets record);

    int updateByPrimaryKey(Assets record);
}