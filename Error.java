class Error {
    public static void main(String[] args) {
        try {
            System.out.println(12/0);
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("The rest of the code should continue here without crashing the program.");
    }
}