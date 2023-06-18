/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

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