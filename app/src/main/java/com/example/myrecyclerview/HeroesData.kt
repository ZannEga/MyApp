package com.example.myrecyclerview

object HeroesData {
    private val data = arrayOf(
        arrayOf(
            "Dead Cells",
            "Dead Cells is a roguelike, Castlevania-inspired action-platformer, allowing you to explore a sprawling, ever-changing castle… assuming you’re able to fight your way past its keepers. To beat the game you’ll have to master 2D souls-like like combat with the ever present threat of permadeath looming. No checkpoints. Kill, die, learn, repeat.",
            "https://upload.wikimedia.org/wikipedia/en/1/1f/Dead_cells_cover_art.png"
        ),
        arrayOf(
            "Hades",
            "Hades is a roguelike game from Supergiant Games, creators of Bastion, Transistor, and Pyre. You play as Zagreus, immortal son of Hades, on his quest to escape from the underworld, fighting through many angry lost souls along the way. Death is a mere inconvenience for Zagreus, returning to Hades' palace each time to reflect in the Mirror of Night and try again. Receive Boons from the other gods of Olympus and find treasures to aid in each escape attempt.",
            "https://static.wikia.nocookie.net/hades_gamepedia_en/images/a/a0/Hades_Pack_Art.png/revision/latest?cb=20181213192439"
        ),
        arrayOf(
            "Cult of The Lamb",
            "Cult of the Lamb casts players in the role of a possessed Lamb saved from destruction by the One Who Waits, and must repay their debt by building a loyal following in his name. Start your own Cult in a land of false prophets, venturing out into diverse and mysterious Biomes to build a loyal community of animal worshippers and spread your Word to become the one true cult.",
            "https://upload.wikimedia.org/wikipedia/en/d/d4/Cult_of_the_Lamb_Key_Art.png"
        ),
        arrayOf(
            "Rogue",
            "Rogue is the predecessor to NetHack and all other roguelike games; it is the reference in the name. Although much simpler than the other roguelikes, it is regarded as a classic, and is just as difficult to beat.",
            "https://upload.wikimedia.org/wikipedia/en/7/74/Rogue_cover.jpg"
        ),
        arrayOf(
            "The Binding of Isaac: Rebirth  ",
            "The Binding of Isaac: Rebirth is a randomly generated action RPG shooter with heavy roguelike elements. Players will accompany Isaac on a quest to escape his mother, facing off against droves of mysterious creatures, discovering secrets, and fighting fearsome bosses. Along the way, Isaac can find bizarre treasures that change his form and give him super-human abilities. But it won't be easy!",
            "https://upload.wikimedia.org/wikipedia/en/e/e1/The_Binding_of_Issac_Rebirth_cover.jpg"
        ),
        arrayOf(
            "Have A Nice Death",
            "It is a hand-drawn 2D Action Rogue-Lite where you play as Death, Founder and CEO of Death Incorporated—a sprawling corporate empire that processes souls for the afterlife—who currently finds himself teetering on the edge of burnout. His top executives, the Sorrows, have been running rampant on Earth’s surface, blatantly ignoring company protocols, leaving him buried in an underworld-sized mountain of paperwork. Now, in order to regain control of his company and soul-ply chain, as well as secure a much-needed vacation, he will need to traverse the various departments of Death Incorporated and remind his unruly subordinates who’s boss.",
            "https://static.wikia.nocookie.net/have-a-nice-death/images/4/4a/Have_a_nice_death_steam_cover.jpg/revision/latest?cb=20220331181245"
        ),
        arrayOf(
            "Vampire Survivors",
            "Mow thousands of night creatures and survive until dawn! Vampire Survivors is a gothic horror casual game with rogue-lite elements, where your choices can allow you to quickly snowball against the hundreds of monsters that get thrown at you.",
            "https://upload.wikimedia.org/wikipedia/en/thumb/e/e6/Vampire_Survivors_key_art.jpg/330px-Vampire_Survivors_key_art.jpg"
        ),
        arrayOf(
            "Hollow Knight",
            "Forge your own path in Hollow Knight! An epic action adventure through a vast ruined kingdom of insects and heroes. Explore twisting caverns, battle tainted creatures and befriend bizarre bugs, all in a classic, hand-drawn 2D style.",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/Hollow_Knight_cover.jpg"
        )
    )


    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (aData in data) {
                val hero = Hero()
                hero.name = aData[0]
                hero.from = aData[1]
                hero.photo = aData[2]


                list.add(hero)
            }


            return list
        }
}
