package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.AssetsRecord;
import com.ampserver.mbg.model.AssetsRecordExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AssetsRecordMapper {
    long countByExample(AssetsRecordExample example);

    int deleteByExample(AssetsRecordExample example);

    int insert(AssetsRecord record);

    int insertSelective(AssetsRecord record);

    List<AssetsRecord> selectByExample(AssetsRecordExample example);

    int updateByExampleSelective(@Param("record") AssetsRecord record, @Param("example") AssetsRecordExample example);

    int updateByExample(@Param("record") AssetsRecord record, @Param("example") AssetsRecordExample example);
}