package t1.lab7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input:");
        while (true){
            String data = in.nextLine();
            if (data.equals("exit")) break;
            for (int i = 0 ;i<data.length();i++){
                char c = data.charAt(i);
                if (Character.isLetter(c) && c!='.'){
                    System.out.println(data+" cannot be converted into a type byte!\n"+
                            data +" cannot be converted into a type short!\n" +
                            data+" cannot be converted into a type int!\n"+
                            data+" cannot be converted into a type float!\n"+
                            data+" cannot be converted into a type double!");
                    break;
                }else if(c == '.'){
                    Double d = Double.parseDouble(data);
                    System.out.println(data+" cannot be converted into a type byte!\n"+
                            data +" cannot be converted into a type short!\n" +
                            data+" cannot be converted into a type int!");
                    if (d>Float.MIN_VALUE||d<Float.MAX_VALUE)
                        System.out.println(data+" can be converted into a type float!\n"+
                                data+" can be converted into a type double!");
                    else System.out.println(data+" cannot be converted into a type float!"+
                            data+" can be converted into a type double!");
                    break;
                }else if (i == data.length()-1){
                    Long l =Long.parseLong(data);
                    if (l<Byte.MAX_VALUE &&l>Byte.MIN_VALUE)
                        System.out.println(data+" can be converted into a type byte!\n"+
                                data +" can be converted into a type short!\n" +
                                data+" can be converted into a type int!");
                    else if (l<Short.MAX_VALUE &&l>Short.MIN_VALUE)
                        System.out.println(data+" cannot be converted into a type byte!\n"+
                                data +" can be converted into a type short!\n" +
                                data+" can be converted into a type int!");
                    else if (l<Integer.MAX_VALUE&&l>Integer.MIN_VALUE)
                        System.out.println(data+" cannot be converted into a type byte!\n"+
                                data +" cannot be converted into a type short!\n" +
                                data+" can be converted into a type int!");
                    else System.out.println(data+" cannot be converted into a type byte!\n"+
                                data +" cannot be converted into a type short!\n" +
                                data+" cannot be converted into a type int!");
                    System.out.println(data+" cannot be converted into a type float!\n"+
                            data+" cannot be converted into a type double!");
                    break;
                }
            }
        }
    }
}
