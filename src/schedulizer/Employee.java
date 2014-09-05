package schedulizer;

public class Employee {

	private boolean[][] availabilities;
	private boolean[][] presets;
	private int minShifts;
	private int maxShifts;
	/**
	 * @param args
	 */
	public Employee(boolean[][] availabilities, boolean[][] presets, int minShifts, int maxShifts){
		this.availabilities = availabilities;
		this.minShifts = minShifts;
		this.maxShifts = maxShifts;
		this.presets = presets;
	}
	
	

}
