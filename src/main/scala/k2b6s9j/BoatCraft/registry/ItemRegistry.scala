package k2b6s9j.BoatCraft.registry

import net.minecraft.item.Item
import net.minecraftforge.oredict.OreDictionary

object ItemRegistry {

     def InitItems() {
        //OreDictionary Registration
        OreDictionary.registerOre("itemBoat", Item.boat)
        OreDictionary.registerOre("boat", Item.boat)

        new BoatOak(BoatOak.ID)
        new BoatOakChest(BoatOakChest.ID)
        new BoatOakFurnace(BoatOakFurnace.ID)
        new BoatOakHopper(BoatOakHopper.ID)
        new BoatOakTNT(BoatOakTNT.ID)
        new BoatSpruce(BoatSpruce.ID)
        new BoatSpruceChest(BoatSpruceChest.ID)
        new BoatSpruceFurnace(BoatSpruceFurnace.ID)
        new BoatSpruceHopper(BoatSpruceHopper.ID)
        new BoatSpruceTNT(BoatSpruceTNT.ID)
        new BoatBirch(BoatBirch.ID)
        new BoatBirchChest(BoatBirchChest.ID)
        new BoatBirchFurnace(BoatBirchFurnace.ID)
        new BoatBirchHopper(BoatBirchHopper.ID)
        new BoatBirchTNT(BoatBirchTNT.ID)
        new BoatJungle(BoatJungle.ID)
        new BoatJungleChest(BoatJungleChest.ID)
        new BoatJungleFurnace(BoatJungleFurnace.ID)
        new BoatJungleHopper(BoatJungleHopper.ID)
        new BoatJungleTNT(BoatJungleTNT.ID)
    }
}