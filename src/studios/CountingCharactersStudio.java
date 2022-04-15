package studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharactersStudio {
    public static void main(String[] args){
        HashMap<Character, Integer> characterCount = new HashMap<>();
    String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        for(int i=0; i<charactersInString.length; i++){
            //System.out.println("Character[" +i + "] :" +charactersInString[i]);
            if(characterCount.containsKey(charactersInString[i])){
                characterCount.put(charactersInString[i],characterCount.get(charactersInString[i] ) +1);
            }
            else {
                characterCount.put(charactersInString[i], 1);
            }

        }
        for(Map.Entry<Character, Integer> totalChars: characterCount.entrySet()) {
            System.out.println(totalChars.getKey() +" : " +totalChars.getValue());
        }
    }

}
