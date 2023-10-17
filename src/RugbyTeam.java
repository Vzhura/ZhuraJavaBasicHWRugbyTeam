import java.util.Random;

public class RugbyTeam {

    public static void main(String[] args) {

        int numberOfPlayers = 25;
        int minAge = 18;
        int maxAge = 40;
        Random random = new Random();

        int[] teamAAge = new int[numberOfPlayers];
        int[] teamBAge = new int[numberOfPlayers];

        System.out.println("Команда A:");
        for (int i = 0; i < numberOfPlayers; i++) {
            int age = random.nextInt(maxAge - minAge + 1) + minAge;
            teamAAge[i] = age;
            System.out.print(age + " ");
        }

        System.out.println("\nКоманда B:");
        for (int i = 0; i < numberOfPlayers; i++) {
            int age = random.nextInt(maxAge - minAge + 1) + minAge;
            teamBAge[i] = age;
            System.out.print(age + " ");
        }

        double avgAgeTeamA = calculateAverage(teamAAge);
        double avgAgeTeamB = calculateAverage(teamBAge);

        System.out.println("\nСередній вік команди A: " + avgAgeTeamA);
        System.out.println("Середній вік команди B: " + avgAgeTeamB);
    }

    public static double calculateAverage(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}

