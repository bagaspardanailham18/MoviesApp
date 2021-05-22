package com.bagas.jetpackpro.moviesapp.utils

import com.bagas.jetpackpro.moviesapp.data.MovieEntity
import com.bagas.jetpackpro.moviesapp.data.TvshowEntity

object DataDummy {
    fun GenerateDummyMovies(): ArrayList<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity("1",
            "Mulan (2020)",
            "When the Emperor of China issues a decree that one man per family must serve in the Imperial Chinese Army to defend the country from Huns, Hua Mulan, the eldest daughter of an honored warrior, steps in to take the place of her ailing father. She is spirited, determined and quick on her feet. Disguised as a man by the name of Hua Jun, she is tested every step of the way and must harness her innermost strength and embrace her true potential.",
            "1h 55min",
                "5.6/10",
                "Niki Caro",
                "Yifei Liu, Donnie Yen, Gong Li",
                "Action, Adventure, Drama",
                    "https://www.youtube.com/watch?v=KK8FHdFluOQ",
            "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/aKx1ARwG55zZ0GpRvU2WrGrCG9o.jpg")
        )
        movies.add(
            MovieEntity("2",
                "Train to Busan",
                "Martial law is declared when a mysterious viral outbreak pushes Korea into a state of emergency. Those on an express train to Busan, a city that has successfully fended off the viral outbreak, must fight for their own survival…",
                "1h 58min",
                "7.6/10",
                "Sang-ho Yeon",
                "Gong Yoo, Yu-mi Jung, Ma Dong-seok",
                "Action, Horror, Thriller",
                    "https://www.youtube.com/watch?v=pyWuHv2-Abk",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3H1WFCuxyNRP35oiL2qqwhAXxc0.jpg")
        )
        movies.add(
            MovieEntity("3",
                "Now You See Me 2",
                "One year after outwitting the FBI and winning the public’s adulation with their mind-bending spectacles, the Four Horsemen resurface only to find themselves face to face with a new enemy who enlists them to pull off their most dangerous heist yet.",
                "2h 9min",
                "6.5/10",
                "Jon M. Chu",
                "Jesse Eisenberg, Mark Ruffalo, Woody Harrelson",
                " Action, Adventure, Comedy",
                    "https://www.youtube.com/watch?v=4I8rVcSQbic",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/A81kDB6a1K86YLlcOtZB27jriJh.jpg")
        )
        movies.add(
            MovieEntity("4",
                "Mortal Kombat (2021)",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "1h 50min",
                "6.4/10",
                "Simon McQuoid",
                "Lewis Tan, Jessica McNamee, Josh Lawson",
                "Action, Adventure, Fantasy",
                    "https://www.youtube.com/watch?v=NYH2sLid0Zc&pp=qAMBugMGCgJpZBAB",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6Wdl9N6dL0Hi0T1qJLWSz6gMLbd.jpg")
        )
        movies.add(
            MovieEntity("5",
                "Nobody (2021)",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "1h 32min",
                "7.5/10",
                "Ilya Naishuller",
                "Bob Odenkirk, Aleksey Serebryakov, Connie Nielsen",
                "Action, Crime, Drama",
                    "https://www.youtube.com/watch?v=wZti8QKBWPo",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg")
        )
        movies.add(
            MovieEntity("6",
                "Cherry (2021)",
                "Cherry drifts from college dropout to army medic in Iraq - anchored only by his true love, Emily. But after returning from the war with PTSD, his life spirals into drugs and crime as he struggles to find his place in the world.",
                "2h 22min",
                "6.6/10",
                "Anthony Russo, Joe Russo",
                "Tom Holland, Ciara Bravo, Jack Reynor",
                "Crime, Drama",
                    "https://www.youtube.com/watch?v=Nt_wyydppg8",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pwDvkDyaHEU9V7cApQhbcSJMG1w.jpg")
        )
        movies.add(
            MovieEntity("7",
                "Night in Paradise",
                "An assassin named Tae-goo is offered a chance to switch sides with his rival Bukseong gang, headed by Chairman Doh. Tae-goo rejects the offer that results in the murder of his sister and niece. In revenge, Tae-goo brutally kills Chairman Doh and his men and flees to Jeju Island where he meets Jae-yeon, a terminally ill woman. Though, the henchman of the Bukseong gang, Executive Ma is mercilessly hunting Tae-goo to take revenge.",
                "2h 11min",
                "6.7/10",
                "Park Hoon-jung",
                "Tae-goo Eom, Yeo-bin Jeon, Seung-Won Cha",
                "Crime, Drama",
                    "https://www.youtube.com/watch?v=_Sm6_FK51VA",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/dYCWUAidqgakGETwZkfGxU7CWhL.jpg")
        )
        movies.add(
            MovieEntity("8",
                "Godzilla vs. Kong (2021)",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                "1h 53min",
                "6.5/10",
                "Adam Wingard",
                "Alexander Skarsgård, Millie Bobby Brown, Rebecca Hall",
                "Action, Sci-Fi, Thriller",
                    "https://www.youtube.com/watch?v=odM92ap8_c0&t=36s",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg")
        )
        movies.add(
            MovieEntity("9",
                "Twist (2021)",
                "A Dicken’s classic brought thrillingly up to date in the teeming heartland of modern London, where a group of street smart young hustlers plan the heist of the century for the ultimate payday.",
                "1h 30min",
                "4.0/10",
                "Martin Owen",
                "Dominic Di Tommaso, Lena Headey, Samuel Leakey",
                "Action, Drama",
                    "https://www.youtube.com/watch?v=zKhDF-55R7g",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/h3oT6lZcYC2khtZnzHBgqthj5W.jpg")
        )
        movies.add(
            MovieEntity("10",
                "Wrong Turn (2021)",
                "Jen and a group of friends set out to hike the Appalachian Trail. Despite warnings to stick to the trail, the hikers stray off course—and cross into land inhabited by The Foundation, a hidden community of mountain dwellers who use deadly means to protect their way of life.",
                "1h 50m",
                "5.4/10",
                "Mike P. Nelson",
                "Charlotte Vega, Adain Bradley, Bill Sage",
                "Horror, Thriller",
                    "https://www.youtube.com/watch?v=ccaNMcPqpQ0",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4U1SBHmwHkNA0eHZ2n1CuiC1K1g.jpg")
        )

        return movies
    }

    fun GenerateDummyTvshow(): ArrayList<TvshowEntity> {
        val tvshows = ArrayList<TvshowEntity>()

        tvshows.add(
            TvshowEntity("1",
                "The Walking Dead (2010)",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                "10 Seasons",
                    "177 Episodes",
                "8.2/10",
                "Frank Darabont",
                "Andrew Lincoln, Norman Reedus, Melissa McBride",
                "Drama, Horror, Thriller",
                    "https://www.youtube.com/watch?v=sfAc2U20uyg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg")
        )
        tvshows.add(
            TvshowEntity("2",
                "Game of Thrones (2011)",
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                "8 Seasons",
                    "73 Episodes",
                "9.3/10",
                "David Benioff, D.B. Weiss",
                "Emilia Clarke, Peter Dinklage, Kit Harington",
                "Action, Adventure, Drama",
                    "https://www.youtube.com/watch?v=BpJYNVhGf1s",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg")
        )
        tvshows.add(
            TvshowEntity("3",
                "Breaking Bad (2008)",
                "When Walter White, a New Mexico chemistry teacher, is diagnosed with Stage III cancer and given a prognosis of only two years left to live. He becomes filled with a sense of fearlessness and an unrelenting desire to secure his family's financial future at any cost as he enters the dangerous world of drugs and crime.",
                "5 Seasons",
                    "62 Episodes",
                "9.5/10",
                "Vince Gilligan",
                "Bryan Cranston, Aaron Paul, Anna Gunn",
                "Crime, Drama, Thriller",
                    "https://www.youtube.com/watch?v=HhesaQXLuRY",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ggFHVNu6YYI5L9pCfOacjizRGt.jpg")
        )
        tvshows.add(
            TvshowEntity("4",
                "Lucifer (2016)",
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                "5 Seasons",
                    "93 Episodes",
                "8.1/10",
                "Tom Kapinos",
                "Tom Ellis, Lauren German, Kevin Alejandro",
                "Crime, Drama, Fantasy",
                    "https://www.youtube.com/watch?v=X4bF_quwNtw",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg")
        )
        tvshows.add(
            TvshowEntity("5",
                "Yellowstone (2018)",
                "Follow the violent world of the Dutton family, who controls the largest contiguous ranch in the United States. Led by their patriarch John Dutton, the family defends their property against constant attack by land developers, an Indian reservation, and America’s first National Park.",
                "4 Seasons",
                    "31 Episodes",
                "8.6/10",
                "Taylor Sheridan, John Linson",
                "Kevin Costner, Luke Grimes, Kelly Reilly",
                "Drama",
                    "https://www.youtube.com/watch?v=opYyuupyWmA",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/43nVQqVsrshaOx9GfJq6JstsfCX.jpg")
        )
        tvshows.add(
            TvshowEntity("6",
                "The Witcher (2019)",
                "Geralt of Rivia, a mutated monster-hunter for hire, journeys toward his destiny in a turbulent world where people often prove more wicked than beasts.",
                "2 Seasons",
                    "16 Episodes",
                "8.2/10",
                "Lauren Schmidt",
                "Anna Shaffer, Henry Cavill, Freya Allan",
                "Action, Adventure, Fantasy",
                    "https://www.youtube.com/watch?v=ndl1W4ltcmg",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zrPpUlehQaBf8YX2NrVrKK8IEpf.jpg")
        )
        tvshows.add(
            TvshowEntity("7",
                "Chad (2021)",
                "A 14-year-old Persian boy desperately tries to fit in, cope with his mother's dating life, and figure out his cultural identity.",
                "1 Season",
                    "10 Episodes",
                "2.3/10",
                "Nasim Pedrad, Rob Rosell",
                "Nasim Pedrad, Jake Ryan, Saba Homayoon | See full cast & crew",
                "Comedy",
                    "https://www.youtube.com/watch?v=Yo7KxTQJtT8",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mIKWX4Rr66H09BhYDtDPn1l3CPx.jpg")
        )
        tvshows.add(
            TvshowEntity("8",
                "The Chosen (2019)",
                "The life of Christ through the eyes of those who encountered him called The Chosen.",
                "2 Seasons",
                    "17 Episodes",
                "9.6/10",
                "Dallas Jenkins",
                "Shahar Isaac, Jonathan Roumie, Noah James",
                "Drama, History",
                    "https://www.youtube.com/watch?v=K1-FoFj8Jbo",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/3fY4xLjZc8ee83cP2nvq1pt0wmS.jpg")
        )
        tvshows.add(
            TvshowEntity("9",
                "Dexter (2006)",
                "Dexter Morgan, a blood spatter pattern analyst for the Miami Metro Police also leads a secret life as a serial killer, hunting down criminals who have slipped through the cracks of justice.",
                "9 Seasons",
                    "106 Episodes",
                "8.6/10",
                "James Manos Jr.",
                "Michael C. Hall, Jennifer Carpenter, David Zayas",
                "Crime, Drama, Mystery",
                    "https://www.youtube.com/watch?v=YQeUmSD1c3g",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/p4rx3FW14Ayx1dLHJQBqDGw9YiX.jpg")
        )
        tvshows.add(
            TvshowEntity("10",
                "Lie to Me (2009)",
                "The world's leading deception researcher, Dr. Cal Lightman, studies facial expression, body language and tone of voice to determine when a person is lying and why, which helps law enforcement and government agencies uncover the truth. But his skills also make it easier for him to deceive others.",
                "3 Seasons",
                    "48 Episodes",
                "8.0/10",
                "Samuel Baum",
                "Tim Roth, Kelli Williams, Brendan Hines",
                "Crime, Drama, Mystery",
                    "https://www.youtube.com/watch?v=cxcbmLFLJdw",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/euhgvAtvBx4CElItl5qwEgWxpdh.jpg")
        )

        return tvshows
    }
}