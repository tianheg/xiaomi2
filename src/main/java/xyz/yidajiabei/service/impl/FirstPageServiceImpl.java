package xyz.yidajiabei.service.impl;

import org.springframework.stereotype.Service;
import xyz.yidajiabei.domain.FirstPage;
import xyz.yidajiabei.mapper.FirstPageMapper;
import xyz.yidajiabei.service.IFirstPageService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FirstPageServiceImpl implements IFirstPageService {
    @Resource
    private FirstPageMapper firstPageMapper;

    @Override
    public List<FirstPage> queryAll(int type) {
        return firstPageMapper.selectAll(type);
    }
}
