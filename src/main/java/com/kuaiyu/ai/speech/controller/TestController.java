package com.kuaiyu.ai.speech.controller;

import com.kuaiyu.ai.speech.model.BaseResult;
import com.kuaiyu.ai.speech.service.impl.HotWordServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kuaiyu-yyk
 * @Description:
 * @Date: 2020/10/13 上午 08:51
 * @Version:
 */
@RestController
@RequestMapping("/test")
@Api(value = "测试接口", tags = "TestController")
public class TestController {

    @Autowired
    private HotWordServiceImpl hotWordService;

    @ApiOperation(value = "测试", notes = "测试接口")
    @GetMapping
    public BaseResult hello() {
        return new BaseResult(hotWordService.getById(1), "123", true);
    }

}
