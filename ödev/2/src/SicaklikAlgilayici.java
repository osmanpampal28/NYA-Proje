import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici{

    private int sicaklik;
    private Random random=new Random();
    private ISubject publisher;
    private IIslem islem;

    public SicaklikAlgilayici(ISubject publisher){
        this.publisher=publisher;
        this.islem=new SicaklikOlcme();
    }

    @Override
    public void sicaklikOku() {
        sicaklik=Math.abs(random.nextInt()%100);
        islem.islemYap();
        System.out.println("sicaklık : "+sicaklik+" derece");
        if(sicaklik>50){
            publisher.notify("Sıcaklık 50 derecenin üzerine çıktı! Lütfen soğutucuyu açınız!");
        }
    }

    @Override
    public void AboneEkle(IObserver abone) {
        publisher.attach(abone);
    }
}
