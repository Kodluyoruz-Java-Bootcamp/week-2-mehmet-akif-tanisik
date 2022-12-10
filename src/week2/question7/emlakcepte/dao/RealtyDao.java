package week2.question7.emlakcepte.dao;

import week2.question7.emlakcepte.model.Realty;

import java.util.ArrayList;
import java.util.List;

public class RealtyDao {
    private static List<Realty> realtyList = new ArrayList<>();

    public void saveRealty(Realty realty){
        realty.getUser().getRealtyList().add(realty);
        realtyList.add(realty);
    }

    public List<Realty> findAll(){
        return realtyList;
    }

}
