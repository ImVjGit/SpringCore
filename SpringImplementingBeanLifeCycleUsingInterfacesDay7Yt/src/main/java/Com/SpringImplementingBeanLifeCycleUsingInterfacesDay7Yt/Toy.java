package Com.SpringImplementingBeanLifeCycleUsingInterfacesDay7Yt;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Toy implements InitializingBean,DisposableBean{
	private double price;

	public Toy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Toy(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Toy [price=" + price + "]";
	}

	//it work like init method 
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Toy playing init method ");
	}

	public void destroy() throws Exception {
		System.out.println("Toy playing Distroy method  method ");
		
	}

}
