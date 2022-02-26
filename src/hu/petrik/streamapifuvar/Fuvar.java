package hu.petrik.streamapifuvar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fuvar {
    private List<Taxi> lista;

    public Fuvar(String fajlnev) throws IOException {
        lista = new ArrayList<>();
        FileReader fr = new FileReader(fajlnev);
        BufferedReader br = new BufferedReader(fr);

        br.readLine();
        String s = br.readLine();

        while (s != null) {
            lista.add(new Taxi(s));
            s = br.readLine();
        }

        br.close();
        fr.close();
    }
}
