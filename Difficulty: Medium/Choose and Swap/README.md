<h2><a href="https://www.geeksforgeeks.org/problems/choose-and-swap0531/1">Choose and Swap</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><div class="pointer-events-none -mt-px h-px translate-y-[calc(var(--scroll-root-safe-area-inset-bottom)-14*var(--spacing))]" aria-hidden="true"><span style="font-size: 14pt;">Given a string </span><strong style="font-size: 14pt;">s</strong><span style="font-size: 14pt;"> of lowercase English letters, you can swap all occurrences of any two distinct characters <strong>at most</strong> once. </span><span style="font-size: 14pt;">Return the <strong>lexicographically </strong>smallest string after this operation.</span></div>
<section class="text-token-text-primary w-full focus:outline-none [--shadow-height:45px] has-data-writing-block:pointer-events-none has-data-writing-block:-mt-(--shadow-height) has-data-writing-block:pt-(--shadow-height) [&amp;:has([data-writing-block])&gt;*]:pointer-events-auto [content-visibility:auto] supports-[content-visibility:auto]:[contain-intrinsic-size:auto_100lvh] R6Vx5W_threadScrollVars scroll-mb-[calc(var(--scroll-root-safe-area-inset-bottom,0px)+var(--thread-response-height))] scroll-mt-[calc(var(--header-height)+min(200px,max(70px,20svh)))]" dir="auto" data-turn-id="request-WEB:662873f1-7b42-469d-a600-40fe2b412f3c-19" data-testid="conversation-turn-30" data-scroll-anchor="false" data-turn="assistant">
<div class="text-base my-auto mx-auto pb-10 [--thread-content-margin:var(--thread-content-margin-xs,calc(var(--spacing)*4))] @w-sm/main:[--thread-content-margin:var(--thread-content-margin-sm,calc(var(--spacing)*6))] @w-lg/main:[--thread-content-margin:var(--thread-content-margin-lg,calc(var(--spacing)*16))] px-(--thread-content-margin)">
<div class="[--thread-content-max-width:40rem] @w-lg/main:[--thread-content-max-width:48rem] mx-auto max-w-(--thread-content-max-width) flex-1 group/turn-messages focus-visible:outline-hidden relative flex w-full min-w-0 flex-col agent-turn">
<div class="flex max-w-full flex-col gap-4 grow">
<div class="min-h-8 text-message relative flex w-full flex-col items-end gap-2 text-start break-words whitespace-normal outline-none keyboard-focused:focus-ring [.text-message+&amp;]:mt-1" dir="auto" tabindex="0" data-message-author-role="assistant" data-message-id="4a42cc88-a043-4778-b7bd-3d709c06ec60" data-message-model-slug="gpt-5-3" data-turn-start-message="true">
<div class="flex w-full flex-col gap-1 empty:hidden">
<div class="markdown prose dark:prose-invert w-full wrap-break-word light markdown-new-styling">
<p data-start="0" data-end="202" data-is-last-node="" data-is-only-node=""><strong style="font-size: 18px;">Examples:</strong></p>
</div>
</div>
</div>
</div>
</div>
</div>
</section>
<pre><span style="font-size: 18px;"><strong>Input</strong>: s = "ccad"
<strong>Output:</strong>&nbsp;"aacd"
<strong>Explanation</strong>: In ccad, we choose a and c and after doing the replacement operation once, we get aacd and this is the lexicographically smallest string possible. </span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "abba"
<strong>Output: </strong>"abba"
<strong>Explanation: </strong>In abba, we can get baab after doing the replacement operation once for a and b but that is not lexicographically smaller than abba. So, the answer is abba. </span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ |s|</span><span style="font-size: 18px;"><span style="color: #0a0a0a; font-family: Google Sans, Arial, sans-serif;"><strong>&nbsp;</strong></span></span>≤ <span style="font-size: 18px;">10</span><sup>5</sup></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Greedy</code>&nbsp;<code>Algorithms</code>&nbsp;