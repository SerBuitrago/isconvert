package com.isconvert;

import com.isconvert.start.observer.impl.ObserverSystemBinary;
import com.isconvert.start.observer.impl.ObserverSystemHexadecimal;
import com.isconvert.start.subject.SubjectSystem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SubjectSystem<String> subjectBinary = new SubjectSystem<>();
		new ObserverSystemHexadecimal(subjectBinary);

		subjectBinary.setStatus("100");
	}
}
