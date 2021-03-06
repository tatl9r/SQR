package ru.netology.sqr;

public class SQRService {
    /*
    от 10 до 99
    i * i
    500<x<700

     */
    public int crypticCount(int limit, int num) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x > num && x < limit) {
                count++;
            }
        }
        return count;
    }
}