/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6;

import java.util.ArrayList;

/**
 *
 * @author Hassan
 */
public class Spell {

    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {
        SPELL, CHARM, CURSE
    }

    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
                "Makes invisible ink appear."));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
                "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
                "Enlarges something."));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
                "Hides a secret within someone."));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
                "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
                "Locks an opponent's legs."));

//without streams
/*for (Spell spell : spells)
System.out.println(spell.name);

for (Spell spell : spells)
{
if (spell.type == Spell.SpellType.SPELL)
System.out.println(spell.name);
}*/
//With Streams
        spells.stream().forEach(s -> System.out.println(s));
        System.out.println("");

        spells.stream()
                .filter(s -> s.type == Spell.SpellType.SPELL)
                .forEach(s -> System.out.println(s));
        System.out.println("");

        spells.parallelStream().filter(s -> s.type == Spell.SpellType.SPELL).filter(s -> s.name.toLowerCase().startsWith("a")).forEach(s -> System.out.println(s));
    }

    public Spell(String spellName, SpellType spellType,
            String spellDescription) {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

    public String toString() {
        return name;
    }
}
