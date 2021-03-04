package com.zulham.animy.utils

import com.zulham.animy.R
import com.zulham.animy.model.DataModel

object DataAnim {

    private val animtitle = arrayOf(
            "Demon Slayer: Kimetsu no Yaiba",
            "Haikyuu!!",
            "Haikyuu!!: To The Top",
            "Jujutsu Kaisen",
            "Mushoku Tensei: Jobless Reincarnation",
            "Attack on Titan: The Final Season",
            "2.43: Seiin High School Boys Volleyball Team",
            "Kemono Jihen",
            "The Slime Diaries: That Time I Got Reincarnated as a Slime",
            "One Punch Man: Season 2"
    )

    private val animrelease = arrayOf(
            "April, 6 2019",
            "April, 6 2014",
            "January, 11 2020",
            "October, 3 2020",
            "January, 11 2021",
            "December, 7 2020",
            "January, 8 2021",
            "January 10, 2021",
            "April 6, 2021",
            "April 9, 2019"
    )

    private val animgenre = arrayOf(
            "Animation, Drama, Sci-Fi, Fantasy, Action and Adventure",
            "Animation, Comedy, Drama",
            "Animation, Comedy, Drama<",
            "Animation, Action, Adventure, Sci-Fi and Fantasy",
            "Animation, Drama, Comedy, Action, Adventure, Sci-Fi and Fantasy",
            "Animation, Sci-Fi, Fantasy, Action, Adventure, Drama, War, Politics and Mystery",
            "Animation, Drama",
            "Animation, Mystery, Action & Adventure, Sci-Fi & Fantasy",
            "Animation, Comedy, Action & Adventure, Sci-Fi & Fantasy",
            "Action & Adventure, Animation, Comedy"
    )

    private val animproduction = arrayOf(
            "Ufotable",
            "TV Tokyo",
            "TV Tokyo",
            "Mappa",
            "Studio Bing",
            "Mappa",
            "",
            "",
            "",
            ""
    )

    private val animdesc = arrayOf(
            "It is the Taishō period in Japan. Tanjirō, a kindhearted boy who sells charcoal for a living, finds his family slaughtered by a demon. To make matters worse, his younger sister Nezuko, the sole survivor, has been transformed into a demon herself. Though devastated by this grim reality, Tanjirō resolves to become a “demon slayer” so that he can turn his sister back into a human, and kill the demon that massacred his family.",
            "Shōyō Hinata was inspired to play volleyball after seeing Kurasuno High School's' \"little giant\" competing in the national tournament on TV. He trains relentlessly to make up for his lack of height, but suffers a crushing defeat in his first and last tournament of middle school at the hands of his rival Tobio Kageyama. Vowing revenge against Kageyama and hoping to follow in the little giant's footsteps, Hinata joins Kurasuno High School's volleyball team. To his initial dismay, Kageyama is also on Kurasuno's team. The former rivals soon overcome their differences though and combine their strengths to form a legendary combo using Hinata's mobility and Kageyama's precision ball-handling. Together with their team, they compete in prefecture tournaments and promise to meet Kurasuno's fated rival school at nationals.",
            "After their triumphant victory over Shiratorizawa Academy, the Karasuno High School volleyball team has earned their long-awaited ticket to nationals. As preparations begin, genius setter Tobio Kageyama is invited to the All-Japan Youth Training Camp to play alongside fellow nationally recognized players. Meanwhile, Kei Tsukishima is invited to a special rookie training camp for first-years within the Miyagi Prefecture. Not receiving any invitations himself, the enthusiastic Shouyou Hinata feels left behind. However, Hinata does not back down. Transforming his frustration into self-motivation, he boldly decides to sneak himself into the same rookie training camp as Tsukishima. Even though Hinata only lands himself a job as the ball boy, he comes to see this as a golden opportunity. He begins to not only reflect on his skills as a volleyball player but also analyze the plethora of information available on the court and how he can apply it.",
            "Yuuji Itadori is a boy with tremendous physical strength, though he lives a completely ordinary high school life. One day, to save a friend who has been attacked by Curses, he eats a finger of Ryoumen Sukuna, taking the Curse into his own soul. From then on, he shares one body with Sukuna. Guided by the most powerful of sorcerers, Satoru Gojou, Itadori is admitted to the Tokyo Prefectural Jujutsu High School, an organization that fights the Curses and thus begins the heroic tale of a boy who became a Curse to exorcise a Curse, a life from which he could never turn back.",
            "34-year-old virgin loser is kicked out of his home by his family and realized that his life is completely over. As he regrets wasting his life, a truck runs him over and he died. When he wakes up. He’s in a world of sword and sorcery! Reborn as a baby named Rudeus, he decides that this time, he’ll live a life he won’t regret!",
            "The truth revealed through the memories of Grisha's journals shakes all of Eren's deepest beliefs. There is no rugged but free land beyond the walls. There is a whole other world, equally full of oppression and war. Suddenly, the ambitions that have animated the Survey Corps for generations seem small and naive. What is there left to fight for?",
            "Kimichika Haijima was a strong junior high school volleyball team member. After getting into trouble with the team, he moved to his mother's hometown and reunites with his childhood friend, Yuni Kuroba. The two become an ace pair at volleyball, but in their last tournament, get into a big fight. Will they ever play volleyball together again?",
            "When a series of animal bodies that rot away after a single night begin appearing in a remote mountain village, Inugami, a detective from Tokyo who specializes in the occult, is called to investigate. While working the case, he befriends a strange boy who works in the field every day instead of going to school. Shunned by his peers and nicknamed \"Dorotabō\" after a yokai that lives in the mud, he helps Inugami uncover the truth behind the killings – but supernatural forces are at work, and while Dorotabō is just a nickname, it might not be the only thing about the boy that isn't human.",
            "Even in another world, lives aren't always on the line. There's plenty of work to be done, from feeding the community and forging the items the community needs; as well as plenty of play ...and hijinks throughout! Join Rimuru and friends as they kick back and enjoy their daily lives.",
            "Saitama is a hero who only became a hero for fun. After three years of “special” training, though, he’s become so strong that he’s practically invincible. In fact, he’s too strong—even his mightiest opponents are taken out with a single punch, and it turns out that being devastatingly powerful is actually kind of a bore. With his passion for being a hero lost along with his hair, yet still faced with new enemies every day, how much longer can he keep it going?"
    )

    private val animimg = arrayOf(
            R.drawable.kny,
            R.drawable.haikyuu,
            R.drawable.haikyuttt,
            R.drawable.jujutsu,
            R.drawable.mushokutensei,
            R.drawable.aot,
            R.drawable.seiin,
            R.drawable.kemonojihen,
            R.drawable.tetsura,
            R.drawable.opm

    )

    val list: ArrayList<DataModel>
        get() {
            val list: ArrayList<DataModel> = arrayListOf()
            for (position in animtitle.indices) {
                list.add(DataModel(
                        animtitle[position],
                        animrelease[position],
                        animgenre[position],
                        animproduction[position],
                        animdesc[position],
                        animimg[position]
                ))
            }

            return list
        }
}