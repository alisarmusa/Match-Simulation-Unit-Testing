public class Team {

    String name;
    Integer power;
    private Integer goal;

    public Team(){}

    public Team(String teamName, Integer teamPower){
        name = teamName;
        power = teamPower;
    }

    public Integer getGoal() {
        return goal;
    }
    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    public Integer generateNumber(){
        Integer number = (int) (Math.random() * 100);
        return number;
    }

    public Integer goalValue(Integer number){
        Integer goal = 0;
        if(number < 35)
            return goal = 0;
        else if(number < 60)
            return goal = 1;
        else if(number < 80)
            return goal = 2;
        else if(number < 90)
            return goal = 3;
        else if(number < 100)
            return goal = 4;
        else if(number < 105)
            return goal = 5;
        else if(number < 110)
            return goal = 6;
        else if(number < 115)
            return goal = 7;
        else
            return goal = 8;
    }


}
