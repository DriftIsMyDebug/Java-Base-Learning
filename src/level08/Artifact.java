package level08;

public class Artifact {
    int id;
    String culture;
    int centry;


    public Artifact(int id) {
        this.id = id;
    }

    // 2. Номер и культура
    public Artifact(int id, String culture) {
        this.id = id;
        this.culture = culture;
    }


    public Artifact(int id, String culture, int centry) {
        this.id = id;
        this.culture = culture;
        this.centry = centry;
    }

    public static void main(String[] args) {
        Artifact first = new Artifact(212121);
        Artifact second = new Artifact(212122, "Ацтеки");
        Artifact third = new Artifact(212123, "Ацтеки", 12);
    }
}
