package exercise.test04.example3;

public class PrinterTest {

    public static void main(String[] args) {

        Printer printer = new Printer("애플프린터", "애플","병렬 인터페이스",10000,1000);
        InkjetPrinter inkjetPrinter = new InkjetPrinter("삼성프린터","삼성","USB",92,191,500);
        LaserPrinter laserPrinter = new LaserPrinter("LG프린터","LG","병렬인터페이스",39,240,500);

        printer.print(printer.pages);
        System.out.println("----------------------------");
        inkjetPrinter.print(inkjetPrinter.pages);
        System.out.println("----------------------------");
        laserPrinter.print(laserPrinter.pages);



    }
}
