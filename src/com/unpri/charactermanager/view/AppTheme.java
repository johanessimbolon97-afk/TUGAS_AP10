package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.CharacterType;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public final class AppTheme {

    public static final int HIGH_LEVEL_THRESHOLD = 5;

    public static final Color BG_MAIN    = Color.decode("#13131f");
    public static final Color TEXT_MAIN  = Color.decode("#dfe6e9");
    public static final Color TEXT_LIGHT = Color.WHITE;
    public static final Color GOLD       = Color.decode("#fdcb6e");

    public static final Font FONT_TITLE = new Font("SansSerif", Font.BOLD, 22);
    public static final Font FONT_BODY  = new Font("SansSerif", Font.PLAIN, 14);
    public static final Font FONT_MONO  = new Font("Monospaced", Font.PLAIN, 13);

    public static final Border CARD_BORDER = 
            BorderFactory.createEmptyBorder(8, 12, 8, 12);

    public static final Border BORDER_WARRIOR = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.decode("#ff7675"), 2), CARD_BORDER);
    public static final Border BORDER_MAGE = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.decode("#74b9ff"), 2), CARD_BORDER);
    public static final Border BORDER_ARCHER = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.decode("#55efc4"), 2), CARD_BORDER);

    private AppTheme() { }

    public static Color colorFor(CharacterType type) {
        switch (type) {
            case WARRIOR: return Color.decode("#d63031");
            case MAGE:    return Color.decode("#0984e3");
            case ARCHER:  return Color.decode("#00b894");
            default:      return Color.GRAY;
        }
    }

    public static Border borderFor(CharacterType type) {
        switch (type) {
            case WARRIOR: return BORDER_WARRIOR;
            case MAGE:    return BORDER_MAGE;
            case ARCHER:  return BORDER_ARCHER;
            default:      return CARD_BORDER;
        }
    }

    public static String describe(CharacterType type) {
        switch (type) {
            case WARRIOR: return "Warrior: Jarak dekat, HP tinggi, pertahanan kuat.";
            case MAGE:    return "Mage: Serangan sihir area, HP rendah, burst damage.";
            case ARCHER:  return "Archer: Jarak jauh, kecepatan tinggi, serangan seimbang.";
            default:      return "Role belum terdaftar";
        }
    }
}