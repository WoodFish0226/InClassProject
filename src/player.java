
public class player {
    private int age;
    private String name;
    private boolean alive = true;
    private int IQ;
    private int EQ;
    private int look;
    private int health;
    private int wealth;
    private int luck;
    private int loveReceiving;
    private String gameMode;
    private int skillPoints = 100;
    private boolean boy;
    private int mentalHealth = 100;
    private String BornIn;

    public player (){ //default inout
        age = 0;
        gameMode = "USA";   //USA
        this.IQ = (int)(Math.random() * 30) + 1;
        skillPoints -= IQ;
        this.EQ = (int)(Math.random() * (skillPoints/3)) + 1;
        skillPoints -= EQ;
        this.look= (int)(Math.random() * (skillPoints/2)) + 1;
        skillPoints -= look;
        this.health= (int)(Math.random() * (skillPoints/2)) + 1;
        skillPoints -= health;
        this.wealth= (int)(Math.random() * skillPoints) + 1;
        skillPoints -= wealth;
        this.loveReceiving = (int)(Math.random() * skillPoints) + 1;
        skillPoints -= loveReceiving;
        this.name = "Darwin";
        luck = (int)(Math.random() * 99) + 1;
    } //default

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
    public void setGameMode (String gameMode){this.gameMode = gameMode;}
    public void setGender(int EvenOrOdd){boy = EvenOrOdd % 2 == 1;}
    public void setMentalHealth(int mentalHealth){this.mentalHealth = mentalHealth;}
    public void addAge(){age++;}

    public String getGameMode(){return gameMode;}
    public int getAge(){return age;}
    public String getName(){return name;}
    public int getIQ(){return IQ;}
    public int getEQ(){return EQ;}
    public int getLook(){return look;}
    public int getHealth(){return health;}
    public int getWealth(){return wealth;}
    public int getLove(){return loveReceiving;}
    public int getLuck(){return luck;}
    public String getGender(){
        if(boy)return "female";
        else return "male";
    }
    public void increaseEQBy(int integer){EQ += integer;}
    public void increaseIQBy(int integer){IQ += integer;}
    public void increaseLookBy(int integer){look += integer;}
    public void increaseHealthBy(int integer){health += integer;}
    public void increaseWealthBy(int integer){wealth += integer;}
    public void increaseLoveReceivingBy(int integer){loveReceiving += integer;}
    public void increaseMentalHealthBy(int integer){mentalHealth += integer;}
    public void increaseLuckBy(int integer){luck += integer;}

    public player changes(player player ,String line){
        line= line.toLowerCase();
        line=line.substring(line.indexOf("("),line.indexOf(")"));
        String[] Line = line.split(",");
        for (String eachUnit : Line){
            String each = eachUnit.substring(2);
            int value = 1;
            if (eachUnit.substring(0,1).equals("-")) {value = -1;}
            if (each.equals("iq")){increaseIQBy(value);}
            if (each.equals("eq")){increaseEQBy(value);}
            if (each.equals("look")){increaseLookBy(value);}
            if (each.equals("health")){increaseHealthBy(value);}
            if (each.equals("wealth")){increaseWealthBy(value);}
            if (each.equals("lovereceiving")){increaseLoveReceivingBy(value);}
            if (each.equals("mentalhealth")){increaseMentalHealthBy(value);}
            if (each.equals("luck")){increaseLuckBy(value);}
        }
        System.out.println("changed");
        return player;
    }
}
