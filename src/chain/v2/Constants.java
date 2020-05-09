package chain.v2;

import java.util.HashMap;
import java.util.Map;

public class Constants {

	public static final int LEVEL_MANAGER = 1;
	public static final int LEVEL_INSPECTOR = 2;
	public static final int LEVEL_GENERAL = 3;
	public static final int DAYS_MANAGER = 2;
	public static final int DAYS_INSPECTOR = 5;
	public static final int DAYS_GENERAL = 10;
	public static final int LEVEL_MAX = LEVEL_GENERAL;
	
	public static final String NAME_MANAGER = "mimi";
	public static final String NAME_INSPECTOR = "nini";
	public static final String NAME_GENERAL = "kiki";
	
	public static Map<Integer, Integer> daysmap = new HashMap<>();
	static {
		daysmap.put(LEVEL_MANAGER, DAYS_MANAGER);
		daysmap.put(LEVEL_INSPECTOR, DAYS_INSPECTOR);
		daysmap.put(LEVEL_GENERAL, DAYS_GENERAL);
	}
	
	public static int getDays(int level) {
		return daysmap.get(level);
	}
	
	public static Map<Integer, String> namesmap = new HashMap<>();
	static {
		namesmap.put(LEVEL_MANAGER, NAME_MANAGER);
		namesmap.put(LEVEL_INSPECTOR, NAME_INSPECTOR);
		namesmap.put(LEVEL_GENERAL, NAME_GENERAL);
	}
	
	public static String getName(int level) {
		return namesmap.get(level);
	}
}
