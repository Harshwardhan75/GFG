<h2><a href="https://www.geeksforgeeks.org/problems/remove-invalid-parentheses/1">Remove Invalid Parentheses</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given a string <strong>s</strong> consisting of lowercase letters and parentheses '(' and ')'.</span></p>
<p><span style="font-size: 14pt;">A string is considered <strong>valid</strong> if:</span></p>
<ul>
<li><span style="font-size: 14pt;">Every opening parenthesis '(' has a corresponding closing parenthesis ')'.</span></li>
<li><span style="font-size: 14pt;">Parentheses are properly nested.</span></li>
</ul>
<p><span style="font-size: 14pt;"><span style="font-size: 14pt;">Remove the </span><strong style="font-size: 14pt;">minimum</strong><span style="font-size: 14pt;"> number of invalid parentheses from <strong>s</strong> so that the resulting string becomes valid.&nbsp; Return<em> </em></span><span style="font-size: 14pt;">all the possible </span><span style="font-size: 18.6667px;"><strong>distinct </strong>valid strings</span><span style="font-size: 14pt;">&nbsp;in </span><span style="font-size: 14pt;">lexicographically</span><span style="font-size: 14pt;">&nbsp;</span><span style="font-size: 14pt;">sorted order.</span></span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;"> = "()())()"
</span><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">["(())()", "()()()"]<br></span><strong style="font-size: 18px;">Explanation: <br></strong><span style="font-size: 18px;">The string "()())()" has one extra ')', making it invalid. By removing one ')', we can make it valid in two ways:<br>Remove the 3rd index ')' -&gt; "(())()"
Remove the 4th index ')' -&gt; "()()()"
Both are valid and require the minimum removals.</span></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "(a)())()"
<strong>Output:</strong> ["(a())()", "(a)()()"]<br><strong>Explanation: </strong><br>We remove one ')' (minimum removals) to make it valid. Possible valid results:
Remove a ')' -&gt; "(a())()"
Remove another ')' -&gt; "(a)()()"</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = ")("
<strong>Output: </strong>[""]<br><strong>Explanation: </strong>The string ")(" is invalid. Removing both parentheses (minimum removals) gives an empty string "", which is valid.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&nbsp;<span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤</span> |s| <span style="font-size: 18.6667px; font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">≤</span> 20<br>s consists of lowercase English letters and parentheses '(' and ')'</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Backtracking</code>&nbsp;