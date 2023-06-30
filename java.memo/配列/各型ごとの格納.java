public class Main {
    public static void main(String[] args) {
        int[] points = new int[4];
        double[] weight = new double[5];
        boolean[] answers = new boolean[3];
        String[] names = new String[3];
        
        // Assign values to the arrays
        points[0] = 80;
        points[1] = 90;
        points[2] = 75;
        points[3] = 85;
        
        weight[0] = 0.5;
        weight[1] = 0.3;
        weight[2] = 0.2;
        weight[3] = 0.4;
        weight[4] = 0.6;
        
        answers[0] = true;
        answers[1] = false;
        answers[2] = true;
        
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        
        // Print the values of the arrays
        System.out.println("Points:");
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
        
        System.out.println("Weight:");
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }
        
        System.out.println("Answers:");
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
        
        System.out.println("Names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
