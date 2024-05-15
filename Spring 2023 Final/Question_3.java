import java.io.*;
import java.util.*;


class Employee{

    String name;
    int id;
    int[] performanceScore = new int[6]; // [0, 0, 0, 0, 0, 0


    public static double performanceAverage(int[] performanceScore){
        double sum = 0.0;
        for(int i=0; i<6; i++){
            sum += performanceScore[i];
        }
        return (sum/6.0);

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];

        PrintWriter w = new PrintWriter("employee.txt");

        for(int i=0; i<n; i++){
            System.out.println("Enter the details of employee "+(i+1)+": ");
            emp[i] = new Employee();
            System.out.println("Enter the name: ");
            emp[i].name = sc.next();
            System.out.println("Enter the id: ");
            emp[i].id = sc.nextInt();
            System.out.println("Enter the performance score of last 6 month: ");
            for(int j=0; j<6; j++){
                emp[i].performanceScore[j] = sc.nextInt();
            }
            System.out.println();
        }

       for(int i = 0;i< emp.length;i++)
       {
           w.println("Employee "+(i+1)+": "+emp[i].name);
           w.println("Employee "+(i+1)+": "+emp[i].id);
           w.println("Employee "+(i+1)+": "+performanceAverage(emp[i].performanceScore));
       }
       w.close();


        FileReader fr = new FileReader("employee.txt");
        PrintWriter w1 = new PrintWriter("increment.txt");

        Scanner sc1 = new Scanner(fr);

        double maxScore = Double.MIN_VALUE;
        String maxScoreName = "";

        while(sc1.hasNextLine()){
            String nameLine = sc.nextLine();
            String idLine = sc.nextLine();
            String AvgPerformanceLine = sc.nextLine();

            String name = nameLine.split(": ")[1];
            int id = Integer.parseInt(idLine.split(": ")[1]);
            double avgPerformance = Double.parseDouble(AvgPerformanceLine.split(": ")[1]);

           maxScore = Math.max(maxScore, avgPerformance);
           if(maxScore == avgPerformance){
                maxScoreName = name;
            }

            if(avgPerformance > 75){
                w1.println(name);
            }
        }
        w1.close();

        System.out.println("Maximum Average Performance: "+maxScoreName+" with score: "+maxScore);



    }
}
