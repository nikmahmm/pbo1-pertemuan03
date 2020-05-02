package percabangan;

public class Switch2 {
    public static void main(String[] args){
        char nilai = 'D';
        switch (nilai) {
            case 'A':
                System.out.println("Mhs   : \"Terima kasih pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, Pak ?\"");
                System.out.println("Dosen : \"asdfghjkl\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun tarus pak ai, tugas ngumpul tarus jua pak ai\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian\"");
                System.out.println("Mhs   : \"Hehehehehehe\"");
                break;
            default:
                System.out.println("Mhs   : \"Ulun turun tarus pak ai, tugas ngumpul tarus jua pak ai\"");
                System.out.println("Dosen : \"Bujur jua kah ?\"");
                System.out.println("Dosen : \"Memeriksa berkas\""); // demi nilai mahasiswanya hakun ja si dosen mencek
                System.out.println("Dosen : \"Menceleng, tetap sabar, tahan emosi\"");
                System.out.println("Mhs   : \"Kabur...!!!!\""); //dasar kada tau diri emang
                break;
        }
    }
}
