package com.company;

public class StudentModel {
    // Array of STUDENT and assignment
    final private String[] STUDENT = {"Roger", "Mary Anne", "Melissa","Brian", "Daniel", "David"};
    final private String[] ASSIGNMENT = {"LM01", "LM02", "LM03", "LM04", "LM05"};

    //base empty constructor
    StudentModel(){ }

    /**
     * retrieves a random selected student element from the STUDENT array
     * @return String of student element
     */
    public String getStudent(){
        int studentIndex = (int) (java.lang.Math.random() * STUDENT.length);
        return STUDENT[studentIndex];
    }
    public String getAssignment(){
        int assignmentIndex = (int) (java.lang.Math.random() * ASSIGNMENT.length);
        return ASSIGNMENT[assignmentIndex];
    }
}
