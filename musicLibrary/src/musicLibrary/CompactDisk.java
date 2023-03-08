package musicLibrary;

public class CompactDisk extends PhysicalMedia {

	private int numberOfTracks;

	public CompactDisk() {
		super();
	}

	/**
	 * @param SKU of song
	 * @param title of song
	 * @param artist who sing the song
	 * @param year of song released
	 * @param number of track in album
	 */
	public CompactDisk(String sku, String title, String artist, int year, int numberOfTracks) {
		super(sku, title, artist, year);

		validateInt(numberOfTracks);
		this.numberOfTracks = numberOfTracks;

	}

	/**
	 * @return the numberOfTracks
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	/**
	 * @param numberOfTracks the numberOfTracks to set
	 */
	public void setNumberOfTracks(int numberOfTracks) {

		validateInt(numberOfTracks);
		this.numberOfTracks = numberOfTracks;
	}

	@Override
	public void play() {

		System.out.println("Playing the " + getTitle() + " compact disc");

	}

	@Override
	public String toString() {
		return "CompactDisc [numberOfTracks=" + numberOfTracks + ", toString()=" + super.toString() + "]";
	}

}

