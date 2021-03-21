
import java.util.*;

public class pers_lingkaran {
    public static void main(String[] args) {
        
        // interface
        while(true){
        Scanner usermenu = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("========== Program Persamaan Lingkaran ===========");
        System.out.println("==================================================");
        System.out.println("Pilihan :");
        System.out.println("1. Dititik pusat (0,0) dan jari-jari r");
        System.out.println("2. Dititik pusat (a,b) dan jari-jari r");
        System.out.println("3. Persamaan dalam bentuk umum");
        System.out.print("Pilihan : ");
        String pilihan = usermenu.next();
        
        switch(pilihan){
            case "1" :
            pers1();
            break;
            case "2" :
            pers2();
            break;
            case "3" :
            pers_umum();
            break;

            default :
            System.out.println("Pilihan tidak ada, silahkan coba lagi nanti");
        }

    }
}
    
    public static void pers1(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("====== pusat (0,0) dan jari-jari r ======");
        System.out.println("Pilihan : ");
        System.out.println("1. Cari persamaan x + y = r");
        System.out.println("2. Cari r");
        System.out.print("Pilihan : ");
        String pilihan = userinput.next();

        while(true){
        switch(pilihan){
            case "1" :
            Rumus1();
            break;
            case "2" :
            Rumus2();
            break;

            default :
            System.out.println("Pilihan Ngak ada bos,ulangi lagi");
        }
    }
}

    private static double Rumus1(){
        // Input 
        double x,y;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan Value X ");
         x = userinput.nextDouble();
        System.out.println("Masukkan Value Y ");
         y = userinput.nextDouble();
        // disini kita diminta x dan y yang dipangkat pake math.pow 
        double pangkat_x = Math.pow(x, 2.0d);
        double pangkat_y = Math.pow(y, 2.0d);

        // masukkan rumus 
        double r = pangkat_x + pangkat_y;

        System.out.println("Maka Persamaan"  + " x2 + y2 = " + r);
        return r;
    }

    private static double Rumus2(){
        double r;
        Scanner userinput = new Scanner(System.in);

        System.out.println("Masukkan Value r ");
         r = userinput.nextDouble();
        // disini kita diminta x dan y yang dipangkat pake math.pow 
        double pangkat_r = Math.pow(r, 2.0d);
        System.out.println("Maka Persamaan"  + " x2 + y2 = " + pangkat_r);
        return pangkat_r;
    }

    public static void pers2(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("====== pusat (a,b) dan jari-jari r ======");
        System.out.println("Pilihan : ");
        System.out.println("1. Persamaan lingkaran (x-a)2 + (y-b)2 = r2 ");
        System.out.println("2. Mencari r");
        System.out.print("Pilihan : ");
        String pilihan = userinput.next();

        while (true){
        switch(pilihan){
            case "1" :
            Rumus_pers2();
            break;
            case "2" :
            Rumus_pers2_2();
            break;

            default :
            System.out.println("Pilihan tidak ada, ulangi lagi ");
        }
    }  
}
    private static double Rumus_pers2(){
        double a,b,r;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukkan Value a");
        a = userinput.nextDouble();
        System.out.println("Masukkan Value b");
        b = userinput.nextDouble();
        System.out.println("Masukkan Value r");
        r = userinput.nextDouble();

        // rumus :
        double pangkat_r = Math.pow(r, 2.0d);

        // output 
        System.out.println("Maka Persamaannya = " + "(x -" + a + ")2" + "+" + "(y -" + b + ")2" + " = " + pangkat_r );

        return pangkat_r;
    }

    private static double Rumus_pers2_2(){
        System.out.println("======== Catatan ========");
        System.out.println("Kamu harus tau dulu nilai value a dan b nya agar bisa dicari,sebenarnya tidak terlalu penting");
        System.out.println("akan tetapi akan lebih enak hasilnya jika ada diketahui pusatnya");

        // deklarasi scanner dan variabel
        Scanner userinput = new Scanner(System.in);
        double a,b,r;

        // struktur rumus 
        System.out.println("Struktur Rumusnya :");
        System.out.println("(x-a)2 + (y-b)2 = r2" + "\n");
    
        System.out.println("Masukkan Value a");
        a = userinput.nextDouble();
        System.out.println("Masukkan Value b");
        b = userinput.nextDouble();
        System.out.println("Masukkan Value r");
        r = userinput.nextDouble();

        // rumus r nya : 
        double pangkat_r = Math.pow(r, 2.0d);

        // output hasil :
        System.out.println("Maka pusatnya di : " + "(" + a + "," + b + ")" + "dan r2 adalah : " + pangkat_r);
        return pangkat_r;

    }
    public static void pers_umum(){
        // ini kita cari persamaannya aja dulu
        // persamaannya kita cuma perlu pusat lingkarannya aja, maka :
        Scanner userinput = new Scanner(System.in);
        System.out.println("====== Persamaan Umum  ======");
        System.out.println("Pilihan : ");
        System.out.println("1. Persamaan lingkaran X2+Y2+AX+BY = 0 ");
        System.out.print("Pilihan : ");
        int pilihan = userinput.nextInt();

        while (true){
        if(pilihan == 1 ){
            Rumus_pers_3();
        } else {
            System.out.println("Maaf, pilihan tidak ada ulangi lagi");
        }
    }  
}

    private static void Rumus_pers_3(){
        // ini rumus umum-nya 

        /**
         * x2+y2+Ax+By = 0 
         * Dia harus saa dengan 0, karena hemmmmmm karena rumusnya hiak hiak hiak 
         */

         // Bahan :
         int A;
         int B;

         Scanner userinput = new Scanner(System.in);
         System.out.println("Masukkan Value A : ");
         A =  userinput.nextInt();
         System.out.println("Masukkan Value B : ");
         B =  userinput.nextInt();

         // rumus 
         System.out.println("Maka Hasilnya : " + "X2+Y2 " + " + " + A + "X " + " + " + B + "Y " + "= " + "0");

    }

}