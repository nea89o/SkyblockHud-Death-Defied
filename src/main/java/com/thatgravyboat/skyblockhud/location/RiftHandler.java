package com.thatgravyboat.skyblockhud.location;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RiftHandler {
    public static boolean isInRift = false;

    @SubscribeEvent
    public void onActionBar(ClientChatReceivedEvent event) {
        if (event.type != 2) return;
        isInRift = event.message.getUnformattedText().contains("ф Left");
    }
}
