interface Player{
public boolean hasLost();
public int chooseMove();
public boolean isFasterThan(Player gamer);
public void attack(Player gamer,int playermove);
public Monster getMonster();
}
