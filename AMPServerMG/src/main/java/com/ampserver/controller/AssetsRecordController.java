/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.controller;

import com.ampserver.mbg.model.AssetsRecord;
import com.ampserver.service.AssetsRecordService;
import com.ampserver.utils.result.CommonPage;
import com.ampserver.utils.result.CommonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/aRco")
public class AssetsRecordController {
    @Resource
    private AssetsRecordService assetsRecordService;

    @ResponseBody
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<AssetsRecord>> assetsRecordPage(
            @RequestParam(value = "pn") Integer pageNum,
            @RequestParam(value = "ps") Integer pageSize) {
        List<AssetsRecord> page = assetsRecordService.page(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }
}
