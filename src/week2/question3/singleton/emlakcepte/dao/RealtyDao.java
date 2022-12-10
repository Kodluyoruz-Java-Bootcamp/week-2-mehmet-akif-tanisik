package week2.question3.singleton.emlakcepte.dao;

import week2.question3.singleton.emlakcepte.model.Realty;

import java.util.ArrayList;
import java.util.List;

public class RealtyDao {

    private static List<Realty> realtyList = new ArrayList<>();

    public void saveRealty(Realty realty) {
        realtyList.add(realty);
    }

    public List<Realty> findAll(){
        return realtyList;
    }

}
