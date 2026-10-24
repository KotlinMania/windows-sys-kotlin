// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagGetColorEffect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagGetColorEffect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `peffect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MAGCOLOREFFECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagGetFullscreenColorEffect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagGetFullscreenColorEffect`(`peffect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MAGCOLOREFFECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagGetFullscreenTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagGetFullscreenTransform`(`pmaglevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `pxoffset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pyoffset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagGetImageScalingCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `MagGetImageScalingCallback`(`hwnd` : `super`.`super`.`Foundation`.`HWND`) : `MagImageScalingCallback`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagGetInputTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagGetInputTransform`(`pfenabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `prectsource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `prectdest` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagGetWindowFilterList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagGetWindowFilterList`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `pdwfiltermode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MW_FILTERMODE`>?, `count` : Int, `phwnd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HWND`>?) : Int
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagGetWindowSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagGetWindowSource`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `prect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagGetWindowTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagGetWindowTransform`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ptransform` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MAGTRANSFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagInitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagInitialize`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagSetColorEffect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagSetColorEffect`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `peffect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MAGCOLOREFFECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagSetFullscreenColorEffect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagSetFullscreenColorEffect`(`peffect` : /* Rust *const */ kotlinx.cinterop.CPointer<`MAGCOLOREFFECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagSetFullscreenTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagSetFullscreenTransform`(`maglevel` : Float, `xoffset` : Int, `yoffset` : Int) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagSetImageScalingCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `MagSetImageScalingCallback`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `callback` : `MagImageScalingCallback`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagSetInputTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagSetInputTransform`(`fenabled` : `windows_sys`.`core`.`BOOL`, `prectsource` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `prectdest` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagSetWindowFilterList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagSetWindowFilterList`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `dwfiltermode` : `MW_FILTERMODE`, `count` : Int, `phwnd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HWND`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagSetWindowSource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagSetWindowSource`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `rect` : `super`.`super`.`Foundation`.`RECT`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagSetWindowTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagSetWindowTransform`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `ptransform` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MAGTRANSFORM`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagShowSystemCursor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagShowSystemCursor`(`fshowcursor` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=magnification.dll, ABI=system, export=MagUninitialize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MagUninitialize`() : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 25 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MAGCOLOREFFECT` (
    public var `transform`: FloatArray,
)
// UNSUPPORTED Rust 27:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MAGCOLOREFFECT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `MAGIMAGEHEADER` (
    public var `width`: UInt,
    public var `height`: UInt,
    public var `format`: `windows_sys`.`core`.`GUID`,
    public var `stride`: UInt,
    public var `offset`: UInt,
    public var `cbSize`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 9 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MAGTRANSFORM` (
    public var `v`: FloatArray,
)
// UNSUPPORTED Rust 47:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MAGTRANSFORM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MS_CLIPAROUNDCURSOR`: Int = 2;
public const val `MS_INVERTCOLORS`: Int = 4;
public const val `MS_SHOWMAGNIFIEDCURSOR`: Int = 1;
public typealias `MW_FILTERMODE` = UInt;
public const val `MW_FILTERMODE_EXCLUDE`: `MW_FILTERMODE` = 0u;
public const val `MW_FILTERMODE_INCLUDE`: `MW_FILTERMODE` = 1u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public typealias `MagImageScalingCallback` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HWND`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `MAGIMAGEHEADER`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `MAGIMAGEHEADER`, `super`.`super`.`Foundation`.`RECT`, `super`.`super`.`Foundation`.`RECT`, `super`.`super`.`Graphics`.`Gdi`.`HRGN`) -> `windows_sys`.`core`.`BOOL`>>>;
// UNSUPPORTED Rust 60:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WC_MAGNIFIER: windows_sys::core::PCWSTR = windows_sys::core::w!("Magnifier");

// UNSUPPORTED Rust 61:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WC_MAGNIFIERA: windows_sys::core::PCSTR = windows_sys::core::s!("Magnifier");

// UNSUPPORTED Rust 62:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WC_MAGNIFIERW: windows_sys::core::PCWSTR = windows_sys::core::w!("Magnifier");

