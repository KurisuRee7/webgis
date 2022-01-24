package com.example.webgis.controller.SurroundSiteController;
import com.example.webgis.Damain.SurroundSite.Finance;
import com.example.webgis.Service.SurroundSiteService.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/do/SurroundSite/Finance")
public class FinanceController{
    @Autowired
    private FinanceService finService;

    @RequestMapping(value = "/Finance", method = RequestMethod.POST)
    public boolean addFin(@RequestBody Finance fin) {
        System.out.println("新增数据：");
        return finService.addFinance(fin);
    }

    @RequestMapping(value = "/Finance", method = RequestMethod.PUT)
    public boolean updateFin(@RequestBody Finance fin) {
        System.out.println("更新数据：");
        return finService.updateFinance(fin);
    }

    @RequestMapping(value = "/Finance", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "FID", required = true) int FID) {
        System.out.println("删除数据：");
        return finService.deleteFinance(FID);
    }


    @RequestMapping(value = "/Finance", method = RequestMethod.GET)
    public Finance findByFinname(@RequestParam(value = "Name", required = true) String Name) {
        System.out.println("查询数据：");
        return finService.findFinanceByName(Name);
    }

    @RequestMapping(value = "/FinanceAll", method = RequestMethod.GET)
    public List<Finance> findByFinanceAge() {
        System.out.println("查询所有数据:");
        return finService.findAll();
    }

}
