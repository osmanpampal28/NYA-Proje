public class Eyleyici implements IEyleyici{

    private static Eyleyici instance;
    private IIslem islem;

    public Eyleyici(IIslem islem){
        this.islem=islem;
    }
    @Override
    public void sogutucuAc() {
        islem.islemYap();
    }

    @Override
    public void sogutucuKapat() {
        islem.islemYap();
    }
}
