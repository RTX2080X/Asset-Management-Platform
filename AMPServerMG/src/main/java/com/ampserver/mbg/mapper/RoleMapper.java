package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.Role;
import com.ampserver.mbg.model.RoleExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer pk_id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExampleWithRowbounds(RoleExample example, RowBounds rowBounds);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer pk_id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}