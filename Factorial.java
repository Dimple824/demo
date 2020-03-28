
import java.util.Scanner;
//求一个数的阶乘后面有几个o
//例如 5！；1*2*3*4=120；有一个0，输出1；
//解题思路：后面有几个0取决于该数阶乘中有几对2*5或者他们的倍数，
//每当有一个5或者5的倍数出现，就肯定会有一个2或者2的倍数出现，
//所以只需要找到该数阶乘中有几个5就可得知该数阶乘有几个0
public class Factorial {
	public static void main(String[] args) {
		int nums;//保存数字
		int a=0;//保存0的个数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字");
		nums = input.nextInt();
		while(nums>0) {
			nums = nums/5;
			a+=nums;
		}
		System.out.println(a);
	}
}
