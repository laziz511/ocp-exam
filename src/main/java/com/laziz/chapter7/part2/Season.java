package com.laziz.chapter7.part2;

public enum Season {
    SPRING, SUMMER, FALL, WINTER;
}

class Methods {
    public static void main(String[] args) {
        Season[] seasons = Season.values();

        for (Season season : seasons) {
            String name = season.name();
            System.out.println(name);

            int ordinal = season.ordinal();
            System.out.println(ordinal);
        }
    }
}


class Switch {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        switch (summer) {
            case WINTER:
                System.out.print("Get out the sled!");
                break;
            case SUMMER:
                System.out.print("Time for the pool!");
                break;
            default:
                System.out.print("Is it summer yet?");
        }
    }

    private static void doesNotCompileCode() {
        Season summer = Season.SUMMER;
        var message = switch (summer) {
            case Season.FALL -> "Get out the sled!";    // DOES NOT COMPILE
            case 0 -> "Time for the pool!";             // DOES NOT COMPILE
            default -> "Is it summer yet?";
        };
        System.out.print(message);
    }
}

