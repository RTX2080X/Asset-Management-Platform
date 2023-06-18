package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.Authorization;
import com.ampserver.mbg.model.AuthorizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AuthorizationMapper {
    long countByExample(AuthorizationExample example);

    int deleteByExample(AuthorizationExample example);

    int insert(Authorization record);

    int insertSelective(Authorization record);

    List<Authorization> selectByExampleWithRowbounds(AuthorizationExample example, RowBounds rowBounds);

    List<Authorization> selectByExample(AuthorizationExample example);

    int updateByExampleSelective(@Param("record") Authorization record, @Param("example") AuthorizationExample example);

    int updateByExample(@Param("record") Authorization record, @Param("example") AuthorizationExample example);
}