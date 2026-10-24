// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
public const val `ICW_ALREADYRUN`: UInt = 4u;
public const val `ICW_CHECKSTATUS`: UInt = 1u;
public const val `ICW_FULLPRESENT`: UInt = 1u;
public const val `ICW_FULL_SMARTSTART`: UInt = 2048u;
public const val `ICW_LAUNCHEDFULL`: UInt = 256u;
public const val `ICW_LAUNCHEDMANUAL`: UInt = 512u;
public const val `ICW_LAUNCHFULL`: UInt = 256u;
public const val `ICW_LAUNCHMANUAL`: UInt = 512u;
public const val `ICW_MANUALPRESENT`: UInt = 2u;
public const val `ICW_MAX_ACCTNAME`: UInt = 256u;
public const val `ICW_MAX_EMAILADDR`: UInt = 128u;
public const val `ICW_MAX_EMAILNAME`: UInt = 64u;
public const val `ICW_MAX_LOGONNAME`: UInt = 256u;
public const val `ICW_MAX_PASSWORD`: UInt = 256u;
public const val `ICW_MAX_RASNAME`: UInt = 256u;
public const val `ICW_MAX_SERVERNAME`: UInt = 64u;
// UNSUPPORTED Rust 17:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ICW_REGKEYCOMPLETED: windows_sys::core::PCSTR = windows_sys::core::s!("Completed");

// UNSUPPORTED Rust 18:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const ICW_REGPATHSETTINGS: windows_sys::core::PCSTR = windows_sys::core::s!("Software\\Microsoft\\Internet Connection Wizard");

public const val `ICW_USEDEFAULTS`: UInt = 1u;
public const val `ICW_USE_SHELLNEXT`: UInt = 1024u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNCHECKCONNECTIONWIZARD` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNSETSHELLNEXT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`) -> UInt>>>;
