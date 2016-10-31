
import java.util.Scanner;
import org.sahilpaudel.*;
import java.io.*;
/**
 *
 * @author Sahil Paudel
 */
public class Tester {
    
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        
		
        Scanner in = new Scanner(System.in);
        String movieName = in.nextLine();
            
        URLParser urlparser;
		
			urlparser = new URLParser(movieName);
			
			Movie m = urlparser.getMovieData();
			
			String name = m.getMovieName();
			String rating = m.getImdbRating();
			String year = m.getYear();
			
			System.out.println("Movie Name: "+name);
			System.out.println("IMDB Rating: "+rating);
			System.out.println("Released Year: "+year);
			
		}
    }
    
}
