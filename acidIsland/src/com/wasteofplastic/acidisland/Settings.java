package com.wasteofplastic.acidisland;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

/**
 * @author ben
 * Where all the settings are
 */
public class Settings {
    public static Set<String> challengeList;
    public static int waiverAmount;
    public static List<String> challengeLevels;
    public static double acidDamage;
    public static double mobAcidDamage;   
    public static int resetWait;
    public static int maxTeamSize;
    public static String worldName;
    public static int monsterSpawnLimit;
    public static int animalSpawnLimit;
    public static int waterAnimalSpawnLimit;
    // IslandGuard settings
    public static String allowPvP;
    public static boolean allowBreakBlocks;
    public static boolean allowPlaceBlocks;
    public static boolean allowBedUse;
    public static boolean allowBucketUse;
    public static boolean allowShearing;
    public static boolean allowEnderPearls;
    public static boolean allowDoorUse;
    public static boolean allowLeverButtonUse;
    public static boolean allowCropTrample;
    public static boolean allowChestAccess;
    public static boolean allowFurnaceUse;
    public static boolean allowRedStone;
    public static boolean allowMusic;
    public static boolean allowCrafting;
    public static boolean allowBrewing;
    public static boolean allowGateUse;
    public static boolean allowHurtMobs;
    
    public static ItemStack[] chestItems;
    public static int islandDistance;
    public static int sea_level;
    public static int island_protectionRange;
    public static int abandonedIslandLevel;
    public static boolean absorbLava;
    public static boolean absorbFire;
    public static boolean restoreWater;
    public static boolean canPlaceWater;
    public static int spongeRadius;
    public static boolean threadedSpongeSave;
    public static int flowTimeMult;
    public static boolean attackFire;
    public static Object excludedWorlds;
    public static boolean pistonMove;
    public static boolean spongeSaturation;
    public static Double startingMoney;
    public static double netherSpawnRadius;
    public static List<PotionEffectType> acidDamageType = new ArrayList<PotionEffectType>();
    public static boolean resetMoney;
    public static boolean damageOps;
    public static boolean endermanDeathDrop;
    public static boolean allowEndermanGriefing;
    public static boolean allowCreeperDamage;
    public static boolean allowTNTDamage;
    //public static boolean ultraSafeBoats;
    public static boolean logInRemoveMobs;
    public static boolean islandRemoveMobs;
    public static int island_level;
    public static boolean resetChallenges;
    // Spawn fields
    public static boolean allowSpawnDoorUse;
    public static boolean allowSpawnLeverButtonUse;
    public static boolean allowSpawnChestAccess;
    public static boolean allowSpawnFurnaceUse;
    public static boolean allowSpawnRedStone;
    public static boolean allowSpawnMusic;
    public static boolean allowSpawnCrafting;
    public static boolean allowSpawnBrewing;
    public static boolean allowSpawnGateUse;
    public static boolean allowSpawnMobSpawn;
    public static boolean allowSpawnNoAcidWater;
   
}