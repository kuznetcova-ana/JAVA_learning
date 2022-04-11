package HW_4;

import java.util.Locale;

public class HW4_String {
    public static void main(String[] args) {

        // print all of 'O'
//        String s = "Перестановочный алгоритм быстрого действия";
//        for (int i = 0; i < s.length(); i++){
//            if (s.charAt(i) == 'о'){
//                System.out.println(s.charAt(i));
//            }
//        }
        // count 'e'
//        String s = "Перевыборы выбранного президента";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++){
//            if (s.charAt(i) == 'е'){
//                count++;
//            }
//        }
//        System.out.println(count);

        // index of "Рит" case-insensitive
//        String s = "Посмотрите как Рите нравится ритм";
//        s = s.toLowerCase(Locale.ROOT);
//        int index = s.indexOf("рит");
//        while (index != -1){
//            System.out.println(index);
//            index = s.indexOf("рит", index +1);
//            }
        //count strings which don't contain 'e'
        int count = 0;
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++){
            if (!array[i][j].contains("е")) {
                count ++;
            }
        }
    }
        System.out.println(count);




    }
    }


