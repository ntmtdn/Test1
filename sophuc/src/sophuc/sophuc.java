package sophuc;
import java.util.Scanner;
public class sophuc {
	class SoPhuc {

		int pt,pa;// Khai bao thuoc tinh cua so phuc: phan thuc va phan ao.
		public SoPhuc() {}// phuong thuc khoi tao rong.
		public SoPhuc(int a,int b)//phuong thuc khoi tao so phuc
		// co 2 tham so a, b dong vai tro nhu phan thuc va phan ao
		{
			pt=a;
			pa=b;
		}
		public int nhapInt() //phuong thuc nhapSo() dung de nhap vao phan thuc va phan ao cua so phuc
		{
			Scanner so= new Scanner(System.in);
			int x= so.nextInt();
			return x;
		}
		public SoPhuc nhapSP()
		{
			System.out.print("Phan thuc =");
			int a= nhapInt();
			System.out.print("Phan ao =");
			int b= nhapInt();
			SoPhuc A= new SoPhuc(a,b);
			return A;
		}
		public void hthi(SoPhuc A)
		{
			System.out.println(A.pt+" + i*"+A.pa) ;

		}
}
