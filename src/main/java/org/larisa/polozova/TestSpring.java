package org.larisa.polozova;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //обращается к файлу applicationContext.xml и считывает все бины
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        // указываем id бина в качестве 1 аргумента и 2 аргумент - класс
//        Music music = context.getBean("musicBean", Music.class);
        // внедрение зависимостей вручную
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();

        // после работы с контекстом его обязательно нужно закрыть
        context.close();
    }
}
