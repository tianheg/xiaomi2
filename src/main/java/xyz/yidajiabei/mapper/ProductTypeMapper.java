package xyz.yidajiabei.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import xyz.yidajiabei.domain.ProductType;

import java.util.List;

@Mapper
public interface ProductTypeMapper {
    @Select({
        "select",
        "id, name, url",
        "from product_type"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
    List<ProductType> selectAll();
}