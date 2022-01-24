package com.example.webgis.Service.SurroundSiteServiceImpl;

import com.example.webgis.Dao.SurroundSiteDao.RestaurantDao;
import com.example.webgis.Damain.SurroundSite.Restaurant;
import com.example.webgis.Service.SurroundSiteService.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 餐厅服务impl
 *
 * @author lidx
 * @date 2022/01/24
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantDao res;

    @Override
    public boolean addRestaurant(Restaurant fin1) {
        boolean flag=false;
        try{
            res.addRes(fin1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateRestaurant(Restaurant fin1) {
        boolean flag=false;
        try{
            res.updateRes(fin1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteRestaurant(int FID) {
        boolean flag=false;
        try{
            res.deleteRes(FID);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Restaurant findRestaurantByName(String Name) {
        return res.findRestaurantByName(Name);
    }


    @Override
    public List<Restaurant> findAll() {
        return res.findAll();
    }
}