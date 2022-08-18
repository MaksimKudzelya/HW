package hW_4;

public class Main {

    public static void main(String[] args) {
        doPhoneBook();
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

    private static void doPhoneBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Maxim","11111111111");
        phoneBook.addElementPhoneBook("Maxim","22222222222");
        phoneBook.addElementPhoneBook("Maxim","33333333333");

        phoneBook.addElementPhoneBook("Anton","555555");
        phoneBook.addElementPhoneBook("Anton","555 555 ");
        phoneBook.addElementPhoneBook("Anton","   555555");
        phoneBook.addElementPhoneBook("Anton","555555");
        phoneBook.addElementPhoneBook("Anton"," 5 5 5 5 5 5 5 ");

        phoneBook.addElementPhoneBook("Vasya","44444444444");

        phoneBook.addElementPhoneBook("Kolya","66666666666");

        System.out.println("Maxim: " + phoneBook.getPhonesByName("Maxim"));
        System.out.println("Anton: " + phoneBook.getPhonesByName("Anton"));
        System.out.println("Vasya: " + phoneBook.getPhonesByName("Vasya"));
        System.out.println("Kolya: " + phoneBook.getPhonesByName("Kolya"));


        System.out.println("******************************");
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "stol";
        strings[1] = "styl";
        strings[2] = "divan";
        strings[3] = "stol";
        strings[4] = "kreslo";
        strings[5] = "TV";
        strings[6] = "divan";
        strings[7] = "kotik";
        strings[8] = "noytbyk";
        strings[9] = "tetrad";
        return strings;
    }

}

