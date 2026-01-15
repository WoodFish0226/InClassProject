import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        player darwin = new player();
        int Input;
        System.out.println("Welcome to the life simulation");
        System.out.println();
        System.out.println("please select your game mode by input the corresponding key:");
        System.out.println("game mode:");
        System.out.println("1:USA");
        System.out.println("2:Asia");
        System.out.println("3:Europe");
        System.out.println("4:Africa");
        Input = scan.nextInt();
        switch (Input) {
            case 1:
                darwin.setGameMode("USA");
            case 2:
                darwin.setGameMode("Asia");
            case 3:
                darwin.setGameMode("Europe");
            case 4:
                darwin.setGameMode("Africa");
        }
        int skillPoints = 100;
        boolean notPassing = true;

        System.out.println("now distribute your ability points, you have 100 point in total:");
        while (notPassing) {
            System.out.println("out of 100 how much you want to give for your IQ?");
            try {
                Input = scan.nextInt();
                if (Input <= 100 && Input >= 0) {
                    darwin.setIQ(Input);
                    skillPoints -= Input;
                    notPassing = false;
                } else {
                    System.out.println("out of range, please re-input:");
                }
            } catch (InputMismatchException e) {
                System.out.println("out of range, please re-input:");
            }
        } //set IQ
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for your EQ?");

                try {
                    Input = scan.nextInt();
                    if (Input <= skillPoints) {
                        darwin.setEQ(Input);
                        skillPoints -= Input;
                        notPassing = false;
                    } else {
                        System.out.println("out of range, please re-input:");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("out of range, please re-input:");
                }
            } else {
                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        } // EQ
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for your look?");
                try {
                    Input = scan.nextInt();
                    if (Input <= skillPoints) {
                        darwin.setLook(Input);
                        skillPoints -= Input;
                        notPassing = false;
                    } else {
                        System.out.println("out of range, please re-input:");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("out of range, please re-input:");
                }
            } else {
//                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        } // set look
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for your health?");
                try {
                    if (Input <= skillPoints) {
                        darwin.setHealth(Input);
                        skillPoints -= Input;
                        notPassing = false;
                    } else {
                        System.out.println("out of range, please re-input:");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("out of range, please re-input:");
                }
            } else {
//                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        } //set health
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for your wealth?");
                Input = scan.nextInt();
                try {
                    if (Input <= skillPoints) {
                        darwin.setHealth(Input);
                        skillPoints -= Input;
                        notPassing = false;
                    } else {
                        System.out.println("out of range, please re-input:");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("out of range, please re-input:");
                }
            } else {
//                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        }// set wealth
        notPassing = true;
        while (notPassing) {
            if (skillPoints <= 100 && Input > 0) {
                System.out.println("out of " + skillPoints + " how much you want to give for  how much love you will receive?");
                Input = scan.nextInt();
                try {
                    if (Input <= skillPoints) {
                        darwin.loveReceiving(Input);
                        skillPoints -= Input;
                        notPassing = false;
                    } else {
                        System.out.println("out of range, please re-input:");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("out of range, please re-input:");
                }
            } else {
//                System.out.println("you have no more point to distribute");
                notPassing = false;
            }
        }//set family love
    }


}