<h2><a href="https://www.geeksforgeeks.org/problems/range-lcm-queries3348/1">Range LCM Queries</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong>&nbsp; and a list of queries <strong>queries[][]</strong>. Each query can be one of the following two types:</span></p>
<ul>
<li><span style="font-size: 18px;"><strong>Update Query:</strong> [1, index, value] --&gt; </span><span style="font-size: 18px;">Update the element at position index in the array to the given value.</span></li>
<li><span style="font-size: 18px;"><strong>Range Query:</strong> [2, L, R] --&gt; </span><span style="font-size: 18px;">Compute and return the <strong>Least Common Multiple (LCM)</strong> of all elements in the subarray from index <strong>L</strong> to <strong>R</strong> (inclusive).</span></li>
</ul>
<p><span style="font-size: 18px;">Process all queries sequentially and return a list containing the results of all Type 2 queries.</span></p>
<p><strong><span style="font-size: 18px;">Note:</span></strong><span style="font-size: 18px;">&nbsp;All operations follow 0-based indexing.</span></p>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;"><span style="font-size: 18px;">arr[] = [2, 3, 4, 6, 8, 16], queries[][] = [[2, 0, 2], [1, 3, 8], [2, 2, 5]]
</span><strong style="font-size: 18px;">Output:</strong><span style="font-size: 18px;"> [12, 16]</span><strong style="font-size: 18px;">
Explanation: </strong><span style="font-size: 18px;">The queries are processed sequentially, updating the array when required.
</span></span><span style="font-size: 18px;">[2, 0, 2]: LCM of [2, 3, 4] = 12
[1, 3, 8]: array becomes [2, 3, 4, 8, 8, 16]
[2, 2, 5]: LCM of [4, 8, 8, 16] = 16</span></pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr[] = [1, 2, 3, 4],  queries[][] = [[2, 0, 3], [1, 0, 5], [2, 0, 1]]<br></span><span style="font-size: 18px;"><strong>Output:</strong> [12, 10]<strong>
Explanation: </strong>The queries are processed sequentially, updating the array when required.
</span><span style="font-size: 18px;">[2, 0, 3]: LCM of [1, 2, 3, 4] = 12
[1, 0, 5]: array becomes [5, 2, 3, 4]
[2, 0, 1]: LCM of [5, 2] = 10<br></span></pre>
<p><span style="font-size: 18px;"><strong style="font-size: 18px;">Constraints:</strong><br><span style="font-size: 18px;">1 ≤ arr.size() ≤ 10</span><sup style="font-size: 18px;">4<br></sup>1 ≤ queries.size() ≤ 10<sup style="font-size: 18px;">5</sup><br><span style="font-size: 18px;">0 ≤ L ≤ R ≤ arr.size() - 1<br></span>0 ≤ index ≤ arr.size() - 1<br><span style="font-size: 18px;">1 ≤ arr[i], value</span><strong style="font-size: 18px;">&nbsp;</strong><span style="font-size: 18px;">≤ 10</span><sup style="font-size: 18px;">4</sup><br></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Segment-Tree</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Advanced Data Structure</code>&nbsp;