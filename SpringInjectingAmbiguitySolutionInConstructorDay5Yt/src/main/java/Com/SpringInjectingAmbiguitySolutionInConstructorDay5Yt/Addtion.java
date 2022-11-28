package Com.SpringInjectingAmbiguitySolutionInConstructorDay5Yt;



//in this program its take by default String as 1st priority
//if there is no string constructor so that time its take order by Datatype which on 1st constructor have datatype its take that datatype first


public class Addtion {

	private int a;
	private int b;

	//1st order  
	public Addtion(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("constructor : double,double");
	}

	//2nd 
	public Addtion(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor : int ,int");
	}

	//Always 1st priority
	public Addtion(String a, String  b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constructor : String  ,String ");
	}
	
	public void dosum() {
		System.out.println("sum is : " + (this.a + this.b));
	}
}
