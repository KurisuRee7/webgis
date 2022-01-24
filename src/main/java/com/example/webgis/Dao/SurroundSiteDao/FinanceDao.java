package com.example.webgis.Dao.SurroundSiteDao;

import com.example.webgis.Damain.SurroundSite.Finance;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * 金融数据访问层
 *
 * @author lidx
 * @date 2022/01/24
 */
@Mapper
public interface FinanceDao {
    /**
     * 新增数据
     */
    @Insert("insert into gz_finance(FID,Name,pyname,telephone,lng,lat,address) values (#{FID},#{Name},#{pyname},#{telephone},#{lng}),#{lat},#{address}")
    void addFin(Finance fin);

    /**
     * 修改数据
     */
    @Update("update gz_finance set Name=#{Name},pyname=#{pyname},telephone=#{telephone},lng==#{lng},lat==#{lat},address==#{address} where FID=#{FID}")
    void updateFin(Finance fin);

    /**
     * 删除数据
     */
    @Delete("delete from gz_finance where FID=#{FID}")
    void deleteFin(int FID);

    /**
     * 根据查询数据
     *
     */
    @Select("select FID,pyname,telephone,lng,lat,address from gz_finance where Name=#{Name}")
    Finance findFinanceByName(@Param("Name") String Name);

    /**
     * 查询所有数据
     */
    @Select("select FID,Name,pyname,telephone,lng,lat,address FROM gz_finance")
    List<Finance> findAll();
}

