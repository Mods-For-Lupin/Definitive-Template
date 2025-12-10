package com.cursee.examplemod;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public class ExampleModFabric implements ModInitializer {

  @Override
  public void onInitialize() {

    // bind before init

    ExampleMod.init();
  }

  public static <T> void bind(Registry<@NotNull T> registry, Consumer<BiConsumer<T, Identifier>> source) {
    source.accept((t, rl) -> Registry.register(registry, rl, t));
  }
}
