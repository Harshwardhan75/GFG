<h2><a href="https://www.geeksforgeeks.org/problems/minimum-steps-to-get-desired-array5519/1">Minimum Increment or Double Operations to Convert</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18.6667px;">Given an array <strong>arr[]</strong>. Initially, you have another array containing only 0s.<br></span><span style="font-size: 18.6667px;">In one operation, you may either:</span></p>
<ul>
<li><span style="font-size: 18.6667px;">Choose any one element and increase its value by 1, or</span></li>
<li><span style="font-size: 18.6667px;">Double the values of all elements in the array simultaneously.</span></li>
</ul>
<p><span style="font-size: 18.6667px;">Find the minimum<strong> </strong>number of operations required to transform the initial all-zero array into the given array arr[].</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong><span style="font-size: 14pt;">arr[] = [16, 16, 16]
</span><strong style="font-size: 14pt;">Output:</strong><span style="font-size: 14pt;"> 7
</span><strong style="font-size: 14pt;">Explanation:</strong><span style="font-size: 14pt;"> <br></span><span style="font-size: 18.6667px;">First, increase each element to make the array [1, 1, 1] (3 steps).
Then, multiply the whole array by 2 four times:
[1,1,1] -&gt; [2,2,2] -&gt; [4,4,4] -&gt; [8,8,8] -&gt; [16,16,16]
Total steps = 3 + 4 = 7.</span></span></pre>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong><span style="font-size: 14pt;">arr[] = [2, 3]
</span><strong style="font-size: 14pt;">Output:</strong><span style="font-size: 14pt;"> 4
</span><strong style="font-size: 14pt;">Explanation: <br></strong><span style="font-size: 18.6667px;">Start from [0, 0].
Increase both elements to get [1, 1] (2 steps)
Multiply once: [2, 2] (1 step)
Increase second element once: [2, 3] (1 step)
Total steps = 2 + 1 + 1 = 4.</span></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5</sup><br>0 ≤ arr[i] ≤ 10<sup>9</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;