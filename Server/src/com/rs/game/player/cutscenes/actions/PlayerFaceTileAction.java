package com.rs.game.player.cutscenes.actions;

import com.rs.game.player.Player;
import com.rs.game.player.cutscenes.Cutscene;
import com.rs.game.world.WorldTile;

public class PlayerFaceTileAction extends CutsceneAction {

	private final int x;
	private final int y;

	public PlayerFaceTileAction(int x, int y, int actionDelay) {
		super(-1, actionDelay);
		this.x = x;
		this.y = y;
	}

	@Override
	public void process(Player player, Object[] cache) {
		Cutscene scene = (Cutscene) cache[0];
		player.setNextFaceWorldTile(new WorldTile(scene.getBaseX() + x, scene
				.getBaseY() + y, player.getPlane()));
	}

}
