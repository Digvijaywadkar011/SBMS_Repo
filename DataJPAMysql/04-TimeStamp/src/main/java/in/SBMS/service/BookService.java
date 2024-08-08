package in.SBMS.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.SBMS.Repo.BookRepo;
import in.SBMS.entities.Book;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;
	
	public void updateBook() {
		
		Book b1=bookRepo.findById(1).get();
		
		b1.setBookPrice(500.00);
		
		bookRepo.save(b1);
		
		System.out.println("Book Record Updated......!");
		
	}
	
	public void  saveBooks() {
		
		Book b1=new Book("Java",250.00);
		Book b2=new Book("SpringBoot",300.00);
		Book b3=new Book("AWS",900.00);
		Book b4=new Book("Angular",600.00);
		Book b5=new Book("Devops",2000.00);
		Book b6=new Book("RectJs",600.00);
		
		List<Book> saveAll = bookRepo.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6));
		
		System.out.println("All books Record Saved......!");
		
	}
	
}