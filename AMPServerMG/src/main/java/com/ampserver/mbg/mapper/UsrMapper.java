/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.Usr;
import com.ampserver.mbg.model.UsrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrMapper {
    long countByExample(UsrExample example);

    int deleteByExample(UsrExample example);

    int deleteByPrimaryKey(Integer pk_id);

    int insert(Usr record);

    int insertSelective(Usr record);

    List<Usr> selectByExample(UsrExample example);

    Usr selectByPrimaryKey(Integer pk_id);

    int updateByExampleSelective(@Param("record") Usr record, @Param("example") UsrExample example);

    int updateByExample(@Param("record") Usr record, @Param("example") UsrExample example);

    int updateByPrimaryKeySelective(Usr record);

    int updateByPrimaryKey(Usr record);
}