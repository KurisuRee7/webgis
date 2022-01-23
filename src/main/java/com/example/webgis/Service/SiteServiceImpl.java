package com.example.webgis.Service;

import com.example.webgis.Dao.SiteDao;
import com.example.webgis.Damain.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    private SiteDao site;

    @Override
    public boolean addSite(Site site1) {
        boolean flag=false;
        try{
            site.addSite(site1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateSite(Site site1) {
        boolean flag=false;
        try{
            site.updateSite(site1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteSite(int id) {
        boolean flag=false;
        try{
            site.deleteSite(id);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Site findSiteByName(String name) {
        return site.findByName(name);
    }


    @Override
    public List<Site> findAll() {
        return site.findAll();
    }
}