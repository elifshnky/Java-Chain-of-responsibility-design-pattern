
package chain;


public class Istek {
    
    enum Tip {
        GET,POST,DELETE
    }
    private String ip;
    private Tip tip;
public Istek(String ip,Tip tip){
    setIp(ip);
    setTip(tip);
}
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }
    
}
