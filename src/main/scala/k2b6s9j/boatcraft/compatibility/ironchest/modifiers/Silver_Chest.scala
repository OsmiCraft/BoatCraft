package k2b6s9j.boatcraft.compatibility.ironchest.modifiers

import k2b6s9j.boatcraft.api.Boat.EntityBoatContainer
import cpw.mods.ironchest.IronChestType
import net.minecraft.inventory.IInventory
import cpw.mods.ironchest.TileEntitySilverChest
import net.minecraft.entity.player.EntityPlayer

object Silver_Chest extends GenericIronChest
{
	override def getMeta = IronChestType.SILVER ordinal
	
	override def getName = "Silver Chest"
	
	override def getInventory(boat: EntityBoatContainer): IInventory =
		new Inventory(boat)
	
	private class Inventory(boat: EntityBoatContainer)
		extends GenericIronChest.Inventory(boat, IronChestType.SILVER)
	{
		override def getInventoryName = getName + " Boat"
	}
}