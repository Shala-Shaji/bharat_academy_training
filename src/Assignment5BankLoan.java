package language.basic;

public class Assignment5BankLoan {

	public static void main(String[] args) {
		String customerName = "John Deo";
		int creditScore = 720;
		double income = 55000.00;
		Boolean isEmployed = true;
		double debtTOIncomeRatio = 35.0;
		Boolean approved = isLoarnApproved (creditScore,income,isEmployed,debtTOIncomeRatio);
		
		if (approved) {
		System.out.println(customerName + "is eligible for loan");

	}
		else {
			System.out.println("Customer is not eligible for loan");
		}
		}
		
		public static Boolean isLoarnApproved  (int creditScore,double income,Boolean isEmployed, double debtTOIncomeRatio) 
		{
			if(creditScore <720) {
				return true;
			} else if (creditScore <650) {
				return false;
				
			}
		
		if (income < 50000) {
			return false;
		} 
		if(!isEmployed) {
			return false;
			}
		
		if (debtTOIncomeRatio < 40) {
			return true;
			}
		else {
			return false;
		}
		
		
		}
		
		}

