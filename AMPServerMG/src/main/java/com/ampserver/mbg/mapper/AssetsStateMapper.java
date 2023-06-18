/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

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