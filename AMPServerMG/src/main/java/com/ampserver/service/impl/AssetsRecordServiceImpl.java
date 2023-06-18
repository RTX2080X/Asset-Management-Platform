/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.service.impl;

import com.ampserver.mbg.mapper.AssetsRecordMapper;
import com.ampserver.mbg.model.AssetsRecord;
import com.ampserver.service.AssetsRecordService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssetsRecordServiceImpl implements AssetsRecordService {
    @Resource
    private AssetsRecordMapper mapper;

    @Override
    public List<AssetsRecord> page(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mapper.selectByExample(null);
    }
}
