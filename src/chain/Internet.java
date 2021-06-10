
package chain;


public class Internet extends Servis {

    @Override
    public void uygula(Istek istek) {
        int ilkIp = IpCozumle.get(istek.getIp());
        if (ilkIp > 200 && ilkIp < 255) {

            System.out.println("Internet Ağdaki " + istek.getIp() + " adresine " + istek.getTip()
                    + " isteği yapıldı.");
        } else {
            if (getSonraki() != null) {
                getSonraki().uygula(istek);
            }

        }
    }
}
