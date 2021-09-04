package xyz.yidajiabei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yidajiabei.domain.*;
import xyz.yidajiabei.service.*;
import xyz.yidajiabei.util.ResultBean;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // back-end source file, return json data
public class MiIndexPageController {
    @Resource
    private IFirstPageService firstPageService;
    @RequestMapping("/firstPageData")
    public ResultBean<Map<String, List<FirstPage>>> firstPageData() { // array
        ResultBean<Map<String, List<FirstPage>>> result = new ResultBean<>();

        // Data assembly
        result.setSign(true);
        result.setMsg("Data Query succeeded!");
        Map<String, List<FirstPage>> map = new HashMap<>();
        List<FirstPage> list1 = firstPageService.queryAll(1);
        List<FirstPage> list2 = firstPageService.queryAll(2);
        List<FirstPage> list3 = firstPageService.queryAll(3);
        List<FirstPage> list4 = firstPageService.queryAll(4);
        List<FirstPage> list5 = firstPageService.queryAll(5);
        List<FirstPage> list6 = firstPageService.queryAll(6);
        map.put("urlBean", list1);
        map.put("ProductType", list2);
        map.put("LeftMenu", list3);
        map.put("LunBo", list4);
        map.put("LunsiFirst", list5);
        map.put("LunsiBack", list6);
        result.setData(map);
        return result;
    }
    /* return json data
    *
    *
    *   ResultBean
    *       sign(boolean)
    *       msg(string)
    *       T(generics)
    */
}
