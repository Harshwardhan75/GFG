<h2><a href="https://www.geeksforgeeks.org/problems/path-in-matrix3805/1?page=1&sortBy=submissions">Maximum path sum in matrix</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are given a matrix <code><strong>mat[][]</strong></code> of size <code><strong>n </strong>x&nbsp;<strong>m</strong></code> where each element is a positive integer. Starting from any cell in the first row, you are allowed to move to the next row, but with specific movement constraints. From any cell <code>(r, c)</code> in the current row, you can move to any of the three possible positions :</span></p>
<ol>
<li><span style="font-size: 14pt;"><code>(r+1, c-1)</code> — move diagonally to the left.</span></li>
<li><span style="font-size: 14pt;"><code>(r+1, c)</code> — move directly down.</span></li>
<li><span style="font-size: 14pt;"><code>(r+1, c+1)</code> — move diagonally to the right.</span></li>
</ol>
<p><span style="font-size: 14pt;">Find the maximum sum of any path starting from any column in the first row and ending at any column in the last row, following the above movement constraints.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> mat[][] = [[3, 6, 1], [2, 3, 4], [5, 5, 1]]
<strong>Output:</strong> 15
<strong>Explaination:</strong> The best path is (0, 1) -&gt; (1, 2) -&gt; (2, 1). It gives the maximum sum as 15.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> mat[][] = [[2, 1, 1], [1, 2, 2]]
<strong>Output:</strong> 4
<strong>Explaination:</strong> The best path is (0, 0) -&gt; (1, 1). It gives the maximum sum as 4.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> mat[][] = [[25]]
<strong>Output:</strong> 25
<strong>Explaination:</strong> (0, 0) is the only cell in mat[][], so maximum path sum will be 25.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ mat.size() ≤ 500<br>1 ≤ mat[i].size() ≤ 500<br>1 ≤ mat[i][j] ≤ 1000</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>OYO Rooms</code>&nbsp;<code>Samsung</code>&nbsp;<code>MakeMyTrip</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Matrix</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;