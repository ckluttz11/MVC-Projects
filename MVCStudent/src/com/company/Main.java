package com.company;

public class Main {

    public static void main(String[] args) {
        StudentModel model = new StudentModel();
        StudentView view = new StudentView(model);
        StudentController controller = new StudentController(model, view);
        view.setVisible(true);
    }
}
