package musicLibrary;

public abstract class MusicMedia {

	private String sku;
	private String title;
	private String artist;
	private int    year;
	
	public static final int CURRENT_YEAR = 2023;
	public static final int FIRST_YEAR   = 1860;


	public MusicMedia() {
		super();

	}

	/**
	 * @param title of song
	 * @param artist who sing the song
	 */
	public MusicMedia(String sku, String title, String artist, int year) {
		super();
		validateString(title);
		validateString(artist);
		validateString(sku);
		validateInt(year);
		
		this.title  = title;
		this.artist = artist;
		this.sku    = sku;
		this.year   = year;
	}

	protected void validateString(String value) {

		if (value == null || value.isBlank()) {

			throw new IllegalArgumentException("invalid String entered");
		}
	}
	
	protected void validateInt(int value) {
		
		if(value < FIRST_YEAR && value > CURRENT_YEAR) {
			
			throw new IllegalArgumentException("invalid String entered");
		}
	}
	
	public abstract void play();

	/**
	 * @return the title
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public final void setTitle(String title) {

		validateString(title);
		this.title = title;
	}

	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {

		validateString(artist);
		this.artist = artist;
	}
	
	/**
	 * @return the sku of song
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @param sku to sku set
	 */
	public void setSku(String sku) {
		
		validateString(sku);
		this.sku = sku;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		
		validateInt(year);
		this.year = year;
	}

	@Override
	public String toString() {
		return "MusicMedia [title=" + title + ", artist=" + artist + ", sku=" + sku + ", year=" + year + "]";
	}



}


