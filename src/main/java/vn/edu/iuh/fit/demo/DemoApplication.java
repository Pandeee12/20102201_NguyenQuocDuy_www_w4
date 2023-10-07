package vn.edu.iuh.fit.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.iuh.fit.demo.daos.ManufacturerDAO;
import vn.edu.iuh.fit.demo.entities.Manufacturer;

@SpringBootApplication
public class DemoApplication {
	private ManufacturerDAO manufacturerDAO;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	CommandLineRunner test_1(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
//				ManufacturerDAO.insert(new Manufacturer("than thi det"  "nguyenvana@gmail.com"));
//				Manufacturer m = ManufacturerDAO.findByID(0L);
//				System.out.println(m);
				ManufacturerDAO.findAll().forEach(System.out::println);
			}
		};
	}
}
