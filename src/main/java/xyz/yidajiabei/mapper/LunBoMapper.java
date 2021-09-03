package xyz.yidajiabei.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import xyz.yidajiabei.domain.LunBo;

import java.util.List;

@Mapper
public interface LunBoMapper {
    @Select({
        "select",
        "id, url",
        "from lunbo"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
    List<LunBo> selectAll();
}