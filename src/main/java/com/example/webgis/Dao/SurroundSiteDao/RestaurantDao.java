package com.example.webgis.Dao.SurroundSiteDao;

import com.example.webgis.Damain.SurroundSite.Restaurant;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Mapper
public interface RestaurantDao {
    /**
     * 新增数据
     */
    @Insert("insert into gz_restaurant(FID,Name,pyname,telephone,lng,lat,address) values (#{FID},#{Name},#{pyname},#{telephone},#{lng}),#{lat},#{address}")
    void addRes(Restaurant res);

    /**
     * 修改数据
     */
    @Update("update gz_restaurant set Name=#{Name},pyname=#{pyname},telephone=#{telephone},lng==#{lng},lat==#{lat},address==#{address} where FID=#{FID}")
    void updateRes(Restaurant res);

    /**
     * 删除数据
     */
    @Delete("delete from gz_restaurant where FID=#{FID}")
    void deleteRes(int FID);

    /**
     * 根据查询数据
     *
     */
    @Select("select FID,pyname,telephone,lng,lat,address from gz_restaurant where Name=#{Name}")
    Restaurant findRestaurantByName(@Param("Name") String Name);

    /**
     * 查询所有数据
     */
    @Select("select FID,Name,pyname,telephone,lng,lat,address FROM gz_restaurant")
    List<Restaurant> findAll();
}

