package com.example.webgis.controller.SurroundSiteController;
import com.example.webgis.Damain.SurroundSite.Education;
import com.example.webgis.Service.SurroundSiteService.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/do/SurroundSite/Education")
public class EducationController{
    @Autowired
    private EducationService eduService;

    @RequestMapping(value = "/Education", method = RequestMethod.POST)
    public boolean addEdu(@RequestBody Education edu) {
        System.out.println("新增数据：");
        return eduService.addEducation(edu);
    }

    @RequestMapping(value = "/Education", method = RequestMethod.PUT)
    public boolean updateEdu(@RequestBody Education edu) {
        System.out.println("更新数据：");
        return eduService.updateEducation(edu);
    }

    @RequestMapping(value = "/Education", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "FID", required = true) int FID) {
        System.out.println("删除数据：");
        return eduService.deleteEducation(FID);
    }


    @RequestMapping(value = "/Education", method = RequestMethod.GET)
    public Education findByEduname(@RequestParam(value = "Name", required = true) String Name) {
        System.out.println("查询数据：");
        return eduService.findEducationByName(Name);
    }

    @RequestMapping(value = "/EducationAll", method = RequestMethod.GET)
    public List<Education> findByEducationAge() {
        System.out.println("查询所有数据:");
        return eduService.findAll();
    }

}
