import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class events {
    private String gameMode;
    private String[] backpack;
    private int roll;
    private int birth;
    private boolean deaf;
    private boolean school;
    private String city;
    private String condition;
    boolean PlayerIsBadLuck;

    public events (String gameMode){
    this.gameMode = gameMode;
    if (gameMode == "USA") city = "newyork";
    if (gameMode == "Europe") city = "London";
    if (gameMode == "Asia") city = "Shanghai";

    }

    public void setSchool (boolean Boolean) {this.school = Boolean;}

    public String getCondition() {return condition;}

    public player simulation (int age, player player){
        PlayerIsBadLuck = (player.getLuck() > 0.5);
        ArrayList<String> fileData1to5Rich = getFileData("src/age1-5");
        ArrayList<String> fileData1to5Poor = getFileData("src/age1-5Poor");
        ArrayList<String> fileData7to10PoorNoSchool = getFileData("src/age7-10PoorNoSchool");
        ArrayList<String> fileData7to10PoorSchool = getFileData("src/age7-10PoorSchool");
        ArrayList<String> fileData7to10School = getFileData("src/age7-10School");
        ArrayList<String> fileData12to20School = getFileData("src/12-20School");
        ArrayList<String> fileData12to20PoorSchool = getFileData("src/12-20PoorSchool");
        ArrayList<String> fileData12to20PoorNoSchool = getFileData("src/12-20PoorNoSchool");
        switch (age) {
            case 0: {
                int roll = (int) (Math.random() * 35) + 1;
                int line = roll - 1;
                ArrayList<String> fileData = getFileData("src/age0");
                switch (roll) {
                    case 1:
                        System.out.println(fileData.get(line));
                        player.increaseLoveReceivingBy(2);
                        player.increaseHealthBy(2);
                        break;
                    case 2:
                        System.out.println(fileData.get(line));
                        player.increaseWealthBy(2);
                        break;
                    case 3:
                        System.out.println(fileData.get(line));
                        player.increaseIQBy(2);
                        break;
                    case 4:
                        System.out.println(fileData.get(line));
                        player.increaseLoveReceivingBy(2);
                        player.increaseMentalHealthBy(2);
                        break;
                    case 5:
                        System.out.println(fileData.get(line));
                        player.increaseLoveReceivingBy(2);
                        player.increaseWealthBy(1);
                        break;
                    case 6:
                        System.out.println(fileData.get(line));
                        player.increaseHealthBy(4);
                        break;
                    case 7:
                        System.out.println(fileData.get(line));
                        player.increaseHealthBy(4);
                        break;
                    case 8:
                        System.out.println(fileData.get(line));
                        player.increaseIQBy(4);
                        break;
                    case 9:
                        System.out.println(fileData.get(line));
                        player.increaseLoveReceivingBy(4);
                        break;
                    case 10:
                        System.out.println(fileData.get(line));
                        player.increaseMentalHealthBy(4);
                        player.increaseHealthBy(-2);
                        break;
                    //Positive family condition
                    case 11:
                        System.out.println(fileData.get(line));
                        break;
                    case 12:
                        System.out.println(fileData.get(line));
                        break;
                    case 13:
                        System.out.println(fileData.get(line));
                        break;
                    case 14:
                        System.out.println(fileData.get(line));
                        break;
                    case 15:
                        System.out.println(fileData.get(line));
                        break;
                    case 16:
                        System.out.println(fileData.get(line));
                        break;
                    //plain, ordinary life
                    case 17:
                        System.out.println(fileData.get(line));
                        player.increaseHealthBy(-2);
                        player.increaseWealthBy(-1);
                        break;
                    case 18:
                        System.out.println(fileData.get(line));
                        player.increaseMentalHealthBy(-1);
                        player.increaseLoveReceivingBy(-2);
                        player.increaseWealthBy(-2);
                        break;
                    case 19:
                        System.out.println(fileData.get(line));
                        player.increaseLoveReceivingBy(-4);
                        break;
                    case 20:
                        System.out.println(fileData.get(line));
                        player.increaseHealthBy(-4);
                        player.increaseWealthBy(-2);
                        player.increaseLoveReceivingBy(3);
                        break;
                    case 21:
                        System.out.println(fileData.get(line));
                        player.increaseWealthBy(-4);
                        player.increaseHealthBy(-1);
                        break;
                    case 22:
                        System.out.println(fileData.get(line));
                        player.increaseLookBy(-3);
                        player.increaseMentalHealthBy(-2);
                        break;
                    case 23:
                        System.out.println(fileData.get(line));
                        player.loveReceiving(player.getLove() / 2);
                        player.setWealth(player.getWealth() / 4);
                        player.increaseMentalHealthBy(5);
                        break;
                    case 24:
                        System.out.println(fileData.get(line));
                        player.increaseLuckBy(-3);
                        break;
                    case 25:
                        System.out.println(fileData.get(line));
                        player.increaseWealthBy(-4);
                        player.increaseHealthBy(-2);
                        player.increaseLoveReceivingBy(2);
                        break;
                    case 26:
                        System.out.println(fileData.get(line));
                        player.increaseMentalHealthBy(-2);
                        player.increaseLoveReceivingBy(2);
                        break;
                    case 27:
                        System.out.println(fileData.get(line));
                        player.increaseHealthBy(-2);
                        player.increaseWealthBy(-2);
                        break;
                    case 28:
                        System.out.println(fileData.get(line));
                        player.increaseLoveReceivingBy(-3);
                        player.increaseMentalHealthBy(-3);
                        break;
                    case 29:
                        System.out.println(fileData.get(line));
                        System.out.println("achievement: oh~so you do have a mother");
                        player.loveReceiving(-4);
                        player.increaseWealthBy(-4);
                        player.increaseMentalHealthBy(4);
                        break;

                    case 30:
                        System.out.println(fileData.get(line));
                        System.out.println("achievement: did you pick Asia mode?");
                        player.increaseMentalHealthBy(-4);
                        player.loveReceiving(-4);
                        break;

                    //sad lifes
                    case 31:
                        System.out.println(fileData.get(line));
                        player.increaseLuckBy(1);
                        player.increaseIQBy(1);
                        player.increaseMentalHealthBy(-1);
                        break;
                    case 32:
                        System.out.println(fileData.get(line));
                        player.increaseLookBy(4);
                        player.increaseEQBy(-3);
                        player.increaseIQBy(1);
                        break;
                    case 33:
                        System.out.println(fileData.get(line));
                        player.increaseLuckBy(1);
                        player.increaseIQBy(1);
                        player.increaseMentalHealthBy(-2);
                        break;
                    case 34:
                        System.out.println(fileData.get(line));
                        System.out.println("It is quiet Uptown");
                        deaf = true;
                        break;
                    case 35:
                        System.out.println(fileData.get(line));
                        player.increaseIQBy(10);
                        player.increaseLuckBy(3);
                        player.setMentalHealth(0);
                        break;
                    //mystical lives;
                }//1-10 rich, 11-15 normal, 16-30 sad, 31 -35 mystical
                //1-10 rich, 11-15 normal, 16-30 sad, 30 -35 mystical
                birth = roll;
                return player;
            }
            case 1: {
                if (roll + player.getWealth() < 21) {
                    condition = "village";
                }
                if (roll + player.getWealth() < 35) {
                    condition = "downtown";
                }
                if (roll + player.getWealth() > 35) {
                    condition = "uptown";
                }
                System.out.println();
                System.out.println("you live in the " + condition + " of " + city);
                System.out.println();
                return player;
            }

            case 2: {
                if (!condition.equals("village")) {
                    int RandLine = (int) (Math.random() * 11);
                    System.out.println(fileData1to5Rich.get(RandLine));
                    player.changes(player, fileData1to5Rich.get(RandLine));
                } else {
                    int RandLine = (int) (Math.random() * 8);
                    System.out.println(fileData1to5Poor.get(RandLine));
                    player.changes(player, fileData1to5Poor.get(RandLine));
                }
                break;
            }
            case 3: {
                if (gameMode.equals("Asia")) {
                    System.out.println("You start taking piano lessons and excel at them. (+IQ, -mentalHealth)");
                    player.increaseIQBy(1);
                    player.increaseMentalHealthBy(-2);
                } else {
                    if (!condition.equals("village")){
                        int RandLine = (int)(Math.random() * 11);
                        System.out.println(fileData1to5Rich.get(RandLine));
                        player.changes(player, fileData1to5Rich.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * 8);
                        System.out.println(fileData1to5Poor.get(RandLine));
                        player.changes(player, fileData1to5Poor.get(RandLine));
                    }
                }
                break;
            }
            case 4:{
                if (!condition.equals("village")){
                    int RandLine = (int)(Math.random() * 11);
                    System.out.println(fileData1to5Rich.get(RandLine));
                    player.changes(player, fileData1to5Rich.get(RandLine));
                }else{
                    int RandLine = (int)(Math.random() * 8);
                    System.out.println(fileData1to5Poor.get(RandLine));
                    player.changes(player, fileData1to5Poor.get(RandLine));
                }
            }
                break;
            case 5:{
                if (!condition.equals("village")){
                    int RandLine = (int)(Math.random() * 11);
                    System.out.println(fileData1to5Rich.get(RandLine));
                    player.changes(player, fileData1to5Rich.get(RandLine));
                }else{
                    int RandLine = (int)(Math.random() * 8);
                    System.out.println(fileData1to5Poor.get(RandLine));
                    player.changes(player, fileData1to5Poor.get(RandLine));
                }
                break;
            }
            case 6:{
                System.out.println("a peaceful year.");
                break;}
            case 7:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData7to10PoorSchool.toArray().length);
                        System.out.println(fileData7to10PoorSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData7to10PoorNoSchool.toArray().length);
                        System.out.println(fileData7to10PoorNoSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData7to10School.toArray().length);
                    System.out.println(fileData7to10School.get(RandLine));
                    player.changes(player, fileData7to10School.get(RandLine));
                }
                break;
            }
            case 8:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData7to10PoorSchool.toArray().length);
                        System.out.println(fileData7to10PoorSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData7to10PoorNoSchool.toArray().length);
                        System.out.println(fileData7to10PoorNoSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData7to10School.toArray().length);
                    System.out.println(fileData7to10School.get(RandLine));
                    player.changes(player, fileData7to10School.get(RandLine));
                }
                break;
            }
            case 9:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData7to10PoorSchool.toArray().length);
                        System.out.println(fileData7to10PoorSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData7to10PoorNoSchool.toArray().length);
                        System.out.println(fileData7to10PoorNoSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData7to10School.toArray().length);
                    System.out.println(fileData7to10School.get(RandLine));
                    player.changes(player, fileData7to10School.get(RandLine));
                }
                break;
            }
            case 10:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData7to10PoorSchool.toArray().length);
                        System.out.println(fileData7to10PoorSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData7to10PoorNoSchool.toArray().length);
                        System.out.println(fileData7to10PoorNoSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData7to10School.toArray().length);
                    System.out.println(fileData7to10School.get(RandLine));
                    player.changes(player, fileData7to10School.get(RandLine));
                }
                break;
            }
            case 11:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData7to10PoorSchool.toArray().length);
                        System.out.println(fileData7to10PoorSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData7to10PoorNoSchool.toArray().length);
                        System.out.println(fileData7to10PoorNoSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData7to10School.toArray().length);
                    System.out.println(fileData7to10School.get(RandLine));
                    player.changes(player, fileData7to10School.get(RandLine));
                }
                break;
            }
            case 12:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData7to10PoorSchool.toArray().length);
                        System.out.println(fileData7to10PoorSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData7to10PoorNoSchool.toArray().length);
                        System.out.println(fileData7to10PoorNoSchool.get(RandLine));
                        player.changes(player, fileData7to10PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData7to10School.toArray().length);
                    System.out.println(fileData7to10School.get(RandLine));
                    player.changes(player, fileData7to10School.get(RandLine));
                }
                break;
            }
            case 13:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData12to20PoorSchool.toArray().length);
                        System.out.println(fileData12to20PoorSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData12to20PoorNoSchool.toArray().length);
                        System.out.println(fileData12to20PoorNoSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData12to20School.toArray().length);
                    System.out.println(fileData12to20School.get(RandLine));
                    player.changes(player, fileData12to20School.get(RandLine));
                }
                break;
            }
            case 14:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData12to20PoorSchool.toArray().length);
                        System.out.println(fileData12to20PoorSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData12to20PoorNoSchool.toArray().length);
                        System.out.println(fileData12to20PoorNoSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData12to20School.toArray().length);
                    System.out.println(fileData12to20School.get(RandLine));
                    player.changes(player, fileData12to20School.get(RandLine));
                }
                break;
            }
            case 15:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData12to20PoorSchool.toArray().length);
                        System.out.println(fileData12to20PoorSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData12to20PoorNoSchool.toArray().length);
                        System.out.println(fileData12to20PoorNoSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData12to20School.toArray().length);
                    System.out.println(fileData12to20School.get(RandLine));
                    player.changes(player, fileData12to20School.get(RandLine));
                }
                break;
            }
            case 16:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData12to20PoorSchool.toArray().length);
                        System.out.println(fileData12to20PoorSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData12to20PoorNoSchool.toArray().length);
                        System.out.println(fileData12to20PoorNoSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData12to20School.toArray().length);
                    System.out.println(fileData12to20School.get(RandLine));
                    player.changes(player, fileData12to20School.get(RandLine));
                }
                break;
            }
            case 17:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData12to20PoorSchool.toArray().length);
                        System.out.println(fileData12to20PoorSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData12to20PoorNoSchool.toArray().length);
                        System.out.println(fileData12to20PoorNoSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData12to20School.toArray().length);
                    System.out.println(fileData12to20School.get(RandLine));
                    player.changes(player, fileData12to20School.get(RandLine));
                }
                break;
            }
            case 18:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData12to20PoorSchool.toArray().length);
                        System.out.println(fileData12to20PoorSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData12to20PoorNoSchool.toArray().length);
                        System.out.println(fileData12to20PoorNoSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData12to20School.toArray().length);
                    System.out.println(fileData12to20School.get(RandLine));
                    player.changes(player, fileData12to20School.get(RandLine));
                }
                break;
            }
            case 19:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData12to20PoorSchool.toArray().length);
                        System.out.println(fileData12to20PoorSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData12to20PoorNoSchool.toArray().length);
                        System.out.println(fileData12to20PoorNoSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData12to20School.toArray().length);
                    System.out.println(fileData12to20School.get(RandLine));
                    player.changes(player, fileData12to20School.get(RandLine));
                }
                break;
            }
            case 20:{
                if (!condition.equals("village")){
                    if (school){
                        int RandLine = (int)(Math.random() * fileData12to20PoorSchool.toArray().length);
                        System.out.println(fileData12to20PoorSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorSchool.get(RandLine));
                    }else{
                        int RandLine = (int)(Math.random() * fileData12to20PoorNoSchool.toArray().length);
                        System.out.println(fileData12to20PoorNoSchool.get(RandLine));
                        player.changes(player, fileData12to20PoorNoSchool.get(RandLine));
                    }
                }else{
                    int RandLine = (int)(Math.random() * fileData12to20School.toArray().length);
                    System.out.println(fileData12to20School.get(RandLine));
                    player.changes(player, fileData12to20School.get(RandLine));
                }
                break;
            }

        }
        return player;
    }


    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        } catch (FileNotFoundException e) {
            return fileData;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if ((((Math.random() / 10.0) +Math.random())  * Math.random() > 0.8)){
                System.out.println("you encountered a school shooting, RIP");
            }
        }
    }
}
