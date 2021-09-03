package xyz.yidajiabei.service.impl;

import org.springframework.stereotype.Service;
import xyz.yidajiabei.domain.LunBo;
import xyz.yidajiabei.mapper.LunBoMapper;
import xyz.yidajiabei.service.ILunBoService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LunBoServiceImpl implements ILunBoService {
    @Resource
    private LunBoMapper lunBoMapper;

    @Override
    public List<LunBo> queryAll() {
        List<LunBo> list = lunBoMapper.selectAll();
        return list;
    }
}
