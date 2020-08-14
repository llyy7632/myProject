package cn.far.ssm.dao;

import cn.far.ssm.pojo.Item;
import org.apache.ibatis.annotations.Select;

public interface ItemMapper {

//    @Select("select * from item where id = #{id}")
    public Item findOne(int id);
}
