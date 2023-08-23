package com.edem.Etonote;

import com.edem.Etonote.Entities.Status;
import com.edem.Etonote.Entities.Todo;˚
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EtonoteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EtonoteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Todo first = new Todo(89L, Status.COMPLETE, 2L,"Have","Go to bed");


	}
}
