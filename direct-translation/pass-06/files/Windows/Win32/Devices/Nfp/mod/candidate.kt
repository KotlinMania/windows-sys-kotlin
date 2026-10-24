// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: qualified type requires source-backed binding: super::super::Foundation::DEVPROPKEY; syntax: constant expression has no syntax candidate rule
// pub const DEVPKEY_NFP_Capabilities: super::super::Foundation::DEVPROPKEY = super::super::Foundation::DEVPROPKEY { fmtid: windows_sys::core::GUID::from_u128(0xfb3842cd_9e2a_4f83_8fcc_4b0761139ae9), pid: 2 };

// UNSUPPORTED Rust 2:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_NFP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xfb3842cd_9e2a_4f83_8fcc_4b0761139ae9);

public const val `IOCTL_NFP_DISABLE`: UInt = 5308492u;
public const val `IOCTL_NFP_ENABLE`: UInt = 5308496u;
public const val `IOCTL_NFP_GET_KILO_BYTES_PER_SECOND`: UInt = 5308548u;
public const val `IOCTL_NFP_GET_MAX_MESSAGE_BYTES`: UInt = 5308544u;
public const val `IOCTL_NFP_GET_NEXT_SUBSCRIBED_MESSAGE`: UInt = 5308480u;
public const val `IOCTL_NFP_GET_NEXT_TRANSMITTED_MESSAGE`: UInt = 5308488u;
public const val `IOCTL_NFP_SET_PAYLOAD`: UInt = 5308484u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SUBSCRIBED_MESSAGE` (
    public var `cbPayloadHint`: UInt,
    public var `payload`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SUBSCRIBED_MESSAGE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SUBSCRIBED_MESSAGE`.Companion.`default`() : `SUBSCRIBED_MESSAGE` {
        return run { `core`.`mem`.`zeroed`() }
    }

