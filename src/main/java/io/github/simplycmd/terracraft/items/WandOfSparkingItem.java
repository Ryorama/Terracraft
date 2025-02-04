package io.github.simplycmd.terracraft.items;

import io.github.simplycmd.terracraft.entities.spark.SparkEntity;
import io.github.simplycmd.terracraft.items.util.IItem;
import io.github.simplycmd.terracraft.items.util.Value;
import io.github.simplycmd.terracraft.registry.EntityReg;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class WandOfSparkingItem extends Item implements IItem {
    public WandOfSparkingItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        SparkEntity spark = new SparkEntity(EntityReg.SPARK, world, playerEntity);
        spark.updatePosition(playerEntity.getX(), playerEntity.getY() + 2, playerEntity.getZ());
        spark.setProperties(playerEntity, playerEntity.getPitch(), playerEntity.getYaw(), 0.0F);
        world.spawnEntity(spark);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

    @Override
    public Value getSellValue() {
        return new Value(0, 0, 10, 0);
    }
}
