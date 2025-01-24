public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAben = absen >= 75 ;
        var lulusAkhir = nilaiAkhir >= 75 ;

        var lulus = lulusAkhir && lulusAben ;
        System.out.println(lulus);
    }
}
