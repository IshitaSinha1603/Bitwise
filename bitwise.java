class bitwise {
    public static void main(String args[]) {
        int a = 5;
        int b = 7;
        /*bitwise and:
        5=0101, 7=0111
        0101&0111=0101=5
        Truth table:
        x y x&y
        0 0 0
        0 1 0
        1 0 0
        1 1 1
        */
        System.out.println("a & b ="+(a & b));
        /*bitwise or:
        0101|0111=0111=7
        Truth table:
        x y x|y
        0 0 0
        0 1 1
        1 0 1
        1 1 1
         */
        System.out.println("a | b = "+(a | b));
        /* bitwise xor:
        0101^0111=0010
        If same bits then 0 or else 1
         */
        System.out.println("a ^ b = "+(a^b));
        /*biwise complement:
        0101=1010
        0 becomes 1 and vice versa
         */
        System.out.println("~a = "+(~a));
    }
}