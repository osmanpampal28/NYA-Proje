public class MerkeziIslemBirimi implements IMerkeziIslemBirimi{

    private IEyleyici eyleyici;
    private ISicaklikAlgilayici sicaklikAlgilayici;
    private IIslem islem;
    public MerkeziIslemBirimi() {

        sicaklikAlgilayici=new SicaklikAlgilayici(new Publisher());
        sicaklikAlgilayici.AboneEkle(new Abone.AboneBuilder().setisim().setsoyisim().setyas().build());
    }

    @Override
    public void eyleyiciyeGonder(int secim) {
        if(secim==1) {
            islem=new SogutucuAcma();
            eyleyici=new Eyleyici(islem);
            eyleyici.sogutucuAc();

        }
        if(secim==2) {
            islem=new SogutucuKapatma();
            eyleyici=new Eyleyici(islem);
            eyleyici.sogutucuKapat();

        }
    }

    @Override
    public void sicaklikAlgilayiciyaGonder() {
        sicaklikAlgilayici.sicaklikOku();
    }
}
