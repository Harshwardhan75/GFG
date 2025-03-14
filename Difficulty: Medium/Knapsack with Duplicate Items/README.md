<h2><a href="https://www.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card">Knapsack with Duplicate Items</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a set of items, each with a weight and a value, represented by the array <strong>wt</strong> and&nbsp;<strong>val</strong> respectively. Also, a knapsack with a weight limit <strong>capacity</strong>.<br>The task is to fill the knapsack in such a way that we can get the maximum profit. Return the maximum profit.<br><strong>Note:</strong> Each item can be taken any number of times.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> val = [1, 1], wt = [2, 1], capacity = 3
<strong>Output:</strong> 3
<strong>Explanation: </strong></span><span style="font-size: 14pt;">The optimal choice is to pick the 2nd element 3 times.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>val[] = [6, 1, 7, 7], wt[] = [1, 3, 4, 5], capacity = 8
<strong>Output:</strong> 48
<strong>Explanation: </strong>The optimal choice is to pick the 1st element 8 times.<br></span></pre>
<pre><strong>Input: </strong>val[] = [6, 8, 7, 100], wt[] = [2, 3, 4, 5], capacity = 1
<strong>Output:</strong> 0
<strong>Explanation: </strong>We can't pick any element .hence, total profit is 0.</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= val.size() = wt.size() &lt;= 1000<br>1 &lt;= capacity &lt;= 1000<br>1 &lt;= val[i], wt[i] &lt;= 100</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Algorithms</code>&nbsp;