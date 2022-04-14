package exercises;

import java.util.Arrays;

public class SplitTest {
    public static void main(String[] args){
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrayOfString = myString.split("\\.");
        for(int i=0; i<arrayOfString.length; i++) {
            System.out.println(arrayOfString[i]);
        }
    }
}
