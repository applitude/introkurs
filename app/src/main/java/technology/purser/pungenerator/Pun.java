package technology.purser.pungenerator;

import java.util.ArrayList;

/**
 * Created by roypur on 11/5/15.
 */
public class Pun {
    private ArrayList<String> usedPuns = new ArrayList<>();
    public Pun(String p){
        usedPuns.add(p);
    }
    public boolean isNew(String p){
        return !usedPuns.contains(p);
    }
    public void add(String s){
        if(!usedPuns.contains(s)){
            usedPuns.add(s);
        }
    }

}
