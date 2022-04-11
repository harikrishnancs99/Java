import java.util.*;

class Complex1
{
	int real, img;
	Complex1(int real, int img){
		this.real = real;
		this.img = img;
	}
	void show(){
		System.out.println("Complex number = " + this.real + " + " + this.img + " i ");
	}
	public static Complex1 add(Complex1 n1, Complex1 n2){
		Complex1 res = new Complex1(0,0);
		res.real = n1.real + n2.real;
		res.img = n1.img + n2.img;
		return res;
	}

	public static void main(String args[]){
		Complex1[] c = new Complex1[2];
		Scanner sc = new Scanner(System.in);
		int l_real, l_img;
		
		for(int i = 0; i<2; i++){
			System.out.print("Complex no " + (i+1) + " Real: ");
			l_real = sc.nextInt();
			System.out.print("Complex no " + (i+1) + " Img: ");
			l_img = sc.nextInt();

			c[i] = new Complex1(l_real, l_img);
		}
		
		Complex1 res = add(c[0], c[1]);
		System.out.println("Addition is :");
        	res.show();
	}
}