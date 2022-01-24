package com.example.webgis.Service.SurroundSiteService;
import com.example.webgis.Damain.SurroundSite.Entertain;

import java.util.List;

/**
 * 娱乐服务
 *
 * @author lidx
 * @date 2022/01/24
 */
public interface EntertainService {
    /**
     * 新增地标
     * @param ent
     * @return
     */
    boolean addEntertain(Entertain ent);

    /**
     * 修改地标
     * @param ent
     * @return
     */
    boolean updateEntertain(Entertain ent);


    /**
     * 删除地标
     * @param FID
     * @return
     */
    boolean deleteEntertain(int FID);

    /**
     * 根据名字查询地标信息
     * @param Name
     */
    Entertain findEntertainByName(String Name);


    /**
     * 查询所有数据
     * @return
     */
    List<Entertain> findAll();
}