
package chain;


public abstract class Servis {
private Servis sonraki;

    public Servis getSonraki() {
        return sonraki;
    }

    public void setSonraki(Servis sonraki) {
        this.sonraki = sonraki;
    }

    public abstract void uygula(Istek istek);
       
        
    
}
