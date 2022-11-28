package Com.SpringInjectingConstructorInjectionDay4Yt;

public class Certificate {

	private String cname;
	private int cId;

	public Certificate(String cname, int cId) {
		super();
		this.cname = cname;
		this.cId = cId;
	}

	@Override
	public String toString() {
		return "Certificate [cname=" + cname + ", cId=" + cId + "]";
	}

}
