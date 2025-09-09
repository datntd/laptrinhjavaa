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
public class bai9_swich {
    public static void main(String[] args) {
        System.out.println("chuong trinh so ngay trong hang");
        Scanner scanner = new Scanner(System.in);
// nhap thang va nam
        System.out.print("nhap thang (1-12): ");
        double thang = scanner.nextInt();
        System.out.println("nhap nam");
        double nam = scanner.nextInt();
         int soNgay = 0;
      System.out.println("Số ngày trong tháng " + thang + " năm " + nam + " là: " + soNgay);
    }
}
