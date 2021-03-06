package com.rs.game.npc.impl.boss.godwars.barrows;

import com.rs.game.npc.Npc;
import com.rs.game.player.controllers.impl.Barrows;
import com.rs.game.world.Entity;
import com.rs.game.world.WorldTile;

@SuppressWarnings("serial")
public class BarrowsBrother extends Npc {

	private final Barrows barrows;

	public BarrowsBrother(int id, WorldTile tile, Barrows barrows) {
		super(id, tile, -1, true, true);
		this.barrows = barrows;
	}

	@Override
	public void sendDeath(Entity source) {
		super.sendDeath(source);
		barrows.killedBrother();
	}

}
