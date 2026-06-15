<h2><a href="https://www.geeksforgeeks.org/problems/minimum-cost-to-fill-given-weight-in-a-bag1956/1">Minimum Cost to Fill Given Weight</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a bag of size w kg and you are provided costs of packets different weights of oranges in array cost[], find the minimum total cost to buy exactly w kg oranges<br></span></p>
<ul>
<li><span style="font-size: 18px;">The cost of 1 kg orange is present at index 0 and in general arr[i] has cost of (i+1) kg orange.</span></li>
<li><span style="font-size: 18px;">cost[i] = -1 means that 'i+1' kg packet of orange is unavailable.</span></li>
<li><span style="font-size: 18px;">If it is not possible to buy exactly w kg oranges then return -1. It may be assumed that there is an infinite supply of all available packet types.</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: cost[] = [20, 10, 4, 50, 100], w = 5
<strong>Output:</strong> 14
<strong>Explanation</strong>: The minimum cost is 14 by purchasing a 2kg packet for 10 and a 3kg packet for 4.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: cost[] = [-1, -1, 4, 3, -1], w = 5
<strong>Output:</strong> -1
<strong>Explanation</strong>: It is not possible to buy 5 kgs.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ cost.size(), w ≤ 2*10<sup>3</sup></span><br><span style="font-size: 18px;">1 ≤ cost[i] ≤ 10<sup>5</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Algorithms</code>&nbsp;