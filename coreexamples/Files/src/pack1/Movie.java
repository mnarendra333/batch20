package pack1;

public class Movie {

	private String movieName;
	private int year;
	private String production;
	private String language;
	private String collection;

	public Movie(String movieName, int year, String production,
			String language, String collection) {
		super();
		this.movieName = movieName;
		this.year = year;
		this.production = production;
		this.language = language;
		this.collection = collection;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", year=" + year
				+ ", production=" + production + ", language=" + language
				+ ", collection=" + collection + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public int getYear() {
		return year;
	}

	public String getProduction() {
		return production;
	}

	public String getLanguage() {
		return language;
	}

	public String getCollection() {
		return collection;
	}

}
