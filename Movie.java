/**
 * The Movie class creates objects with attributes of name, directorName,Earnings, and genre
 * @author sammy
 *
 */
public class Movie {
private String name;
private String directorName;
private double earnings;
private int genre;
	/**
	 * This constructor creates a new movie object
	 * @param name
	 * @param directorName
	 * @param genre
	 */
	public Movie(String name, String directorName, int genre) {
	super();
	this.name = name;
	this.directorName = directorName;
	this.earnings = 0;
	this.genre = genre;
	}
	/**
	 * this getter retrieves the movies name
	 * @return
	 * the name of the movie
	 */
	public String getName() {
		return name;
	}
	/**
	 * set the Movies name
	 * @param name
	 * @postcondition 
	 * the name of the Movie has been changed to 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * This getter retrieves the String stored for Directors name
	 * @return
	 * the value stored in directorName
	 */
	public String getDirectorName() {
		return directorName;
	}
	/**
	 * Sets the String value for directorsName
	 * @param directorName
	 * @postcondition 
	 * the String value for directorsName has been set the value passed
	 */
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	/**
	 * This getter retrieves the double value stored in earnings
	 * @return
	 * the double stored in earnings
	 */
	public double getEarnings() {
		return earnings;
	}
	/**
	 * This getter retrieves the int value stored in genre
	 * @return
	 * the Int value stored in genre
	 */
	public int getGenre() {
		return genre;
	}
	/**
	 * Sets the int value stored in genre
	 * @param genre
	 * @postcondition 
	 * the int value of genre has been set to the value passed
	 */
	public void setGenre(int genre) {
		this.genre = genre;
	}
	/**
	 * addtoEarnings add the double passed to the value stored in earnings
	 * @param amount
	 * @postcondition
	 * the double passed has been added to the value of earnings
	 */
	public void addToEarnings(double amount) {
		this.earnings = this.earnings + amount;
	}
	/**
	 * equals method checks to see if two Movie objects are equal if they both have the same name and directorName
	 * @param Obj
	 * @return output
	 * the method returns true or fase based on if the two objects name and directorName are the name.
	 */
	public boolean equals(Object obj) {
		boolean output = false;
		Movie otherMovie = (Movie)obj;
		if (this.name.equalsIgnoreCase(otherMovie.name) &&
			this.directorName.equalsIgnoreCase(otherMovie.directorName) &&
			this.genre == otherMovie.genre) {
			output = true;
		}
		return output;
	}
	/**
	 * toString method returns the name, directorName, earnings, earnings, and the values they store in a printable
	 * format
	 */
	@Override
	public String toString() {
		return "\nname=" + name + "\tdirectorName=" + directorName + "\tearnings=" + earnings + "\tgenre=" + genre;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
