package week2.question3.factorypattern.emlakcepte.service;
import week2.question3.factorypattern.emlakcepte.dao.RealtyDao;
import week2.question3.factorypattern.emlakcepte.interfaces.IRealtyService;
import week2.question3.factorypattern.emlakcepte.model.Realty;
import week2.question3.factorypattern.emlakcepte.model.RealtyType;
import week2.question3.factorypattern.emlakcepte.model.User;


import java.util.List;

public class RealtyService implements IRealtyService {
    private RealtyDao realtyDao = new RealtyDao();

    @Override
    public void createRealty(Realty realty) {
        realtyDao.saveRealty(realty);
        System.out.println("createRealty :: " + realty.getTitle());
    }

    @Override
    public List<Realty> getAll() {
        return realtyDao.findAll();
    }

    @Override
    public void printAll(List<Realty> realtyList) {
        realtyList.forEach(System.out::println);
    }

    @Override
    public void getAllByProvince(String province) {
        getAll().stream()
                .filter(realty -> realty.getProvince().equals(province))
                .forEach(System.out::println);
    }

    @Override
    public List<Realty> getAllByUserName(User user) {
        return getAll().stream()
                .filter(realty -> realty.getUser().getMail().equals(user.getMail()))
                .toList();
    }

    @Override
    public List<Realty> getActiveRealtyByUserName(User user) {
        return getAll().stream()
                .filter(realty -> realty.getUser().getName().equals(user.getName()))
                .filter(realty -> RealtyType.ACTIVE.equals(realty.getStatus()))
                .toList();
    }
}


