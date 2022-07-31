package personalfinance.settings;

import java.util.HashMap;

final public class Text {

    private static final HashMap<String, String> data = new HashMap<>();

    public static String get(String key){
        if (data.containsKey(key)) return data.get(key);
        System.out.println("Такого ключа в Text не существует"); // Для отладки
        return "";
    }

    public static String[] getMonth() {
        String[] months = new String[12];
        months[0] = get("JANUARY");
        months[1] = get("FEBRUARY");
        months[2] = get("MARCH");
        months[3] = get("APRIL");
        months[4] = get("MAY");
        months[5] = get("JUNE");
        months[6] = get("JULY");
        months[7] = get("AUGUST");
        months[8] = get("SEPTEMBER");
        months[9] = get("OCTOBER");
        months[10] =get("NOVEMBER");
        months[11] =get("DECEMBER");
        return months;
    }

    public static void init() {
        data.put("PROGRAM_NAME", "Домашняя Бухгалтерия");
        data.put("PROGRAM_FILE", "Файл");
        data.put("PROGRAM_EDIT", "Правка");
        data.put("PROGRAM_VIEW", "Вид");
        data.put("PROGRAM_HELP", "Помощь");

        data.put("JANUARY", "Январь");
        data.put("FEBRUARY", "Февраль");
        data.put("MARCH", "Март");
        data.put("APRIL", "Апрель");
        data.put("MAY", "Май");
        data.put("JUNE", "Июнь");
        data.put("JULY", "Июль");
        data.put("AUGUST", "Август");
        data.put("SEPTEMBER", "Сентябрь");
        data.put("OCTOBER", "Октябрь");
        data.put("NOVEMBER", "Ноябрь");
        data.put("DECEMBER", "Декабрь");

        data.put("ERROR_TITLE_EMPTY", "Введите название");
        data.put("ERROR_IS_EXIST", "Такая запись уже сущетсвует");
        data.put("ERROR_DATA_FORMAT", "Некорректный формат даты");
        data.put("ERROR_CODE_EMPTY", "Укажите код");
        data.put("ERROR_CURRENCY_EMPTY", "Выберите валюту");
        data.put("ERROR_ARTICLE_EMPTY", "Выберите статью");
        data.put("ERROR_ACCOUNT_EMPTY", "Выберите счет");
        data.put("ERROR_RATE_INCORRECT", "Некорректное значение курса");
        data.put("ERROR_AMOUNT_FORMAT", "Некорректный формат суммы");
        data.put("ERROR_NO_BASE_CURRENCY", "Необходима базовая валюта. Установите сначала этот параметр в другой" +
                " валюте, потом он снимется в этой автоматически");

        data.put("YES", "Да");
        data.put("NO", "Нет");
    }
}

