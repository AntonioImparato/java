package best.of.the.year.java.control;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class Control {
	
	@GetMapping("/home")
	public String homePage(Model model) {
	model.addAttribute("name", "antonio");
	return "home";
	
	}
	 private List<Movie> getBestMovies() {
	        return List.of(
	            new Movie(1, "Inception"),
	            new Movie(2, "The Dark Knight"),
	            new Movie(3, "Interstellar")
	        );
	    }

	    private List<Song> getBestSongs() {
	        return List.of(
	            new Song(1, "Bohemian Rhapsody"),
	            new Song(2, "Stairway to Heaven"),
	            new Song(3, "Hotel California")
	        );
	    }

	    @GetMapping("/movies")
	    public String getMovies(Model model) {
	        List<Movie> movies = getBestMovies();
	        String movieTitles = movies.stream()
	                                    .map(Movie::getTitle)
	                                    .collect(Collectors.joining(", "));
	        model.addAttribute("movies", movieTitles);
	        return "movie";
	    }

	    @GetMapping("/songs")
	    public String getSongs(Model model) {
	        List<Song> songs = getBestSongs();
	        String songTitles = songs.stream()
	                                 .map(Song::getTitle)
	                                 .collect(Collectors.joining(", "));
	        model.addAttribute("songs", songTitles);
	        return "song";
   
	    }
}
	
