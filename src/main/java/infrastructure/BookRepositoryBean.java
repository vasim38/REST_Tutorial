package infrastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.ejb.EJB;

import domain.Book;

public class BookRepositoryBean implements BookRepository {

	@EJB
	private AuthorRepository authorRepository;
	private static final String IMAGE_LOCATION ="/images/covers";
	private final Map<String, Book> books = new HashMap<String, Book>();
	
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		if(book.getImageFileName().length() == 0) {
			book.setImageFileName("no_image.png");
		}
		authorRepository.saveAuthors(book.getAuthors());
		books.put(book.getId(), book);
		
		return book;
	}

	public Optional<Book> deleteBook(String id) {
		// TODO Auto-generated method stub
		
		return Optional.of(books.remove(id));
	}

	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<>(books.values());
	}

	public Optional<Book> getByISBN(String isbn) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(books.get(isbn));
	}

}
