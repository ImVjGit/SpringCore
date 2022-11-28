package Com.SpringSpELinvokeStaticMethodVariablesAndCreatingObjDay17Yt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Demo {

	@Value("#{12+2}")
	private int x;

	@Value("#{5+3}")
	private int y;
	
	//call static method 
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;

	
	//call static variable 
	@Value("#{T(java.lang.Math).PI}")
	private double a;
	
	
	//call object 
	@Value("#{new java.lang.String('hey i am object')}")
	private String name;
	
	//boolean assgin
	@Value("#{8>3}")
	private boolean isActive;
	
	
	
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	
	

	

}
