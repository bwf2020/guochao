package homework;

import java.util.Scanner;

/**
 *���й������
 * @author ����
 *
 */
public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//��ӡ�����˵�
		System.out.print("��������Ҫ�������Ʒ:");
		System.out.print("1.����");
		System.out.println("2.����");
		String shop=sc.nextLine();
		//�������1����1;����2����2;
		switch (shop) {
		case "1":
			System.out.println("���ӵ���5.8Ԫ,���������򼸼�?");
			Scanner shops =new Scanner(System.in);
			String shop1=shops.nextLine();
			float shop2 = Float.parseFloat(shop1);
			System.out.println("�۸�"+shop2*5.8d);
			System.out.println("����Ҫ����ô�밴3");
			Scanner shopss =new Scanner(System.in);
			String shop3=shopss.nextLine();
			System.out.println("���׵���8.9Ԫ,������Ҫ����?");
			Scanner shopsss =new Scanner(System.in);
			String shop4=shopsss.nextLine();
			float shop5 = Float.parseFloat(shop4);
			System.out.println("�۸�"+shop5*8.9);
			
			System.out.println("�����и���8��");
			System.out.println("�ϼ�:"+(shop2*5.8+shop5*8.9)*0.8);
			System.out.println("����");
			Scanner shopssss =new Scanner(System.in);
			String shop6=shopsss.nextLine();
			float shop7=Float.parseFloat(shop6);
			System.out.print("����:");
			System.out.println(shop7-(shop2*5.8+shop5*8.9)*0.8);
			System.out.println("��ӭ�´ι���");
			break;
		case "2":
			System.out.println("���׵���8.9Ԫ,���������򼸼�?");
			Scanner s1 =new Scanner(System.in);
			String sh1=s1.nextLine();
			float sh2 = Float.parseFloat(sh1);
			System.out.println("�۸�"+sh2*8.9);
			System.out.println("����Ҫ�����밴3");
			Scanner ss1 =new Scanner(System.in);
			String sh3=ss1.nextLine();
			System.out.println("���ӵ���5.8Ԫ,������Ҫ����?");
			Scanner sss1 =new Scanner(System.in);
			String sh4=sss1.nextLine();
			float sh5 = Float.parseFloat(sh4);
			System.out.println("�۸�"+sh5*5.8);
			
			System.out.println("�����и���8��");
			System.out.println("�ϼ�:"+(sh2*8.9+sh5*5.8)*0.8);
			System.out.println("����");
			Scanner ssss1 =new Scanner(System.in);
			String sh6=ssss1.nextLine();
			float sh7=Float.parseFloat(sh6);
			System.out.print("����:");
			System.out.println(sh7-(sh2*8.9+sh5*5.8)*0.8);
			System.out.println("��ӭ�´ι���");
			break;
		
			
		default:
			System.out.println("��������,����������!");
			break;
		}
		
	}

}
