package best.of.the.year.java.control;


import java.util.ArrayList;
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
		 List<Movie> movies = new ArrayList<Movie>();
		 movies.add(new Movie(0,"il signore degli anelli"));
		 movies.add(new Movie(1,"The Dark Knight"));
		 movies.add(new Movie(2,"Inception"));
		 return movies;
//	         List.of(
//	            new Movie(1, "Inception"),
//	            new Movie(2, "The Dark Knight"),
//	            new Movie(3, "Interstellar")
//	        );
	    }

	    private List<Song> getBestSongs() {
	      
	    	 List<Song> songs = new ArrayList<Song>();
	    	 songs.add(new Song(0,"La regola del amico"));
	    	 songs.add(new Song(1,"bellissima"));
	    	 songs.add(new Song(2,"he joe"));
			 return songs;
	    
	        
	    }

	    @GetMapping("/movies")
	    public String getMovies(Model model) {
	    	model.addAttribute("title", "list of our best movies");
	    	
	    	String bestMovies = "" ;
	    	for (Movie movie : getBestMovies()) {
	    		bestMovies += movie.getTitle() + " -- ";
	    	}
	        model.addAttribute("movies", bestMovies);
	        return "movie";
	    }

	    @GetMapping("/songs")
	    public String getSongs(Model model) {
	    	model.addAttribute("title", "list of our best Songs");
	    	
	    	String bestSongs = "" ;
	    	for (Song songs : getBestSongs()) {
	    		bestSongs += songs.getTitle() + " -- ";
	    	}
	        model.addAttribute("movies", bestSongs);
	        return "movie";
   
	    }
}
	
