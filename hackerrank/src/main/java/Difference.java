/**
 * Created by vidya.priyadarshini on 22/07/16.
 */
class Difference {
    private int[] elements;

    public int maximumDifference;

    public Difference(int[] elements) {
        if(elements.length<1 || elements.length>10) System.exit(0);
        this.elements = elements;

    }

    public void computeDifference() {

        maximumDifference = 0;
        int difference;
        for(int i=0;i<elements.length;i++) {
            if(elements[i]<1 || elements[i]>100) System.exit(0);
           for(int j=i+1;j<elements.length;j++) {

               difference = Math.abs(elements[i] - elements[j]);
               if(difference>maximumDifference) maximumDifference = difference;

           }
        }
    }
}