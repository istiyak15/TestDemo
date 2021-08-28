package abstraction;

public class Student {
	
	public static void main(String[] args) {
		
		ISwitch sw=new LedBulb();
	sw.switchOn();
	sw.switchOff();
	
	}
}
