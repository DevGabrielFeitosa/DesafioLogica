package br.com.service;

import br.com.service.enums.ResistorColor;
import br.com.service.enums.ResistorTolerance;

public class ResistorService {

    public String evaluateResistors(String str) {
        String cleanInput = str.toLowerCase().replace(" ohms", "").replace(" ", "");
        double value = multiplyResistorsValue(cleanInput);

        return returnColorsValue(value);
    }

    private double multiplyResistorsValue(String input) {
        String cleanedInput = input.trim().toLowerCase();

        if (input.contains("k")) {
            cleanedInput = cleanedInput.replace("k", "");
            return parseValue(cleanedInput) * 1000;

        } else if (input.contains("m")) {
            cleanedInput = cleanedInput.replace("m", "");
            return parseValue(cleanedInput) * 1000000;

        } else if (input.contains("g")) {
            cleanedInput = cleanedInput.replace("g", "");
            return parseValue(cleanedInput) * 1000000000;

        } else {
            return Double.parseDouble(input);
        }
    }

    private double parseValue(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Valor inválido, certfique-se de informar um valor no padrão correto.");
        }
    }

    private String returnColorsValue(double value) {
        int multiplier = 0;

        while (value >= 100) {
            value /= 10;
            multiplier++;
        }

        int firstDigit = (int) value / 10;
        int secondDigit = (int) value % 10;

        if (multiplier > 9) {
            throw new IllegalArgumentException("Valor não comtempla a faixa de resistores.");
        }

        ResistorColor firstColor = ResistorColor.fromValue(firstDigit);
        ResistorColor secondColor = ResistorColor.fromValue(secondDigit);
        ResistorColor multiplierColor = ResistorColor.fromValue(multiplier);
        ResistorTolerance tolerance = ResistorTolerance.DOURADO;

        return firstColor.getColorName() + " "
                + secondColor.getColorName() + " "
                + multiplierColor.getColorName() + " "
                + tolerance.getToleranceName();
    }

}
