package pooja.assignment.singleton;

public class SingletonClass {

    String nonStaticString;

    public SingletonClass(String nonStaticString) {
        this.nonStaticString = nonStaticString;
    }

    /*
    //Static method to initialize non-static string*/

    public static SingletonClass staticMethod(String str)
    {
        //Error:(14, 9) java: non-static variable this cannot be referenced from a static context
        this.nonStaticString=str;
        SingletonClass object=new SingletonClass();
        return object;
    }


    //non - static method to print the string
    public void printString(){
        System.out.println("The string is : "+ nonStaticString);
    }


}
