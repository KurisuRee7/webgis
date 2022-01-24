package com.example.webgis.Dao.SurroundSiteDao;

import com.example.webgis.Damain.SurroundSite.Entertain;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Mapper
public interface EntertainDao {
    /**
     * 新增数据
     */
    @Insert("insert into gz_entertain(FID,Name,pyname,telephone,lng,lat,address) values (#{FID},#{Name},#{pyname},#{telephone},#{lng}),#{lat},#{address}")
    void addEnt(Entertain ent);

    /**
     * 修改数据
     */
    @Update("update gz_entertain set Name=#{Name},pyname=#{pyname},telephone=#{telephone},lng==#{lng},lat==#{lat},address==#{address} where FID=#{FID}")
    void updateEnt(Entertain ent);

    /**
     * 删除数据
     */
    @Delete("delete from gz_entertain where FID=#{FID}")
    void deleteEnt(int FID);

    /**
     * 根据查询数据
     *
     */
    @Select("select FID,pyname,telephone,lng,lat,address from gz_entertain where Name=#{Name}")
    Entertain findEntertainByName(@Param("Name") String Name);

    /**
     * 查询所有数据
     */
    @Select("select FID,Name,pyname,telephone,lng,lat,address FROM gz_entertain")
    List<Entertain> findAll();
}

