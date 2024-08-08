package in.SBMS.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.SBMS.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	@Query(value="call getProducts()",nativeQuery = true)
	public List<Product> getAllProducts();

}
