package com.apple.pattern.singleton.hungrySingleton;

public enum NSHungryEnumSingleton {
    INSTANCE("1000", "SUCCESS");

    private String code;
    private String message;

    NSHungryEnumSingleton(String code, String message) {
        this.code = code;
        this.message = message;
    }

    // 枚举不应该提供set方法，这里仅作为演示用
//    public void setData(Object data) {
//        this.data = data;
//    }

    public static Object getInstance() {
        return INSTANCE;
    }
}
