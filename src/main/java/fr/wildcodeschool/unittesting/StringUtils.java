    package fr.wildcodeschool.unittesting;

import java.io.IOException;

public class StringUtils {

        private static final String ALL_VOWELS = "aeiouyAEIOUY";

        /**
         * Renvoie la chaine formée par les voyelles d'une chaine de caractères
         * @return Chaine avec uniquement des voyelles
         */
        public static String vowels(String candidate) {
            String vowels = "";
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    vowels += letters[i];
                }
            }
            return vowels;
        }

        
        /**
         * Renvoie la chaine formée par les voyelles (sans doublons) d'une chaine de caractères
         * @return Chaine avec uniquement des voyelles sans doublons
         */
        public static String uniqueVowels(String candidate) {
            String vowels = "";
            try {
            	char[] letters = candidate.toCharArray();
            	for (int i = 0; i < candidate.length(); i++) {
            		if (ALL_VOWELS.indexOf(letters[i]) >= 0 && vowels.indexOf(letters[i])<0 ) {
            			vowels += letters[i];
            		}
            	}
            }catch (Exception e) {
            }
            return vowels;
        }
    }