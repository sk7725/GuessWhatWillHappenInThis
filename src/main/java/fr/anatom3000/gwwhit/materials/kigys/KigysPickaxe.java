package fr.anatom3000.gwwhit.materials.kigys;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class KigysPickaxe extends PickaxeItem {
    public KigysPickaxe(ToolMaterial material) {
        super(material, 4, -1.3251172648641432f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}