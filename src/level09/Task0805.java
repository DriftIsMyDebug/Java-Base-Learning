package level09;

import java.util.Random;


// В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall, который будет работать как шар предсказаний.
// Он случайным образом возвращает фразу-ответ на заданный вопрос. В методе getPrediction() нужно использовать
// метод nextInt(int) класса Random, который должен возвращать значения от 0 до 7 включительно.
// В зависимости от результата работы метода nextInt(int) возвращается один из вариантов ответа.

public class Task0805 {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        int random = new Random().nextInt(8);
        switch (random) {
            case 0:
                return CERTAIN;
            case 1:
                return DEFINITELY;
            case 2:
                return MOST_LIKELY;
            case 3:
                return OUTLOOK_GOOD;
            case 4:
                return ASK_AGAIN_LATER;
            case 5:
                return TRY_AGAIN;
            case 6:
                return NO;
            case 7:
                return VERY_DOUBTFUL;
            default:
                return null;
        }
    }
}
