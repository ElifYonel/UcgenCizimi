package ucgen_cizme;
import java.util.Scanner;
public class ornek {
	public static void main(String[] args){
		int kenar_1,kenar_2,kenar_3;
		int cevre,U,alan;
		
		Scanner klavye=new Scanner(System.in);
		System.out.print("�lk kenar uzunlu�unu giriniz: ");
		kenar_1=klavye.nextInt();
		System.out.print("�kinci kenar uzunlu�unu giriniz: ");
		kenar_2=klavye.nextInt();
		System.out.print("���nc� kenar uzunlu�unu giriniz: ");
		kenar_3=klavye.nextInt();
		
		cevre=kenar_1+kenar_2+kenar_3;
		U=cevre/2;
		alan=(int) Math.sqrt(U*((U-kenar_1)*(U-kenar_2)*(U-kenar_3)));
		
		if ((kenar_1+kenar_2>kenar_3) && (kenar_1-kenar_2<kenar_3) || (kenar_1+kenar_3>kenar_2) && (kenar_1-kenar_3<kenar_2) || (kenar_3+kenar_2>kenar_1) && (kenar_3-kenar_2<kenar_1)){
			   if ((kenar_1==kenar_2) && (kenar_2==kenar_3) && (kenar_1==kenar_3)){
			      System.out.println("E�kenar ��gen");
			      System.out.println("��genin �evresi= " + cevre );
			      System.out.println("��genin alan�= " + alan );
			   }
			   else if ((kenar_1!=kenar_2) && (kenar_2!=kenar_3) && (kenar_1!=kenar_3)){
			      System.out.println("�e�itkenar ��gen");
			      System.out.println("��genin �evresi= " + cevre );
			      System.out.println("��genin alan�= " + alan );
			   }
			   else if ((kenar_1==kenar_2) && (kenar_2!=kenar_3) || (kenar_1==kenar_3) && (kenar_2!=kenar_3) || (kenar_2==kenar_3) && (kenar_3!=kenar_1) ){
			      System.out.println("�kizkenar ��gen");
			      System.out.println("��genin �evresi= " + cevre );
			      System.out.println("��genin alan�= " + alan );
			   }
			}
	}
}
