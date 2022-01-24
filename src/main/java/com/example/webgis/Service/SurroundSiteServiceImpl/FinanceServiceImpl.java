package com.example.webgis.Service.SurroundSiteServiceImpl;

import com.example.webgis.Dao.SurroundSiteDao.FinanceDao;
import com.example.webgis.Damain.SurroundSite.Finance;
import com.example.webgis.Service.SurroundSiteService.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 金融服务实现层
 *
 * @author lidx
 * @date 2022/01/24
 */
@Service
public class FinanceServiceImpl implements FinanceService {
    @Autowired
    private FinanceDao fin;

    @Override
    public boolean addFinance(Finance fin1) {
        boolean flag=false;
        try{
            fin.addFin(fin1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateFinance(Finance fin1) {
        boolean flag=false;
        try{
            fin.updateFin(fin1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteFinance(int FID) {
        boolean flag=false;
        try{
            fin.deleteFin(FID);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Finance findFinanceByName(String Name) {
        return fin.findFinanceByName(Name);
    }


    @Override
    public List<Finance> findAll() {
        return fin.findAll();
    }
}