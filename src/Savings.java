
public class Savings {
		private String type;
		private double amount;
		private int month;
		
		public Savings (String type, double amount, int month) {
			this.amount = amount;
			this.month = month;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}
		
		public String toString() {
			return type+" $" + String.format("%.2f", amount);
		}

	}


