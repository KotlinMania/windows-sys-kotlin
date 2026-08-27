// port-lint: source Windows/mod.rs
package io.github.kotlinmania.windowssys.windows

// Upstream `Windows/mod.rs` is a pure re-export shim that exposes the
// feature-gated `Wdk` and `Win32` submodules. Per workspace AGENTS.md §3,
// re-export-only `mod.rs` files do not mint a central Kotlin alias —
// callers migrate to the original symbol's fully-qualified path under
// `io.github.kotlinmania.windowssys.windows.wdk.*` or
// `…windows.win32.*`, using `import <fq> as <Name>` at the call site if
// the re-exported spelling is still wanted.
//
// This file is the append-only ledger of migrated callers, per the
// AGENTS.md §3 `Mod.kt`-as-ledger convention.
//
// Callers migrated:
// (none yet)
