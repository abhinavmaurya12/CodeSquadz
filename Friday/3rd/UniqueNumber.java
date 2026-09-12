//unique number 12345, not unique number 12445.
//if..digit are not repeated 'unique'. else 'not unique'.
class UniqueNumber
{
    public static void main(String args[])
    {
        int i, j, num = 12345;
        int x, y;
        boolean unique = true;

        // System.out.printf("Enter the number: ");
        // num = new java.util.Scanner(System.in).nextInt();
		
        x = num;
        for(i = 1; i <= 5; i++)
        {
            int d1 = x % 10;
            y = x / 10;
            for(j = i + 1; j <= 5; j++)
            {
                int d2 = y % 10;
                if(d1 == d2)
                {
                    unique = false;
                    break;
                }
                y = y / 10;
            }
            if(unique == false)
                break;
            x = x / 10;
        }
        if(unique)
            System.out.println("Unique Number");
        else
            System.out.println("Not Unique Number");
    }
}
		


