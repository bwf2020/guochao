package homework;

import java.util.Scanner;

/**
 *超市购物结算
 * @author 郭超
 *
 */
public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//打印操作菜单
		System.out.print("请输入需要购买的商品:");
		System.out.print("1.袜子");
		System.out.println("2.手套");
		String shop=sc.nextLine();
		//如果输入1则走1;输入2则走2;
		switch (shop) {
		case "1":
			System.out.println("袜子单价5.8元,请问您购买几件?");
			Scanner shops =new Scanner(System.in);
			String shop1=shops.nextLine();
			float shop2 = Float.parseFloat(shop1);
			System.out.println("价格"+shop2*5.8d);
			System.out.println("如需要手套么请按3");
			Scanner shopss =new Scanner(System.in);
			String shop3=shopss.nextLine();
			System.out.println("手套单价8.9元,请问需要几个?");
			Scanner shopsss =new Scanner(System.in);
			String shop4=shopsss.nextLine();
			float shop5 = Float.parseFloat(shop4);
			System.out.println("价格"+shop5*8.9);
			
			System.out.println("本超市搞活动打8折");
			System.out.println("合计:"+(shop2*5.8+shop5*8.9)*0.8);
			System.out.println("付款");
			Scanner shopssss =new Scanner(System.in);
			String shop6=shopsss.nextLine();
			float shop7=Float.parseFloat(shop6);
			System.out.print("找零:");
			System.out.println(shop7-(shop2*5.8+shop5*8.9)*0.8);
			System.out.println("欢迎下次光临");
			break;
		case "2":
			System.out.println("手套单价8.9元,请问您购买几件?");
			Scanner s1 =new Scanner(System.in);
			String sh1=s1.nextLine();
			float sh2 = Float.parseFloat(sh1);
			System.out.println("价格"+sh2*8.9);
			System.out.println("如需要袜子请按3");
			Scanner ss1 =new Scanner(System.in);
			String sh3=ss1.nextLine();
			System.out.println("袜子单价5.8元,请问需要几个?");
			Scanner sss1 =new Scanner(System.in);
			String sh4=sss1.nextLine();
			float sh5 = Float.parseFloat(sh4);
			System.out.println("价格"+sh5*5.8);
			
			System.out.println("本超市搞活动打8折");
			System.out.println("合计:"+(sh2*8.9+sh5*5.8)*0.8);
			System.out.println("付款");
			Scanner ssss1 =new Scanner(System.in);
			String sh6=ssss1.nextLine();
			float sh7=Float.parseFloat(sh6);
			System.out.print("找零:");
			System.out.println(sh7-(sh2*8.9+sh5*5.8)*0.8);
			System.out.println("欢迎下次光临");
			break;
		
			
		default:
			System.out.println("输入有误,请重新输入!");
			break;
		}
		
	}

}
