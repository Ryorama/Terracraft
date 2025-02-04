package io.github.simplycmd.terracraft.blocks;

import io.github.simplycmd.terracraft.registry.BlockReg;
import io.github.simplycmd.terracraft.registry.EntityReg;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import java.util.ArrayList;

@Environment(EnvType.CLIENT)
public class BlockRenderer {
    private static final ArrayList<String> CUTOUT = new ArrayList<>() {{
        add("blue_berry_bush");
        add("daybloom");

        add("forest_pot");

        add("ice_torch");
        add("ice_wall_torch");
        add("bone_torch");
        add("bone_wall_torch");
        add("ultrabright_torch");
        add("ultrabright_wall_torch");
        add("demon_torch");
        add("demon_wall_torch");
        add("cursed_torch");
        add("cursed_wall_torch");
        add("ichor_torch");
        add("ichor_wall_torch");
        add("rainbow_torch");
        add("rainbow_wall_torch");
        add("desert_torch");
        add("desert_wall_torch");
        add("coral_torch");
        add("coral_wall_torch");
        add("corrupt_torch");
        add("corrupt_wall_torch");
        add("crimson_torch");
        add("crimson_wall_torch");
        add("hallowed_torch");
        add("hallowed_wall_torch");
        add("jungle_torch");
        add("jungle_wall_torch");
    }};

    public static void addBlocks() {
        for (String id : CUTOUT) {
            BlockRenderLayerMap.INSTANCE.putBlock(BlockReg.get(id), RenderLayer.getCutout());
        }
    }
}