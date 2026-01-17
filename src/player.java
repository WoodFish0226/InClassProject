
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
    private boolean school = false;

    public player (){ //default inout
        age = 0;
        gameMode = "USA";   //USA
        this.IQ = (int)(Math.random() * 33) + 1;
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
    public void setAlive(boolean Boolean){alive =Boolean;}
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
    public void goingSchool(boolean Boolean){school = Boolean;}

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
    public boolean getSchool(){return school;}
    public boolean getAlive(){return alive;}
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
        try{
            line= line.toLowerCase().replaceAll("\\s+", "");;
            line=line.substring(line.indexOf("(")+1,line.indexOf(")"));
            String[] Line = line.split(",");
            for (String eachUnit : Line){
                String each = eachUnit.substring(1);
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
        } catch (StringIndexOutOfBoundsException e) {
            return player;
        }
        if (health < 0) {
            System.out.println("you encountered a sudden death, RIP");
            System.out.println("achievement; wow, that is so sudden");
            alive = false;
        }
        if (wealth < 0){
            System.out.println("you or your family had contact with gambling, " +
                    "you lost all your wealth. you died homeless");
            System.out.println("achievement: fell below the kill line.");
            alive = false;
        }
        if (luck < 0) {
            System.out.println("RIP, a lost control truck hit you.");
            System.out.println("achievement: welcome to the I-sekai");
            alive = false;
        }
        if (loveReceiving < 0){
            System.out.println("no body love you, you had a boring life and died along");
            System.out.println("achievement: exist before present");
            alive = false;
        }
        if (mentalHealth < 0){
            System.out.println("you can't withstand the harsh life and so you jumped off the Brooklyn bridge");
            System.out.println("achievement: free fall experiment");
            alive = false;
        }
        if (look < 0){
            System.out.println("you are too ugly, a random person cannot with stand you, you go stabbed");
            System.out.println("achievement: Maybe take a trip to South Korea next time");
            alive = false;
        }
        return player;
    }
}
