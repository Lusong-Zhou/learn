
public class EleCar extends Car{
	public EleCar(String brand,String type,String carNum)
	{
		super(brand,type,carNum);
	}

	@Override
	public void addEn() {
		System.out.println("电动车充电");
		
	}
}
