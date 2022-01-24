package com.example.webgis.Service.SurroundSiteServiceImpl;

import com.example.webgis.Dao.SurroundSiteDao.AccommodationDao;
import com.example.webgis.Damain.SurroundSite.Accommodation;
import com.example.webgis.Service.SurroundSiteService.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccommodationServiceImpl implements AccommodationService {
    @Autowired
    private AccommodationDao acco;

    @Override
    public boolean addAccommodation(Accommodation acco1) {
        boolean flag=false;
        try{
            acco.addAcco(acco1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateAccommodation(Accommodation acco1) {
        boolean flag=false;
        try{
            acco.updateAcco(acco1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteAccommodation(int FID) {
        boolean flag=false;
        try{
            acco.deleteAcco(FID);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Accommodation findAccommodationByName(String Name) {
        return acco.findAccommodationByName(Name);
    }


    @Override
    public List<Accommodation> findAll() {
        return acco.findAll();
    }
}