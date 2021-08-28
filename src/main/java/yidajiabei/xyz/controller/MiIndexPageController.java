package yidajiabei.xyz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yidajiabei.xyz.domain.UrlBean;
import yidajiabei.xyz.util.ResultBean;

import java.util.ArrayList;
import java.util.List;

@RestController // back-end source file, return json data
public class MiIndexPageController {
    @RequestMapping("/typeList")
    public ResultBean typeList() {
        ResultBean<List<UrlBean>> result=new ResultBean<List<UrlBean>>();

        // Data assembly
        result.setSign(true);
        result.setMsg("Data Query succeeded!");
        // []
        List<UrlBean> list=new ArrayList<UrlBean>();
        // list begin
        UrlBean bean1 = new UrlBean();
        bean1.setId(1);
        bean1.setName("小米");
        bean1.setUrl("https://www.mi.com/");
        list.add(bean1);

        UrlBean bean2 = new UrlBean();
        bean2.setId(2);
        bean2.setName("淘宝");
        bean2.setUrl("https://www.taobao.com/");
        list.add(bean2);

        UrlBean bean3 = new UrlBean();
        bean3.setId(3);
        bean3.setName("京东");
        bean3.setUrl("https://www.jd.com/");
        list.add(bean3);

        UrlBean bean4 = new UrlBean();
        bean4.setId(4);
        bean4.setName("拼多多");
        bean4.setUrl("https://youhui.pinduoduo.com/");
        list.add(bean4);
        // list end

        result.setData(list);
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
