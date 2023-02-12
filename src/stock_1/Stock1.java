package stock_1;

public class Stock1 {

	 	private String stockNames;
	    private int numOfShare;
	    private double sharePrice;
	    private double totalSharePrice;

	    public String getStockNames() {
	        return stockNames;
	    }

		public int getNumOfShare() {
			return numOfShare;
		}

		public void setNumOfShare(int numOfShare) {
			this.numOfShare = numOfShare;
		}

		public double getSharePrice() {
			return sharePrice;
		}

		public void setSharePrice(double sharePrice) {
			this.sharePrice = sharePrice;
		}

		public double getTotalSharePrice() {
			return totalSharePrice;
		}

		public void setTotalSharePrice(double totalSharePrice) {
			this.totalSharePrice = totalSharePrice;
		}

		public void setStockNames(String stockNames) {
			this.stockNames = stockNames;
		}
	    
}
