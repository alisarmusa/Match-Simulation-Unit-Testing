public class Match {

    public static void main(String[] args) {
        Team liv = new Team("Liverpool", 30);
        Team city = new Team("Manchester City", 25);

        liv.setGoal(liv.goalValue(liv.generateNumber() + liv.power));
        city.setGoal(city.goalValue(city.generateNumber() + city.power));

        System.out.println(liv.name + " " + liv.getGoal() + " - " + city.getGoal() + " " + city.name);

    }

}
