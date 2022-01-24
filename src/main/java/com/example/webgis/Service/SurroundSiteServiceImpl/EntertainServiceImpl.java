package com.example.webgis.Service.SurroundSiteServiceImpl;

import com.example.webgis.Dao.SurroundSiteDao.EntertainDao;
import com.example.webgis.Damain.SurroundSite.Entertain;
import com.example.webgis.Service.SurroundSiteService.EntertainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 娱乐服务实现层
 *
 * @author lidx
 * @date 2022/01/24
 */
@Service
public class EntertainServiceImpl implements EntertainService {
    @Autowired
    private EntertainDao ent;

    @Override
    public boolean addEntertain(Entertain ent1) {
        boolean flag=false;
        try{
            ent.addEnt(ent1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateEntertain(Entertain ent1) {
        boolean flag=false;
        try{
            ent.updateEnt(ent1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteEntertain(int FID) {
        boolean flag=false;
        try{
            ent.deleteEnt(FID);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Entertain findEntertainByName(String Name) {
        return ent.findEntertainByName(Name);
    }


    @Override
    public List<Entertain> findAll() {
        return ent.findAll();
    }
}