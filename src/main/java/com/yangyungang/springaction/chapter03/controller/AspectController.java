package com.yangyungang.springaction.chapter03.controller;

import com.yangyungang.springaction.chapter03.ApiRequestBody;
import com.yangyungang.springaction.chapter03.anno.ApiLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @Description : 切面控制器
 * @Author : young
 * @Date : 2023-08-10 22:37
 * @Version : 1.0
 **/
@RestController
@RequestMapping("/aspect")
public class AspectController {

    private static final Logger log = LoggerFactory.getLogger(AspectController.class);

    @PostMapping("/apiMethod")
    @ApiLog
    public String apiMethod(@RequestBody ApiRequestBody apiRequestBody) {
        //log.info("revice msg: {}", JSON.toJSONString(apiRequestBody));
        return "api ok";
    }

    @GetMapping("/api")
    public String api() {
        ApiRequestBody apiRequestBody = new ApiRequestBody();
        apiRequestBody.setName("yang");
        apiRequestBody.setAge(18);
        apiMethod(apiRequestBody);
        return "ok";
    }

}
