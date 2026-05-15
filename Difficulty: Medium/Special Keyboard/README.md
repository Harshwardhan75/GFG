<h2><a href="https://www.geeksforgeeks.org/problems/special-keyboard3018/1">Special Keyboard</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a special keyboard that contains only four keys:</span></p>
<ul>
<li><span style="font-size: 18px;"><span style="font-size: 18px;"><strong>Key 1:</strong> Prints a single character 'A' on the screen.</span></span></li>
<li><span style="font-size: 18px;"><span style="font-size: 18px;"><strong>Key 2 (Ctrl + A):</strong> Selects all the characters currently present on the screen.</span></span></li>
<li><span style="font-size: 18px;"><span style="font-size: 18px;"><strong>Key 3 (Ctrl + C):</strong> Copies the selected characters to a buffer.</span></span></li>
<li><span style="font-size: 18px;"><span style="font-size: 18px;"><strong>Key 4 (Ctrl + V): </strong>Pastes the content of the buffer onto the screen, appending it to the existing text.</span></span></li>
</ul>
<p><span style="font-size: 18px;"><span style="font-size: 18px;">Initially, the screen is empty and the buffer is also empty.</span></span></p>
<p><span style="font-size: 18px;">Determine the <strong>maximum </strong>number of 'A' characters that can be displayed on the screen after performing<strong> exactly n</strong> key presses.</span></p>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 3
<strong>Output:</strong> 3
<strong>Explanation:</strong> With only 3 key presses, the best option is to press Key 1 each time. So, the screen shows "AAA" and the total number of A’s is 3.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> n = 7
<strong>Output:</strong> 9
<strong>Explanation:</strong> An optimal sequence is: press Key 1 three times to get "AAA", then use Key 2 (select all) and Key 3 (copy), followed by Key 4 twice (paste). This results in "AAAAAAAAA", so the total number of A’s is 9.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 70</span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Paytm</code>&nbsp;<code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Recursion</code>&nbsp;<code>Algorithms</code>&nbsp;