package com.example.webgis.controller.SurroundSiteController;
import com.example.webgis.Damain.SurroundSite.Entertain;
import com.example.webgis.Service.SurroundSiteService.EntertainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 娱乐控制层
 *
 * @author lidx
 * @date 2022/01/24
 */
@RestController
@RequestMapping(value = "/do/SurroundSite/Entertain")
public class EntertainController{
    @Autowired
    private EntertainService entService;

    @RequestMapping(value = "/Entertain", method = RequestMethod.POST)
    public boolean addEnt(@RequestBody Entertain ent) {
        System.out.println("新增数据：");
        return entService.addEntertain(ent);
    }

    @RequestMapping(value = "/Entertain", method = RequestMethod.PUT)
    public boolean updateEnt(@RequestBody Entertain ent) {
        System.out.println("更新数据：");
        return entService.updateEntertain(ent);
    }

    @RequestMapping(value = "/Entertain", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "FID", required = true) int FID) {
        System.out.println("删除数据：");
        return entService.deleteEntertain(FID);
    }


    @RequestMapping(value = "/Entertain", method = RequestMethod.GET)
    public Entertain findByEntname(@RequestParam(value = "Name", required = true) String Name) {
        System.out.println("查询数据：");
        return entService.findEntertainByName(Name);
    }

    @RequestMapping(value = "/EntertainAll", method = RequestMethod.GET)
    public List<Entertain> findByEntertainAge() {
        System.out.println("查询所有数据:");
        return entService.findAll();
    }

}
