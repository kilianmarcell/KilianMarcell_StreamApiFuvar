package hu.petrik.streamapifuvar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fuvarok {
    private List<Fuvar> lista;

    public Fuvarok(String fajlnev) throws IOException {
        lista = new ArrayList<>();
        FileReader fr = new FileReader(fajlnev);
        BufferedReader br = new BufferedReader(fr);

        br.readLine();
        String s = br.readLine();

        while (s != null) {
            lista.add(new Fuvar(s));
            s = br.readLine();
        }

        br.close();
        fr.close();
    }

    public List<Fuvar> getLista() {
        return lista;
    }

    public long getListaCount() {
        return this.lista.stream()
                .count();
    }

    public long countFuvar(int id) {
        return lista.stream()
                .filter(t -> t.getAzonosito() == id)
                .count();
    }

    public double countBevetel(int id) {
        return lista.stream()
                .filter(t -> t.getAzonosito() == id)
                .mapToDouble(Fuvar::getBevetel)
                .sum();
    }

    public double getTavolsag() {
        return lista.stream()
                .mapToDouble(Fuvar::getTav)
                .sum();
    }

    public Fuvar getLeghosszabbUtazas() {
        return lista.stream()
                .max(Comparator.comparingInt(Fuvar::getUtazas_ideje))
                .get();
    }

    public Fuvar getLegtobbBorravalo() {
        return lista.stream()
                .max(Comparator.comparingDouble(Fuvar::getBorravalo))
                .get();
    }
}
