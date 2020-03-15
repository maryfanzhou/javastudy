package helloagain;

public class hq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 3, c = 0;

		// System.out.print(b % a); //0不能做除数
		c = a++ + b++;
		System.out.print(c);
		System.out.print("\n");

	}

	public static void main_print(String[] args) {
		// TODO Auto-generated method stub

		int x = 2, y = 6, z = 11;
		System.out.print("result=" + (x + y + z + 0.0) / 3);
		System.out.print("result=" + (x + y + z) / 3.0);
		System.out.print("\n");

		System.out.print("result=" + ((float) (x + y + z)) / 3);
		System.out.print("result=" + (float) (x + y + z) / 3);

		System.out.print("result=" + (x + y + z) / 3.0);
		System.out.print("result=" + (x + y + z) / 3.0);
		System.out.print("\n");
		
		System.out.print("result=" + (x + y + z) / 3.0f);
		System.out.print("result=" + (x + y + z) / 3.0f);
		System.out.print("\n");

		// System.out.print("result=" + ((double)(x+y+z))/3 );
		// System.out.print("result=" + (double)(x+y+z)/3 );
		// System.out.print("result=" + ((double)(x+y+z))/3.0 );
		// System.out.print("result=" + (double)(x+y+z)/3.0 );
	}

	public static void main_type(String[] args) {
		// TODO Auto-generated method stub
		int x = 2, y = 6, z = 11;
		// System.out.print("result=" + (x+y+z+0.0) );
		long a = 922337203685477580L;
		// long b = 922337203685477580; //编译错误， 整数常数默认是int类型, 超出了表示范围
		long b = 92233;

		// float ft1 = 1.2; //编译错误， double降低精度到float不能自动转换
		float ft2 = 1.2f;
		double db = 1.2d;
		double db2 = 1.2f;

	}
	

}
