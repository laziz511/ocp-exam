package com.laziz.chapter7.part4;

public enum Season2 {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },
    SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },

    SPRING, FALL;

    public String getHours() {
        return "9am-5pm";
    }
}

class Season2Main {
    public static void main(String[] args) {
        Season2 season = Season2.WINTER;
        System.out.println(season.getHours());      // prints specific 10am-3pm

        Season2 season2 = Season2.SPRING;
        System.out.println(season2.getHours());     // prints default 9am-5pm
    }
}
