package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String Length: ");
        int len = input.nextInt();

       ArrayList<Integer> myList= new ArrayList<Integer>();
       ArrayList<String> myStringList= new ArrayList<String>();
       myList.add(15);
        myList.add(5);
        myList.add(4);
        myList.add(16);
        myList.add(8);
        myList.add(11);
        myList.add(9);
        myList.add(28);
        myList.add(23);
        myList.add(0);
        //int mySum= sumOfEven(myList);
        //System.out.println("Total sum of even is "+mySum);

        //MyString List

        myStringList.add("Ambika");
        myStringList.add("Kiran");
        myStringList.add("Greeshma");
        myStringList.add("Sishir");
        myStringList.add("Geesh");


        printEachWord(myStringList, len);

    }
    public static int sumOfEven(ArrayList<Integer> totalList){
        int sum=0;
        for(int i =0; i<totalList.size(); i++){
            if(totalList.get(i) % 2 == 0){
             System.out.println("Even " +totalList.get(i));
                sum = sum + totalList.get(i);
            }

        }
        //System.out.println("Total sum of even is: " + sum);
        return sum;
    }

    public static void printEachWord(ArrayList<String> totalStringList, int sizeOfString){

        for(int i=0; i<totalStringList.size(); i++){
            if(totalStringList.get(i).length()== sizeOfString) {
                System.out.println(totalStringList.get(i));
            }
        }
    }
}
