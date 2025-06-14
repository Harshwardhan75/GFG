<h2><a href="https://www.geeksforgeeks.org/problems/maximum-sum-leaf-to-root-path/1?page=2&sortBy=submissions">Maximum sum leaf to root path</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a Binary Tree, find the maximum sum path from a leaf to root.</span></p>

<p><br>
<strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">        1
       / \
      2   3 </span>
<span style="font-size:18px"><strong>Output:</strong>
4</span>
<strong><span style="font-size:18px">Explanation: </span></strong>
<span style="font-size:18px">Following the path 3 -&gt; 1, results in a
sum of 4, which is the maximum path sum
from leaf to root for the given tree.</span>
</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px">       10
      /  \
    -2    7
    / \   
   8  -4    </span>
<span style="font-size:18px"><strong>Output:</strong>
17</span>
<strong><span style="font-size:18px">Explanation : </span></strong>
<span style="font-size:18px">Following the path 7 -&gt; 10, results in a
sum of 17, which is the maximum path sum
from leaf to root for the given tree.</span></pre>

<div><br>
<strong><span style="font-size:18px">Your task :</span></strong></div>

<div><span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function <strong>maxPathSum()</strong> which takes the root node of the tree as input and returns an integer denoting the maximum possible leaf to root path sum.</span></div>

<div><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n) , where n = number of nodes</span></div>

<div><span style="font-size:18px"><strong>Expected Auxiliary Space:</strong> O(1)</span></div>

<div><br>
<strong><span style="font-size:18px">Constraints :&nbsp;</span></strong></div>

<div><span style="font-size:18px">1 &lt;= Number of nodes &lt;= 10^5</span></div>

<div><span style="font-size:18px">-10<sup>6</sup>&nbsp;&lt;= max sum path &lt;= 10<sup>6</sup></span></div>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Morgan Stanley</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Binary Search Tree</code>&nbsp;<code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;