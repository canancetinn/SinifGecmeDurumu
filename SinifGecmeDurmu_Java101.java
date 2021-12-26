import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner ders = new Scanner(System.in);
        int mat, fizik, kimya, turkce,  muzik;
        double ort;
        int toplam;
        System.out.print("Matematik notunu girin:");
        mat = ders.nextInt();
        System.out.print("fizik notunu girin: ");
        fizik = ders.nextInt();
        System.out.print("kimya notunu girin: ");
        kimya = ders.nextInt();
        System.out.print("turkce notunu girin:");
        turkce = ders.nextInt();
        System.out.print("müzik notunu girin:");
        muzik = ders.nextInt();
        if((fizik >= 0 && fizik<=100) && (kimya>=0 && kimya<=100) && (mat>=0 && mat <=100) && (turkce>=0 && turkce<=100) && (muzik>=0 && muzik<=100)){
            toplam = mat + fizik + kimya + turkce  + muzik;
            ort = toplam / 5;
            System.out.println("Not ortalamanız: " + ort);
            if(ort >= 55){
                System.out.print("Geçti");
            }else{
                System.out.print("Kaldı");
            }
        }else{

            System.out.print("Başarısız İşlem");
        }





    }
}
