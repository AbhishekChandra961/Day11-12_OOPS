package StockAccountManagement;

public interface IPortfolio {
	
	double ValueOfEachStock(double noOfShares, double sharePrice);
	double ValueOfTotalStock(double vES);
}