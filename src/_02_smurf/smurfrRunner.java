package _02_smurf;

public class smurfrRunner {

	public static void main(String[]args)
	{
		Smurf Handy = new Smurf("Handy");
		
		Handy.eat();
		System.out.print(Handy.getName());
		
		Smurf Papa = new Smurf("Papa");
		
		System.out.println(" ");
		
		System.out.print(Papa.getName());
		System.out.print(" and my hat color is " + Papa.getHatColor());
		System.out.print(" and I am a "+ Papa.isGirlOrBoy());
		
		Smurf Smurfette = new Smurf("Smurfette");
		
		System.out.println(" ");
		
		System.out.print(Smurfette.getName());
		System.out.print(" and my hat color is " + Smurfette.getHatColor());
		System.out.print(" and I am a "+ Smurfette.isGirlOrBoy());
		
	}
	
	
}
