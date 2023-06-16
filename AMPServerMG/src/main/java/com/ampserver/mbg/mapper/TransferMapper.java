package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.Transfer;
import com.ampserver.mbg.model.TransferExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransferMapper {
    long countByExample(TransferExample example);

    int deleteByExample(TransferExample example);

    int insert(Transfer record);

    int insertSelective(Transfer record);

    List<Transfer> selectByExample(TransferExample example);

    int updateByExampleSelective(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByExample(@Param("record") Transfer record, @Param("example") TransferExample example);
}