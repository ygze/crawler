## Crawler for Craigslist

# Environment
```
Maven project
Java version 1.8
Jsoup 1.11.3

```

# Structure of rent information
Through exploring webpage source code, I obtain the structure of a rent.

```
<p class="result-info">
   <span class="icon icon-star" ...> ... </span>
   <time class="result-date" ...>  ... </time>
   <a href="detial_url" ... class="result-title hdrlnk">  title </a>
   <span class="result-meta">
      <span class="result-price"> price </span>
	  <span class="result-hood">  hood </span>
	  ...
   </span>
   ...
</p>

```

So, the rest of task is to get those elements via Jsoup library.

# Result

```
(1800$ Lwr Nob Hill Studio - incl bath, kitchen, utilities and WiFi!!!,
$1800,
https://sfbay.craigslist.org/sfc/apa/d/1800-lwr-nob-hill-studio-incl/6575506858.html,
(Lower Nob Hill))
(CAMPBELL LUXURY STUDIO FOR RENT,
$764,
https://sfbay.craigslist.org/sby/apa/d/campbell-luxury-studio-for/6575490851.html,
(campbell))
(❄ Apartments in PITTSBURG, Washer and Dryer, Swimming Pool,
$1704,
https://sfbay.craigslist.org/eby/apa/d/apartments-in-pittsburg/6554644719.html,
null)
(Indoor cats welcome, Starbird Park nearby, 1BR apt w/ Modern Kitchen,
$2095,
https://sfbay.craigslist.org/sby/apa/d/indoor-cats-welcome-starbird/6573314194.html,
(san jose west))
```


# How to run it
After clone the repo, import the project as a maven project using Intellij IDEA. Here you go!

