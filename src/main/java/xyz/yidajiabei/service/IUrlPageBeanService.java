package xyz.yidajiabei.service;

import xyz.yidajiabei.domain.urlPageBean;

import java.util.List;

public interface IUrlPageBeanService {
    /*
    *  query UrlBean table
    *  @return UrlBean data
    */
    public List<urlPageBean> queryAll();
}
