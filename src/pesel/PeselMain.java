package pesel;

import java.util.Arrays;

public class PeselMain {

    public static void main(String[] args) {

        // isValidPesel()

        String pesel = "86037174562";

        isValidPesel(pesel);
        System.out.println("-----------------------------");

        // getGenderByPesel()

        getGenderByPesel(pesel);
        System.out.println("-----------------------------");

        // getDateOfBirth()

        getDateOfBirth(pesel);
        System.out.println("-----------------------------");


    }


    private static void isValidPesel(String pesel) {

        if (pesel.length() == 11) {
            String[] str = pesel.split("");
            int[] ints = new int[pesel.length()];

            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.valueOf(str[i]);
            }

            int sum = 9 * ints[0] + 7 * ints[1] + 3 * ints[2] + 1 * ints[3] + 9 * ints[4] + 7 * ints[5] + 3 * ints[6] + 1 * ints[7] + 9 * ints[8] + 7 * ints[9];
            System.out.println("Suma: " + sum);

            int mod = sum % 10;
            System.out.println("Modulo: " + mod);

            if (ints[ints.length - 1] == mod) {
                System.out.println("Nr PESEL prawidłowy");
            } else System.out.println("Nr PESEL nieprawidlowy");
        } else System.out.println("Nieprawidlowa liczba znakow. Wprowadz nr PESEL o dlugosci 11 znakow");
    }

    private static void getGenderByPesel(String pesel) {

        if (pesel.length() == 11) {
            String[] str = pesel.split("");
            int[] ints = new int[pesel.length()];

            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.valueOf(str[i]);
            }

            if (ints[9] % 2 == 0) {
                System.out.println("Sex: woman");
            } else System.out.println("Sex: man");
        } else System.out.println("Nieprawidlowa liczba znakow. Wprowadz nr PESEL o dlugosci 11 znakow");
    }

    private static void getDateOfBirth(String pesel) {
        if (pesel.length() == 11) {
            String[] str = pesel.split("");
            int[] ints = new int[pesel.length()];

            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.valueOf(str[i]);
            }

            if (ints[2] <= 1) {
                System.out.println("Date of birth: " + ints[4] + ints[5] + "." + ints[2] + ints[3] + "." + "19" + ints[0] + ints[1]);
            } else if (ints[2] == 9 || ints[2] == 8) {
                System.out.println("Date of birth: " + ints[4] + ints[5] + "." + (ints[2] - 8) + ints[3] + "." + "18" + ints[0] + ints[1]);
            } else if (ints[2] == 3 || ints[2] == 2) {
                System.out.println("Date of birth: " + ints[4] + ints[5] + "." + (ints[2] - 2) + ints[3] + "." + "20" + ints[0] + ints[1]);
            } else if (ints[2] == 5 || ints[2] == 4) {
                System.out.println("Date of birth: " + ints[4] + ints[5] + "." + (ints[2] - 4) + ints[3] + "." + "21" + ints[0] + ints[1]);
            } else if (ints[2] == 7 || ints[2] == 6) {
                System.out.println("Date of birth: " + ints[4] + ints[5] + "." + (ints[2] - 6) + ints[3] + "." + "22" + ints[0] + ints[1]);
            } else System.out.println("Nieprawidlowa liczba znakow. Wprowadz nr PESEL o dlugosci 11 znakow");
        }
    }
}


