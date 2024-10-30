import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        String name = "Muhammad Anas";
        int rollNo = 221004;
        int pf = 98;
        int pfl = 93;
        int eng = 93;
        int cal = 87;
        int ap = 84;
        int totalMarks = pf + pfl + cal + eng + ap;
        int percentage = (totalMarks)/5;
        double cgpa;
        if (percentage > 90) {
            cgpa = 4.0;
        } else if (percentage > 80 && percentage <= 90) {
            cgpa = 3.5;
        } else if (percentage > 70 && percentage <= 80) {
            cgpa = 3.0;
        } else if (percentage > 60 && percentage <= 70) {
            cgpa = 2.5;
        } else if (percentage > 50 && percentage <= 60) {
            cgpa = 2.0;
        } else {
            cgpa = 1.0;
        }

        System.out.println("--------------------");
        System.out.println("DHA SUFFA UNIVERSITY");
        System.out.println("--------------------");
        System.out.println("     Transcript");


        System.out.println("---------------------------------------------------------");
        System.out.println("Name = " + name + "\t\t\t\tRoll no. = " + rollNo);
        System.out.println("---------------------------------------------------------");
        System.out.println("Subject"  + "\t\t\t\t\t\t\t\t\tMarks" );
        System.out.println("---------------------------------------------------------");
        System.out.println("Pogramming Fundamentals\t\t\t\t\t"+ pf);
        System.out.println("Pogramming Fundamentals Lab\t\t\t\t"+ pfl);
        System.out.println("Applied Physic\t\t\t\t\t\t\t"+ ap);
        System.out.println("English\t\t\t\t\t\t\t\t\t"+ eng);
        System.out.println("Calculus\t\t\t\t\t\t\t\t"+ cal);
        System.out.println("---------------------------------------------------------");
        System.out.println("Percentage =\t\t\t\t\t\t\t"+ percentage +"%");
        System.out.println("Cgpa =\t\t\t\t\t\t\t\t\t" + cgpa);
        System.out.println("---------------------------------------------------------");
    }
}


