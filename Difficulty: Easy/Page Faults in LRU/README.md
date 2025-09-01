<h2><a href="https://www.geeksforgeeks.org/problems/page-faults-in-lru5603/1">Page Faults in LRU</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">In operating systems that use paging for memory management, page replacement algorithm is needed to decide which page needs to be replaced when the new page comes in. Whenever a new page is referred and is not present in memory, the page fault occurs and Operating System replaces one of the existing pages with a newly needed page. </span></p>

<p><span style="font-size:18px">Given a sequence of pages in an array <strong>pages[] </strong>of length <strong>N</strong> and memory capacity <strong>C</strong>, find the number of page faults using Least Recently Used (LRU) Algorithm.&nbsp;</span></p>

<p><span style="font-size:18px"><em><strong>Note:- </strong>Before solving this example revising the OS LRU cache mechanism is recommended.</em></span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> N = 9, C = 4
pages = {5, 0, 1, 3, 2, 4, 1, 0, 5}
<strong>Output:</strong> 8
<strong>Explaination:</strong> memory allocated with 4 pages 5, 0, 1, 
3: page fault = 4
page number 2 is required, replaces LRU 5: 
page fault = 4+1 = 5
page number 4 is required, replaces LRU 0: 
page fault = 5 + 1 = 6
page number 1 is required which is already present: 
page fault = 6 + 0 = 6
page number 0 is required which replaces LRU 3: 
page fault = 6 + 1 = 7
page number 5 is required which replaces LRU 2: 
page fault = 7 + 1  = 8.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>pageFaults()</strong> which takes N, C and pages[] as input parameters and returns the number of page faults.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N*C)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 1000<br>
1 ≤ C ≤ 100<br>
1&nbsp;≤ pages[i]&nbsp;≤ 1000</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Greedy</code>&nbsp;<code>Algorithms</code>&nbsp;