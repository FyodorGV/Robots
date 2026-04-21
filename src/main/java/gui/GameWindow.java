package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class GameWindow extends JInternalFrame implements Save
{
    private final WindowStateManager windowState = new WindowStateManager();
    private final GameVisualizer gameVisualizer;

    public GameWindow() 
    {
        super("Игровое поле", true, true, true, true);
        gameVisualizer = new GameVisualizer();
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(gameVisualizer, BorderLayout.CENTER);
        getContentPane().add(panel);
        pack();
    }

    @Override
    public Map<String, String> saveState() {
        return WindowStateManager.saveInternalFrame(this, getPrefix());
    }

    @Override
    public void restoreState(Map<String, String> state) {
        WindowStateManager.restoreInternalFrame(this, state, getPrefix());
    }

    @Override
    public String getPrefix() {
        return "game";
    }
}
