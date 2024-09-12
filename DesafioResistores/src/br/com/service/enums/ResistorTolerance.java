package br.com.service.enums;

public enum ResistorTolerance {

    DOURADO(5, "dourado");

    private final int toleranceValue;
    private final String toleranceName;

    ResistorTolerance(int toleranceValue, String toleranceName) {
        this.toleranceValue = toleranceValue;
        this.toleranceName = toleranceName;
    }

    public String getToleranceName() {
        return toleranceName;
    }

    public static ResistorTolerance fromValue(int value) {
        for (ResistorTolerance tolerance : ResistorTolerance.values()) {
            if (tolerance.toleranceValue  == value) {
                return tolerance;
            }
        }

        return null;
    }
}

