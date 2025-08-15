<h2><a href="https://www.geeksforgeeks.org/problems/maximum-difference-of-zeros-and-ones-in-binary-string4111/1?page=1&sortBy=submissions">Maximum difference of zeros and ones in binary string</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a binary string <strong>S</strong>&nbsp;consisting of 0s and 1s. The task is to find the <strong>maximum difference</strong> of the number of <strong>0s</strong> and the number of <strong>1s</strong> (number of 0s – number of 1s) in the&nbsp;substrings of a string.</span></p>
<p><span style="font-size: 18px;"><strong>Note:</strong> In the case of all 1s, the answer will be -1. </span></p>
<p><strong><span style="font-size: 18px;">Example 1:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input</strong> : S = "11000010001" 
<strong>Output</strong> : 6 
<strong>Explanatio:</strong> From index 2 to index 9, 
there are 7 0s and 1 1s, so number 
of 0s - number of 1s is 6. </span></pre>
<p><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong> S = "111111"</span>
<span style="font-size: 18px;"><strong>Output:</strong> -1
<strong>Explanation:</strong> S contains 1s only </span></pre>
<p><span style="font-size: 18px;"><strong>Your task:</strong><br>You do not need to read any input or print anything. The task is to complete the function <strong>maxSubstring()</strong>, which takes a string as input and returns an integer. </span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong>&nbsp;O(|S|)<br><strong>Expected Auxiliary Space:</strong> O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong></span><br><span style="font-size: 18px;">1 ≤ |S| ≤ 10<sup>5</sup><br>S contains 0s and 1s only</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Kadane</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;