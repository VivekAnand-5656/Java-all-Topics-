package OOPs.Encapsulation;

public class GameCharacter {
    private String name;
    private int health;
    private int level;

    public void setName(String name,int health,int level){
        this.name = name;
        if(health <= 0){
            System.out.println("Please Increase Health");
        } else {
            this.health = health;
        }
        if(level < 1){
            System.out.println("Increase level");
        } else {
            this.level = level;
        }
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getLevel(){
        return level;
    }

}
