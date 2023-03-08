package musicLibrary;


public class VinylRecord extends PhysicalMedia {

	private int numberOfTracks;
	private int sizeInInches;
	private int weightInGrams;

	private final int SINGLE_SIZE;
	private final int EP_SIZE;
	private final int LP_SIZE;

	private final int SINGLE_WEIGHT;
	private final int EP_WEIGHT;
	private final int LP_WEIGHT;
	
	private static final int DEFAULT_SIZE = 7;
	private static final int DEFAULT_WEIGHT = 40;
	private static final int DEFAULT_TRACK_NUMBER = 2;

	{
		SINGLE_SIZE = DEFAULT_SIZE;
		EP_SIZE = 10;
		LP_SIZE = 12;

		SINGLE_WEIGHT = DEFAULT_WEIGHT;
		EP_WEIGHT = 100;
		LP_WEIGHT = 180;
	}

	public VinylRecord() {
		super();

	}
	
	/**
	 * @param SKU of song
	 * @param title of song
	 * @param artist who sing the song
	 * @param year of song released
	 * @param number of track in album
	 * @param size in inches
	 * @param weight in grams
	 */
	public VinylRecord(String sku, String title, String artist, int year, int numberOfTracks, int weightInGrams, int sizeInInches) {
		super(sku, title, artist, year);
		
		validateInt(numberOfTracks);
		this.numberOfTracks = numberOfTracks;
		
		setSizeInInches(sizeInInches);
		setWeightInGrams(weightInGrams);
	}

	/**
	 * @param SKU of song
	 * @param title of song
	 * @param artist who sing the song
	 * @param year of song released
	 * @param number of track in album
	 */
	public VinylRecord(String sku, String title, String artist, int year, int numberOfTracks) {
		this(sku, title, artist, year, DEFAULT_TRACK_NUMBER, DEFAULT_WEIGHT, DEFAULT_SIZE);
	}

	/**
	 * @return the numberOfTracks
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * @param the numberOfTracks
	 */
	public void setNumberOfTracks(int numberOfTracks) {

		validateInt(numberOfTracks);
		this.numberOfTracks = numberOfTracks;
	}

	/**
	 * @return the sizeInInches
	 */
	public int getSizeInInches() {
		return sizeInInches;
	}

	/**
	 * @param size in inches throw IllegalArgumentException if size is invalid
	 */
	public void setSizeInInches(int size) {
		if (size == SINGLE_SIZE || size == EP_SIZE || size == LP_SIZE) {
			this.sizeInInches = size;
		} else {
			throw new IllegalArgumentException("Record size is invalid");
		}
//		validateInt(sizeInInches);
	}

	/** 
	 * @return weightInGrams
	 */
	public int getWeightInGrams() {
		return weightInGrams;
	}
	
	/**
	 * @param weight in grams throw IllegalArgumentException if weight is invalid
	 */
	public void setWeightInGrams(int weightInGrams) {

		if (sizeInInches == SINGLE_SIZE && weightInGrams == SINGLE_WEIGHT) {
			this.weightInGrams = weightInGrams;
		} else if (sizeInInches == EP_SIZE && weightInGrams == EP_WEIGHT) {
			this.weightInGrams = weightInGrams;
		} else if (sizeInInches == LP_SIZE && weightInGrams == LP_WEIGHT) {
			this.weightInGrams = weightInGrams;
		} else {
			throw new IllegalArgumentException("Record weight is invalid");
		}
//		validateInt(weightInGrams);
	}

	@Override
	public String toString() {
		return "VinylRecord [numberOfTracks=" + numberOfTracks + ", size=" + sizeInInches + ", weightInGrams=" + weightInGrams
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void play() {
		System.out.println("Playing a vinyl record");

	}

}
