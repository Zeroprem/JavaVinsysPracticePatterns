class Pattern {
    static void pattern1(int N) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern2(int N) {
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int N) {

        int num = 1;

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();

        }
    }

    static void pattern4(int N) {

        for (int i = 0; i < N; i++) {

            for (int j = N; j > i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern5(int N) {

        for (int i = 0; i < N; i++) {

            for (int j = N; j > i; j--) {
                System.out.print(N - i + " ");
            }

            System.out.println();
        }
    }

    static void pattern6(int N) {

        for (int i = 0; i < N; i++) {

            for (int j = N; j > i; j--) {
                System.out.print(N - j + 1 + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int N = 5;
        pattern1(N);
        System.out.println();
        pattern2(N);
        System.out.println();
        pattern3(N);
        System.out.println();
        pattern4(N);
        System.out.println();
        pattern5(N);
        System.out.println();
        pattern6(N);
    }
}