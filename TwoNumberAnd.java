//���⣺��nums�������ҵ������������������ĺ͵���targer��
//�����������ⷨ��ʹ������ѭ�����õ���������Ȼ���ж�����ֵ�Ƿ����
public class TwoNumberAnd {
	public static void main(String[] args) {
		int[] nums= {1,5,6,3,7,9};
		int target = 8;
		     for(int i=0;i<nums.length;i++){
		         for(int a=i+1;a<nums.length;a++){
		             if(nums[i]+nums[a]==target){
		            	 System.out.println(i);
		              System.out.println(a);
		             }
		         }
		     }
	}
}
