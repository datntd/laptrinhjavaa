/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai14_tinhdiemtrungbinh {
    public static void main(String[] args) {
        int diem ;
        
        int somonhoc= 0;
        double tongdiem=0;
         Scanner scanner = new Scanner(System.in);
         while(true){
        System.out.println("tinh diem trung binh");
        diem = scanner.nextInt();
        if (diem == -1){
         break;
        }
        if(diem <=0|| diem>=10){
            System.out.println("nhap diem 0 den 10");
            continue;
        }
        somonhoc++;
        tongdiem +=diem;
        }
           double diemtrungbinh = tongdiem/somonhoc ;
           System.out.printf("ban da hoc %d mpoon hoc, diem trung binh la: %f\n", somonhoc,diemtrungbinh);
        
    }
}
  

