import java.util.Scanner;
public class RahmatKun2 {
	public static void main(String[] args){
	
		int jam,menit,detik,totdet;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Jam = ");
		jam = input.nextInt();
		
		System.out.print("Input Menit = ");
		menit = input.nextInt();
		
		System.out.print("Input Detik = ");
		detik = input.nextInt();
		
		totdet = jam*3600+menit*60+detik;
		System.out.println("Total Detik = "+totdet);
	} 
}