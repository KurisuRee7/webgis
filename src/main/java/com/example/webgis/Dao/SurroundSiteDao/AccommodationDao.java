package com.example.webgis.Dao.SurroundSiteDao;

import com.example.webgis.Damain.Site;
import com.example.webgis.Damain.SurroundSite.Accommodation;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Mapper
public interface AccommodationDao {
    /**
     * 新增数据
     */
    @Insert("insert into gz_accommodation(FID,Name,pyname,telephone,lng,lat,address) values (#{FID},#{Name},#{pyname},#{telephone},#{lng}),#{lat},,#{address}")
    void addAcco(Accommodation acco);

    /**
     * 修改数据
     */
    @Update("update gz_accommodation set Name=#{Name},pyname=#{pyname},telephone=#{telephone},lng==#{lng},lat==#{lat},address==#{address} where FID=#{FID}")
    void updateAcco(Accommodation acco);

    /**
     * 删除数据
     */
    @Delete("delete from gz_accommodation where FID=#{FID}")
    void deleteAcco(int FID);

    /**
     * 根据查询数据
     *
     */
    @Select("select FID,pyname,telephone,lng,lat,address from gz_accommodation where Name=#{Name}")
    Accommodation findAccommodationByName(@Param("Name") String Name);

    /**
     * 查询所有数据
     */
    @Select("select FID,Name,pyname,telephone,lng,lat,address FROM gz_accommodation")
    List<Accommodation> findAll();
}

