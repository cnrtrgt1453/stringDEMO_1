public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı: " + mesaj.length());

        //length fonksiyonu Stringin karaktersayisini bulan fonskiyondur

        System.out.println("5. Eleman: " + mesaj.charAt(4));

        //charAt() fonksiyonu stringin i. index ini bulan fonksiyondur

        System.out.println(mesaj.concat(" Yaşasın!"));

        System.out.println(mesaj.startsWith("B"));

        //starsWith() ve endsWith() fonksiyonları geriye boolean değer döndürür

        System.out.println(mesaj.indexOf('a'));
    }
}
