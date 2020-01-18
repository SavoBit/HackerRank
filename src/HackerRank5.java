/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Lee
 */

    class Bicycle {

        String define() {
            return "a vehicle with pedals";
        }
    }

    class MotorCycle extends Bicycle {

        String define() {
            return "a vehicle with a motor";
        }

        MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am " + define());
            String temp = super.define();
            System.out.println("My ancestor is a cycle who is " + temp);
        }

    }

public class HackerRank5 {

    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }
}
