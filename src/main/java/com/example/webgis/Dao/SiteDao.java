package com.example.webgis.Dao;

import com.example.webgis.Damain.Site;
import org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * 地标数据访问层
 *
 * @author lidx
 * @date 2022/01/24
 */
@Mapper
public interface SiteDao {
    /**
     * 新增数据
     */
    @Insert("insert into gz_sites(id,code,name,lng,lat,adname,adcode,address,type) values (#{id},#{code},#{name},#{lng},#{lat},#{adname},#{adcode},#{address},#{type})")
    void addSite(Site site);

    /**
     * 修改数据
     */
    @Update("update gz_sites set code=#{code},name=#{name},lng==#{lng},lat==#{lat},adname==#{adname},adcode=#{adcode},address==#{address},type==#{type} where id=#{id}")
    void updateSite(Site site);

    /**
     * 删除数据
     */
    @Delete("delete from gz_sites where id=#{id}")
    void deleteSite(int id);

    /**
     * 根据查询数据
     *
     */
    @Select("select id,code,name,lng,lat,adname,adcode,address,type from gz_sites where name=#{name}")
    Site findSiteByName(@Param("name") String name);

    /**
     * 查询所有数据
     */
    @Select("select id,code,name,lng,lat,adname,adcode,address,type FROM gz_sites")
    List<Site> findAll();
}
