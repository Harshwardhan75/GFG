<h2><a href="https://www.geeksforgeeks.org/problems/edit-distance3702/1">Edit Distance</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given two strings <strong>s1</strong> and <strong>s2. </strong>Return the minimum number of operations required to convert <strong>s1 </strong>to <strong>s2</strong>.<br>The possible operations are permitted:</span></p>
<ol>
<li><span style="font-size: 18px;"><strong>Insert </strong>a character at any position of the string.</span></li>
<li><span style="font-size: 18px;"><strong>Remove </strong>any character from the string.</span></li>
<li><span style="font-size: 18px;"><strong>Replace </strong>any character from the string with any other character.</span></li>
</ol>
<p><span style="font-size: 18px;"><strong>Examples:<br></strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s1 = "geek", s2 = "gesek"
<strong>Output:</strong>&nbsp;1
<strong>Explanation: </strong>One operation is required, inserting 's' between two 'e' in s1.</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">s1 = "gfg", s2 = "gfg"
</span><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">0
</span><strong style="font-size: 18px;">Explanation: </strong><span style="font-size: 18px;">Both strings are same.<br></span></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s1 = "abcd", s2 = "bcfe"
<strong>Output: </strong>3
<strong>Explanation:</strong> </span><span style="font-size: 18px;">We can convert s1 into s2 by removing ‘a’, replacing ‘d’ with ‘f’ and inserting ‘e’ at the end. </span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ s1.length(), s2.length() ≤ <span style="font-size: 18.6667px;">10</span><sup>3</sup><br>Both the strings are in lowercase.</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Goldman Sachs</code>&nbsp;<code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;