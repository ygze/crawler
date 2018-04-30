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


# How to run it
After clone the repo, import the project as a maven project using Intellij IDEA. Here you go!

