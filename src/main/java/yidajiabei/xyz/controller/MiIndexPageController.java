package yidajiabei.xyz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // back-end source file, return json data
public class MiIndexPageController {
    // when access https://url/hello , return "hello xiaomi"
    @RequestMapping("/hello")
    public String HelloWorld() {
        return "hello xiaomi";
    }
}
