import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        player darwin = new player();
        int Input;
        System.out.println("Welcome to the life simulation");
        System.out.println("please select your game mode by input the corresponding key:");
        System.out.println("game mode:");
        System.out.println("1:USA");
        System.out.println("2:Asia");
        System.out.println("3:Europe");
        System.out.println("4:Africa");
        Input = scan.nextInt();
        switch (Input){
            case 1:
                player.se ("USA");
            case 2:
                stats.add("Asia");
            case 3:
                stats.add("Europe");
            case 4:
                stats.add("Africa");
        }
        int skillPoints = 100;
        boolean notPassing = true;

        System.out.println("now distribute your ability points, you have 100 point in total:");
        while (notPassing) {
            System.out.println("out of 100 how much you want to give for your IQ?");
            try {
                Input = scan.nextInt();
                if (Input <= 100 && Input >= 0) {
                    stats.add(String.valueOf(Input));
                    skillPoints -= Input;
                    notPassing = false;
                } else {
                    System.out.println("out of range, please re-input:");
                }
            }catch (InputMismatchException e){
                System.out.println("out of range, please re-input:");
            }
        }
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for your EQ?");

                try {
                    Input = scan.nextInt();
                    if (Input <= skillPoints) {
                        stats.add(String.valueOf(Input));
                        skillPoints -= Input;
                        notPassing = false;
                    }else{
                        System.out.println("out of range, please re-input:");
                    }
                }catch (InputMismatchException e){
                    System.out.println("out of range, please re-input:");
                }
            }else{
                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        }
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for your look?");
                try{
                    Input = scan.nextInt();
                    if (Input <= skillPoints) {
                        stats.add(String.valueOf(Input));
                        skillPoints -=Input;
                        notPassing = false;
                    }else{
                        System.out.println("out of range, please re-input:");
                    }
            }catch (InputMismatchException e){
                System.out.println("out of range, please re-input:");
            }
            }else{
//                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        }
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for your health?");
                try{
                    if (Input <= skillPoints) {
                        stats.add(String.valueOf(Input));
                        skillPoints -=Input;
                        notPassing = false;
                    }else{
                        System.out.println("out of range, please re-input:");
                    }
                }catch (InputMismatchException e){
                    System.out.println("out of range, please re-input:");
                }
            }else{
//                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        }
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for your wealth?");
                Input = scan.nextInt();
                try{
                    if (Input <= skillPoints) {
                        stats.add(String.valueOf(Input));
                        skillPoints -=Input;
                        notPassing = false;
                    }else{
                        System.out.println("out of range, please re-input:");
                    }
                }catch (InputMismatchException e){
                    System.out.println("out of range, please re-input:");
                }
            }else{
//                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        }
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for  how much love you will receive?");
                Input = scan.nextInt();
                try {
                    if (Input <= skillPoints) {
                        stats.add(String.valueOf(Input));
                        skillPoints -= Input;
                        notPassing = false;
                    } else {
                        System.out.println("out of range, please re-input:");
                    }
                }catch (InputMismatchException e){
                    System.out.println("out of range, please re-input:");
                }
            }else{
//                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        }
    }

}