// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `COMDLG_FILTERSPEC` (
    public var `pszName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszSpec`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 7:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for COMDLG_FILTERSPEC {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `DEVICE_SCALE_FACTOR` = Int;
public const val `DEVICE_SCALE_FACTOR_INVALID`: `DEVICE_SCALE_FACTOR` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ITEMIDLIST` (
    public var `mkid`: `SHITEMID`,
)
public typealias `PERCEIVED` = Int;
public const val `PERCEIVEDFLAG_GDIPLUS`: UInt = 16u;
public const val `PERCEIVEDFLAG_HARDCODED`: UInt = 2u;
public const val `PERCEIVEDFLAG_NATIVESUPPORT`: UInt = 4u;
public const val `PERCEIVEDFLAG_SOFTCODED`: UInt = 1u;
public const val `PERCEIVEDFLAG_UNDEFINED`: UInt = 0u;
public const val `PERCEIVEDFLAG_WMSDK`: UInt = 32u;
public const val `PERCEIVEDFLAG_ZIPFOLDER`: UInt = 64u;
public const val `PERCEIVED_TYPE_APPLICATION`: `PERCEIVED` = 8;
public const val `PERCEIVED_TYPE_AUDIO`: `PERCEIVED` = 3;
public const val `PERCEIVED_TYPE_COMPRESSED`: `PERCEIVED` = 5;
public const val `PERCEIVED_TYPE_CONTACTS`: `PERCEIVED` = 10;
public const val `PERCEIVED_TYPE_CUSTOM`: `PERCEIVED` = -3;
public const val `PERCEIVED_TYPE_DOCUMENT`: `PERCEIVED` = 6;
public const val `PERCEIVED_TYPE_FIRST`: `PERCEIVED` = -3;
public const val `PERCEIVED_TYPE_FOLDER`: `PERCEIVED` = -1;
public const val `PERCEIVED_TYPE_GAMEMEDIA`: `PERCEIVED` = 9;
public const val `PERCEIVED_TYPE_IMAGE`: `PERCEIVED` = 2;
public const val `PERCEIVED_TYPE_LAST`: `PERCEIVED` = 10;
public const val `PERCEIVED_TYPE_SYSTEM`: `PERCEIVED` = 7;
public const val `PERCEIVED_TYPE_TEXT`: `PERCEIVED` = 1;
public const val `PERCEIVED_TYPE_UNKNOWN`: `PERCEIVED` = 0;
public const val `PERCEIVED_TYPE_UNSPECIFIED`: `PERCEIVED` = -2;
public const val `PERCEIVED_TYPE_VIDEO`: `PERCEIVED` = 4;
public const val `SCALE_100_PERCENT`: `DEVICE_SCALE_FACTOR` = 100;
public const val `SCALE_120_PERCENT`: `DEVICE_SCALE_FACTOR` = 120;
public const val `SCALE_125_PERCENT`: `DEVICE_SCALE_FACTOR` = 125;
public const val `SCALE_140_PERCENT`: `DEVICE_SCALE_FACTOR` = 140;
public const val `SCALE_150_PERCENT`: `DEVICE_SCALE_FACTOR` = 150;
public const val `SCALE_160_PERCENT`: `DEVICE_SCALE_FACTOR` = 160;
public const val `SCALE_175_PERCENT`: `DEVICE_SCALE_FACTOR` = 175;
public const val `SCALE_180_PERCENT`: `DEVICE_SCALE_FACTOR` = 180;
public const val `SCALE_200_PERCENT`: `DEVICE_SCALE_FACTOR` = 200;
public const val `SCALE_225_PERCENT`: `DEVICE_SCALE_FACTOR` = 225;
public const val `SCALE_250_PERCENT`: `DEVICE_SCALE_FACTOR` = 250;
public const val `SCALE_300_PERCENT`: `DEVICE_SCALE_FACTOR` = 300;
public const val `SCALE_350_PERCENT`: `DEVICE_SCALE_FACTOR` = 350;
public const val `SCALE_400_PERCENT`: `DEVICE_SCALE_FACTOR` = 400;
public const val `SCALE_450_PERCENT`: `DEVICE_SCALE_FACTOR` = 450;
public const val `SCALE_500_PERCENT`: `DEVICE_SCALE_FACTOR` = 500;
public typealias `SHCOLSTATE` = Int;
public const val `SHCOLSTATE_BATCHREAD`: `SHCOLSTATE` = 131072;
public const val `SHCOLSTATE_DEFAULT`: `SHCOLSTATE` = 0;
public const val `SHCOLSTATE_DISPLAYMASK`: `SHCOLSTATE` = 61440;
public const val `SHCOLSTATE_EXTENDED`: `SHCOLSTATE` = 64;
public const val `SHCOLSTATE_FIXED_RATIO`: `SHCOLSTATE` = 16384;
public const val `SHCOLSTATE_FIXED_WIDTH`: `SHCOLSTATE` = 4096;
public const val `SHCOLSTATE_HIDDEN`: `SHCOLSTATE` = 256;
public const val `SHCOLSTATE_NODPISCALE`: `SHCOLSTATE` = 8192;
public const val `SHCOLSTATE_NOSORTBYFOLDERNESS`: `SHCOLSTATE` = 2048;
public const val `SHCOLSTATE_NO_GROUPBY`: `SHCOLSTATE` = 262144;
public const val `SHCOLSTATE_ONBYDEFAULT`: `SHCOLSTATE` = 16;
public const val `SHCOLSTATE_PREFER_FMTCMP`: `SHCOLSTATE` = 1024;
public const val `SHCOLSTATE_PREFER_VARCMP`: `SHCOLSTATE` = 512;
public const val `SHCOLSTATE_SECONDARYUI`: `SHCOLSTATE` = 128;
public const val `SHCOLSTATE_SLOW`: `SHCOLSTATE` = 32;
public const val `SHCOLSTATE_TYPEMASK`: `SHCOLSTATE` = 15;
public const val `SHCOLSTATE_TYPE_DATE`: `SHCOLSTATE` = 3;
public const val `SHCOLSTATE_TYPE_INT`: `SHCOLSTATE` = 2;
public const val `SHCOLSTATE_TYPE_STR`: `SHCOLSTATE` = 1;
public const val `SHCOLSTATE_VIEWONLY`: `SHCOLSTATE` = 65536;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHELLDETAILS` (
    public var `fmt`: Int,
    public var `cxChar`: Int,
    public var `str`: `STRRET`,
)
// UNSUPPORTED Rust 87:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SHELLDETAILS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SHITEMID` (
    public var `cb`: UShort,
    public var `abID`: UByteArray,
)
// UNSUPPORTED Rust 98:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for SHITEMID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `STRRET` (
    public var `uType`: UInt,
    public var `Anonymous`: `STRRET_0`,
)
// UNSUPPORTED Rust 109:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STRRET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 114:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union STRRET_0 {
//     pub pOleStr: windows_sys::core::PWSTR,
//     pub uOffset: u32,
//     pub cStr: [u8; 260],
// }

// UNSUPPORTED Rust 121:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for STRRET_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `STRRET_CSTR`: `STRRET_TYPE` = 2;
public const val `STRRET_OFFSET`: `STRRET_TYPE` = 1;
public typealias `STRRET_TYPE` = Int;
public const val `STRRET_WSTR`: `STRRET_TYPE` = 0;
