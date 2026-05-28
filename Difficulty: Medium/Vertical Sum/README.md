<h2><a href="https://www.geeksforgeeks.org/problems/vertical-sum/1">Vertical Sum</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a binary tree having <strong>n</strong> nodes, find the vertical sum of the nodes that are in the same vertical line. Return all sums through different vertical lines starting from the left-most vertical line to the right-most vertical line.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927405/Web/Other/blobid0_1777272965.png" width="274" height="179"></strong></span>
  <span style="font-size: 18px;">
<strong>Output: <br></strong>4 2 12 3 7<strong>
Explanation:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700602/Web/Other/blobid0_1779888213.webp" width="242" height="244"></strong></span>
<span style="font-size: 18px;">The tree has 5 vertical lines
Line 1 has only one node 4 =&gt; vertical sum is 4.
Line 2 has only one node 2 =&gt; vertical sum is 2.
Line-3 has three nodes: 1,5,6 =&gt; vertical sum is 1+5+6 = 12.
Line-4 has only one node 3 =&gt; vertical sum is 3.
Line-5 has only one node 7 =&gt; vertical sum is 7.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input:<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/927405/Web/Other/blobid1_1777272984.png" width="270" height="273"></strong></span><span style="font-size: 18px;">
<strong>Output: <br></strong>7 6 4 3 2 1<strong>
Explanation:</strong></span>
<span style="font-size: 18px;">There are six vertical lines each having one node.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&lt;=n&lt;=10<sup>4</sup><br>1&lt;= Node value &lt;= 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;