
import java.util.Scanner;
//��һ�����Ľ׳˺����м���o
//���� 5����1*2*3*4=120����һ��0�����1��
//����˼·�������м���0ȡ���ڸ����׳����м���2*5�������ǵı�����
//ÿ����һ��5����5�ı������֣��Ϳ϶�����һ��2����2�ı������֣�
//����ֻ��Ҫ�ҵ������׳����м���5�Ϳɵ�֪�����׳��м���0
public class Factorial {
	public static void main(String[] args) {
		int nums;//��������
		int a=0;//����0�ĸ���
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
		nums = input.nextInt();
		while(nums>0) {
			nums = nums/5;
			a+=nums;
		}
		System.out.println(a);
	}
}
