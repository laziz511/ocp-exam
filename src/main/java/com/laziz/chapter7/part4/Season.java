package com.laziz.chapter7.part4;

/**
 * - we can define different methods for each enum.
 */
public enum Season {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },
    SPRING {
        public String getHours() {
            return "9am-5pm";
        }
    }, SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    }, FALL {
        public String getHours() {
            return "9am-5pm";
        }
    };

    public abstract String getHours();
}
