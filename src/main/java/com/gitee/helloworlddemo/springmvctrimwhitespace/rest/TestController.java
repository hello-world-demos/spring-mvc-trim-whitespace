package com.gitee.helloworlddemo.springmvctrimwhitespace.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: munan
 * @Date: 2021/1/10 4:09 下午
 */

@Slf4j
@RestController
@RequestMapping("/api/test/strings")
public class TestController {


    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public String get(String name){
        log.info("name :{} size:{}", name, !StringUtils.hasLength(name) ? 0 :name.length());
        return name;
    }
    @GetMapping(value = "/get/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String path(@PathVariable(value = "name") String name){
        log.info("name :{} size:{}", name, !StringUtils.hasLength(name) ? 0 :name.length());
        return name;
    }

    @PostMapping(value = "/post", produces = MediaType.APPLICATION_JSON_VALUE)
    public Region post(Region region){
        return region;
    }
    @PostMapping(value = "/post/body", produces = MediaType.APPLICATION_JSON_VALUE)
    public Region postBody(@RequestBody Region region){
        return region;
    }

}
