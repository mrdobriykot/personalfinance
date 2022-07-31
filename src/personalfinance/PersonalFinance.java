package personalfinance;

import personalfinance.settings.Settings;
import personalfinance.settings.Text;

import java.awt.*;
import java.io.IOException;

public class PersonalFinance {
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        Settings.init();

        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, Settings.FONT_ROBOTO));
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}

