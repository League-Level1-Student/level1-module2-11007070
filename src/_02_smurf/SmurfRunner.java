package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf HandySmurf = new Smurf("Handy");
		HandySmurf.eat();
		System.out.println(HandySmurf.getName());
		
		Smurf PapaSmurf = new Smurf("Papa");
		System.out.println(PapaSmurf.getName());
		PapaSmurf.getHatColor();
		PapaSmurf.isGirlOrBoy();
		
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println(Smurfette.getName());
		Smurfette.getHatColor();
		Smurfette.isGirlOrBoy();
	}
}
