package k2b6s9j.BoatCraft.render.boat.forestry.wood.greenheart;

import k2b6s9j.BoatCraft.entity.boat.EntityCustomBoat;
import k2b6s9j.BoatCraft.entity.boat.forestry.wood.greenheart.EntityBoatGreenheart;
import k2b6s9j.BoatCraft.render.RenderBoat;
import net.minecraft.util.ResourceLocation;

public class RenderGreenheartWoodBoat extends RenderBoat {
	
	@Override
	public ResourceLocation getTexture() {
		return new ResourceLocation("boatcraft:textures/boats/forestry/greenheart.png");
    }
	
	@Override
	public EntityCustomBoat getEntity() {
		EntityBoatGreenheart entity =  null;
		return entity;
	}
}