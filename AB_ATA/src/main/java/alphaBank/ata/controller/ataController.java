package alphaBank.ata.controller;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ataController {
	
	@GetMapping("/alphaBank/ataAprovement")
	public Boolean ataAprovement() {
		return ThreadLocalRandom.current().nextBoolean();
	}

}
