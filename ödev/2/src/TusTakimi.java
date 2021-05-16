import java.util.Scanner;
public class TusTakimi implements ITusTakimi{
    Scanner scanner=new Scanner(System.in);
    @Override
    public String isimAl() {
        return scanner.next();
    }

    @Override
    public int parolaAl() {
        return scanner.nextInt();
    }

    @Override
    public int secimAl() {
        return scanner.nextInt();
    }
}
