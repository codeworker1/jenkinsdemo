package com.neruon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxy on 2023-06-07 16:50
 */
@RestController
public class TestController {

    @GetMapping("/index")
    public String testRequest() {
        return "你好";
    }
}
