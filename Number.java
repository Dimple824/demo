//问题：在nums数组中找到两个数，这两个数的和等于targer；
//方法：暴力解法，使用两层循环，得到两个数，然后判断两个值是否相等
public class Two {
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
