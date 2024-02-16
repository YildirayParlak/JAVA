public class Main {
    public static void main(String[] args) {
       // Hayvan hayvan = new Kopek();//bu iste polymorphism
        //hayvan.SesCikar();

       Hayvan hayvan = new Kopek();
     //  Kopek kopek =new Kopek();

        HayvanYonetimi hayvanYonetimi = new HayvanYonetimi(hayvan);
        hayvanYonetimi.sesVer();
    }
}