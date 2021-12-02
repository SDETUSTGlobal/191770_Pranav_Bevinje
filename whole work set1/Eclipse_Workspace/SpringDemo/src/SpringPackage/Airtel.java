package SpringPackage;

public class Airtel implements Sim
{


	@Override
	public void calling() 
	{
		System.out.println("Airtel Call");
	}

	@Override
	public void data()
	{
		System.out.println("Airtel Data");
	}

}
