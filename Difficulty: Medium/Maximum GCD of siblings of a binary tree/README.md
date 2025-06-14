<h2><a href="https://www.geeksforgeeks.org/problems/maximum-gcd-of-siblings-of-a-binary-tree/1?page=1&sortBy=submissions">Maximum GCD of siblings of a binary tree</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a 2d list that represents the nodes of a <a href="https://www.geeksforgeeks.org/binary-tree-data-structure/">Binary tree</a> with <strong>N</strong> nodes, the task is to find the maximum <a href="https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/">GCD</a> of the siblings of this tree without actually constructing it.<br><strong>Note: </strong>If there are no pairs of siblings in the given tree, print 0. Also, if given that there's an edge between a and b in the form of {a,b} in the list, then a is the parent node.</span></p>
<p><br><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 7
arr = {{4, 5}, {4, 2}, {2, 3}, {2, 1}, {3, 6}, {3, 12}}
<strong>Output:
</strong>6
<strong>Explanation:</strong>
</span><img style="height: 367px; width: 400px;" src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/706340/Web/Other/ed5aea1d-c652-439f-b288-a2c013c1f0c1_1685087770.png" alt="">
<span style="font-size: 18px;">For the above tree, the maximum GCD
for the sibilings is 6, formed for the
nodes 6 and 12 for the children of node 3.</span>
</pre>
<div><span style="font-size: 18px;"><strong>Example 2:</strong></span></div>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 3
arr[] = {{1,2}, {1,4}} 
<strong>Output :</strong>
2</span>
<span style="font-size: 18px;"><strong>Explanation:</strong>
</span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/706340/Web/Other/9b440579-82d9-4460-8fed-21d07d75bfa5_1685087771.png" alt="">
<span style="font-size: 18px;">For the above tree, the maximum GCD
for the sibilings is 2, formed for the
nodes 2 and 4 for the children of node 1.</span>
</pre>
<p><br><span style="font-size: 18px;"><strong>Your Task:&nbsp;&nbsp;</strong><br>You don't need to read input or print anything. Your task is to complete the function <strong>maxBinTreeGCD()</strong>&nbsp;which takes an integer N and a 2-d list denoting the edges as input and returns the maximum GCD of sibilings of the tree.</span></p>
<p><br><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(E*logE), where E is the number of edges in the Tree.<br><strong>Expected Auxiliary Space:</strong> O(1)</span></p>
<p><br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N ≤ 10<sup>5</sup><br>There might be edges with similar values</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Samsung</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;