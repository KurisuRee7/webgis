package com.example.webgis.Service.SurroundSiteService;
import com.example.webgis.Damain.SurroundSite.Market;

import java.util.List;

/**
 * 市场服务
 *
 * @author lidx
 * @date 2022/01/24
 */
public interface MarketService {
    /**
     * 新增地标
     * @param mar
     * @return
     */
    boolean addMarket(Market mar);

    /**
     * 修改地标
     * @param mar
     * @return
     */
    boolean updateMarket(Market mar);


    /**
     * 删除地标
     * @param FID
     * @return
     */
    boolean deleteMarket(int FID);

    /**
     * 根据名字查询地标信息
     * @param Name
     */
    Market findMarketByName(String Name);


    /**
     * 查询所有数据
     * @return
     */
    List<Market> findAll();
}