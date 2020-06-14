package com.company;

public class LapTopTest {
    public static void main(String[] args) {
        LapTop lapTop = new LapTop();
        // 开启
        lapTop.run();
//        使用鼠标
        USB mouse = new Mouse();
        lapTop.useUSB(mouse);
        // 使用键盘
        USB keyBoard = new KeyBoard();
        lapTop.useUSB(keyBoard);

        // 笔记本关闭、
        lapTop.shutDown();
    }
}
