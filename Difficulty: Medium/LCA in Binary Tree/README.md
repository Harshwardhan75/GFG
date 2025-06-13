<h2><a href="https://www.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-binary-tree/1?page=2&sortBy=submissions">LCA in Binary Tree</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;">Given a Binary Tree with all <strong>unique</strong> values and two nodes value,&nbsp;<strong>n1</strong> and <strong>n2</strong>. The task is to find the<strong>&nbsp;lowest common ancestor</strong> of the given two nodes. We may assume that either both n1 and n2 are present in the tree or none of them are&nbsp;present. </span></span></p>
<p><span style="font-size: 18px;">LCA: It is the first common ancestor of both the nodes n1 and n2 from bottom of tree.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [1,2,3,4,5,6,7], n1 = 5 , n2 = 6<br>
&nbsp;     <img src="https://media.geeksforgeeks.org/wp-content/uploads/20220726133857/UntitledDiagramdrawio-300x179.png">
<strong>Output: </strong><span style="font-family: arial,helvetica,sans-serif;">1
</span><strong>Explanation: </strong></span><span style="font-size: 18px;">LCA of 5 and 6 is 1.</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">root = [5, 2, N, 3, 4], n1 = 3 , n2 = 4 <br>
           5    
      &nbsp;   /    
      &nbsp;  2  
      &nbsp; / \  
      &nbsp;3   4
</span><strong style="font-size: 18px;">Output: </strong><span style="font-family: arial,helvetica,sans-serif;">2
</span><strong style="font-size: 18px;">Explanation: </strong><span style="font-size: 18px;">LCA of 3 and 4 is 2.</span><strong style="font-size: 18px;"> </strong></span></pre>
<pre><span style="font-size: 14pt;"><strong style="font-size: 14pt;">Input: </strong><span style="font-size: 14pt;">root = </span><span style="font-size: 18.6667px;">[5, 2, N, 3, 4], n1 = 5 , n2 = 4 <br></span><span style="font-size: 14pt;">
           5    
      &nbsp;   /    
      &nbsp;  2  
      &nbsp; / \  
      &nbsp;3   4
</span><strong style="font-size: 14pt;">Output: </strong><span style="font-family: arial,helvetica,sans-serif;">5
</span><strong style="font-size: 14pt;">Explanation: </strong><span style="font-size: 14pt;">LCA of 5 and 4 is 5.</span><strong style="font-size: 14pt;"> </strong></span></pre>
<p><span style="font-size: 18px;"><span style="font-family: arial,helvetica,sans-serif;"><strong>Constraints:</strong><br>1 ≤ number of nodes ≤ 10<sup>5</sup><br>1 ≤ node-&gt;data ≤ 10<sup>5</sup></span></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Accolite</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>OYO Rooms</code>&nbsp;<code>Snapdeal</code>&nbsp;<code>MakeMyTrip</code>&nbsp;<code>Payu</code>&nbsp;<code>Google</code>&nbsp;<code>Times Internet</code>&nbsp;<code>Cisco</code>&nbsp;<code>PayPal</code>&nbsp;<code>Expedia</code>&nbsp;<code>Twitter</code>&nbsp;<code>American Express</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;