/**
 * This is the Distributor class it creates objects that variables of name, phone, arrays of 5 Movie and
 * the number of movies
 * @author samuel vossen
 */
import java.util.Arrays;
public class Distributor {
private String name;
private String phone;
private Movie[] movie = new Movie[5];
private int numMovies;
	/**
	 * this constructor creates a new distributor object with the values passed by the parameters and an array 
	 * of null values 
	 * @param name
	 * @param phone
	 * @postcondition new distributor object has been created.
	 */
	public Distributor(String name, String phone) {
	super();
	this.name = name;
	this.phone = phone;
	Arrays.fill(movie, null);
	this.numMovies = 0;
	}
	/**
	 * getName method retrieved the string store in name
	 * @return
	 * string stored in name
	 */
	public String getName() {
		return name;
	}
	/**
	 * the setName method sets the value stored in name to the string passed by the parameter
	 * @param name
	 * @postcondition
	 * name is set to the value passed by the parameter
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * the getPhone method retrieves the value stored in phone
	 * @return
	 * the value stored in phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * the setPhone method changes the value of phone to the string passed by the parameter
	 * @param phone
	 * @postcondition phone is set to the value passed by the parameter
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * creates a copy of the distributors movie array 
	 * @return
	 * copy of the distributors array
	 */
	public Movie[] getMovie() {
		return Arrays.copyOf(movie, numMovies);
	}
	/**
	 * the addMovie method takes in a movie object and adds it to a distributors movie array
	 * @param newMovie
	 * @return
	 * true if it was able to add movie to array, and false if it can't add to array
	 */
	public boolean addMovie(Movie newMovie) {
		boolean output = false;
		for(int i=0; i<5; i++) {
			if(movie[i] == null) {
				movie[i] = newMovie;
				output = true;
				numMovies = i + 1;
				break;}
			}
		return output;}
	/**
	 * creates a movie object and adds it to a distributors array
	 * @param name
	 * @param directorName
	 * @param genre
	 * @param earings
	 * @return
	 * true if it successfully added the movie to the array, and false if it did not add to the array
	 */
	public boolean addMovie(String name, String directorName, int genre, double earnings) {
		Movie newMovie = new Movie(name,directorName,genre);
		newMovie.addToEarnings(earnings);
		return addMovie(newMovie);
	}
	/**
	 * gets the int value stored in the variable numMovies
	 * @return
	 * the value stored in numMovies
	 */
	public int getNumMovies() {
		return numMovies;
	}
	/**
	 * the totalEarnings method adds together the earnings of all the movies a distributor has
	 * @return
	 * returns the number the total value of all the movies earnings added together
	 */
	public double totalEarnings() {
		double totalEarnings = 0;
		for(int i=0;i<5;i++) {
			if(movie[i] != null) {
				totalEarnings = totalEarnings + movie[i].getEarnings();
			}
		}
		return totalEarnings;
	}
	/**
	 * the comedyEarnings method adds together the earnings of the comedy movies a distributor has
	 * @return
	 * the value of all the comedy movie earnings the distributor has
	 */
	public double comedyEarnings() {
		double totalEarnings = 0;
		for(int i=0;i<5;i++) {
			if(movie[i].getGenre() == 0) {
				totalEarnings = totalEarnings + movie[i].getEarnings();
			}
		} return totalEarnings;
	}
	/**
	 * the addEarnings method adds to the earnings of a specific movie specified by name
	 * @param name
	 * @param earnings
	 * @return added the value of earnings to the movies earnings
	 */
	public boolean addEarnings(String name, double earnings) {
		boolean output = false;
		for(int i=0;i<5;i++) {
			if(name.equalsIgnoreCase(movie[i].getName()) == true) {
				movie[i].addToEarnings(earnings);
				output = true;
			}
		}return output;
	}
	/**
	 * the getNumGenre method retrieves the number of movies in movies array are of a certain genre
	 * @precondition the genre parameter must be a value between 0 and 2
	 * @param genre
	 * @return the number of movies in the array that are of that genre or returns -1
	 * if it fails to meet the precondition
	 */
	public int getNumGenre(int genre) {
		int output = 0;
		if(genre < 0 || genre > 2) {
			 output = -1;
		}
		for(int i=0;i<5;i++) {
			if(movie[i].getGenre() == genre) {
				output++;
			}
		} return output;
	}
	/**
	 * the calculateTax method finds the amount of tax owed by a distributor
	 * @param taxrate
	 * @param list
	 * @return the total earnings of the distributor multiplied by the tax rate
	 */
	public static double calculateTax(double taxrate, Distributor list) {
		return list.totalEarnings() * taxrate;
		}
	/**
	 * the Equals method test to see if two distributors are equal by comparing the names
	 * @param otherDistributor
	 * @return true or false based on if the names match.
	 */
	public boolean equals(Distributor otherDistributor) {
		return this.name.equalsIgnoreCase(otherDistributor.getName());
	}
	/**
	 * list all the variables in the distributor class and their values, along with all the 
	 * details about each of the movies stored in the array.
	 */
	@Override
	public String toString() {
		String movies = "";
		for(int i=0;i<movie.length;i++) {if(movie[i] != null) {movies = movies + movie[i].toString();}}
		return "Distributor name: " + name + "\tphone number: " + phone + "\tnumber of movies: "
				+ numMovies + "\nMovie details:" + movies + "\ntotal earnings by distributor: " + totalEarnings()
				+ "\n";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
