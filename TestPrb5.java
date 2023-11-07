public class TestPrb5 {
    TestPrb5(){
        System.out.println("Constructor TestPrb5.");
    }
    public static void main(String[] args) {
        ClasaExterioara cx=new ClasaExterioara();
        //ClasaExterioara.ClasaIn ci=new ClasaExterioara.ClasaIn();
        ClasaExterioara.ClasaIn ci=cx.new ClasaIn();
        ci.metoda3();
        ClasaExterioara.ClasaInStatica cis=new ClasaExterioara.ClasaInStatica();
        cis.metoda1();
    }
}

//Output:
        /*Constructor ClasaExterioara.
        Constructor ClasaIn.
        Metoda 3.
        Constructor ClasaInStatica.
        Metoda 1*/