package t1.lab6;

import java.util.HashMap;

public class Cryptography {
    public static void main(String[] args) {
        String message = new String("p apgp roziopc cjfl spgn zun zo czon ehpffnf lsn upcn zb lsn fzjoen bkhn puy lsn\n" +
                "upcn zb lsn ehpff cjfl qn lsn fpcn kb mn mpul cptn p apgp roziopc nvnejlpqhn mn\n" +
                "cjfl rozgkyn p cpku cnlszy lsn cpku cnlszy kf pu kuykeplzo puy p fkiupljon bzo\n" +
                "apgp gkoljph cpeskun lz bkuy lsn nulox rzkul zb lsn roziopc bzo nvnejlkzu").replace("\n", " ").toUpperCase();
        char[] dec = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".replace(" ", "").toCharArray();
        char[] ori = "P Q E Y N B I S K A T H C U Z R D O F L J G M V X W".replace(" ", "").toCharArray();
        String str = "";
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(ori[i], dec[i]);
        }
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ')
                str += map.get(message.charAt(i));
            else{
                str+=' ';
            }
        }
        System.out.println(str);
    }
}
