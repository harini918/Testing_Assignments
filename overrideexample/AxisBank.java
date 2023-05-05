package overrideexample;

public class AxisBank extends BankInfo {
		public void deposit() {
			System.out.println("hi");
		}
	
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		BankInfo ob=new BankInfo();
		ob.deposit();
		obj.deposit();
		obj.saving();
		
	}

}
