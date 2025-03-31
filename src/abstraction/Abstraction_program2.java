package abstraction;

abstract class HemrajApp
{
	void Gallary()
	{
		System.out.println("Hemraj Created Gallary Features...");
	}
	
	abstract void video();
	abstract void audio();
	abstract void callLog();	
}

abstract class KrushnaApp extends HemrajApp
{
	void audio()
	{
		System.out.println("Krushna Created Audio Features...");
	}
	void video()
	{
		System.out.println("Krushna Created Video Features...");
	}
}

class Sachin extends KrushnaApp
{
	void callLog()
	{
		System.out.println("Sachin Created CallLog Features...");
	}
}

public class Abstraction_program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sachin a1 = new Sachin();
		a1.audio();
		a1.Gallary();
		a1.video();
		a1.callLog();
	}

}
