package Assignment2.java;



	public class SalesAnalyzer {
		private double []sales;
		private int[] days;
		
		public SalesAnalyzer(double[] sales) {
			this.sales=sales;
			this.days=new int [sales.length];
			for(int i=0;i<sales.length;i++) {
				days[i]=i+1;
			}
			
		}
		public void addSale(double saleAmount) {
			double[] newSale=new double[sales.length+1];
			int[] newDays=new int [days.length+1];
			for(int i=0;i<sales.length;i++) {
			newSale[i]=sales[i];
			newDays[i]=days[i];
		}
			newSale [newSale.length-1]=saleAmount;
			 sales=newSale;
			 
			 newDays[newDays.length-1]=days.length+1;
			 days=newDays;

	}
		public double calculateTotalSales() {
			double totalSales=0;
			for(double sale:sales) {
				totalSales+= sale;
			}
			return totalSales;
			
		}
		public double calculateAverageDailySales() {
			if(sales.length==0) {
			return 0;         ///////////////////
		}
		double totalSales=calculateTotalSales();
		return totalSales;
		
	}
		
		public int findBestSaleDay() {
			if(sales.length==0) {
				return -1;       //if there is no sales data availabel
			}
			 double maxSale=sales[0];
			 int bestDay=days[0];
			 for(int i=1;i<sales.length;i++) {
				 if(sales[i]>maxSale) {
					 maxSale=sales[i];
					 bestDay=days[i];
					 
				 }
			 }
			return bestDay;
			
		}
		public int findworstSaleDay() {
			if(sales.length==0) {
				return -1;       //if there is no sales data availabel
			}
			 double minSale=sales[0];
			 int worstDay=days[0];
			 for(int i=1;i<sales.length;i++) {
				 if(sales[i]>minSale) {
					 minSale=sales[i];
					 worstDay=days[i];
					 
				 }
			 }
			return worstDay;
		
	}
		public void displaySalesReport() {
			System.out.println("****SalesReport*****");
			System.out.println("Total Sales " + calculateTotalSales());
			System.out.println("Average Daily Sales " + calculateAverageDailySales());
			System.out.println("Best Sales Day " + findBestSaleDay());
			System.out.println("Worst Sales Day " + findworstSaleDay());
		}
		public static void main(String[] args) {
			double[] dailySales= {120,160,100,20,230};
			SalesAnalyzer salesAnalyzer = new SalesAnalyzer(dailySales);
			
			salesAnalyzer.addSale(200);
		
			salesAnalyzer.displaySalesReport();
			
			
			
			}
		}
		




