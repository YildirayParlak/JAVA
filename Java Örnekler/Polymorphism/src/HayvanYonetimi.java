public class HayvanYonetimi {
    public Hayvan hayvan;

    public HayvanYonetimi(Hayvan hayvan) {
        this.hayvan = hayvan;
    }

    public void sesVer(){
        hayvan.SesCikar();
    }
}
