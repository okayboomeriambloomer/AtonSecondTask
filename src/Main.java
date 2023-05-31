import java.util.ArrayList;

public class Main {

    static class Gena extends Thread implements Actor {
        ArrayList<String> replics = new ArrayList<>();

        public Gena(String name) {
            super(name);
        }

        {
            replics.add("Даша, угадай, что я нашёл в кладовке");
            replics.add("Когда-то это принадлежало моему отцу, но теперь достанется мне!");
            replics.add("Рома, сынок, угадай, что нашёл папка?");
            replics.add("Солнышко..?");
            replics.add("Ладно, я расскажу всем, потому что по одиночке никто из вас не заслуживает");
            replics.add("Я нашёл молоток моего отца!");
        }

        public void speakSomething() {
            if (!replics.isEmpty()) {
                System.out.print(this.getName() + ":" + " ");
                System.out.println(replics.remove(0));
            }
        }

        @Override
        public synchronized void run() {
            while (true) {
                plzGiveMeSayPhrase(); // дорваться бы до возможности сказать фразу
                speakSomething();
            }
        }
        public synchronized void plzGiveMeSayPhrase() {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public synchronized void ItsTimeToSay() {
            notify();
        }
    }

    static class Dasha extends Thread implements Actor {
        ArrayList<String> replics = new ArrayList<>();

        public Dasha(String name) {
            super(name);
        }

        {
            replics.add("Господи, радость-то какая!");
            replics.add("Мой малыш впервые целуется с девочкой!");
            replics.add("Ну прости, колбастер..");
            replics.add("Точно? А по-моему он лейкопластер!");
            replics.add("Хахахах");
            replics.add("Носки?");
            replics.add("Ооо");
        }

        public void speakSomething() {
            if (!replics.isEmpty()) {
                System.out.print(this.getName() + ":" + " ");
                System.out.println(replics.remove(0));
            }
        }

        @Override
        public synchronized void run() {
            while (true) {
                plzGiveMeSayPhrase(); // дорваться бы до возможности сказать фразу
                speakSomething();
            }
        }
        public synchronized void plzGiveMeSayPhrase() {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public synchronized void ItsTimeToSay() {
            notify();
        }
    }

    static class Roma extends Thread implements Actor {
        ArrayList<String> replics = new ArrayList<>();

        public Roma(String name) {
            super(name);
        }

        {
            replics.add("Грр.. грандмастер!");
            replics.add("Вы просто мои чокнутые фанатки");
            replics.add("Я же вас просил, я грандмастер! Грандмастер бит");
            replics.add("Мама, я крутой! Ты все испортишь, я крутой!!");
            replics.add("Пап, если это резиновая женщина, то я могу всё объяснить");
            replics.add("Свет, кажется барон слишком стар для таких игр, он уже не может прыгнуть");
            replics.add("Ну ладно");
            replics.add("Молодец, барон, хорошая собака..");
            replics.add("Свет, ты жива? Скажи что-нибудь");
            replics.add("Что ты сказала? Я не понял");
            replics.add("Мама!!");
        }

        public void speakSomething() {
            if (!replics.isEmpty()) {
                System.out.print(this.getName() + ":" + " ");
                System.out.println(replics.remove(0));
            }
        }

        @Override
        public synchronized void run() {
            while (true) {
                plzGiveMeSayPhrase(); // дорваться бы до возможности сказать фразу
                speakSomething();
            }
        }
        public synchronized void plzGiveMeSayPhrase() {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public synchronized void ItsTimeToSay() {
            notify();
        }
    }

    static class Sveta extends Thread implements Actor {
        ArrayList<String> replics = new ArrayList<>();

        public Sveta(String name) {
            super(name);
        }

        {
            replics.add("Ха! Загадывай желание, блокбастер");
            replics.add("Да не, мам, он этот.. сосистер");
            replics.add("Пхахпахах");
            replics.add("Ты нашёл солнышко?");
            replics.add("ООО");
            replics.add("Барон, почему ты не подпрыгнул?");
            replics.add("Я в курсе..");
            replics.add("Слушай, а давай тогда так сделаем: ты кинешь тарелку, а я его приподниму");
            replics.add("*Оказывается с тарелкой в зубах*");
            replics.add("Пдоди пближе");
            replics.add("Я тебе эту тарелку щас знаешь куда засуну!!");
        }

        public void speakSomething() {
            if (!replics.isEmpty()) {
                System.out.print(this.getName() + ":" + " ");
                System.out.println(replics.remove(0));
            }
        }

        @Override
        public synchronized void run() {
            while (true) {
                plzGiveMeSayPhrase(); // дорваться бы до возможности сказать фразу
                speakSomething();
            }
        }
        public synchronized void plzGiveMeSayPhrase() {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public synchronized void ItsTimeToSay() {
            notify();
        }
    }

    static class Baron extends Thread implements Actor {
        ArrayList<String> replics = new ArrayList<>();

        public Baron(String name) {
            super(name);
        }

        {
            replics.add("Я подпрыгнул");
            replics.add("А че, будет прикольно");
            replics.add("Вот дурочка, туда тарелка не влезет");
            replics.add("Хм, беру свои слова обратно..");
        }

        public void speakSomething() {
            if (!replics.isEmpty()) {
                System.out.print(this.getName() + ":" + " ");
                System.out.println(replics.remove(0));
            }
        }

        @Override
        public synchronized void run() {
            while (true) {
                plzGiveMeSayPhrase(); // дорваться бы до возможности сказать фразу
                speakSomething();
            }
        }
        public synchronized void plzGiveMeSayPhrase() {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public synchronized void ItsTimeToSay() {
            notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // актерский состав
        Gena gena = new Gena("Гена");
        Dasha dasha = new Dasha("Даша");
        Roma roma = new Roma("Рома");
        Sveta sveta = new Sveta("Света");
        Baron baron = new Baron("Барон");
        // уже в гримерке

        ArrayList<Actor> actors = new ArrayList<>();
        // составляем сценарий
        actors.add(dasha);
        actors.add(dasha);
        actors.add(sveta);
        actors.add(roma);
        actors.add(roma);
        actors.add(roma);
        actors.add(roma);
        actors.add(dasha);
        actors.add(sveta);
        actors.add(dasha);
        actors.add(sveta);
        actors.add(dasha);
        actors.add(gena);
        actors.add(gena);
        actors.add(dasha);
        actors.add(gena);
        actors.add(roma);
        actors.add(gena);
        actors.add(sveta);
        actors.add(gena);
        actors.add(gena);
        actors.add(dasha);
        actors.add(sveta);
        actors.add(sveta);
        actors.add(baron);
        actors.add(roma);
        actors.add(sveta);
        actors.add(sveta);
        actors.add(roma);
        actors.add(baron);
        actors.add(sveta);
        actors.add(roma);
        actors.add(roma);
        actors.add(sveta);
        actors.add(roma);
        actors.add(sveta);
        actors.add(baron);
        actors.add(roma);
        actors.add(baron);
        // сценарий окончен

        // актерам приготовиться
        gena.start();
        dasha.start();
        roma.start();
        sveta.start();
        baron.start();
        // воздуха в грудь наберите

        // камера, свет, мотор!!
        System.out.println("Счастливы вместе\t(в голове должен играть \"Виктор Логинов - Кто тебе сказал\")");
        Thread.sleep(1000);
        for (Actor actor: actors) {
            Thread.sleep(100);
            actor.ItsTimeToSay();
        }
    }
}
