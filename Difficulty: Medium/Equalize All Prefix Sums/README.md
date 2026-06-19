<h2><a href="https://www.geeksforgeeks.org/problems/optimal-array--170647/1">Equalize All Prefix Sums</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a <strong>sorted </strong>array <strong>arr[]</strong>. For each i(0 ≤ i ≤ n-1), make all the elements of the array from index 0 to i <strong>equal</strong>, using the <strong>minimum</strong> number of <strong>operations</strong>. </span></p>
<p><span style="font-size: 18px;">In one operation you either <strong>increase </strong>or <strong>decrease </strong>the array element by <strong>1</strong>. Return an array that contains the minimum number of operations for each i, to accomplish the above task.</span></p>
<p><strong><span style="font-size: 18px;">Note:&nbsp;&nbsp;</span></strong></p>
<ul>
<li><span style="font-size: 18px;">For each index i, consider the original array without applying modifications made for previous indices.</span></li>
<li><span style="font-size: 18px;">Try to solve the problem using O(1) extra space (excluding the resultant array).</span></li>
</ul>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 6, 9, 12]</span>
<span style="font-size: 18px;"><strong>Output: [</strong>0, 5, 8, 14]
</span><strong><span style="font-size: 18px;">Explanation:</span> <br></strong><span style="font-size: 18px;">For i = 0, prefix [1] already has all equal elements, so operations = 0.
For i = 1, make [1, 6] equal to 4, operations = |1 - 4| + |6 - 4| = 5.
For i = 2, make [1, 6, 9] equal to 6, operations = |1 - 6| + |6 - 6| + |9 - 6| = 8.
For i = 3, make [1, 6, 9, 12] equal to 8, operations = 7 + 2 + 1 + 4 = 14</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 1, 1, 7, 7, 10, 19]</span>
<span style="font-size: 18px;"><strong>Output: [</strong>0, 0, 0, 6, 12, 21, 33]</span>
<strong><span style="font-size: 18px;">Explanation:</span></strong>
<span style="font-size: 18px;">For i = 0, prefix [1] already has equal elements, so operations = 0.
For i = 1, prefix [1, 1] already has equal elements, so operations = 0.
For i = 2, prefix [1, 1, 1] already has equal elements, so operations = 0.
For i = 3, make [1, 1, 1, 7] equal to 1, operations = 6.
For i = 4, make [1, 1, 1, 7, 7] equal to 1, operations = 12.
For i = 5, make [1, 1, 1, 7, 7, 10] equal to 5, operations = 21.
For i = 6, make [1, 1, 1, 7, 7, 10, 19] equal to 7, operations = 33.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5</sup><br>-10<sup>4</sup> ≤ arr[i] ≤ 10<sup>4<br></sup></span><span style="font-size: 18px;">Sum of n over all test case does not exceed 10<sup>6</sup>.</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Sorting</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;