package tp_note_1;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H,M,S,Ans;
        System.out.println("Program for converting time to second.");
        System.out.print("Please input hours: ");
        H = Integer.parseInt(sc.nextLine());
        System.out.print("Please input minutes: ");
        M = Integer.parseInt(sc.nextLine());
        System.out.print("Please input hours: ");
        S = Integer.parseInt(sc.nextLine());
        Ans = (H*3600)+(M*60)+S;
        System.out.println("Number of seconds = "+H+"x"+"3600"+"+"+M+"x"+"60"+"+"+S+"="+Ans);
    }
}