public class Lab5 {
    public static void main(String[] args) {
        Ukranian ivan = new Ukranian("Іван", "Ukraine", "українська");
        Ukranian ivan2 = new Ukranian("Іван", "Ukraine", "українська");
        Ukranian igor = new Ukranian();
        Italian louis = new Italian("Louis", "Italia", "italiano");
        Hello hello = (new Ukranian("Петро", "Ukraine", "українська"));
        ((Ukranian) hello).PrintCountryName();
        hello.sayHello();
        hello.Speak();
        ivan.PrintCountryName();
        ivan.Speak();
        ivan.sayHello();
        igor.sayHelloBack();
        igor.PrintCountryName();
        igor.Speak();
        louis.PrintCountryName();
        louis.Speak();
        louis.sayHello();
        louis.singSong();
        Ukranian.print();
        System.out.println(ivan.compare(igor));
        System.out.println(ivan2.compare(ivan));
    }
}

