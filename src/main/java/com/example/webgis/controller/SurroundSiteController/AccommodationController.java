package com.example.webgis.controller.SurroundSiteController;
import com.example.webgis.Damain.SurroundSite.Accommodation;
import com.example.webgis.Service.SurroundSiteService.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/do/SurroundSite/Accommodation")
public class AccommodationController{
    @Autowired
    private AccommodationService accoService;

    @RequestMapping(value = "/Accommodation", method = RequestMethod.POST)
    public boolean addAcco(@RequestBody Accommodation acco) {
        System.out.println("新增数据：");
        return accoService.addAccommodation(acco);
    }

    @RequestMapping(value = "/Accommodation", method = RequestMethod.PUT)
    public boolean updateAcco(@RequestBody Accommodation acco) {
        System.out.println("更新数据：");
        return accoService.updateAccommodation(acco);
    }

    @RequestMapping(value = "/Accommodation", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "FID", required = true) int FID) {
        System.out.println("删除数据：");
        return accoService.deleteAccommodation(FID);
    }


    @RequestMapping(value = "/Accommodation", method = RequestMethod.GET)
    public Accommodation findByAcconame(@RequestParam(value = "Name", required = true) String Name) {
        System.out.println("查询数据：");
        return accoService.findAccommodationByName(Name);
    }

    @RequestMapping(value = "/AccommodationAll", method = RequestMethod.GET)
    public List<Accommodation> findByAccommodationAge() {
        System.out.println("查询所有数据:");
        return accoService.findAll();
    }

}
