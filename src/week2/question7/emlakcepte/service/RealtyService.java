package week2.question7.emlakcepte.service;

import week2.question7.emlakcepte.dao.RealtyDao;
import week2.question7.emlakcepte.model.*;

import java.util.List;


public class RealtyService {

    private RealtyDao realtyDao = new RealtyDao();

    public void createRealty(Realty realty){

        if (realty.getUser().getUserType().equals(UserType.INDIVIDUAL) && realty.getRealtyType().equals(RealtyType.HOUSE)){

            if (realty.getUser().getRealtyList().size()<3){
                realtyDao.saveRealty(realty);
                System.out.println(realty.getTitle() + " eklendi.");
            } else {
                System.out.println("sınıra ulaştın");
            }

        } else {
            realtyDao.saveRealty(realty);
            System.out.println(realty.getTitle() + " eklendi.");
        }
    }

    public List<Realty> getAll(){
        return realtyDao.findAll();
    }

    public void printAll(List<Realty> realtyList){
        realtyList.forEach(System.out::println);
    }

    public void getAllByProvince(String province){
        getAll().stream()
                .filter(realty -> realty.getProvince().equalsIgnoreCase(province))
                //      .count();
                .forEach(System.out::println);
    }

    public void getAllByProvinceAndDistrict(String province, String district){
        getAll().stream()
                .filter(realty -> realty.getProvince().equalsIgnoreCase(province))
                .filter(realty -> realty.getDistrict().equalsIgnoreCase(district))
                .forEach(System.out::println);
    }

    public List<Realty> getAllByUserName(User user){
        return getAll().stream()
                .filter(realty -> realty.getUser().getEmail().equals(user.getEmail()))
                .toList();
    }

    public List<Realty> getActiveRealtyByUserName(User user){

        return getAll().stream()
                .filter(realty -> realty.getUser().getName().equals(user.getName()))
                .filter(realty -> RealtyPublishStatus.ACTIVE.equals(realty.getStatus()))
                .toList();
    }

    public long getRealtyNumberInProvince(String province){

        return getAll().stream()
                .filter(realty -> realty.getProvince().equalsIgnoreCase(province))
                .count();
    }

    public long getRealtyNumberInProvince(List<String> provinces){
        return getAll().stream()
                .filter(realty -> provinces.contains(realty.getProvince()))
                .count();
    }

    public long getHouseNumbersInProvince(String province, RealtyCategory category){

        return getAll().stream()
                .filter(realty -> realty.getProvince().equalsIgnoreCase(province))
                .filter(realty -> realty.getRealtyType().equals(RealtyType.HOUSE))
                .filter(realty -> realty.getCategory().equals(category))
                .count();
    }

    /*
    public void showcaseProvince(String province){
        ArrayList<Realty> realties = new ArrayList<>();
        int count = 0;
        for(Realty element: getAll()){
            if (element!= null && element.getProvince().equalsIgnoreCase(province)){
                realties.add(element);
                count++;
                if (count==9){
                    break;
                }
            }
        }
        realties.forEach(System.out::println);
    }
     */

    public void showcaseProvince(String province){
        getAll().stream().filter(realty -> realty.getProvince().equals(province)).limit(10).forEach(System.out::println);

    }

}
