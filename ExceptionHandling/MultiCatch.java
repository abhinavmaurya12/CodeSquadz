class MultiCatch {

    public static void main(String args[]) {

        try{

            int a[]=new int[2];

            a[5]=10;

        }

        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Array Error");

        }

        catch(Exception e){

            System.out.println("General Exception");

        }

    }
}