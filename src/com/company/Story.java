package com.company;

public class Story {
    private  Situation start_story;
    public Situation current_situation;

    Story(){
        start_story = new Situation(
                "Первый рабочий день",
                "Вы пришли в первый день на работу, вам сказали осмотреться и найти себе занятие вы выбираете:\n"
                       +"1)Пойти знакомиться с коллегами.\n"
                       +"2)Пойти на охрану и поискать забытые вещи.\n"
                       +"3)Пойти читать книги.",
                "Рядовой сотрудник",3,0,0,0,0);
         start_story.direction[0] = new Situation("Знакомства","За сегодня вы познакомились со всеми своими коллегами","рядовой сотрудник",0,0,0,10,-5);
        start_story.direction[1] = new Situation("Вещи с охраны","Вы нашли несколько не очень ценных вещей и перепродали их своим коллегам и друзьям.\n"
                +"вы заработали 250р","Рядовой сотрудник",0,0,250,5,-5);
        start_story.direction[2] = new Situation("Чтение","Вы прочитали позновательные книги и узнали что-то новое."
                +"Вы повысили интеллект на 15","Рядовой сотрудник",0,15,0,-5,-5);
          current_situation = start_story;
    }
    public void go(int num){
        if(num <= current_situation.direction.length) {
            current_situation = current_situation.direction[num - 1];
        }else{
            System.out.println("Вы можете выбрать из"+current_situation.direction.length+"вариантов");
        }
    }
    public boolean isEnd(){
        return current_situation.direction.length==0;
    }
}
