package musicLibrary;

public class AudioFile extends DigitalMedia {

	private String fileName;
	private int    fileResolution;

	public AudioFile() {
		super();

	}

	/**
	 * @param SKU of song
	 * @param title of song
	 * @param artist who sing the song
	 * @param year of song released
	 * @param file name
	 * @param file resolution
	 */
	public AudioFile(String sku, String title, String artist, int year, String fileName, int fileResolution) {
		super(sku, title, artist, year);

		validateString(fileName);
		validateInt(fileResolution);
		
		this.fileName = fileName;
		this.fileResolution = fileResolution;

	}

	public AudioFile(String sku, String title, String artist, int year, String fileName) {
		super();
		this.fileName = fileName;
	}

	/**
	 * @return file name
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param set file name
	 */
	public void setFileName(String fileName) {

		validateString(fileName);
		this.fileName = fileName;
	}

	/**
	 * @return file resolution
	 */
	public int getFileSize() {
		return fileResolution;
	}

	/**
	 * @param set file size
	 */
	public void setFileSize(int fileSize) {
		
		validateInt(fileSize);
		this.fileResolution = fileSize;
	}

	@Override
	public void play() {
		System.out.println("Playing an audio file");

	}

	@Override
	public String toString() {
		return "AudioFile [fileName=" + fileName + ", fileSize=" + fileResolution + ", toString()=" + super.toString() + "]";
	}

}
