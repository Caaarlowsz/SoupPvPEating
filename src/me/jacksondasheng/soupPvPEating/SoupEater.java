package me.jacksondasheng.soupPvPEating;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SoupEater implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();

        if(player.getItemInHand().getType() == Material.MUSHROOM_SOUP && (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK)) {
            try {
                player.setHealth(player.getHealth() + 7);
            } catch(IllegalArgumentException exc) {
                player.setHealth(player.getHealthScale());
            }

            player.getItemInHand().setType(Material.BOWL);
        }
    }
}
