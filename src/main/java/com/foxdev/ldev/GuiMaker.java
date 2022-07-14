package com.foxdev.ldev;

import dev.triumphteam.gui.builder.item.ItemBuilder;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.GuiItem;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuiMaker implements CommandExecutor {
    private LDev main;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        Gui gui = Gui.gui()
                .title(Component.text(main.getConfig().getString("guititle")))
                .rows(5)
                .create();

        GuiItem item = ItemBuilder.from(Material.ANVIL).name(Component.text( main.getConfig().getString("guiname"))).asGuiItem(event -> {
           //(Wat wil je dat het item doen)

        });


        gui.setItem(5, item);

        gui.open(p);

        return false;
    }
}
