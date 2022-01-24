package com.example.webgis.Service;
import com.example.webgis.Damain.Site;

import java.util.List;

/**
 * 地标服务层
 *
 * @author lidx
 * @date 2022/01/24
 */
public interface SiteService {
    /**
     * 新增地标
     * @param site
     * @return
     */
    boolean addSite(Site site);

    /**
     * 修改地标
     * @param site
     * @return
     */
    boolean updateSite(Site site);


    /**
     * 删除地标
     * @param id
     * @return
     */
    boolean deleteSite(int id);

    /**
     * 根据名字查询地标信息
     * @param name
     */
    Site findSiteByName(String name);


    /**
     * 查询所有数据
     * @return
     */
    List<Site> findAll();
}