package in.nihar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAppApplication.class, args);
		System.out.println("Welcome to spring world");
	}

	public String void(){
		String msg="Nihar";
		return msg;
	}

}
