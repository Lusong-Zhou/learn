
public class OilGasEleCar extends OilEleCar implements GasIf
{
	public OilGasEleCar(String brand,String type,String carNum)
	{
		super(brand,type,carNum);
	}
	

	@Override
	public void addGas() {
		System.out.println("Æû³µ¼ÓÆø");
		
	}
	
	
}
