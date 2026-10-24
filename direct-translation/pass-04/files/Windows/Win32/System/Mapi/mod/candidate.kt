// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mapi32.dll, ABI=system, export=MAPIFreeBuffer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `MAPIFreeBuffer`(`pv` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPIADDRESS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, `windows_sys`.`core`.`PCSTR`, UInt, `windows_sys`.`core`.`PCSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiRecipDesc`>?, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MapiRecipDesc`>>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPIDELETEMAIL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, `windows_sys`.`core`.`PCSTR`, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPIDETAILS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiRecipDesc`>?, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPIFINDNEXT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, UInt, UInt, `windows_sys`.`core`.`PCSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPIFREEBUFFER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPILOGOFF` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPILOGON` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPIREADMAIL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, `windows_sys`.`core`.`PCSTR`, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MapiMessage`>>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPIRESOLVENAME` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, `windows_sys`.`core`.`PCSTR`, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MapiRecipDesc`>>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPISAVEMAIL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiMessage`>?, UInt, UInt, `windows_sys`.`core`.`PCSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPISENDDOCUMENTS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, `windows_sys`.`core`.`PCSTR`, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPISENDMAIL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiMessage`>?, UInt, UInt) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `LPMAPISENDMAILW` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<`MapiMessageW`>?, UInt, UInt) -> UInt>>>;
public const val `MAPI_AB_NOMODIFY`: UInt = 1024u;
public const val `MAPI_BCC`: UInt = 3u;
public const val `MAPI_BODY_AS_FILE`: UInt = 512u;
public const val `MAPI_CC`: UInt = 2u;
public const val `MAPI_DIALOG`: UInt = 8u;
public const val `MAPI_ENVELOPE_ONLY`: UInt = 64u;
public const val `MAPI_EXTENDED`: UInt = 32u;
public const val `MAPI_E_ACCESS_DENIED`: UInt = 6u;
public const val `MAPI_E_AMBIGUOUS_RECIPIENT`: UInt = 21u;
public const val `MAPI_E_AMBIG_RECIP`: UInt = 21u;
public const val `MAPI_E_ATTACHMENT_NOT_FOUND`: UInt = 11u;
public const val `MAPI_E_ATTACHMENT_OPEN_FAILURE`: UInt = 12u;
public const val `MAPI_E_ATTACHMENT_TOO_LARGE`: UInt = 28u;
public const val `MAPI_E_ATTACHMENT_WRITE_FAILURE`: UInt = 13u;
public const val `MAPI_E_BAD_RECIPTYPE`: UInt = 15u;
public const val `MAPI_E_DISK_FULL`: UInt = 4u;
public const val `MAPI_E_FAILURE`: UInt = 2u;
public const val `MAPI_E_INSUFFICIENT_MEMORY`: UInt = 5u;
public const val `MAPI_E_INVALID_EDITFIELDS`: UInt = 24u;
public const val `MAPI_E_INVALID_MESSAGE`: UInt = 17u;
public const val `MAPI_E_INVALID_RECIPS`: UInt = 25u;
public const val `MAPI_E_INVALID_SESSION`: UInt = 19u;
public const val `MAPI_E_LOGIN_FAILURE`: UInt = 3u;
public const val `MAPI_E_LOGON_FAILURE`: UInt = 3u;
public const val `MAPI_E_MESSAGE_IN_USE`: UInt = 22u;
public const val `MAPI_E_NETWORK_FAILURE`: UInt = 23u;
public const val `MAPI_E_NOT_SUPPORTED`: UInt = 26u;
public const val `MAPI_E_NO_MESSAGES`: UInt = 16u;
public const val `MAPI_E_TEXT_TOO_LARGE`: UInt = 18u;
public const val `MAPI_E_TOO_MANY_FILES`: UInt = 9u;
public const val `MAPI_E_TOO_MANY_RECIPIENTS`: UInt = 10u;
public const val `MAPI_E_TOO_MANY_SESSIONS`: UInt = 8u;
public const val `MAPI_E_TYPE_NOT_SUPPORTED`: UInt = 20u;
public const val `MAPI_E_UNICODE_NOT_SUPPORTED`: UInt = 27u;
public const val `MAPI_E_UNKNOWN_RECIPIENT`: UInt = 14u;
public const val `MAPI_E_USER_ABORT`: UInt = 1u;
public const val `MAPI_FORCE_DOWNLOAD`: UInt = 4096u;
public const val `MAPI_FORCE_UNICODE`: UInt = 262144u;
public const val `MAPI_GUARANTEE_FIFO`: UInt = 256u;
public const val `MAPI_LOGON_UI`: UInt = 1u;
public const val `MAPI_LONG_MSGID`: UInt = 16384u;
public const val `MAPI_NEW_SESSION`: UInt = 2u;
public const val `MAPI_OLE`: UInt = 1u;
public const val `MAPI_OLE_STATIC`: UInt = 2u;
public const val `MAPI_ORIG`: UInt = 0u;
public const val `MAPI_PASSWORD_UI`: UInt = 131072u;
public const val `MAPI_PEEK`: UInt = 128u;
public const val `MAPI_RECEIPT_REQUESTED`: UInt = 2u;
public const val `MAPI_SENT`: UInt = 4u;
public const val `MAPI_SUPPRESS_ATTACH`: UInt = 2048u;
public const val `MAPI_TO`: UInt = 1u;
public const val `MAPI_UNREAD`: UInt = 1u;
public const val `MAPI_UNREAD_ONLY`: UInt = 32u;
public const val `MAPI_USER_ABORT`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MapiFileDesc` (
    public var `ulReserved`: UInt,
    public var `flFlags`: UInt,
    public var `nPosition`: UInt,
    public var `lpszPathName`: `windows_sys`.`core`.`PSTR`,
    public var `lpszFileName`: `windows_sys`.`core`.`PSTR`,
    public var `lpFileType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 79:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MapiFileDesc {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MapiFileDescW` (
    public var `ulReserved`: UInt,
    public var `flFlags`: UInt,
    public var `nPosition`: UInt,
    public var `lpszPathName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszFileName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpFileType`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 94:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MapiFileDescW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MapiFileTagExt` (
    public var `ulReserved`: UInt,
    public var `cbTag`: UInt,
    public var `lpTag`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbEncoding`: UInt,
    public var `lpEncoding`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 108:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MapiFileTagExt {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MapiMessage` (
    public var `ulReserved`: UInt,
    public var `lpszSubject`: `windows_sys`.`core`.`PSTR`,
    public var `lpszNoteText`: `windows_sys`.`core`.`PSTR`,
    public var `lpszMessageType`: `windows_sys`.`core`.`PSTR`,
    public var `lpszDateReceived`: `windows_sys`.`core`.`PSTR`,
    public var `lpszConversationID`: `windows_sys`.`core`.`PSTR`,
    public var `flFlags`: UInt,
    public var `lpOriginator`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiRecipDesc`>?,
    public var `nRecipCount`: UInt,
    public var `lpRecips`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiRecipDesc`>?,
    public var `nFileCount`: UInt,
    public var `lpFiles`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiFileDesc`>?,
)
// UNSUPPORTED Rust 129:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MapiMessage {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MapiMessageW` (
    public var `ulReserved`: UInt,
    public var `lpszSubject`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszNoteText`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszMessageType`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszDateReceived`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszConversationID`: `windows_sys`.`core`.`PWSTR`,
    public var `flFlags`: UInt,
    public var `lpOriginator`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiRecipDescW`>?,
    public var `nRecipCount`: UInt,
    public var `lpRecips`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiRecipDescW`>?,
    public var `nFileCount`: UInt,
    public var `lpFiles`: /* Rust *mut */ kotlinx.cinterop.CPointer<`MapiFileDescW`>?,
)
// UNSUPPORTED Rust 150:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MapiMessageW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MapiRecipDesc` (
    public var `ulReserved`: UInt,
    public var `ulRecipClass`: UInt,
    public var `lpszName`: `windows_sys`.`core`.`PSTR`,
    public var `lpszAddress`: `windows_sys`.`core`.`PSTR`,
    public var `ulEIDSize`: UInt,
    public var `lpEntryID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 165:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MapiRecipDesc {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MapiRecipDescW` (
    public var `ulReserved`: UInt,
    public var `ulRecipClass`: UInt,
    public var `lpszName`: `windows_sys`.`core`.`PWSTR`,
    public var `lpszAddress`: `windows_sys`.`core`.`PWSTR`,
    public var `ulEIDSize`: UInt,
    public var `lpEntryID`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 180:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MapiRecipDescW {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SUCCESS_SUCCESS`: UInt = 0u;
