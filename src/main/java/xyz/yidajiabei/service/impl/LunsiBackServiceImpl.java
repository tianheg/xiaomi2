package xyz.yidajiabei.service.impl;

import org.springframework.stereotype.Service;
import xyz.yidajiabei.domain.LunsiBack;
import xyz.yidajiabei.mapper.LunsiBackMapper;
import xyz.yidajiabei.service.ILunsiBackService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LunsiBackServiceImpl implements ILunsiBackService {
    @Resource
    private LunsiBackMapper lunsiBackMapper;

    @Override
    public List<LunsiBack> queryAll() {
        List<LunsiBack> list = lunsiBackMapper.selectAll();
        return list;
    }
}
