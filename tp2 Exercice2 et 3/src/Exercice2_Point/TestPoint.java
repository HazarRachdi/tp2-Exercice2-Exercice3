package Exercice2_Point;

public class TestPoint {
    public static void main(String[] args) {
        Point p=new Point();
        Point q=new Point(5,8);
        System.out.println("le nombre de point est "+Point.nombre);
        System.out.println("coordonnes  de  point "+(p.numero +1)+" sont:");
        p.affichePoint();
        System.out.println("coordonnes de point "+(q.numero+1)+" sont:");
        q.affichePoint();
        p.setcoordonnerPoint(3,9);
        System.out.println("les nouveaux coordonnes  de  point "+(p.numero+1)+" sont:");
        p.affichePoint();
        p.translate(8,2);
        System.out.println("les nouveaux coordonnes  de  point "+(p.numero+1)+" sont:");
        p.affichePoint();
        if(p.origine()){
            System.out.println("le point "+p.numero+"est dans l'origine");
        }
        if (p.egale(p,q)){
            System.out.println(" coordonnes de point p et q sont égaux");
        }

    }
}
