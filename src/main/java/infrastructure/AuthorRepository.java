package infrastructure;

import java.util.List;
import java.util.Optional;

import domain.Author;

public interface AuthorRepository {
	
	Author saveAuthor(final Author author);
	Author deleteAuthor(final String id);
	List<Author> getAll();
	Optional<Author> getById(String id);
	List<Author> saveAuthors(List<Author> authors);

}
