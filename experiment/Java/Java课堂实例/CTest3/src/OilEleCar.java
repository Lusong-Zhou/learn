
public class OilEleCar extends Auto implements OilIf,EleIf{
	
	public OilEleCar(String brand,String type,String carNum)
	{
		super(brand,type,carNum);
	}

	@Override
	public void addOil() {
		System.out.println("��������");
		
	}

	@Override
	public void addEle() {
		System.out.println("�������");
		
	}
}
