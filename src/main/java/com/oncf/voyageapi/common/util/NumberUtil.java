/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oncf.voyageapi.common.util;

import java.math.BigDecimal;

/**
 *
 * @author Salma
 */

public class NumberUtil {
        private static final Double ZERO_DOUBLE = 0D;
    private static final Integer ZERO_INTEGER = 0;
    private static final String CHAINE_VIDE = "";

    public static Double toDouble(String value) {
        if (value == null || value.isEmpty()) {
            return ZERO_DOUBLE;

        } else {
            return Double.parseDouble(value);
        }
    }

    public static Integer toInteger(String value) {
        if (value == null || value.isEmpty()) {
            return ZERO_INTEGER;

        } else {
            return Integer.parseInt(value);
        }
    }

    public static String toString(Integer value) {
        if (value == null) {
            return CHAINE_VIDE;
        } else {
            return String.valueOf(value);
        }

    }

    public static BigDecimal toBigDecimal(String value) {
        if (value == null) {
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(value);
        }

    }

  

    
}
