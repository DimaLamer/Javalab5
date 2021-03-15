class Italian extends Person {
    public Italian() {
        super();
    }

    public Italian(String name, String country,String language) {
        super(name,country,language);
    }
    @Override
    public void PrintCountryName() {
        System.out.printf("Nome: %s \t Nazione: %s \n", super.getName(), super.getCountry());
    }
    @Override
    public void Speak() {
        System.out.println("Questa persona parla italiano");
    }
    @Override
    public void sayHello(){
        System.out.println("Ciao!");
    }
    public void singSong()
    {
        System.out.println("Ti amo \nIn sogno, ti amo \nIn aria, ti amo \nSe viene testa vuol dire che basta lasciamoci \nTi amo \nIo sono, ti amo \nIn fondo un uomo \nChe non ha freddo nel cuore e nel letto, comando io ");
    }
}
