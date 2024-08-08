package in.SBMS.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.SBMS.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{
	

}
