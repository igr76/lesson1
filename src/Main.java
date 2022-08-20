public class Main {
    public static void main(String[] args) {

        System.out.println("Привет мир");
        var a=23;
        short b = 23456;
        int c = 455678;
        float d=1.2344f;
        double e=245.678;
        char f=345;
        // взвешивание боксеров
        float boxer1=78.2f;
        float boxer2=82.7f;
        float totalWeight=boxer1+boxer2;
        System.out.println("общий вес двух бойцов:  "+ totalWeight+ "кг.");
        float differenceWeight = Math.abs(boxer1-boxer2);
        System.out.println("Разница в весе между бойцами:  "+differenceWeight+"кг.");
        //ЗАВТРАК
        int banana=80;
        int milk=105;
        int iceCream=100;
        int egg=70;
        int recipe=banana*5+milk*2+iceCream*2+egg*4;
        float totalWeight2=recipe/1000;
        System.out.println("Вес завтрака:  "+totalWeight2+"кг.");
        // Похудение
        int weightLoss1=Math.round(7000/250);
        int weightLoss2=Math.round(7000/500);
        System.out.println("При худении на 250грамм это займет  "+weightLoss1+" дней");
        System.out.println("При худении на 500грамм это займет  "+weightLoss2+" дней");
        //зарплата
        int masha=67760,denis=83690,kristina=76230;
       long masha1=Math.round(masha*1.1);
        long denis1=Math.round(denis*1.1);
        long kristina1=Math.round(kristina*1.1);
        System.out.println("Маша теперь получает    "+masha1+" рублей." +
                "Годовойдоход вырос на   "+(masha1-masha)+" рублей");
        System.out.println("Денис теперь получает   "+denis1+" рублей." +
                "Годовойдоход вырос на   "+(denis1-denis)+" рублей");
        System.out.println("Кристина теперь получает   "+kristina1+" рублей." +
                "Годовойдоход вырос на   "+(kristina1-kristina)+" рублей ");





    }
}
