package io.github.simplycmd.terracraft;

import java.util.stream.Stream;

public class ContentLists {
	public static String[] tools = {
			"molten_pickaxe", "cobalt_drill", "cobalt_pickaxe", "palladium_pickaxe", "palladium_drill", "mythril_drill", "mythril_pickaxe", "orichalcum_pickaxe", "orichalcum_drill", "adamantite_drill", "adamantite_pickaxe", "titanium_pickaxe", "titanium_drill", "drax", "pickaxe_axe", "chlorophyte_pickaxe", "chlorophyte_drill", "spectre_pickaxe", "shroomite_digging_claw", "picksaw", "vortex_drill", "vortex_pickaxe", "nebula_drill", "nebula_pickaxe", "solar_flare_drill", "solar_flare_pickaxe", "stardust_drill", "stardust_pickaxe", "laser_drill", "cactus_pickaxe", "tin_pickaxe", "copper_pickaxe", "iron_pickaxe", "lead_pickaxe", "silver_pickaxe", "tungsten_pickaxe", "bone_pickaxe", "candy_cane_pickaxe", "gold_pickaxe", "fossil_pickaxe", "platinum_pickaxe", "reaver_shark", "nightmare_pickaxe", "deathbringer_pickaxe", "", "meteor_hamaxe", "adamantite_chainsaw", "adamantite_waraxe", "titanium_chainsaw", "titanium_waraxe", "chlorophyte_chainsaw", "chlorophyte_greataxe", "molten_hamaxe", "spectre_hamaxe", "butchers_chainsaw", "solar_flare_hamaxe", "vortex_hamaxe", "nebula_hamaxe", "stardust_hamaxe", "haemorrhaxe", "the_axe", "copper_axe", "tin_axe", "iron_axe", "lead_axe", "silver_axe", "tungsten_axe", "gold_axe", "platinum_axe", "cobalt_chainsaw", "cobalt_waraxe", "sawtooth_shark", "war_axe_of_the_night", "blood_lust_cluster", "palladium_chainsaw", "palladium_waraxe", "mythril_chainsaw", "mythril_waraxe", "orichalcum_chainsaw", "orichalcum_waraxe", "wooden_hammer", "rich_mahogany_hammer", "palm_wood_hammer", "boreal_wood_hammer", "copper_hammer", "tin_hammer", "iron_hammer", "ebonwood_hammer", "shadewood_hammer", "lead_hammer", "pearlwood_hammer", "silver_hammer", "tungsten_hammer", "the_breaker", "flesh_grinder", "gold_hammer", "platinum_hammer", "rockfish", "pwnhammer", "hammush", "chlorophyte_warhammer", "chlorophyte_jackhammer", "yellow_wrench", "green_wrench", "blue_wrench", "red_wrench", "wire_cutter", "multicolor_wrench", "actuation_rod", "the_grand_design", "paintbrush", "paint_roller", "paint_scraper", "spectre_paintbrush", "spectre_paint_roller", "spectre_paint_scraper", "grappling_hook", "topaz_hook", "emerald_hook", "amethyst_hook", "sapphire_hook", "ruby_hook", "diamond_hook", "fish_hook", "dual_hook", "ivy_whip", "slime_hook", "spooky_hook", "candy_cane_hook", "christmas_hook", "bat_hook", "skeletron_hand", "web_slinger", "worm_hook", "tendon_hook", "thorn_hook", "illuminant_hook", "anti-gravity_hook", "lunar_hook", "static_hook", "wood_fishing_pole", "reinforced_fishing_pole", "fisher_of_souls", "fleshcatcher", "scarab_fishing_rod", "chum_caster", "fiberglass_fishing_pole", "mechanics_rod", "sitting_ducks_fishing_pole", "hotline_fishing_hook", "golden_fishing_rod", "ice_mirror", "magic_mirror", "cell_phone", "rod_of_discord", "portal_gun", "umbrella", "tragic_umbrella", "magic_conch", "demon_conch", "ice_rod", "leaf_wand", "living_wood_wand", "rich_mahogany_leaf_wand", "living_mahogany_wand", "hive_wand", "bone_wand", "bucket", "bottomless_water_bucket", "bottomless_lava_bucket", "super_absorbant_sponge", "lava_absorbant_sponge", "bug_net", "golden_bug_net", "lavaproof_bug_net", "sickle", "staff_of_regrowth", "clentaminator", "breathing_reed", "binoculars", "guide_to_critter_companionship", "gravediggers_shovel", "vortex_axe", "vortex_chainsaw", "vortex_hammer", "nebula_axe", "nebula_chainsaw", "nebula_hammer", "solar_flare_axe", "solar_flare_chainsaw", "solar_flare_hammer", "stardust_axe", "stardust_chainsaw", "stardust_hammer"
	};
	public static String[] weapons = {
			"copper_shortsword", "tin_shortsword", "wooden_sword", "boreal_wood_sword", "copper_broadsword", "iron_shortsword", "palm_wood_sword", "rich_mahogany_sword", "cactus_sword", "lead_shortsword", "silver_shortsword", "tin_broadsword", "ebonwood_sword", "iron_broadsword", "shadewood_sword", "tungsten_shortsword", "gold_shortsword", "lead_broadsword", "silver_broadsword", "bladed_glove", "tungsten_broadsword", "zombie_arm", "gold_broadsword", "platinum_shortsword", "mandible_blade", "stylish_scissors", "ruler", "platinum_broadsword", "gladius", "bone_sword", "candy_cane_sword", "katana", "ice_blade", "lights_bane", "muramasa", "terragrim", "arkhalis", "exotic_scimitar", "phaseblade", "blood_butcherer", "starfury", "enchanted_sword", "purple_clubberfish", "bee_keeper", "falcon_blade", "blade_of_grass", "fiery_greatsword", "nights_edge", "pearlwood_sword", "classy_cane", "slap_hand", "cobalt_sword", "palladium_sword", "phasesaber_", "ice_sickle", "brand_of_the_inferno", "mythril_sword", "orichalcum_sword", "breaker_blade", "cutlass", "frostbrand", "adamantite_sword", "beam_sword", "titanium_sword", "fetid_baghnakhs", "bladetongue", "tizona", "excalibur", "chlorophyte_saber", "true_excalibur", "death_sickle", "psycho_knife", "keybrand", "chlorophyte_claymore", "the_horsemans_blade", "christmas_tree_sword", "true_nights_edge", "seedler", "flying_dragon", "starlight", "terra_blade", "influx_waver", "star_wrath", "meowmere", "zenith", "wooden_yoyo", "rally", "malaise", "artery", "amazon", "code_1", "valor", "cascade", "formatc", "gradient", "chik", "hel-fire", "amarok", "code_2", "yelets", "reds_throw", "valkyrie_yoyo", "kraken", "the_eye_of_cthulhu", "terrarian", "spear", "trident", "storm_spear", "the_rotted_fork", "swordfish", "dark_lance", "cobalt_naginata", "palladium_pike", "mythril_halberd", "orichalcum_halberd", "adamantite_glaive", "titanium_trident", "gungnir", "ghastly_glaive", "chlorophyte_partisan", "tonbogiri", "mushroom_spear", "obsidian_swordfish", "north_pole", "wooden_boomerang", "enchanted_boomerang", "fruitcake_chakram", "bloody_machete", "shroomerang", "ice_boomerang", "thorn_chakram", "combat_wrench", "flamarang", "flying_knife", "sergeant_united_shield", "light_disc", "bananarang", "possessed_hatchet", "paladins_hammer", "chain_knife", "mace", "flaming_mace", "ball_o_hurt", "the_meatball", "blue_moon", "sunfury", "anchor", "ko_cannon", "drippler_crippler", "chain_guillotines", "dao_of_pow", "flower_pow", "golem_fist", "flairon", "jousting_lance", "shadowflame_knife", "hallowed_jousting_lance", "sleepy_octopod", "scourge_of_the_corruptor", "shadow_jousting_lance", "vampire_knives", "sky_dragons_fury", "daybreak", "solar_eruption", "wooden_bow", "boreal_wood_bow", "copper_bow", "palm_wood_bow", "rich_mahogany_bow", "tin_bow", "ebonwood_bow", "iron_bow", "shadewood_bow", "lead_bow", "silver_bow", "tungsten_bow", "gold_bow", "platinum_bow", "demon_bow", "tendon_bow", "blood_rain_bow", "the_bees_knees", "hellwing_bow", "molten_fury", "sharanga", "pearlwood_bow", "marrow", "ice_bow", "daedalus_stormbow", "shadowflame_bow", "phantom_phoenix", "pulse_bow", "aerial_bane", "tsunami", "eventide", "phantasm", "cobalt_repeater", "palladium_repeater", "mythril_repeater", "orichalcum_repeater", "adamantite_repeater", "titanium_repeater", "hallowed_repeater", "vulcan_repeater", "chlorophyte_shotbow", "stake_launcher", "red_ryder", "flintlock_pistol", "musket", "the_undertaker", "sandgun", "revolver", "minishark", "boomstick", "quad-barrel_shotgun", "handgun", "phoenix_blaster", "clockwork_assault_rifle", "gatligator", "shotgun", "onyx_blaster", "coin_gun", "uzi", "megashark", "venus_magnum", "tactical_shotgun", "sniper_rifle", "candy_corn_rifle", "chain_gun", "xenopopper", "vortex_beater", "s.d.m.g.", "grenade_launcher", "proximity_mine_launcher", "rocket_launcher", "nail_gun", "stynger", "jack_o_lantern_launcher", "snowman_cannon", "celebration", "electrosphere_launcher", "celebration_mk2", "flare_gun", "blowpipe", "blowgun", "snowball_cannon", "paintball_gun", "harpoon", "egg_cannon", "star_cannon", "toxikarp", "dart_pistol", "dart_rifle", "flamethrower", "piranha_gun", "elf_melter", "super_star_shooter", "wand_of_sparking", "amethyst_staff", "topaz_staff", "sapphire_staff", "emerald_staff", "thunder_zapper", "ruby_staff", "diamond_staff", "amber_staff", "vilethorn", "crimson_rod", "magic_missile", "aqua_scepter", "flamelash", "flower_of_fire", "flower_of_frost", "crystal_vile_shard", "life_drain", "clinger_staff", "meteor_staff", "nimbus_rod", "poison_staff", "frost_staff", "tome_of_infinite_wisdom", "rainbow_rod", "venom_staff", "nettle_burst", "shadowbeam_staff", "inferno_fork", "spectre_staff", "staff_of_earth", "bat_scepter", "blizzard_staff", "betsys_wrath", "space_gun", "bee_gun", "roman_candle", "gray_zapinator", "laser_rifle", "zapinator", "wasp_gun", "leaf_blower", "rainbow_gun", "heat_ray", "charged_blaster_cannon", "laser_machinegun", "bubble_gun", "orange_zapinator", "water_bolt", "book_of_skulls", "demon_scythe", "cursed_flames", "golden_shower", "crystal_storm", "magnet_sphere", "razorblade_typhoon", "lunar_flare", "sky_fracture", "magic_dagger", "medusa_head", "blood_thorn", "spirit_flame", "shadowflame_hex_doll", "crystal_serpent", "unholy_trident", "magical_harp", "toxic_flask", "razorpine", "stellar_tune", "nightglow", "nebula_arcanum", "nebula_blaze", "last_prism", "finch_staff", "slime_staff", "hornet_staff", "vampire_frog_staff", "imp_staff", "blade_staff", "spider_staff", "pirate_staff", "sanguine_staff", "optic_staff", "deadly_sphere_staff", "pygmy_staff", "raven_staff", "desert_tiger_staff", "tempest_staff", "terraprisma", "xeno_staff", "stardust_cell_staff", "stardust_dragon_staff", "lightning_aura_rod", "flameburst_rod", "explosive_trap_rod", "ballista_rod", "queen_spider_staff", "lightning_aura_cane", "flameburst_cane", "explosive_trap_cane", "ballista_cane", "staff_of_the_frost_hydra", "lightning_aura_staff", "flameburst_staff", "explosive_trap_staff", "ballista_staff", "lunar_portal_staff", "rainbow_crystal_staff", "leather_whip", "snapthorn", "firecracker", "cool_whip", "durendal", "dark_harvest", "kaleidoscope", "morning_star", "paper_airplane", "white_paper_airplane", "shuriken", "throwing_knife", "poisoned_knife", "snowball", "ale_tosser", "spiky_ball", "bone", "bone_glove", "rotten_egg", "star_anise", "molotov_cocktail", "frost_daggerfish", "javelin", "bone_javelin", "bone_throwing_knife", "grenade", "sticky_grenade", "bouncy_grenade", "beenade", "happy_grenade", "snowball_launcher", "cannon", "bunny_cannon", "land_mine", "bomb", "sticky_bomb", "bouncy_bomb", "dynamite", "sticky_dynamite", "bouncy_dynamite", "bomb_fish", "explosives", "holy_hand_grenade", "holy_water", "unholy_water", "blood_water"
	};
	public static String[] ammunition = {
	};
	public static String[] armor = {
			"copper_helmet", "iron_helmet", "silver_helmet", "gold_helmet", "shadow_helmet", "meteor_helmet", "necro_helmet", "jungle_hat", "molten_helmet", "goggles", "mining_helmet", "sunglasses", "empty_bucket", "wizard_hat", "top_hat", "summer_hat", "bunny_hood", "plumbers_hat", "heros_hat", "fish_bowl", "archaeologists_hat", "ninja_hood", "jungle_rose", "red_hat", "robot_hat", "gold_crown", "diving_helmet", "mime_mask", "cobalt_hat", "cobalt_helmet", "cobalt_mask", "mythril_hood", "mythril_helmet", "mythril_hat", "adamantite_headgear", "adamantite_helmet", "adamantite_mask", "clown_hat", "hallowed_helmet", "hallowed_headgear", "hallowed_mask", "santa_hat", "reds_helmet", "frost_helmet", "tin_helmet", "lead_helmet", "tungsten_helmet", "platinum_helmet", "platinum_crown", "wood_helmet", "ebonwood_helmet", "rich_mahogany_helmet", "pearlwood_helmet", "rune_hat", "crimson_helmet", "snow_hood", "steampunk_hat", "bee_hat", "pharaohs_mask", "tiara", "green_cap", "mushroom_cap", "tam_o_shanter", "mummy_mask", "cowboy_hat", "pirate_hat", "viking_helmet", "cactus_helmet", "shadewood_helmet", "ancient_iron_helmet", "ancient_gold_helmet", "ancient_shadow_helmet", "ancient_necro_helmet", "ancient_cobalt_helmet", "pink_snow_hood", "chlorophyte_mask", "chlorophyte_helmet", "chlorophyte_headgear", "rain_hat", "tiki_mask", "palladium_mask", "palladium_helmet", "palladium_headgear", "orichalcum_mask", "orichalcum_helmet", "orichalcum_headgear", "titanium_mask", "titanium_helmet", "titanium_headgear", "umbrella_hat", "skull", "balla_hat", "gangsta_hat", "sailor_hat", "eye_patch", "skeletron_mask", "turtle_helmet", "beanie", "spectre_hood", "swat_helmet", "shroomite_headgear", "shroomite_mask", "shroomite_helmet", "cenxs_tiara", "crownos_mask", "wills_helmet", "jims_helmet", "aarons_helmet", "d-towns_helmet", "pumpkin_helmet", "nurse_hat", "wizards_hat", "guy_fawkes_mask", "steampunk_goggles", "cyborg_helmet", "creeper_mask", "cat_mask", "ghost_mask", "pumpkin_mask", "robot_mask", "unicorn_mask", "vampire_mask", "witch_hat", "leprechaun_hat", "princess_hat", "bride_of_frankenstein_mask", "karate_tortoise_mask", "scarecrow_hat", "reaper_hood", "fox_mask", "cat_ears", "spooky_helmet", "space_creature_mask", "wolf_mask", "jack_o_lantern_mask", "giant_bow", "reindeer_antlers", "mrs._claus_hat", "tree_mask", "parka_hood", "snow_hat", "elf_hat", "fez", "brain_of_cthulhu_mask", "wall_of_flesh_mask", "twin_mask", "skeletron_prime_mask", "queen_bee_mask", "plantera_mask", "golem_mask", "eater_of_worlds_mask", "eye_of_cthulhu_mask", "destroyer_mask", "spectre_mask", "beetle_helmet", "peddlers_hat", "magic_hat", "bee_headgear", "angler_hat", "spider_mask", "seashell_hairpin", "king_slime_mask", "fish_costume_mask", "boreal_wood_helmet", "palm_wood_helmet", "duke_fishron_mask", "vortex_helmet", "nebula_helmet", "solar_flare_helmet", "moon_mask", "sun_mask", "martian_costume_mask", "martian_uniform_helmet", "solar_cultist_hood", "lunar_cultist_hood", "hitek_sunglasses", "night_vision_helmet", "gladiator_helmet", "lazures_valkyrie_circlet", "tax_collectors_hat", "dye_traders_turban", "buccaneer_bandana", "obsidian_outlaw_hat", "lunatic_cultist_mask", "moon_lord_mask", "fossil_helmet", "stardust_helmet", "wedding_veil", "yoraiz0rs_recolored_goggles", "skiphs_mask", "lokis_helmet", "engineering_helmet", "party_hat", "silly_sunflower_petals", "pedguins_hood", "0x33s_aviators", "ancient_headdress", "forbidden_mask", "lamia_mask", "apprentices_hat", "squires_great_helm", "huntresss_wig", "monks_bushy_brow_bald_cap", "betsy_mask", "dark_mage_mask", "ogre_mask", "valhalla_knights_helm", "dark_artists_hat", "red_riding_hood", "shinobi_infiltrators_helmet", "arkhalis_hood", "leinfors_hair_protector", "ultrabright_helmet", "maid_bonnet", "pink_maid_bonnet", "country_club_cap", "country_club_visor", "gold_fish_bowl", "star_princess_crown", "demon_horns", "bunny_ears", "devil_horns", "fedora", "chef_hat", "star_hairpin", "heart_hairpin", "superhero_mask", "gravedigger_hat", "pretty_pink_ribbon", "funeral_hat", "victorian_goth_hat", "ghostar’s_soul_jar", "dr._man_fly_mask", "butcher_mask", "safemans_sunny_day", "foodbarbarians_horned_helm", "grox_the_greats_horned_cowl", "rock_golem_head", "dog_ears", "fox_ears", "lizard_ears", "panda_ears", "mushroom_hat", "empress_of_light_mask", "hallowed_hood", "ancient_hallowed_mask", "ancient_hallowed_helmet", "ancient_hallowed_headgear", "ancient_hallowed_hood", "rabbit_perch", "queen_slime_mask", "crystal_assassin_hood", "blue_graduation_cap", "maroon_graduation_cap", "black_graduation_cap", "badgers_hat", "copper_chainmail", "iron_chainmail", "silver_chainmail", "gold_chainmail", "shadow_scalemail", "meteor_suit", "necro_breastplate", "jungle_shirt", "molten_breastplate", "tuxedo_shirt", "plumbers_shirt", "heros_shirt", "archaeologists_jacket", "ninja_shirt", "robe", "the_doctors_shirt", "cobalt_breastplate", "mythril_chainmail", "adamantite_breastplate", "mining_shirt", "clown_shirt", "hallowed_plate_mail", "santa_shirt", "reds_breastplate", "frost_breastplate", "tin_chainmail", "lead_chainmail", "tungsten_chainmail", "platinum_chainmail", "wood_breastplate", "ebonwood_breastplate", "rich_mahogany_breastplate", "pearlwood_breastplate", "rune_robe", "crimson_scalemail", "snow_coat", "steampunk_shirt", "bee_shirt", "princess_dress", "pharaohs_robe", "mummy_shirt", "cowboy_jacket", "pirate_shirt", "cactus_breastplate", "shadewood_breastplate", "ancient_shadow_scalemail", "ancient_cobalt_breastplate", "pink_snow_coat", "chlorophyte_plate_mail", "rain_coat", "tiki_shirt", "palladium_breastplate", "orichalcum_breastplate", "titanium_breastplate", "sailor_shirt", "amethyst_robe", "topaz_robe", "sapphire_robe", "emerald_robe", "ruby_robe", "diamond_robe", "white_tuxedo_shirt", "turtle_scale_mail", "spectre_robe", "shroomite_breastplate", "cenxs_breastplate", "crownos_breastplate", "wills_breastplate", "jims_breastplate", "aarons_breastplate", "d-towns_breastplate", "cenxs_dress", "pumpkin_breastplate", "nurse_shirt", "dye_trader_robe", "cyborg_shirt", "creeper_shirt", "cat_shirt", "ghost_shirt", "pumpkin_shirt", "robot_shirt", "unicorn_shirt", "vampire_shirt", "leprechaun_shirt", "pixie_shirt", "witch_dress", "bride_of_frankenstein_dress", "karate_tortoise_shirt", "scarecrow_shirt", "reaper_robe", "fox_shirt", "spooky_breastplate", "space_creature_shirt", "wolf_shirt", "treasure_hunter_shirt", "dryad_coverings", "mrs._claus_shirt", "tree_shirt", "parka_coat", "ugly_sweater", "elf_shirt", "beetle_scale_mail", "beetle_shell", "gi", "kimono", "gypsy_robe", "bee_breastplate", "angler_vest", "spider_breastplate", "mermaid_adornment", "fish_costume_shirt", "boreal_wood_breastplate", "palm_wood_breastplate", "vortex_breastplate", "nebula_breastplate", "solar_flare_breastplate", "martian_costume_shirt", "martian_uniform_torso", "solar_cultist_robe", "lunar_cultist_robe", "gladiator_breastplate", "lazures_valkyrie_cloak", "tax_collectors_suit", "clothiers_jacket", "buccaneer_tunic", "obsidian_longcoat", "fallen_tuxedo_shirt", "fossil_plate", "stardust_plate", "wedding_dress", "yoraiz0rs_uniform", "skiphs_skin", "lokis_breastplate", "silly_sunflower_tops", "pedguins_jacket", "ancient_garments", "forbidden_robes", "lamia_wraps", "apprentices_robe", "squires_plating", "huntresss_jerkin", "monks_shirt", "valhalla_knights_breastplate", "dark_artists_robes", "red_riding_dress", "shinobi_infiltrators_torso", "arkhalis_bodice", "leinfors_excessive_style", "maid_dress", "pink_maid_dress", "country_club_vest", "amber_robe", "master_gamers_jacket", "star_princess_dress", "chef_uniform", "superhero_costume", "pretty_pink_dress", "gravedigger_coat", "funeral_coat", "victorian_goth_dress", "ghostar’s_garb", "dr._man_flys_lab_coat", "butchers_bloodstained_apron", "safemans_sun_dress", "foodbarbarians_wild_wolf_spaulders", "grox_the_greats_chestplate", "mushroom_vest", "ancient_hallowed_plate_mail", "crystal_assassin_shirt", "blue_graduation_gown", "maroon_graduation_gown", "black_graduation_gown", "dead_mans_sweater", "copper_greaves", "iron_greaves", "silver_greaves", "gold_greaves", "shadow_greaves", "meteor_leggings", "necro_greaves", "jungle_pants", "molten_greaves", "tuxedo_pants", "plumbers_pants", "heros_pants", "archaeologists_pants", "ninja_pants", "the_doctors_pants", "cobalt_leggings", "mythril_greaves", "adamantite_leggings", "mining_pants", "clown_pants", "hallowed_greaves", "santa_pants", "reds_leggings", "frost_leggings", "tin_greaves", "lead_greaves", "tungsten_greaves", "platinum_greaves", "wood_greaves", "ebonwood_greaves", "rich_mahogany_greaves", "pearlwood_greaves", "crimson_greaves", "snow_pants", "steampunk_pants", "bee_pants", "mummy_pants", "cowboy_pants", "pirate_pants", "cactus_leggings", "shadewood_greaves", "ancient_shadow_greaves", "ancient_cobalt_leggings", "pink_snow_pants", "chlorophyte_greaves", "tiki_pants", "palladium_leggings", "orichalcum_leggings", "titanium_leggings", "sailor_pants", "white_tuxedo_pants", "turtle_leggings", "spectre_pants", "shroomite_leggings", "cenxs_leggings", "crownos_leggings", "wills_leggings", "jims_leggings", "aarons_leggings", "d-towns_leggings", "cenxs_dress_pants", "pumpkin_leggings", "nurse_pants", "cyborg_pants", "creeper_pants", "cat_pants", "pumpkin_pants", "robot_pants", "unicorn_pants", "vampire_pants", "leprechaun_pants", "pixie_pants", "witch_boots", "karate_tortoise_pants", "scarecrow_pants", "fox_pants", "spooky_leggings", "space_creature_pants", "wolf_pants", "treasure_hunter_pants", "dryad_loincloth", "mrs._claus_heels", "tree_trunks", "parka_pants", "elf_pants", "beetle_leggings", "bee_greaves", "angler_pants", "spider_greaves", "mermaid_tail", "fish_costume_finskirt", "boreal_wood_greaves", "palm_wood_greaves", "vortex_leggings", "nebula_leggings", "solar_flare_leggings", "martian_costume_pants", "martian_uniform_pants", "gladiator_leggings", "tax_collectors_pants", "clothiers_pants", "buccaneer_pantaloons", "obsidian_pants", "fallen_tuxedo_pants", "fossil_greaves", "stardust_leggings", "yoraiz0rs_skirt", "skiphs_bear_butt", "lokis_greaves", "silly_sunflower_bottoms", "pedguins_trousers", "djinns_curse", "ancient_slacks", "forbidden_treads", "lamia_tail", "apprentices_trousers", "squires_greaves", "huntresss_pants", "monks_pants", "valhalla_knights_greaves", "dark_artists_leggings", "red_riding_leggings", "shinobi_infiltrators_pants", "arkhalis_tights", "leinfors_fancypants", "maid_shoes", "pink_maid_shoes", "country_club_trousers", "master_gamers_pants", "chef_pants", "superhero_tights", "pretty_pink_stockings", "funeral_pants", "ghostar’s_tights", "butchers_bloodstained_pants", "safemans_pink_leggings", "foodbarbarians_savage_greaves", "grox_the_greats_greaves", "mushroom_pants", "ancient_hallowed_greaves", "crystal_assassin_pants", "moon_lord_legs"
	};
	public static String[] furniture = {
	};
	public static String[] crafting_stations = {
	};
	public static String[] coins = {
	};
	public static String[] ores = {
	};
	public static String[] bars = {
	};
	public static String[] accessories = {
	};
	public static String[] blocks = {
	};
	public static String[] walls = {
	};
	public static String[] paint = {
	};
	public static String[] gems = {
	};
	public static String[] vanity_items = {
	};
	public static String[] dyes = {
	};
	public static String[] potions = {
	};
	public static String[] statues = {
	};
	public static String[] wire = {
	};
	public static String[] pets = {
	};
	public static String[] mounts = {
	};
	public static String[] minions = {
	};
	public static String[] wings = {
	};
	public static String[] miscellaneous = {
	};

	public static String[] allitems = Stream.of(tools, weapons, ammunition, armor, furniture, crafting_stations, coins, ores, bars, accessories, blocks, walls, paint, gems, vanity_items, dyes, potions, statues, wire, pets, mounts, minions, wings, miscellaneous).flatMap(Stream::of).toArray(String[]::new);
}
