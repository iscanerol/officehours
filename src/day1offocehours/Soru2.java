package day1offocehours;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		// Kullan�cadan 2 say� alal�m ve bu say�lar�n d�rt i�lem sonucudu ekrana yazd�ral�m.
		
				Scanner sc= new Scanner(System.in);
				
				System.out.println("L�tfen 2 say� giriniz.");
				
				double num1=sc.nextDouble();
				double num2=sc.nextDouble();
				
				double toplama=num1+num2;
				
				System.out.println("toplama: " + toplama);
				
				double cikartma = num1-num2;
				System.out.println("��katma:" + cikartma);
				
				double carpma =num1*num2;
				System.out.println("�arpma: " + carpma);
				
				double bolme=num1/num2;
				
				System.out.println("b�lme: " + bolme);
	}

}
