/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.util.*;

/**
 *
 * @author Lee
 */
public class HrComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
         if(p1.score == p2.score) {
             // sort descending name (z before a) (largest to smallest)
             //return p2.name.compareTo(p1.name);
             // sort ascending name (a before z) (smallest to largest)
             return p1.name.compareTo(p2.name);
         } else {
             // sort by ascending score (smallest to largest)
             //return p1.score - p2.score;
             // sort by descending score (largest to smallest)
             return p2.score - p1.score;
         }
    }
    
}

class Player {

    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
