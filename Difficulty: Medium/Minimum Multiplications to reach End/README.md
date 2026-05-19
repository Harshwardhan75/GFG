<h2><a href="https://www.geeksforgeeks.org/problems/minimum-multiplications-to-reach-end/1">Minimum Multiplications to reach End</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given two integers, <strong>start</strong> and <strong>end</strong>, along with an array of integers <strong>arr[]</strong>. </span><span style="font-size: 18px;">In one operation, you can multiply the current value by any element from arr[], and then take the result <strong>modulo 1000</strong> to obtain a new value.</span></p>
<p><span style="font-size: 18px;">Find the<strong> minimum </strong>steps in which <strong>end</strong> can be achieved starting from <strong>start</strong>. If it is not possible to reach <strong>end</strong>, then return <strong>-1</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 5, 7], start = 3, end = 30
<strong>Output: </strong>2
<strong>Explanation:</strong>
Step 1: 3*2 = 6 % 1000 = 6 
Step 2: 6*5 = 30 % 1000 = 30</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [3, 4, 65], start = 7, end = 175<strong>
Output: </strong>4<strong>
Explanation:
</strong>Step 1: 7 * 3 = 21 % 1000 = 21  
Step 2: 21 * 3 = 63 % 1000 = 63  
Step 3: 63 * 65 = 4095 % 1000 = 95  
Step 4: 95 * 65 = 6175 % 1000 = 175</span> 
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 4], start = 3, end = 5<strong>
Output: </strong>-1<strong>
Explanation: </strong>Starting from 3 and multiplying by 2 or 4 always produces even numbers after the first step. Since 5 is odd, it can never be reached.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong></span><span style="font-size: 18px;">1 &nbsp;≤ arr.size() &nbsp;≤ 10<sup>3<br></sup></span><span style="font-size: 18px;">1 &nbsp;≤ arr[i] &nbsp;≤ 10<sup>3<br></sup></span><span style="font-size: 18px;">0 &nbsp;≤ start, end&nbsp; &lt; 10<sup>3</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Graph</code>&nbsp;<code>BFS</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;