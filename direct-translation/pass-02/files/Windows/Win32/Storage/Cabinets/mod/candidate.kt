// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FCIAddFile(hfci : *const core::ffi::c_void, pszsourcefile : windows_sys::core::PCSTR, pszfilename : windows_sys::core::PCSTR, fexecute : windows_sys::core::BOOL, pfnfcignc : PFNFCIGETNEXTCABINET, pfnfcis : PFNFCISTATUS, pfnfcigoi : PFNFCIGETOPENINFO, typecompress : u16) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FCICreate(perf : *const ERF, pfnfcifp : PFNFCIFILEPLACED, pfna : PFNFCIALLOC, pfnf : PFNFCIFREE, pfnopen : PFNFCIOPEN, pfnread : PFNFCIREAD, pfnwrite : PFNFCIWRITE, pfnclose : PFNFCICLOSE, pfnseek : PFNFCISEEK, pfndelete : PFNFCIDELETE, pfnfcigtf : PFNFCIGETTEMPFILE, pccab : *const CCAB, pv : *const core::ffi::c_void) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FCIDestroy(hfci : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FCIFlushCabinet(hfci : *const core::ffi::c_void, fgetnextcab : windows_sys::core::BOOL, pfnfcignc : PFNFCIGETNEXTCABINET, pfnfcis : PFNFCISTATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FCIFlushFolder(hfci : *const core::ffi::c_void, pfnfcignc : PFNFCIGETNEXTCABINET, pfnfcis : PFNFCISTATUS) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FDICopy(hfdi : *const core::ffi::c_void, pszcabinet : windows_sys::core::PCSTR, pszcabpath : windows_sys::core::PCSTR, flags : i32, pfnfdin : PFNFDINOTIFY, pfnfdid : PFNFDIDECRYPT, pvuser : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FDICreate(pfnalloc : PFNALLOC, pfnfree : PFNFREE, pfnopen : PFNOPEN, pfnread : PFNREAD, pfnwrite : PFNWRITE, pfnclose : PFNCLOSE, pfnseek : PFNSEEK, cputype : FDICREATE_CPU_TYPE, perf : *mut ERF) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FDIDestroy(hfdi : *const core::ffi::c_void) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FDIIsCabinet(hfdi : *const core::ffi::c_void, hf : isize, pfdici : *mut FDICABINETINFO) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("cabinet.dll" "C" fn FDITruncateCabinet(hfdi : *const core::ffi::c_void, pszcabinetname : windows_sys::core::PCSTR, ifoldertodelete : u16) -> windows_sys::core::BOOL);

public const val `CB_MAX_CABINET_NAME`: UInt = 256u;
public const val `CB_MAX_CAB_PATH`: UInt = 256u;
public const val `CB_MAX_DISK`: Int = 2147483647;
public const val `CB_MAX_DISK_NAME`: UInt = 256u;
public const val `CB_MAX_FILENAME`: UInt = 256u;
// UNSUPPORTED Rust 16:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CCAB {
//     pub cb: u32,
//     pub cbFolderThresh: u32,
//     pub cbReserveCFHeader: u32,
//     pub cbReserveCFFolder: u32,
//     pub cbReserveCFData: u32,
//     pub iCab: i32,
//     pub iDisk: i32,
//     pub fFailOnIncompressible: i32,
//     pub setID: u16,
//     pub szDisk: [i8; 256],
//     pub szCab: [i8; 256],
//     pub szCabPath: [i8; 256],
// }

// UNSUPPORTED Rust 32:1: declaration Impl has no candidate rule
// impl Default for CCAB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 37:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ERF {
//     pub erfOper: i32,
//     pub erfType: i32,
//     pub fError: windows_sys::core::BOOL,
// }

public typealias `FCIERROR` = Int;
public const val `FCIERR_ALLOC_FAIL`: `FCIERROR` = 3;
public const val `FCIERR_BAD_COMPR_TYPE`: `FCIERROR` = 5;
public const val `FCIERR_CAB_FILE`: `FCIERROR` = 6;
public const val `FCIERR_CAB_FORMAT_LIMIT`: `FCIERROR` = 9;
public const val `FCIERR_MCI_FAIL`: `FCIERROR` = 8;
public const val `FCIERR_NONE`: `FCIERROR` = 0;
public const val `FCIERR_OPEN_SRC`: `FCIERROR` = 1;
public const val `FCIERR_READ_SRC`: `FCIERROR` = 2;
public const val `FCIERR_TEMP_FILE`: `FCIERROR` = 4;
public const val `FCIERR_USER_ABORT`: `FCIERROR` = 7;
// UNSUPPORTED Rust 55:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct FDICABINETINFO {
//     pub cbCabinet: i32,
//     pub cFolders: u16,
//     pub cFiles: u16,
//     pub setID: u16,
//     pub iCabinet: u16,
//     pub fReserve: windows_sys::core::BOOL,
//     pub hasprev: windows_sys::core::BOOL,
//     pub hasnext: windows_sys::core::BOOL,
// }

public typealias `FDICREATE_CPU_TYPE` = Int;
// UNSUPPORTED Rust 68:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FDIDECRYPT {
//     pub fdidt: FDIDECRYPTTYPE,
//     pub pvUser: *mut core::ffi::c_void,
//     pub Anonymous: FDIDECRYPT_0,
// }

// UNSUPPORTED Rust 75:1: declaration Impl has no candidate rule
// impl Default for FDIDECRYPT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 80:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union FDIDECRYPT_0 {
//     pub cabinet: FDIDECRYPT_0_0,
//     pub folder: FDIDECRYPT_0_1,
//     pub decrypt: FDIDECRYPT_0_2,
// }

// UNSUPPORTED Rust 87:1: declaration Impl has no candidate rule
// impl Default for FDIDECRYPT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 92:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FDIDECRYPT_0_0 {
//     pub pHeaderReserve: *mut core::ffi::c_void,
//     pub cbHeaderReserve: u16,
//     pub setID: u16,
//     pub iCabinet: i32,
// }

// UNSUPPORTED Rust 100:1: declaration Impl has no candidate rule
// impl Default for FDIDECRYPT_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 105:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FDIDECRYPT_0_2 {
//     pub pDataReserve: *mut core::ffi::c_void,
//     pub cbDataReserve: u16,
//     pub pbData: *mut core::ffi::c_void,
//     pub cbData: u16,
//     pub fSplit: windows_sys::core::BOOL,
//     pub cbPartial: u16,
// }

// UNSUPPORTED Rust 115:1: declaration Impl has no candidate rule
// impl Default for FDIDECRYPT_0_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 120:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FDIDECRYPT_0_1 {
//     pub pFolderReserve: *mut core::ffi::c_void,
//     pub cbFolderReserve: u16,
//     pub iFolder: u16,
// }

// UNSUPPORTED Rust 127:1: declaration Impl has no candidate rule
// impl Default for FDIDECRYPT_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FDIDECRYPTTYPE` = Int;
public typealias `FDIERROR` = Int;
public const val `FDIERROR_ALLOC_FAIL`: `FDIERROR` = 5;
public const val `FDIERROR_BAD_COMPR_TYPE`: `FDIERROR` = 6;
public const val `FDIERROR_CABINET_NOT_FOUND`: `FDIERROR` = 1;
public const val `FDIERROR_CORRUPT_CABINET`: `FDIERROR` = 4;
public const val `FDIERROR_EOF`: `FDIERROR` = 12;
public const val `FDIERROR_MDI_FAIL`: `FDIERROR` = 7;
public const val `FDIERROR_NONE`: `FDIERROR` = 0;
public const val `FDIERROR_NOT_A_CABINET`: `FDIERROR` = 2;
public const val `FDIERROR_RESERVE_MISMATCH`: `FDIERROR` = 9;
public const val `FDIERROR_TARGET_FILE`: `FDIERROR` = 8;
public const val `FDIERROR_UNKNOWN_CABINET_VERSION`: `FDIERROR` = 3;
public const val `FDIERROR_USER_ABORT`: `FDIERROR` = 11;
public const val `FDIERROR_WRONG_CABINET`: `FDIERROR` = 10;
// UNSUPPORTED Rust 147:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FDINOTIFICATION {
//     pub cb: i32,
//     pub psz1: windows_sys::core::PSTR,
//     pub psz2: windows_sys::core::PSTR,
//     pub psz3: windows_sys::core::PSTR,
//     pub pv: *mut core::ffi::c_void,
//     pub hf: isize,
//     pub date: u16,
//     pub time: u16,
//     pub attribs: u16,
//     pub setID: u16,
//     pub iCabinet: u16,
//     pub iFolder: u16,
//     pub fdie: FDIERROR,
// }

// UNSUPPORTED Rust 164:1: declaration Impl has no candidate rule
// impl Default for FDINOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `FDINOTIFICATIONTYPE` = Int;
// UNSUPPORTED Rust 170:1: declaration Struct has no candidate rule
// #[repr(C, packed(1))]
// #[cfg(target_arch = "x86")]
// #[derive(Clone, Copy)]
// pub struct FDISPILLFILE {
//     pub ach: [i8; 2],
//     pub cbFile: i32,
// }

// UNSUPPORTED Rust 177:1: declaration Impl has no candidate rule
// #[cfg(target_arch = "x86")]
// impl Default for FDISPILLFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 183:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// #[derive(Clone, Copy)]
// pub struct FDISPILLFILE {
//     pub ach: [i8; 2],
//     pub cbFile: i32,
// }

// UNSUPPORTED Rust 190:1: declaration Impl has no candidate rule
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for FDISPILLFILE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `INCLUDED_FCI`: UInt = 1u;
public const val `INCLUDED_FDI`: UInt = 1u;
public const val `INCLUDED_TYPES_FCI_FDI`: UInt = 1u;
// UNSUPPORTED Rust 199:1: generic scalar type unsupported
// pub type PFNALLOC = Option<unsafe extern "system" fn(cb: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 200:1: generic scalar type unsupported
// pub type PFNCLOSE = Option<unsafe extern "system" fn(hf: isize) -> i32>;

// UNSUPPORTED Rust 201:1: generic scalar type unsupported
// pub type PFNFCIALLOC = Option<unsafe extern "system" fn(cb: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 202:1: generic scalar type unsupported
// pub type PFNFCICLOSE = Option<unsafe extern "system" fn(hf: isize, err: *mut i32, pv: *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 203:1: generic scalar type unsupported
// pub type PFNFCIDELETE = Option<unsafe extern "system" fn(pszfile: windows_sys::core::PCSTR, err: *mut i32, pv: *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 204:1: generic scalar type unsupported
// pub type PFNFCIFILEPLACED = Option<unsafe extern "system" fn(pccab: *mut CCAB, pszfile: windows_sys::core::PCSTR, cbfile: i32, fcontinuation: windows_sys::core::BOOL, pv: *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 205:1: generic scalar type unsupported
// pub type PFNFCIFREE = Option<unsafe extern "system" fn(memory: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 206:1: generic scalar type unsupported
// pub type PFNFCIGETNEXTCABINET = Option<unsafe extern "system" fn(pccab: *mut CCAB, cbprevcab: u32, pv: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 207:1: generic scalar type unsupported
// pub type PFNFCIGETOPENINFO = Option<unsafe extern "system" fn(pszname: windows_sys::core::PCSTR, pdate: *mut u16, ptime: *mut u16, pattribs: *mut u16, err: *mut i32, pv: *mut core::ffi::c_void) -> isize>;

// UNSUPPORTED Rust 208:1: generic scalar type unsupported
// pub type PFNFCIGETTEMPFILE = Option<unsafe extern "system" fn(psztempname: windows_sys::core::PSTR, cbtempname: i32, pv: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 209:1: generic scalar type unsupported
// pub type PFNFCIOPEN = Option<unsafe extern "system" fn(pszfile: windows_sys::core::PCSTR, oflag: i32, pmode: i32, err: *mut i32, pv: *mut core::ffi::c_void) -> isize>;

// UNSUPPORTED Rust 210:1: generic scalar type unsupported
// pub type PFNFCIREAD = Option<unsafe extern "system" fn(hf: isize, memory: *mut core::ffi::c_void, cb: u32, err: *mut i32, pv: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 211:1: generic scalar type unsupported
// pub type PFNFCISEEK = Option<unsafe extern "system" fn(hf: isize, dist: i32, seektype: i32, err: *mut i32, pv: *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 212:1: generic scalar type unsupported
// pub type PFNFCISTATUS = Option<unsafe extern "system" fn(typestatus: u32, cb1: u32, cb2: u32, pv: *mut core::ffi::c_void) -> i32>;

// UNSUPPORTED Rust 213:1: generic scalar type unsupported
// pub type PFNFCIWRITE = Option<unsafe extern "system" fn(hf: isize, memory: *mut core::ffi::c_void, cb: u32, err: *mut i32, pv: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 214:1: generic scalar type unsupported
// pub type PFNFDIDECRYPT = Option<unsafe extern "system" fn(pfdid: *mut FDIDECRYPT) -> i32>;

// UNSUPPORTED Rust 215:1: generic scalar type unsupported
// pub type PFNFDINOTIFY = Option<unsafe extern "system" fn(fdint: FDINOTIFICATIONTYPE, pfdin: *mut FDINOTIFICATION) -> isize>;

// UNSUPPORTED Rust 216:1: generic scalar type unsupported
// pub type PFNFREE = Option<unsafe extern "system" fn(pv: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 217:1: generic scalar type unsupported
// pub type PFNOPEN = Option<unsafe extern "system" fn(pszfile: windows_sys::core::PCSTR, oflag: i32, pmode: i32) -> isize>;

// UNSUPPORTED Rust 218:1: generic scalar type unsupported
// pub type PFNREAD = Option<unsafe extern "system" fn(hf: isize, pv: *mut core::ffi::c_void, cb: u32) -> u32>;

// UNSUPPORTED Rust 219:1: generic scalar type unsupported
// pub type PFNSEEK = Option<unsafe extern "system" fn(hf: isize, dist: i32, seektype: i32) -> i32>;

// UNSUPPORTED Rust 220:1: generic scalar type unsupported
// pub type PFNWRITE = Option<unsafe extern "system" fn(hf: isize, pv: *const core::ffi::c_void, cb: u32) -> u32>;

public const val `_A_EXEC`: UInt = 64u;
public const val `_A_NAME_IS_UTF`: UInt = 128u;
public const val `cpu80286`: `FDICREATE_CPU_TYPE` = 0;
public const val `cpu80386`: `FDICREATE_CPU_TYPE` = 1;
public const val `cpuUNKNOWN`: `FDICREATE_CPU_TYPE` = -1;
public const val `fdidtDECRYPT`: `FDIDECRYPTTYPE` = 2;
public const val `fdidtNEW_CABINET`: `FDIDECRYPTTYPE` = 0;
public const val `fdidtNEW_FOLDER`: `FDIDECRYPTTYPE` = 1;
public const val `fdintCABINET_INFO`: `FDINOTIFICATIONTYPE` = 0;
public const val `fdintCLOSE_FILE_INFO`: `FDINOTIFICATIONTYPE` = 3;
public const val `fdintCOPY_FILE`: `FDINOTIFICATIONTYPE` = 2;
public const val `fdintENUMERATE`: `FDINOTIFICATIONTYPE` = 5;
public const val `fdintNEXT_CABINET`: `FDINOTIFICATIONTYPE` = 4;
public const val `fdintPARTIAL_FILE`: `FDINOTIFICATIONTYPE` = 1;
public const val `statusCabinet`: UInt = 2u;
public const val `statusFile`: UInt = 0u;
public const val `statusFolder`: UInt = 1u;
public const val `tcompBAD`: UInt = 15u;
public const val `tcompLZX_WINDOW_HI`: UInt = 5376u;
public const val `tcompLZX_WINDOW_LO`: UInt = 3840u;
public const val `tcompMASK_LZX_WINDOW`: UInt = 7936u;
public const val `tcompMASK_QUANTUM_LEVEL`: UInt = 240u;
public const val `tcompMASK_QUANTUM_MEM`: UInt = 7936u;
public const val `tcompMASK_RESERVED`: UInt = 57344u;
public const val `tcompMASK_TYPE`: UInt = 15u;
public const val `tcompQUANTUM_LEVEL_HI`: UInt = 112u;
public const val `tcompQUANTUM_LEVEL_LO`: UInt = 16u;
public const val `tcompQUANTUM_MEM_HI`: UInt = 5376u;
public const val `tcompQUANTUM_MEM_LO`: UInt = 2560u;
public const val `tcompSHIFT_LZX_WINDOW`: UInt = 8u;
public const val `tcompSHIFT_QUANTUM_LEVEL`: UInt = 4u;
public const val `tcompSHIFT_QUANTUM_MEM`: UInt = 8u;
public const val `tcompTYPE_LZX`: UInt = 3u;
public const val `tcompTYPE_MSZIP`: UInt = 1u;
public const val `tcompTYPE_NONE`: UInt = 0u;
public const val `tcompTYPE_QUANTUM`: UInt = 2u;
