import java.sql.*;

public class VeriTabani implements IVeriTabani{
    private static VeriTabani instance;

    private VeriTabani(){

    }
    public static VeriTabani getInstance(){
        if(instance==null){
            instance=new VeriTabani();
        }
        return instance;
    }

    @Override
    public boolean dogrulama(String isim, int parola) {

        try{
            Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/nyat",
                    "postgres","terminator13");
            if(conn!=null)
                System.out.println("veritabanı sorunsuz bağlandı");
            else
                System.out.println("veritabanı bağlanamadı");

            /*String sql="SELECT * FROM public.\"kullanici\"";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);

            while(rs.next()){
                String ad=rs.getString("ad1");
                int sifre=rs.getInt("parola1");
                if(ad==isim && sifre==parola) {
                    sayac+=1;
                    break;
                }
            }*/
            String sql= "SELECT * FROM public.\"kullanici\" WHERE \"ad1\"="+"'"+isim+"'"+"AND \"parola1\"="+"'"+parola+"'";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            conn.close();

            if(!rs.next()){
                return false;
            }
            else{
                System.out.println("Kullanıcı doğrulama işlemi başarılı..!");
                return true;
            }

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
