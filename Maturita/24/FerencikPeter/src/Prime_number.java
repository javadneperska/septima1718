public class Prime_number {
    static boolean  prime (int num){
        boolean flag = false;
        int i=2;
        while(i <= num/2)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }

            ++i;
        }

       return flag;
    }
    }

