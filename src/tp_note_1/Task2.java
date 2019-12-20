package tp_note_1;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H,M,S;
        System.out.println("Program for conveting seconds into formated H:M:S");
        System.out.print("Input number of seconds: ");
        S = Integer.parseInt(sc.nextLine());
        H = (S/3600);
        M = (S % 3600)/60;
        S = S % 60;
        System.out.println("Time corresponding to "+S+"seconds is" +H+ ":" +M+ ":"+S);
    }
}