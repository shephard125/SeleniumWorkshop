package helpers;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Stores information from Articles in the <class>pages.amazonTest.ResultsPage</class>
 * @author omar.navarro
 *
 */
public class Article {
	
	private String name;
	private double rating;
	private double price;
	private int value;
	
	/**
	 * Constructor:  It gets an article name, price and rating from amazon, and obtains its value as a 
	 * ratio of rating over price.  It formats it to three decimal digits and multiplies by 1000 to express
	 * it as an int.
	 * @param artName, article name as it appears on amazon.
	 * @param artPrice, article price as quoted on amazon.
	 * @param artRating, article rating in stars as an average of the ratings made by buyers and users on amazon.
	 */
	public Article(String artName, double artPrice, double artRating) {
		this.name = artName;
		this.price = artPrice;
		this.rating = artRating;
		//calculate value from price and rating
		NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
		DecimalFormat df = new DecimalFormat("#.###");
		double doubleValue = 0;
		try {
			doubleValue = nf.parse(df.format(artRating/artPrice)).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.value = (int)(1000 * doubleValue);
	}
	
	/**
	 *
	 * @return article name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return average rating of an article by amazon users expressed in stars.
	 */
	public double getRating() {
		return rating;
	}
	
	/**
	 * 
	 * @return article price in dollars and cents.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * The value of an article is the ratio of an article's review ratings over its price.  It goes from 
	 * 0 (when an article has no ratings) to 500000 (Assuming an article with the maximum rating of 5 costs
	 * one cent).  
	 * @return article value.
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * represents an Amazon article's information.
	 */
	public String toString() {
		return "Article: " +getName() + "\nPrice: " + getPrice() + "\nRating: " + getRating() + "\n";
	}
	

}
