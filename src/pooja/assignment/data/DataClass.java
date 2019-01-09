package pooja.assignment.data;

public class DataClass {
    private int integerMemberVariable;
    private char charMemberVariable;

    // method to print the values of member variables
        public void printMemberVariables(){
            System.out.println("Member variables are :\n integerMemberVariable : "+ integerMemberVariable +"\n charMemberVariable: " +charMemberVariable);
        }


        //methos to print the values of local variables
        /* Error as local variables should be initialized before use .*/
        public void printLocalVariables(){

        int integerLocalVariable;
        char charLocalVariable;
            System.out.println("Local variables are :\n integerLocalVariable "+ integerLocalVariable +"\n charLocalVariable " + charLocalVariable);

        }


}
