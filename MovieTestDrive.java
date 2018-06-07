public class MovieTestDrive{
	public static void main (String [] args){
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title = "Lost in the cubical space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic";
		three.rating = 127;
		
		System.out.println("Title: " + one.title);
		System.out.println("Genre: " + one.genre);
		System.out.println("Rating: " + one.rating);
		System.out.println("");
		
		System.out.println("Title: " + two.title);
		System.out.println("Genre: " + two.genre);
		System.out.println("Rating: " + two.rating);
		System.out.println("");
		
		System.out.println("Title: " + three.title);
		System.out.println("Genre: " + three.genre);
		System.out.println("Rating: " + three.rating);
		System.out.println("");
		
		
	}

}