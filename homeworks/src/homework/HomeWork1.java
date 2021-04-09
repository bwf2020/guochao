package homework;

import java.util.Scanner;

/**
 * 二分法查找数据..
 * @author 郭超
 *
 */
public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数值!");
		//接受输入
		String num=sc.nextLine();
		//定义数组
		int[] array= {1,2,3,4,5,6,7,8,9};
		//System.out.println(array);
		/**
		 * 定义个中间值,输入的数与中间值5比较,如果小于中间值则在左边找,如果大于中间值则在右边找;
		 * 
		 */
		
		int num2=Integer.parseInt(num);

			if(num2==5) {
				System.out.println("您输入的是中间数");
				
			} 
			if(num2>5) {
				int[] array2= {6,7,8,9};
				for (int j = 0; j < array2.length; j++) {
					if(num2==array2[j]) {
					System.out.println("在中间数后"+j+"位");
					
				
					}
				
			}
		}
			if(num2<5) {
				int[] array3= {1,2,3,4};
				for (int i = 0; i < array3.length; i++) {
					if(num2==array[i]) {
						
						System.out.println("在数组第"+i+"位");
					}
				}
			}
		
	}

}
