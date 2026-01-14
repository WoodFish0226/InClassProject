public class player {
    int age;
    String name;
    boolean alive = true;
    int IQ;
    int EQ;
    int look;
    int health;
    int wealth;
    int luck;
    int loveReceiving;
    int gameMode;
    int skillPoints = 100;
    public player (){
        age = 0;
        gameMode = 1;   //USA
        this.IQ = (int)(Math.random() * 100) + 1;
        skillPoints -= IQ;
        this.EQ = (int)(Math.random() * skillPoints) + 1;
        skillPoints -= EQ;
        this.look= (int)(Math.random() * skillPoints) + 1;
        skillPoints -= look;
        this.health= (int)(Math.random() * skillPoints) + 1;
        skillPoints -= health;
        this.wealth= (int)(Math.random() * skillPoints) + 1;
        skillPoints -= wealth;
        this.loveReceiving = (int)(Math.random() * skillPoints) + 1;
        skillPoints -= loveReceiving;
        this.name = "Darwin";
        luck = (int)(Math.random() * 99) + 1;
    }

    public void grow(){
        age++;
    }

    public void setEQ(int EQ) {
        this.EQ = EQ;
    }
    public void setIQ(int IQ){
        this.IQ = IQ;
    }
    public void setLook(int look){
        this.look = look;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setWealth(int wealth){
        this.wealth = wealth;
    }
    public void loveReceiving(int loveReceiving){
        this.loveReceiving = loveReceiving;
    }
    public void name(String name){
        this.name = name;
    }
}
