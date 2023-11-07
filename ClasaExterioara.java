class ClasaExterioara {
    ClasaExterioara(){
        System.out.println("Constructor ClasaExterioara.");
    }

    static class ClasaInStatica {
        ClasaInStatica(){
            System.out.println("Constructor ClasaInStatica.");
        }
        void metoda1(){
            System.out.println("Metoda 1");
        }
        static void metoda2(){
            System.out.println("Metoda 2.");
        }
    }

    class ClasaIn {
        ClasaIn(){
            System.out.println("Constructor ClasaIn.");
        }
        void metoda3(){
            System.out.println("Metoda 3.");
        }
    }
}
