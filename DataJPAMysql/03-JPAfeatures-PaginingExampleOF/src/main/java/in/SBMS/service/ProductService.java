package in.SBMS.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.SBMS.Repo.ProductRepo;
import in.SBMS.entities.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepo prodRepo;
	
	public void queryByexample() {
		
		Product entity=new Product();
		entity.setProductName("Mouse");
		
		List<Product> productList = prodRepo.findAll(Example.of(entity));
		
		productList.forEach(p ->{
			
			System.out.println(p);
		});
		
	}
	public void paginationOf() {
		
		int pageSize=3;
		int pageNum=1;//Initail page number starts from 0.
		
		PageRequest of =PageRequest.of(pageNum, pageSize);
		
		Page<Product> page= prodRepo.findAll(of);
		
		int totalPages=page.getTotalPages();
		
		System.out.println("Total pages required ::  "+totalPages);
		
		List<Product> product=page.getContent();
		
		product.forEach(p ->{
			System.out.println(p);
		});
		
		
		
	}

	public void getProducts() {
		
		System.out.println("Product By sorted Order.....!");
			
		List<Product> records = prodRepo.findAll(Sort.by("productPrice","productName"));
		
		records.forEach(p ->{
			
			System.out.println(p);
		});
		
		
	}

	public void saveProduct() {

		Product p1 = new Product("Mouse", 500.00);
		Product p2 = new Product("Keybord", 1000.00);
		Product p3 = new Product("HDD", 2500.00);
		Product p4 = new Product("Monitor", 10000.00);
		Product p5 = new Product("SSD", 4000.00);
		Product p6 = new Product("Pc table", 8000.00);
		Product p7 = new Product("AC", 25000.00);

		prodRepo.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));
		
		System.out.println("Product saved......!");

	}
}
