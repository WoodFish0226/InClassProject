import java.io.File;
import java.io.FileNotFoundException;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class events {
    String gameMode;
    String[] backpack;
    int roll;
    int birth;
    boolean deaf;
    public events (String gameMode){
    this.gameMode = gameMode;
    }

    boolean PlayerIsBadLuck;
    public player simulation (int age, player player){
        PlayerIsBadLuck = (player.getLuck() > 0.5);

        switch (age){
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
                        deaf=true;
                        break;
                    case 35:
                        System.out.println(fileData.get(line));
                        player.increaseIQBy(10);
                        player.increaseLuckBy(3);
                        player.setMentalHealth(0);
                        break;
                }
            }
                birth = roll;
                return player;
            case 1:
                System.out.println();
            case 2:
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
}
