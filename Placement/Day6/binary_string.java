public class binary_string {
    public static void main(String[] args) {
        String str = "1C0C1C0A0B1";
        int sum = Integer.parseInt(str.substring(0, 1));

        for (int i = 1; i < str.length(); i += 2) {
            char operator = str.charAt(i);
            int operand = Integer.parseInt(str.substring(i + 1, i + 2));

            if (operator == 'A') { // AND
                sum = sum & operand;
            } else if (operator == 'B') { // OR
                sum = sum | operand;
            } else if (operator == 'C') { // XOR
                sum = sum ^ operand;
            }
        }
        System.out.println(sum);
    }
}


