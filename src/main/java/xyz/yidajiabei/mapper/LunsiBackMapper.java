package xyz.yidajiabei.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import xyz.yidajiabei.domain.LunsiBack;

import java.util.List;

@Mapper
public interface LunsiBackMapper {
    @Select({
        "select",
        "id, href, src",
        "from lunsi_back"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="href", property="href", jdbcType=JdbcType.VARCHAR),
        @Result(column="src", property="src", jdbcType=JdbcType.VARCHAR)
    })
    List<LunsiBack> selectAll();
}