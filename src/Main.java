import java.util.Random;

public class Main {
    public static String permission(int age, int temp){
        if (age <= 20 && age <=45 && temp <=-20 &&temp <=30) {
            return " можно идти гулять";

        } else if (age <20 && temp >= 0 && temp <=28 ) {
            return "можно идти гулять";

        } else if (age >45 && temp >= -10 && temp <=25 ) {
            return "можно идти гулять ";


        } else {
            return " оставайся дома ";

        }
    }
    public static void  main (String[] args) {

        for (int i = 0; i < 9; i++) {
            int age = generateRandomAge();
            int temp = generateRandomTemp();
            System.out.println(" возраст : " + age + ", Temp:" + temp + " - " + permission(age ,  temp));

        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(100);

    }
    public static int generateRandomTemp(){
        Random random = new Random();
        return random.nextInt(66) -30;

    }


}