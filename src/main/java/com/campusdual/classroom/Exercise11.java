package com.campusdual.classroom;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        //encendido y apagado del televisor
        redRemote.turnOn();
        blackRemote.turnOn();
        redRemote.turnOff();
        blackRemote.turnOff();
        //cambio de canal TV
        redRemote.channelUp();
        redRemote.channelDown();
        blackRemote.channelDown();
        blackRemote.channelUp();
        //subida y bajada de volumen TV
        redRemote.volumeUp();
        redRemote.volumeDown();
        //seleccion de color
        redRemote.getColor();


        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
    }
   /* public void turnOnTv(String option1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your botton: ");
        String option1 = scanner.nextInt();
        if (option1 = "on" ) {
            System.out.println();
        }*/
    }


