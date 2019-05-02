package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	EASY(100), MEDIUM(500), HARD(1000);
	private final int iDifficulty;
	
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();

	private eGameDifficulty(int iDifficulty) {
		this.iDifficulty = iDifficulty;
	}

	public int getiDifficulty() {
		return iDifficulty;
	}
	
	public static eGameDifficulty get(int iDifficulty) {
		if(iDifficulty < 100) {
			return null;
		}
		if(iDifficulty < 500) {
			iDifficulty = 100;
		}
		if(iDifficulty >= 1000) {
			iDifficulty = 1000;
		}
		return lookup.get(iDifficulty);
	}
}