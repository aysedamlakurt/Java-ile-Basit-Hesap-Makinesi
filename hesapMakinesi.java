package hesapMakinesi;

import java.util.Scanner;
public class hesapMakinesi {
	public static void menu() {
		System.out.println("HESAP MAKİNESİNE HOŞGELDİNİZ!!!!!");
		System.out.println("Aşağıdan işlem seçiniz: ");
		System.out.println("1. TOPLAMA");
		System.out.println("2. ÇIKARMA");
		System.out.println("3. ÇARPMA");
		System.out.println("4. BÖLME");
	}
	public static void hesaplama() {
		
		Scanner input = new Scanner(System.in);
		int giris, sonuc=0,x,y ;
		giris= input.nextInt();
		if(giris==1){
			System.out.println("Toplanacak iki sayıyı giriniz: ");
			x= input.nextInt();
			y= input.nextInt();
			sonuc=x+y;
			System.out.println("Sonuç: "+ sonuc); }
			
		else if(giris==2){
			System.out.println("Çıkarılacak iki sayıyı giriniz: ");
			x= input.nextInt();
			y= input.nextInt();
			sonuc=x-y;
			System.out.println("Sonuç: "+ sonuc);
			
		}
		else if(giris==3){
			System.out.println("Çarpılacak iki sayıyı giriniz: ");
			x= input.nextInt();
			y= input.nextInt();
			sonuc= x*y;
			System.out.println("Sonuç: "+ sonuc);
		}
		else if(giris==3){
			System.out.println("Çarpılacak iki sayıyı giriniz: ");
			x= input.nextInt();
			y= input.nextInt();
			sonuc= x*y;
			System.out.println("Sonuç: "+ sonuc);
		}
		else if(giris==4){
			System.out.println("Bölünecek iki sayıyı giriniz: ");
			x= input.nextInt();
			y= input.nextInt();
			sonuc= x/y;
			System.out.println("Sonuç: "+ sonuc);
		}
	}
	
		public static void main(String[]args) {
		
		menu();
		hesaplama();
	
	}

}
