package week2.question7.emlakcepte;


import week2.question7.emlakcepte.model.*;
import week2.question7.emlakcepte.service.RealtyService;
import week2.question7.emlakcepte.service.UserService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EmlakCepteTest {


    public static void main(String[] args) {

        UserService userService = new UserService();
        RealtyService realtyService = new RealtyService();

        User user1 = prepareUser("User1", "user1@hotmail.com","user1pass");
        user1.setUserType(UserType.INDIVIDUAL);
        user1.setRealtyList(new ArrayList<>());
        user1.setSearches(new ArrayList<>());


        User user2 = prepareUser("USer2", "user2@hotmail.com", "user2pass");
        user2.setUserType(UserType.CORPORATE);
        user2.setRealtyList(new ArrayList<>());
        user2.setSearches(new ArrayList<>());

        userService.createUser(user1);
        userService.createUser(user2);

        userService.printAllUsers();


        Realty r1 = new Realty();
        r1.setProvince("istanbul");
        r1.setDistrict("levent");
        r1.setRealtyType(RealtyType.HOUSE);
        r1.setUser(user1);
        r1.setCategory(RealtyCategory.SALE);

        Realty r2 = new Realty();
        r2.setProvince("ankara");
        r2.setDistrict("levent");
        r2.setRealtyType(RealtyType.HOUSE);
        r2.setUser(user2);
        r2.setCategory(RealtyCategory.SALE);

        realtyService.createRealty(r1);
        realtyService.createRealty(r1);
        realtyService.createRealty(r1);
        realtyService.createRealty(r1);
        realtyService.createRealty(r2);


        System.out.println("Size: " + user1.getRealtyList().size());


        realtyService.getAllByProvinceAndDistrict("istanbul","levent");

        System.out.println("---------------------------------------------------------");

        System.out.println("Istanbul total: " + realtyService.getRealtyNumberInProvince("istanbul"));

        System.out.println("---------------------------------------------------------");

        System.out.println(realtyService.getHouseNumbersInProvince("istanbul",RealtyCategory.SALE));

        System.out.println("-----------------------SHOWCASE----------------------------------");

        realtyService.showcaseProvince("istanbul");

        System.out.println("---------------------------------------------------------------");
        System.out.println(r1.getUser().getUserType());


        System.out.println("Total izmir ankara istanbul : " + realtyService.getRealtyNumberInProvince(List.of("istanbul","ankara")));

        System.out.println("-------------------------------------------------------");

        Search search1 = new Search();
        search1.setProvince("istanbul");
        search1.setDistrict("maltepe");

        Search search2 = new Search();
        search2.setProvince("ankara");
        search2.setDistrict("kizilay");

        userService.saveSearch(search1, user1);
        userService.saveSearch(search2, user1);

        List<Search> searches = user1.getSearches();

        for (Search el: searches){
            System.out.println(el);
        }

    }

    private static User prepareUser(String name, String email, String password){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setUserType(UserType.INDIVIDUAL);
        user.setCreateDate(LocalDateTime.now());
        return user;
    }
}
