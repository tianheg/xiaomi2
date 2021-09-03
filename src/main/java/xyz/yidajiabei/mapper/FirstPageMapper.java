package xyz.yidajiabei.mapper;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import xyz.yidajiabei.domain.FirstPage;

import java.util.List;

@Mapper
public interface FirstPageMapper {
    @Select({
        "select",
        "id, name, href, src, type",
        "from t_first_page where type=#{typeContent}" // #{} quote parameter
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="href", property="href", jdbcType=JdbcType.VARCHAR),
        @Result(column="src", property="src", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER)
    })
    List<FirstPage> selectAll(int typeContent); // parameter passing
}