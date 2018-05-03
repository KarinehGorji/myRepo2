package com.test;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Hungry {

    public static void main(String args[]){

        System.out.println("are you hungry?");

        Scanner in = new Scanner(System.in);

        String input = in.next();

        if(input.equals("yes"))
            System.out.println("eat something");
        else
            System.out.println("thats great");
    }
}
