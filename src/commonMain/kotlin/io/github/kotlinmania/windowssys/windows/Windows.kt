// port-lint: source src/Windows/mod.rs
package io.github.kotlinmania.windowssys.windows

/**
 * Upstream `windows-sys` groups generated bindings under a `Windows` module.
 *
 * In Rust, the submodules are feature-gated (`Wdk`, `Win32`). Kotlin does not have Cargo features,
 * so this port models the module tree as packages.
 */
public object Windows

