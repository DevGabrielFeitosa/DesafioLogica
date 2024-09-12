package br.com.service.enums;

public enum ResistorColor {
    PRETO(0, "preto"),
    MARROM(1, "marrom"),
    VERMELHO(2, "vermelho"),
    LARANJA(3, "laranja"),
    AMARELO(4, "amarelo"),
    VERDE(5, "verde"),
    AZUL(6, "azul"),
    VIOLETA(7, "violeta"),
    CINZA(8, "cinza"),
    BRANCO(9, "branco");

    private final int value;
    private final String colorName;

    ResistorColor(int value, String colorName) {
        this.value = value;
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    public static ResistorColor fromValue(int value) {
        for (ResistorColor color : ResistorColor.values()) {
            if (color.value == value) {
                return color;
            }
        }

        return null;
    }
}
