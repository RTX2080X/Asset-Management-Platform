package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.AssetsState;
import com.ampserver.mbg.model.AssetsStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetsStateMapper {
    long countByExample(AssetsStateExample example);

    int deleteByExample(AssetsStateExample example);

    int deleteByPrimaryKey(Integer pk_id);

    int insert(AssetsState record);

    int insertSelective(AssetsState record);

    List<AssetsState> selectByExample(AssetsStateExample example);

    AssetsState selectByPrimaryKey(Integer pk_id);

    int updateByExampleSelective(@Param("record") AssetsState record, @Param("example") AssetsStateExample example);

    int updateByExample(@Param("record") AssetsState record, @Param("example") AssetsStateExample example);

    int updateByPrimaryKeySelective(AssetsState record);

    int updateByPrimaryKey(AssetsState record);
}