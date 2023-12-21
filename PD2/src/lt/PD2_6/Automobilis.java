package lt.PD2_6;

public class Automobilis {
static String marke, modelis;
static int metai;

   public void setMarke(String marke) {
      this.marke = marke;
   }

   public void setModelis(String modelis) {
      this.modelis = modelis;
   }

   public void setMetai(int metai) {
      this.metai = metai;
   }

   public String getMarke() {
      return marke;
   }

   public String getModelis() {
      return modelis;
   }

   public int getMetai() {
      return metai;
   }

   public Automobilis(String marke, String modelis, int metai) {
      this.marke = marke;
      this.modelis = modelis;
      this.metai = metai;
   }

   public static void main(String[] args) {

   }
   public static void displayInfo(String[] args){
      System.out.println(marke + modelis + metai);

   }

   }

