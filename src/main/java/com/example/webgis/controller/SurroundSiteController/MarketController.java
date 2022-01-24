package com.example.webgis.controller.SurroundSiteController;
import com.example.webgis.Damain.SurroundSite.Market;
import com.example.webgis.Service.SurroundSiteService.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 市场控制层
 *
 * @author lidx
 * @date 2022/01/24
 */
@RestController
@RequestMapping(value = "/do/SurroundSite/Market")
public class MarketController{
    @Autowired
    private MarketService marService;

    @RequestMapping(value = "/Market", method = RequestMethod.POST)
    public boolean addMar(@RequestBody Market mar) {
        System.out.println("新增数据：");
        return marService.addMarket(mar);
    }

    @RequestMapping(value = "/Market", method = RequestMethod.PUT)
    public boolean updateMar(@RequestBody Market mar) {
        System.out.println("更新数据：");
        return marService.updateMarket(mar);
    }

    @RequestMapping(value = "/Market", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "FID", required = true) int FID) {
        System.out.println("删除数据：");
        return marService.deleteMarket(FID);
    }


    @RequestMapping(value = "/Market", method = RequestMethod.GET)
    public Market findByMarname(@RequestParam(value = "Name", required = true) String Name) {
        System.out.println("查询数据：");
        return marService.findMarketByName(Name);
    }

    @RequestMapping(value = "/MarketAll", method = RequestMethod.GET)
    public List<Market> findByMarketAge() {
        System.out.println("查询所有数据:");
        return marService.findAll();
    }

}
