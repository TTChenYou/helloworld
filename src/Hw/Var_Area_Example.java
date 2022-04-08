package Hw;

public class Var_Area_Example
{
    boolean x = true;

    static int n_var1 = 10;
    public void display()
    {
        int n_var2 = 200;
        n_var1 = n_var1 + n_var2;
        System.out.println ("n_var1 = " + n_var1);
            System.out.println("n_var2 =" + n_var2);
    }

    public static void main(String args[])
    {
        int n_var3;
        n_var3 = n_var1 * 2;
        System.out.println("n_var1=" + n_var1);
        System.out.println("n_var3=" + n_var3);
    }
}