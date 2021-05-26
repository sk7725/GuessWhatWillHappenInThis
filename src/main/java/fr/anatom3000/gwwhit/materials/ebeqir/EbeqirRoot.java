package fr.anatom3000.gwwhit.materials.ebeqir;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.BlockItem;
import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class EbeqirRoot  {
public static final Ebeqir EBEQIR = new Ebeqir();
public static final Block EBEQIR_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(1.0200575717385765f,4.09310446844129f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1));
public static final Block EBEQIR_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.814845340756406f,3.577373239355208f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2).luminance(14));
public static final EbeqirShovel EBEQIR_SHOVEL = new EbeqirShovel(EbeqirMaterial.INSTANCE);
public static final EbeqirPickaxe EBEQIR_PICKAXE = new EbeqirPickaxe(EbeqirMaterial.INSTANCE);
public static final EbeqirAxe EBEQIR_AXE = new EbeqirAxe(EbeqirMaterial.INSTANCE);
public static final EbeqirHoe EBEQIR_HOE = new EbeqirHoe(EbeqirMaterial.INSTANCE);
public static final EbeqirSword EBEQIR_SWORD = new EbeqirSword(EbeqirMaterial.INSTANCE);

public void onInitialize() {
Registry.register(Registry.ITEM, new Identifier("gwwhit","ebeqir"),EBEQIR);
FuelRegistry.INSTANCE.add(EBEQIR, 860);
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "ebeqir_block"), EBEQIR_BLOCK);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "ebeqir_block"), new BlockItem(EBEQIR_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "ebeqir_ore"), EBEQIR_ORE);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "ebeqir_ore"), new BlockItem(EBEQIR_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.ITEM, new Identifier("gwwhit","ebeqir_shovel"),EBEQIR_SHOVEL);
Registry.register(Registry.ITEM, new Identifier("gwwhit","ebeqir_pickaxe"),EBEQIR_PICKAXE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","ebeqir_axe"),EBEQIR_AXE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","ebeqir_hoe"),EBEQIR_HOE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","ebeqir_sword"),EBEQIR_SWORD);
RegistryKey<ConfiguredFeature<?,?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit","ore_ebeqir"));
BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
}
public void onInitializeClient() {

}
}