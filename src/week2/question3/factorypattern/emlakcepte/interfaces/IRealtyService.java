package week2.question3.factorypattern.emlakcepte.interfaces;

import week2.question3.factorypattern.emlakcepte.model.Realty;
import week2.question3.factorypattern.emlakcepte.model.User;

import java.util.List;

public interface IRealtyService {

    void createRealty(Realty realty);

    List<Realty> getAll();

    void printAll(List<Realty> realtyList);

    void getAllByProvince(String province);

    List<Realty> getAllByUserName(User user);

    List<Realty> getActiveRealtyByUserName(User user);

}
