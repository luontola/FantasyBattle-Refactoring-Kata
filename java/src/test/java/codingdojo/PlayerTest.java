package codingdojo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class PlayerTest {

    // choose this one if you are familiar with mocks
    @Disabled("Test is not finished yet")
    @Test
    void damageCalculationsWithMocks() {
        Inventory inventory = mock(Inventory.class);
        Stats stats = mock(Stats.class);
        SimpleEnemy target = mock(SimpleEnemy.class);

        Damage damage = new Player(inventory, stats).calculateDamage(target);
        assertEquals(10, damage.getAmount());
    }

    @Test
    public void zero_everything() {
        Equipment equipment = new Equipment(
                new BasicItem(null, 0, 0),
                new BasicItem(null, 0, 0),
                new BasicItem(null, 0, 0),
                new BasicItem(null, 0, 0),
                new BasicItem(null, 0, 0));
        Inventory inventory = new Inventory(equipment);
        Stats stats = new Stats(0);
        List<Buff> buffs = List.of();
        Armor armor = new SimpleArmor(0);
        SimpleEnemy target = new SimpleEnemy(armor, buffs);
        Damage damage = new Player(inventory, stats).calculateDamage(target);
        assertEquals(0, damage.getAmount());
    }
}
