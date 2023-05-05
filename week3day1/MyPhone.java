package week3day1;

public class MyPhone {

	public static void main(String[] args) {
		
		Android a=new SamsungForAndroid();
		a.takePhoto();
		//a.samsungPay();this method in Samsung is restricted by interface
		a.makeCall();
		
		
		
	}

}
