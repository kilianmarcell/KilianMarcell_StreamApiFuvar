package hu.petrik.streamapifuvar;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Fuvarok f = new Fuvarok("fuvar.csv ");

        //1. feladat
        System.out.printf("1. feladat\n" +
                "A lista hossza: %d\n%n", f.getListaCount());

        //2. feladat
        System.out.printf("2. feladat\n" +
                "A 6185-ös taxis bevétele: %.2f dollár, %d fuvarból állt.\n%n", f.countBevetel(6185), f.countFuvar(6185));

        //3. feladat
        System.out.printf("3. feladat\n" +
                "A taxisok összesen %.2f mérföld távolságot tettek meg:\n%n", f.getTavolsag());

        //4. feladat
        System.out.printf("4. feladat\n" +
                "Időben a leghosszabb fuvar adatai: %s\n%n", f.getLeghosszabbUtazas());

        //5. feladat
        System.out.printf("5. feladat\n" +
                "Legbőkezűbb borravalójú fuvar adatai: %s\n%n", f.getLegtobbBorravalo());

        //6. feladat
        System.out.printf("6. feladat\n" +
                "A 4261-es azonosítójú taxis összesen: %.2f km-t tett meg.\n%n", (f.getTavId(4261) * 0.625));

        //7. feladat
        System.out.printf("7. feladat\n" +
                "Hibás adatok száma: %d, időtartama: %d, bevétele: %.2f",
                f.getHibasakSzama(), f.getHibasakIdotartama(), f.getHibasakBevetele());
    }
}
