package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " oyunu eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " oyunu güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " oyunu silindi.");
		
	}

}
