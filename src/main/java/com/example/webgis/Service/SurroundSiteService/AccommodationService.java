package com.example.webgis.Service.SurroundSiteService;
import com.example.webgis.Damain.SurroundSite.Accommodation;

import java.util.List;

/**
 * 住宿服务
 *
 * @author lidx
 * @date 2022/01/24
 */
public interface AccommodationService {
    /**
     * 新增地标
     * @param acco
     * @return
     */
    boolean addAccommodation(Accommodation acco);

    /**
     * 修改地标
     * @param acco
     * @return
     */
    boolean updateAccommodation(Accommodation acco);


    /**
     * 删除地标
     * @param FID
     * @return
     */
    boolean deleteAccommodation(int FID);

    /**
     * 根据名字查询地标信息
     * @param Name
     * @return
     */
    Accommodation findAccommodationByName(String Name);


    /**
     * 查询所有数据
     * @return
     */
    List<Accommodation> findAll();
}