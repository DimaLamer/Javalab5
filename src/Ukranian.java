class Ukranian extends Person {

    private static int count = 0;
    public Ukranian() {
        super();
        count++;
    }
    static void print(){
        System.out.printf("Кількість об'єктів українець %d \n",count);
    }

    public Ukranian(String name, String country,String language) {
        super(name,country,language);count++;
    }

    @Override
    public void PrintCountryName() {
        System.out.printf("Ім'я: %s \t Країна: %s \n", super.getName(), super.getCountry());
    }
    protected boolean compare(Ukranian u)
    {
        return (u.getName()==this.getName()) & (u.getCountry() == this.getCountry())& (u.getLanguage() == this.getLanguage());
    }
    @Override
    public void Speak() {
        System.out.println("Ця людина розмовляє українською");
    }
    @Override
    public void sayHello(){
        System.out.println("Слава Україні!");
    }
    public void sayHelloBack(){
        System.out.println("Героям слава!");
    }
}

