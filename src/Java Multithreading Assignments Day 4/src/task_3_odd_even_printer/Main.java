package task_3_odd_even_printer;

public class Main
{
    public static void main(String[] args)
    {
        OddEvenPrinter printer = new OddEvenPrinter();

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}

