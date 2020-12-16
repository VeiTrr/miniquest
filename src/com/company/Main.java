package com.company;

import java.util.Scanner;

public class Main {
    public static Character manager;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("...подпись(ваше имя):");
        manager = new Character(in.next());
        story = new Story();
        while(true){
            manager.intellect+=story.current_situation.dintellect;
            if(manager.intellect>100){
                manager.intellect = 100;
            }
            manager.money+=story.current_situation.dmoney;
            manager.sentiment+=story.current_situation.dsentiment;
            if(manager.sentiment>100){
                manager.sentiment = 100;
            }
            if(manager.sentiment<0){
                manager.sentiment = 0;
            }
            manager.stamina+=story.current_situation.dstamina;
            if(manager.stamina>100){
                manager.stamina = 100;
            }
            if(manager.stamina<0){
                manager.stamina = 0;
            }
            manager.job=story.current_situation.djob;
            System.out.println("=======\nВаша Статистика:" +"\tДолжность:"+ manager.job+"\tДеньги:"+manager.money+"\tНастроение:"+manager.sentiment+"\tИнтеллект:"+manager.intellect+"\tВыносливость:"+manager.stamina+"\n=======");
            System.out.println("============"+story.current_situation.subject+"============");
            System.out.println(story.current_situation.text);
            if(story.isEnd()){
                System.out.println("======Конец!======");return;
            }
            story.go(in.nextInt());
        }

    }
}
