# CLAUDE.md — my_java_journey

## On Session Start (do this before anything else)

1. Run `git status` to see what's new or changed.
2. Read any new/modified files to understand what was added.
3. Tell the user what you found in one short summary.

---

## After Any Work Is Done

### Step 1 — Commit to GitHub
- Stage only relevant files (never `a.txt`, `*.lck`, root-level screenshots, `graphify-out/`).
- Commit message format: `phase-1: add <topic> practice with notes`
- Push to `main`.

### Step 2 — Update the graph (incremental only)
- Run `/graphify . --update` — NEVER run a full `/graphify .` rebuild.
- Full rebuild wastes tokens; `--update` re-extracts only new/changed files.
- After the update, tell the user which nodes were added or changed.
- Confirm with the user before committing anything graph-related.

---

## Rules

- Never commit: `a.txt`, `*.lck`, root-level screenshots, `graphify-out/` contents.
- Never run full `/graphify .` — always `--update`.
- Always push after a logical commit unless the user says not to.
- Keep commit messages consistent with the existing log style.
