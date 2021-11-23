public class Kalpana {
    public static void main(String args[])
	{
        int n=23;
       
       
        System.out.println("number is odd? "+isodd(n));
    }
    public static boolean isodd(int n){
        // return (n&1)==1;
        n=n&1;
        if(n==1){
            return true;
        }
        return false;
    }
    
}
