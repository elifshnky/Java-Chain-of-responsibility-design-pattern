
package chain;


public class IpCozumle {
    public static int get(String ip){
        String[] parcalar=ip.split("\\.");
        
        if (parcalar.length>0){
            return Integer.parseInt(parcalar[0]);
        }
        return 300;
    }
}
