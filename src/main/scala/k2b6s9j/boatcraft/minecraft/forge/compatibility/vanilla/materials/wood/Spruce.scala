package k2b6s9j.boatcraft.compatibility.vanilla.boat.wood

import k2b6s9j.boatcraft.core.traits.Material
import net.minecraft.util.ResourceLocation

trait Spruce extends Material {

	override def texture: ResourceLocation = new ResourceLocation("boatcraft:compatibility/vanilla/textures/boats/wood/spruce.png")
	override def name: String = "Spruce"

}