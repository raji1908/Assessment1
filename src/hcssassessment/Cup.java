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
public class Cup extends Dice{
int sum=0;
public int multiple(int n){
	for(int i=1;i<=n;i++){
	Dice d=new Dice();
	sum+=d.roll();
	}
	return sum;
}
}