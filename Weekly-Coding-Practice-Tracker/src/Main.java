
public class Main {

    public static void main(String[] args) {
        int day = 1;

        int totalAttempted = 0;
        int totalSolved = 0;
        double totalHours = 0.0;

        int productiveDays = 0;
        int nonProductiveDays = 0;

        while (day <= 7) {
            int attempted = 0;
            int solved = 0;
            double hours = 0.0;

            switch (day) {
                case 1:
                    attempted = 8;
                    solved = 6;
                    hours = 2.5;
                    break;
                case 2:
                    attempted = 7;
                    solved = 5;
                    hours = 2.0;
                    break;
                case 3:
                    attempted = 6;
                    solved = 4;
                    hours = 1.5;
                    break;
                case 4:
                    attempted = 9;
                    solved = 7;
                    hours = 3.0;
                    break;
                case 5:
                    attempted = 5;
                    solved = 5;
                    hours = 2.0;
                    break;
                case 6:
                    attempted = 8;
                    solved = 6;
                    hours = 2.5;
                    break;
                case 7:
                    attempted = 7;
                    solved = 4;
                    hours = 2.0;
                    break;
            }

            totalAttempted += attempted;
            totalSolved += solved;
            totalHours += hours;

            if (solved >= 5 && hours >= 2.0) {
                productiveDays++;
            } else {
                nonProductiveDays++;
            }

            day++;
        }

        double successPercentage = 0.0;
        if (totalAttempted != 0) {
            successPercentage = ((double) totalSolved / totalAttempted) * 100;
        }

        double avgSolved = (double) totalSolved / 7;

        String targetStatus = totalSolved >= 35 ? "Achieved" : "Not Achieved";
        String consistencyStatus = productiveDays >= 5 ? "Good" : "Needs Improvement";

        System.out.println("WEEKLY CODING PRACTICE REPORT");
        System.out.println();
        System.out.println("Total Problems Attempted: " + totalAttempted);
        System.out.println("Total Problems Solved: " + totalSolved);
        System.out.println("Success Percentage: " + successPercentage + "%");
        System.out.println("Total Practice Hours: " + totalHours);
        System.out.println("Average Problems Solved Per Day: " + avgSolved);
        System.out.println();
        System.out.println("Productive Days: " + productiveDays);
        System.out.println("Non-Productive Days: " + nonProductiveDays);
        System.out.println();
        System.out.println("Weekly Target: " + targetStatus);
        System.out.println("Consistency Status: " + consistencyStatus);
    }
}
