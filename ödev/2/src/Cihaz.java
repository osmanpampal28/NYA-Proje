public class Cihaz {
    private IAgArayuzu agArayuzu;
    private ITusTakimi tusTakimi;
    private IVeriTabani veriTabani;
    private IAraclar araclar;

    private final int sogutucuAc=1;
    private final int sogutucuKapat=2;
    private final int sicaklikOlc=3;
    private final int cikis=4;

    public Cihaz(IVeriTabani iVeriTabani){
        agArayuzu=new AgArayuzu();
        tusTakimi=new TusTakimi();
        araclar=new Araclar();
        veriTabani=iVeriTabani;
    }

    public void basla(){
        agArayuzu.mesajGoruntule("cihaz başlatılıyor");
        agArayuzu.mesajGoruntule("kullanıcı adı ve şifre giriniz");

        String ad;
        int parola;

        agArayuzu.mesajGoruntule("kullanıcı adı giriniz : ");
        ad=tusTakimi.isimAl();
        agArayuzu.girdiMesajiGoruntule("parola giriniz : ");
        parola=tusTakimi.parolaAl();

        araclar.Bekle(200);

        if(veriTabani.dogrulama(ad,parola))
            islemSec();
        else
            agArayuzu.girdiMesajiGoruntule("kullanıcı doğrulanamadı");
    }
    public void islemSec(){
        int secme;
        do{
            menuGetir();
            secme=menuyuGoster();
            switch (secme){
                case sogutucuAc:
                    agArayuzu.istekGonder(1);
                    break;
                case sogutucuKapat:
                    agArayuzu.istekGonder(2);
                    break;
                case sicaklikOlc:
                    agArayuzu.sicaklikGonder();
                    break;
                case cikis:
                    System.out.println("cıkış yapılıyor");
                    break;
                default:
                    System.out.println("1-4 arasında bir şey girmeniz gerekiyor");
                    break;
            };
        }while(secme!=4);
    }
    public int menuyuGoster(){

        return tusTakimi.secimAl();
    }
    public void menuGetir(){
        System.out.println();
        agArayuzu.mesajGoruntule("1-Soğutucu Aç");
        agArayuzu.mesajGoruntule("2-Soğutucu Kapat");
        agArayuzu.mesajGoruntule("3-Sıcaklık Görüntüle");
        agArayuzu.mesajGoruntule("4-Çıkış");
        System.out.println();
    }
}
