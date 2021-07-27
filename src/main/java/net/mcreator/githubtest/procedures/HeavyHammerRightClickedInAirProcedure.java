package net.mcreator.githubtest.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.githubtest.GithubtestModElements;
import net.mcreator.githubtest.GithubtestMod;

import java.util.Map;

@GithubtestModElements.ModElement.Tag
public class HeavyHammerRightClickedInAirProcedure extends GithubtestModElements.ModElement {
	public HeavyHammerRightClickedInAirProcedure(GithubtestModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GithubtestMod.LOGGER.warn("Failed to load dependency entity for procedure HeavyHammerRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"summon minecraft:lightning_bolt");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"say BANG");
			}
		}
	}
}
