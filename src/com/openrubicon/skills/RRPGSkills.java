package com.openrubicon.skills;

import org.bukkit.plugin.java.JavaPlugin;
import com.openrubicon.core.iModule;

public class RRPGSkills extends JavaPlugin implements iModule {

    @Override
    public String getKey() {
        return "rrpg-skills";
    }

    @Override
    public String getOverview() {
        return "The skills and xp system of RRPG";
    }

    @Override
    public String getConfiguration() {
        return this.getDataFolder().getAbsolutePath();
    }
}
