<h2><a href="https://www.geeksforgeeks.org/problems/maximum-sum-problem2211/1">Maximum Sum Problem</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p dir="ltr">Given a number&nbsp;<strong><strong>n, </strong></strong>find its maximum sum value with 3 recursive breaks described below.</p>
<ul>
<li value="1">Break&nbsp;into&nbsp;three parts<strong><strong>&nbsp;n/2</strong></strong>,<strong><strong>&nbsp;n/3</strong></strong>,<strong><strong>&nbsp;</strong></strong>and<strong><strong>&nbsp;n/4&nbsp;</strong></strong>(consider only the&nbsp;<strong><strong>integer&nbsp;</strong></strong>part or floor value).</li>
<li value="2">Each number obtained in this process can be divided further recursively.&nbsp;</li>
<li value="3">At every step,&nbsp; we can take the max of current value of n or the max value obtained with recursive process.</li>
<li value="4">It is possible that we don't divide the number at all and choose it as final answer.</li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 12
<strong>Output: </strong>13
<strong>Explanation</strong>: </span><span style="font-size: 18px;">B</span><span style="font-size: 18px;">reak n = 12 in three parts [12/2, 12/3, 12/4] = [6, 4, 3], now current sum is = (6 + 4 + 3) = 13. Further breaking 6, 4 and 3 into parts will produce sum less than or equal to 6, 4 and 3 respectively.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: n = 24
<strong>Output: </strong>27
<strong>Explanation</strong>: Break n = 24 in three parts [24/2, 24/3, 24/4] = [12, 8, 6], now current sum is = (12 + 8 + 6) = 26 . But recursively breaking 12 would produce value 13. So our maximum sum is 13 + 8 + 6 = 27.
</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>0 &nbsp;≤ n &nbsp;≤ 10<sup>6</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Morgan Stanley</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Algorithms</code>&nbsp;