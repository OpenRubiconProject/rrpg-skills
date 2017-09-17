package com.openrubicon.skills;

import com.openrubicon.core.RRPGCore;
import org.bukkit.plugin.java.JavaPlugin;
import com.openrubicon.core.interfaces.iModule;

public class RRPGSkills extends JavaPlugin implements iModule {

    @Override
    public void onLoad()
    {
        RRPGCore.modules.addModule(this);
    }

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
