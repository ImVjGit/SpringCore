package Com.SpringImplementingBeanLifeCycleUsingInterfacesDay7Yt;

public class Device {

	private double price;

	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Device [price=" + price + "]";
	}

	public void init() {

		System.out.println(" device : inside init method ");
	}

	public void destory() {

		System.out.println("Device :inside Destory method ");
	}

}
