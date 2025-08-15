<h2><a href="https://www.geeksforgeeks.org/problems/queue-using-two-stacks/1?page=1&category=Stack&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions">Queue using two Stacks</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Implement a Queue using 2 stacks<strong> s1</strong> and<strong> s2</strong> .<br>A Query <strong>q </strong>is of 2 Types<br><strong>(i)</strong> 1 x (a query of this type means&nbsp;&nbsp;pushing <strong>'x'</strong> into the queue)<br><strong>(ii)</strong> 2 &nbsp; (a query of this type means to pop&nbsp;element from queue and print the poped element)</span></p>
<p><span style="font-size: 18px;"><strong>Note :</strong>&nbsp;If there is no element return -1 as answer while popping.</span></p>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">q=5, queries[][]=[[1, 2], [1, 3], [2], [1, 4], [2]]
<strong>Output: </strong>[2, 3]<strong><br></strong><strong>Explanation: 
</strong>In the first testcase
[1 2] the queue will be [2]
[1 3] the queue will be [2 3]
[2] &nbsp; poped element will be 2 the queue 
will be [3]
[1 4] the queue will be [3 4]
[2 ]&nbsp; poped element will be 3.</span>
</pre>
<pre><strong><span style="font-size: 18px;">Input: </span></strong><span style="font-size: 18px;">q = 4, queries[][] = [[1, 2], [2], [2], [1, 4]]
<strong>Output: </strong>[2, -1]
<strong>Explanation: 
</strong>In the second testcase&nbsp;
[1, 2] the queue will be [2]
[2]&nbsp; &nbsp;poped element will be [2] and 
&nbsp;   then the queue will be empty
[2]&nbsp; &nbsp;the queue is empty and hence -1
[1, 4] the queue will be [4].</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;=<strong> </strong>q&nbsp;&lt;= 100<br>1 &lt;= x &lt;= 100</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Morgan Stanley</code>&nbsp;<code>Accolite</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>D-E-Shaw</code>&nbsp;<code>Hike</code>&nbsp;<code>MakeMyTrip</code>&nbsp;<code>Oracle</code>&nbsp;<code>Walmart</code>&nbsp;<code>Goldman Sachs</code>&nbsp;<code>MAQ Software</code>&nbsp;<code>Adobe</code>&nbsp;<code>InfoEdge</code>&nbsp;<code>InMobi</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Stack</code>&nbsp;<code>Queue</code>&nbsp;<code>STL</code>&nbsp;<code>Data Structures</code>&nbsp;