import json

blacklist_substrings=["barred_glass"]

theitems = """hnh:woven_bamboo
hnh:bamboo_mat
hnh:stone_column
hnh:calcite_column
hnh:quartz_column
hnh:polished_calcite
hnh:polished_calcite_slab
hnh:chiseled_calcite
hnh:polished_blackstone_brick_chimney
hnh:deepslate_tile_chimney
hnh:deepslate_brick_chimney
hnh:nether_brick_chimney
hnh:red_nether_brick_chimney
hnh:brick_chimney
hnh:mud_brick_chimney
hnh:stone_brick_chimney
hnh:cobblestone_brick_chimney
hnh:cobblestone_bricks
hnh:cobblestone_brick_stairs
hnh:cobblestone_brick_slab
hnh:cobblestone_brick_wall
hnh:thatch
hnh:thatch_slab
hnh:thatch_stairs
hnh:oak_parquet
hnh:spruce_parquet
hnh:birch_parquet
hnh:jungle_parquet
hnh:acacia_parquet
hnh:dark_oak_parquet
hnh:crimson_parquet
hnh:warped_parquet
hnh:oak_trim
hnh:spruce_trim
hnh:birch_trim
hnh:jungle_trim
hnh:acacia_trim
hnh:dark_oak_trim
hnh:mangrove_trim
hnh:crimson_trim
hnh:warped_trim
hnh:sanded_oak_wood
hnh:sanded_spruce_wood
hnh:sanded_birch_wood
hnh:sanded_jungle_wood
hnh:sanded_acacia_wood
hnh:sanded_dark_oak_wood
hnh:sanded_crimson_wood
hnh:sanded_warped_wood
hnh:shingles
hnh:shingle_stairs
hnh:shingle_slab
hnh:white_shingles
hnh:white_shingle_stairs
hnh:white_shingle_slab
hnh:orange_shingles
hnh:orange_shingle_stairs
hnh:orange_shingle_slab
hnh:magenta_shingles
hnh:magenta_shingle_stairs
hnh:magenta_shingle_slab
hnh:light_blue_shingles
hnh:light_blue_shingle_stairs
hnh:light_blue_shingle_slab
hnh:yellow_shingles
hnh:yellow_shingle_stairs
hnh:yellow_shingle_slab
hnh:lime_shingles
hnh:lime_shingle_stairs
hnh:lime_shingle_slab
hnh:pink_shingles
hnh:pink_shingle_stairs
hnh:pink_shingle_slab
hnh:gray_shingles
hnh:gray_shingle_stairs
hnh:gray_shingle_slab
hnh:light_gray_shingles
hnh:light_gray_shingle_stairs
hnh:light_gray_shingle_slab
hnh:cyan_shingles
hnh:cyan_shingle_stairs
hnh:cyan_shingle_slab
hnh:purple_shingles
hnh:purple_shingle_stairs
hnh:purple_shingle_slab
hnh:blue_shingles
hnh:blue_shingle_stairs
hnh:blue_shingle_slab
hnh:brown_shingles
hnh:brown_shingle_stairs
hnh:brown_shingle_slab
hnh:green_shingles
hnh:green_shingle_stairs
hnh:green_shingle_slab
hnh:red_shingles
hnh:red_shingle_stairs
hnh:red_shingle_slab
hnh:black_shingles
hnh:black_shingle_stairs
hnh:black_shingle_slab
hnh:terracotta_bricks
hnh:terracotta_brick_stairs
hnh:terracotta_brick_slab
hnh:white_terracotta_bricks
hnh:white_terracotta_brick_stairs
hnh:white_terracotta_brick_slab
hnh:orange_terracotta_bricks
hnh:orange_terracotta_brick_stairs
hnh:orange_terracotta_brick_slab
hnh:magenta_terracotta_bricks
hnh:magenta_terracotta_brick_stairs
hnh:magenta_terracotta_brick_slab
hnh:light_blue_terracotta_bricks
hnh:light_blue_terracotta_brick_stairs
hnh:light_blue_terracotta_brick_slab
hnh:yellow_terracotta_bricks
hnh:yellow_terracotta_brick_stairs
hnh:yellow_terracotta_brick_slab
hnh:lime_terracotta_bricks
hnh:lime_terracotta_brick_stairs
hnh:lime_terracotta_brick_slab
hnh:pink_terracotta_bricks
hnh:pink_terracotta_brick_stairs
hnh:pink_terracotta_brick_slab
hnh:gray_terracotta_bricks
hnh:gray_terracotta_brick_stairs
hnh:gray_terracotta_brick_slab
hnh:light_gray_terracotta_bricks
hnh:light_gray_terracotta_brick_stairs
hnh:light_gray_terracotta_brick_slab
hnh:cyan_terracotta_bricks
hnh:cyan_terracotta_brick_stairs
hnh:cyan_terracotta_brick_slab
hnh:purple_terracotta_bricks
hnh:purple_terracotta_brick_stairs
hnh:purple_terracotta_brick_slab
hnh:blue_terracotta_bricks
hnh:blue_terracotta_brick_stairs
hnh:blue_terracotta_brick_slab
hnh:brown_terracotta_bricks
hnh:brown_terracotta_brick_stairs
hnh:brown_terracotta_brick_slab
hnh:green_terracotta_bricks
hnh:green_terracotta_brick_stairs
hnh:green_terracotta_brick_slab
hnh:red_terracotta_bricks
hnh:red_terracotta_brick_stairs
hnh:red_terracotta_brick_slab
hnh:black_terracotta_bricks
hnh:black_terracotta_brick_stairs
hnh:black_terracotta_brick_slab
hnh:tiles
hnh:tile_slab
hnh:white_tiles
hnh:white_tile_slab
hnh:orange_tiles
hnh:orange_tile_slab
hnh:magenta_tiles
hnh:magenta_tile_slab
hnh:light_blue_tiles
hnh:light_blue_tile_slab
hnh:yellow_tiles
hnh:yellow_tile_slab
hnh:lime_tiles
hnh:lime_tile_slab
hnh:pink_tiles
hnh:pink_tile_slab
hnh:gray_tiles
hnh:gray_tile_slab
hnh:light_gray_tiles
hnh:light_gray_tile_slab
hnh:cyan_tiles
hnh:cyan_tile_slab
hnh:purple_tiles
hnh:purple_tile_slab
hnh:blue_tiles
hnh:blue_tile_slab
hnh:brown_tiles
hnh:brown_tile_slab
hnh:green_tiles
hnh:green_tile_slab
hnh:red_tiles
hnh:red_tile_slab
hnh:black_tiles
hnh:black_tile_slab
hnh:paper_lantern
hnh:orange_paper_lantern
hnh:magenta_paper_lantern
hnh:light_blue_paper_lantern
hnh:yellow_paper_lantern
hnh:lime_paper_lantern
hnh:pink_paper_lantern
hnh:gray_paper_lantern
hnh:light_gray_paper_lantern
hnh:cyan_paper_lantern
hnh:purple_paper_lantern
hnh:blue_paper_lantern
hnh:brown_paper_lantern
hnh:green_paper_lantern
hnh:red_paper_lantern
hnh:black_paper_lantern
hnh:barred_glass
hnh:white_stained_barred_glass
hnh:orange_stained_barred_glass
hnh:magenta_stained_barred_glass
hnh:light_blue_stained_barred_glass
hnh:yellow_stained_barred_glass
hnh:lime_stained_barred_glass
hnh:pink_stained_barred_glass
hnh:gray_stained_barred_glass
hnh:light_gray_stained_barred_glass
hnh:cyan_stained_barred_glass
hnh:purple_stained_barred_glass
hnh:blue_stained_barred_glass
hnh:brown_stained_barred_glass
hnh:green_stained_barred_glass
hnh:red_stained_barred_glass
hnh:black_stained_barred_glass
hnh:barred_glass_pane
hnh:white_stained_barred_glass_pane
hnh:orange_stained_barred_glass_pane
hnh:magenta_stained_barred_glass_pane
hnh:light_blue_stained_barred_glass_pane
hnh:yellow_stained_barred_glass_pane
hnh:lime_stained_barred_glass_pane
hnh:pink_stained_barred_glass_pane
hnh:gray_stained_barred_glass_pane
hnh:light_gray_stained_barred_glass_pane
hnh:cyan_stained_barred_glass_pane
hnh:purple_stained_barred_glass_pane
hnh:blue_stained_barred_glass_pane
hnh:brown_stained_barred_glass_pane
hnh:green_stained_barred_glass_pane
hnh:red_stained_barred_glass_pane
hnh:black_stained_barred_glass_pane""".split("\n")


for itemname in theitems:
    for blacklist_substring in blacklist_substrings:
        if blacklist_substring in itemname:
            continue
        thejson = {
                "type": "minecraft:block",
                "pools": [
                        {
                                "bonus_rolls": 0.0,
                                "entries": [
                                        {
                                                "type": "minecraft:item",
                                                "name": itemname
                                        }
                                ],
                                "rolls": 1.0
                        }
                ]
        }
        f = open(itemname.replace("hnh:","") + ".json", "w+")
        f.write(json.dumps(thejson, indent=4) + "\n")

f.close()
