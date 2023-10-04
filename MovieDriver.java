
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie cars = new Movie("cars", "john", 0);
		Movie footloose = new Movie("footloose", "jacob", 1);
		Movie planes = new Movie("planes", "steve", 2);
		Movie trains = new Movie("trains", "mel", 0);
		Movie automoblies = new Movie("automobiles", "tanner", 1);
		Movie dogs = new Movie("dogs", "sam", 2);
		Movie cats = new Movie("cats", "jake", 0);
		Distributor AMC = new Distributor("AMC", "555-8888");
		Distributor CCS = new Distributor("CCS", "555-9999");
		AMC.addMovie(cats);
		AMC.addMovie(dogs);
		AMC.addMovie(automoblies);
		AMC.addMovie(trains);
		AMC.addMovie(planes);
		System.out.print(AMC.addMovie(footloose) + "\n");
		CCS.addMovie(footloose);
		CCS.addMovie(cars);
		System.out.print(CCS.toString());
		System.out.println(AMC.toString());
		
		cars.setName("bars");
		System.out.println(cars.getName() + "\n");
		cars.setDirectorName("test");
		System.out.println(cars.getDirectorName()+ "\n");
		cars.addToEarnings(100);
		System.out.println(cars.getEarnings() + "\n");
		cars.setGenre(0);
		System.out.println(cars.getGenre() + "\n");
		System.out.println(cars.equals(automoblies) + "\n");
		
		AMC.setName("ABC");
		System.out.println(AMC.getName() + "\n");
		AMC.setPhone("888-8888");
		System.out.println(AMC.getPhone() + "\n");
		AMC.getMovie();
		System.out.print(AMC.addMovie("floors", "jmmy", 1, 100.1 ) + "\n");
		System.out.println(AMC.getNumMovies() + "\n");
		System.out.println(AMC.totalEarnings() + "\n");
		AMC.addEarnings("dogs", 10);
		System.out.println(AMC.totalEarnings() + "\n");
		System.out.println(AMC.comedyEarnings() + "\n");
		System.out.println(AMC.getNumGenre(0) + "\n");
		System.out.println(AMC.totalEarnings()+ "\n");
		System.out.println(AMC.equals(CCS) + "\n");
		
		
		
	}

}
