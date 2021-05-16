import java.util.Random;
import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu{

    private Scanner scanner=new Scanner(System.in);
    private IMerkeziIslemBirimi merkeziIslemBirimi;

    public AgArayuzu(){
        merkeziIslemBirimi=new MerkeziIslemBirimi();
    }

    @Override
    public void sicaklikGonder() {
        merkeziIslemBirimi.sicaklikAlgilayiciyaGonder();
    }

    @Override
    public void istekGonder(int secim) {
        merkeziIslemBirimi.eyleyiciyeGonder(secim);
    }

    @Override
    public void girdiMesajiGoruntule(String mesaj) {
        System.out.println(mesaj);
    }

    @Override
    public void mesajGoruntule(String mesaj) {
        System.out.println(mesaj);
    }


}
