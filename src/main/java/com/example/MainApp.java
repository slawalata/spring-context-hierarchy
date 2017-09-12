package com.example;
import com.example.conf.MainAppConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp{

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(MainAppConf.class);
	}
}
