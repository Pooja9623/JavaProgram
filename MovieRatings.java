package classObject;

class Movie{
	private String title, studio, rating;
	
	public Movie(String t, String s, String r) {
		title = t;
		studio = s;
		rating = r;
	}
	
	public Movie(String t, String s) {
		title = t;
		studio = s;
		rating = "PG";
	}
	
	public static Movie[] getPG(Movie t1[] ) {
		Movie h2[] = new Movie[50];
		int i=0;
		for(Movie t : t1) {
			if(t.rating.equals("PG")) {                       //t[i].rating.startsWith("PG")
			    h2[i++]= t;
				}
     	} return h2;
	}
		

	
	public String toString() {
		return "\n"+title+"\t"+studio+"\t"+rating;
	}
}
public class MovieRatings {

	public static void main(String[] args) {
		Movie M = new Movie("Casino Royale","Eon Productions");
		System.out.println(M);
		
		
		Movie N[] = {new Movie ("Avengers","Marvel","PG"),
				new Movie ("Drishyam","Yash Productions","PG-13"),
				new Movie ("Avatar","CEntury Fox","R"),
				new Movie ("Sardar","Goldmines","PG"),
				new Movie ("Hero","Fox","G"),
				new Movie ("KGF","Goldmines","X"),
				new Movie ("3 idiots","Vinod Chopra Films","PG"),
				new Movie ("Radhe","Studio","PG-1")};
		
		Movie t[] = Movie.getPG(N);
		
		for(Movie m : t) {
			if(m == null) break;
			System.out.println(m);
		
		}

	}

}
