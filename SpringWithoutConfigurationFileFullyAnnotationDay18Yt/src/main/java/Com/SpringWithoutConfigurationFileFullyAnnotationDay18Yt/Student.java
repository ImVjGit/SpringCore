package Com.SpringWithoutConfigurationFileFullyAnnotationDay18Yt;

import org.springframework.stereotype.Component;

public class Student {

	private Course cou;

	public Student(Course cou) {
		super();
		this.cou = cou;
	}

	public Course getCou() {
		return cou;
	}

	public void setCou(Course cou) {
		this.cou = cou;
	}

	public void study() {
		this.cou.display();
		System.out.println("studying....");
	}

}
