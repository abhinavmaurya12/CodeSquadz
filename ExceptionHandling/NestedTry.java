class NestedTry {

    public static void main(String args[]) {

        try{

            try{

                int a=10/0;

            }

            catch(Exception e){

                System.out.println("Inner");

            }

        }

        catch(Exception e){

            System.out.println("Outer");

        }
            // System.out.println("Executed Success...");
          
    }
}