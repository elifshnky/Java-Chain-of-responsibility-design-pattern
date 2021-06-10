package chain;

public class Chain {

    public static void main(String[] args) {
        Yerel yerel = new Yerel();
        Intranet intranet = new Intranet();
        Internet internet = new Internet();

        internet.setSonraki(intranet);
        intranet.setSonraki(yerel);
        internet.uygula(new Istek("150.0.0.1", Istek.Tip.GET));
        //intranet.uygula(new Istek("250.0.0.1",Istek.Tip.GET));
    }

}
