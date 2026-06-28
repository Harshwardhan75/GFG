<h2><a href="https://www.geeksforgeeks.org/problems/count-binary-strings1944/1">k Times Appearing Adjacent Two 1's</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given two integers <strong>n</strong> and <strong>k</strong>, count the number of binary strings of length n where adjacent 1 appear k times. </span></p>
<p><span style="font-size: 18px;">Since the answer can be huge, return it modulo 10<sup>9</sup>+7.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 3, k = 2
<strong>Output:</strong> 1
<strong>Explanation: </strong>Possible string is "111" where 2 adjacent 1 appear.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: n = 5, k = 2
<strong>Output:</strong> 6
<strong>Explanation</strong>: Possible strings are "00111", "10111", "01110", "11100", "11101" and "11011".</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n, k ≤ 10<sup>3</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Algorithms</code>&nbsp;