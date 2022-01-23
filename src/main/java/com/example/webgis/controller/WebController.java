package com.example.webgis.controller;
import com.example.webgis.Service.SiteService;
import com.example.webgis.Damain.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/do/Site")
public class WebController{
    @Autowired
    private SiteService siteService;

    @RequestMapping(value = "/Site", method = RequestMethod.POST)
    public boolean addSite(@RequestBody Site site) {
        System.out.println("新增数据：");
        return siteService.addSite(site);
    }

    @RequestMapping(value = "/Site", method = RequestMethod.PUT)
    public boolean updateSite(@RequestBody Site site) {
        System.out.println("更新数据：");
        return siteService.updateSite(site);
    }

    @RequestMapping(value = "/Site", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "id", required = true) int Id) {
        System.out.println("删除数据：");
        return siteService.deleteSite(Id);
    }


    @RequestMapping(value = "/Site", method = RequestMethod.GET)
    public Site findBySiteName(@RequestParam(value = "SiteName", required = true) String SiteName) {
        System.out.println("查询数据：");
        return siteService.findSiteByName(SiteName);
    }

    @RequestMapping(value = "/SiteAll", method = RequestMethod.GET)
    public List<Site> findBySiteAge() {
        System.out.println("查询所有数据:");
        //System.out.println(siteService.findAll());
        return siteService.findAll();
    }
}
