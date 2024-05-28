package AbstractClass;

public class ChildAirCraft extends ParentAirCraft {

	public static void main(String[] args) {
		
		ChildAirCraft c = new ChildAirCraft();
		c.saftyGuidlines();
		c.engine();
		c.color();
		
	}

	@Override
	public void color() {
		System.out.println("color red");
	}
	
	}


