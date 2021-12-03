public class DoesRobotMoveCircular {
    public static void main(String[] args) {
        String str = "GRGRGRRG";
        if (doesRobotMoveCircular(str)) {
            System.out.println("Robot moved circular");
        } else {
            System.out.println("Robot does not moved circular");
        }
    }

    private static boolean doesRobotMoveCircular(String str) {
        int x = 0;
        int y = 0;

        char currentPlane = 'n';
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'L') {
                if (currentPlane == 'n') {
                    currentPlane = 'w';
                } else if (currentPlane == 'w') {
                    currentPlane = 's';
                } else if (currentPlane == 's') {
                    currentPlane = 'e';
                } else {
                    currentPlane = 'n';
                }
            }
            if (c == 'R') {
                if (currentPlane == 'n') {
                    currentPlane = 'e';
                } else if (currentPlane == 'e') {
                    currentPlane = 's';
                } else if (currentPlane == 's') {
                    currentPlane = 'w';
                } else {
                    currentPlane = 'n';
                }
            }
            if (c == 'G') {
                switch (currentPlane) {
                    case 'n':
                        y++;
                        break;
                    case 'e':
                        x++;
                        break;
                    case 's':
                        y--;
                        break;
                    case 'w':
                        x--;
                        break;
                }
            }
        }
        return x == 0 && y == 0;
    }
}
