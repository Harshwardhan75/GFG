<h2><a href="https://www.geeksforgeeks.org/problems/maximum-sub-array5443/1?page=4&category=Arrays&difficulty=Medium,Hard&sortBy=submissions">Maximum Sub Array</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given an array of integers <strong>arr[]</strong>, find the contiguous subarray with the <strong>maximum sum </strong>that contains only non-negative numbers. If multiple subarrays have the same sum, return the one with the <strong>smallest starting index</strong>. If the array contains only <strong>negative</strong> numbers, return <strong>-1</strong>.</span></p>
<p><span style="font-size: 14pt;"><strong>Note: </strong>A subarray is a contiguous non-empty sequence of elements within an array.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 3]
<strong>Output:</strong> [1, 2, 3]
<strong>Explanation:</strong> In the given array, every element is non-negative, so the entire array [1, 2, 3] is the valid subarray with the maximum sum.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [-1, 2]
<strong>Output:</strong> [2]
<strong>Explanation:</strong> The only valid non-negative subarray is [2], so the output is [2].<br></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 2, 5, -7, 2, 6]
<strong>Output:</strong> [1, 2, 5]
<strong>Explanation:</strong> The valid non-negative subarrays are [1, 2, 5] and [2, 6]. Both have the same sum of 8, but [1, 2, 5] starts earlier, so it is the preferred subarray.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>6</sup><br>-10<sup>5&nbsp;</sup>≤ arr[i] ≤ 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Intuit</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Divide and Conquer</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;