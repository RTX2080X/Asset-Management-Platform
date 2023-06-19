/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.controller;

import com.ampserver.mbg.model.Usr;
import com.ampserver.service.UsrService;
import com.ampserver.utils.result.CommonPage;
import com.ampserver.utils.result.CommonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/usr")
public class UserController {
    @Resource
    private UsrService service;

    @ResponseBody
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public CommonResult<CommonPage<Usr>> usrPageList(
            @RequestParam(value = "pn") Integer pageNum,
            @RequestParam(value = "ps") Integer pageSize
    ) {

        List<Usr> list = service.usrList(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(list));
    }
}
