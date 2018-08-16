
    
    package jobsheet11;
import java.util.Locale;
public class Jobsheet11 {
   
    public static void main(String[] args) {
        String identitas = "Amalina Zakiyah Salsabila Aribowo / XRPL2 / 04";
        System.out.println("Identitas : "+ identitas);
        
        
        
        String x = "Operasi";
    System.out.println("isi variabel x : "+ x);
    System.out.println("\""+ x +"\" panjang karakter = "+ x.length());
    
    System.out.println("x adalah ksosong : " + x.isEmpty());
    
    String y= "";
    System.out.println("isi variabel y : "+ y);
    System.out.println("y adalah kosong : " + y.isEmpty());
    
    
    
    
    System.out.println("isi x sama dengan y : " + x.equals(y));
   
   String z = "Operasi";
   System.out.println("isi variabel z : "+ z);
   System.out.println("isi x sama dengan z (Case Sensistive) : " + x.equals(z));
   
   String r = "operasi";
   System.out.println("isi variabel r : "+ z);
   System.out.println("isi x sama dengan r (Case Sensitive) : " + x.equals(r));
   System.out.println("isi x sama dengan r (Not Case Sensitive) : " + x.equalsIgnoreCase(r));
   
   
   
   System.out.println("perbandingan isi x dengan y : " + x.compareTo(y));
   System.out.println("perbandingan isi x dengan z (Case Sensitive): " +x.compareTo(z));
   System.out.println("perbandingan isi x dengan r (Case Sensitive): " +x.compareTo(r));
   System.out.println("perbandingan isi x dengan r (Not Case Sensitive): " + x.compareToIgnoreCase(r));
   
   String s = "operasI";
   System.out.println("isi variabel s : "+ s);
   System.out.println("perbandingan isi r dengan s (Case Sensitive) : " + r.compareTo(s));
   
   
    
   
   
   System.out.println("pada x terdapat huruf 'a' : " + x.contains("a"));
   
   System.out.println("isi variabel x  besar semua : "+ x.toUpperCase());
   System.out.println("isi variabel x  kecil semua : "+ x.toUpperCase());
   
   String t = "     operasi string  ";
   System.out.println("isi variabel t : \""+ t +"\"");
   System.out.println("isi variabel t tanpa spasi : \""+ t.trim() +"\"");
   
   
   System.out.println("gabungkan isi variabel x dan r : "+ x.concat(r));
   
   
   
   
   
}
}