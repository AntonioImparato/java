package best.of.the.year.java.control;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class Control {
	
	@GetMapping("/home")
	public String homePage(Model model) {
	model.addAttribute("title", "Best of the year");
	return "home";
	
	}
	 private List<Movie> getBestMovies() {
		 List<Movie> movies = new ArrayList<Movie>();
		 movies.add(new Movie(0,"il signore degli anelli"));
		 movies.add(new Movie(1,"The Dark Knight"));
		 movies.add(new Movie(2,"Inception"));
		 return movies;

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
	   
	        model.addAttribute("moviesList", getBestMovies());
	        return "media";
	    }

	    @GetMapping("/songs")
	    public String getSongs(Model model) {
	    	model.addAttribute("title", "list of our best Songs");
	        model.addAttribute("songsList", getBestSongs());
	        return "song";
   
	    }
	    
	    @GetMapping("/movie/{id}")
	    public String getMovie(Model model, @PathVariable ("id") Integer movieId) {
	    	model.addAttribute("title", "the best movie");
	    	String movieTitle = null ;
	    	for (Movie movie : getBestMovies()) {
	    		if(movieId.equals(movie.getId())) {
	    			movieTitle = movie.getTitle();
	    			break;
	    		}
	    	
	    	}
	        model.addAttribute("movies", movieTitle);
	        return "media";
	    }
	    
	    @GetMapping("/song/{id}")
	    public String getSong(Model model, @PathVariable ("id") Integer songId) {
	    	model.addAttribute("title", "the best song");
	    	String songTitle = null ;
	    	for (Song song : getBestSongs()) {
	    		if(songId.equals(song.getId())) {
	    			songTitle = song.getTitle();
	    			break;
	    		}
	    	
	    	}
	        model.addAttribute("movies", songTitle);
	        return "song";
	    }
}
	
