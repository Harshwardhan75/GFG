<h2><a href="https://www.geeksforgeeks.org/problems/construct-list-using-given-q-xor-queries/1">Construct List using XOR Queries</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">There is an array that initially contains only a single value,&nbsp;<strong>0</strong>.&nbsp;</span></p>
<p><span style="font-size: 18px;">Given a list of queries <strong>queries[][]</strong> of size <strong>q</strong>, where each query is of one of the following types:</span></p>
<ul>
<li><span style="font-size: 18px;"><strong>0 x</strong>: Insert x into the array.</span></li>
<li><span style="font-size: 18px;"><strong>1 x</strong>:&nbsp;</span><span style="font-size: 18px;">Replace every element <strong>a</strong> in the array with <strong>a ^ x</strong>, where ^ denotes the bitwise XOR operator.</span></li>
</ul>
<p><span style="font-size: 18px;">Return the array in sorted order after performing all the queries.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> q = 5, queries[] = [[0, 6], [0, 3], [0, 2], [1, 4], [1, 5]]
<strong>Output: </strong>[1, 2, 3, 7]
<strong>Explanation:</strong>
[0] (initial value)
[0, 6] (add 6 to </span><span style="font-size: 18px;">list</span><span style="font-size: 18px;">)
[0, 6, 3] (add 3 to </span><span style="font-size: 18px;">list</span><span style="font-size: 18px;">)
[0, 6, 3, 2] (add 2 to </span><span style="font-size: 18px;">list</span><span style="font-size: 18px;">)
[4, 2, 7, 6] (XOR each element by 4)
[1, 7, 2, 3] (XOR each element by 5)
The sorted </span><span style="font-size: 18px;">list</span><span style="font-size: 18px;"> after performing all the queries is [1, 2, 3, 7]. </span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> q = 3, queries[] = [[0, 2], [1, 3], [0, 5]]</span> <span style="font-size: 18px;">
<strong>Output : </strong>[1, 3, 5]</span>
<span style="font-size: 18px;"><strong>Explanation:</strong>
[0] (initial value)
[0, 2] (add 2 to </span><span style="font-size: 18px;">list</span><span style="font-size: 18px;">)
[3, 1] (XOR each element by 3)
[3, 1, 5] (add 5 to </span><span style="font-size: 18px;">list</span><span style="font-size: 18px;">)
The sorted list after performing all the queries is [1, 3, 5].</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ q ≤ 10<sup>5</sup><br></span><span style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">0 </span><span style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤ x </span><span style="font-size: 18px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤ 10<sup>9</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Bit Magic</code>&nbsp;<code>Data Structures</code>&nbsp;