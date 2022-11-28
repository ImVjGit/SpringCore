package Com.SpringWithoutConfigurationFileFullyAnnotationDay18Yt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//when i use componet tag on my  studnt class @ComponentScan(basePackages = "Com.SpringWithoutConfigurationFileFullyAnnotationDay18Yt")
public class JavaConfig {

	@Bean
	public Course getCourse() {
		Course c = new Course();

		return c;
	}

	@Bean
	public Student getStudnet() {
		// creating new object

		Student s = new Student(getCourse());

		return s;
	}

}
