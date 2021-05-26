package fr.anatom3000.gwwhit.materials.tidziq;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.item.BlockItem;
import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorMaterial;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class TidziqRoot  {
public static final Tidziq TIDZIQ = new Tidziq();
public static final Block TIDZIQ_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.578756144788023f,2.3471119683784356f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1));
public static final Block TIDZIQ_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.6496302854756935f,3.218823129572453f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2));
public static final ArmorMaterial tidziqArmorMaterial = new TidziqArmorMaterial();
public static final TidziqHelmet TIDZIQ_HELMET = new TidziqHelmet(tidziqArmorMaterial);
public static final TidziqChestplate TIDZIQ_CHESTPLATE = new TidziqChestplate(tidziqArmorMaterial);
public static final TidziqLeggings TIDZIQ_LEGGINGS = new TidziqLeggings(tidziqArmorMaterial);
public static final TidziqBoots TIDZIQ_BOOTS = new TidziqBoots(tidziqArmorMaterial);
public static final TidziqSword TIDZIQ_SWORD = new TidziqSword(TidziqMaterial.INSTANCE);

public void onInitialize() {
Registry.register(Registry.ITEM, new Identifier("gwwhit","tidziq"),TIDZIQ);
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "tidziq_block"), TIDZIQ_BLOCK);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "tidziq_block"), new BlockItem(TIDZIQ_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "tidziq_ore"), TIDZIQ_ORE);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "tidziq_ore"), new BlockItem(TIDZIQ_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.ITEM, new Identifier("gwwhit","tidziq_helmet"),TIDZIQ_HELMET);
Registry.register(Registry.ITEM, new Identifier("gwwhit","tidziq_chestplate"),TIDZIQ_CHESTPLATE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","tidziq_leggings"),TIDZIQ_LEGGINGS);
Registry.register(Registry.ITEM, new Identifier("gwwhit","tidziq_boots"),TIDZIQ_BOOTS);
Registry.register(Registry.ITEM, new Identifier("gwwhit","tidziq_sword"),TIDZIQ_SWORD);
RegistryKey<ConfiguredFeature<?,?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit","ore_tidziq"));
BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
}
public void onInitializeClient() {

}
}