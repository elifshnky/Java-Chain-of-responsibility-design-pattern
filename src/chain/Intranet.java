
package chain;


public class Intranet extends Servis {

    @Override
    public void uygula(Istek istek) {
        int ilkIp=IpCozumle.get(istek.getIp());
                if (ilkIp>100 &&ilkIp<200){

        System.out.println("Intranet Ağdaki " + istek.getIp() + " adresine " + istek.getTip()
                + " isteği yapıldı.");
 }else {
    if(getSonraki()!=null){
        getSonraki().uygula(istek);
    }
    }
    }
}
