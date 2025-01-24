public class Array {
    public static void main(String[] args) {

        String[] stringArray = new String[3];
        stringArray[0] = "Zain";
        stringArray[1] = "Arifin";
        stringArray[2] = "Fadli";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Zainal";
        stringArray[2] = "Fadliansyah";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[2]);

        int[] intArray = new int[]{
                1,2,3,4,5,6,7
        };

        intArray[0] = 0;

        System.out.println(intArray[0]);

        String[] namaSaya = new String[]{
                "Zain", "Arifin", "Fadli", "Fadliansyah"
        };

        System.out.println(namaSaya[1]);
        System.out.println(namaSaya.length);

        String[][] members = {
                {"zain" , "arifin"},
                {"ari" , "fadli"},
                {"zainal" , "arifin",  "fadliansyah"},
        };
        System.out.println(members[2][1]);
        System.out.println(members[1][0]);
    }
}
