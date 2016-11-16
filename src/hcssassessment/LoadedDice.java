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
public class LoadedDice 
{

    public int loadedRoll(int expected)
    {
	int prob = (Math.random() <= 0.5) ? 1 : 2;
	if(prob==1)
        {
            return expected;
	}
	else 
        {
            int value = (int)(Math.random() * 6 + 1);
            while(true)
            {
                if(value==expected)
                {
                    value = (int)(Math.random() * 6 + 1);
                }
                else
                {
                    break;
                }
            }
            return value;
        }
    }
}
