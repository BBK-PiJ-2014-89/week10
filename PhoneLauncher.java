
public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		SmartPhone sp=new RestrictedSmartPhone();
		sp.call("123");
		sp.playGame("Tetris");
		sp.call("00123");
		System.out.println(sp.getBrand());
	}
}
