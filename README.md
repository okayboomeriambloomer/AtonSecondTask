# AtonSecondTask

Очень крутое задание! Да и в принципе эти три задания наверно самые интересные и увлекательные из всех тестовых, которые я делал.  
Так получилось, что в детстве я особо не проникся западной ситкомовской классикой и с удовольствием смотрел по телевизору наши русские адаптации. Одну из которых решил реализовать в задании. Итак, вашему вниманию прилагается 5 нитей: Гена, Даша, Рома, Света и Барон Букины из Счастливых Вместе. Я знаю, что в задании было 6 тредов, просто не смог подобрать кандидатуру на 6ю роль, да и непосредственное воссоздание сценок довольно рутинное.  
Каждый из актеров представляет собой объект, который наследует класс Thread(чтобы сразу переопределить run() и стартануть), а также реализует интерфейс Actor. Не буду бить себя кулаком в грудь, интерфейс нужен просто для унификации и не шибко важен, что не скажешь о методах. В нём 3 метода:
1.	speakSomething() – достает первую фразу из листа фраз для персонажа, выводит её и удаляет фразу из листа.
2.	plzGiveMeSayPhrase() – метод, в котором треды пребывают большую часть времени. Точнее они пребывают в состоянии waiting, а в этом методе они просто в него переходят. Всё дело в методе wait(), который их «усыпляет»
3.	ItsTimeToSay() – метод, который выводит треды из состояния waiting(и переводит в состояние running, это для протокола). Метод notify() заставляет нить проснуться, выйти из метода plzGiveMeSayPhrase(), в котором она заснула, и зайти в метод speakSomething(). Всё это в бесконечном цикле в методе run().  
Реализовывал через так называемую блокирующую очередь.  
Это есть у каждого класса-актера. А также у них есть лист с набором реплик и имя, которое инициализируется конструктором из класса Thread и выводится перед каждой фразой.  
В main() создаю все экземпляры, а также лист, который представляет из себя очередь из реплик актеров. После заполнения листа, для каждого объекта вызывается вышеупомянутый метод ItsTimeToSay().  
