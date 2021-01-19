package leson_3.tms;

public class Main {

    public static void main(String[] args) {

        int s=2000000000;
        int sec =s % 60;
        int m=(s-sec)/60;
        int min = m % 60;
        int h = (m-min)/60;
        int hour = h % 24;
        int d = (h-hour)/24;
        int day = d % 7;
        int w = (d-day)/7;
        int week = w % 30;
        int mn = (w-week)/30;
        int month = mn %12;
        int y = (mn-month)/12;




        System.out.println( m + " минут " + sec + " секунд ");
        System.out.println( h + " часов "+ min + " минут " + sec + " секунд ");
        System.out.println( d + " дней "+ hour + " часов "+ min + " минут " + sec + " секунд ");
        System.out.println( w + " недель " + day + " дней "+ hour + " часов "+ min + " минут " + sec + " секунд ");
        System.out.println( mn + " месяц " + week + " недель " + day + " дней "+ hour + " часов "+ min + " минут " + sec + " секунд ");
        System.out.println( y + " лет " + month + " месяцев " + week + " недель " + day + " дней "+ hour + " часов "+ min + " минут " + sec + " секунд ");
    }
}
