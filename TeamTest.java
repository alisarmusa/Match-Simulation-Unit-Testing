import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class TeamTest {
    private Team team;

    @Before
    public void setUp() {
        team = new Team();
    }

    @Test
    public void goalControl0() {
        Assert.assertEquals(Integer.valueOf(0), team.goalValue(33));
    }
    @Test
    public void goalControl1() {
        Assert.assertEquals(Integer.valueOf(1), team.goalValue(50));
    }
    @Test
    public void goalControl2() {
        Assert.assertEquals(Integer.valueOf(2), team.goalValue(70));
    }
    @Test
    public void goalControl3() {
        Assert.assertEquals(Integer.valueOf(3), team.goalValue(85));
    }
    @Test
    public void goalControl4() {
        Assert.assertEquals(Integer.valueOf(4), team.goalValue(95));
    }
    @Test
    public void goalControl5() {
        Assert.assertEquals(Integer.valueOf(5), team.goalValue(103));
    }
    @Test
    public void goalControl6() {
        Assert.assertEquals(Integer.valueOf(6), team.goalValue(107));
    }
    @Test
    public void goalControl7() {
        Assert.assertEquals(Integer.valueOf(7), team.goalValue(113));
    }
    @Test
    public void goalControl8() {
        Assert.assertEquals(Integer.valueOf(8), team.goalValue(117));
    }

    @After
    public void tearDown() {
        team = null;
    }
}
