package hu.petrik.streamapifuvar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fuvar {
    private int azonosito;
    private LocalDateTime indulas;
    private int utazas_ideje;
    private double tav;
    private double viteldij;
    private double borravalo;
    private String fizetesModja;

    private DateTimeFormatter formazo = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Fuvar(String sor) {
        String[] adatok = sor.split(";");
        this.azonosito = Integer.parseInt(adatok[0]);
        this.indulas = LocalDateTime.parse(adatok[1], formazo);
        this.utazas_ideje = Integer.parseInt(adatok[2]);
        this.tav = Double.parseDouble(adatok[3].replace(',','.'));
        this.viteldij = Double.parseDouble(adatok[4].replace(',','.'));
        this.borravalo = Double.parseDouble(adatok[5].replace(',','.'));
        this.fizetesModja = adatok[6];
    }

    public int getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(int azonosito) {
        this.azonosito = azonosito;
    }

    public LocalDateTime getIndulas() {
        return indulas;
    }

    public void setIndulas(LocalDateTime indulas) {
        this.indulas = indulas;
    }

    public int getUtazas_ideje() {
        return utazas_ideje;
    }

    public void setUtazas_ideje(int utazas_ideje) {
        this.utazas_ideje = utazas_ideje;
    }

    public double getTav() {
        return tav;
    }

    public void setTav(int tav) {
        this.tav = tav;
    }

    public double getViteldij() {
        return viteldij;
    }

    public void setViteldij(double viteldij) {
        this.viteldij = viteldij;
    }

    public double getBorravalo() {
        return borravalo;
    }

    public void setBorravalo(double borravalo) {
        this.borravalo = borravalo;
    }

    public double getBevetel() {
        return getViteldij() + getBorravalo();
    }

    public String getFizetesModja() {
        return fizetesModja;
    }

    public void setFizetesModja(String fizetesModja) {
        this.fizetesModja = fizetesModja;
    }

    @Override
    public String toString() {
        return "Fuvarok azonos??t??ja: " + azonosito + "\n" +
                "Indul??s: " + indulas + "\n" +
                "Utaz??s ideje: " + utazas_ideje + "\n" +
                "T??v: " + tav + "\n" +
                "Viteld??j: " + viteldij + "\n" +
                "Borraval??: " + borravalo + " doll??r\n" +
                "Fizet??s m??dja: " + fizetesModja;
    }
}
