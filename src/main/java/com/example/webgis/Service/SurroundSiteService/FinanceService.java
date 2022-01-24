package com.example.webgis.Service.SurroundSiteService;
import com.example.webgis.Damain.SurroundSite.Finance;

import java.util.List;

public interface FinanceService {
    /**
     * 新增地标
     * @param fin
     * @return
     */
    boolean addFinance(Finance fin);

    /**
     * 修改地标
     * @param fin
     * @return
     */
    boolean updateFinance(Finance fin);


    /**
     * 删除地标
     * @param FID
     * @return
     */
    boolean deleteFinance(int FID);

    /**
     * 根据名字查询地标信息
     * @param Name
     */
    Finance findFinanceByName(String Name);


    /**
     * 查询所有数据
     * @return
     */
    List<Finance> findAll();
}