package com.test;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Hungry {

    public static void main(String args[]){

        System.out.println("are you hungry?");

        Scanner in = new Scanner(System.in);

        String input = in.next();

        if(input.equals("yes")) {
            System.out.println("eat something");
            System.out.println("eat pizza");
        }
        else {
            System.out.println("are you thirsty?");
            String thirsty = in.next();
             if(thirsty.equals("yes")) {
                 System.out.println("drink water");
                 System.out.println("drink tan");
             }
        }
    }
}
