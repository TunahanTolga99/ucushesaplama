import java.util.Scanner;

public class ucus {
    public static void main(String[] args) {
        int km,yas,ucusTipi;
        double indirimliTutar,yasIndirimi,toplamTutar,tipIndirimi,normalTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Gideceğiniz Kilometreyi Yazınız");
        km = input.nextInt();
        System.out.println("Yaşınızı Yazınız");
        yas = input.nextInt();
        System.out.println("Uçuş Yönünü Belirtiniz ! ((1)Tek Yön/(2)Gidiş Dönüş)");
        ucusTipi=input.nextInt();

        if (km > 0 && yas > 0){
            if (yas <=12 && ucusTipi == 1){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar : " + indirimliTutar);
            }else if (yas <=12 && ucusTipi==2){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar -yasIndirimi;
                tipIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - tipIndirimi) * 2.0;
                System.out.println("Toplam Tutar : " +toplamTutar);
            }else if (yas > 12 && yas <= 25 && ucusTipi ==1){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar : " + indirimliTutar);
            }else  if (yas > 12 && yas <= 25 && ucusTipi ==2){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
                tipIndirimi = indirimliTutar * 0.20;
                toplamTutar = ((indirimliTutar - tipIndirimi) * 2.0);
                System.out.println("Toplam Tutar : " +toplamTutar);
            }else if (yas >= 65 && ucusTipi == 1){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                System.out.println("Toplam Tutar : " + indirimliTutar);
            }else if (yas >= 65 && ucusTipi == 2){
                normalTutar = km * 0.10;
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
                tipIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - tipIndirimi) * 2.0;
                System.out.println("Toplam Tutar : " +toplamTutar);
            }else if (yas >25 && yas <65 && ucusTipi == 1){
                normalTutar = km * 0.10;
                System.out.println("Toplam Tutar : " +normalTutar);
            }else if (yas > 25 && yas <65 && ucusTipi ==2 ){
                normalTutar = km * 0.10;
                tipIndirimi = normalTutar * 0.20;
                System.out.println("Toplam Tutar : " +tipIndirimi);
            }
        }else {
            System.out.println("Hatalı Tuşlama Yaptınız !");
        }

    }
}


