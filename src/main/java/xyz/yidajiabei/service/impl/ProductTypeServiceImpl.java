package xyz.yidajiabei.service.impl;

import org.springframework.stereotype.Service;
import xyz.yidajiabei.domain.ProductType;
import xyz.yidajiabei.mapper.ProductTypeMapper;
import xyz.yidajiabei.service.IProductTypeService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductTypeServiceImpl implements IProductTypeService {
    @Resource
    private ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductType> queryAll() {
        List<ProductType> list = productTypeMapper.selectAll();
        return list;
    }
}
