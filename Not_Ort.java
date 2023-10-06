package Temel_Kavramlar;


import java.util.Scanner;
public class Not_Ort {

	public static void main(String[] args) {
		
		int turkce,mat,fen, sosyal,beden;
		double ort = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Türkçe notunu giriniz: ");
		turkce = scan.nextInt();
		System.out.println("\n Fen Bilgisi notunu giriniz: ");
		fen = scan.nextInt();
		System.out.println("\n Matematik notunu giriniz: ");
		mat = scan.nextInt();
		System.out.println("\n Ssosyal Bilgisi notunu giriniz: ");
		sosyal = scan.nextInt();
		System.out.println("\n Beden Eğitimi notunu giriniz: ");
		beden = scan.nextInt();
		
		ort = (turkce+mat+fen+sosyal+beden)/5;
		if(ort < 50) {
			System.out.println("Sınıfta kaldınız!!! ");
		}
		else {
			System.out.println("Sınıfı geçtiniz!!! ");
		}
		System.out.println("Sınıf ortalamanız: " + ort);

	}

}
