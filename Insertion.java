package 算法;

//自我理解：通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
//算法描述：从第一个元素开始，该元素可以认为已经被排序;
//取出下一个元素，在已经排序的元素序列中从后向前扫描;
//如果该元素（已排序）大于新元素，将该元素移到下一位置;
//重复步骤3，直到找到已排序的元素小于或者等于新元素的位置;
//将新元素插入到该位置后;
//重复步骤2〜5。
public class Insertion {
	public static void main(String[] args) {
		int[] array = {1,3,2,5,4,9,8,6,7};
		int current,prelndex;
		for(int i=0;i<array.length;i++) {
			prelndex = i-1;
			current = array[i];
			while(prelndex>=0&&array[prelndex]>current) {
				array[prelndex+1]=array[prelndex];
				prelndex--;
			}
			array[prelndex+1]=current;			
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
}

