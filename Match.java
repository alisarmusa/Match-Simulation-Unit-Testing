public class Match {

    public static void main(String[] args) {
        System.out.println(exhibition());
    }

    public static String exhibition() {
        Team team = new Team();
        team.liv.setGoal(team.liv.goalValue(team.liv.generateNumber() + team.liv.power));
        team.city.setGoal(team.city.goalValue(team.city.generateNumber() + team.city.power));

        String home = team.liv.name + " " + team.liv.getGoal();
        String away = team.city.getGoal() + " " + team.city.name;

        return home + " - " + away;
    }

}
