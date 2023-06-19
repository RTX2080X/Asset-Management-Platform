/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.service.impl;

import com.ampserver.mbg.mapper.UsrMapper;
import com.ampserver.mbg.model.Usr;
import com.ampserver.mbg.model.UsrExample;
import com.ampserver.service.UsrService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsrServiceImpl implements UsrService {
    //    @Autowired
    @Resource
    private UsrMapper mapper;

    @Override
    public Map findAll() {
        UsrExample usrExample = new UsrExample();
//        usrExample.createCriteria()
//mapper.selectByExample()
        HashMap map = new HashMap();
        PageHelper.startPage(1, 5);
        List<Usr> list = mapper.selectByExample(null);
        PageInfo pageInfo = new PageInfo(list);
        map.put("row", pageInfo.getList());
        map.put("total", pageInfo.getTotal());
        return map;
    }

    @Override
    public List<Usr> usrList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mapper.selectByExample(null);
    }

    //    @Override
    public List<Usr> findAll2() {
        PageHelper.startPage(1, 2);
        List<Usr> list = mapper.selectByExample(null);
        return list;
    }
}
