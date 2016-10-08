/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;
/**
 *
 * @author Michael Kislenko
 */
public class Soldier extends Character implements ISurvivor{
    public Soldier(){
        super(100);
    }
    public void attack(IZombie zombie){
        zombie.decreaseHealth(10);
    }
    
}
