// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// factory record
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public class `Product` ( public var `value`:UInt ) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Factory` for `Product`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    /// first factory
public fun `Product`.Companion.`construct`(/* no args */):`Product` {
        // preserve nested value scopes
        return run { /* caller obligation */ run { `provider`.`next`(/* once */) } }
    }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    /// second factory
public fun `Product`.Companion.`alternate`():`Product` { return `provider`.`next`() }

