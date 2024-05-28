package Interface;

public class IndianTraffice implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a= new IndianTraffice();
		a.redStop();
		a.FlashYellow();
		a.greenGo();
		
		IndianTraffice it= new IndianTraffice();
		ContinentalTraffic ct=new IndianTraffice();
		it.walkonsymbol();
		ct.Trainsymbol();

		
	}
	
	@Override
	public void greenGo() {
		
		System.out.println(" Green go implementation");
	}

	@Override
	public void redStop() {
		
		System.out.println(" redstop implementation");
	}

	@Override
	public void FlashYellow() {
		
		System.out.println(" flash yellow implementation");
		
	}
	public void walkonsymbol()
	{
	System.out.println("walking");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		
	}

	
	

}
