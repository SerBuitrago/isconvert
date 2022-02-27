package com.isconvert;

import com.isconvert.observer.observer.impl.ObserverSystemBinary;
import com.isconvert.observer.observer.impl.ObserverSystemDecimal;
import com.isconvert.observer.observer.impl.ObserverSystemHexadecimal;
import com.isconvert.observer.observer.impl.ObserverSystemOctal;
import com.isconvert.observer.subject.SubjectSystem;

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
		SubjectSystem<Long> subject = new SubjectSystem<>();
		new ObserverSystemOctal(subject);

		subject.setStatus(1237765L);
	}
}
