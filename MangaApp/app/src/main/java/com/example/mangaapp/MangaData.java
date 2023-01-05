package com.example.mangaapp;

import java.util.ArrayList;

public class MangaData {
    private static String[] mangaNames = {
            "Kimetsu No Yaiba",
            "One Punch-man",
            "Barakamon",
            "Bungou Stray dogs",
            "Death note",
            "Noragami",
            "Domestic na kanojo",
            "Grand Blue",
            "Tokyo Ghoul",
            "Mahouka koukou no rettousei",
            "horimiya",
            "Tomodachi Game",
            "Kaguya-sama Love is War",
            "Mob Psycho 100",
            "Shingeki no Kyojin",
            "Tokyo Ghoul:re",
            "Shinrei Tantei Yakumo",
    };

    private static String[] author ={
            "Gotouge Koyoharu",
            "ONE, Yusuke Murata",
            "Yoshino Satsuki",
            "Asagiri Kafka, Harukawa 35",
            "Obata Takeshi, Ohba Tsugumi",
            "Adachitoka",
            "Sasuga Kei",
            "Inoue Kenji, Yoshioka, Kimitake",
            "Ishida Sui",
            "Satou Tsutomu, Ishida Kana",
            "HERO",
            "Yamaguchi Mikoto, Satou Yuuki",
            "Akasaka Aka",
            "ONE",
            "Isayama Hajime",
            "Ishida Sui",
            "Kaminaga Manabu, Oda Suzuka"
    };

    private static String genre[] = {
            "Actions, Demon, Shounen, Supernatural",
            "Action, Comedy, SuperPower, Sci-fi",
            "Comedy, Shounen, Slice of life",
            "Action, Supernatural, Seinen",
            "Mystery, Shounen, Psychological, Supernatural",
            "Action, Fantasy, Romance, Shounen, Supernatural",
            "Drama, School, Shounen, School",
            "Comedy, Slice of life, Seinen",
            "Action, Mystery, Horror, Supernatural, Psychological, Seinen",
            "Action, Magic, Romance, School, Sci-fi, Supernatural",
            "Comedy, Romance, School, Shounen, Slice of life",
            "Game, Shounen, Psychological",
            "Comedy, School, Romance, Seinen",
            "Action, Comedy, Supernatural",
            "Action, Mystery, Drama, Fantasy, Horror, Psychological, Shounen",
            "Action, Mystery, Drama, Horror, Supernatural, Psychological, Seinen",
            "Action, School, Comedy, Demons, Shounen, Supernatural"
    };

    private static String[] Plot = {
            "Tanjirou Kamado lives with his impoverished family on a remote mountain On a cold winter day, he goes down to the local village in order to sell some charcoal. As dusk falls, he is forced to spend the night in the house of a curious man who cautions him of strange creatures that roam the night: malevolent demons who crave human flesh. \n When he finally makes his way home, Tanjirou's worst nightmare comes true. His entire family has been brutally slaughtered with the sole exception of his sister Nezuko who has turned into a flesh-eating demon. Engulfed in hatred and despair, Tanjirou desperately tries to stop Nezuko from attacking other people, setting out on a journey to avenge his family and find a way to turn his beloved sister back into a human.",
            "After rigorously training for three years, the ordinary Saitama has gained immense strength which allows him to take out anyone and anything with just one punch. He decides to put his new skill to good use by becoming a hero. However, he quickly becomes bored with easily defeating monsters, and wants someone to give him a challenge to bring back the spark of being a hero. \n Upon bearing witness to Saitama's amazing power, Genos, a cyborg, is determined to become Saitama's apprentice. During this time, Saitama realizes he is neither getting the recognition that he deserves nor known by the people due to him not being a part of the Hero Association. Wanting to boost his reputation, Saitama decides to have Genos register with him, in exchange for taking him in as a pupil. Together, the two begin working their way up toward becoming true heroes, hoping to find strong enemies and earn respect in the process.",
            "Seishuu Handa is considered a prodigy in the calligraphy world. However, he is extremely narcissistic about his work, and when a senior curator dismisses his award-winning piece as conventional and bland, he loses his cool, leading to potentially career-ending repercussions. \n After seeing his son's immaturity, his father\u2060—also a master calligrapher—sends Handa to a village in the Goto Islands as punishment. Deprived of city comforts, Handa moves into a house in the local village with the sole intention of spending his stay engrossed in calligraphy. However, the house he has moved into was previously the hideout for some rambunctious children, headed by Naru Kotoishi, who are unwilling to move out. Furthermore, the neighbors seem very interested in the calligrapher, who they see as an amusing oddity! Despite Handa having been uprooted from his comfortable lifestyle, his experiences with the village and its people will teach him things about himself, life, and calligraphy.",
            "Atsushi Nakajima is on the brink of death after being kicked out of his orphanage. With no food and nowhere to go, all hope seems lost—until he saves a mysterious man called Osamu Dazai from drowning. Much to his partner Doppo Kunikida's irritation, Dazai offers Atsushi a meal and reveals they work for the Armed Detective Agency, an organization of gifted individuals who take care of criminal cases the authorities cannot. \n The two ask Atsushi for his assistance in tracking down a supernatural tiger that has been wreaking havoc throughout the city, and he reluctantly agrees. After they resolve the case, Dazai offers him a position in the agency. But the job is about to get a lot more dangerous as the Port Mafia, the local crime syndicate, begins to move against them. Caught in the middle of a turf war, Atsushi must master his newfound special ability in order to protect himself, his new friends, and the entire city.",
            "Ryuk, a god of death, drops his Death Note into the human world for personal pleasure. In Japan, prodigious high school student Light Yagami stumbles upon it. Inside the notebook, he finds a chilling message: those whose names are written in it shall die. Its nonsensical nature amuses Light; but when he tests its power by writing the name of a criminal in it, they suddenly meet their demise.\n  Realizing the Death Note's vast potential, Light commences a series of nefarious murders under the pseudonym \"Kira,\" vowing to cleanse the world of corrupt individuals and create a perfect society where crime ceases to exist. However, the police quickly catch on, and they enlist the help of L—a mastermind detective—to uncover the culprit.\n Death Note tells the thrilling tale of Light and L as they clash in a great battle-of-minds, one that will determine the future of the world.\n",
            "As a relatively unknown minor deity without any worshippers, Delivery God Yato takes on odd jobs for only five yen, with the goal of amassing a fortune large enough to buy himself a shrine. But in addition to obscurity, he has another problem: his \"Shinki,\" or weapon partner, has decided to resign, tired of being with a homeless god. Left with no weapon, Yato takes on more jobs, hoping to find a new partner soon.\n While out putting up fliers for a missing cat, Yato sees said cat and chases after him, right into the path of an oncoming vehicle. Hiyori Iki, a nearby girl, rushes to push Yato out of the way and ends up hurt herself. After waking up in the hospital, she discovers the incident has knocked her soul loose from her body. Realizing his actions caused this, Yato promises to help return Hiyori to normal—for five yen of course. But in order to return her to normal, he requires a new Shinki, which he finds in the rebellious spirit Yukine.\n Noragami tells the story of a girl walking the line between two worlds, and a stray deity's quest for a place to call his own.\n",
            "Natsuo Fujii is in love with his teacher, Hina. Attempting to forget his feelings towards her, Natsuo goes to a mixer with his classmates where he meets an odd girl named Rui Tachibana. In a strange turn of events, Rui asks Natsuo to sneak out with her and do her a favor. To his surprise, their destination is Rui's house—and her request is for him to have sex with her. There's no love behind the act; she just wants to learn from the experience. Thinking that it might help him forget about Hina, Natsuo hesitantly agrees.\n After this unusual encounter Natsuo now faces a new problem. With his father remarrying, he ends up with a new pair of stepsisters; unfortunately, he knows these two girls all too well. He soon finds out his new siblings are none other than Hina and Rui! Now living with both the teacher he loves and the girl with whom he had his \"first time,\" Natsuo finds himself in an unexpected love triangle as he climbs ever closer towards adulthood.\n",
            "Among the seaside town of Izu's ocean waves and rays of shining sun, Iori Kitahara is just beginning his freshman year at Izu University. As he moves into his uncle's scuba diving shop, Grand Blue, he eagerly anticipates his dream college life, filled with beautiful girls and good friends.\n But things don't exactly go according to plan. Upon entering the shop, he encounters a group of rowdy, naked upperclassmen, who immediately coerce him into participating in their alcoholic activities. Though unwilling at first, Iori quickly gives in and becomes the heart and soul of the party. Unfortunately, this earns him the scorn of his cousin, Chisa Kotegawa, who walks in at precisely the wrong time. Undeterred, Iori still vows to realize his ideal college life, but will things go according to plan this time, or will his situation take yet another dive?\n",
            "Lurking within the shadows of Tokyo are frightening beings known as \"ghouls,\" who satisfy their hunger by feeding on humans once night falls. An organization known as the Commission of Counter Ghoul (CCG) has been established in response to the constant attacks on citizens and as a means of purging these creatures. However, the problem lies in identifying ghouls as they disguise themselves as humans, living amongst the masses so that hunting prey will be easier. Ken Kaneki, an unsuspecting university freshman, finds himself caught in a world between humans and ghouls when his date turns out to be a ghoul after his flesh.\n Barely surviving this encounter after being taken to a hospital, he discovers that he has turned into a half-ghoul as a result of the surgery he received. Unable to satisfy his intense craving for human meat through conventional means, Kaneki is taken in by friendly ghouls who run a coffee shop in order to help him with his transition. As he begins what he thinks will be a peaceful new life, little does he know that he is about to find himself at the center of a war between his new comrades and the forces of the CCG, and that his new existence has caught the attention of ghouls all over Tokyo.\n",
            "Magic is a product of neither legends nor fairy tales, but instead has become a technology of reality since a time unknown to people. Supernatural power became a technology systematized through magic, while magic became a technical skill. A \"Supernatural Power User\" became a \"Magic Technician.\" Magic Technicians (in short, Magicians) are nurtured through Magic High Schools and Universities.\n This is a story about:\n Tatsuya, a defective elder brother low achiever.\n  Miyuki, a perfect, flawless younger sister high achiever.\n  After both siblings entered a Magic High School,\n  The stage of daily turbulence was unveiled—.\n",
            "Although admired at school for her amiability and academic prowess, high school student Kyouko Hori has been hiding another side of her. With her parents often away from home due to work, Hori has to look after her younger brother and do the housework, leaving no chance to socialize away from school.\n Meanwhile, Izumi Miyamura is seen as a brooding, glasses-wearing otaku. However, in reality, he is a gentle person inept at studying. Furthermore, he has nine piercings hidden behind his long hair and a tattoo along his back and left shoulder.\n  By sheer chance, Hori and Miyamura cross paths outside of school—neither looking as the other expects. These seemingly polar opposites become friends, sharing with each other a side they have never shown to anyone else.\n",
            "Katagiri Yuuichi believes that friends are more important than money, but he also knows the hardships of not having enough funds. He works hard to save up in order to go on the high school trip, because he has promised his four best friends that they will all go together. However, after the class' money is all collected, it's stolen! Suspicion falls on two of Yuuichi's friends, Sawaragi Shiho and Shibe Makoto.\n Soon afterwards, the five of them are kidnapped, and wake up in a strange room with a character from a short-lived anime. Apparently, one of them has entered them into a \"friendship game\" in order to take care of their massive debt. But who was it, and why did they have such a debt? Could they have stolen the money from class to pay for entry into the game? Yuuichi and his best friends will have to succeed in psychological games that will test or destroy their faith in one another.\n",
            "Considered a genius due to having the highest grades in the country, Miyuki Shirogane leads the prestigious Shuchiin Academy's student council as its president, working alongside the beautiful and wealthy vice president Kaguya Shinomiya. The two are often regarded as the perfect couple by students despite them not being in any sort of romantic relationship.\n However, the truth is that after spending so much time together, the two have developed feelings for one another; unfortunately, neither is willing to confess, as doing so would be a sign of weakness. With their pride as elite students on the line, Miyuki and Kaguya embark on a quest to do whatever is necessary to get a confession out of the other. Through their daily antics, the battle of love begins!\n",
            "Shigeo \"Mob\" Kageyama is an eighth-grade student blessed with extraordinary psychic powers. However, Mob decides to suppress his abilities in public due to its destructive and conspicuous nature. To keep his psychic powers honed, he works under Arataka Reigen—a self-proclaimed esper looking to make use of Mob's skills.\n  Alongside Reigen, Mob spends his days exorcising evil spirits at Reigen's behest. With the simple wish to impress his childhood friend Tsubomi Takane, Mob works toward making himself more desirable. But troubles keep on bombarding his daily life, slowly breaking his shackled feelings. With his repressed emotions welling up, there's no telling what will happen once he reaches his limit.\n",
            "In the present day, life within the walls has finally found peace, since the residents have not dealt with titans for many years. Eren Yeager, Mikasa Ackerman, and Armin Arlert are three young children who dream of experiencing all that the world has to offer, having grown up hearing stories of the wonders beyond the walls. But when the state of tranquility is suddenly shattered by the attack of a massive 60-meter titan, they quickly learn just how cruel the world can be. On that day, Eren makes a promise to himself that he will do whatever it takes to eradicate every single titan off the face of the Earth, with the hope that one day, humanity will once again be able to live outside the walls without fear.\n",
            "Two years have passed since the CCG's raid on Anteiku. Although the atmosphere in Tokyo has changed drastically due to the increased influence of the CCG, ghouls continue to pose a problem as they have begun taking caution, especially the terrorist organization Aogiri Tree, who acknowledge the CCG's growing threat to their existence.\n The creation of a special team, known as the Quinx Squad, may provide the CCG with the push they need to exterminate Tokyo's unwanted residents. As humans who have undergone surgery in order to make use of the special abilities of ghouls, they participate in operations to eradicate the dangerous creatures. The leader of this group, Haise Sasaki, is a half-ghoul, half-human who has been trained by famed special class investigator, Kishou Arima. However, there's more to this young man than meets the eye, as unknown memories claw at his mind, slowly reminding him of the person he used to be.\n",
            "Shinrei Tantei Yakumo tells a story of a college student, Saitou Yakumo, who was born with different eye colors. His red left eye gives him the special ability to see ghosts and spirits. He believes ghosts and spirits are bound to earth because of a certain 'cause' and simply eliminating that 'cause' will let those spirits will rest in peace. Being asked for help by Ozawa Haruka, they begin the investigation together.\n"

    };

    private static int[] mangaImages = {
            R.drawable.kny,
            R.drawable.opm,
            R.drawable.barakamon,
            R.drawable.bsd,
            R.drawable.death_note,
            R.drawable.dewa_gembel,
            R.drawable.domestic_gf,
            R.drawable.drinking_club,
            R.drawable.ghoul,
            R.drawable.shiba,
            R.drawable.hori,
            R.drawable.friends_game,
            R.drawable.loveiswar,
            R.drawable.mob,
            R.drawable.titan,
            R.drawable.tokyo_ghoul_re,
            R.drawable.yakumo
    };

    static ArrayList<Manga> getListData() {
        ArrayList<Manga> list = new ArrayList<>();
        for (int position = 0; position < mangaNames.length; position++){
            Manga manga = new Manga();
            manga.setTitle(mangaNames[position]);
            manga.setMangaka(author[position]);
            manga.setGenre(genre[position]);
            manga.setSynopsis(Plot[position]);
            manga.setPhoto(mangaImages[position]);
            list.add(manga);
        }
        return list;
    }


}
