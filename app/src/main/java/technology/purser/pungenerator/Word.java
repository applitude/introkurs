package technology.purser.pungenerator;

/**
 * Created by roypur on 11/5/15.
 */
public class Word {
    private String[] syllables;
    public Word(String w){
        syllables = w.split(";");
    }
    public String firstSyllable(){
        return syllables[0];
    }
    public String restOfSyllables(){
        String partOfWord = "";
        if(syllables.length>1){
            for(int i=1; i<syllables.length; i++){
                partOfWord += syllables[i];
            }
            return partOfWord;
        }
        return syllables[0];
    }


}
