package model;

public class Jatek {

    private static lada[] ladak = new lada[3];
    private static String[] kerdesek = {"Én rejtem a kincset", "Nem én rejtem a kincset", "Az arany hazudik"};

    public Jatek() {
        ladatBeRak();
        System.out.println(ladak);
    }

    public void ladatBeRak() {
        for (int i = 0; i < ENUM.Anyag.values().length; i++) {
            ladak[i] = new lada(ENUM.Anyag.values()[i], kerdesek[i]);
        }
    }
}
