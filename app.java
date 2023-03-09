public class app {
    public static void main(String[] args) {
        int batrei = 60;
        int kapasitasbatrei = 50;
        double presentasebatrei = (double) batrei / kapasitasbatrei * 100;
        
        if (presentasebatrei == 100 &&  presentasebatrei >=75) {
            System.out.println("batrei penuh (" + batrei + "%)");
        } else if (presentasebatrei >= 50 ) {
            System.out.println("batrei anda tersisa setengah (" + batrei + "%)");
        } else if (presentasebatrei >= 20) {
            System.out.println("batrei anda hampir habis (" + batrei + "%)");
        } else {
            System.out.println("ngedrop (" + batrei + "%)");
        }
    }
}
 