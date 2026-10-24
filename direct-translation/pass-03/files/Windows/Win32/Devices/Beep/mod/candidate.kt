// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `BEEP_FREQUENCY_MAXIMUM`: UInt = 32767u;
public const val `BEEP_FREQUENCY_MINIMUM`: UInt = 37u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BEEP_SET_PARAMETERS` (
    public var `Frequency`: UInt,
    public var `Duration`: UInt,
)
// UNSUPPORTED Rust 9:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DD_BEEP_DEVICE_NAME: windows_sys::core::PCSTR = windows_sys::core::s!("\\Device\\Beep");

// UNSUPPORTED Rust 10:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const DD_BEEP_DEVICE_NAME_U: windows_sys::core::PCWSTR = windows_sys::core::w!("\\Device\\Beep");

public const val `IOCTL_BEEP_SET`: UInt = 65536u;
