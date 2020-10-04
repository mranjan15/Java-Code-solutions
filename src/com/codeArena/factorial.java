package src.com.codeArena;

public class factorial {
    int n;
    int r;

    private int fact(int n)
    {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    public int nPr(int n, int r)
    {
        try {
            return fact(n)/fact(n-r);
        } catch (Exception e){
            System.out.println("exception: "+e.getMessage());
            return 1;
        }
    }
    public int ncr(int n, int r)
    {
        try {
            return fact(n)/fact(n-r)*fact(r);
        } catch (Exception e){
            System.out.println("exception: "+e.getMessage());
            return 1;
        }
    }
}
