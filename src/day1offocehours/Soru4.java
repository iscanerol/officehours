package day1offocehours;

public class Soru4 {

	public static void main(String[] args) {

		// 1 den 100 e kadar olan say�lar�n 3'e, 5'e ve 15'e b�l�nen say�lar� yazd�ral�m.
		
				System.out.print("3 e b�l�nen say�lar: ");
				for (int i =1; i<100; i++) {
					if(i%3==0) {
						System.out.print(i + " " );
					}
				}
				System.out.println();
				System.out.print("5 e b�l�nen say�lar: ");
				
				for (int i = 0; i <= 100; i++) {
					if(i%5==0) {
						System.out.print(i + " ");
					}
					
				}
				System.out.println();
				System.out.print("15 e b�l�nen say�lar: ");
				for (int i = 0; i <= 100; i++) {
					
					if (i%15==0 )
						System.out.print(i + " ");
					
				}
	
	}

}
