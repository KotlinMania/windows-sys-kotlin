// port-lint: source src/Windows/Wdk/mod.rs
package io.github.kotlinmania.windowssys.windows.wdk

/**
 * Windows Driver Kit (WDK) bindings.
 *
 * In Rust, each submodule is gated by a Cargo feature (e.g. `Wdk_Devices`, `Wdk_System`).
 * This Kotlin port models the same module tree as packages.
 */
public object Wdk

