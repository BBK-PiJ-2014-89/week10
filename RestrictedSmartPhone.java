
public class RestrictedSmartPhone extends SmartPhone{
	
	@Override
	/*
	 * Can not change a visibility of a supper class,
	 * overriding is a simple solution 
	 */
	public void playGame(String game) {
		System.out.println("Games Are Restricted");		
	}

}
