<h2><a href="https://www.geeksforgeeks.org/problems/sum-tree/1?page=2&sortBy=submissions">Sum Tree</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><div class="entry-content">
<p><span style="font-size: 14pt;">Given a Binary Tree. Check for the <strong>Sum Tree</strong> for every node except the leaf node. Return true if it is a Sum Tree otherwise, return false.</span></p>
<blockquote>
<p><span style="font-size: 14pt;"><span style="color: #273239; font-family: Nunito, sans-serif; letter-spacing: 0.162px; background-color: #ffffff;">A <strong>SumTree</strong> is a Binary Tree where the value of a node is equal to the sum of the nodes present in its<strong> left</strong> subtree and <strong>right </strong>subtree. </span>An empty tree is also a Sum Tree as the sum of an empty tree can be considered to be <strong>0</strong>. A leaf node is also considered a Sum Tree.</span></p>
</blockquote>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong>
    3
  /   \    
 1     2
<strong>Output:</strong> true
<strong>Explanation: </strong>The sum of left subtree and right subtree is 1 + 2 = 3, which is the value of the root node. Therefore,the given binary tree is a sum tree.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong>
          10
        /    \
      20      30
    /   \ 
   10    10
<strong>Output: </strong>false
<strong>Explanation: </strong>The given tree is not a sum tree. For the root node, sum of elements in left subtree is 40 and sum of elements in right subtree is 30. Root element = 10 which is not equal to 30+40.<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:</strong>
   25
  /   \    
 9     15
<strong>Output:</strong> false</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>2 ≤ number of nodes ≤ 10<sup>5<br></sup>1 ≤ node-&gt;data ≤ 10<sup>5</sup></span></p>
</div></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>D-E-Shaw</code>&nbsp;<code>Goldman Sachs</code>&nbsp;<code>Adobe</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;