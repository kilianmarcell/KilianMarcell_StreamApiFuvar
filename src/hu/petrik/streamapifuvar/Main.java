package hu.petrik.streamapifuvar;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Fuvar f = new Fuvar("fuvar.csv ");

        System.out.println("A lista hossza: " + f.getListaCount());
        System.out.println("A 6185-ös taxis bevétele: " + f.countBevetel(6185) +
                " dollár, " + f.countFuvar(6185) + " fuvarból állt.");
    }
}
