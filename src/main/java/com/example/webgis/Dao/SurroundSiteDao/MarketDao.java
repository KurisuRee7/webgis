package com.example.webgis.Dao.SurroundSiteDao;

import com.example.webgis.Damain.Site;
import com.example.webgis.Damain.SurroundSite.Market;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Mapper
public interface MarketDao {
    /**
     * 新增数据
     */
    @Insert("insert into gz_market(FID,Name,pyname,telephone,lng,lat,address) values (#{FID},#{Name},#{pyname},#{telephone},#{lng}),#{lat},,#{address}")
    void addMar(Market mar);

    /**
     * 修改数据
     */
    @Update("update gz_market set Name=#{Name},pyname=#{pyname},telephone=#{telephone},lng==#{lng},lat==#{lat},address==#{address} where FID=#{FID}")
    void updateMar(Market mar);

    /**
     * 删除数据
     */
    @Delete("delete from gz_market where FID=#{FID}")
    void deleteMar(int FID);

    /**
     * 根据查询数据
     *
     */
    @Select("select FID,pyname,telephone,lng,lat,address from gz_market where Name=#{Name}")
    Market findMarketByName(@Param("Name") String Name);

    /**
     * 查询所有数据
     */
    @Select("select FID,Name,pyname,telephone,lng,lat,address FROM gz_market")
    List<Market> findAll();
}

