package day1offocehours;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		// Kullan�cadan 5 basamakl� tam say� alal�m ve bu say�n�n ba�tan 2 ve sonda 2 rakamlar�n
				// basamak de�eri ile toplama sonucunu yazd�ral�m.  12345 => 12045
				
				Scanner sc=new Scanner(System.in);
				
				System.out.println("L�tfen 5 basamakl� tam say� giriniz.");
				
				int num = sc.nextInt();
				
				int ilkIki=num/1000;
				System.out.println(ilkIki);
				ilkIki=ilkIki*1000;
				
				
				int sonIki= num%100;
				System.out.println(sonIki);
				
				int sum = ilkIki + sonIki;
				
				System.out.println("Toplam:" +sum);
	}

}
