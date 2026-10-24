// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hhctrl.ocx, ABI=system, export=HtmlHelpA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HtmlHelpA`(`hwndcaller` : `super`.`super`.`Foundation`.`HWND`, `pszfile` : `windows_sys`.`core`.`PCSTR`, `ucommand` : UInt, `dwdata` : ULong) : `super`.`super`.`Foundation`.`HWND`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=hhctrl.ocx, ABI=system, export=HtmlHelpW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HtmlHelpW`(`hwndcaller` : `super`.`super`.`Foundation`.`HWND`, `pszfile` : `windows_sys`.`core`.`PCWSTR`, `ucommand` : UInt, `dwdata` : ULong) : `super`.`super`.`Foundation`.`HWND`
// UNSUPPORTED Rust 3:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITCmdInt: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4662daa2_d393_11d0_9a56_00c04fb68bf7);

// UNSUPPORTED Rust 4:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITDatabase: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66673452_8c23_11d0_a84e_00aa006c7d01);

// UNSUPPORTED Rust 5:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITDatabaseLocal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4662daa9_d393_11d0_9a56_00c04fb68bf7);

// UNSUPPORTED Rust 6:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITGroupUpdate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4662daa4_d393_11d0_9a56_00c04fb68bf7);

// UNSUPPORTED Rust 7:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITIndexBuild: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fa0d5aa_dedf_11d0_9a61_00c04fb68bf7);

// UNSUPPORTED Rust 8:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITPropList: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4662daae_d393_11d0_9a56_00c04fb68bf7);

// UNSUPPORTED Rust 9:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITResultSet: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4662daa7_d393_11d0_9a56_00c04fb68bf7);

// UNSUPPORTED Rust 10:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITSvMgr: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4662daa3_d393_11d0_9a56_00c04fb68bf7);

// UNSUPPORTED Rust 11:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITWWFilterBuild: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fa0d5ab_dedf_11d0_9a61_00c04fb68bf7);

// UNSUPPORTED Rust 12:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITWordWheel: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd73725c2_8c12_11d0_a84e_00aa006c7d01);

// UNSUPPORTED Rust 13:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITWordWheelLocal: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4662daa8_d393_11d0_9a56_00c04fb68bf7);

// UNSUPPORTED Rust 14:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_IITWordWheelUpdate: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4662daa5_d393_11d0_9a56_00c04fb68bf7);

// UNSUPPORTED Rust 15:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_ITEngStemmer: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8fa0d5a8_dedf_11d0_9a61_00c04fb68bf7);

// UNSUPPORTED Rust 16:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const CLSID_ITStdBreaker: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x4662daaf_d393_11d0_9a56_00c04fb68bf7);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `COLUMNSTATUS` (
    public var `cPropCount`: Int,
    public var `cPropsLoaded`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CProperty` (
    public var `dwPropID`: UInt,
    public var `cbData`: UInt,
    public var `dwType`: UInt,
    public var `Anonymous`: `CProperty_0`,
    public var `fPersist`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 32:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CProperty {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 37:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CProperty_0 {
//     pub lpszwData: windows_sys::core::PWSTR,
//     pub lpvData: *mut core::ffi::c_void,
//     pub dwValue: u32,
// }

// UNSUPPORTED Rust 44:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CProperty_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `E_ALL_WILD`: Int = -2147479467;
public const val `E_ALREADYINIT`: Int = -2147479421;
public const val `E_ALREADYOPEN`: Int = -2147479533;
public const val `E_ASSERT`: Int = -2147479546;
public const val `E_BADBREAKER`: Int = -2147479469;
public const val `E_BADFILE`: Int = -2147479549;
public const val `E_BADFILTERSIZE`: Int = -2147479528;
public const val `E_BADFORMAT`: Int = -2147479548;
public const val `E_BADINDEXFLAGS`: Int = -2147479456;
public const val `E_BADPARAM`: Int = -2147479535;
public const val `E_BADRANGEOP`: Int = -2147479459;
public const val `E_BADVALUE`: Int = -2147479468;
public const val `E_BADVERSION`: Int = -2147479550;
public const val `E_CANTFINDDLL`: Int = -2147479538;
public const val `E_DISKFULL`: Int = -2147479496;
public const val `E_DUPLICATE`: Int = -2147479551;
public const val `E_EXPECTEDTERM`: Int = -2147479465;
public const val `E_FILECLOSE`: Int = -2147479503;
public const val `E_FILECREATE`: Int = -2147479504;
public const val `E_FILEDELETE`: Int = -2147479499;
public const val `E_FILEINVALID`: Int = -2147479498;
public const val `E_FILENOTFOUND`: Int = -2147479497;
public const val `E_FILEREAD`: Int = -2147479502;
public const val `E_FILESEEK`: Int = -2147479501;
public const val `E_FILEWRITE`: Int = -2147479500;
public const val `E_GETLASTERROR`: Int = -2147479536;
public const val `E_GROUPIDTOOBIG`: Int = -2147479542;
public const val `E_INTERRUPT`: Int = -2147479545;
public const val `E_INVALIDSTATE`: Int = -2147479534;
public const val `E_MISSINGPROP`: Int = -2147479424;
public const val `E_MISSLPAREN`: Int = -2147479464;
public const val `E_MISSQUOTE`: Int = -2147479462;
public const val `E_MISSRPAREN`: Int = -2147479463;
public const val `E_NAMETOOLONG`: Int = -2147479520;
public const val `E_NOHANDLE`: Int = -2147479537;
public const val `E_NOKEYPROP`: Int = -2147479417;
public const val `E_NOMERGEDDATA`: Int = -2147479540;
public const val `E_NOPERMISSION`: Int = -2147479547;
public const val `E_NOSTEMMER`: Int = -2147479454;
public const val `E_NOTEXIST`: Int = -2147479552;
public const val `E_NOTFOUND`: Int = -2147479539;
public const val `E_NOTINIT`: Int = -2147479420;
public const val `E_NOTOPEN`: Int = -2147479533;
public const val `E_NOTSUPPORTED`: Int = -2147479544;
public const val `E_NULLQUERY`: Int = -2147479461;
public const val `E_OUTOFRANGE`: Int = -2147479543;
public const val `E_PROPLISTEMPTY`: Int = -2147479422;
public const val `E_PROPLISTNOTEMPTY`: Int = -2147479423;
public const val `E_RESULTSETEMPTY`: Int = -2147479419;
public const val `E_STOPWORD`: Int = -2147479460;
public const val `E_TOODEEP`: Int = -2147479466;
public const val `E_TOOMANYCOLUMNS`: Int = -2147479418;
public const val `E_TOOMANYDUPS`: Int = -2147479471;
public const val `E_TOOMANYOBJECTS`: Int = -2147479527;
public const val `E_TOOMANYTITLES`: Int = -2147479541;
public const val `E_TOOMANYTOPICS`: Int = -2147479472;
public const val `E_TREETOOBIG`: Int = -2147479470;
public const val `E_UNKNOWN_TRANSPORT`: Int = -2147479530;
public const val `E_UNMATCHEDTYPE`: Int = -2147479458;
public const val `E_UNSUPPORTED_TRANSPORT`: Int = -2147479529;
public const val `E_WILD_IN_DTYPE`: Int = -2147479455;
public const val `E_WORDTOOLONG`: Int = -2147479457;
public const val `HHACT_BACK`: Int = 7;
public const val `HHACT_CONTRACT`: Int = 6;
public const val `HHACT_CUSTOMIZE`: Int = 16;
public const val `HHACT_EXPAND`: Int = 5;
public const val `HHACT_FORWARD`: Int = 8;
public const val `HHACT_HIGHLIGHT`: Int = 15;
public const val `HHACT_HOME`: Int = 11;
public const val `HHACT_JUMP1`: Int = 17;
public const val `HHACT_JUMP2`: Int = 18;
public const val `HHACT_LAST_ENUM`: Int = 23;
public const val `HHACT_NOTES`: Int = 22;
public const val `HHACT_OPTIONS`: Int = 13;
public const val `HHACT_PRINT`: Int = 14;
public const val `HHACT_REFRESH`: Int = 10;
public const val `HHACT_STOP`: Int = 9;
public const val `HHACT_SYNC`: Int = 12;
public const val `HHACT_TAB_CONTENTS`: Int = 0;
public const val `HHACT_TAB_FAVORITES`: Int = 4;
public const val `HHACT_TAB_HISTORY`: Int = 3;
public const val `HHACT_TAB_INDEX`: Int = 1;
public const val `HHACT_TAB_SEARCH`: Int = 2;
public const val `HHACT_TOC_NEXT`: Int = 20;
public const val `HHACT_TOC_PREV`: Int = 21;
public const val `HHACT_ZOOM`: Int = 19;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HHNTRACK` (
    public var `hdr`: `super`.`super`.`UI`.`Controls`.`NMHDR`,
    public var `pszCurUrl`: `windows_sys`.`core`.`PCSTR`,
    public var `idAction`: Int,
    public var `phhWinType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HH_WINTYPE`>?,
)
// UNSUPPORTED Rust 144:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_Controls")]
// impl Default for HHNTRACK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HHN_FIRST`: UInt = 4294966436u;
public const val `HHN_LAST`: UInt = 4294966417u;
public const val `HHN_NAVCOMPLETE`: UInt = 4294966436u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_Controls")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HHN_NOTIFY` (
    public var `hdr`: `super`.`super`.`UI`.`Controls`.`NMHDR`,
    public var `pszUrl`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 160:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_UI_Controls")]
// impl Default for HHN_NOTIFY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HHN_TRACK`: UInt = 4294966435u;
public const val `HHN_WINDOW_CREATE`: UInt = 4294966434u;
public const val `HHWIN_BUTTON_BACK`: UInt = 4u;
public const val `HHWIN_BUTTON_BROWSE_BCK`: UInt = 256u;
public const val `HHWIN_BUTTON_BROWSE_FWD`: UInt = 128u;
public const val `HHWIN_BUTTON_CONTENTS`: UInt = 1024u;
public const val `HHWIN_BUTTON_EXPAND`: UInt = 2u;
public const val `HHWIN_BUTTON_FAVORITES`: UInt = 131072u;
public const val `HHWIN_BUTTON_FORWARD`: UInt = 8u;
public const val `HHWIN_BUTTON_HISTORY`: UInt = 65536u;
public const val `HHWIN_BUTTON_HOME`: UInt = 64u;
public const val `HHWIN_BUTTON_INDEX`: UInt = 16384u;
public const val `HHWIN_BUTTON_JUMP1`: UInt = 262144u;
public const val `HHWIN_BUTTON_JUMP2`: UInt = 524288u;
public const val `HHWIN_BUTTON_NOTES`: UInt = 512u;
public const val `HHWIN_BUTTON_OPTIONS`: UInt = 4096u;
public const val `HHWIN_BUTTON_PRINT`: UInt = 8192u;
public const val `HHWIN_BUTTON_REFRESH`: UInt = 32u;
public const val `HHWIN_BUTTON_SEARCH`: UInt = 32768u;
public const val `HHWIN_BUTTON_STOP`: UInt = 16u;
public const val `HHWIN_BUTTON_SYNC`: UInt = 2048u;
public const val `HHWIN_BUTTON_TOC_NEXT`: UInt = 2097152u;
public const val `HHWIN_BUTTON_TOC_PREV`: UInt = 4194304u;
public const val `HHWIN_BUTTON_ZOOM`: UInt = 1048576u;
public const val `HHWIN_NAVTAB_BOTTOM`: Int = 2;
public const val `HHWIN_NAVTAB_LEFT`: Int = 1;
public const val `HHWIN_NAVTAB_TOP`: Int = 0;
public const val `HHWIN_NAVTYPE_AUTHOR`: Int = 5;
public const val `HHWIN_NAVTYPE_CUSTOM_FIRST`: Int = 11;
public const val `HHWIN_NAVTYPE_FAVORITES`: Int = 3;
public const val `HHWIN_NAVTYPE_HISTORY`: Int = 4;
public const val `HHWIN_NAVTYPE_INDEX`: Int = 1;
public const val `HHWIN_NAVTYPE_SEARCH`: Int = 2;
public const val `HHWIN_NAVTYPE_TOC`: Int = 0;
public const val `HHWIN_PARAM_CUR_TAB`: UInt = 8192u;
public const val `HHWIN_PARAM_EXPANSION`: UInt = 512u;
public const val `HHWIN_PARAM_EXSTYLES`: UInt = 8u;
public const val `HHWIN_PARAM_HISTORY_COUNT`: UInt = 4096u;
public const val `HHWIN_PARAM_INFOTYPES`: UInt = 128u;
public const val `HHWIN_PARAM_NAV_WIDTH`: UInt = 32u;
public const val `HHWIN_PARAM_PROPERTIES`: UInt = 2u;
public const val `HHWIN_PARAM_RECT`: UInt = 16u;
public const val `HHWIN_PARAM_SHOWSTATE`: UInt = 64u;
public const val `HHWIN_PARAM_STYLES`: UInt = 4u;
public const val `HHWIN_PARAM_TABORDER`: UInt = 2048u;
public const val `HHWIN_PARAM_TABPOS`: UInt = 1024u;
public const val `HHWIN_PARAM_TB_FLAGS`: UInt = 256u;
public const val `HHWIN_PROP_AUTO_SYNC`: UInt = 256u;
public const val `HHWIN_PROP_CHANGE_TITLE`: UInt = 8192u;
public const val `HHWIN_PROP_MENU`: UInt = 65536u;
public const val `HHWIN_PROP_NAV_ONLY_WIN`: UInt = 16384u;
public const val `HHWIN_PROP_NODEF_EXSTYLES`: UInt = 16u;
public const val `HHWIN_PROP_NODEF_STYLES`: UInt = 8u;
public const val `HHWIN_PROP_NOTB_TEXT`: UInt = 64u;
public const val `HHWIN_PROP_NOTITLEBAR`: UInt = 4u;
public const val `HHWIN_PROP_NO_TOOLBAR`: UInt = 32768u;
public const val `HHWIN_PROP_ONTOP`: UInt = 2u;
public const val `HHWIN_PROP_POST_QUIT`: UInt = 128u;
public const val `HHWIN_PROP_TAB_ADVSEARCH`: UInt = 131072u;
public const val `HHWIN_PROP_TAB_AUTOHIDESHOW`: UInt = 1u;
public const val `HHWIN_PROP_TAB_CUSTOM1`: UInt = 524288u;
public const val `HHWIN_PROP_TAB_CUSTOM2`: UInt = 1048576u;
public const val `HHWIN_PROP_TAB_CUSTOM3`: UInt = 2097152u;
public const val `HHWIN_PROP_TAB_CUSTOM4`: UInt = 4194304u;
public const val `HHWIN_PROP_TAB_CUSTOM5`: UInt = 8388608u;
public const val `HHWIN_PROP_TAB_CUSTOM6`: UInt = 16777216u;
public const val `HHWIN_PROP_TAB_CUSTOM7`: UInt = 33554432u;
public const val `HHWIN_PROP_TAB_CUSTOM8`: UInt = 67108864u;
public const val `HHWIN_PROP_TAB_CUSTOM9`: UInt = 134217728u;
public const val `HHWIN_PROP_TAB_FAVORITES`: UInt = 4096u;
public const val `HHWIN_PROP_TAB_HISTORY`: UInt = 2048u;
public const val `HHWIN_PROP_TAB_SEARCH`: UInt = 1024u;
public const val `HHWIN_PROP_TRACKING`: UInt = 512u;
public const val `HHWIN_PROP_TRI_PANE`: UInt = 32u;
public const val `HHWIN_PROP_USER_POS`: UInt = 262144u;
public const val `HHWIN_TB_MARGIN`: UInt = 268435456u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HH_AKLINK` (
    public var `cbStruct`: Int,
    public var `fReserved`: `windows_sys`.`core`.`BOOL`,
    public var `pszKeywords`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszUrl`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszMsgText`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszMsgTitle`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszWindow`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `fIndexOnFail`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 254:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HH_AKLINK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HH_ALINK_LOOKUP`: `HTML_HELP_COMMAND` = 19;
public const val `HH_CLOSE_ALL`: `HTML_HELP_COMMAND` = 18;
public const val `HH_DISPLAY_INDEX`: `HTML_HELP_COMMAND` = 2;
public const val `HH_DISPLAY_SEARCH`: `HTML_HELP_COMMAND` = 3;
public const val `HH_DISPLAY_TEXT_POPUP`: `HTML_HELP_COMMAND` = 14;
public const val `HH_DISPLAY_TOC`: `HTML_HELP_COMMAND` = 1;
public const val `HH_DISPLAY_TOPIC`: `HTML_HELP_COMMAND` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HH_ENUM_CAT` (
    public var `cbStruct`: Int,
    public var `pszCatName`: `windows_sys`.`core`.`PCSTR`,
    public var `pszCatDescription`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HH_ENUM_CAT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HH_ENUM_CATEGORY`: `HTML_HELP_COMMAND` = 21;
public const val `HH_ENUM_CATEGORY_IT`: `HTML_HELP_COMMAND` = 22;
public const val `HH_ENUM_INFO_TYPE`: `HTML_HELP_COMMAND` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HH_ENUM_IT` (
    public var `cbStruct`: Int,
    public var `iType`: Int,
    public var `pszCatName`: `windows_sys`.`core`.`PCSTR`,
    public var `pszITName`: `windows_sys`.`core`.`PCSTR`,
    public var `pszITDescription`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 290:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HH_ENUM_IT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HH_FTS_DEFAULT_PROXIMITY`: `HTML_HELP_COMMAND` = -1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HH_FTS_QUERY` (
    public var `cbStruct`: Int,
    public var `fUniCodeStrings`: `windows_sys`.`core`.`BOOL`,
    public var `pszSearchQuery`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `iProximity`: Int,
    public var `fStemmedSearch`: `windows_sys`.`core`.`BOOL`,
    public var `fTitleOnly`: `windows_sys`.`core`.`BOOL`,
    public var `fExecute`: `windows_sys`.`core`.`BOOL`,
    public var `pszWindow`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 308:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HH_FTS_QUERY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HH_GET_LAST_ERROR`: `HTML_HELP_COMMAND` = 20;
public const val `HH_GET_WIN_HANDLE`: `HTML_HELP_COMMAND` = 6;
public const val `HH_GET_WIN_TYPE`: `HTML_HELP_COMMAND` = 5;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HH_GLOBAL_PROPERTY` (
    public var `id`: `HH_GPROPID`,
    public var `var`: `super`.`super`.`System`.`Variant`.`VARIANT`,
)
// UNSUPPORTED Rust 323:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(all(feature = "Win32_System_Com", feature = "Win32_System_Ole", feature = "Win32_System_Variant"))]
// impl Default for HH_GLOBAL_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HH_GPROPID` = Int;
public const val `HH_GPROPID_CONTENT_LANGUAGE`: `HH_GPROPID` = 5;
public const val `HH_GPROPID_CURRENT_SUBSET`: `HH_GPROPID` = 4;
public const val `HH_GPROPID_SINGLETHREAD`: `HH_GPROPID` = 1;
public const val `HH_GPROPID_TOOLBAR_MARGIN`: `HH_GPROPID` = 2;
public const val `HH_GPROPID_UI_LANGUAGE`: `HH_GPROPID` = 3;
public const val `HH_HELP_CONTEXT`: `HTML_HELP_COMMAND` = 15;
public const val `HH_HELP_FINDER`: `HTML_HELP_COMMAND` = 0;
public const val `HH_INITIALIZE`: `HTML_HELP_COMMAND` = 28;
public const val `HH_KEYWORD_LOOKUP`: `HTML_HELP_COMMAND` = 13;
public const val `HH_MAX_TABS`: `HTML_HELP_COMMAND` = 19;
public const val `HH_MAX_TABS_CUSTOM`: `HTML_HELP_COMMAND` = 9;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HH_POPUP` (
    public var `cbStruct`: Int,
    public var `hinst`: `super`.`super`.`Foundation`.`HINSTANCE`,
    public var `idString`: UInt,
    public var `pszText`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pt`: `super`.`super`.`Foundation`.`POINT`,
    public var `clrForeground`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `clrBackground`: `super`.`super`.`Foundation`.`COLORREF`,
    public var `rcMargins`: `super`.`super`.`Foundation`.`RECT`,
    public var `pszFont`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 354:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HH_POPUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HH_PRETRANSLATEMESSAGE`: `HTML_HELP_COMMAND` = 253;
public const val `HH_RESERVED1`: `HTML_HELP_COMMAND` = 10;
public const val `HH_RESERVED2`: `HTML_HELP_COMMAND` = 11;
public const val `HH_RESERVED3`: `HTML_HELP_COMMAND` = 12;
public const val `HH_RESET_IT_FILTER`: `HTML_HELP_COMMAND` = 23;
public const val `HH_SAFE_DISPLAY_TOPIC`: `HTML_HELP_COMMAND` = 32;
public const val `HH_SET_EXCLUSIVE_FILTER`: `HTML_HELP_COMMAND` = 25;
public const val `HH_SET_GLOBAL_PROPERTY`: `HTML_HELP_COMMAND` = 252;
public const val `HH_SET_INCLUSIVE_FILTER`: `HTML_HELP_COMMAND` = 24;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HH_SET_INFOTYPE` (
    public var `cbStruct`: Int,
    public var `pszCatName`: `windows_sys`.`core`.`PCSTR`,
    public var `pszInfoTypeName`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 375:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HH_SET_INFOTYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HH_SET_INFO_TYPE`: `HTML_HELP_COMMAND` = 8;
public const val `HH_SET_QUERYSERVICE`: `HTML_HELP_COMMAND` = 30;
public const val `HH_SET_WIN_TYPE`: `HTML_HELP_COMMAND` = 4;
public const val `HH_SYNC`: `HTML_HELP_COMMAND` = 9;
public const val `HH_TAB_AUTHOR`: Int = 5;
public const val `HH_TAB_CONTENTS`: Int = 0;
public const val `HH_TAB_CUSTOM_FIRST`: Int = 11;
public const val `HH_TAB_CUSTOM_LAST`: Int = 19;
public const val `HH_TAB_FAVORITES`: Int = 3;
public const val `HH_TAB_HISTORY`: Int = 4;
public const val `HH_TAB_INDEX`: Int = 1;
public const val `HH_TAB_SEARCH`: Int = 2;
public const val `HH_TP_HELP_CONTEXTMENU`: `HTML_HELP_COMMAND` = 16;
public const val `HH_TP_HELP_WM_HELP`: `HTML_HELP_COMMAND` = 17;
public const val `HH_UNINITIALIZE`: `HTML_HELP_COMMAND` = 29;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HH_WINTYPE` (
    public var `cbStruct`: Int,
    public var `fUniCodeStrings`: `windows_sys`.`core`.`BOOL`,
    public var `pszType`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `fsValidMembers`: UInt,
    public var `fsWinProperties`: UInt,
    public var `pszCaption`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `dwStyles`: UInt,
    public var `dwExStyles`: UInt,
    public var `rcWindowPos`: `super`.`super`.`Foundation`.`RECT`,
    public var `nShowState`: Int,
    public var `hwndHelp`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndCaller`: `super`.`super`.`Foundation`.`HWND`,
    public var `paInfoTypes`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `hwndToolBar`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndNavigation`: `super`.`super`.`Foundation`.`HWND`,
    public var `hwndHTML`: `super`.`super`.`Foundation`.`HWND`,
    public var `iNavWidth`: Int,
    public var `rcHTML`: `super`.`super`.`Foundation`.`RECT`,
    public var `pszToc`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszIndex`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszFile`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszHome`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `fsToolBarFlags`: UInt,
    public var `fNotExpanded`: `windows_sys`.`core`.`BOOL`,
    public var `curNavType`: Int,
    public var `tabpos`: Int,
    public var `idNotify`: Int,
    public var `tabOrder`: UByteArray,
    public var `cHistory`: Int,
    public var `pszJump1`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszJump2`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszUrlJump1`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `pszUrlJump2`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
    public var `rcMinSize`: `super`.`super`.`Foundation`.`RECT`,
    public var `cbInfoTypes`: Int,
    public var `pszCustomTabs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVar>?,
)
// UNSUPPORTED Rust 435:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HH_WINTYPE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `HTML_HELP_COMMAND` = Int;
public const val `IDTB_BACK`: UInt = 204u;
public const val `IDTB_BROWSE_BACK`: UInt = 212u;
public const val `IDTB_BROWSE_FWD`: UInt = 211u;
public const val `IDTB_CONTENTS`: UInt = 213u;
public const val `IDTB_CONTRACT`: UInt = 201u;
public const val `IDTB_CUSTOMIZE`: UInt = 221u;
public const val `IDTB_EXPAND`: UInt = 200u;
public const val `IDTB_FAVORITES`: UInt = 217u;
public const val `IDTB_FORWARD`: UInt = 209u;
public const val `IDTB_HISTORY`: UInt = 216u;
public const val `IDTB_HOME`: UInt = 205u;
public const val `IDTB_INDEX`: UInt = 214u;
public const val `IDTB_JUMP1`: UInt = 218u;
public const val `IDTB_JUMP2`: UInt = 219u;
public const val `IDTB_NOTES`: UInt = 210u;
public const val `IDTB_OPTIONS`: UInt = 208u;
public const val `IDTB_PRINT`: UInt = 207u;
public const val `IDTB_REFRESH`: UInt = 203u;
public const val `IDTB_SEARCH`: UInt = 215u;
public const val `IDTB_STOP`: UInt = 202u;
public const val `IDTB_SYNC`: UInt = 206u;
public const val `IDTB_TOC_NEXT`: UInt = 223u;
public const val `IDTB_TOC_PREV`: UInt = 224u;
public const val `IDTB_ZOOM`: UInt = 222u;
public const val `IITWBC_BREAK_ACCEPT_WILDCARDS`: UInt = 1u;
public const val `IITWBC_BREAK_AND_STEM`: UInt = 2u;
public const val `ITWW_CBKEY_MAX`: UInt = 1024u;
public const val `ITWW_OPEN_NOCONNECT`: UInt = 1u;
public const val `IT_EXCLUSIVE`: Int = 1;
public const val `IT_HIDDEN`: Int = 2;
public const val `IT_INCLUSIVE`: Int = 0;
public const val `MAX_COLUMNS`: UInt = 256u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNCOLHEAPFREE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
public typealias `PRIORITY` = Int;
public const val `PRIORITY_HIGH`: `PRIORITY` = 2;
public const val `PRIORITY_LOW`: `PRIORITY` = 0;
public const val `PRIORITY_NORMAL`: `PRIORITY` = 1;
public const val `PROP_ADD`: UInt = 0u;
public const val `PROP_DELETE`: UInt = 1u;
public const val `PROP_UPDATE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ROWSTATUS` (
    public var `lRowFirst`: Int,
    public var `cRows`: Int,
    public var `cProperties`: Int,
    public var `cRowsTotal`: Int,
)
public const val `STDPROP_DISPLAYKEY`: UInt = 101u;
public const val `STDPROP_INDEX_BREAK`: UInt = 204u;
public const val `STDPROP_INDEX_DTYPE`: UInt = 202u;
public const val `STDPROP_INDEX_LENGTH`: UInt = 203u;
public const val `STDPROP_INDEX_TERM`: UInt = 210u;
public const val `STDPROP_INDEX_TERM_RAW_LENGTH`: UInt = 211u;
public const val `STDPROP_INDEX_TEXT`: UInt = 200u;
public const val `STDPROP_INDEX_VFLD`: UInt = 201u;
public const val `STDPROP_KEY`: UInt = 4u;
public const val `STDPROP_SORTKEY`: UInt = 100u;
public const val `STDPROP_SORTORDINAL`: UInt = 102u;
public const val `STDPROP_TITLE`: UInt = 2u;
public const val `STDPROP_UID`: UInt = 1u;
public const val `STDPROP_USERDATA`: UInt = 3u;
public const val `STDPROP_USERPROP_BASE`: UInt = 65536u;
public const val `STDPROP_USERPROP_MAX`: UInt = 2147483647u;
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZ_WWDEST_GLOBAL`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("GLOBAL");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZ_WWDEST_KEY`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("KEY");
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `SZ_WWDEST_OCC`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("OCC");
public const val `TYPE_POINTER`: UInt = 1u;
public const val `TYPE_STRING`: UInt = 2u;
public const val `TYPE_VALUE`: UInt = 0u;
