// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn BuildDisplayTable(lpallocatebuffer : LPALLOCATEBUFFER, lpallocatemore : LPALLOCATEMORE, lpfreebuffer : LPFREEBUFFER, lpmalloc : * mut core::ffi::c_void, hinstance : super::super::Foundation:: HINSTANCE, cpages : u32, lppage : *mut DTPAGE, ulflags : u32, lpptable : *mut * mut core::ffi::c_void, lpptbldata : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn ChangeIdleRoutine(ftg : *mut core::ffi::c_void, lpfnidle : PFNIDLE, lpvidleparam : *mut core::ffi::c_void, priidle : i16, csecidle : u32, iroidle : u16, ircidle : u16));

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn CreateIProp(lpinterface : *mut windows_sys::core::GUID, lpallocatebuffer : LPALLOCATEBUFFER, lpallocatemore : LPALLOCATEMORE, lpfreebuffer : LPFREEBUFFER, lpvreserved : *mut core::ffi::c_void, lpppropdata : *mut * mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("rtm.dll" "system" fn CreateTable(lpinterface : *mut windows_sys::core::GUID, lpallocatebuffer : LPALLOCATEBUFFER, lpallocatemore : LPALLOCATEMORE, lpfreebuffer : LPFREEBUFFER, lpvreserved : *mut core::ffi::c_void, ultabletype : u32, ulproptagindexcolumn : u32, lpsproptagarraycolumns : *mut SPropTagArray, lpptabledata : *mut * mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn DeinitMapiUtil());

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn DeregisterIdleRoutine(ftg : *mut core::ffi::c_void));

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn EnableIdleRoutine(ftg : *mut core::ffi::c_void, fenable : windows_sys::core::BOOL));

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn FEqualNames(lpname1 : *mut MAPINAMEID, lpname2 : *mut MAPINAMEID) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn FPropCompareProp(lpspropvalue1 : *mut SPropValue, ulrelop : u32, lpspropvalue2 : *mut SPropValue) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn FPropContainsProp(lpspropvaluedst : *mut SPropValue, lpspropvaluesrc : *mut SPropValue, ulfuzzylevel : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn FPropExists(lpmapiprop : * mut core::ffi::c_void, ulproptag : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn FreePadrlist(lpadrlist : *mut ADRLIST));

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn FreeProws(lprows : *mut SRowSet));

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn FtAddFt(ftaddend1 : super::super::Foundation:: FILETIME, ftaddend2 : super::super::Foundation:: FILETIME) -> super::super::Foundation:: FILETIME);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn FtMulDw(ftmultiplier : u32, ftmultiplicand : super::super::Foundation:: FILETIME) -> super::super::Foundation:: FILETIME);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn FtMulDwDw(ftmultiplicand : u32, ftmultiplier : u32) -> super::super::Foundation:: FILETIME);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn FtNegFt(ft : super::super::Foundation:: FILETIME) -> super::super::Foundation:: FILETIME);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn FtSubFt(ftminuend : super::super::Foundation:: FILETIME, ftsubtrahend : super::super::Foundation:: FILETIME) -> super::super::Foundation:: FILETIME);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn FtgRegisterIdleRoutine(lpfnidle : PFNIDLE, lpvidleparam : *mut core::ffi::c_void, priidle : i16, csecidle : u32, iroidle : u16) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn HrAddColumns(lptbl : * mut core::ffi::c_void, lpproptagcolumnsnew : *mut SPropTagArray, lpallocatebuffer : LPALLOCATEBUFFER, lpfreebuffer : LPFREEBUFFER) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn HrAddColumnsEx(lptbl : * mut core::ffi::c_void, lpproptagcolumnsnew : *mut SPropTagArray, lpallocatebuffer : LPALLOCATEBUFFER, lpfreebuffer : LPFREEBUFFER, lpfnfiltercolumns : isize) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn HrAllocAdviseSink(lpfncallback : LPNOTIFCALLBACK, lpvcontext : *mut core::ffi::c_void, lppadvisesink : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn HrDispatchNotifications(ulflags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn HrGetOneProp(lpmapiprop : * mut core::ffi::c_void, ulproptag : u32, lppprop : *mut *mut SPropValue) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com_StructuredStorage")]
// windows_link::link!("mapi32.dll" "system" fn HrIStorageFromStream(lpunkin : * mut core::ffi::c_void, lpinterface : *mut windows_sys::core::GUID, ulflags : u32, lppstorageout : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn HrQueryAllRows(lptable : * mut core::ffi::c_void, lpproptags : *mut SPropTagArray, lprestriction : *mut SRestriction, lpsortorderset : *mut SSortOrderSet, crowsmax : i32, lpprows : *mut *mut SRowSet) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn HrSetOneProp(lpmapiprop : * mut core::ffi::c_void, lpprop : *mut SPropValue) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn HrThisThreadAdviseSink(lpadvisesink : * mut core::ffi::c_void, lppadvisesink : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn LPropCompareProp(lpspropvaluea : *mut SPropValue, lpspropvalueb : *mut SPropValue) -> i32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn LpValFindProp(ulproptag : u32, cvalues : u32, lpproparray : *mut SPropValue) -> *mut SPropValue);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn MAPIDeinitIdle());

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn MAPIGetDefaultMalloc() -> * mut core::ffi::c_void);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn MAPIInitIdle(lpvreserved : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn OpenStreamOnFile(lpallocatebuffer : LPALLOCATEBUFFER, lpfreebuffer : LPFREEBUFFER, ulflags : u32, lpszfilename : *const i8, lpszprefix : *const i8, lppstream : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn PpropFindProp(lpproparray : *mut SPropValue, cvalues : u32, ulproptag : u32) -> *mut SPropValue);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn PropCopyMore(lpspropvaluedest : *mut SPropValue, lpspropvaluesrc : *mut SPropValue, lpfallocmore : LPALLOCATEMORE, lpvobject : *mut core::ffi::c_void) -> i32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn RTFSync(lpmessage : * mut core::ffi::c_void, ulflags : u32, lpfmessageupdated : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn ScCopyNotifications(cnotification : i32, lpnotifications : *mut NOTIFICATION, lpvdst : *mut core::ffi::c_void, lpcb : *mut u32) -> i32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn ScCopyProps(cvalues : i32, lpproparray : *mut SPropValue, lpvdst : *mut core::ffi::c_void, lpcb : *mut u32) -> i32);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn ScCountNotifications(cnotifications : i32, lpnotifications : *mut NOTIFICATION, lpcb : *mut u32) -> i32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn ScCountProps(cvalues : i32, lpproparray : *mut SPropValue, lpcb : *mut u32) -> i32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn ScCreateConversationIndex(cbparent : u32, lpbparent : *mut u8, lpcbconvindex : *mut u32, lppbconvindex : *mut *mut u8) -> i32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn ScDupPropset(cvalues : i32, lpproparray : *mut SPropValue, lpallocatebuffer : LPALLOCATEBUFFER, lppproparray : *mut *mut SPropValue) -> i32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn ScInitMapiUtil(ulflags : u32) -> i32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn ScLocalPathFromUNC(lpszunc : windows_sys::core::PCSTR, lpszlocal : windows_sys::core::PCSTR, cchlocal : u32) -> i32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn ScRelocNotifications(cnotification : i32, lpnotifications : *mut NOTIFICATION, lpvbaseold : *mut core::ffi::c_void, lpvbasenew : *mut core::ffi::c_void, lpcb : *mut u32) -> i32);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn ScRelocProps(cvalues : i32, lpproparray : *mut SPropValue, lpvbaseold : *mut core::ffi::c_void, lpvbasenew : *mut core::ffi::c_void, lpcb : *mut u32) -> i32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn ScUNCFromLocalPath(lpszlocal : windows_sys::core::PCSTR, lpszunc : windows_sys::core::PCSTR, cchunc : u32) -> i32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn SzFindCh(lpsz : *mut i8, ch : u16) -> *mut i8);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn SzFindLastCh(lpsz : *mut i8, ch : u16) -> *mut i8);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn SzFindSz(lpsz : *mut i8, lpszkey : *mut i8) -> *mut i8);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn UFromSz(lpsz : *mut i8) -> u32);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn UlAddRef(lpunk : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn UlPropSize(lpspropvalue : *mut SPropValue) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn UlRelease(lpunk : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// windows_link::link!("mapi32.dll" "system" fn WrapCompressedRTFStream(lpcompressedrtfstream : * mut core::ffi::c_void, ulflags : u32, lpuncompressedrtfstream : *mut * mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("mapi32.dll" "system" fn WrapStoreEntryID(ulflags : u32, lpszdllname : *const i8, cborigentry : u32, lporigentry : *const ENTRYID, lpcbwrappedentry : *mut u32, lppwrappedentry : *mut *mut ENTRYID) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 83:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct ADRENTRY {
//     pub ulReserved1: u32,
//     pub cValues: u32,
//     pub rgPropVals: *mut SPropValue,
// }

// UNSUPPORTED Rust 91:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for ADRENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 97:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct ADRLIST {
//     pub cEntries: u32,
//     pub aEntries: [ADRENTRY; 1],
// }

// UNSUPPORTED Rust 104:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for ADRLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 110:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct ADRPARM {
//     pub cbABContEntryID: u32,
//     pub lpABContEntryID: *mut ENTRYID,
//     pub ulFlags: u32,
//     pub lpReserved: *mut core::ffi::c_void,
//     pub ulHelpContext: u32,
//     pub lpszHelpFileName: *mut i8,
//     pub lpfnABSDI: LPFNABSDI,
//     pub lpfnDismiss: LPFNDISMISS,
//     pub lpvDismissContext: *mut core::ffi::c_void,
//     pub lpszCaption: *mut i8,
//     pub lpszNewEntryTitle: *mut i8,
//     pub lpszDestWellsTitle: *mut i8,
//     pub cDestFields: u32,
//     pub nDestFieldFocus: u32,
//     pub lppszDestTitles: *mut *mut i8,
//     pub lpulDestComps: *mut u32,
//     pub lpContRestriction: *mut SRestriction,
//     pub lpHierRestriction: *mut SRestriction,
// }

// UNSUPPORTED Rust 133:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for ADRPARM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 139:1: generic scalar type unsupported
// pub type CALLERRELEASE = Option<unsafe extern "system" fn(ulcallerdata: u32, lptbldata: *mut core::ffi::c_void, lpvue: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 140:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLBUTTON {
//     pub ulbLpszLabel: u32,
//     pub ulFlags: u32,
//     pub ulPRControl: u32,
// }

// UNSUPPORTED Rust 147:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLCHECKBOX {
//     pub ulbLpszLabel: u32,
//     pub ulFlags: u32,
//     pub ulPRPropertyName: u32,
// }

// UNSUPPORTED Rust 154:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLCOMBOBOX {
//     pub ulbLpszCharsAllowed: u32,
//     pub ulFlags: u32,
//     pub ulNumCharsAllowed: u32,
//     pub ulPRPropertyName: u32,
//     pub ulPRTableName: u32,
// }

// UNSUPPORTED Rust 163:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLDDLBX {
//     pub ulFlags: u32,
//     pub ulPRDisplayProperty: u32,
//     pub ulPRSetProperty: u32,
//     pub ulPRTableName: u32,
// }

// UNSUPPORTED Rust 171:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLEDIT {
//     pub ulbLpszCharsAllowed: u32,
//     pub ulFlags: u32,
//     pub ulNumCharsAllowed: u32,
//     pub ulPropTag: u32,
// }

// UNSUPPORTED Rust 179:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLGROUPBOX {
//     pub ulbLpszLabel: u32,
//     pub ulFlags: u32,
// }

// UNSUPPORTED Rust 185:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLLABEL {
//     pub ulbLpszLabelName: u32,
//     pub ulFlags: u32,
// }

// UNSUPPORTED Rust 191:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLLBX {
//     pub ulFlags: u32,
//     pub ulPRSetProperty: u32,
//     pub ulPRTableName: u32,
// }

// UNSUPPORTED Rust 198:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLMVDDLBX {
//     pub ulFlags: u32,
//     pub ulMVPropTag: u32,
// }

// UNSUPPORTED Rust 204:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLMVLISTBOX {
//     pub ulFlags: u32,
//     pub ulMVPropTag: u32,
// }

// UNSUPPORTED Rust 210:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLPAGE {
//     pub ulbLpszLabel: u32,
//     pub ulFlags: u32,
//     pub ulbLpszComponent: u32,
//     pub ulContext: u32,
// }

// UNSUPPORTED Rust 218:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct DTBLRADIOBUTTON {
//     pub ulbLpszLabel: u32,
//     pub ulFlags: u32,
//     pub ulcButtons: u32,
//     pub ulPropTag: u32,
//     pub lReturnValue: i32,
// }

// UNSUPPORTED Rust 227:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DTCTL {
//     pub ulCtlType: u32,
//     pub ulCtlFlags: u32,
//     pub lpbNotif: *mut u8,
//     pub cbNotif: u32,
//     pub lpszFilter: *mut i8,
//     pub ulItemID: u32,
//     pub ctl: DTCTL_0,
// }

// UNSUPPORTED Rust 238:1: declaration Impl has no candidate rule
// impl Default for DTCTL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 243:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DTCTL_0 {
//     pub lpv: *mut core::ffi::c_void,
//     pub lplabel: *mut DTBLLABEL,
//     pub lpedit: *mut DTBLEDIT,
//     pub lplbx: *mut DTBLLBX,
//     pub lpcombobox: *mut DTBLCOMBOBOX,
//     pub lpddlbx: *mut DTBLDDLBX,
//     pub lpcheckbox: *mut DTBLCHECKBOX,
//     pub lpgroupbox: *mut DTBLGROUPBOX,
//     pub lpbutton: *mut DTBLBUTTON,
//     pub lpradiobutton: *mut DTBLRADIOBUTTON,
//     pub lpmvlbx: *mut DTBLMVLISTBOX,
//     pub lpmvddlbx: *mut DTBLMVDDLBX,
//     pub lppage: *mut DTBLPAGE,
// }

// UNSUPPORTED Rust 260:1: declaration Impl has no candidate rule
// impl Default for DTCTL_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 265:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DTPAGE {
//     pub cctl: u32,
//     pub lpszResourceName: *mut i8,
//     pub Anonymous: DTPAGE_0,
//     pub lpctl: *mut DTCTL,
// }

// UNSUPPORTED Rust 273:1: declaration Impl has no candidate rule
// impl Default for DTPAGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 278:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DTPAGE_0 {
//     pub lpszComponent: *mut i8,
//     pub ulItemID: u32,
// }

// UNSUPPORTED Rust 284:1: declaration Impl has no candidate rule
// impl Default for DTPAGE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 289:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ENTRYID {
//     pub abFlags: [u8; 4],
//     pub ab: [u8; 1],
// }

// UNSUPPORTED Rust 295:1: declaration Impl has no candidate rule
// impl Default for ENTRYID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct ERROR_NOTIFICATION {
//     pub cbEntryID: u32,
//     pub lpEntryID: *mut ENTRYID,
//     pub scode: i32,
//     pub ulFlags: u32,
//     pub lpMAPIError: *mut MAPIERROR,
// }

// UNSUPPORTED Rust 309:1: declaration Impl has no candidate rule
// impl Default for ERROR_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 314:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct EXTENDED_NOTIFICATION {
//     pub ulEvent: u32,
//     pub cb: u32,
//     pub pbEventParameters: *mut u8,
// }

// UNSUPPORTED Rust 321:1: declaration Impl has no candidate rule
// impl Default for EXTENDED_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `E_IMAPI_BURN_VERIFICATION_FAILED`: Int = -1062600697;
public const val `E_IMAPI_DF2DATA_CLIENT_NAME_IS_NOT_VALID`: Int = -1062599672;
public const val `E_IMAPI_DF2DATA_INVALID_MEDIA_STATE`: Int = -1062599678;
public const val `E_IMAPI_DF2DATA_MEDIA_IS_NOT_SUPPORTED`: Int = -1062599674;
public const val `E_IMAPI_DF2DATA_MEDIA_NOT_BLANK`: Int = -1062599675;
public const val `E_IMAPI_DF2DATA_RECORDER_NOT_SUPPORTED`: Int = -1062599673;
public const val `E_IMAPI_DF2DATA_STREAM_NOT_SUPPORTED`: Int = -1062599677;
public const val `E_IMAPI_DF2DATA_STREAM_TOO_LARGE_FOR_CURRENT_MEDIA`: Int = -1062599676;
public const val `E_IMAPI_DF2DATA_WRITE_IN_PROGRESS`: Int = -1062599680;
public const val `E_IMAPI_DF2DATA_WRITE_NOT_IN_PROGRESS`: Int = -1062599679;
public const val `E_IMAPI_DF2RAW_CLIENT_NAME_IS_NOT_VALID`: Int = -1062599164;
public const val `E_IMAPI_DF2RAW_DATA_BLOCK_TYPE_NOT_SUPPORTED`: Int = -1062599154;
public const val `E_IMAPI_DF2RAW_MEDIA_IS_NOT_BLANK`: Int = -1062599162;
public const val `E_IMAPI_DF2RAW_MEDIA_IS_NOT_PREPARED`: Int = -1062599166;
public const val `E_IMAPI_DF2RAW_MEDIA_IS_NOT_SUPPORTED`: Int = -1062599161;
public const val `E_IMAPI_DF2RAW_MEDIA_IS_PREPARED`: Int = -1062599165;
public const val `E_IMAPI_DF2RAW_NOT_ENOUGH_SPACE`: Int = -1062599159;
public const val `E_IMAPI_DF2RAW_NO_RECORDER_SPECIFIED`: Int = -1062599158;
public const val `E_IMAPI_DF2RAW_RECORDER_NOT_SUPPORTED`: Int = -1062599152;
public const val `E_IMAPI_DF2RAW_STREAM_LEADIN_TOO_SHORT`: Int = -1062599153;
public const val `E_IMAPI_DF2RAW_STREAM_NOT_SUPPORTED`: Int = -1062599155;
public const val `E_IMAPI_DF2RAW_WRITE_IN_PROGRESS`: Int = -1062599168;
public const val `E_IMAPI_DF2RAW_WRITE_NOT_IN_PROGRESS`: Int = -1062599167;
public const val `E_IMAPI_DF2TAO_CLIENT_NAME_IS_NOT_VALID`: Int = -1062599409;
public const val `E_IMAPI_DF2TAO_INVALID_ISRC`: Int = -1062599413;
public const val `E_IMAPI_DF2TAO_INVALID_MCN`: Int = -1062599412;
public const val `E_IMAPI_DF2TAO_MEDIA_IS_NOT_BLANK`: Int = -1062599418;
public const val `E_IMAPI_DF2TAO_MEDIA_IS_NOT_PREPARED`: Int = -1062599422;
public const val `E_IMAPI_DF2TAO_MEDIA_IS_NOT_SUPPORTED`: Int = -1062599417;
public const val `E_IMAPI_DF2TAO_MEDIA_IS_PREPARED`: Int = -1062599421;
public const val `E_IMAPI_DF2TAO_NOT_ENOUGH_SPACE`: Int = -1062599415;
public const val `E_IMAPI_DF2TAO_NO_RECORDER_SPECIFIED`: Int = -1062599414;
public const val `E_IMAPI_DF2TAO_PROPERTY_FOR_BLANK_MEDIA_ONLY`: Int = -1062599420;
public const val `E_IMAPI_DF2TAO_RECORDER_NOT_SUPPORTED`: Int = -1062599410;
public const val `E_IMAPI_DF2TAO_STREAM_NOT_SUPPORTED`: Int = -1062599411;
public const val `E_IMAPI_DF2TAO_TABLE_OF_CONTENTS_EMPTY_DISC`: Int = -1062599419;
public const val `E_IMAPI_DF2TAO_TRACK_LIMIT_REACHED`: Int = -1062599416;
public const val `E_IMAPI_DF2TAO_WRITE_IN_PROGRESS`: Int = -1062599424;
public const val `E_IMAPI_DF2TAO_WRITE_NOT_IN_PROGRESS`: Int = -1062599423;
public const val `E_IMAPI_ERASE_CLIENT_NAME_IS_NOT_VALID`: Int = -1062598389;
public const val `E_IMAPI_ERASE_DISC_INFORMATION_TOO_SMALL`: Int = -2136340222;
public const val `E_IMAPI_ERASE_DRIVE_FAILED_ERASE_COMMAND`: Int = -2136340219;
public const val `E_IMAPI_ERASE_DRIVE_FAILED_SPINUP_COMMAND`: Int = -2136340216;
public const val `E_IMAPI_ERASE_MEDIA_IS_NOT_ERASABLE`: Int = -2136340220;
public const val `E_IMAPI_ERASE_MEDIA_IS_NOT_SUPPORTED`: Int = -1062598391;
public const val `E_IMAPI_ERASE_MODE_PAGE_2A_TOO_SMALL`: Int = -2136340221;
public const val `E_IMAPI_ERASE_ONLY_ONE_RECORDER_SUPPORTED`: Int = -2136340223;
public const val `E_IMAPI_ERASE_RECORDER_IN_USE`: Int = -2136340224;
public const val `E_IMAPI_ERASE_RECORDER_NOT_SUPPORTED`: Int = -1062598390;
public const val `E_IMAPI_ERASE_TOOK_LONGER_THAN_ONE_HOUR`: Int = -2136340218;
public const val `E_IMAPI_ERASE_UNEXPECTED_DRIVE_RESPONSE_DURING_ERASE`: Int = -2136340217;
public const val `E_IMAPI_LOSS_OF_STREAMING`: Int = -1062599936;
public const val `E_IMAPI_RAW_IMAGE_INSUFFICIENT_SPACE`: Int = -2136339963;
public const val `E_IMAPI_RAW_IMAGE_IS_READ_ONLY`: Int = -2136339968;
public const val `E_IMAPI_RAW_IMAGE_NO_TRACKS`: Int = -2136339965;
public const val `E_IMAPI_RAW_IMAGE_SECTOR_TYPE_NOT_SUPPORTED`: Int = -2136339966;
public const val `E_IMAPI_RAW_IMAGE_TOO_MANY_TRACKS`: Int = -2136339967;
public const val `E_IMAPI_RAW_IMAGE_TOO_MANY_TRACK_INDEXES`: Int = -2136339962;
public const val `E_IMAPI_RAW_IMAGE_TRACKS_ALREADY_ADDED`: Int = -2136339964;
public const val `E_IMAPI_RAW_IMAGE_TRACK_INDEX_NOT_FOUND`: Int = -2136339961;
public const val `E_IMAPI_RAW_IMAGE_TRACK_INDEX_OFFSET_ZERO_CANNOT_BE_CLEARED`: Int = -2136339959;
public const val `E_IMAPI_RAW_IMAGE_TRACK_INDEX_TOO_CLOSE_TO_OTHER_INDEX`: Int = -2136339958;
public const val `E_IMAPI_RECORDER_CLIENT_NAME_IS_NOT_VALID`: Int = -1062600175;
public const val `E_IMAPI_RECORDER_COMMAND_TIMEOUT`: Int = -1062600179;
public const val `E_IMAPI_RECORDER_DVD_STRUCTURE_NOT_PRESENT`: Int = -1062600178;
public const val `E_IMAPI_RECORDER_FEATURE_IS_NOT_CURRENT`: Int = -1062600181;
public const val `E_IMAPI_RECORDER_GET_CONFIGURATION_NOT_SUPPORTED`: Int = -1062600180;
public const val `E_IMAPI_RECORDER_INVALID_MODE_PARAMETERS`: Int = -1062600184;
public const val `E_IMAPI_RECORDER_INVALID_RESPONSE_FROM_DEVICE`: Int = -1062599937;
public const val `E_IMAPI_RECORDER_LOCKED`: Int = -1062600176;
public const val `E_IMAPI_RECORDER_MEDIA_BECOMING_READY`: Int = -1062600187;
public const val `E_IMAPI_RECORDER_MEDIA_BUSY`: Int = -1062600185;
public const val `E_IMAPI_RECORDER_MEDIA_FORMAT_IN_PROGRESS`: Int = -1062600186;
public const val `E_IMAPI_RECORDER_MEDIA_INCOMPATIBLE`: Int = -1062600189;
public const val `E_IMAPI_RECORDER_MEDIA_NOT_FORMATTED`: Int = -1062600174;
public const val `E_IMAPI_RECORDER_MEDIA_NO_MEDIA`: Int = -1062600190;
public const val `E_IMAPI_RECORDER_MEDIA_SPEED_MISMATCH`: Int = -1062600177;
public const val `E_IMAPI_RECORDER_MEDIA_UPSIDE_DOWN`: Int = -1062600188;
public const val `E_IMAPI_RECORDER_MEDIA_WRITE_PROTECTED`: Int = -1062600183;
public const val `E_IMAPI_RECORDER_NO_SUCH_FEATURE`: Int = -1062600182;
public const val `E_IMAPI_RECORDER_NO_SUCH_MODE_PAGE`: Int = -1062600191;
public const val `E_IMAPI_RECORDER_REQUIRED`: Int = -1062600701;
public const val `E_IMAPI_REQUEST_CANCELLED`: Int = -1062600702;
public const val `E_IMAPI_UNEXPECTED_RESPONSE_FROM_DEVICE`: Int = -1062599935;
public const val `FACILITY_IMAPI2`: UInt = 170u;
// UNSUPPORTED Rust 411:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLATENTRY {
//     pub cb: u32,
//     pub abEntry: [u8; 1],
// }

// UNSUPPORTED Rust 417:1: declaration Impl has no candidate rule
// impl Default for FLATENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 422:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLATENTRYLIST {
//     pub cEntries: u32,
//     pub cbEntries: u32,
//     pub abEntries: [u8; 1],
// }

// UNSUPPORTED Rust 429:1: declaration Impl has no candidate rule
// impl Default for FLATENTRYLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 434:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FLATMTSIDLIST {
//     pub cMTSIDs: u32,
//     pub cbMTSIDs: u32,
//     pub abMTSIDs: [u8; 1],
// }

// UNSUPPORTED Rust 441:1: declaration Impl has no candidate rule
// impl Default for FLATMTSIDLIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 446:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FlagList {
//     pub cFlags: u32,
//     pub ulFlag: [u32; 1],
// }

// UNSUPPORTED Rust 452:1: declaration Impl has no candidate rule
// impl Default for FlagList {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `Gender` = Int;
public const val `IMAPI_E_BAD_MULTISESSION_PARAMETER`: Int = -1062555294;
public const val `IMAPI_E_BOOT_EMULATION_IMAGE_SIZE_MISMATCH`: Int = -1062555318;
public const val `IMAPI_E_BOOT_IMAGE_DATA`: Int = -1062555320;
public const val `IMAPI_E_BOOT_OBJECT_CONFLICT`: Int = -1062555319;
public const val `IMAPI_E_DATA_STREAM_CREATE_FAILURE`: Int = -1062555350;
public const val `IMAPI_E_DATA_STREAM_INCONSISTENCY`: Int = -1062555352;
public const val `IMAPI_E_DATA_STREAM_READ_FAILURE`: Int = -1062555351;
public const val `IMAPI_E_DATA_TOO_BIG`: Int = -1062555342;
public const val `IMAPI_E_DIRECTORY_READ_FAILURE`: Int = -1062555349;
public const val `IMAPI_E_DIR_NOT_EMPTY`: Int = -1062555382;
public const val `IMAPI_E_DIR_NOT_FOUND`: Int = -1062555366;
public const val `IMAPI_E_DISC_MISMATCH`: Int = -1062555304;
public const val `IMAPI_E_DUP_NAME`: Int = -1062555374;
public const val `IMAPI_E_EMPTY_DISC`: Int = -1062555312;
public const val `IMAPI_E_FILE_NOT_FOUND`: Int = -1062555367;
public const val `IMAPI_E_FILE_SYSTEM_CHANGE_NOT_ALLOWED`: Int = -1062555293;
public const val `IMAPI_E_FILE_SYSTEM_FEATURE_NOT_SUPPORTED`: Int = -1062555308;
public const val `IMAPI_E_FILE_SYSTEM_NOT_EMPTY`: Int = -1062555386;
public const val `IMAPI_E_FILE_SYSTEM_NOT_FOUND`: Int = -1062555310;
public const val `IMAPI_E_FILE_SYSTEM_READ_CONSISTENCY_ERROR`: Int = -1062555309;
public const val `IMAPI_E_FSI_INTERNAL_ERROR`: Int = -1062555392;
public const val `IMAPI_E_IMAGEMANAGER_IMAGE_NOT_ALIGNED`: Int = -1062555136;
public const val `IMAPI_E_IMAGEMANAGER_IMAGE_TOO_BIG`: Int = -1062555133;
public const val `IMAPI_E_IMAGEMANAGER_NO_IMAGE`: Int = -1062555134;
public const val `IMAPI_E_IMAGEMANAGER_NO_VALID_VD_FOUND`: Int = -1062555135;
public const val `IMAPI_E_IMAGE_SIZE_LIMIT`: Int = -1062555360;
public const val `IMAPI_E_IMAGE_TOO_BIG`: Int = -1062555359;
public const val `IMAPI_E_IMPORT_MEDIA_NOT_ALLOWED`: Int = -1062555303;
public const val `IMAPI_E_IMPORT_READ_FAILURE`: Int = -1062555305;
public const val `IMAPI_E_IMPORT_SEEK_FAILURE`: Int = -1062555306;
public const val `IMAPI_E_IMPORT_TYPE_COLLISION_DIRECTORY_EXISTS_AS_FILE`: Int = -1062555298;
public const val `IMAPI_E_IMPORT_TYPE_COLLISION_FILE_EXISTS_AS_DIRECTORY`: Int = -1062555307;
public const val `IMAPI_E_INCOMPATIBLE_MULTISESSION_TYPE`: Int = -1062555301;
public const val `IMAPI_E_INCOMPATIBLE_PREVIOUS_SESSION`: Int = -1062555341;
public const val `IMAPI_E_INVALID_DATE`: Int = -1062555387;
public const val `IMAPI_E_INVALID_PARAM`: Int = -1062555391;
public const val `IMAPI_E_INVALID_PATH`: Int = -1062555376;
public const val `IMAPI_E_INVALID_VOLUME_NAME`: Int = -1062555388;
public const val `IMAPI_E_INVALID_WORKING_DIRECTORY`: Int = -1062555328;
public const val `IMAPI_E_ISO9660_LEVELS`: Int = -1062555343;
public const val `IMAPI_E_ITEM_NOT_FOUND`: Int = -1062555368;
public const val `IMAPI_E_MULTISESSION_NOT_SET`: Int = -1062555299;
public const val `IMAPI_E_NOT_DIR`: Int = -1062555383;
public const val `IMAPI_E_NOT_FILE`: Int = -1062555384;
public const val `IMAPI_E_NOT_IN_FILE_SYSTEM`: Int = -1062555381;
public const val `IMAPI_E_NO_COMPATIBLE_MULTISESSION_TYPE`: Int = -1062555300;
public const val `IMAPI_E_NO_OUTPUT`: Int = -1062555389;
public const val `IMAPI_E_NO_SUPPORTED_FILE_SYSTEM`: Int = -1062555311;
public const val `IMAPI_E_NO_UNIQUE_NAME`: Int = -1062555373;
public const val `IMAPI_E_PROPERTY_NOT_ACCESSIBLE`: Int = -1062555296;
public const val `IMAPI_E_READONLY`: Int = -1062555390;
public const val `IMAPI_E_RESTRICTED_NAME_VIOLATION`: Int = -1062555375;
public const val `IMAPI_E_STASHFILE_MOVE`: Int = -1062555326;
public const val `IMAPI_E_STASHFILE_OPEN_FAILURE`: Int = -1062555336;
public const val `IMAPI_E_STASHFILE_READ_FAILURE`: Int = -1062555333;
public const val `IMAPI_E_STASHFILE_SEEK_FAILURE`: Int = -1062555335;
public const val `IMAPI_E_STASHFILE_WRITE_FAILURE`: Int = -1062555334;
public const val `IMAPI_E_TOO_MANY_DIRS`: Int = -1062555344;
public const val `IMAPI_E_UDF_NOT_WRITE_COMPATIBLE`: Int = -1062555302;
public const val `IMAPI_E_UDF_REVISION_CHANGE_NOT_ALLOWED`: Int = -1062555295;
public const val `IMAPI_E_WORKING_DIRECTORY_SPACE`: Int = -1062555327;
public const val `IMAPI_S_IMAGE_FEATURE_NOT_SUPPORTED`: Int = 11186527;
// UNSUPPORTED Rust 520:1: generic scalar type unsupported
// pub type LPALLOCATEBUFFER = Option<unsafe extern "system" fn(cbsize: u32, lppbuffer: *mut *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 521:1: generic scalar type unsupported
// pub type LPALLOCATEMORE = Option<unsafe extern "system" fn(cbsize: u32, lpobject: *mut core::ffi::c_void, lppbuffer: *mut *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 522:1: generic scalar type unsupported
// pub type LPCREATECONVERSATIONINDEX = Option<unsafe extern "system" fn(cbparent: u32, lpbparent: *mut u8, lpcbconvindex: *mut u32, lppbconvindex: *mut *mut u8) -> i32>;

// UNSUPPORTED Rust 523:1: generic scalar type unsupported
// pub type LPDISPATCHNOTIFICATIONS = Option<unsafe extern "system" fn(ulflags: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 524:1: generic scalar type unsupported
// pub type LPFNABSDI = Option<unsafe extern "system" fn(uluiparam: usize, lpvmsg: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 525:1: generic scalar type unsupported
// pub type LPFNBUTTON = Option<unsafe extern "system" fn(uluiparam: usize, lpvcontext: *mut core::ffi::c_void, cbentryid: u32, lpselection: *mut ENTRYID, ulflags: u32) -> i32>;

// UNSUPPORTED Rust 526:1: generic scalar type unsupported
// pub type LPFNDISMISS = Option<unsafe extern "system" fn(uluiparam: usize, lpvcontext: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 527:1: generic scalar type unsupported
// pub type LPFREEBUFFER = Option<unsafe extern "system" fn(lpbuffer: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 528:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type LPNOTIFCALLBACK = Option<unsafe extern "system" fn(lpvcontext: *mut core::ffi::c_void, cnotification: u32, lpnotifications: *mut NOTIFICATION) -> i32>;

// UNSUPPORTED Rust 530:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Com")]
// pub type LPOPENSTREAMONFILE = Option<unsafe extern "system" fn(lpallocatebuffer: LPALLOCATEBUFFER, lpfreebuffer: LPFREEBUFFER, ulflags: u32, lpszfilename: *const i8, lpszprefix: *const i8, lppstream: *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT>;

public typealias `LPWABACTIONITEM` = Long;
// UNSUPPORTED Rust 533:1: generic scalar type unsupported
// pub type LPWABALLOCATEBUFFER = Option<unsafe extern "system" fn(lpwabobject: *mut core::ffi::c_void, cbsize: u32, lppbuffer: *mut *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 534:1: generic scalar type unsupported
// pub type LPWABALLOCATEMORE = Option<unsafe extern "system" fn(lpwabobject: *mut core::ffi::c_void, cbsize: u32, lpobject: *mut core::ffi::c_void, lppbuffer: *mut *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 535:1: generic scalar type unsupported
// pub type LPWABFREEBUFFER = Option<unsafe extern "system" fn(lpwabobject: *mut core::ffi::c_void, lpbuffer: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 536:1: generic scalar type unsupported
// pub type LPWABOPEN = Option<unsafe extern "system" fn(lppadrbook: *mut *mut core::ffi::c_void, lppwabobject: *mut *mut core::ffi::c_void, lpwp: *mut WAB_PARAM, reserved2: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 537:1: generic scalar type unsupported
// pub type LPWABOPENEX = Option<unsafe extern "system" fn(lppadrbook: *mut *mut core::ffi::c_void, lppwabobject: *mut *mut core::ffi::c_void, lpwp: *mut WAB_PARAM, reserved: u32, fnallocatebuffer: LPALLOCATEBUFFER, fnallocatemore: LPALLOCATEMORE, fnfreebuffer: LPFREEBUFFER) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 538:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPIERROR {
//     pub ulVersion: u32,
//     pub lpszError: *mut i8,
//     pub lpszComponent: *mut i8,
//     pub ulLowLevelError: u32,
//     pub ulContext: u32,
// }

// UNSUPPORTED Rust 547:1: declaration Impl has no candidate rule
// impl Default for MAPIERROR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 552:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPINAMEID {
//     pub lpguid: *mut windows_sys::core::GUID,
//     pub ulKind: u32,
//     pub Kind: MAPINAMEID_0,
// }

// UNSUPPORTED Rust 559:1: declaration Impl has no candidate rule
// impl Default for MAPINAMEID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 564:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union MAPINAMEID_0 {
//     pub lID: i32,
//     pub lpwstrName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 570:1: declaration Impl has no candidate rule
// impl Default for MAPINAMEID_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 575:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MAPIUID {
//     pub ab: [u8; 16],
// }

// UNSUPPORTED Rust 580:1: declaration Impl has no candidate rule
// impl Default for MAPIUID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MAPI_COMPOUND`: UInt = 128u;
public const val `MAPI_DIM`: UInt = 1u;
public const val `MAPI_ERROR_VERSION`: Int = 0;
public const val `MAPI_E_CALL_FAILED`: Int = -2147467259;
public const val `MAPI_E_INTERFACE_NOT_SUPPORTED`: Int = -2147467262;
public const val `MAPI_E_INVALID_PARAMETER`: Int = -2147024809;
public const val `MAPI_E_NOT_ENOUGH_MEMORY`: Int = -2147024882;
public const val `MAPI_E_NO_ACCESS`: Int = -2147024891;
public const val `MAPI_NOTRECIP`: UInt = 64u;
public const val `MAPI_NOTRESERVED`: UInt = 8u;
public const val `MAPI_NOW`: UInt = 16u;
public const val `MAPI_ONE_OFF_NO_RICH_INFO`: UInt = 1u;
public const val `MAPI_P1`: UInt = 268435456u;
public const val `MAPI_SHORTTERM`: UInt = 128u;
public const val `MAPI_SUBMITTED`: UInt = 2147483648u;
public const val `MAPI_THISSESSION`: UInt = 32u;
public const val `MAPI_USE_DEFAULT`: UInt = 64u;
public const val `MNID_ID`: UInt = 0u;
public const val `MNID_STRING`: UInt = 1u;
// UNSUPPORTED Rust 604:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MTSID {
//     pub cb: u32,
//     pub ab: [u8; 1],
// }

// UNSUPPORTED Rust 610:1: declaration Impl has no candidate rule
// impl Default for MTSID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MV_FLAG`: UInt = 4096u;
public const val `MV_INSTANCE`: UInt = 8192u;
// UNSUPPORTED Rust 617:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NEWMAIL_NOTIFICATION {
//     pub cbEntryID: u32,
//     pub lpEntryID: *mut ENTRYID,
//     pub cbParentID: u32,
//     pub lpParentID: *mut ENTRYID,
//     pub ulFlags: u32,
//     pub lpszMessageClass: *mut i8,
//     pub ulMessageFlags: u32,
// }

// UNSUPPORTED Rust 628:1: declaration Impl has no candidate rule
// impl Default for NEWMAIL_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 633:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct NOTIFICATION {
//     pub ulEventType: u32,
//     pub ulAlignPad: u32,
//     pub info: NOTIFICATION_0,
// }

// UNSUPPORTED Rust 641:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 647:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union NOTIFICATION_0 {
//     pub err: ERROR_NOTIFICATION,
//     pub newmail: NEWMAIL_NOTIFICATION,
//     pub obj: OBJECT_NOTIFICATION,
//     pub tab: TABLE_NOTIFICATION,
//     pub ext: EXTENDED_NOTIFICATION,
//     pub statobj: STATUS_OBJECT_NOTIFICATION,
// }

// UNSUPPORTED Rust 658:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for NOTIFICATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 664:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct NOTIFKEY {
//     pub cb: u32,
//     pub ab: [u8; 1],
// }

// UNSUPPORTED Rust 670:1: declaration Impl has no candidate rule
// impl Default for NOTIFKEY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 675:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct OBJECT_NOTIFICATION {
//     pub cbEntryID: u32,
//     pub lpEntryID: *mut ENTRYID,
//     pub ulObjType: u32,
//     pub cbParentID: u32,
//     pub lpParentID: *mut ENTRYID,
//     pub cbOldID: u32,
//     pub lpOldID: *mut ENTRYID,
//     pub cbOldParentID: u32,
//     pub lpOldParentID: *mut ENTRYID,
//     pub lpPropTagArray: *mut SPropTagArray,
// }

// UNSUPPORTED Rust 689:1: declaration Impl has no candidate rule
// impl Default for OBJECT_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 694:1: non-scalar type Ptr unsupported
// pub const OPENSTREAMONFILE: windows_sys::core::PCSTR = windows_sys::core::s!("OpenStreamOnFile");

// UNSUPPORTED Rust 695:1: generic scalar type unsupported
// pub type PFNIDLE = Option<unsafe extern "system" fn(param0: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

public const val `PRIHIGHEST`: UInt = 32767u;
public const val `PRILOWEST`: Int = -32768;
public const val `PRIUSER`: UInt = 0u;
public const val `PROP_ID_INVALID`: UInt = 65535u;
public const val `PROP_ID_NULL`: UInt = 0u;
public const val `PROP_ID_SECURE_MAX`: UInt = 26623u;
public const val `PROP_ID_SECURE_MIN`: UInt = 26608u;
// UNSUPPORTED Rust 703:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SAndRestriction {
//     pub cRes: u32,
//     pub lpRes: *mut SRestriction,
// }

// UNSUPPORTED Rust 710:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SAndRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 716:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SAppTimeArray {
//     pub cValues: u32,
//     pub lpat: *mut f64,
// }

// UNSUPPORTED Rust 722:1: declaration Impl has no candidate rule
// impl Default for SAppTimeArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 727:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SBinary {
//     pub cb: u32,
//     pub lpb: *mut u8,
// }

// UNSUPPORTED Rust 733:1: declaration Impl has no candidate rule
// impl Default for SBinary {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 738:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SBinaryArray {
//     pub cValues: u32,
//     pub lpbin: *mut SBinary,
// }

// UNSUPPORTED Rust 744:1: declaration Impl has no candidate rule
// impl Default for SBinaryArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 749:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SBitMaskRestriction {
//     pub relBMR: u32,
//     pub ulPropTag: u32,
//     pub ulMask: u32,
// }

// UNSUPPORTED Rust 756:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SCommentRestriction {
//     pub cValues: u32,
//     pub lpRes: *mut SRestriction,
//     pub lpProp: *mut SPropValue,
// }

// UNSUPPORTED Rust 764:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SCommentRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 770:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SComparePropsRestriction {
//     pub relop: u32,
//     pub ulPropTag1: u32,
//     pub ulPropTag2: u32,
// }

// UNSUPPORTED Rust 777:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SContentRestriction {
//     pub ulFuzzyLevel: u32,
//     pub ulPropTag: u32,
//     pub lpProp: *mut SPropValue,
// }

// UNSUPPORTED Rust 785:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SContentRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 791:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SCurrencyArray {
//     pub cValues: u32,
//     pub lpcur: *mut super::Com::CY,
// }

// UNSUPPORTED Rust 798:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SCurrencyArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 804:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SDateTimeArray {
//     pub cValues: u32,
//     pub lpft: *mut super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 810:1: declaration Impl has no candidate rule
// impl Default for SDateTimeArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 815:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SDoubleArray {
//     pub cValues: u32,
//     pub lpdbl: *mut f64,
// }

// UNSUPPORTED Rust 821:1: declaration Impl has no candidate rule
// impl Default for SDoubleArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SERVICE_UI_ALLOWED`: UInt = 16u;
public const val `SERVICE_UI_ALWAYS`: UInt = 2u;
// UNSUPPORTED Rust 828:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SExistRestriction {
//     pub ulReserved1: u32,
//     pub ulPropTag: u32,
//     pub ulReserved2: u32,
// }

// UNSUPPORTED Rust 835:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SGuidArray {
//     pub cValues: u32,
//     pub lpguid: *mut windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 841:1: declaration Impl has no candidate rule
// impl Default for SGuidArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 846:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SLPSTRArray {
//     pub cValues: u32,
//     pub lppszA: *mut windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 852:1: declaration Impl has no candidate rule
// impl Default for SLPSTRArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 857:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SLargeIntegerArray {
//     pub cValues: u32,
//     pub lpli: *mut i64,
// }

// UNSUPPORTED Rust 863:1: declaration Impl has no candidate rule
// impl Default for SLargeIntegerArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 868:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SLongArray {
//     pub cValues: u32,
//     pub lpl: *mut i32,
// }

// UNSUPPORTED Rust 874:1: declaration Impl has no candidate rule
// impl Default for SLongArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 879:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SNotRestriction {
//     pub ulReserved: u32,
//     pub lpRes: *mut SRestriction,
// }

// UNSUPPORTED Rust 886:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SNotRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 892:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SOrRestriction {
//     pub cRes: u32,
//     pub lpRes: *mut SRestriction,
// }

// UNSUPPORTED Rust 899:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SOrRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 905:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SPropProblem {
//     pub ulIndex: u32,
//     pub ulPropTag: u32,
//     pub scode: i32,
// }

// UNSUPPORTED Rust 912:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SPropProblemArray {
//     pub cProblem: u32,
//     pub aProblem: [SPropProblem; 1],
// }

// UNSUPPORTED Rust 918:1: declaration Impl has no candidate rule
// impl Default for SPropProblemArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 923:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SPropTagArray {
//     pub cValues: u32,
//     pub aulPropTag: [u32; 1],
// }

// UNSUPPORTED Rust 929:1: declaration Impl has no candidate rule
// impl Default for SPropTagArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 934:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SPropValue {
//     pub ulPropTag: u32,
//     pub dwAlignPad: u32,
//     pub Value: __UPV,
// }

// UNSUPPORTED Rust 942:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SPropValue {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 948:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SPropertyRestriction {
//     pub relop: u32,
//     pub ulPropTag: u32,
//     pub lpProp: *mut SPropValue,
// }

// UNSUPPORTED Rust 956:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SPropertyRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 962:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SRealArray {
//     pub cValues: u32,
//     pub lpflt: *mut f32,
// }

// UNSUPPORTED Rust 968:1: declaration Impl has no candidate rule
// impl Default for SRealArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 973:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SRestriction {
//     pub rt: u32,
//     pub res: SRestriction_0,
// }

// UNSUPPORTED Rust 980:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 986:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union SRestriction_0 {
//     pub resCompareProps: SComparePropsRestriction,
//     pub resAnd: SAndRestriction,
//     pub resOr: SOrRestriction,
//     pub resNot: SNotRestriction,
//     pub resContent: SContentRestriction,
//     pub resProperty: SPropertyRestriction,
//     pub resBitMask: SBitMaskRestriction,
//     pub resSize: SSizeRestriction,
//     pub resExist: SExistRestriction,
//     pub resSub: SSubRestriction,
//     pub resComment: SCommentRestriction,
// }

// UNSUPPORTED Rust 1002:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SRestriction_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SRow {
//     pub ulAdrEntryPad: u32,
//     pub cValues: u32,
//     pub lpProps: *mut SPropValue,
// }

// UNSUPPORTED Rust 1016:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SRow {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1022:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SRowSet {
//     pub cRows: u32,
//     pub aRow: [SRow; 1],
// }

// UNSUPPORTED Rust 1029:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SRowSet {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1035:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SShortArray {
//     pub cValues: u32,
//     pub lpi: *mut i16,
// }

// UNSUPPORTED Rust 1041:1: declaration Impl has no candidate rule
// impl Default for SShortArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1046:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SSizeRestriction {
//     pub relop: u32,
//     pub ulPropTag: u32,
//     pub cb: u32,
// }

// UNSUPPORTED Rust 1053:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SSortOrder {
//     pub ulPropTag: u32,
//     pub ulOrder: u32,
// }

// UNSUPPORTED Rust 1059:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SSortOrderSet {
//     pub cSorts: u32,
//     pub cCategories: u32,
//     pub cExpanded: u32,
//     pub aSort: [SSortOrder; 1],
// }

// UNSUPPORTED Rust 1067:1: declaration Impl has no candidate rule
// impl Default for SSortOrderSet {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1072:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct SSubRestriction {
//     pub ulSubObject: u32,
//     pub lpRes: *mut SRestriction,
// }

// UNSUPPORTED Rust 1079:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for SSubRestriction {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1085:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct STATUS_OBJECT_NOTIFICATION {
//     pub cbEntryID: u32,
//     pub lpEntryID: *mut ENTRYID,
//     pub cValues: u32,
//     pub lpPropVals: *mut SPropValue,
// }

// UNSUPPORTED Rust 1094:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for STATUS_OBJECT_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1100:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SWStringArray {
//     pub cValues: u32,
//     pub lppszW: *mut windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 1106:1: declaration Impl has no candidate rule
// impl Default for SWStringArray {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `S_IMAPI_BOTHADJUSTED`: Int = 11141126;
public const val `S_IMAPI_COMMAND_HAS_SENSE_DATA`: Int = 11141632;
public const val `S_IMAPI_RAW_IMAGE_TRACK_INDEX_ALREADY_EXISTS`: Int = 11143688;
public const val `S_IMAPI_ROTATIONADJUSTED`: Int = 11141125;
public const val `S_IMAPI_SPEEDADJUSTED`: Int = 11141124;
public const val `S_IMAPI_WRITE_NOT_IN_PROGRESS`: Int = 11141890;
public const val `TABLE_CHANGED`: UInt = 1u;
public const val `TABLE_ERROR`: UInt = 2u;
// UNSUPPORTED Rust 1119:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub struct TABLE_NOTIFICATION {
//     pub ulTableEvent: u32,
//     pub hResult: windows_sys::core::HRESULT,
//     pub propIndex: SPropValue,
//     pub propPrior: SPropValue,
//     pub row: SRow,
//     pub ulPad: u32,
// }

// UNSUPPORTED Rust 1130:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for TABLE_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `TABLE_RELOAD`: UInt = 9u;
public const val `TABLE_RESTRICT_DONE`: UInt = 7u;
public const val `TABLE_ROW_ADDED`: UInt = 3u;
public const val `TABLE_ROW_DELETED`: UInt = 4u;
public const val `TABLE_ROW_MODIFIED`: UInt = 5u;
public const val `TABLE_SETCOL_DONE`: UInt = 8u;
public const val `TABLE_SORT_DONE`: UInt = 6u;
public const val `TAD_ALL_ROWS`: UInt = 1u;
public const val `UI_CURRENT_PROVIDER_FIRST`: UInt = 4u;
public const val `UI_SERVICE`: UInt = 2u;
// UNSUPPORTED Rust 1146:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WABEXTDISPLAY {
//     pub cbSize: u32,
//     pub lpWABObject: *mut core::ffi::c_void,
//     pub lpAdrBook: *mut core::ffi::c_void,
//     pub lpPropObj: *mut core::ffi::c_void,
//     pub fReadOnly: windows_sys::core::BOOL,
//     pub fDataChanged: windows_sys::core::BOOL,
//     pub ulFlags: u32,
//     pub lpv: *mut core::ffi::c_void,
//     pub lpsz: *mut i8,
// }

// UNSUPPORTED Rust 1159:1: declaration Impl has no candidate rule
// impl Default for WABEXTDISPLAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1164:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WABIMPORTPARAM {
//     pub cbSize: u32,
//     pub lpAdrBook: *mut core::ffi::c_void,
//     pub hWnd: super::super::Foundation::HWND,
//     pub ulFlags: u32,
//     pub lpszFileName: windows_sys::core::PSTR,
// }

// UNSUPPORTED Rust 1173:1: declaration Impl has no candidate rule
// impl Default for WABIMPORTPARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WABOBJECT_LDAPURL_RETURN_MAILUSER`: UInt = 1u;
public const val `WABOBJECT_ME_NEW`: UInt = 1u;
public const val `WABOBJECT_ME_NOCREATE`: UInt = 2u;
public const val `WAB_CONTEXT_ADRLIST`: UInt = 2u;
public const val `WAB_DISPLAY_ISNTDS`: UInt = 4u;
public const val `WAB_DISPLAY_LDAPURL`: UInt = 1u;
// UNSUPPORTED Rust 1184:1: non-scalar type Ptr unsupported
// pub const WAB_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("WAB32.DLL");

// UNSUPPORTED Rust 1185:1: non-scalar type Ptr unsupported
// pub const WAB_DLL_PATH_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("Software\\Microsoft\\WAB\\DLLPath");

public const val `WAB_ENABLE_PROFILES`: UInt = 4194304u;
public const val `WAB_IGNORE_PROFILES`: UInt = 8388608u;
public const val `WAB_LOCAL_CONTAINERS`: UInt = 1048576u;
// UNSUPPORTED Rust 1189:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WAB_PARAM {
//     pub cbSize: u32,
//     pub hwnd: super::super::Foundation::HWND,
//     pub szFileName: windows_sys::core::PSTR,
//     pub ulFlags: u32,
//     pub guidPSExt: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 1198:1: declaration Impl has no candidate rule
// impl Default for WAB_PARAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WAB_PROFILE_CONTENTS`: UInt = 2097152u;
public const val `WAB_USE_OE_SENDMAIL`: UInt = 1u;
public const val `WAB_VCARD_FILE`: UInt = 0u;
public const val `WAB_VCARD_STREAM`: UInt = 1u;
// UNSUPPORTED Rust 1207:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Com")]
// #[derive(Clone, Copy)]
// pub union __UPV {
//     pub i: i16,
//     pub l: i32,
//     pub ul: u32,
//     pub flt: f32,
//     pub dbl: f64,
//     pub b: u16,
//     pub cur: super::Com::CY,
//     pub at: f64,
//     pub ft: super::super::Foundation::FILETIME,
//     pub lpszA: windows_sys::core::PSTR,
//     pub bin: SBinary,
//     pub lpszW: windows_sys::core::PWSTR,
//     pub lpguid: *mut windows_sys::core::GUID,
//     pub li: i64,
//     pub MVi: SShortArray,
//     pub MVl: SLongArray,
//     pub MVflt: SRealArray,
//     pub MVdbl: SDoubleArray,
//     pub MVcur: SCurrencyArray,
//     pub MVat: SAppTimeArray,
//     pub MVft: SDateTimeArray,
//     pub MVbin: SBinaryArray,
//     pub MVszA: SLPSTRArray,
//     pub MVszW: SWStringArray,
//     pub MVguid: SGuidArray,
//     pub MVli: SLargeIntegerArray,
//     pub err: i32,
//     pub x: i32,
// }

// UNSUPPORTED Rust 1240:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Com")]
// impl Default for __UPV {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `cchProfileNameMax`: UInt = 64u;
public const val `cchProfilePassMax`: UInt = 64u;
public const val `fMapiUnicode`: UInt = 0u;
public const val `genderFemale`: `Gender` = 1;
public const val `genderMale`: `Gender` = 2;
public const val `genderUnspecified`: `Gender` = 0;
public const val `hrSuccess`: UInt = 0u;
// UNSUPPORTED Rust 1253:1: non-scalar type Ptr unsupported
// pub const szHrDispatchNotifications: windows_sys::core::PCSTR = windows_sys::core::s!("HrDispatchNotifications");

// UNSUPPORTED Rust 1254:1: non-scalar type Ptr unsupported
// pub const szMAPINotificationMsg: windows_sys::core::PCSTR = windows_sys::core::s!("MAPI Notify window message");

// UNSUPPORTED Rust 1255:1: non-scalar type Ptr unsupported
// pub const szScCreateConversationIndex: windows_sys::core::PCSTR = windows_sys::core::s!("ScCreateConversationIndex");

