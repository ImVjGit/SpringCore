package Com.SpringStereotypeAnnotationsCollectionsWithAtValueDay14Yt;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	
	@Value("Vijay")
	private String name;
	
	@Value("Pune")
	private String city;
	
	@Value("#{sub}")
	private List<String> Subject;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getSubject() {
		return Subject;
	}

	public void setSubject(List<String> subject) {
		Subject = subject;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", Subject=" + Subject + "]";
	}

}
