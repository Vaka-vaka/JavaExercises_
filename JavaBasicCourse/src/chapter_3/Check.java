package chapter_3;

public class Check {
    public static void main(String[] args) {
        for ( int i = 0; i<10; i++ ) {
            System.out.print (i +" " ) ;
            if ( ( i % 2 ) == 0) continue ;
            System.out.println();
        }


        wert(10, 2);
    }
    public static void wert(int x, int y) {
        if (x < y) System.out.println("true");
        else if (x > y) System.out.println("false");
        else System.out.println("andere");

    }
}

