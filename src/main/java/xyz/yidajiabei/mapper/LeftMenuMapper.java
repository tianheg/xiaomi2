package xyz.yidajiabei.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import xyz.yidajiabei.domain.LeftMenu;

import java.util.List;

@Mapper
public interface LeftMenuMapper {
    @Select({
        "select",
        "id, name, url",
        "from left_menu"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
    List<LeftMenu> selectAll();
}