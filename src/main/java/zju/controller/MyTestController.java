package zju.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaoZiming
 * @create 2022-02-25 22:20
 */

@RestController
@RequestMapping("/test")
public class MyTestController {

    @GetMapping("/test")
    public String myTest(){
        return "hello";
    }

}
