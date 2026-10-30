package com.unpri.charactermanager;

import java.util.ArrayList;
import javax.swing.SwingUtilities;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        manager.addCharacter(new Character("Arjuna", CharacterType.WARRIOR, 5));
        manager.addCharacter(new Character("Merlin", CharacterType.MAGE, 3));
        manager.addCharacter(new Character("Athena", CharacterType.ARCHER, 4));
        manager.addCharacter(new Character("Gatotkaca", CharacterType.WARRIOR, 7));
        manager.addCharacter(new Character("Morgana", CharacterType.MAGE, 1));
        manager.addCharacter(new Character("Srikandi", CharacterType.ARCHER, 6));

        SwingUtilities.invokeLater(() -> {
            ArrayList<Character> list = manager.getAllCharacters();
            MainWindow window = new MainWindow(list);
            window.setVisible(true);
        });
    }
}