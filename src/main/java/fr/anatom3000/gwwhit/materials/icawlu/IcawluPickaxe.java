package fr.anatom3000.gwwhit.materials.icawlu;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class IcawluPickaxe extends PickaxeItem {
    public IcawluPickaxe(ToolMaterial material) {
        super(material, 5, -0.48897694998109165f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}