package StockAccountManagement;

public class StockPortfolio implements IPortfolio {

	
	
	@Override
	public double ValueOfEachStock(double noOfShares, double sharePrice) {
		
		return noOfShares*sharePrice;
	}

	@Override
	public double ValueOfTotalStock(double vES) {
		
		return vES * ValueOfTotalStock(vES);
	}

	
}
