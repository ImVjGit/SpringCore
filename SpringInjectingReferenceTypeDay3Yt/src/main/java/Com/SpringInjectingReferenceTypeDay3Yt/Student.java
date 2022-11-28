package Com.SpringInjectingReferenceTypeDay3Yt;

public class Student {

	private int studentId;
	private int std;
	private String studentAddress;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, int std, String studentAddress) {
		super();
		this.studentId = studentId;
		this.std = std;
		this.studentAddress = studentAddress;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStd() {
		return std;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ",\nstd=" + std + ",\nstudentAddress=" + studentAddress + "]";
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

}
