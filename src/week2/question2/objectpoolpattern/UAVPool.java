package week2.question2.objectpoolpattern;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class UAVPool extends ObjectPoolPattern<UAV>{

    @Override
    public UAV create() {

        int id = ThreadLocalRandom.current().nextInt();

        return new UAV(id,new ArrayList<>(), new UAV.Component());

    }

}
