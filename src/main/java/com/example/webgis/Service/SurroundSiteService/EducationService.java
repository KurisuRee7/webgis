package com.example.webgis.Service.SurroundSiteService;
import com.example.webgis.Damain.SurroundSite.Education;

import java.util.List;

public interface EducationService {
    /**
     * 新增地标
     * @param edu
     * @return
     */
    boolean addEducation(Education edu);

    /**
     * 修改地标
     * @param edu
     * @return
     */
    boolean updateEducation(Education edu);


    /**
     * 删除地标
     * @param FID
     * @return
     */
    boolean deleteEducation(int FID);

    /**
     * 根据名字查询地标信息
     * @param Name
     */
    Education findEducationByName(String Name);


    /**
     * 查询所有数据
     * @return
     */
    List<Education> findAll();
}