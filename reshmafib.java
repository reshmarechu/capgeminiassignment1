class Fibbinocci {
    public static void main(String[] args) {
        
        int n = 30, first = 0, second = 1;
        System.out.println("Fibbinocci Series Upto " + n + ": ");
        while (first <= n) {
            System.out.print(first + ", ");
            
            int next = first + second;
            first = second;
            second = next;
        }
    }
}