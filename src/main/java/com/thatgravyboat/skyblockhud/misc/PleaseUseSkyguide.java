package com.thatgravyboat.skyblockhud.misc;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import com.thatgravyboat.skyblockhud.SkyblockHud;

/***********************
 * PleaseUseSkyguide
 * 
 * A Java class written by Erymanthus / RayDeeUx,
 * DeDiamondPro, and KTibow as a means to minimize instances
 * of enabling SBHud's minimap with SkyGuide installed.
 * 
 * God, would this shit even work?
***********************/

public class PleaseUseSkyguide {
    private boolean hasSentWarningForSession = false;

    @SubscribeEvent
    public void sendWarning(TickEvent.ClientTickEvent event){
        if (Minecraft.getMinecraft().thePlayer == null || !SkyblockHud.config.Map.showMiniMap || !Loader.isModLoaded("skyguide")) return;
        SkyblockHud.config.Map.showMiniMap = false;
        if (hasSentWarningForSession) return;
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "[SBH] SkyGuide by DeDiamondPro has been detected. As a result, SBHud's minimap has been disabled. Please use SkyGuide instead."));
        //prevent sending warning more than once per session
        hasSentWarningForSession = true;
    }
}
