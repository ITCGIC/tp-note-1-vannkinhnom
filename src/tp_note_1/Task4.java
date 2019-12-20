package tp_note_1;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S,S1,M,M1,H,H1,S0,M0,H0,Start,End,AnsSecond,AnsMinute;
        double Money;
        System.out.println("Program for calculating cost of a call.");
        System.out.print("Please input start hours: ");
        H = Integer.parseInt(sc.nextLine());
        System.out.print("Please input start minutes: ");
        M = Integer.parseInt(sc.nextLine());
        System.out.print("Please input start Second: ");
        S = Integer.parseInt(sc.nextLine());
        System.out.print("Please input end hours: ");
        H1 = Integer.parseInt(sc.nextLine());
        System.out.print("Please input end minutes: ");
        M1 = Integer.parseInt(sc.nextLine());
        System.out.print("Please input end second: ");
        S1 = Integer.parseInt(sc.nextLine());
        Start = ((H*3600)+(M*60)+S)/60;
        End = ((H1*3600)+(M1*60)+S1)/60;
        AnsMinute = End -Start;
        AnsSecond = ((H1*3600)+(M1*60)+S1)-((H*3600)+(M*60)+S);
        H0 = (AnsSecond/3600);
        M0 = (AnsSecond % 3600)/60;
        S0 = AnsSecond % 60;
        Money = AnsMinute*0.05;

        System.out.println("Total call duration: "+H0+"h"+":"+M0+"mn"+":"+S0+"s");
        System.out.println("Total cost of this call: "+Money+"$");
    }
}