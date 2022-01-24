package com.example.webgis.Service.SurroundSiteServiceImpl;

import com.example.webgis.Dao.SurroundSiteDao.EducationDao;
import com.example.webgis.Damain.SurroundSite.Education;
import com.example.webgis.Service.SurroundSiteService.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationDao edu;

    @Override
    public boolean addEducation(Education edu1) {
        boolean flag=false;
        try{
            edu.addEdu(edu1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateEducation(Education edu1) {
        boolean flag=false;
        try{
            edu.updateEdu(edu1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteEducation(int FID) {
        boolean flag=false;
        try{
            edu.deleteEdu(FID);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Education findEducationByName(String Name) {
        return edu.findEducationByName(Name);
    }


    @Override
    public List<Education> findAll() {
        return edu.findAll();
    }
}