/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hcssassessment;

/**
 *
 * @author komir
 */
public class Dice {
    int r;
    public int roll()
    {
         r = (int) (Math.random()*6 +1);
         return r;
    }
    
}
