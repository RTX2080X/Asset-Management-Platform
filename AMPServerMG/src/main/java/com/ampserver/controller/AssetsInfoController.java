/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.controller;

import com.ampserver.mbg.model.Assets;
import com.ampserver.service.AssetsService;
import com.ampserver.utils.result.CommonPage;
import com.ampserver.utils.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/aInf")
public class AssetsInfoController {
    @Resource
    private AssetsService assetsService;

    @ResponseBody
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<Assets>> assetsPage(
            @RequestParam(value = "pn") Integer pageNum,
            @RequestParam(value = "ps") Integer pageSize) {
        List<Assets> page = assetsService.page(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }
}
