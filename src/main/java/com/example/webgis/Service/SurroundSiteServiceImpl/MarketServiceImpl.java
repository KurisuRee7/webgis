package com.example.webgis.Service.SurroundSiteServiceImpl;

import com.example.webgis.Dao.SurroundSiteDao.MarketDao;
import com.example.webgis.Damain.SurroundSite.Market;
import com.example.webgis.Service.SurroundSiteService.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 市场服务实现层
 *
 * @author lidx
 * @date 2022/01/24
 */
@Service
public class MarketServiceImpl implements MarketService {
    @Autowired
    private MarketDao mar;

    @Override
    public boolean addMarket(Market fin1) {
        boolean flag=false;
        try{
            mar.addMar(fin1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateMarket(Market fin1) {
        boolean flag=false;
        try{
            mar.updateMar(fin1);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteMarket(int FID) {
        boolean flag=false;
        try{
            mar.deleteMar(FID);
            flag=true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Market findMarketByName(String Name) {
        return mar.findMarketByName(Name);
    }


    @Override
    public List<Market> findAll() {
        return mar.findAll();
    }
}