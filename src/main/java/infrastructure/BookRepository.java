package infrastructure;

import java.util.List;
import java.util.Optional;

import domain.Book;

public interface BookRepository {
	
	Book saveBook(final Book book);
	Optional<Book> deleteBook(final String id);
	List<Book> getAll();
	Optional<Book> getByISBN(String isbn);

}
