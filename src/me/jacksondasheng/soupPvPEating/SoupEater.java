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
        Action action = event.getAction();
        Player player = event.getPlayer();
        double health = player.getHealth(),
        maxHealth = player.getMaxHealth();

        if(player.getItemInHand().getType() == Material.MUSHROOM_SOUP && health < maxHealth && (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK)) {
            try {
                player.setHealth(health + 7);
            } catch(IllegalArgumentException exc) {
                player.setHealth(maxHealth);
            }

            player.getItemInHand().setType(Material.BOWL);
        }
    }
}
