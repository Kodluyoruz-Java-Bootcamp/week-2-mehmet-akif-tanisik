package week2.question3.factorypattern.emlakcepte.factory;

import week2.question3.factorypattern.emlakcepte.interfaces.IRealtyService;
import week2.question3.factorypattern.emlakcepte.service.RealtyService;

public class RealtyServiceFactory {
    public IRealtyService getIRealtyService(String realtyServiceType){

        if (realtyServiceType == null){
            return null;
        }

        if (realtyServiceType.equalsIgnoreCase("REALTYSERVICE")){
            return new RealtyService();
        }
        return null;
    }
}
