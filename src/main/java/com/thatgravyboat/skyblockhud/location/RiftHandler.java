package com.thatgravyboat.skyblockhud.location;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RiftHandler {
    @SubscribeEvent
    public void onActionBar(ClientChatReceivedEvent event) {
        if (event.type != 2) return;
        // §741m30sф Left     §b160/160✎ Mana
    }

}
