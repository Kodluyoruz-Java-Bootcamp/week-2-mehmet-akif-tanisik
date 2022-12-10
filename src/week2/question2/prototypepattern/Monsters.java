package week2.question2.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements Cloneable{

    private List<String> monsterList;

    public Monsters(){
        monsterList = new ArrayList<>();
    }

    public Monsters(List<String> monsterList){
        this.monsterList = monsterList;
    }

    //Assume that we have data on our database, and we are loading our data
    public void loadData(){
        monsterList.add("Grevy");
        monsterList.add("Tustremen");
        monsterList.add("Klepso");
        monsterList.add("Cylan");
    }

    public List<String> getMonsterList() {
        return monsterList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<>(this.getMonsterList());
        return new Monsters(temp);
    }
}
