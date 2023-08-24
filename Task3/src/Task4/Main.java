package Task4;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String poem = "Гийом Аполлинер  Мост Мирабо\n" +
                "Мост Мирабо минуют волны Сены\n" +
                "И дни любви\n" +
                "Но помню я смиренно\n" +
                "Что радость горю шла всегда на смену\n" +
                "\n" +
                "Пусть бьют часы приходит ночь\n" +
                "Я остаюсь дни мчатся прочь\n" +
                "\n" +
                "Лицом к лицу постой ещё со мною\n" +
                "Мост наших рук\n" +
                "Простёрся над рекою\n" +
                "От глаз людских не знающей покою\n" +
                "\n" +
                "Пусть бьют часы приходит ночь\n" +
                "Я остаюсь дни мчатся прочь\n" +
                "\n" +
                "Любовь уходит как вода разлива\n" +
                "Любовь уходит\n" +
                "Жизнь нетороплива\n" +
                "О как Надежда вдруг нетерпелива\n" +
                "\n" +
                "Пусть бьют часы приходит ночь\n" +
                "Я остаюсь дни мчатся прочь\n" +
                "\n" +
                "Так день за днём текут без перемены\n" +
                "Их не вернуть\n" +
                "Плывут как клочья пены\n" +
                "Мост Мирабо минуют волны Сены\n" +
                "\n" +
                "Пусть бьют часы приходит ночь\n" +
                "Я остаюсь дни мчатся прочь";

        File file = new File("poem.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, StandardCharsets.UTF_8, true);
            fileWriter.append(poem);
            fileWriter.flush();
            fileWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader("poem.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                int color = ((int) (Math.random() * (2) + 5));
                System.out.print("\u001b[38;5;" + color + "m" + (char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
