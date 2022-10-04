package week1.day1;

public class Mobile {
	public void makeCall(String mobileModel,float mobileWeight){
		System.out.println("my mobile model"+mobileModel);
		System.out.println("my mobile weight"+mobileWeight);
	}
	public void sendMsg(boolean fullCharged,int mobileCost) {
		 fullCharged=true;
		System.out.println("my mobile cost"+mobileCost);
		System.out.println("my mobile is fully charged"+fullCharged);
	}

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.makeCall("pocox3",3.45f);
		m.sendMsg(false,15000);


	}

}
