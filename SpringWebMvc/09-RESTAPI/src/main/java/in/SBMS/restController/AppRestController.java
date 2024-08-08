package in.SBMS.restController;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.SBMS.binding.Book;
import jakarta.websocket.server.PathParam;

@RestController
public class AppRestController {

	@GetMapping(value = "/book", produces = { "application/json", "application/xml" })

	public ResponseEntity<Book> bookByid(@RequestParam("id") Integer id) {

		Book b = new Book(id, "Java", 250.00);

		return new ResponseEntity<>(b, HttpStatus.OK);
	}

	@GetMapping(value = "/booklist", produces = { "application/json", "application/xml" })
	public ResponseEntity<List<Book>> bookList() {

		Book b = new Book(1, "Java", 250.00);
		Book b1 = new Book(2, "Devops", 450.00);
		Book b2 = new Book(3, "AWS", 650.00);

		List<Book> books = Arrays.asList(b, b1, b2);

		return new ResponseEntity<>(books, HttpStatus.OK);

	}

	@PostMapping(value = "/savebook", consumes = { "application/json", "application/xml" }, produces = "text/plain")
	public ResponseEntity<String> saveBook(@RequestBody Book book) {

		System.out.println(book);

		// TODO : save to db

		return new ResponseEntity<>("Saved Book Data", HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/deletebook/{id}")
	public ResponseEntity<String> deleteBook(@PathParam("id") Integer id){
		
		System.out.println("To delete record by id : "+id);
		
		return new ResponseEntity<>("Record deleted succesfully",HttpStatus.OK);
	}
	
	@PutMapping(value = "/updatebook/{id}",consumes = {"application/json", "application/xml"})
	public ResponseEntity<String> updateByid(@PathParam("id") Integer id,@RequestBody Book book){
		
		System.out.println(book);
		
		return new ResponseEntity<>("Record updated succesfully",HttpStatus.OK);
	}

}
