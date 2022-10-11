package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Student s = new Student();
       s.name = "Nam";
       s.age = 18;

       Student s2 = new Student();
       s2.age= 22;
       s2.name = "Quoc";

       Scanner sr= new Scanner(System.in);
       Tamgiac t1 = new Tamgiac();
       System.out.println("a:");
       t1.setCanh_a(sr.nextInt());
       System.out.println("b:");
       t1.setCanh_b(sr.nextInt());
       System.out.println("c:");
       t1.setCanh_c(sr.nextInt());
       System.out.println("findParameter:"+ t1.TinhChuVi());
       System.out.println("findArea:"+ t1.TinhDienTich());


       s.showInfo();
       s2.showInfo();

    }
}
