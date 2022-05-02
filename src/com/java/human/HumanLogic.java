package com.java.human;
import java.util.Scanner;

public class HumanLogic {
    public static Scanner in = new Scanner(System.in);
    public static void MainCharacters(){
        System.out.println("Hi, my dear friend, lets build for you a funny beast called Franky");
        System.out.println("Create a name");
        String name = in.next();

        System.out.println("Please, input the color of hair");
        String hairColor = in.next();

        System.out.println("choose a type of hair");

        String var1 = "Long";
        String var2 = "Mid";
        String var3 = "Short";
        String var4 = "Bold";
        String var5 = "Undercut";
        System.out.println(var1 + "\n" + var2 + "\n" + var3 + "\n" + var4 + "\n" + var5);
        String choose = in.next();
        if(choose == var1){
            System.out.println("your type of hair is: " + var1);
        }
        else if (choose == var2) {
            System.out.println("your type of hair is: " + var2);
        } else if (choose == var3 || choose == var4) {
            System.out.println("Youre have a dummy type of hair, AHHAHAAHHAHAHAHAH");
            if (choose == var5) {
                System.out.println("Are you kidding me??????????");
            }
        }
        System.out.println("The hairtype of your " + name + " " + " is " + choose + " " + " "+ "with " + hairColor + " colored hair");
    }
    public static void InternalOrgans(){
        System.out.println("Input amount of lungs");
        int lungs = in.nextInt();

        System.out.println("input amount of heart(s)");
        int heart = in.nextInt();

        System.out.println("input amount of stomach");
        int stomach = in.nextInt();

        System.out.println("Input amount of ribs");
        int ribs = in.nextInt();
        if(ribs %2 != 0){
            System.out.println("write a pair amount");
        }


        System.out.println("That`s is internal char-s of your Franky");

        System.out.println("The internal characters is: " + "\n amount of lungs is : " + lungs + "\n amount of heart(s) is: " + heart + "\n amount of stomach(s): " + stomach + "\n amount of ribs is: " + ribs);

    }
    public static void BodyParts(){
        System.out.println("Hey, that`s a third step, go on, and enter a body parts");
        System.out.println("Enter a amount of hands");
        int hands = in.nextInt();
        if( hands  %2 != 0){
            System.out.println("pair amount, please");
        }
        System.out.println("Enter amount of legs");
        int legs = in.nextInt();

        System.out.println("Enter amount of head");
        int head = in.nextInt();
    }
    public static void AllOut(){
        System.out.println();

    }
    public static void main(String[] args) {

        MainCharacters();
        BodyParts();
        InternalOrgans();
    }

    }
}


