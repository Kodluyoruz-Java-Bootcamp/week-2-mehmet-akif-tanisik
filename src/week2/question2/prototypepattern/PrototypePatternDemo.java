package week2.question2.prototypepattern;

import java.util.List;

public class PrototypePatternDemo {


    public static void main(String[] args) throws CloneNotSupportedException {

        Monsters monsters = new Monsters();
        monsters.loadData();

        Monsters m1 = (Monsters) monsters.clone();
        List<String> list = m1.getMonsterList();
        list.add("Krekon");


        Monsters m2 = (Monsters) monsters.clone();
        List<String> list1 = m2.getMonsterList();
        list1.remove("Cylan");


        System.out.println("Monster List: " + monsters.getMonsterList());

        System.out.println("m1 List: " + list);

        System.out.println("m2 list: " + list1);




    }
}
