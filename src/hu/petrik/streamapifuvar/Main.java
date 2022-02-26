package hu.petrik.streamapifuvar;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Fuvarok f = new Fuvarok("fuvar.csv ");

        //1. feladat
        System.out.println("1. feladat");
        System.out.println("A lista hossza: " + f.getListaCount());
        System.out.println();

        //2. feladat
        System.out.println("2. feladat");
        System.out.println("A 6185-ös taxis bevétele: " + f.countBevetel(6185) +
                " dollár, " + f.countFuvar(6185) + " fuvarból állt.");
        System.out.println();

        //3. feladat
        System.out.println("3. feladat");
        System.out.println("A taxisok összesen " + f.getTavolsag() +
                " mérföld távolságot tettek meg.");
        System.out.println();

        //4. feladat
        System.out.println("4. feladat");
        System.out.println("Időben a leghosszabb fuvar adatai:\n" + f.getLeghosszabbUtazas());
        System.out.println();

        //5. feladat
        System.out.println("5. feladat");
        System.out.println("Legbőkezűbb borravalójú fuvar adatai:\n" + f.getLegtobbBorravalo());
        System.out.println();
    }
}
