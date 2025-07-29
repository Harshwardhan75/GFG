<h2><a href="https://www.geeksforgeeks.org/problems/sorted-list-to-bst/1?page=1&sortBy=submissions">Sorted Linked List to BST</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 12pt;">Given a Singly Linked List which has data members sorted in ascending order. Construct a&nbsp;Balanced Binary Search Tree&nbsp;which has same data members as the given Linked List.<br><strong>Note: </strong>There might be nodes with the same value.</span></p>
<p><span style="font-size: 12pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 12pt;"><strong>Input: </strong>Linked List: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;7<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/706336/Web/Other/blobid0_1722838240.png" width="404" height="63">
<strong>Output: </strong>4 2 1 3 6 5 7<br><strong>Explanation : </strong>The BST formed using elements of the linked list is -
        4
      /   \
     2     6
   /  \   / \
  1   3  5   7  
Hence, preorder traversal of this tree is 4 2 1 3 6 5 7
</span></pre>
<pre><span style="font-size: 12pt;"><strong>Input: </strong>Linked List : 1-&gt;2-&gt;3-&gt;4<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/706336/Web/Other/blobid1_1722838295.png" width="404" height="63"> <br><strong>Ouput: </strong>3 2 1 4<br></span><strong style="font-size: 12pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">Explanation: </strong><span style="font-size: 12pt; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">The BST formed using elements of the linked list is -</span><br><span style="font-size: 12pt;"><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/706336/Web/Other/blobid2_1722838310.png" width="402" height="141">
Hence, the preorder traversal of this tree is 3 2 1 4
</span></pre>
<div><span style="font-size: 12pt;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxiliary Space:</strong> O(n)</span></div>
<div>&nbsp;</div>
<div><span style="font-size: 12pt;"><strong>Constraints</strong>:</span></div>
<div><span style="font-size: 12pt;">1 ≤ Number of Nodes ≤ 10<sup>6</sup></span></div>
<div><span style="font-size: 12pt;">1 ≤ Value of each node ≤ 10<sup>6</sup></span></div></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Linked List</code>&nbsp;<code>Binary Search Tree</code>&nbsp;<code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;