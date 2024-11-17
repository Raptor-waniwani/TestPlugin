package com.github.raptorwaniwani.testplugin;

import net.md_5.bungee.api.plugin.Plugin;

public final class TestPlugin extends Plugin {

    @Override
    public void onEnable() {
        System.out.println("aaa");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
