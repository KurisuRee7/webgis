package com.example.webgis.controller.SurroundSiteController;
import com.example.webgis.Damain.SurroundSite.Restaurant;
import com.example.webgis.Service.SurroundSiteService.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 餐厅控制层
 *
 * @author lidx
 * @date 2022/01/24
 */
@RestController
@RequestMapping(value = "/do/SurroundSite/Restaurant")
public class RestaurantController{
    @Autowired
    private RestaurantService resService;

    @RequestMapping(value = "/Restaurant", method = RequestMethod.POST)
    public boolean addRes(@RequestBody Restaurant res) {
        System.out.println("新增数据：");
        return resService.addRestaurant(res);
    }

    @RequestMapping(value = "/Restaurant", method = RequestMethod.PUT)
    public boolean updateRes(@RequestBody Restaurant res) {
        System.out.println("更新数据：");
        return resService.updateRestaurant(res);
    }

    @RequestMapping(value = "/Restaurant", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "FID", required = true) int FID) {
        System.out.println("删除数据：");
        return resService.deleteRestaurant(FID);
    }


    @RequestMapping(value = "/Restaurant", method = RequestMethod.GET)
    public Restaurant findByResname(@RequestParam(value = "Name", required = true) String Name) {
        System.out.println("查询数据：");
        return resService.findRestaurantByName(Name);
    }

    @RequestMapping(value = "/RestaurantAll", method = RequestMethod.GET)
    public List<Restaurant> findByRestaurantAge() {
        System.out.println("查询所有数据:");
        return resService.findAll();
    }

}
