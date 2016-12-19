package com.example.intro.classes;


public class Claimant {

    private final String    name;
    private final int       ageYears;
    private final int       heightCMs;
    private final int       weightKs;
    private final EyeColour eyeColor;
    private final Gender    gender;

    public Claimant(String name, int ageYears, int heightCMs, int weightKs, EyeColour eyeColour, Gender gender) {
        this.name = name;
        this.ageYears = ageYears;
        this.heightCMs = heightCMs;
        this.eyeColor = eyeColour;
        this.gender = gender;
        this.weightKs = weightKs;
    }

    public String getName() {
        return name;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public EyeColour getEyeColor() {
        return eyeColor;
    }

    public Gender getGender() {
        return gender;
    }

    public int getWeightKs() {
        return weightKs;
    }

    public int getHeightCMs() {
        return heightCMs;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        return b.append("Name: ").append(name).append("\n")
        .append("Age: ").append(ageYears)
        .toString();
    }
}
