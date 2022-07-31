package personalfinance.exception;

import personalfinance.settings.Text;

import java.util.Calendar;
import java.util.Date;

public class ModelException extends Exception {

    public static final int TITLE_EMPTY = 1;
    public static final int IS_EXIST = 2;
    public static final int DATA_FORMAT = 3;
    public static final int CODE_EMPTY = 4; // код валюты
    public static final int CURRENCY_EMPTY = 5; // не указана валюта
    public static final int ARTICLE_EMPTY = 6; // не указана статья
    public static final int ACCOUNT_EMPTY = 7; // не указан счет
    public static final int RATE_INCORRECT = 8;
    public static final int AMOUNT_FORMAT = 9; // форматирование денег
    public static final int NO_BASE_CURRENCY = 10; // нет базовой валюты

    private final int code;

    public ModelException(int code) {
        this.code = code;
    }

    public String getMessage() {
        switch (code) {
            case TITLE_EMPTY -> Text.get("ERROR_TITLE_EMPTY");
            case IS_EXIST -> Text.get("ERROR_IS_EXIST");
            case DATA_FORMAT -> Text.get("ERROR_DATA_FORMAT");
            case CODE_EMPTY -> Text.get("ERROR_CODE_EMPTY");
            case CURRENCY_EMPTY -> Text.get("ERROR_CURRENCY_EMPTY");
            case ARTICLE_EMPTY -> Text.get("ERROR_ARTICLE_EMPTY");
            case ACCOUNT_EMPTY -> Text.get("ERROR_ACCOUNT_EMPTY");
            case RATE_INCORRECT -> Text.get("ERROR_RATE_INCORRECT");
            case AMOUNT_FORMAT -> Text.get("ERROR_AMOUNT_FORMAT");
            case NO_BASE_CURRENCY -> Text.get("ERROR_NO_BASE_CURRENCY");
        }
        return "";
    }
}

