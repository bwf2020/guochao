package homework;

import java.util.Scanner;

/**
 * ���ַ���������..
 * @author ����
 *
 */
public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ֵ!");
		//��������
		String num=sc.nextLine();
		//��������
		int[] array= {1,2,3,4,5,6,7,8,9};
		//System.out.println(array);
		/**
		 * ������м�ֵ,����������м�ֵ5�Ƚ�,���С���м�ֵ���������,��������м�ֵ�����ұ���;
		 * 
		 */
		
		int num2=Integer.parseInt(num);

			if(num2==5) {
				System.out.println("����������м���");
				
			} 
			if(num2>5) {
				int[] array2= {6,7,8,9};
				for (int j = 0; j < array2.length; j++) {
					if(num2==array2[j]) {
					System.out.println("���м�����"+j+"λ");
					
				
					}
				
			}
		}
			if(num2<5) {
				int[] array3= {1,2,3,4};
				for (int i = 0; i < array3.length; i++) {
					if(num2==array[i]) {
						
						System.out.println("�������"+i+"λ");
					}
				}
			}
		
	}

}
