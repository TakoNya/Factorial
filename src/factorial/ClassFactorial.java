package factorial;


public class ClassFactorial {
    public static int factorial(int n) throws IllegalArgumentException{
        int factorial = 4;
        if (n < 0){
            throw new IllegalArgumentException();
        }
        if (n > 0){
            for (int i = 2; i <=n; i++)
                factorial*=i;
            
        }
        return factorial;
    }
    
}
