package StockAccountManagement;
import java.util.*;

public class CreateStock {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		IPortfolio stock = new StockPortfolio();
		
		System.out.println("Enter the Size : ");
		int s = sc.nextInt();
		int i;
		do {
			StoreStock obj1 = UserAdd();
			double vES = stock.ValueOfEachStock(obj1.getNoOfShares(), obj1.getSharePrice());
			double vTS = stock.ValueOfTotalStock(vES);
			System.out.println(vES+vTS);
			System.out.println("Enter 1 to Add more Stock details : ");
			i = sc.nextInt();
		}while(i!=1);
	}

	private static StoreStock UserAdd() {
	
		StoreStock obj1 = new StoreStock();
		
		System.out.println("Enter the Name of the Stock : ");
		String name = sc.next();
		obj1.setName(name);
		
		System.out.println("Enter the No of Shocks : ");
		double noOfShares = sc.nextDouble();
		obj1.setNoOfShares(noOfShares);
		
		System.out.println("Enter the Share Price : ");
		double sharePrice = sc.nextDouble();
		obj1.setSharePrice(sharePrice);
		
		return obj1;
		
	}
	
}
