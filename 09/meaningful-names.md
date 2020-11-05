# Importance of meaningful function/class/variable/parameter names
A long time ago someone wrote some Python code.
A while later, they looked again at their code, and saw a function with this signature:
```py
def update_text(rx, ry, rh, sp, ssa, ca, dle, dlp, dla, dre, drp, dra, ee, ep, ea, ae, ap, aa, ce, cp, cam, ic, c, e, gd):
```
They had no idea what those parameter names meant - can anyone?

What's the solution?

**All names used when programming should have meaning**, whether it's a class/variable/field/function/parameter name or anything else.

Anyone involved in the project (and some that aren't) should be able to know what a class/variable/field/function/parameter does simply **from looking at its name**.

In cases where it might be a bit unclear (and also in those that are clear), **add documentation (comments) that explain**.

Some examples:
- `updateText(text, font, size)`
  - what does the function do?
  - what do each of the parameters do?
- `something.name`
  - what is stored in the `name` property/field?
  - does the type of `something` change what is in `name`?
- `class Filter`
  - what does this class do?
  - what fields/properties and functions/methods would this class probably have?
  - how can that be clearer?
- and endless other examples...

## And the same goes for commit and pull request messages!!!
![xkcd](https://imgs.xkcd.com/comics/git_commit.png)
