package xyz.yidajiabei.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import xyz.yidajiabei.domain.LunsiFirst;

import java.util.List;

@Mapper
public interface LunsiFirstMapper {
    @Select({
        "select",
        "id, href, src, name",
        "from lunsi_first"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="href", property="href", jdbcType=JdbcType.VARCHAR),
        @Result(column="src", property="src", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<LunsiFirst> selectAll();
}