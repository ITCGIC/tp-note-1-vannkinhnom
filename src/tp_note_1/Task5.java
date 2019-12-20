package tp_note_1;

import java.util.Scanner;

class Task5 {
    public static void main(String[] args){
        float Dol,Kh;
        Scanner sc = new Scanner(System.in);
            System.out.println("Program for convet money is Riels to Dollars.");
            System.out.println("Convet rate is: 1 USD = 4000 RIELS");
            System.out.print("Please input money in Riels: ");
            Kh = Integer.parseInt(sc.nextLine());
            Dol = Kh/4000;
            System.out.println(Kh +" RIELS = "+Dol+"USD");
        }
   }
