package week2.question2.objectpoolpattern;

import java.util.Hashtable;

public abstract class ObjectPoolPattern <T>{
    private final Hashtable<T, Boolean> checked = new Hashtable<>();

    public abstract T create();

    public synchronized void checkOut(T t){
        checked.put(t, false);
    }

    public synchronized T checkIn(){

        for (T element: checked.keySet()){
            if (checked.get(element)){
                return element;
            }
        }
        return null;
    }


}
