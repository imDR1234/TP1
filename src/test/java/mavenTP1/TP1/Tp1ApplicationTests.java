package mavenTP1.TP1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Tp1ApplicationTests {




	@Test
	void contextLoads() {

	}

	@Test
	void testMaxVisiteur(){
		Zoo zoo = new Zoo(1,10);
		for (int i=0;i< 20;i++){
			try{
				zoo.nouveauVisiteur();
			}catch(LimiteVisiteurException e){
				assertTrue("nombre de visiteurs arrivé au limites ".equals(e.getMessage()));
				throw new RuntimeException(e);

			}
		}
	}
	@Test
	void testAnimalBonSecteur(){
		Chien ch1 = new Chien("woof",TypeAnimal.valueOf("Chien"));

	}
}
