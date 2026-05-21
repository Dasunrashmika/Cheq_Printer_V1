public class NumberToWords {
    private static final String[] lowNames = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private static final String[] tensNames = {
        "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int n) {
        if (n < 20) return lowNames[n];
        if (n < 100) return tensNames[n / 10] + (n % 10 != 0 ? " " + lowNames[n % 10] : "");
        if (n < 1000) return lowNames[n / 100] + " Hundred" + (n % 100 != 0 ? " and " + convert(n % 100) : "");
        if (n < 1000000) return convert(n / 1000) + " Thousand" + (n % 1000 != 0 ? " " + convert(n % 1000) : "");
        return "Amount too large";
    }
}