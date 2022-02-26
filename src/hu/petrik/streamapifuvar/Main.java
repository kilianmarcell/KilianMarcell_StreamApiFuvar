package hu.petrik.streamapifuvar;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Fuvar f = new Fuvar("fuvar.csv ");

        System.out.println("A lista hossza: " + f.getListaCount());
    }
}
