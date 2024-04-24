package ma.enset.hopitaltp3;

import ma.enset.hopitaltp3.entities.Patient;
import ma.enset.hopitaltp3.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalTp3Application implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {

		SpringApplication.run(HopitalTp3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		patientRepository.save(new Patient(null,"Mohamed",new Date(),false,134));
		patientRepository.save(new Patient(null,"Hanane",new Date(),false,155));
		patientRepository.save(new Patient(null,"Imane",new Date(),true,374));


	}
}
