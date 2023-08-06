package Day3;

import java.util.Scanner;

public class Quizery {

    static Scanner sc = new Scanner(System.in);
    static String name;
    static String select;

    public static void main(String[] args) {
        intro();
        section();
        Section2();
        Section3();
    }

    public static void intro() {

        System.out.println(" **        **  ******  **       **      **      **");
        System.out.println(" ** **  ** **    **    ** **    **     ****     **");
        System.out.println(" **   **   **    **    **   **  **    **  **    **");
        System.out.println(" **        **    **    **     ****   ********   **");
        System.out.println(" **        **  ******  **       **  **      **  ********");
        System.out.println("=========");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please ! enter your name :");
        name = sc.nextLine();
        System.out.println("WELCOME TO THE QUIZ..Mr/Mrs." + name);

        System.out.println("Are you excited to play this game? (yes/no)");
        String exci = sc.nextLine();
        if (exci.equalsIgnoreCase("yes")) {
            System.out.println("Then let's start the game");
            System.out.println("These are the rules for the game");
            System.out.println("1. The quiz game has 3different sections.");
            System.out.println(
                    "2. You have to select one of the three sections to play the quiz on the topic you are interested in.");
            System.out.println("3. Every section has 10 questions each and each question contains 10 marks.");
            System.out.println("4. To win the quiz, you must get 8 questions correct, which is 80 percent.");
            System.out.println(
                    "I HOPE YOU UNDERSTOOD THE GAME" + " " + name.toUpperCase() + " " + "So let's play this game");
            System.out.println("=========");
            System.out.println("=========");

        } else if (exci.equalsIgnoreCase("no")) {

        }

    }

    public static void section() {
        int score = 0;
        System.out.println(
                "Choose any one section. If you have selected, type any word from the bracket (sports, history, It)");
        select = sc.nextLine();
        // giving user various section to choose from where he can simply select the
        // quiz option
        switch (select) {

            // in this first case the user select sports..
            case ("sports"):

                System.out
                        .println("Good luck" + " " + name + "! However, please make sure your answers are in capital.");
                // THIS IS THE VERTY FIRST QUESTIION....
                String one = "ARGENTINA";
                System.out.println("1. WHO WON THE WORLD CUP 2023");
                String ans = sc.next();

                // giving if condition if the question is right or wrong.
                if (ans.equals(one)) {

                    System.out.println(
                            "Congrats" + " " + name + "." + ans + " is the correct answer. you recievd 10 points");
                    score++;
                    System.out.println("=========");
                } else {
                    System.out.println("I am sorry" + name + ". That is the the wrong answer.");
                    System.out.println("=========");
                }

                // next question

                System.out.println("2. HOW MANY BALLON D'OR DOES MESSI HAVE?");
                int ball = sc.nextInt();
                if (ball == 7) {
                    System.out.println("You are correct! YOU HAVE RECEIVED 10 POINTS!");
                    score++;
                    System.out.println("=========");
                } else {
                    System.out.println("You are wrong");
                    System.out.println("=========");
                }
                // 3rd question
                System.out.println("3. HOW MANY WWE CHAMPIONSHIPS DOES JOHN CENA HAVE?");

                int john = sc.nextInt();
                if (john == 16) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    score++;
                    System.out.println("=========");
                } else {
                    System.out.println("You are wrong");
                    System.out.println("=========");
                }
                // next qna and answer is KYRIE
                String bk = "KYRIE";
                System.out.println("4.WHO WEARS NUMBER 11 JERSEY FROM BROOKLYN NETS?");
                String kai = sc.nextLine();
                if (kai.equals(bk)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    score++;
                    System.out.println("=========");
                } else {
                    System.out.println("WRONG!");
                    System.out.println("=========");
                }
                // 4TH QNA AND ANSWER IS uruguay
                String uk = "URUGUAY";
                System.out.println("5.WHICH TEAM WON THE FIRST WORLDCUP?");
                String mon = sc.nextLine();
                if (mon.equals(uk)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    score++;
                } else {
                    System.out.println("WRONG!");
                }

                // 6th qna
                System.out.println("6.HOW MANY PLAYER CAN PLAY IN THE BASKETBALL COURT FROM ONE TEAM");
                int call = sc.nextInt();
                if (call == 5) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT!");

                    score++;
                } else {
                    System.out.println("You are wrong");
                }
                // 7th qna
                System.out.println("7.HOW MANY CHAMPIONSHIP RING DOES MICHAEL JORDAN HAVE?");
                int mic = sc.nextInt();
                if (mic == 6) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT!");
                    score++;
                } else {
                    System.out.println("You are wrong");
                }
                // 8thqna
                String fra = "FRANCE";
                System.out.println("8.WHICH TEAM WON THE 2018 WORLDCUP?");
                String hhh = sc.nextLine();
                if (hhh.equals(fra)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    score++;
                } else {
                    System.out.println("WRONG!");
                }
                // 9th qna
                String gg = "RONALDO";

                System.out.println("9.WHICH FOOTBALL PLAYER RECIEVED THE 200 MILLION DOLLAR CONTRACT?");
                String bbb = sc.nextLine();
                if (bbb.equals(gg)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    score++;
                } else {
                    System.out.println("WRONG!");
                }
                // final qna
                String ww = "WILT";
                System.out.println("10. WHICH PLAYER SCORED 100 PONT IN ONE NBA GAME?");
                String iii = sc.nextLine();
                if (iii.equals(ww)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    score++;
                } else {
                    System.out.println("WRONG!");
                }
                System.out.println("This is the end of sports quiz section");

                System.out.println("Your final score is: " + score + " out of 10");

                System.out.println("what did you score?");
                int numm = sc.nextInt();

                if (numm > 7) {
                    System.out.println("CONGRATS" + " " + name.toUpperCase()
                            + "!. YOU HAVE SUCCESSFULLY WON THIS SPORTS SECTION BY CROSSING 80 PERCENT");
                } else {
                    System.out.println("I am sorry " + name + " " + "you lost the game");
                }
                break;
        }

    }

    public static void Section2() {
        int scor = 0;
        System.out.println(
                "Choose any one section. If you have selected, type any word from the bracket (sports, history, It)");
        select = sc.nextLine();
        switch (select) {
            case "It":
                System.out.println("Good luck for this it game where it contains total of 5 questions" + " "
                        + name.toUpperCase() + "! However, please make sure your answers are in capital.");
                System.out.println("Goodluck" + " " + name.toUpperCase()
                        + "! However please make sure your answers are in capital");
                // 1st question:
                String java = "JAMES GOSLING";
                System.out.println("1.WHO CREATED JAVA PROGRAMMING LANGUAGE");
                String jav = sc.nextLine();

                if (jav.equals(java)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    scor++;
                } else {
                    System.out.println("WRONG!");
                }
                // SECOND QNA:
                System.out.println("2.HOW MANY USABLE RESERVED WORDS ARE THERE IN JAVA?");
                int rese = sc.nextInt();
                if (rese == 48) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT!");
                    scor++;
                } else {
                    System.out.println("You are wrong");
                }
                // 3rd question:
                System.out.println("3.HOW MANY BITS IS THERE IN ONE BYTE");
                int biti = sc.nextInt();
                if (biti == 8) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    scor++;
                } else {
                    System.out.println("You are wrong");
                }
                // 4th question:
                String jm = "CHAR";
                System.out
                        .println("4.WHICH DATA TYPE IS USED WHEN WE NEEWD TO INITIALIZE ONE CHARACTER TO A VARIABLE ?");
                String jam = sc.nextLine();
                if (jam.equals(jm)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    scor++;
                } else {
                    System.out.println("WRONG!");
                }
                // 5TH QNA
                String typ = "BOOLEAN";
                System.out.println("5.WHICH DATATYPE GIVE TRUE OR FALSE IN JAVA?");
                String dat = sc.nextLine();
                if (jam.equals(typ)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    scor++;
                } else {
                    System.out.println("WRONG!");
                }
                // 6th qna
                String cz = "UPDATE";
                System.out.println("6.WHICH DATATYPE IS USED TO UODATE A DATA?");
                String data = sc.nextLine();
                if (data.equals(cz)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    scor++;
                } else {
                    System.out.println("WRONG!");
                }
                // 7th qna
                String mb = "NONPRIMITIVE";
                System.out.println("7.WHICH DATATYPE  OS CLASS IN JAVA?");
                String dt = sc.nextLine();
                if (dt.equals(mb)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    scor++;
                } else {
                    System.out.println("WRONG!");
                }
                // 8th qna
                System.out.println("8.HOW MANY Byte IS THERE IN float datatype?");
                int bti = sc.nextInt();
                if (bti == 4) {
                    scor++;
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                } else {
                    System.out.println("You are wrong");
                }
                // 9th
                System.out.println("9.HOW MANY ByteS IS THERE IN boolean datatype ?");
                int bii = sc.nextInt();
                if (bii == 1) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    scor++;
                } else {
                    System.out.println("You are wrong");
                }

                // 10th
                String emb = "ELON MUSK";
                System.out.println("10. WHO CREATED CHAT-GPT?");
                String Cdt = sc.nextLine();
                if (Cdt.equals(emb)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    scor++;
                } else {
                    System.out.println("WRONG!");
                    System.out.println("This is the end of sports quiz section");

                    System.out.println("Your final score is: " + scor + " out of 3");
                    System.out.println("what is your score");
                    int numm = sc.nextInt();
                    if (numm > 7) {
                        System.out.println("CONGRATS" + " " + name.toUpperCase()
                                + "!. YOU HAVE SUCCESSFULLY WON THIS SPORTS SECTION BY CROSSING 80 PERCENT");

                    } else {
                        System.out.println("I am sorry" + name + " " + "you lost the game");

                    }
                    break;
                }
        }
    }

    public static void Section3() {
        System.out.println(
                "Choose any one section. If you have selected, type any word from the bracket (sports, history, It )");
        select = sc.nextLine();
        switch (select) {

            case "history":
                int sccr = 0;
                System.out.println("Good luck for this it game where it contains total of 5 questions" + " "
                        + name.toUpperCase() + "! However, please make sure your answers are in capital.");
                System.out.println("Goodluck" + " " + name.toUpperCase()
                        + "! However please make sure your answers are in capital");
                // 1st question:
                String ja = "JUNG BAHADUR RANA";
                System.out.println("1.Who is the first Nepali to visit the UK?");
                String ju = sc.nextLine();

                if (ju.equals(ja)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    sccr++;
                } else {
                    System.out.println("WRONG!");
                }
                // SECOND QNA:
                System.out.println("2.When  was Bhimsen Thapa born?");
                int rse = sc.nextInt();
                if (rse == 1832) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT!");
                    sccr++;
                } else {
                    System.out.println("You are wrong");
                }
                // 3rd question:
                System.out.println("3.When was the first ‘Muluki Act’ introduced in Nepal?");
                int bKi = sc.nextInt();
                if (bKi == 1910) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    sccr++;
                } else {
                    System.out.println("You are wrong");
                }
                // 4th question:
                String jKKm = "TRICHANDRA";
                System.out.println("4. Which is the first college in Nepal?");
                String jKKam = sc.nextLine();
                if (jKKam.equals(jKKm)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    sccr++;
                } else {
                    System.out.println("WRONG!");
                }
                // 5TH QNA
                String tVyp = "PRACHANDEV";
                System.out.println("5.Who built the Pashupatinath Temple?");
                String daJt = sc.nextLine();
                if (daJt.equals(tVyp)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    sccr++;
                } else {
                    System.out.println("WRONG!");
                }

                // 6th qna
                String L = "YOGANENDRA MALLA";
                System.out.println("6.Who is the King who is believed to be still alive?");
                String KI = sc.nextLine();
                if (KI.equals(L)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    sccr++;
                } else {
                    System.out.println("WRONG!");
                }
                // 7th qna
                String mJJb = "CHANDRA SHAMSHER";
                System.out.println("7 Who is known as ‘The Tiger of tHe House’?");
                String dJt = sc.nextLine();
                if (dJt.equals(mJJb)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    sccr++;
                } else {
                    System.out.println("WRONG!");
                }
                // 8th qna
                System.out.println("8.How many years did the Gopal dynasty rule in Nepal?");
                int MbtLLi = sc.nextInt();
                if (MbtLLi == 521) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    sccr++;
                } else {
                    System.out.println("You are wrong");
                }
                // 9th
                System.out.println("9.When WAS THE FIRST TIME WHERE COMPUTER WAS USED  ?");
                int biLLMi = sc.nextInt();
                if (biLLMi == 2028) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    sccr++;
                } else {
                    System.out.println("You are wrong");
                }

                // 10th
                String eKmb = "BHIM SHAMSHER";
                System.out.println("10.  Who INTRODUCED Saturday as Holidays custom in Nepal?");
                String CdJt = sc.nextLine();
                if (CdJt.equals(eKmb)) {
                    System.out.println("You are correct! YOUHAVE RECIEVED 10 POINT");
                    sccr++;
                } else {
                    System.out.println("WRONG!");
                    System.out.println("This is the end of sports quiz section");
                    System.out.println("Your final score is: " + sccr + " out of 3");
                    System.out.println("WHATS YOUR SCORE?");
                    int numm = sc.nextInt();
                    if (numm > 7) {
                        System.out.println("CONGRATS" + " " + name.toUpperCase()
                                + "!. YOU HAVE SUCCESSFULLY WON THIS SPORTS SECTION BY CROSSING 80 PERCENT");
                    } else {
                        System.out.println("I am sorry" + name + " " + "you lost the game");

                    }
                }

        }
    }

}
