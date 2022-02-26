package hu.petrik.streamapifuvar;

import java.time.LocalDateTime;

public class Taxi {
    private int azonosito;
    private LocalDateTime indulas;
    private int utazas_ideje;
    private int tav;
    private double viteldij;
    private double borravalo;
    private String fizetesModja;

    public Taxi(int azonosito, LocalDateTime indulas, int utazas_ideje, int tav, double viteldij, double borravalo, String fizetesModja) {
        this.azonosito = azonosito;
        this.indulas = indulas;
        this.utazas_ideje = utazas_ideje;
        this.tav = tav;
        this.viteldij = viteldij;
        this.borravalo = borravalo;
        this.fizetesModja = fizetesModja;
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

    public int getTav() {
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

    public String getFizetesModja() {
        return fizetesModja;
    }

    public void setFizetesModja(String fizetesModja) {
        this.fizetesModja = fizetesModja;
    }
}
