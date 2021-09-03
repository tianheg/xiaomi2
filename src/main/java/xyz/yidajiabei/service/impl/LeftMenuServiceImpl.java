package xyz.yidajiabei.service.impl;

import org.springframework.stereotype.Service;
import xyz.yidajiabei.domain.LeftMenu;
import xyz.yidajiabei.mapper.LeftMenuMapper;
import xyz.yidajiabei.service.ILeftMenuService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeftMenuServiceImpl implements ILeftMenuService {
    @Resource
    private LeftMenuMapper leftMenuMapper;

    @Override
    public List<LeftMenu> queryAll() {
        List<LeftMenu> list = leftMenuMapper.selectAll();
        return list;
    }
}
