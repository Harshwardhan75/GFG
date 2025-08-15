<h2><a href="https://www.geeksforgeeks.org/problems/count-subsequences-of-type-ai-bj-ck4425/1?page=1&sortBy=submissions">Count subsequences of type a^i, b^j, c^k</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string S, the task is to count number of subsequences of the form a<sup>i</sup>b<sup>j</sup>c<sup>k</sup>, where i &gt;= 1, j &gt;=1 and k &gt;= 1.</span></p>

<p><span style="font-size:18px"><strong>Note:</strong>&nbsp;<br>
1.&nbsp;Two subsequences are considered different if the set of array indexes picked for the 2 subsequences are different.<br>
2.&nbsp;&nbsp;For large test cases, the output value will be too large, return the answer MODULO 10^9+7</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
S = "abbc"
<strong>Output:</strong> 3
<strong>Explanation</strong>: Subsequences are abc, abc and abbc.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
S = "abcabc"
<strong>Output:</strong> 7
<strong>Explanation</strong>: Subsequences are abc, abc,
abbc, aabc abcc, abc and abc.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>fun()&nbsp;</strong>which takes the string S as input parameter and returns the number of subsequences which follows given condition.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(Length of String).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1) .</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= |S| &lt;= 10<sup>5</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;