// port-lint: source src/lib.rs
package io.github.kotlinmania.windowssys

// Upstream `src/lib.rs` is a re-export shim: `#![no_std]`, allow attrs, and
// `pub mod core; include!("Windows/mod.rs");`. Re-exports map to Kotlin
// imports at call sites — there is no Kotlin-side ledger entry needed
// here, so this file is intentionally just the package declaration plus
// the provenance header so ast_distance can mark `lib.rs` covered.
