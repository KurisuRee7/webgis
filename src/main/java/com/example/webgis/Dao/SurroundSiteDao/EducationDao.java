package com.example.webgis.Dao.SurroundSiteDao;

import com.example.webgis.Damain.Site;
import com.example.webgis.Damain.SurroundSite.Education;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Mapper
public interface EducationDao {
    /**
     * 新增数据
     */
    @Insert("insert into gz_education(FID,Name,pyname,telephone,lng,lat,address) values (#{FID},#{Name},#{pyname},#{telephone},#{lng}),#{lat},,#{address}")
    void addEdu(Education ecu);

    /**
     * 修改数据
     */
    @Update("update gz_education set Name=#{Name},pyname=#{pyname},telephone=#{telephone},lng==#{lng},lat==#{lat},address==#{address} where FID=#{FID}")
    void updateEdu(Education ecu);

    /**
     * 删除数据
     */
    @Delete("delete from gz_education where FID=#{FID}")
    void deleteEdu(int FID);

    /**
     * 根据查询数据
     *
     */
    @Select("select FID,pyname,telephone,lng,lat,address from gz_education where Name=#{Name}")
    Education findEducationByName(@Param("Name") String Name);

    /**
     * 查询所有数据
     */
    @Select("select FID,Name,pyname,telephone,lng,lat,address FROM gz_education")
    List<Education> findAll();
}

