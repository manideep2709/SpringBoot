package co.mani.spring.boot.springbootJPA;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import co.mani.spring.boot.springbootJPA.entity.Product;
import co.mani.spring.boot.springbootJPA.repository.Productrepository;

@SpringBootTest
class SpringbootJpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void create() {

		Productrepository repo = context.getBean(Productrepository.class);

		Product product = new Product();

		product.setId(1L);
		product.setName("mani");
		product.setDescription("Good");
		product.setPrice(25000d);

		repo.save(product);

		Optional<Product> result = repo.findById(1L);
		
		System.out.println(result);

	}

}
