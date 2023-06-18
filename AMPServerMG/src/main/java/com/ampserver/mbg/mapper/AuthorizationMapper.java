/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.Authorization;
import com.ampserver.mbg.model.AuthorizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorizationMapper {
    long countByExample(AuthorizationExample example);

    int deleteByExample(AuthorizationExample example);

    int insert(Authorization record);

    int insertSelective(Authorization record);

    List<Authorization> selectByExample(AuthorizationExample example);

    int updateByExampleSelective(@Param("record") Authorization record, @Param("example") AuthorizationExample example);

    int updateByExample(@Param("record") Authorization record, @Param("example") AuthorizationExample example);
}