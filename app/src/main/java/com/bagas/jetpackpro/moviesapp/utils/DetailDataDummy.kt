package com.bagas.jetpackpro.moviesapp.utils

import com.bagas.jetpackpro.moviesapp.data.source.local.DetailEntity
import com.bagas.jetpackpro.moviesapp.data.source.local.DetailTvshowEntity
import com.bagas.jetpackpro.moviesapp.data.source.remote.*

object DetailDataDummy {
    fun generateDetailDummyMovies(): ArrayList<DetailEntity> {
        val detailMovies = ArrayList<DetailEntity>()

        detailMovies.add(
                DetailEntity(1,
                        "Mulan (2020)",
                    listOf("Adventure"),
                        "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg",
                        115,
                        5.6,
                  "en"
                )
        )
        detailMovies.add(
                DetailEntity(2,
                        "Train to Busan",
                    listOf("Action"),
                        "Martial law is declared when a mysterious viral outbreak pushes Korea into a state of emergency. Those on an express train to Busan, a city that has successfully fended off the viral outbreak, must fight for their own survival…",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3H1WFCuxyNRP35oiL2qqwhAXxc0.jpg",
                        118,
                        7.6,
                    "ko"
                )
        )
        detailMovies.add(
                DetailEntity(3,
                        "Now You See Me 2",
                        listOf("Action"),
                        "One year after outwitting the FBI and winning the public’s adulation with their mind-bending spectacles, the Four Horsemen resurface only to find themselves face to face with a new enemy who enlists them to pull off their most dangerous heist yet.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/A81kDB6a1K86YLlcOtZB27jriJh.jpg",
                        129,
                        6.5,
                   "en"
                )
        )
        detailMovies.add(
                DetailEntity(4,
                        "Mortal Kombat (2021)",
                        listOf("Fantasy"),
                        "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6Wdl9N6dL0Hi0T1qJLWSz6gMLbd.jpg",
                        110,
                        6.4,
                    "en"
                )
        )
        detailMovies.add(
                DetailEntity(5,
                        "Nobody (2021)",
                        listOf("English"),
                        "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \"nobody.\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg",
                        92,
                        7.5,
                        "en"
                )
        )
        detailMovies.add(
                DetailEntity(6,
                        "Cherry (2021)",
                        listOf("Crime, Drama"),
                        "Cherry drifts from college dropout to army medic in Iraq - anchored only by his true love, Emily. But after returning from the war with PTSD, his life spirals into drugs and crime as he struggles to find his place in the world.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pwDvkDyaHEU9V7cApQhbcSJMG1w.jpg",
                        140,
                        6.6,
                        "en"
                )
        )
        detailMovies.add(
                DetailEntity(7,
                        "Night in Paradise",
                        listOf("Crime, Drama, Thriller"),
                        "An assassin named Tae-goo is offered a chance to switch sides with his rival Bukseong gang, headed by Chairman Doh. Tae-goo rejects the offer that results in the murder of his sister and niece. In revenge, Tae-goo brutally kills Chairman Doh and his men and flees to Jeju Island where he meets Jae-yeon, a terminally ill woman. Though, the henchman of the Bukseong gang, Executive Ma is mercilessly hunting Tae-goo to take revenge.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dYCWUAidqgakGETwZkfGxU7CWhL.jpg",
                        131,
                        6.7,
                        "ko"
                )
        )
        detailMovies.add(
                DetailEntity(8,
                        "Godzilla vs. Kong (2021)",
                        listOf("Action, Science Fiction"),
                        "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
                        113,
                        6.5,
                        "en"
                )
        )
        detailMovies.add(
                DetailEntity(9,
                        "Twist (2021)",
                        listOf("Crime, Drama, Action"),
                        "A Dickens classic brought thrillingly up to date in the teeming heartland of modern London, where a group of street smart young hustlers plan the heist of the century for the ultimate payday.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/h3oT6lZcYC2khtZnzHBgqthj5W.jpg",
                        90,
                        4.0,
                        "en"
                )
        )
        detailMovies.add(
                DetailEntity(10,
                        "Wrong Turn (2021)",
                        listOf("Horror, Thriller"),
                        "Jen and a group of friends set out to hike the Appalachian Trail. Despite warnings to stick to the trail, the hikers stray off course—and cross into land inhabited by The Foundation, a hidden community of mountain dwellers who use deadly means to protect their way of life.",
                        "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4U1SBHmwHkNA0eHZ2n1CuiC1K1g.jpg",
                        110,
                        5.4,
                        "en"
                )
        )

        return detailMovies
    }

    fun generateDetailDummyTvshow(): ArrayList<DetailTvshowEntity> {
        val detailTvshow = ArrayList<DetailTvshowEntity>()

        detailTvshow.add(
                DetailTvshowEntity(1,
                    "The Walking Dead (2010)",
                    listOf("Action & Adventure, Drama, Sci-Fi & Fantasy"),
                    "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg",
                        8.2,
                        "en",
                "177",
                "10")
        )
        detailTvshow.add(
                DetailTvshowEntity(2,
                    "Game of Thrones (2011)",
                    listOf("Sci-Fi & Fantasy, Drama, Action & Adventure"),
                    "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                    "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                    9.3,
                        "en",
                    "73",
                    "8")
        )
        detailTvshow.add(
                DetailTvshowEntity(3,
                "Breaking Bad (2008)",
                listOf("Drama"),
                "When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ggFHVNu6YYI5L9pCfOacjizRGt.jpg",
                9.5,
                        "en",
                "62",
                "5")
        )
        detailTvshow.add(
                DetailTvshowEntity(4,
                "Lucifer (2016)",
                listOf("Crime, Sci-Fi & Fantasy"),
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                8.1,
                        "en",
                "93",
                "5")
        )
        detailTvshow.add(
                DetailTvshowEntity(5,
                "Yellowstone (2018)",
                listOf("Western, Drama"),
                "Follow the violent world of the Dutton family, who controls the largest contiguous ranch in the United States. Led by their patriarch John Dutton, the family defends their property against constant attack by land developers, an Indian reservation, and America’s first National Park.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/43nVQqVsrshaOx9GfJq6JstsfCX.jpg",
                8.6,
                        "en",
                "31",
                "4")
        )
        detailTvshow.add(
                DetailTvshowEntity(6,
                "The Witcher (2019)",
                listOf("Sci-Fi & Fantasy, Drama, Action & Adventure"),
                "Geralt of Rivia, a mutated monster-hunter for hire, journeys toward his destiny in a turbulent world where people often prove more wicked than beasts.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zrPpUlehQaBf8YX2NrVrKK8IEpf.jpg",
                8.2,
                        "en",
                "16",
                "2")
        )
        detailTvshow.add(
                DetailTvshowEntity(7,
                "Chad (2021)",
                listOf("Comedy"),
                "A 14-year-old Persian boy desperately tries to fit in, cope with his mother's dating life, and figure out his cultural identity.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mIKWX4Rr66H09BhYDtDPn1l3CPx.jpg",
                2.3,
                        "en",
                "10",
                "1")
        )
        detailTvshow.add(
                DetailTvshowEntity(8,
                "The Chosen (2019)",
                listOf("Drama, Family"),
                "The life of Christ through the eyes of those who encountered him called The Chosen.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3fY4xLjZc8ee83cP2nvq1pt0wmS.jpg",
                9.6,
                        "en",
                "17",
                "2")
        )
        detailTvshow.add(
                DetailTvshowEntity(9,
                "Dexter (2006)",
                listOf("Crime, Drama, Mystery"),
                "Dexter Morgan, a blood spatter pattern analyst for the Miami Metro Police also leads a secret life as a serial killer, hunting down criminals who have slipped through the cracks of justice.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/p4rx3FW14Ayx1dLHJQBqDGw9YiX.jpg",
                8.6,
                        "en",
                "106",
                "9")
        )
        detailTvshow.add(
                DetailTvshowEntity(10,
                "Lie to Me (2009)",
                listOf("Crime, Drama, Mystery"),
                "The world's leading deception researcher, Dr. Cal Lightman, studies facial expression, body language and tone of voice to determine when a person is lying and why, which helps law enforcement and government agencies uncover the truth. But his skills also make it easier for him to deceive others.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/euhgvAtvBx4CElItl5qwEgWxpdh.jpg",
                8.0,
                        "en",
                "48",
                "3")
        )

        return detailTvshow
    }

    fun generateRemoteDetailDummyMovie(): MovieDetailResponse {

        val myDetailMovie =
            MovieDetailResponse(
                "Cruella",
                listOf(MovieGenresItem("Comedy", 35)),
                    337404,
                "In 1970s London amidst the punk rock revolution, a young grifter named Estella is determined to make a name for herself with her designs. She befriends a pair of young thieves who appreciate her appetite for mischief, and together they are able to build a life for themselves on the London streets. One day, Estella’s flair for fashion catches the eye of the Baroness von Hellman, a fashion legend who is devastatingly chic and terrifyingly haute. But their relationship sets in motion a course of events and revelations that will cause Estella to embrace her wicked side and become the raucous, fashionable and revenge-bent Cruella.",
                    134,
                "/hjS9mH8KvRiGHgjk6VUZH7OT0Ng.jpg",
                    "en",
                    8.8
            )

        return myDetailMovie

    }

    fun generateRemoteDetailTvshow(): TvshowDetailResponse {

        val myDetailTvshow =
            TvshowDetailResponse(
                177,
                listOf(GenresItem("Sci-Fi & Fantasy", 10765)),
                1,
                10,
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg",
                    "en",
                8.2,
                "The Walking Dead (2010)"
            )

        return myDetailTvshow
    }
}