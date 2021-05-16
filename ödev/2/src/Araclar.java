public class Araclar implements IAraclar{

    @Override
    public void Bekle(int sure) {
        try {
            Thread.sleep(sure);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
