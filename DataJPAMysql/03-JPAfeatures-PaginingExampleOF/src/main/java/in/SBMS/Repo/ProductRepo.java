package in.SBMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.SBMS.entities.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
