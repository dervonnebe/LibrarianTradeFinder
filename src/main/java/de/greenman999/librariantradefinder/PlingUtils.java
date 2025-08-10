package de.greenman999.librariantradefinder;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;

public class PlingUtils {
    public static void playPling() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null && client.world != null) {
            // Spielt den Pling Sound unabhängig von den Soundeinstellungen
            client.world.playSound(
                client.player,
                client.player.getX(),
                client.player.getY(),
                client.player.getZ(),
                SoundEvents.BLOCK_NOTE_BLOCK_PLING,
                SoundCategory.MASTER,
                1.0F,
                1.0F
            );
        }
    }
}
