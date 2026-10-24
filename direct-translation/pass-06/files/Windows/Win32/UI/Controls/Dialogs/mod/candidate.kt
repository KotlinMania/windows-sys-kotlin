// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=ChooseColorA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChooseColorA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CHOOSECOLORA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=ChooseColorW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ChooseColorW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CHOOSECOLORW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=ChooseFontA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ChooseFontA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CHOOSEFONTA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=ChooseFontW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `ChooseFontW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CHOOSEFONTW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=CommDlgExtendedError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CommDlgExtendedError`() : `COMMON_DLG_ERRORS`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=FindTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindTextA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FINDREPLACEA`>?) : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=FindTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindTextW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FINDREPLACEW`>?) : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=GetFileTitleA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileTitleA`(`param0` : `windows_sys`.`core`.`PCSTR`, `buf` : `windows_sys`.`core`.`PSTR`, `cchsize` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=GetFileTitleW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFileTitleW`(`param0` : `windows_sys`.`core`.`PCWSTR`, `buf` : `windows_sys`.`core`.`PWSTR`, `cchsize` : UShort) : Short
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=GetOpenFileNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOpenFileNameA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=GetOpenFileNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetOpenFileNameW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=GetSaveFileNameA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSaveFileNameA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=GetSaveFileNameW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSaveFileNameW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=PageSetupDlgA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PageSetupDlgA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PAGESETUPDLGA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=PageSetupDlgW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PageSetupDlgW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PAGESETUPDLGW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=PrintDlgA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `PrintDlgA`(`ppd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTDLGA`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=PrintDlgExA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `PrintDlgExA`(`ppd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTDLGEXA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=PrintDlgExW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `PrintDlgExW`(`ppd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTDLGEXW`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=PrintDlgW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `PrintDlgW`(`ppd` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTDLGW`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=ReplaceTextA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReplaceTextA`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FINDREPLACEA`>?) : `super`.`super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=comdlg32.dll, ABI=system, export=ReplaceTextW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReplaceTextW`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FINDREPLACEW`>?) : `super`.`super`.`super`.`Foundation`.`HWND`
public const val `BOLD_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 256u;
public const val `CCERR_CHOOSECOLORCODES`: `COMMON_DLG_ERRORS` = 20480u;
public const val `CC_ANYCOLOR`: `CHOOSECOLOR_FLAGS` = 256u;
public const val `CC_ENABLEHOOK`: `CHOOSECOLOR_FLAGS` = 16u;
public const val `CC_ENABLETEMPLATE`: `CHOOSECOLOR_FLAGS` = 32u;
public const val `CC_ENABLETEMPLATEHANDLE`: `CHOOSECOLOR_FLAGS` = 64u;
public const val `CC_FULLOPEN`: `CHOOSECOLOR_FLAGS` = 2u;
public const val `CC_PREVENTFULLOPEN`: `CHOOSECOLOR_FLAGS` = 4u;
public const val `CC_RGBINIT`: `CHOOSECOLOR_FLAGS` = 1u;
public const val `CC_SHOWHELP`: `CHOOSECOLOR_FLAGS` = 8u;
public const val `CC_SOLIDCOLOR`: `CHOOSECOLOR_FLAGS` = 128u;
public const val `CDERR_DIALOGFAILURE`: `COMMON_DLG_ERRORS` = 65535u;
public const val `CDERR_FINDRESFAILURE`: `COMMON_DLG_ERRORS` = 6u;
public const val `CDERR_GENERALCODES`: `COMMON_DLG_ERRORS` = 0u;
public const val `CDERR_INITIALIZATION`: `COMMON_DLG_ERRORS` = 2u;
public const val `CDERR_LOADRESFAILURE`: `COMMON_DLG_ERRORS` = 7u;
public const val `CDERR_LOADSTRFAILURE`: `COMMON_DLG_ERRORS` = 5u;
public const val `CDERR_LOCKRESFAILURE`: `COMMON_DLG_ERRORS` = 8u;
public const val `CDERR_MEMALLOCFAILURE`: `COMMON_DLG_ERRORS` = 9u;
public const val `CDERR_MEMLOCKFAILURE`: `COMMON_DLG_ERRORS` = 10u;
public const val `CDERR_NOHINSTANCE`: `COMMON_DLG_ERRORS` = 4u;
public const val `CDERR_NOHOOK`: `COMMON_DLG_ERRORS` = 11u;
public const val `CDERR_NOTEMPLATE`: `COMMON_DLG_ERRORS` = 3u;
public const val `CDERR_REGISTERMSGFAIL`: `COMMON_DLG_ERRORS` = 12u;
public const val `CDERR_STRUCTSIZE`: `COMMON_DLG_ERRORS` = 1u;
public const val `CDM_FIRST`: UInt = 1124u;
public const val `CDM_GETFILEPATH`: UInt = 1125u;
public const val `CDM_GETFOLDERIDLIST`: UInt = 1127u;
public const val `CDM_GETFOLDERPATH`: UInt = 1126u;
public const val `CDM_GETSPEC`: UInt = 1124u;
public const val `CDM_HIDECONTROL`: UInt = 1129u;
public const val `CDM_LAST`: UInt = 1224u;
public const val `CDM_SETCONTROLTEXT`: UInt = 1128u;
public const val `CDM_SETDEFEXT`: UInt = 1130u;
public const val `CDN_FILEOK`: UInt = 4294966690u;
public const val `CDN_FOLDERCHANGE`: UInt = 4294966693u;
public const val `CDN_HELP`: UInt = 4294966691u;
public const val `CDN_INCLUDEITEM`: UInt = 4294966688u;
public const val `CDN_INITDONE`: UInt = 4294966695u;
public const val `CDN_SELCHANGE`: UInt = 4294966694u;
public const val `CDN_SHAREVIOLATION`: UInt = 4294966692u;
public const val `CDN_TYPECHANGE`: UInt = 4294966689u;
public const val `CD_LBSELADD`: UInt = 2u;
public const val `CD_LBSELCHANGE`: UInt = 0u;
public const val `CD_LBSELNOITEMS`: Int = -1;
public const val `CD_LBSELSUB`: UInt = 1u;
public const val `CFERR_CHOOSEFONTCODES`: `COMMON_DLG_ERRORS` = 8192u;
public const val `CFERR_MAXLESSTHANMIN`: `COMMON_DLG_ERRORS` = 8194u;
public const val `CFERR_NOFONTS`: `COMMON_DLG_ERRORS` = 8193u;
public const val `CF_ANSIONLY`: `CHOOSEFONT_FLAGS` = 1024u;
public const val `CF_APPLY`: `CHOOSEFONT_FLAGS` = 512u;
public const val `CF_BOTH`: `CHOOSEFONT_FLAGS` = 3u;
public const val `CF_EFFECTS`: `CHOOSEFONT_FLAGS` = 256u;
public const val `CF_ENABLEHOOK`: `CHOOSEFONT_FLAGS` = 8u;
public const val `CF_ENABLETEMPLATE`: `CHOOSEFONT_FLAGS` = 16u;
public const val `CF_ENABLETEMPLATEHANDLE`: `CHOOSEFONT_FLAGS` = 32u;
public const val `CF_FIXEDPITCHONLY`: `CHOOSEFONT_FLAGS` = 16384u;
public const val `CF_FORCEFONTEXIST`: `CHOOSEFONT_FLAGS` = 65536u;
public const val `CF_INACTIVEFONTS`: `CHOOSEFONT_FLAGS` = 33554432u;
public const val `CF_INITTOLOGFONTSTRUCT`: `CHOOSEFONT_FLAGS` = 64u;
public const val `CF_LIMITSIZE`: `CHOOSEFONT_FLAGS` = 8192u;
public const val `CF_NOFACESEL`: `CHOOSEFONT_FLAGS` = 524288u;
public const val `CF_NOOEMFONTS`: `CHOOSEFONT_FLAGS` = 2048u;
public const val `CF_NOSCRIPTSEL`: `CHOOSEFONT_FLAGS` = 8388608u;
public const val `CF_NOSIMULATIONS`: `CHOOSEFONT_FLAGS` = 4096u;
public const val `CF_NOSIZESEL`: `CHOOSEFONT_FLAGS` = 2097152u;
public const val `CF_NOSTYLESEL`: `CHOOSEFONT_FLAGS` = 1048576u;
public const val `CF_NOVECTORFONTS`: `CHOOSEFONT_FLAGS` = 2048u;
public const val `CF_NOVERTFONTS`: `CHOOSEFONT_FLAGS` = 16777216u;
public const val `CF_PRINTERFONTS`: `CHOOSEFONT_FLAGS` = 2u;
public const val `CF_SCALABLEONLY`: `CHOOSEFONT_FLAGS` = 131072u;
public const val `CF_SCREENFONTS`: `CHOOSEFONT_FLAGS` = 1u;
public const val `CF_SCRIPTSONLY`: `CHOOSEFONT_FLAGS` = 1024u;
public const val `CF_SELECTSCRIPT`: `CHOOSEFONT_FLAGS` = 4194304u;
public const val `CF_SHOWHELP`: `CHOOSEFONT_FLAGS` = 4u;
public const val `CF_TTONLY`: `CHOOSEFONT_FLAGS` = 262144u;
public const val `CF_USESTYLE`: `CHOOSEFONT_FLAGS` = 128u;
public const val `CF_WYSIWYG`: `CHOOSEFONT_FLAGS` = 32768u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHOOSECOLORA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `rgbResult`: `super`.`super`.`super`.`Foundation`.`COLORREF`,
    public var `lpCustColors`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`COLORREF`>?,
    public var `Flags`: `CHOOSECOLOR_FLAGS`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPCCHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CHOOSECOLORA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `CHOOSECOLORA`.Companion.`default`() : `CHOOSECOLORA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHOOSECOLORA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `rgbResult`: `super`.`super`.`super`.`Foundation`.`COLORREF`,
    public var `lpCustColors`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`COLORREF`>?,
    public var `Flags`: `CHOOSECOLOR_FLAGS`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPCCHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CHOOSECOLORA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `CHOOSECOLORA`.Companion.`default`() : `CHOOSECOLORA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHOOSECOLORW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `rgbResult`: `super`.`super`.`super`.`Foundation`.`COLORREF`,
    public var `lpCustColors`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`COLORREF`>?,
    public var `Flags`: `CHOOSECOLOR_FLAGS`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPCCHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CHOOSECOLORW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `CHOOSECOLORW`.Companion.`default`() : `CHOOSECOLORW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHOOSECOLORW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `rgbResult`: `super`.`super`.`super`.`Foundation`.`COLORREF`,
    public var `lpCustColors`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Foundation`.`COLORREF`>?,
    public var `Flags`: `CHOOSECOLOR_FLAGS`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPCCHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CHOOSECOLORW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `CHOOSECOLORW`.Companion.`default`() : `CHOOSECOLORW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `CHOOSECOLOR_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHOOSEFONTA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `lpLogFont`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`>?,
    public var `iPointSize`: Int,
    public var `Flags`: `CHOOSEFONT_FLAGS`,
    public var `rgbColors`: `super`.`super`.`super`.`Foundation`.`COLORREF`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPCFHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszStyle`: `windows_sys`.`core`.`PSTR`,
    public var `nFontType`: `CHOOSEFONT_FONT_TYPE`,
    public var `___MISSING_ALIGNMENT__`: UShort,
    public var `nSizeMin`: Int,
    public var `nSizeMax`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CHOOSEFONTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `CHOOSEFONTA`.Companion.`default`() : `CHOOSEFONTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHOOSEFONTA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `lpLogFont`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`LOGFONTA`>?,
    public var `iPointSize`: Int,
    public var `Flags`: `CHOOSEFONT_FLAGS`,
    public var `rgbColors`: `super`.`super`.`super`.`Foundation`.`COLORREF`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPCFHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszStyle`: `windows_sys`.`core`.`PSTR`,
    public var `nFontType`: `CHOOSEFONT_FONT_TYPE`,
    public var `___MISSING_ALIGNMENT__`: UShort,
    public var `nSizeMin`: Int,
    public var `nSizeMax`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CHOOSEFONTA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `CHOOSEFONTA`.Companion.`default`() : `CHOOSEFONTA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHOOSEFONTW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `lpLogFont`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`>?,
    public var `iPointSize`: Int,
    public var `Flags`: `CHOOSEFONT_FLAGS`,
    public var `rgbColors`: `super`.`super`.`super`.`Foundation`.`COLORREF`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPCFHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszStyle`: `windows_sys`.`core`.`PWSTR`,
    public var `nFontType`: `CHOOSEFONT_FONT_TYPE`,
    public var `___MISSING_ALIGNMENT__`: UShort,
    public var `nSizeMin`: Int,
    public var `nSizeMax`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CHOOSEFONTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `CHOOSEFONTW`.Companion.`default`() : `CHOOSEFONTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CHOOSEFONTW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `lpLogFont`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`super`.`Graphics`.`Gdi`.`LOGFONTW`>?,
    public var `iPointSize`: Int,
    public var `Flags`: `CHOOSEFONT_FLAGS`,
    public var `rgbColors`: `super`.`super`.`super`.`Foundation`.`COLORREF`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPCFHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpszStyle`: `windows_sys`.`core`.`PWSTR`,
    public var `nFontType`: `CHOOSEFONT_FONT_TYPE`,
    public var `___MISSING_ALIGNMENT__`: UShort,
    public var `nSizeMin`: Int,
    public var `nSizeMax`: Int,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `CHOOSEFONTW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `CHOOSEFONTW`.Companion.`default`() : `CHOOSEFONTW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `CHOOSEFONT_FLAGS` = UInt;
public typealias `CHOOSEFONT_FONT_TYPE` = UShort;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `COLOROKSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_ColorOK");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `COLOROKSTRINGA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("commdlg_ColorOK");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `COLOROKSTRINGW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_ColorOK");
public const val `COLOR_ADD`: UInt = 712u;
public const val `COLOR_BLUE`: UInt = 708u;
public const val `COLOR_BLUEACCEL`: UInt = 728u;
public const val `COLOR_BOX1`: UInt = 720u;
public const val `COLOR_CURRENT`: UInt = 709u;
public const val `COLOR_CUSTOM1`: UInt = 721u;
public const val `COLOR_ELEMENT`: UInt = 716u;
public const val `COLOR_GREEN`: UInt = 707u;
public const val `COLOR_GREENACCEL`: UInt = 727u;
public const val `COLOR_HUE`: UInt = 703u;
public const val `COLOR_HUEACCEL`: UInt = 723u;
public const val `COLOR_HUESCROLL`: UInt = 700u;
public const val `COLOR_LUM`: UInt = 705u;
public const val `COLOR_LUMACCEL`: UInt = 725u;
public const val `COLOR_LUMSCROLL`: UInt = 702u;
public const val `COLOR_MIX`: UInt = 719u;
public const val `COLOR_PALETTE`: UInt = 718u;
public const val `COLOR_RAINBOW`: UInt = 710u;
public const val `COLOR_RED`: UInt = 706u;
public const val `COLOR_REDACCEL`: UInt = 726u;
public const val `COLOR_SAMPLES`: UInt = 717u;
public const val `COLOR_SAT`: UInt = 704u;
public const val `COLOR_SATACCEL`: UInt = 724u;
public const val `COLOR_SATSCROLL`: UInt = 701u;
public const val `COLOR_SAVE`: UInt = 711u;
public const val `COLOR_SCHEMES`: UInt = 715u;
public const val `COLOR_SOLID`: UInt = 713u;
public const val `COLOR_SOLID_LEFT`: UInt = 730u;
public const val `COLOR_SOLID_RIGHT`: UInt = 731u;
public const val `COLOR_TUNE`: UInt = 714u;
public typealias `COMMON_DLG_ERRORS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVNAMES` (
    public var `wDriverOffset`: UShort,
    public var `wDeviceOffset`: UShort,
    public var `wOutputOffset`: UShort,
    public var `wDefault`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DEVNAMES` (
    public var `wDriverOffset`: UShort,
    public var `wDeviceOffset`: UShort,
    public var `wOutputOffset`: UShort,
    public var `wDefault`: UShort,
)
public const val `DLG_COLOR`: UInt = 10u;
public const val `DN_DEFAULTPRN`: UInt = 1u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FILEOKSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_FileNameOK");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FILEOKSTRINGA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("commdlg_FileNameOK");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FILEOKSTRINGW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_FileNameOK");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FINDMSGSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_FindReplace");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FINDMSGSTRINGA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("commdlg_FindReplace");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `FINDMSGSTRINGW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_FindReplace");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FINDREPLACEA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Flags`: `FINDREPLACE_FLAGS`,
    public var `lpstrFindWhat`: `windows_sys`.`core`.`PSTR`,
    public var `lpstrReplaceWith`: `windows_sys`.`core`.`PSTR`,
    public var `wFindWhatLen`: UShort,
    public var `wReplaceWithLen`: UShort,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPFRHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FINDREPLACEA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `FINDREPLACEA`.Companion.`default`() : `FINDREPLACEA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FINDREPLACEA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Flags`: `FINDREPLACE_FLAGS`,
    public var `lpstrFindWhat`: `windows_sys`.`core`.`PSTR`,
    public var `lpstrReplaceWith`: `windows_sys`.`core`.`PSTR`,
    public var `wFindWhatLen`: UShort,
    public var `wReplaceWithLen`: UShort,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPFRHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FINDREPLACEA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `FINDREPLACEA`.Companion.`default`() : `FINDREPLACEA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FINDREPLACEW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Flags`: `FINDREPLACE_FLAGS`,
    public var `lpstrFindWhat`: `windows_sys`.`core`.`PWSTR`,
    public var `lpstrReplaceWith`: `windows_sys`.`core`.`PWSTR`,
    public var `wFindWhatLen`: UShort,
    public var `wReplaceWithLen`: UShort,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPFRHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FINDREPLACEW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `FINDREPLACEW`.Companion.`default`() : `FINDREPLACEW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FINDREPLACEW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `Flags`: `FINDREPLACE_FLAGS`,
    public var `lpstrFindWhat`: `windows_sys`.`core`.`PWSTR`,
    public var `lpstrReplaceWith`: `windows_sys`.`core`.`PWSTR`,
    public var `wFindWhatLen`: UShort,
    public var `wReplaceWithLen`: UShort,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPFRHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FINDREPLACEW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `FINDREPLACEW`.Companion.`default`() : `FINDREPLACEW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `FINDREPLACE_FLAGS` = UInt;
public const val `FNERR_BUFFERTOOSMALL`: `COMMON_DLG_ERRORS` = 12291u;
public const val `FNERR_FILENAMECODES`: `COMMON_DLG_ERRORS` = 12288u;
public const val `FNERR_INVALIDFILENAME`: `COMMON_DLG_ERRORS` = 12290u;
public const val `FNERR_SUBCLASSFAILURE`: `COMMON_DLG_ERRORS` = 12289u;
public const val `FRERR_BUFFERLENGTHZERO`: `COMMON_DLG_ERRORS` = 16385u;
public const val `FRERR_FINDREPLACECODES`: `COMMON_DLG_ERRORS` = 16384u;
public const val `FRM_FIRST`: UInt = 1124u;
public const val `FRM_LAST`: UInt = 1224u;
public const val `FRM_SETOPERATIONRESULT`: UInt = 1124u;
public const val `FRM_SETOPERATIONRESULTTEXT`: UInt = 1125u;
public const val `FR_DIALOGTERM`: `FINDREPLACE_FLAGS` = 64u;
public const val `FR_DOWN`: `FINDREPLACE_FLAGS` = 1u;
public const val `FR_ENABLEHOOK`: `FINDREPLACE_FLAGS` = 256u;
public const val `FR_ENABLETEMPLATE`: `FINDREPLACE_FLAGS` = 512u;
public const val `FR_ENABLETEMPLATEHANDLE`: `FINDREPLACE_FLAGS` = 8192u;
public const val `FR_FINDNEXT`: `FINDREPLACE_FLAGS` = 8u;
public const val `FR_HIDEMATCHCASE`: `FINDREPLACE_FLAGS` = 32768u;
public const val `FR_HIDEUPDOWN`: `FINDREPLACE_FLAGS` = 16384u;
public const val `FR_HIDEWHOLEWORD`: `FINDREPLACE_FLAGS` = 65536u;
public const val `FR_MATCHALEFHAMZA`: `FINDREPLACE_FLAGS` = 2147483648u;
public const val `FR_MATCHCASE`: `FINDREPLACE_FLAGS` = 4u;
public const val `FR_MATCHDIAC`: `FINDREPLACE_FLAGS` = 536870912u;
public const val `FR_MATCHKASHIDA`: `FINDREPLACE_FLAGS` = 1073741824u;
public const val `FR_NOMATCHCASE`: `FINDREPLACE_FLAGS` = 2048u;
public const val `FR_NOUPDOWN`: `FINDREPLACE_FLAGS` = 1024u;
public const val `FR_NOWHOLEWORD`: `FINDREPLACE_FLAGS` = 4096u;
public const val `FR_NOWRAPAROUND`: `FINDREPLACE_FLAGS` = 524288u;
public const val `FR_RAW`: `FINDREPLACE_FLAGS` = 131072u;
public const val `FR_REPLACE`: `FINDREPLACE_FLAGS` = 16u;
public const val `FR_REPLACEALL`: `FINDREPLACE_FLAGS` = 32u;
public const val `FR_SHOWHELP`: `FINDREPLACE_FLAGS` = 128u;
public const val `FR_SHOWWRAPAROUND`: `FINDREPLACE_FLAGS` = 262144u;
public const val `FR_WHOLEWORD`: `FINDREPLACE_FLAGS` = 2u;
public const val `FR_WRAPAROUND`: `FINDREPLACE_FLAGS` = 1048576u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `HELPMSGSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_help");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `HELPMSGSTRINGA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("commdlg_help");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `HELPMSGSTRINGW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_help");
public const val `ITALIC_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 512u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LBSELCHSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_LBSelChangedNotify");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LBSELCHSTRINGA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("commdlg_LBSelChangedNotify");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `LBSELCHSTRINGW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_LBSelChangedNotify");
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPCCHOOKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPCFHOOKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPFRHOOKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPOFNHOOKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPPAGEPAINTHOOK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPPAGESETUPHOOK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPPRINTHOOKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> ULong>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPSETUPHOOKPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`super`.`Foundation`.`HWND`, UInt, `super`.`super`.`super`.`Foundation`.`WPARAM`, `super`.`super`.`super`.`Foundation`.`LPARAM`) -> ULong>>>;
public const val `NUM_BASIC_COLORS`: UInt = 48u;
public const val `NUM_CUSTOM_COLORS`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFNOTIFYA` (
    public var `hdr`: `super`.`NMHDR`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEA`>?,
    public var `pszFile`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OFNOTIFYA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `OFNOTIFYA`.Companion.`default`() : `OFNOTIFYA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFNOTIFYA` (
    public var `hdr`: `super`.`NMHDR`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEA`>?,
    public var `pszFile`: `windows_sys`.`core`.`PSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OFNOTIFYA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `OFNOTIFYA`.Companion.`default`() : `OFNOTIFYA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFNOTIFYEXA` (
    public var `hdr`: `super`.`NMHDR`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEA`>?,
    public var `psf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pidl`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OFNOTIFYEXA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `OFNOTIFYEXA`.Companion.`default`() : `OFNOTIFYEXA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFNOTIFYEXA` (
    public var `hdr`: `super`.`NMHDR`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEA`>?,
    public var `psf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pidl`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OFNOTIFYEXA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `OFNOTIFYEXA`.Companion.`default`() : `OFNOTIFYEXA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFNOTIFYEXW` (
    public var `hdr`: `super`.`NMHDR`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEW`>?,
    public var `psf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pidl`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OFNOTIFYEXW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `OFNOTIFYEXW`.Companion.`default`() : `OFNOTIFYEXW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFNOTIFYEXW` (
    public var `hdr`: `super`.`NMHDR`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEW`>?,
    public var `psf`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `pidl`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OFNOTIFYEXW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `OFNOTIFYEXW`.Companion.`default`() : `OFNOTIFYEXW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFNOTIFYW` (
    public var `hdr`: `super`.`NMHDR`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEW`>?,
    public var `pszFile`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OFNOTIFYW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `OFNOTIFYW`.Companion.`default`() : `OFNOTIFYW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OFNOTIFYW` (
    public var `hdr`: `super`.`NMHDR`,
    public var `lpOFN`: /* Rust *mut */ kotlinx.cinterop.CPointer<`OPENFILENAMEW`>?,
    public var `pszFile`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OFNOTIFYW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `OFNOTIFYW`.Companion.`default`() : `OFNOTIFYW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `OFN_ALLOWMULTISELECT`: `OPEN_FILENAME_FLAGS` = 512u;
public const val `OFN_CREATEPROMPT`: `OPEN_FILENAME_FLAGS` = 8192u;
public const val `OFN_DONTADDTORECENT`: `OPEN_FILENAME_FLAGS` = 33554432u;
public const val `OFN_ENABLEHOOK`: `OPEN_FILENAME_FLAGS` = 32u;
public const val `OFN_ENABLEINCLUDENOTIFY`: `OPEN_FILENAME_FLAGS` = 4194304u;
public const val `OFN_ENABLESIZING`: `OPEN_FILENAME_FLAGS` = 8388608u;
public const val `OFN_ENABLETEMPLATE`: `OPEN_FILENAME_FLAGS` = 64u;
public const val `OFN_ENABLETEMPLATEHANDLE`: `OPEN_FILENAME_FLAGS` = 128u;
public const val `OFN_EXPLORER`: `OPEN_FILENAME_FLAGS` = 524288u;
public const val `OFN_EXTENSIONDIFFERENT`: `OPEN_FILENAME_FLAGS` = 1024u;
public const val `OFN_EX_NONE`: `OPEN_FILENAME_FLAGS_EX` = 0u;
public const val `OFN_EX_NOPLACESBAR`: `OPEN_FILENAME_FLAGS_EX` = 1u;
public const val `OFN_FILEMUSTEXIST`: `OPEN_FILENAME_FLAGS` = 4096u;
public const val `OFN_FORCESHOWHIDDEN`: `OPEN_FILENAME_FLAGS` = 268435456u;
public const val `OFN_HIDEREADONLY`: `OPEN_FILENAME_FLAGS` = 4u;
public const val `OFN_LONGNAMES`: `OPEN_FILENAME_FLAGS` = 2097152u;
public const val `OFN_NOCHANGEDIR`: `OPEN_FILENAME_FLAGS` = 8u;
public const val `OFN_NODEREFERENCELINKS`: `OPEN_FILENAME_FLAGS` = 1048576u;
public const val `OFN_NOLONGNAMES`: `OPEN_FILENAME_FLAGS` = 262144u;
public const val `OFN_NONETWORKBUTTON`: `OPEN_FILENAME_FLAGS` = 131072u;
public const val `OFN_NOREADONLYRETURN`: `OPEN_FILENAME_FLAGS` = 32768u;
public const val `OFN_NOTESTFILECREATE`: `OPEN_FILENAME_FLAGS` = 65536u;
public const val `OFN_NOVALIDATE`: `OPEN_FILENAME_FLAGS` = 256u;
public const val `OFN_OVERWRITEPROMPT`: `OPEN_FILENAME_FLAGS` = 2u;
public const val `OFN_PATHMUSTEXIST`: `OPEN_FILENAME_FLAGS` = 2048u;
public const val `OFN_READONLY`: `OPEN_FILENAME_FLAGS` = 1u;
public const val `OFN_SHAREAWARE`: `OPEN_FILENAME_FLAGS` = 16384u;
public const val `OFN_SHAREFALLTHROUGH`: UInt = 2u;
public const val `OFN_SHARENOWARN`: UInt = 1u;
public const val `OFN_SHAREWARN`: UInt = 0u;
public const val `OFN_SHOWHELP`: `OPEN_FILENAME_FLAGS` = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENFILENAMEA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpstrFilter`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrCustomFilter`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxCustFilter`: UInt,
    public var `nFilterIndex`: UInt,
    public var `lpstrFile`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxFile`: UInt,
    public var `lpstrFileTitle`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxFileTitle`: UInt,
    public var `lpstrInitialDir`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `Flags`: `OPEN_FILENAME_FLAGS`,
    public var `nFileOffset`: UShort,
    public var `nFileExtension`: UShort,
    public var `lpstrDefExt`: `windows_sys`.`core`.`PCSTR`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPOFNHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `pvReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwReserved`: UInt,
    public var `FlagsEx`: `OPEN_FILENAME_FLAGS_EX`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPENFILENAMEA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `OPENFILENAMEA`.Companion.`default`() : `OPENFILENAMEA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENFILENAMEA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpstrFilter`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrCustomFilter`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxCustFilter`: UInt,
    public var `nFilterIndex`: UInt,
    public var `lpstrFile`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxFile`: UInt,
    public var `lpstrFileTitle`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxFileTitle`: UInt,
    public var `lpstrInitialDir`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `Flags`: `OPEN_FILENAME_FLAGS`,
    public var `nFileOffset`: UShort,
    public var `nFileExtension`: UShort,
    public var `lpstrDefExt`: `windows_sys`.`core`.`PCSTR`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPOFNHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `pvReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwReserved`: UInt,
    public var `FlagsEx`: `OPEN_FILENAME_FLAGS_EX`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPENFILENAMEA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `OPENFILENAMEA`.Companion.`default`() : `OPENFILENAMEA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENFILENAMEW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpstrFilter`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrCustomFilter`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxCustFilter`: UInt,
    public var `nFilterIndex`: UInt,
    public var `lpstrFile`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxFile`: UInt,
    public var `lpstrFileTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxFileTitle`: UInt,
    public var `lpstrInitialDir`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `Flags`: `OPEN_FILENAME_FLAGS`,
    public var `nFileOffset`: UShort,
    public var `nFileExtension`: UShort,
    public var `lpstrDefExt`: `windows_sys`.`core`.`PCWSTR`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPOFNHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pvReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwReserved`: UInt,
    public var `FlagsEx`: `OPEN_FILENAME_FLAGS_EX`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPENFILENAMEW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `OPENFILENAMEW`.Companion.`default`() : `OPENFILENAMEW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENFILENAMEW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpstrFilter`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrCustomFilter`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxCustFilter`: UInt,
    public var `nFilterIndex`: UInt,
    public var `lpstrFile`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxFile`: UInt,
    public var `lpstrFileTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxFileTitle`: UInt,
    public var `lpstrInitialDir`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `Flags`: `OPEN_FILENAME_FLAGS`,
    public var `nFileOffset`: UShort,
    public var `nFileExtension`: UShort,
    public var `lpstrDefExt`: `windows_sys`.`core`.`PCWSTR`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPOFNHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pvReserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `dwReserved`: UInt,
    public var `FlagsEx`: `OPEN_FILENAME_FLAGS_EX`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPENFILENAMEW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `OPENFILENAMEW`.Companion.`default`() : `OPENFILENAMEW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENFILENAME_NT4A` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpstrFilter`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrCustomFilter`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxCustFilter`: UInt,
    public var `nFilterIndex`: UInt,
    public var `lpstrFile`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxFile`: UInt,
    public var `lpstrFileTitle`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxFileTitle`: UInt,
    public var `lpstrInitialDir`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `Flags`: UInt,
    public var `nFileOffset`: UShort,
    public var `nFileExtension`: UShort,
    public var `lpstrDefExt`: `windows_sys`.`core`.`PCSTR`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPOFNHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPENFILENAME_NT4A`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `OPENFILENAME_NT4A`.Companion.`default`() : `OPENFILENAME_NT4A` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENFILENAME_NT4A` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpstrFilter`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrCustomFilter`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxCustFilter`: UInt,
    public var `nFilterIndex`: UInt,
    public var `lpstrFile`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxFile`: UInt,
    public var `lpstrFileTitle`: `windows_sys`.`core`.`PSTR`,
    public var `nMaxFileTitle`: UInt,
    public var `lpstrInitialDir`: `windows_sys`.`core`.`PCSTR`,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCSTR`,
    public var `Flags`: UInt,
    public var `nFileOffset`: UShort,
    public var `nFileExtension`: UShort,
    public var `lpstrDefExt`: `windows_sys`.`core`.`PCSTR`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPOFNHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPENFILENAME_NT4A`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `OPENFILENAME_NT4A`.Companion.`default`() : `OPENFILENAME_NT4A` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENFILENAME_NT4W` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpstrFilter`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrCustomFilter`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxCustFilter`: UInt,
    public var `nFilterIndex`: UInt,
    public var `lpstrFile`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxFile`: UInt,
    public var `lpstrFileTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxFileTitle`: UInt,
    public var `lpstrInitialDir`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `Flags`: UInt,
    public var `nFileOffset`: UShort,
    public var `nFileExtension`: UShort,
    public var `lpstrDefExt`: `windows_sys`.`core`.`PCWSTR`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPOFNHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPENFILENAME_NT4W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `OPENFILENAME_NT4W`.Companion.`default`() : `OPENFILENAME_NT4W` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `OPENFILENAME_NT4W` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpstrFilter`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrCustomFilter`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxCustFilter`: UInt,
    public var `nFilterIndex`: UInt,
    public var `lpstrFile`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxFile`: UInt,
    public var `lpstrFileTitle`: `windows_sys`.`core`.`PWSTR`,
    public var `nMaxFileTitle`: UInt,
    public var `lpstrInitialDir`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpstrTitle`: `windows_sys`.`core`.`PCWSTR`,
    public var `Flags`: UInt,
    public var `nFileOffset`: UShort,
    public var `nFileExtension`: UShort,
    public var `lpstrDefExt`: `windows_sys`.`core`.`PCWSTR`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnHook`: `LPOFNHOOKPROC`,
    public var `lpTemplateName`: `windows_sys`.`core`.`PCWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `OPENFILENAME_NT4W`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `OPENFILENAME_NT4W`.Companion.`default`() : `OPENFILENAME_NT4W` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `OPEN_FILENAME_FLAGS` = UInt;
public typealias `OPEN_FILENAME_FLAGS_EX` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PAGESETUPDLGA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `Flags`: `PAGESETUPDLG_FLAGS`,
    public var `ptPaperSize`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `rtMinMargin`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `rtMargin`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnPageSetupHook`: `LPPAGESETUPHOOK`,
    public var `lpfnPagePaintHook`: `LPPAGEPAINTHOOK`,
    public var `lpPageSetupTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `hPageSetupTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PAGESETUPDLGA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `PAGESETUPDLGA`.Companion.`default`() : `PAGESETUPDLGA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PAGESETUPDLGA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `Flags`: `PAGESETUPDLG_FLAGS`,
    public var `ptPaperSize`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `rtMinMargin`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `rtMargin`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnPageSetupHook`: `LPPAGESETUPHOOK`,
    public var `lpfnPagePaintHook`: `LPPAGEPAINTHOOK`,
    public var `lpPageSetupTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `hPageSetupTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PAGESETUPDLGA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `PAGESETUPDLGA`.Companion.`default`() : `PAGESETUPDLGA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PAGESETUPDLGW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `Flags`: `PAGESETUPDLG_FLAGS`,
    public var `ptPaperSize`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `rtMinMargin`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `rtMargin`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnPageSetupHook`: `LPPAGESETUPHOOK`,
    public var `lpfnPagePaintHook`: `LPPAGEPAINTHOOK`,
    public var `lpPageSetupTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `hPageSetupTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PAGESETUPDLGW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `PAGESETUPDLGW`.Companion.`default`() : `PAGESETUPDLGW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PAGESETUPDLGW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `Flags`: `PAGESETUPDLG_FLAGS`,
    public var `ptPaperSize`: `super`.`super`.`super`.`Foundation`.`POINT`,
    public var `rtMinMargin`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `rtMargin`: `super`.`super`.`super`.`Foundation`.`RECT`,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnPageSetupHook`: `LPPAGESETUPHOOK`,
    public var `lpfnPagePaintHook`: `LPPAGEPAINTHOOK`,
    public var `lpPageSetupTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `hPageSetupTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PAGESETUPDLGW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `PAGESETUPDLGW`.Companion.`default`() : `PAGESETUPDLGW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PAGESETUPDLG_FLAGS` = UInt;
public const val `PDERR_CREATEICFAILURE`: `COMMON_DLG_ERRORS` = 4106u;
public const val `PDERR_DEFAULTDIFFERENT`: `COMMON_DLG_ERRORS` = 4108u;
public const val `PDERR_DNDMMISMATCH`: `COMMON_DLG_ERRORS` = 4105u;
public const val `PDERR_GETDEVMODEFAIL`: `COMMON_DLG_ERRORS` = 4101u;
public const val `PDERR_INITFAILURE`: `COMMON_DLG_ERRORS` = 4102u;
public const val `PDERR_LOADDRVFAILURE`: `COMMON_DLG_ERRORS` = 4100u;
public const val `PDERR_NODEFAULTPRN`: `COMMON_DLG_ERRORS` = 4104u;
public const val `PDERR_NODEVICES`: `COMMON_DLG_ERRORS` = 4103u;
public const val `PDERR_PARSEFAILURE`: `COMMON_DLG_ERRORS` = 4098u;
public const val `PDERR_PRINTERCODES`: `COMMON_DLG_ERRORS` = 4096u;
public const val `PDERR_PRINTERNOTFOUND`: `COMMON_DLG_ERRORS` = 4107u;
public const val `PDERR_RETDEFFAILURE`: `COMMON_DLG_ERRORS` = 4099u;
public const val `PDERR_SETUPFAILURE`: `COMMON_DLG_ERRORS` = 4097u;
public const val `PD_ALLPAGES`: `PRINTDLGEX_FLAGS` = 0u;
public const val `PD_COLLATE`: `PRINTDLGEX_FLAGS` = 16u;
public const val `PD_CURRENTPAGE`: `PRINTDLGEX_FLAGS` = 4194304u;
public const val `PD_DISABLEPRINTTOFILE`: `PRINTDLGEX_FLAGS` = 524288u;
public const val `PD_ENABLEPRINTHOOK`: `PRINTDLGEX_FLAGS` = 4096u;
public const val `PD_ENABLEPRINTTEMPLATE`: `PRINTDLGEX_FLAGS` = 16384u;
public const val `PD_ENABLEPRINTTEMPLATEHANDLE`: `PRINTDLGEX_FLAGS` = 65536u;
public const val `PD_ENABLESETUPHOOK`: `PRINTDLGEX_FLAGS` = 8192u;
public const val `PD_ENABLESETUPTEMPLATE`: `PRINTDLGEX_FLAGS` = 32768u;
public const val `PD_ENABLESETUPTEMPLATEHANDLE`: `PRINTDLGEX_FLAGS` = 131072u;
public const val `PD_EXCLUSIONFLAGS`: `PRINTDLGEX_FLAGS` = 16777216u;
public const val `PD_HIDEPRINTTOFILE`: `PRINTDLGEX_FLAGS` = 1048576u;
public const val `PD_NOCURRENTPAGE`: `PRINTDLGEX_FLAGS` = 8388608u;
public const val `PD_NONETWORKBUTTON`: `PRINTDLGEX_FLAGS` = 2097152u;
public const val `PD_NOPAGENUMS`: `PRINTDLGEX_FLAGS` = 8u;
public const val `PD_NOSELECTION`: `PRINTDLGEX_FLAGS` = 4u;
public const val `PD_NOWARNING`: `PRINTDLGEX_FLAGS` = 128u;
public const val `PD_PAGENUMS`: `PRINTDLGEX_FLAGS` = 2u;
public const val `PD_PRINTSETUP`: `PRINTDLGEX_FLAGS` = 64u;
public const val `PD_PRINTTOFILE`: `PRINTDLGEX_FLAGS` = 32u;
public const val `PD_RESULT_APPLY`: UInt = 2u;
public const val `PD_RESULT_CANCEL`: UInt = 0u;
public const val `PD_RESULT_PRINT`: UInt = 1u;
public const val `PD_RETURNDC`: `PRINTDLGEX_FLAGS` = 256u;
public const val `PD_RETURNDEFAULT`: `PRINTDLGEX_FLAGS` = 1024u;
public const val `PD_RETURNIC`: `PRINTDLGEX_FLAGS` = 512u;
public const val `PD_SELECTION`: `PRINTDLGEX_FLAGS` = 1u;
public const val `PD_SHOWHELP`: `PRINTDLGEX_FLAGS` = 2048u;
public const val `PD_USEDEVMODECOPIES`: `PRINTDLGEX_FLAGS` = 262144u;
public const val `PD_USEDEVMODECOPIESANDCOLLATE`: `PRINTDLGEX_FLAGS` = 262144u;
public const val `PD_USELARGETEMPLATE`: `PRINTDLGEX_FLAGS` = 268435456u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTDLGA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `Flags`: `PRINTDLGEX_FLAGS`,
    public var `nFromPage`: UShort,
    public var `nToPage`: UShort,
    public var `nMinPage`: UShort,
    public var `nMaxPage`: UShort,
    public var `nCopies`: UShort,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnPrintHook`: `LPPRINTHOOKPROC`,
    public var `lpfnSetupHook`: `LPSETUPHOOKPROC`,
    public var `lpPrintTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `lpSetupTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `hPrintTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hSetupTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRINTDLGA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `PRINTDLGA`.Companion.`default`() : `PRINTDLGA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTDLGA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `Flags`: `PRINTDLGEX_FLAGS`,
    public var `nFromPage`: UShort,
    public var `nToPage`: UShort,
    public var `nMinPage`: UShort,
    public var `nMaxPage`: UShort,
    public var `nCopies`: UShort,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnPrintHook`: `LPPRINTHOOKPROC`,
    public var `lpfnSetupHook`: `LPSETUPHOOKPROC`,
    public var `lpPrintTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `lpSetupTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `hPrintTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hSetupTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRINTDLGA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `PRINTDLGA`.Companion.`default`() : `PRINTDLGA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTDLGEXA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `Flags`: `PRINTDLGEX_FLAGS`,
    public var `Flags2`: UInt,
    public var `ExclusionFlags`: UInt,
    public var `nPageRanges`: UInt,
    public var `nMaxPageRanges`: UInt,
    public var `lpPageRanges`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTPAGERANGE`>?,
    public var `nMinPage`: UInt,
    public var `nMaxPage`: UInt,
    public var `nCopies`: UInt,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpPrintTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `lpCallback`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `nPropertyPages`: UInt,
    public var `lphPropertyPages`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HPROPSHEETPAGE`>?,
    public var `nStartPage`: UInt,
    public var `dwResultAction`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRINTDLGEXA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `PRINTDLGEXA`.Companion.`default`() : `PRINTDLGEXA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTDLGEXA` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `Flags`: `PRINTDLGEX_FLAGS`,
    public var `Flags2`: UInt,
    public var `ExclusionFlags`: UInt,
    public var `nPageRanges`: UInt,
    public var `nMaxPageRanges`: UInt,
    public var `lpPageRanges`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTPAGERANGE`>?,
    public var `nMinPage`: UInt,
    public var `nMaxPage`: UInt,
    public var `nCopies`: UInt,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpPrintTemplateName`: `windows_sys`.`core`.`PCSTR`,
    public var `lpCallback`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `nPropertyPages`: UInt,
    public var `lphPropertyPages`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HPROPSHEETPAGE`>?,
    public var `nStartPage`: UInt,
    public var `dwResultAction`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRINTDLGEXA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `PRINTDLGEXA`.Companion.`default`() : `PRINTDLGEXA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTDLGEXW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `Flags`: `PRINTDLGEX_FLAGS`,
    public var `Flags2`: UInt,
    public var `ExclusionFlags`: UInt,
    public var `nPageRanges`: UInt,
    public var `nMaxPageRanges`: UInt,
    public var `lpPageRanges`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTPAGERANGE`>?,
    public var `nMinPage`: UInt,
    public var `nMaxPage`: UInt,
    public var `nCopies`: UInt,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpPrintTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpCallback`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `nPropertyPages`: UInt,
    public var `lphPropertyPages`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HPROPSHEETPAGE`>?,
    public var `nStartPage`: UInt,
    public var `dwResultAction`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRINTDLGEXW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `PRINTDLGEXW`.Companion.`default`() : `PRINTDLGEXW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTDLGEXW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `Flags`: `PRINTDLGEX_FLAGS`,
    public var `Flags2`: UInt,
    public var `ExclusionFlags`: UInt,
    public var `nPageRanges`: UInt,
    public var `nMaxPageRanges`: UInt,
    public var `lpPageRanges`: /* Rust *mut */ kotlinx.cinterop.CPointer<`PRINTPAGERANGE`>?,
    public var `nMinPage`: UInt,
    public var `nMaxPage`: UInt,
    public var `nCopies`: UInt,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lpPrintTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpCallback`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `nPropertyPages`: UInt,
    public var `lphPropertyPages`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`HPROPSHEETPAGE`>?,
    public var `nStartPage`: UInt,
    public var `dwResultAction`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRINTDLGEXW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `PRINTDLGEXW`.Companion.`default`() : `PRINTDLGEXW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PRINTDLGEX_FLAGS` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTDLGW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `Flags`: `PRINTDLGEX_FLAGS`,
    public var `nFromPage`: UShort,
    public var `nToPage`: UShort,
    public var `nMinPage`: UShort,
    public var `nMaxPage`: UShort,
    public var `nCopies`: UShort,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnPrintHook`: `LPPRINTHOOKPROC`,
    public var `lpfnSetupHook`: `LPSETUPHOOKPROC`,
    public var `lpPrintTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpSetupTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `hPrintTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hSetupTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRINTDLGW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `PRINTDLGW`.Companion.`default`() : `PRINTDLGW` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRINTDLGW` (
    public var `lStructSize`: UInt,
    public var `hwndOwner`: `super`.`super`.`super`.`Foundation`.`HWND`,
    public var `hDevMode`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDevNames`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hDC`: `super`.`super`.`super`.`Graphics`.`Gdi`.`HDC`,
    public var `Flags`: `PRINTDLGEX_FLAGS`,
    public var `nFromPage`: UShort,
    public var `nToPage`: UShort,
    public var `nMinPage`: UShort,
    public var `nMaxPage`: UShort,
    public var `nCopies`: UShort,
    public var `hInstance`: `super`.`super`.`super`.`Foundation`.`HINSTANCE`,
    public var `lCustData`: `super`.`super`.`super`.`Foundation`.`LPARAM`,
    public var `lpfnPrintHook`: `LPPRINTHOOKPROC`,
    public var `lpfnSetupHook`: `LPSETUPHOOKPROC`,
    public var `lpPrintTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `lpSetupTemplateName`: `windows_sys`.`core`.`PCWSTR`,
    public var `hPrintTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
    public var `hSetupTemplate`: `super`.`super`.`super`.`Foundation`.`HGLOBAL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `PRINTDLGW`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]

    public fun `PRINTDLGW`.Companion.`default`() : `PRINTDLGW` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `PRINTER_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 16384u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTPAGERANGE` (
    public var `nFromPage`: UInt,
    public var `nToPage`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PRINTPAGERANGE` (
    public var `nFromPage`: UInt,
    public var `nToPage`: UInt,
)
public const val `PSD_DEFAULTMINMARGINS`: `PAGESETUPDLG_FLAGS` = 0u;
public const val `PSD_DISABLEMARGINS`: `PAGESETUPDLG_FLAGS` = 16u;
public const val `PSD_DISABLEORIENTATION`: `PAGESETUPDLG_FLAGS` = 256u;
public const val `PSD_DISABLEPAGEPAINTING`: `PAGESETUPDLG_FLAGS` = 524288u;
public const val `PSD_DISABLEPAPER`: `PAGESETUPDLG_FLAGS` = 512u;
public const val `PSD_DISABLEPRINTER`: `PAGESETUPDLG_FLAGS` = 32u;
public const val `PSD_ENABLEPAGEPAINTHOOK`: `PAGESETUPDLG_FLAGS` = 262144u;
public const val `PSD_ENABLEPAGESETUPHOOK`: `PAGESETUPDLG_FLAGS` = 8192u;
public const val `PSD_ENABLEPAGESETUPTEMPLATE`: `PAGESETUPDLG_FLAGS` = 32768u;
public const val `PSD_ENABLEPAGESETUPTEMPLATEHANDLE`: `PAGESETUPDLG_FLAGS` = 131072u;
public const val `PSD_INHUNDREDTHSOFMILLIMETERS`: `PAGESETUPDLG_FLAGS` = 8u;
public const val `PSD_INTHOUSANDTHSOFINCHES`: `PAGESETUPDLG_FLAGS` = 4u;
public const val `PSD_INWININIINTLMEASURE`: `PAGESETUPDLG_FLAGS` = 0u;
public const val `PSD_MARGINS`: `PAGESETUPDLG_FLAGS` = 2u;
public const val `PSD_MINMARGINS`: `PAGESETUPDLG_FLAGS` = 1u;
public const val `PSD_NONETWORKBUTTON`: `PAGESETUPDLG_FLAGS` = 2097152u;
public const val `PSD_NOWARNING`: `PAGESETUPDLG_FLAGS` = 128u;
public const val `PSD_RETURNDEFAULT`: `PAGESETUPDLG_FLAGS` = 1024u;
public const val `PSD_SHOWHELP`: `PAGESETUPDLG_FLAGS` = 2048u;
public const val `PS_OPENTYPE_FONTTYPE`: UInt = 65536u;
public const val `REGULAR_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 1024u;
public const val `SCREEN_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 8192u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SETRGBSTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_SetRGBColor");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SETRGBSTRINGA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("commdlg_SetRGBColor");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SETRGBSTRINGW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_SetRGBColor");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SHAREVISTRING`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_ShareViolation");
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SHAREVISTRINGA`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("commdlg_ShareViolation");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SHAREVISTRINGW`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("commdlg_ShareViolation");
public const val `SIMULATED_FONTTYPE`: `CHOOSEFONT_FONT_TYPE` = 32768u;
public const val `START_PAGE_GENERAL`: UInt = 4294967295u;
public const val `SYMBOL_FONTTYPE`: UInt = 524288u;
public const val `TT_OPENTYPE_FONTTYPE`: UInt = 131072u;
public const val `TYPE1_FONTTYPE`: UInt = 262144u;
public const val `WM_CHOOSEFONT_GETLOGFONT`: UInt = 1025u;
public const val `WM_CHOOSEFONT_SETFLAGS`: UInt = 1126u;
public const val `WM_CHOOSEFONT_SETLOGFONT`: UInt = 1125u;
public const val `WM_PSD_ENVSTAMPRECT`: UInt = 1029u;
public const val `WM_PSD_FULLPAGERECT`: UInt = 1025u;
public const val `WM_PSD_GREEKTEXTRECT`: UInt = 1028u;
public const val `WM_PSD_MARGINRECT`: UInt = 1027u;
public const val `WM_PSD_MINMARGINRECT`: UInt = 1026u;
public const val `WM_PSD_YAFULLPAGERECT`: UInt = 1030u;
