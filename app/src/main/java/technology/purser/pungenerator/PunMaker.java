package technology.purser.pungenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by roypur on 11/5/15.
 */
public class PunMaker {
    private ArrayList<Word> puns = new ArrayList<>();
    private HashMap<String, Pun> searchWords = new HashMap<>();

    public PunMaker(Scanner sc){
        while(sc.hasNextLine()){
            puns.add(new Word(sc.nextLine()));
        }
        sc.close();
    }
    public String makePun(String txt){
        for(Word w: puns){
            int syllableLength = w.firstSyllable().length();
            String lastOfInput = "";
            if(syllableLength <= txt.length()){
                lastOfInput = txt.substring(txt.length() - syllableLength);
            }
            String pun;
            if(w.firstSyllable().equals(lastOfInput)){
                pun = txt + w.restOfSyllables();

                if(searchWords.get(txt) != null){
                    if(searchWords.get(txt).isNew(pun)){
                        searchWords.put(txt, new Pun(pun));
                        return pun;


                    }
                }else{
                    searchWords.put(txt, new Pun(pun));
                    return pun;
                }

            }

        }
        return "";
    }
}

