<h2><a href="https://www.geeksforgeeks.org/problems/make-the-array-beautiful--170647/1">Make the array beautiful</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given an array of negative and non-negative integers. You need to make the array beautiful.</span></p>
<ul>
<li><span style="font-size: 18px;">An array is beautiful if two adjacent integers, arr[i] and arr[i+1] are either negative or positive. </span><span style="font-size: 18px;">You can do the following operation any number of times until the array becomes beautiful. </span></li>
<li><span style="font-size: 18px;">If two adjacent are different i.e. one of them is negative and other is positive, remove them.&nbsp;</span></li>
<li><span style="font-size: 18px;">Return the beautiful array after performing the above operation.</span></li>
<li><span style="font-size: 18px;">An empty array is also a beautiful array. </span></li>
<li><span style="font-size: 18px;"><span style="font-size: 14pt;">There can be multiple beautiful output arrays. For consistencty with the test cases, scan the array from left to right for removing two adjacent.</span></span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [4, 2,-2, 1] <strong>
Output: </strong>[4, 1]
<strong>Explanation:</strong> As at indices 1 and 2 , 2 and -2 have different sign, they are removed. And the the final array is: [4, 1].</span>
</pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">arr[] = [2,-2, -1, 1]</span><strong><span style="font-size: 18px;">
Output: </span></strong><span style="font-size: 18px;">[]</span><strong><span style="font-size: 18px;">
Explanation: </span></strong><span style="font-size: 18px;">As at indices 0 and 1, 2 and -2 have different sign, so they are removed. Now the array is 1 -1.Now 1 and -1 are also removed as they have different sign. So the final array is empty. </span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10</span><sup><span style="font-size: 18px;">5</span></sup><br><span style="font-size: 18px;">-10<sup>5</sup> ≤ arr[i] ≤ 10</span><sup><span style="font-size: 18px;">5</span></sup></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Stack</code>&nbsp;<code>Data Structures</code>&nbsp;