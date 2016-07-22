/**
 * Created by vidya.priyadarshini on 22/07/16.
 * Refer resources/Inheritance.pdf
 */
public class Student extends Person {

        private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName,lastName,identification);
        this.testScores = scores;

    }

    public int[] getTestScores() {
        return testScores;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }

    public char calculate() {

        double average = computeAverage();

        if(average>=90 && average<=100) return 'O';
        if(average>=80 && average<90) return 'E';
        if(average>=70 && average<80) return 'A';
        if(average>=55 && average<70) return 'P';
        if(average>=40 && average<55) return 'D';
        if(average<40) return 'T';

        return 0;
    }

    private double computeAverage() {

        int sum=0;
        int[] testScores = this.getTestScores();
        for(int i=0;i<testScores.length;i++) {
            if(testScores[i]<0 || testScores[i]>100) System.exit(0);
                   sum = sum + testScores[i];
        }

        return sum / testScores.length;
    }
}

