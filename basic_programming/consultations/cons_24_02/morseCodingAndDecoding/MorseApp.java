package morseCodingAndDecoding;

import morseCodingAndDecoding2.service.MorseService;

public class MorseApp {

    /*
    Произвести кодировку текстового сообщения в символьную последовательность азбуки морзе
     */
    public static void main(String[] args) {
        MorseService service = new MorseService();
        service.codingProcess();
    }

}
