
package model;

public class lada {
    private static ENUM.Anyag anyag;
    private static String kerdes;

    public lada(ENUM.Anyag anyag,String kerdes) {
        this.anyag = anyag;
        this.kerdes = kerdes;
    }

    public static ENUM.Anyag getAnyag() {
        return anyag;
    }

    public static String getKerdes() {
        return kerdes;
    }

    public static void setAnyag(ENUM.Anyag anyag) {
        lada.anyag = anyag;
    }

    public static void setKerdes(String kerdes) {
        lada.kerdes = kerdes;
    }
    
    
}
