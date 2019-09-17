
public abstract class Car {
	private String brand;
	private String type;
	private String carNum;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getCarNum() {
		return carNum;
	}
	
	public Car(String brand,String type,String carNum)
	{
		this.brand=brand;
		this.type=type;
		this.carNum=carNum;
	}
	
	public abstract void addEn();//增加能源的抽象方法
	
	
}
