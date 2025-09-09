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
public class bai7_hinhchunhat {
    public static void main(String[] args) {
        System.out.println("chuong trinh hinh chu nhat");
        Scanner scanner = new Scanner(System.in);
        System.out.println("chieu dai ");
        double cd = scanner.nextInt();
        System.out.print("chieu rong: ");
       double chieuRong = scanner.nextInt();
        double chieuDai = 0;
       double dienTich = chieuDai * chieuRong;
       double chuVi = 2 * (chieuDai + chieuRong);
    

       System.out.println("chu vi hinh chu nhat");
        System.out.println("dien tich hinh chu nhat " + dienTich);
       
 

                
    }
}
