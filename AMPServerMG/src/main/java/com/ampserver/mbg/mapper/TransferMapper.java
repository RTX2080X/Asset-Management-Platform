package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.Transfer;
import com.ampserver.mbg.model.TransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TransferMapper {
    long countByExample(TransferExample example);

    int deleteByExample(TransferExample example);

    int insert(Transfer record);

    int insertSelective(Transfer record);

    List<Transfer> selectByExampleWithRowbounds(TransferExample example, RowBounds rowBounds);

    List<Transfer> selectByExample(TransferExample example);

    int updateByExampleSelective(@Param("record") Transfer record, @Param("example") TransferExample example);

    int updateByExample(@Param("record") Transfer record, @Param("example") TransferExample example);
}