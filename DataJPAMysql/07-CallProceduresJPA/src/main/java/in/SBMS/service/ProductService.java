package in.SBMS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.SBMS.Repo.ProductRepo;
import in.SBMS.entities.Product;

@Service
public class ProductService {

	private  ProductRepo pRepo;
	
	public ProductService(ProductRepo pRepo) {
		this.pRepo=pRepo;
		
	}
	
	public void getProductsData() {
		
		List<Product> allProducts = pRepo.getAllProducts();
		
		allProducts.forEach(p->{
			System.out.println(p);
		});
	}
}
