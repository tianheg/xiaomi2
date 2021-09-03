package xyz.yidajiabei.service.impl;

import org.springframework.stereotype.Service;
import xyz.yidajiabei.domain.urlPageBean;
import xyz.yidajiabei.mapper.urlPageBeanMapper;
import xyz.yidajiabei.service.IUrlPageBeanService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UrlPageBeanServiceImpl  implements IUrlPageBeanService {
    @Resource
    private urlPageBeanMapper urlPageBeanMapper;

    @Override // override api method
    public List<urlPageBean> queryAll() {
        // implementation details
        List<urlPageBean> list = urlPageBeanMapper.selectAll();
        return list;
    }
}
