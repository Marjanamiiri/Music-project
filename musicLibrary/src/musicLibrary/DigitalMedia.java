package musicLibrary;

public abstract class DigitalMedia extends MusicMedia implements FileProcessor {
	
	private String filePath;
	
	public DigitalMedia() {}
	
	/**
	 * @param SKU of song
	 * @param title of song
	 * @param artist who sing the song
	 * @param year of song released
	 */
	public DigitalMedia(String sku, String title, String artist, int year) {
		super(sku, title, artist, year);
	}

	@Override
	public void save(String filePath) {
		
		validateString(filePath);
		
		this.filePath = filePath;
		System.out.println("Saving the audio file");

	}

	@Override
	public void delete(String filePath) {
		
		validateString(filePath);
		
		System.out.println("Deleting the audio file");
	}

	@Override
	public String toString() {
		return "DigitalMedia [filePath=" + filePath + ", toString()=" + super.toString() + "]";
	}

}


