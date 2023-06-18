/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.mbg.mapper;

import com.ampserver.mbg.model.Assets;
import com.ampserver.mbg.model.AssetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetsMapper {
    long countByExample(AssetsExample example);

    int deleteByExample(AssetsExample example);

    int deleteByPrimaryKey(Integer pk_Id);

    int insert(Assets record);

    int insertSelective(Assets record);

    List<Assets> selectByExample(AssetsExample example);

    Assets selectByPrimaryKey(Integer pk_Id);

    int updateByExampleSelective(@Param("record") Assets record, @Param("example") AssetsExample example);

    int updateByExample(@Param("record") Assets record, @Param("example") AssetsExample example);

    int updateByPrimaryKeySelective(Assets record);

    int updateByPrimaryKey(Assets record);
}