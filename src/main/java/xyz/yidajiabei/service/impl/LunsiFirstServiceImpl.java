package xyz.yidajiabei.service.impl;

import org.springframework.stereotype.Service;
import xyz.yidajiabei.domain.LunsiFirst;
import xyz.yidajiabei.mapper.LunsiFirstMapper;
import xyz.yidajiabei.service.ILunsiFirstService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LunsiFirstServiceImpl implements ILunsiFirstService {
    @Resource
    private LunsiFirstMapper lunsiFirstMapper;

    @Override
    public List<LunsiFirst> queryAll() {
        List<LunsiFirst> list = lunsiFirstMapper.selectAll();
        return list;
    }
}
