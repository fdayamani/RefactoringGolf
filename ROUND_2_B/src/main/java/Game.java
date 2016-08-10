import java.util.HashMap;
import java.util.Map;

public class Game {

	private Map<String, Integer> scores = new HashMap<String, Integer>();

	public Game(String homeTeam, int homeTeamScore, String awayTeam, int awayTeamScore) {
		scores.put(homeTeam, homeTeamScore);
		scores.put(awayTeam, awayTeamScore);
	}

	int getTeamScore(String teamName) {
		return scores.get(teamName);
	}

}
