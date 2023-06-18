/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.controller;

import com.ampserver.service.UsrService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class loginController {
    @Resource
    private UsrService usrService;
//
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    @ResponseBody
//    public Map Tsetreuqest() {
//        return usrService.findAll();
//    }
//
//    @ResponseBody
//    @RequestMapping(value = "/t", method = RequestMethod.GET)
//    public List<Usr> TestRequest2() {
//        return usrService.findAll2();
//    }

}
