package com.leonxinu.leonxinujuc;

/**
 * @author :leon
 * @date : 2022/5/22 20:02
 */
public class Single {
    public static Single INSTANCE = null;

    private Single() {};

    // DCL
    public static Single getInstance() {
        if (INSTANCE == null) {
            synchronized (Single.class) {
                if (INSTANCE == null) {
                    INSTANCE =  new Single();
                }
            }
        }
        return INSTANCE;
    }
}
