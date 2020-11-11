package application;

public class PowerUp extends GameObject {

	public PowerUp(char symbol) {
		setSymbol(symbol);
	}

  //add new power function
	public void addRandomPower(GameScreen screen, PowerUp power) {
		screen.setObjectOnLocation(power, (int) (Math.random() * (screen.getScreenWidth() - 1)),
				(int) (Math.random() * (screen.getScreenHeight() - 1)));
	}
}
