package com.example.webgis.Service;
import com.example.webgis.Damain.Site;

import java.util.List;

public interface SiteService {
    /**
     * 新增用户
     * @param site
     * @return
     */
    boolean addSite(Site site);

    /**
     * 修改用户
     * @param site
     * @return
     */
    boolean updateSite(Site site);


    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteSite(int id);

    /**
     * 根据名字查询用户信息
     * @param name
     */
    Site findSiteByName(String name);


    /**
     * 查询所有数据
     * @return
     */
    List<Site> findAll();
}