import builder.*;
import character.Humanoid;
import enums.*;
import place.*;
import item.*;
import manager.EventManager;
import manager.Sound;

public class Plot {
    public static void main(String[] args) {
        Market market = new Market("Сытный рынок");
        Cart cart = new Cart();
        cart.addList(new Food(10, 1, 100, FoodType.FISH));
        
        Director director = new Director();
        
        HumanoidBuilder builder = new HumanoidBuilder();
        
        director.makeWitcher(builder);
        Humanoid mainCharacter = builder.getHumanoid();

        director.makeHuman("Десятка", 27, 90, Gender.MALE, builder);
        Humanoid humanFriend = builder.getHumanoid();

        director.makeHuman("Ногорн", 24, 77, Gender.MALE, builder);
        Humanoid humanEnemy = builder.getHumanoid();
        
        director.makeElf("Киврилл", 30, 78, Gender.MALE, builder);
        Humanoid elfEnemy = builder.getHumanoid();

        director.makeHuman("Ренфри", 18, 55, Gender.FEMALE, builder);
        Humanoid humanGirlfriend = builder.getHumanoid();

        market.addChatacter(mainCharacter);
        market.addChatacter(humanFriend);
        market.addChatacter(humanEnemy);
        market.addChatacter(elfEnemy);

        humanEnemy.toAttack(humanFriend, OrganType.HEAD);
        humanEnemy.toAttack(humanFriend, OrganType.NECK);

        humanFriend.moving(4);

        cart.roll();

        humanEnemy.toAttack(mainCharacter, OrganType.LEFT_LEG);
        elfEnemy.toAttack(mainCharacter, OrganType.HEAD);
        EventManager.getEventManager().setLastSound(new Sound(100, SoundType.METAL));

        mainCharacter.toAttack(humanEnemy, OrganType.HEAD);

        elfEnemy.toAttack(mainCharacter, OrganType.EYES);
        elfEnemy.setWeapon(null);

        market.addChatacter(humanGirlfriend);

        humanGirlfriend.moving(10);

        mainCharacter.toSpeak(humanGirlfriend);


    }
}