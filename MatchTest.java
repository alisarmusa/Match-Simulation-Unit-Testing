import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MatchTest {
    private Match match;
    private Team team;

    @Before
    public void setUp() {
        team = new Team();
        match = new Match();
    }

    String matchResult = match.exhibition();

    @Test
    public void resultControl() {
        String home = team.liv.name + " " + team.liv.getGoal();
        String away = team.city.getGoal() + " " + team.city.name;
        String expectMatch = home + " - " + away;
        Assert.assertEquals(expectMatch, matchResult);
    }


    @After
    public void tearDown() {
        team = null;
        match = null;
    }
}

