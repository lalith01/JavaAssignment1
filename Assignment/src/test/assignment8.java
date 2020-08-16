package test;


class genericFunctionClass{


    public <T> void genericFunction(T... args){
        int itemsToPrint = (args.length * 2)/3;
        try{

            // Check the types of arguments passed in
            for(T i : args){
                if(i instanceof String){
                    throw new userException();
                }
            }

            // If the type checking test is passed, then print 2/3 of the values
            for(int i = 0; i <= itemsToPrint ; i ++){
                System.out.println(args[i]);
            }
        }catch(userException e){
            System.out.println(e.getMessage());
        }
    }
}

class userException extends Exception{

    @Override
    public String getMessage() {
        return "Strings not allowed";
    }

}

public class assignment8 {

    assignment8(){
        genericFunctionClass generic = new genericFunctionClass();

        //to test exception handling
        generic.genericFunction(1,2,3,"String");

        //to test printing
        generic.genericFunction(1,2,3,4,5,6,7,8,9,10);

    }

    public static void main(String[] args) {
        assignment8 test = new assignment8();
    }



}