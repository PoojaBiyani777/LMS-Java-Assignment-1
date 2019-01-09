package pooja.assignment.main;

import pooja.assignment.data.DataClass;
import pooja.assignment.singleton.SingletonClass;

public class MainClass {

    public static void main(String args[]) {

        DataClass dataObject = new DataClass();
        dataObject.printMemberVariables();
        dataObject.printLocalVariables();  //Error

        SingletonClass singletonObject = new SingletonClass("Hello");
        singletonObject.staticMethod("Hi"); // Error
        singletonObject.printString();
    }

}
