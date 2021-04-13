> ### Convention Notes
> - Terms are in *italics*
> - Code/Command-line is in `code formatting`
>  - positional parameters are in `<triangle_parentheses>`. Replace the parentheses and their contents with the value.
>  - optional parameters are in `[square_parentheses]`. Replace the parentheses and their contents with the value.
>  - Example for all this: `command <parameter> [optional_parameter]`

## Git Objects
Git objects are saved in the `.git` folder inside the repository root. 
Each object is identified by its _SHA-1_ 40-character hash. When referencing a commit, the first 6 chars are enough.

## HEAD and `reflog`
- `HEAD` is a special commit reference that points to the commit currently checked out.
- `HEAD` can be detached to a commit that isn’t on a local branch (likely meaning a tag, remote branch, or other) with `git switch -d <commit_identifier>`. Create a branch as usual after that if relevant.
- `git reflog` is a very useful command to fix mistakes - it prints a history of the commits HEAD pointed to. Entries can be referenced in short with `HEAD@{N}` (N is a 0-based index, where 0 is the current HEAD).

## Commit Object/References
An important type of object is a commit object (which we create when we run `git commit`). It contains:
- A reference to the root tree object (which recursively contains references to blob objects that contain the state of a single file) ![](https://git-scm.com/book/en/v2/images/data-model-2.png)
- A reference to the parent (previous) commit - like a linked list
- Commit message
- Author/Committer
- Date/Time
- some more stuff ...

**Almost everything else (branches, tags) are pointers/references to commit objects.**

![](https://miro.medium.com/max/870/1*ixrYLiY4q629-e18Ru0kwg.png)

The commit history displayed by `git log` is built like this (standard linked-list traversal):
```kt
while(currentCommit != null) {
  print(currentCommit)
  currentCommit = currentCommit.parent
} 
```

## Tags
There are two types of tags:
- _Lightweight tags_ are like branches  - the only data they store is the SHA-1 hash of the commit they point to. 
  To create a lightweight tag, use `git tag <tag_name> [commit_hash]` (commit_hash defaults to HEAD)
- _Annotated tags_: see <https://git-scm.com/docs/git-tag> for more details

## Commit References
Using hashes to identify commits is hard and ineffective even when using shortened 6-char identifiers; 40-char hashes are impractical. This is why there are a few shortcuts:
- Commit references (branches/tags) can be used instead of the commit hash they’re pointing to. **!!!Note that branches can move and change what commit they’re pointing to!!!** (unlike branches, tags aren’t supposed to be moved so they don’t have this problem)
- Backward references (usually from HEAD), in the format `ref~N` (N is a 0-based index where 0 is the current ref). For example `HEAD~1` is the commit before the one HEAD is pointing to (aka HEAD’s parent). 

## After meeting
Try completing the Git Games CTF - <https://miscar.github.io/>

Sources:
- <https://medium.com/@pawan_rawal/demystifying-git-internals-a004f0425a70>
- <https://git-scm.com/book/en/v2/Git-Internals-Git-Objects>
