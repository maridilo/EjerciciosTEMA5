public class ej6 {
    public static int hexToDecimal(String hex, int length) {
        // Caso base: cuando la longitud de la cadena es 0
        if (length == 0) {
            return 0;
        }

        // Obtenemos el valor decimal del último dígito hexadecimal
        char lastDigit = hex.charAt(length - 1);
        int digitValue = hexDigitToValue(lastDigit);

        // Recursivamente calculamos el valor decimal del resto de la cadena
        int decimalValue = hexToDecimal(hex, length - 1);

        // Actualizamos el valor decimal multiplicándolo por 16 y sumándole el valor del dígito actual
        return decimalValue * 16 + digitValue;
    }

    // Método auxiliar para convertir un dígito hexadecimal a su valor decimal
    private static int hexDigitToValue(char digit) {
        if (digit >= '0' && digit <= '9') {
            return digit - '0';
        } else if (digit >= 'A' && digit <= 'F') {
            return 10 + digit - 'A';
        } else if (digit >= 'a' && digit <= 'f') {
            return 10 + digit - 'a';
        } else {
            throw new IllegalArgumentException("Carácter no válido: " + digit);
        }
    }
}