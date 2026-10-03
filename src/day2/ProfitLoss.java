package day2;

public class ProfitLoss {
	public static void main(String[] args) {
		double  CP = 550;
		double SP = 950;
		double Profit = SP - CP;
		double Loss = CP - SP;
		if(SP>CP) {
			System.out.println("Profit of "+Profit);
		}else if(CP>SP) {
			System.out.println("Loss of "+Loss);
		}else {
			System.out.println("No  Profit No Loss");
		}
	}

}
