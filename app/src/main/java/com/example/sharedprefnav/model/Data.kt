package com.example.sharedprefnav.model


class Data {
    companion object {
        var catalog = arrayListOf<Catalog>(
            Catalog(
                "Villa d’Este",
                "ITALY, CERNOBBIO, LAKE COMO",
                "WIFI free \n Bar \n Gym \n Pool \n Spa",
                "Beautiful Lake Como is surrounded by the Alps, and the villas along the shoreline are amazing feats of architecture. You can take a boat trip around the lake to learn about the history of the estates, which belong to the likes of the Heinz family, Versace, and, of course, George and Amal Clooney. If you don’t have your own megamansion, Villa d’Este is the place to stay: It’s a classic hotel with 25 acres of gardens that are absolutely immaculate, and it’s so treasured in Italy that it was declared a World Heritage Site. A favorite feature is the hotel's pool, which sits on a platform in the lake and is a major place for Italians (and Hollywood heavyweights) to see and be seen.",
                "https://media.cntraveler.com/photos/5909ff79332aee5e4e8a4ec7/16:9/w_1920,c_limit/Gardens-VilladEste-Italy-CRHotel.jpg",
                arrayListOf(
                    ImagesDetails("https://media.cntraveler.com/photos/5909ff816eb36e1c54a2e7a8/16:9/w_1920,c_limit/View-VilladEste-Italy-CRHotel.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/5909ff7d332aee5e4e8a4ec9/16:9/w_1920,c_limit/Gardens4-VilladEste-Italy-CRHotel.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/5909ff7f3c7a1c498c5b371a/16:9/w_1920,c_limit/Lounge-VilladEste-Italy-CRHotel.jpg")
                    ,ImagesDetails("https://media.cntraveler.com/photos/5909ff79332aee5e4e8a4ec7/16:9/w_1920,c_limit/Gardens-VilladEste-Italy-CRHotel.jpg")
                )
            ),
            Catalog(
                "Four Seasons Hotel Sydney",
                "AUSTRALIA, NEW SOUTH WALES",
                "WIFI free \n Bar \n Gym \n Pool \n Spa \n Credit card",
                "Between historic quarter The Rocks and the ferry-flocked Circular Quay, towering five-star Four Seasons Hotel Sydney has grand public areas and commands some of the best views in town. (Gazing over Sydney Opera House and Sydney Harbour Bridge never gets dull!) Decor in the 531 contemporary rooms and suites radiates quality, with generous windows that let the Instagram-friendly views do the talking. Sydney’s largest heated outdoor hotel pool and on-site Endota Spa will leave you feeling refreshed, with Australian-inspired, all-natural treatments, a sauna, steam room, Jacuzzi, and gym.",
                "https://media.cntraveler.com/photos/5bb23557db225a4f50684b4e/16:9/w_1920,c_limit/Four-Seasons-Sydney-__2018_SYD_037.jpg",
                arrayListOf(
                    ImagesDetails("https://media.cntraveler.com/photos/5bbe160b625211259a973fe3/16:9/w_1920,c_limit/Four-Seasons-Hotel-Sydney__2018_Royal-Suite-lounge-city-view.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/5bbe160bc4c3254b312853f4/16:9/w_1920,c_limit/Four-Seasons-Hotel-Sydney__2018_Four-Seasons-Hotel-Sydney---Pool-at-dusk.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/5bbe160a8955df3d45552ae7/16:9/w_1920,c_limit/Four-Seasons-Hotel-Sydney__2018_Royal-Suite,-Four-Seasons-Hotel-Sydney.jpg")
                    ,ImagesDetails("https://media.cntraveler.com/photos/5bb23557db225a4f50684b4e/16:9/w_1920,c_limit/Four-Seasons-Sydney-__2018_SYD_037.jpg")
                )
            ),

            Catalog(
                "La Mamounia",
                "AFRICA, MOROCCO, MARRAKECH",
                "WIFI free \n Bar \n Gym \n Pool \n Spa \n Urban",
                "There’s a very particular effect exerted by La Mamounia, which seems to take hold the moment you head up the green tiled steps to this most bohemian of grandes dames. Upon seeing La Mamounia’s faded pink walls, Churchill was wont to ditch the suit and pick up his watercolor brushes; Paul McCartney wrote “Mamunia” (meaning “safe haven” in Arabic) during a 1973 stay; and Hitchcock, who filmed The Man Who Knew Too Much here, got his inspiration for The Birds from some overzealous finches on a jardin-facing balcony. La Mamounia was always a curious mash-up of Art Deco, Berber, and opulent Moorish, and the old place has had numerous facelifts over almost 100 years—from Jacques Majorelle’s bright stylings in 1946 to a theatrical noughties revamp by Jacques Garcia (Hotel Costes) and most recently a series of sly additions by Parisian futurists Jouin Manku, including a new cinema and teahouse. There are all the columns, foliage-filled courtyards, and mosaics of the most photogenic medina riad—except that there’s also the smoky Churchill speakeasy, an Asian-focused Jean-Georges Vongerichten restaurant with its sultry blacks and reds, and that legendary, vast square pool, around which I find the people-watching irresistible (bring dark sunglasses).",
                "https://media.cntraveler.com/photos/59e4cbbb8f0e9e16cda5682b/16:9/w_1920,c_limit/Exterior-LaMamounia-Marrakech-CRHotel.jpg",
                arrayListOf(
                    ImagesDetails("https://media.cntraveler.com/photos/59e4cbbb06aef90bf9358748/16:9/w_1920,c_limit/Tout-LaMamounia-Marrakech-CRHotel.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/59e4cbbb06aef90bf9358747/16:9/w_1920,c_limit/Gardens-LaMamounia-Marrakech-CRHotel.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/59e4cbbb06aef90bf9358744/16:9/w_1920,c_limit/Bathroom-LaMamounia-Marrakech-CRHotel.jpg")
                    ,ImagesDetails("https://media.cntraveler.com/photos/59e4cbbb8f0e9e16cda5682b/16:9/w_1920,c_limit/Exterior-LaMamounia-Marrakech-CRHotel.jpg")
                )
            ),  Catalog(
                "Waldorf Astoria Shanghai on the Bund",
                "CHINA, SHANGHAI",
                "Business \n Family \n Parking \n Pool \n Spa \n Urban",
                "Spread across two buildings—20 suites in the beautifully restored 1911 Shanghai Club, 252 rooms and suites in the newly built tower—this hotel is a magnificent homage to Shanghai’s swank European past. In addition to opulent colonial-style suites (poster beds, walk-in closets, claw-foot tubs), the old building, now called the Waldorf Astoria Club, has a jaw-dropping 110-foot-long bar with Bund views. Rooms are neoclassical—pale-green linen wallpaper, matching silk bedcovers, and carpets with swirling flower motifs—but have all the mod cons, as well as a bathroom where a TV is embedded in the mirror and the Japanese-style toilet has water jets. ",
                "https://media.cntraveler.com/photos/53daccc9dcd5888e145cdfaa/16:9/w_1920,c_limit/waldorf-astoria-shanghai-on-the-bund-shanghai-china-112382-1.jpg",
                arrayListOf(
                    ImagesDetails("https://media.cntraveler.com/photos/53dacccb6dec627b14a03c59/16:9/w_1920,c_limit/waldorf-astoria-shanghai-on-the-bund-shanghai-china-112382-2.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/53dacccc6dec627b14a03c6b/16:9/w_1920,c_limit/waldorf-astoria-shanghai-on-the-bund-shanghai-china-112382-3.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/61e0ab09042867f009ab8a25/16:9/w_1920,c_limit/Waldorf-Astoria-Shanghai-on-the-Bund.jpg"),
                    ImagesDetails("https://ak-d.tripcdn.com/images/20020c00000066yej96A7_Z_1080_808_R5_D.jpg")
                )
            ), Catalog(
                "Raffles Istanbul",
                "TURKEY, ISTANBUL",
                "Events \n Family \n Parking \n Weddings \n Spa \n Wellness",
                "Though it’s a sleek, modern hotel with impeccable high-tech hardware in its 185 rooms, Raffles’ address in Istanbul still channels the city’s Byzantine charm and mystery. Chalk it up to the gorgeous views from almost every room and lush Turkish textiles, handicrafts (like pierced metal-and-glass similar to those found in the Blue Mosque), and dramatic, oversized framed photos of its most famous sites. Set in the central Besiktas neighborhood on the European side, the Raffles puts guests right on top of an array of shopping and dining options, and you can see the Bosphorus from many of the rooms.",
                "https://www.raffles.com/assets/0/72/685/686/1420/d436335b-20f7-4d5e-8072-39058fd9d039.jpg",
                arrayListOf(
                    ImagesDetails("https://media.cntraveler.com/photos/5f678a4a978ff785b250160d/16:9/w_1920,c_limit/raffles-istanbul.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/5cc0897956f72a03915e4a69/16:9/w_1920,c_limit/Raffles-Istanbul_2019_Premier-Room_870643_high.jpg"),
                    ImagesDetails("https://media.cntraveler.com/photos/552fc93944f1a8336f4341a4/16:9/w_1920,c_limit/raffles-istanbul-hotlist15.4.jpg"),
                    ImagesDetails("https://www.raffles.com/assets/0/72/685/686/1420/d436335b-20f7-4d5e-8072-39058fd9d039.jpg")
                )
            )
        )


    }
}