package zadanie84;

public class Zadanie84
{
    public static void main(String[] args)
    {
        System.out.println("CELCIUS\t\tFAHRENHEIT");
        System.out.println("---------------------------");
        for (int c = 0; c <= 20; c++)
        {
            double F = (9/5)* c + 32;
            System.out.println(c + "\t\t" + F);
        }
        System.out.println("---------------------------");
    }
}
