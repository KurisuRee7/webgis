package com.example.webgis.Service.SurroundSiteService;
import com.example.webgis.Damain.SurroundSite.Restaurant;

import java.util.List;

public interface RestaurantService {
    /**
     * 新增地标
     * @param res
     * @return
     */
    boolean addRestaurant(Restaurant res);

    /**
     * 修改地标
     * @param res
     * @return
     */
    boolean updateRestaurant(Restaurant res);


    /**
     * 删除地标
     * @param FID
     * @return
     */
    boolean deleteRestaurant(int FID);

    /**
     * 根据名字查询地标信息
     * @param Name
     */
    Restaurant findRestaurantByName(String Name);


    /**
     * 查询所有数据
     * @return
     */
    List<Restaurant> findAll();
}