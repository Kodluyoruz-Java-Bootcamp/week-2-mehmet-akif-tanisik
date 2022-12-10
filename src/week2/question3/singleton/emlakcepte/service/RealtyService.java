package week2.question3.singleton.emlakcepte.service;

import week2.question3.singleton.emlakcepte.dao.RealtyDao;
import week2.question3.singleton.emlakcepte.model.Realty;
import week2.question3.singleton.emlakcepte.model.RealtyType;
import week2.question3.singleton.emlakcepte.model.User;

import java.util.List;


public class RealtyService {
    private static RealtyService realtyService = null;

    private RealtyDao realtyDao = new RealtyDao();

    public static RealtyService getInstance(){

        if (realtyService == null){
            realtyService = new RealtyService();
        }
        return realtyService;
    }
    public void createRealty(Realty realty) {
        realtyDao.saveRealty(realty);
        System.out.println("createRealty :: " + realty.getTitle());
    }

    public List<Realty> getAll(){
        return realtyDao.findAll();
    }

    public void printAll(List<Realty> realtyList) {
        realtyList.forEach(System.out::println);
    }

    public void getAllByProvince(String province) {
        getAll().stream()
                .filter(realty -> realty.getProvince().equals(province))
                .forEach(System.out::println);
    }

    public List<Realty> getAllByUserName(User user){
        return getAll().stream()
                .filter(realty -> realty.getUser().getMail().equals(user.getMail()))
                .toList();
    }

    public List<Realty> getActiveRealtyByUserName(User user) {
        return getAll().stream()
                .filter(realty -> realty.getUser().getName().equals(user.getName()))
                .filter(realty -> RealtyType.ACTIVE.equals(realty.getStatus()))
                .toList();
    }
}
