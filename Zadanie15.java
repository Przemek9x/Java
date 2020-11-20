package zadanie15;

public class Zadanie15
{
    public static void main(String[] args)
    {
        double kwota, cena, prowizja, suma;
        int ilosc;
        
        ilosc = 600;
        cena = 21.77;
                
        kwota = ilosc * cena;
        prowizja = kwota * 0.2;
        suma = kwota + prowizja;
        
        System.out.println("Kwota akcji wynosi: " + kwota);
        System.out.println("Prowizja akcji wynosi: " + prowizja);
        System.out.println("Sumaryczna kwota akcji wynosi: " + suma);
        
    }
}