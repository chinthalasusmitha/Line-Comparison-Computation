package linecomputation;

public class UC1_LineComparison {
        public static double lineLength;

        /**
         * Method for calculating the length of line.
         */
        private static void calculatingLengthOfLine(int x1, int x2,int y1 , int y2 ) {
            lineLength = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }

        public static void main(String[] args) {
            System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
            calculatingLengthOfLine(3,2,6,8);
            System.out.println(lineLength);
        }
    }

