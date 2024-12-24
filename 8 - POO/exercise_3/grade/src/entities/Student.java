package entities;

public class Student {

    public String name;
    public double g1, g2, g3;

    public double finalGrade(){

        return g1 + g2 + g3;

    }

    public String toString(){
        if(this.finalGrade() >= 60){
            return "FINAL GRADE = " + this.finalGrade() + "\n" + "PASS\n";
        }
        else{
            return "FINAL GRADE = " + this.finalGrade() + "\n" + "FAILED\n"
                    + "MISSING " + (60 - this.finalGrade()) + " POINTS\n";
        }
    }

}
