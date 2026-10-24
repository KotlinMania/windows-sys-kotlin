// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcproxy.dll, ABI=system, export=GetExtensionVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetExtensionVersion`(`pver` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HSE_VERSION_INFO`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcproxy.dll, ABI=system, export=GetFilterVersion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetFilterVersion`(`pver` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_FILTER_VERSION`>?) : `windows_sys`.`core`.`BOOL`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcproxy.dll, ABI=system, export=HttpExtensionProc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpExtensionProc`(`pecb` : /* Rust *const */ kotlinx.cinterop.CPointer<`EXTENSION_CONTROL_BLOCK`>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=rpcproxy.dll, ABI=system, export=HttpFilterProc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HttpFilterProc`(`pfc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_FILTER_CONTEXT`>?, `notificationtype` : UInt, `pvnotification` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : UInt
public const val `ADMINDATA_MAX_NAME_LEN`: UInt = 256u;
public const val `ALL_METADATA`: `METADATATYPES` = 0;
public const val `APPCTR_MD_ID_BEGIN_RESERVED`: UInt = 57344u;
public const val `APPCTR_MD_ID_END_RESERVED`: UInt = 61439u;
public const val `APPSTATUS_NOTDEFINED`: UInt = 2u;
public const val `APPSTATUS_RUNNING`: UInt = 1u;
public const val `APPSTATUS_STOPPED`: UInt = 0u;
public const val `ASP_MD_ID_BEGIN_RESERVED`: UInt = 28672u;
public const val `ASP_MD_ID_END_RESERVED`: UInt = 29951u;
public const val `ASP_MD_SERVER_BASE`: UInt = 7000u;
public const val `ASP_MD_UT_APP`: UInt = 101u;
public const val `BINARY_METADATA`: `METADATATYPES` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Security_Cryptography")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CERT_CONTEXT_EX` (
    public var `CertContext`: `super`.`super`.`Security`.`Cryptography`.`CERT_CONTEXT`,
    public var `cbAllocated`: UInt,
    public var `dwCertificateFlags`: UInt,
)
// UNSUPPORTED Rust 25:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_IImgCtx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3050f3d6_98b5_11cf_bb82_00aa00bdce0b);

// UNSUPPORTED Rust 26:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_IisServiceControl: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe8fb8621_588f_11d2_9d61_00c04f79c5fe);

// UNSUPPORTED Rust 27:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_MSAdminBase_W: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa9e69610_b80d_11d0_b9b9_00a0c922e750);

// UNSUPPORTED Rust 28:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_Request: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x920c25d0_25d9_11d0_a55f_00a0c90c2091);

// UNSUPPORTED Rust 29:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_Response: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x46e19ba0_25dd_11d0_a55f_00a0c90c2091);

// UNSUPPORTED Rust 30:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_ScriptingContext: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd97a6da0_a868_11cf_83ae_11b0c90c2bd8);

// UNSUPPORTED Rust 31:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_Server: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa506d160_25e0_11d0_a55f_00a0c90c2091);

// UNSUPPORTED Rust 32:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_Session: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x509f8f20_25de_11d0_a55f_00a0c90c2091);

// UNSUPPORTED Rust 33:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CLSID_WamAdmin: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x61738644_f196_11d0_9953_00c04fd919c1);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `CONFIGURATION_ENTRY` (
    public var `bstrKey`: `windows_sys`.`core`.`BSTR`,
    public var `bstrValue`: `windows_sys`.`core`.`BSTR`,
)
// UNSUPPORTED Rust 40:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for CONFIGURATION_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `DISPID_HTTPREQUEST_ABORT`: UInt = 12u;
public const val `DISPID_HTTPREQUEST_BASE`: UInt = 1u;
public const val `DISPID_HTTPREQUEST_GETALLRESPONSEHEADERS`: UInt = 4u;
public const val `DISPID_HTTPREQUEST_GETRESPONSEHEADER`: UInt = 3u;
public const val `DISPID_HTTPREQUEST_OPEN`: UInt = 1u;
public const val `DISPID_HTTPREQUEST_OPTION`: UInt = 6u;
public const val `DISPID_HTTPREQUEST_RESPONSEBODY`: UInt = 10u;
public const val `DISPID_HTTPREQUEST_RESPONSESTREAM`: UInt = 11u;
public const val `DISPID_HTTPREQUEST_RESPONSETEXT`: UInt = 9u;
public const val `DISPID_HTTPREQUEST_SEND`: UInt = 5u;
public const val `DISPID_HTTPREQUEST_SETAUTOLOGONPOLICY`: UInt = 18u;
public const val `DISPID_HTTPREQUEST_SETCLIENTCERTIFICATE`: UInt = 17u;
public const val `DISPID_HTTPREQUEST_SETCREDENTIALS`: UInt = 14u;
public const val `DISPID_HTTPREQUEST_SETPROXY`: UInt = 13u;
public const val `DISPID_HTTPREQUEST_SETREQUESTHEADER`: UInt = 2u;
public const val `DISPID_HTTPREQUEST_SETTIMEOUTS`: UInt = 16u;
public const val `DISPID_HTTPREQUEST_STATUS`: UInt = 7u;
public const val `DISPID_HTTPREQUEST_STATUSTEXT`: UInt = 8u;
public const val `DISPID_HTTPREQUEST_WAITFORRESPONSE`: UInt = 15u;
public const val `DWN_COLORMODE`: UInt = 63u;
public const val `DWN_DOWNLOADONLY`: UInt = 64u;
public const val `DWN_FORCEDITHER`: UInt = 128u;
public const val `DWN_MIRRORIMAGE`: UInt = 512u;
public const val `DWN_RAWIMAGE`: UInt = 256u;
public const val `DWORD_METADATA`: `METADATATYPES` = 1;
public const val `EXPANDSZ_METADATA`: `METADATATYPES` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 80 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EXTENSION_CONTROL_BLOCK` (
    public var `cbSize`: UInt,
    public var `dwVersion`: UInt,
    public var `ConnID`: `HCONN`,
    public var `dwHttpStatusCode`: UInt,
    public var `lpszLogData`: ByteArray,
    public var `lpszMethod`: `windows_sys`.`core`.`PSTR`,
    public var `lpszQueryString`: `windows_sys`.`core`.`PSTR`,
    public var `lpszPathInfo`: `windows_sys`.`core`.`PSTR`,
    public var `lpszPathTranslated`: `windows_sys`.`core`.`PSTR`,
    public var `cbTotalBytes`: UInt,
    public var `cbAvailable`: UInt,
    public var `lpbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `lpszContentType`: `windows_sys`.`core`.`PSTR`,
    public var `GetServerVariable`: `PFN_IIS_GETSERVERVARIABLE`,
    public var `WriteClient`: `PFN_IIS_WRITECLIENT`,
    public var `ReadClient`: `PFN_IIS_READCLIENT`,
    public var `ServerSupportFunction`: `PFN_IIS_SERVERSUPPORTFUNCTION`,
)
// UNSUPPORTED Rust 92:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EXTENSION_CONTROL_BLOCK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FP_MD_ID_BEGIN_RESERVED`: UInt = 32768u;
public const val `FP_MD_ID_END_RESERVED`: UInt = 36863u;
public typealias `FTP_ACCESS` = Int;
public const val `FTP_ACCESS_NONE`: `FTP_ACCESS` = 0;
public const val `FTP_ACCESS_READ`: `FTP_ACCESS` = 1;
public const val `FTP_ACCESS_READ_WRITE`: `FTP_ACCESS` = 3;
public const val `FTP_ACCESS_WRITE`: `FTP_ACCESS` = 2;
public const val `FTP_PROCESS_CLOSE_SESSION`: `FTP_PROCESS_STATUS` = 1;
public const val `FTP_PROCESS_CONTINUE`: `FTP_PROCESS_STATUS` = 0;
public const val `FTP_PROCESS_REJECT_COMMAND`: `FTP_PROCESS_STATUS` = 3;
public typealias `FTP_PROCESS_STATUS` = Int;
public const val `FTP_PROCESS_TERMINATE_SESSION`: `FTP_PROCESS_STATUS` = 2;
// UNSUPPORTED Rust 109:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FtpProvider: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x70bdc667_33b2_45f0_ac52_c3ca46f7a656);

// UNSUPPORTED Rust 110:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IIS_ALL_TRACE_PROVIDERS: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000);

// UNSUPPORTED Rust 111:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IIS_ASPNET_TRACE_PROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xaff081fe_0247_4275_9c4e_021f3dc1da35);

// UNSUPPORTED Rust 112:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IIS_ASP_TRACE_TRACE_PROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x06b94d9a_b15e_456e_a4ef_37c984a2cb4b);

// UNSUPPORTED Rust 113:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IIS_ISAPI_TRACE_PROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa1c2040e_8840_4c31_ba11_9871031a19ea);

// UNSUPPORTED Rust 114:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IIS_WWW_GLOBAL_TRACE_PROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd55d3bc9_cba9_44df_827e_132d3a4596c2);

// UNSUPPORTED Rust 115:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IIS_WWW_SERVER_TRACE_PROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a2a4e84_4c21_4981_ae10_3fda0d9b0f83);

// UNSUPPORTED Rust 116:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_IIS_WWW_SERVER_V2_TRACE_PROVIDER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xde4649c9_15e8_4fea_9d85_1cdda520c334);

// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCONN` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `HSE_APPEND_LOG_PARAMETER`: UInt = 1003u;
public const val `HSE_APP_FLAG_IN_PROCESS`: UInt = 0u;
public const val `HSE_APP_FLAG_ISOLATED_OOP`: UInt = 1u;
public const val `HSE_APP_FLAG_POOLED_OOP`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_CUSTOM_ERROR_INFO` (
    public var `pszStatus`: `windows_sys`.`core`.`PSTR`,
    public var `uHttpSubError`: UShort,
    public var `fAsync`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 129:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_CUSTOM_ERROR_INFO {
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
public class `HSE_EXEC_UNICODE_URL_INFO` (
    public var `pszUrl`: `windows_sys`.`core`.`PWSTR`,
    public var `pszMethod`: `windows_sys`.`core`.`PSTR`,
    public var `pszChildHeaders`: `windows_sys`.`core`.`PSTR`,
    public var `pUserInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HSE_EXEC_UNICODE_URL_USER_INFO`>?,
    public var `pEntity`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HSE_EXEC_URL_ENTITY_INFO`>?,
    public var `dwExecUrlFlags`: UInt,
)
// UNSUPPORTED Rust 144:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_EXEC_UNICODE_URL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_EXEC_UNICODE_URL_USER_INFO` (
    public var `hImpersonationToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pszCustomUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszCustomAuthType`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 156:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_EXEC_UNICODE_URL_USER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HSE_EXEC_URL_DISABLE_CUSTOM_ERROR`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_EXEC_URL_ENTITY_INFO` (
    public var `cbAvailable`: UInt,
    public var `lpbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 168:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_EXEC_URL_ENTITY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HSE_EXEC_URL_HTTP_CACHE_ELIGIBLE`: UInt = 128u;
public const val `HSE_EXEC_URL_IGNORE_CURRENT_INTERCEPTOR`: UInt = 4u;
public const val `HSE_EXEC_URL_IGNORE_VALIDATION_AND_RANGE`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_EXEC_URL_INFO` (
    public var `pszUrl`: `windows_sys`.`core`.`PSTR`,
    public var `pszMethod`: `windows_sys`.`core`.`PSTR`,
    public var `pszChildHeaders`: `windows_sys`.`core`.`PSTR`,
    public var `pUserInfo`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HSE_EXEC_URL_USER_INFO`>?,
    public var `pEntity`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HSE_EXEC_URL_ENTITY_INFO`>?,
    public var `dwExecUrlFlags`: UInt,
)
// UNSUPPORTED Rust 186:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_EXEC_URL_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HSE_EXEC_URL_NO_HEADERS`: UInt = 2u;
public const val `HSE_EXEC_URL_SSI_CMD`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HSE_EXEC_URL_STATUS` (
    public var `uHttpStatusCode`: UShort,
    public var `uHttpSubStatus`: UShort,
    public var `dwWin32Error`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_EXEC_URL_USER_INFO` (
    public var `hImpersonationToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pszCustomUserName`: `windows_sys`.`core`.`PSTR`,
    public var `pszCustomAuthType`: `windows_sys`.`core`.`PSTR`,
)
// UNSUPPORTED Rust 207:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_EXEC_URL_USER_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HSE_IO_ASYNC`: UInt = 2u;
public const val `HSE_IO_CACHE_RESPONSE`: UInt = 32u;
public const val `HSE_IO_DISCONNECT_AFTER_SEND`: UInt = 4u;
public const val `HSE_IO_FINAL_SEND`: UInt = 16u;
public const val `HSE_IO_NODELAY`: UInt = 4096u;
public const val `HSE_IO_SEND_HEADERS`: UInt = 8u;
public const val `HSE_IO_SYNC`: UInt = 1u;
public const val `HSE_IO_TRY_SKIP_CUSTOM_ERRORS`: UInt = 64u;
public const val `HSE_LOG_BUFFER_LEN`: UInt = 80u;
public const val `HSE_MAX_EXT_DLL_NAME_LEN`: UInt = 256u;
public const val `HSE_REQ_ABORTIVE_CLOSE`: UInt = 1014u;
public const val `HSE_REQ_ASYNC_READ_CLIENT`: UInt = 1010u;
public const val `HSE_REQ_BASE`: UInt = 0u;
public const val `HSE_REQ_CANCEL_IO`: UInt = 1049u;
public const val `HSE_REQ_CLOSE_CONNECTION`: UInt = 1017u;
public const val `HSE_REQ_DONE_WITH_SESSION`: UInt = 4u;
public const val `HSE_REQ_END_RESERVED`: UInt = 1000u;
public const val `HSE_REQ_EXEC_UNICODE_URL`: UInt = 1025u;
public const val `HSE_REQ_EXEC_URL`: UInt = 1026u;
public const val `HSE_REQ_GET_ANONYMOUS_TOKEN`: UInt = 1038u;
public const val `HSE_REQ_GET_CACHE_INVALIDATION_CALLBACK`: UInt = 1040u;
public const val `HSE_REQ_GET_CERT_INFO_EX`: UInt = 1015u;
public const val `HSE_REQ_GET_CHANNEL_BINDING_TOKEN`: UInt = 1050u;
public const val `HSE_REQ_GET_CONFIG_OBJECT`: UInt = 1046u;
public const val `HSE_REQ_GET_EXEC_URL_STATUS`: UInt = 1027u;
public const val `HSE_REQ_GET_IMPERSONATION_TOKEN`: UInt = 1011u;
public const val `HSE_REQ_GET_PROTOCOL_MANAGER_CUSTOM_INTERFACE_CALLBACK`: UInt = 1048u;
public const val `HSE_REQ_GET_SSPI_INFO`: UInt = 1002u;
public const val `HSE_REQ_GET_TRACE_INFO`: UInt = 1042u;
public const val `HSE_REQ_GET_TRACE_INFO_EX`: UInt = 1044u;
public const val `HSE_REQ_GET_UNICODE_ANONYMOUS_TOKEN`: UInt = 1041u;
public const val `HSE_REQ_GET_WORKER_PROCESS_SETTINGS`: UInt = 1047u;
public const val `HSE_REQ_IO_COMPLETION`: UInt = 1005u;
public const val `HSE_REQ_IS_CONNECTED`: UInt = 1018u;
public const val `HSE_REQ_IS_IN_PROCESS`: UInt = 1030u;
public const val `HSE_REQ_IS_KEEP_CONN`: UInt = 1008u;
public const val `HSE_REQ_MAP_UNICODE_URL_TO_PATH`: UInt = 1023u;
public const val `HSE_REQ_MAP_UNICODE_URL_TO_PATH_EX`: UInt = 1024u;
public const val `HSE_REQ_MAP_URL_TO_PATH`: UInt = 1001u;
public const val `HSE_REQ_MAP_URL_TO_PATH_EX`: UInt = 1012u;
public const val `HSE_REQ_NORMALIZE_URL`: UInt = 1033u;
public const val `HSE_REQ_RAISE_TRACE_EVENT`: UInt = 1045u;
public const val `HSE_REQ_REFRESH_ISAPI_ACL`: UInt = 1007u;
public const val `HSE_REQ_REPORT_UNHEALTHY`: UInt = 1032u;
public const val `HSE_REQ_SEND_CUSTOM_ERROR`: UInt = 1028u;
public const val `HSE_REQ_SEND_RESPONSE_HEADER`: UInt = 3u;
public const val `HSE_REQ_SEND_RESPONSE_HEADER_EX`: UInt = 1016u;
public const val `HSE_REQ_SEND_URL`: UInt = 2u;
public const val `HSE_REQ_SEND_URL_REDIRECT_RESP`: UInt = 1u;
public const val `HSE_REQ_SET_FLUSH_FLAG`: UInt = 1043u;
public const val `HSE_REQ_TRANSMIT_FILE`: UInt = 1006u;
public const val `HSE_REQ_VECTOR_SEND`: UInt = 1037u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_RESPONSE_VECTOR` (
    public var `dwFlags`: UInt,
    public var `pszStatus`: `windows_sys`.`core`.`PSTR`,
    public var `pszHeaders`: `windows_sys`.`core`.`PSTR`,
    public var `nElementCount`: UInt,
    public var `lpElementArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HSE_VECTOR_ELEMENT`>?,
)
// UNSUPPORTED Rust 273:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_RESPONSE_VECTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_SEND_HEADER_EX_INFO` (
    public var `pszStatus`: `windows_sys`.`core`.`PCSTR`,
    public var `pszHeader`: `windows_sys`.`core`.`PCSTR`,
    public var `cchStatus`: UInt,
    public var `cchHeader`: UInt,
    public var `fKeepConn`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 287:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_SEND_HEADER_EX_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HSE_STATUS_ERROR`: UInt = 4u;
public const val `HSE_STATUS_PENDING`: UInt = 3u;
public const val `HSE_STATUS_SUCCESS`: UInt = 1u;
public const val `HSE_STATUS_SUCCESS_AND_KEEP_CONN`: UInt = 2u;
public const val `HSE_TERM_ADVISORY_UNLOAD`: UInt = 1u;
public const val `HSE_TERM_MUST_UNLOAD`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_TF_INFO` (
    public var `pfnHseIO`: `PFN_HSE_IO_COMPLETION`,
    public var `pContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `hFile`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `pszStatusCode`: `windows_sys`.`core`.`PCSTR`,
    public var `BytesToWrite`: UInt,
    public var `Offset`: UInt,
    public var `pHead`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `HeadLength`: UInt,
    public var `pTail`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `TailLength`: UInt,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 313:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_TF_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_TRACE_INFO` (
    public var `fTraceRequest`: `windows_sys`.`core`.`BOOL`,
    public var `TraceContextId`: UByteArray,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
)
// UNSUPPORTED Rust 326:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_TRACE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_UNICODE_URL_MAPEX_INFO` (
    public var `lpszPath`: UShortArray,
    public var `dwFlags`: UInt,
    public var `cchMatchingPath`: UInt,
    public var `cchMatchingURL`: UInt,
)
// UNSUPPORTED Rust 339:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_UNICODE_URL_MAPEX_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HSE_URL_FLAGS_DONT_CACHE`: UInt = 16u;
public const val `HSE_URL_FLAGS_EXECUTE`: UInt = 4u;
public const val `HSE_URL_FLAGS_MAP_CERT`: UInt = 128u;
public const val `HSE_URL_FLAGS_MASK`: UInt = 1023u;
public const val `HSE_URL_FLAGS_NEGO_CERT`: UInt = 32u;
public const val `HSE_URL_FLAGS_READ`: UInt = 1u;
public const val `HSE_URL_FLAGS_REQUIRE_CERT`: UInt = 64u;
public const val `HSE_URL_FLAGS_SCRIPT`: UInt = 512u;
public const val `HSE_URL_FLAGS_SSL`: UInt = 8u;
public const val `HSE_URL_FLAGS_SSL128`: UInt = 256u;
public const val `HSE_URL_FLAGS_WRITE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_URL_MAPEX_INFO` (
    public var `lpszPath`: ByteArray,
    public var `dwFlags`: UInt,
    public var `cchMatchingPath`: UInt,
    public var `cchMatchingURL`: UInt,
    public var `dwReserved1`: UInt,
    public var `dwReserved2`: UInt,
)
// UNSUPPORTED Rust 365:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_URL_MAPEX_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_VECTOR_ELEMENT` (
    public var `ElementType`: UInt,
    public var `pvContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbOffset`: ULong,
    public var `cbSize`: ULong,
)
// UNSUPPORTED Rust 378:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_VECTOR_ELEMENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HSE_VECTOR_ELEMENT_TYPE_FILE_HANDLE`: UInt = 1u;
public const val `HSE_VECTOR_ELEMENT_TYPE_MEMORY_BUFFER`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HSE_VERSION_INFO` (
    public var `dwExtensionVersion`: UInt,
    public var `lpszExtensionDesc`: ByteArray,
)
// UNSUPPORTED Rust 391:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HSE_VERSION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HSE_VERSION_MAJOR`: UInt = 8u;
public const val `HSE_VERSION_MINOR`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_FILTER_ACCESS_DENIED` (
    public var `pszURL`: `windows_sys`.`core`.`PCSTR`,
    public var `pszPhysicalPath`: `windows_sys`.`core`.`PCSTR`,
    public var `dwReason`: UInt,
)
// UNSUPPORTED Rust 405:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_FILTER_ACCESS_DENIED {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_FILTER_AUTHENT` (
    public var `pszUser`: `windows_sys`.`core`.`PSTR`,
    public var `cbUserBuff`: UInt,
    public var `pszPassword`: `windows_sys`.`core`.`PSTR`,
    public var `cbPasswordBuff`: UInt,
)
// UNSUPPORTED Rust 418:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_FILTER_AUTHENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_FILTER_AUTH_COMPLETE_INFO` (
    public var `GetHeader`: Long,
    public var `SetHeader`: Long,
    public var `AddHeader`: Long,
    public var `GetUserToken`: Long,
    public var `HttpStatus`: UInt,
    public var `fResetAuth`: `windows_sys`.`core`.`BOOL`,
    public var `dwReserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_FILTER_CONTEXT` (
    public var `cbSize`: UInt,
    public var `Revision`: UInt,
    public var `ServerContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulReserved`: UInt,
    public var `fIsSecurePort`: `windows_sys`.`core`.`BOOL`,
    public var `pFilterContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `GetServerVariable`: Long,
    public var `AddResponseHeaders`: Long,
    public var `WriteClient`: Long,
    public var `AllocMem`: Long,
    public var `ServerSupportFunction`: Long,
)
// UNSUPPORTED Rust 449:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_FILTER_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_FILTER_LOG` (
    public var `pszClientHostName`: `windows_sys`.`core`.`PCSTR`,
    public var `pszClientUserName`: `windows_sys`.`core`.`PCSTR`,
    public var `pszServerName`: `windows_sys`.`core`.`PCSTR`,
    public var `pszOperation`: `windows_sys`.`core`.`PCSTR`,
    public var `pszTarget`: `windows_sys`.`core`.`PCSTR`,
    public var `pszParameters`: `windows_sys`.`core`.`PCSTR`,
    public var `dwHttpStatus`: UInt,
    public var `dwWin32Status`: UInt,
    public var `dwBytesSent`: UInt,
    public var `dwBytesRecvd`: UInt,
    public var `msTimeForProcessing`: UInt,
)
// UNSUPPORTED Rust 469:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_FILTER_LOG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HTTP_FILTER_PREPROC_HEADERS` (
    public var `GetHeader`: Long,
    public var `SetHeader`: Long,
    public var `AddHeader`: Long,
    public var `HttpStatus`: UInt,
    public var `dwReserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_FILTER_RAW_DATA` (
    public var `pvInData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `cbInData`: UInt,
    public var `cbInBuffer`: UInt,
    public var `dwReserved`: UInt,
)
// UNSUPPORTED Rust 491:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_FILTER_RAW_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_FILTER_URL_MAP` (
    public var `pszURL`: `windows_sys`.`core`.`PCSTR`,
    public var `pszPhysicalPath`: `windows_sys`.`core`.`PSTR`,
    public var `cbPathBuff`: UInt,
)
// UNSUPPORTED Rust 503:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_FILTER_URL_MAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_FILTER_URL_MAP_EX` (
    public var `pszURL`: `windows_sys`.`core`.`PCSTR`,
    public var `pszPhysicalPath`: `windows_sys`.`core`.`PSTR`,
    public var `cbPathBuff`: UInt,
    public var `dwFlags`: UInt,
    public var `cchMatchingPath`: UInt,
    public var `cchMatchingURL`: UInt,
    public var `pszScriptMapEntry`: `windows_sys`.`core`.`PCSTR`,
)
// UNSUPPORTED Rust 519:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_FILTER_URL_MAP_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_FILTER_VERSION` (
    public var `dwServerFilterVersion`: UInt,
    public var `dwFilterVersion`: UInt,
    public var `lpszFilterDesc`: ByteArray,
    public var `dwFlags`: UInt,
)
// UNSUPPORTED Rust 532:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_FILTER_VERSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_TRACE_CONFIGURATION` (
    public var `pProviderGuid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `dwAreas`: UInt,
    public var `dwVerbosity`: UInt,
    public var `fProviderEnabled`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 545:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_TRACE_CONFIGURATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_TRACE_EVENT` (
    public var `pProviderGuid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `dwArea`: UInt,
    public var `pAreaGuid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `dwEvent`: UInt,
    public var `pszEventName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwEventVersion`: UInt,
    public var `dwVerbosity`: UInt,
    public var `pActivityGuid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `pRelatedActivityGuid`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?,
    public var `dwTimeStamp`: UInt,
    public var `dwFlags`: UInt,
    public var `cEventItems`: UInt,
    public var `pEventItems`: /* Rust *mut */ kotlinx.cinterop.CPointer<`HTTP_TRACE_EVENT_ITEM`>?,
)
// UNSUPPORTED Rust 567:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_TRACE_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_TRACE_EVENT_FLAG_STATIC_DESCRIPTIVE_FIELDS`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HTTP_TRACE_EVENT_ITEM` (
    public var `pszName`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwDataType`: `HTTP_TRACE_TYPE`,
    public var `pbData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `cbData`: UInt,
    public var `pszDataDescription`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 582:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for HTTP_TRACE_EVENT_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `HTTP_TRACE_LEVEL_END`: UInt = 7u;
public const val `HTTP_TRACE_LEVEL_START`: UInt = 6u;
public typealias `HTTP_TRACE_TYPE` = Int;
public const val `HTTP_TRACE_TYPE_BOOL`: `HTTP_TRACE_TYPE` = 11;
public const val `HTTP_TRACE_TYPE_BYTE`: `HTTP_TRACE_TYPE` = 17;
public const val `HTTP_TRACE_TYPE_CHAR`: `HTTP_TRACE_TYPE` = 16;
public const val `HTTP_TRACE_TYPE_LONG`: `HTTP_TRACE_TYPE` = 3;
public const val `HTTP_TRACE_TYPE_LONGLONG`: `HTTP_TRACE_TYPE` = 20;
public const val `HTTP_TRACE_TYPE_LPCGUID`: `HTTP_TRACE_TYPE` = 72;
public const val `HTTP_TRACE_TYPE_LPCSTR`: `HTTP_TRACE_TYPE` = 30;
public const val `HTTP_TRACE_TYPE_LPCWSTR`: `HTTP_TRACE_TYPE` = 31;
public const val `HTTP_TRACE_TYPE_SHORT`: `HTTP_TRACE_TYPE` = 2;
public const val `HTTP_TRACE_TYPE_ULONG`: `HTTP_TRACE_TYPE` = 19;
public const val `HTTP_TRACE_TYPE_ULONGLONG`: `HTTP_TRACE_TYPE` = 21;
public const val `HTTP_TRACE_TYPE_USHORT`: `HTTP_TRACE_TYPE` = 18;
// UNSUPPORTED Rust 602:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IISADMIN_EXTENSIONS_CLSID_MD_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("LM/IISADMIN/EXTENSIONS/DCOMCLSIDS");

// UNSUPPORTED Rust 603:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IISADMIN_EXTENSIONS_CLSID_MD_KEYA: windows_sys::core::PCSTR = windows_sys::core::s!("LM/IISADMIN/EXTENSIONS/DCOMCLSIDS");

// UNSUPPORTED Rust 604:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IISADMIN_EXTENSIONS_CLSID_MD_KEYW: windows_sys::core::PCWSTR = windows_sys::core::w!("LM/IISADMIN/EXTENSIONS/DCOMCLSIDS");

// UNSUPPORTED Rust 605:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IISADMIN_EXTENSIONS_REG_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("SOFTWARE\\Microsoft\\InetStp\\Extensions");

// UNSUPPORTED Rust 606:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IISADMIN_EXTENSIONS_REG_KEYA: windows_sys::core::PCSTR = windows_sys::core::s!("SOFTWARE\\Microsoft\\InetStp\\Extensions");

// UNSUPPORTED Rust 607:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IISADMIN_EXTENSIONS_REG_KEYW: windows_sys::core::PCWSTR = windows_sys::core::w!("SOFTWARE\\Microsoft\\InetStp\\Extensions");

// UNSUPPORTED Rust 608:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_CERTMAPPER: windows_sys::core::PCSTR = windows_sys::core::s!("IIsCertMapper");

// UNSUPPORTED Rust 609:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_CERTMAPPER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsCertMapper");

// UNSUPPORTED Rust 610:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_COMPRESS_SCHEME: windows_sys::core::PCSTR = windows_sys::core::s!("IIsCompressionScheme");

// UNSUPPORTED Rust 611:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_COMPRESS_SCHEMES: windows_sys::core::PCSTR = windows_sys::core::s!("IIsCompressionSchemes");

// UNSUPPORTED Rust 612:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_COMPRESS_SCHEMES_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsCompressionSchemes");

// UNSUPPORTED Rust 613:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_COMPRESS_SCHEME_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsCompressionScheme");

// UNSUPPORTED Rust 614:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_COMPUTER: windows_sys::core::PCSTR = windows_sys::core::s!("IIsComputer");

// UNSUPPORTED Rust 615:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_COMPUTER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsComputer");

// UNSUPPORTED Rust 616:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FILTER: windows_sys::core::PCSTR = windows_sys::core::s!("IIsFilter");

// UNSUPPORTED Rust 617:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FILTERS: windows_sys::core::PCSTR = windows_sys::core::s!("IIsFilters");

// UNSUPPORTED Rust 618:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FILTERS_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsFilters");

// UNSUPPORTED Rust 619:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FILTER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsFilter");

// UNSUPPORTED Rust 620:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FTP_INFO: windows_sys::core::PCSTR = windows_sys::core::s!("IIsFtpInfo");

// UNSUPPORTED Rust 621:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FTP_INFO_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsFtpInfo");

// UNSUPPORTED Rust 622:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FTP_SERVER: windows_sys::core::PCSTR = windows_sys::core::s!("IIsFtpServer");

// UNSUPPORTED Rust 623:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FTP_SERVER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsFtpServer");

// UNSUPPORTED Rust 624:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FTP_SERVICE: windows_sys::core::PCSTR = windows_sys::core::s!("IIsFtpService");

// UNSUPPORTED Rust 625:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FTP_SERVICE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsFtpService");

// UNSUPPORTED Rust 626:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FTP_VDIR: windows_sys::core::PCSTR = windows_sys::core::s!("IIsFtpVirtualDir");

// UNSUPPORTED Rust 627:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_FTP_VDIR_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsFtpVirtualDir");

// UNSUPPORTED Rust 628:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_LOG_MODULE: windows_sys::core::PCSTR = windows_sys::core::s!("IIsLogModule");

// UNSUPPORTED Rust 629:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_LOG_MODULES: windows_sys::core::PCSTR = windows_sys::core::s!("IIsLogModules");

// UNSUPPORTED Rust 630:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_LOG_MODULES_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsLogModules");

// UNSUPPORTED Rust 631:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_LOG_MODULE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsLogModule");

// UNSUPPORTED Rust 632:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_MIMEMAP: windows_sys::core::PCSTR = windows_sys::core::s!("IIsMimeMap");

// UNSUPPORTED Rust 633:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_MIMEMAP_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsMimeMap");

// UNSUPPORTED Rust 634:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_DIR: windows_sys::core::PCSTR = windows_sys::core::s!("IIsWebDirectory");

// UNSUPPORTED Rust 635:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_DIR_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsWebDirectory");

// UNSUPPORTED Rust 636:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_FILE: windows_sys::core::PCSTR = windows_sys::core::s!("IIsWebFile");

// UNSUPPORTED Rust 637:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_FILE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsWebFile");

// UNSUPPORTED Rust 638:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_INFO: windows_sys::core::PCSTR = windows_sys::core::s!("IIsWebInfo");

// UNSUPPORTED Rust 639:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_INFO_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsWebInfo");

// UNSUPPORTED Rust 640:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_SERVER: windows_sys::core::PCSTR = windows_sys::core::s!("IIsWebServer");

// UNSUPPORTED Rust 641:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_SERVER_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsWebServer");

// UNSUPPORTED Rust 642:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_SERVICE: windows_sys::core::PCSTR = windows_sys::core::s!("IIsWebService");

// UNSUPPORTED Rust 643:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_SERVICE_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsWebService");

// UNSUPPORTED Rust 644:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_VDIR: windows_sys::core::PCSTR = windows_sys::core::s!("IIsWebVirtualDir");

// UNSUPPORTED Rust 645:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_CLASS_WEB_VDIR_W: windows_sys::core::PCWSTR = windows_sys::core::w!("IIsWebVirtualDir");

public const val `IIS_MD_ADSI_METAID_BEGIN`: UInt = 130000u;
// UNSUPPORTED Rust 647:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_MD_ADSI_SCHEMA_PATH_A: windows_sys::core::PCSTR = windows_sys::core::s!("/Schema");

// UNSUPPORTED Rust 648:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_MD_ADSI_SCHEMA_PATH_W: windows_sys::core::PCWSTR = windows_sys::core::w!("/Schema");

public const val `IIS_MD_APPPOOL_BASE`: UInt = 9000u;
public const val `IIS_MD_APP_BASE`: UInt = 9100u;
public const val `IIS_MD_FILE_PROP_BASE`: UInt = 6000u;
public const val `IIS_MD_FTP_BASE`: UInt = 5000u;
public const val `IIS_MD_GLOBAL_BASE`: UInt = 9200u;
public const val `IIS_MD_HTTP_BASE`: UInt = 2000u;
public const val `IIS_MD_ID_BEGIN_RESERVED`: UInt = 1u;
public const val `IIS_MD_ID_END_RESERVED`: UInt = 32767u;
// UNSUPPORTED Rust 657:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_MD_INSTANCE_ROOT: windows_sys::core::PCSTR = windows_sys::core::s!("Root");

// UNSUPPORTED Rust 658:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_MD_ISAPI_FILTERS: windows_sys::core::PCSTR = windows_sys::core::s!("/Filters");

// UNSUPPORTED Rust 659:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_MD_LOCAL_MACHINE_PATH: windows_sys::core::PCSTR = windows_sys::core::s!("LM");

public const val `IIS_MD_LOGCUSTOM_BASE`: UInt = 4500u;
public const val `IIS_MD_LOGCUSTOM_LAST`: UInt = 4508u;
public const val `IIS_MD_LOG_BASE`: UInt = 4000u;
public const val `IIS_MD_LOG_LAST`: UInt = 4015u;
public const val `IIS_MD_SERVER_BASE`: UInt = 1000u;
public const val `IIS_MD_SSL_BASE`: UInt = 5500u;
// UNSUPPORTED Rust 666:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_MD_SVC_INFO_PATH: windows_sys::core::PCSTR = windows_sys::core::s!("Info");

public const val `IIS_MD_UT_END_RESERVED`: UInt = 2000u;
public const val `IIS_MD_UT_FILE`: UInt = 2u;
public const val `IIS_MD_UT_SERVER`: UInt = 1u;
public const val `IIS_MD_UT_WAM`: UInt = 100u;
public const val `IIS_MD_VR_BASE`: UInt = 3000u;
// UNSUPPORTED Rust 672:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_WEBSOCKET: windows_sys::core::PCWSTR = windows_sys::core::w!("websockets");

// UNSUPPORTED Rust 673:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const IIS_WEBSOCKET_SERVER_VARIABLE: windows_sys::core::PCSTR = windows_sys::core::s!("IIS_WEBSOCK");

public const val `IMAP_MD_ID_BEGIN_RESERVED`: UInt = 49152u;
public const val `IMAP_MD_ID_END_RESERVED`: UInt = 53247u;
public const val `IMGANIM_ANIMATED`: UInt = 268435456u;
public const val `IMGANIM_MASK`: UInt = 268435456u;
public const val `IMGBITS_MASK`: UInt = 234881024u;
public const val `IMGBITS_NONE`: UInt = 33554432u;
public const val `IMGBITS_PARTIAL`: UInt = 67108864u;
public const val `IMGBITS_TOTAL`: UInt = 134217728u;
public const val `IMGCHG_ANIMATE`: UInt = 8u;
public const val `IMGCHG_COMPLETE`: UInt = 4u;
public const val `IMGCHG_MASK`: UInt = 15u;
public const val `IMGCHG_SIZE`: UInt = 1u;
public const val `IMGCHG_VIEW`: UInt = 2u;
public const val `IMGLOAD_COMPLETE`: UInt = 16777216u;
public const val `IMGLOAD_ERROR`: UInt = 8388608u;
public const val `IMGLOAD_LOADING`: UInt = 2097152u;
public const val `IMGLOAD_MASK`: UInt = 32505856u;
public const val `IMGLOAD_NOTLOADED`: UInt = 1048576u;
public const val `IMGLOAD_STOPPED`: UInt = 4194304u;
public const val `IMGTRANS_MASK`: UInt = 536870912u;
public const val `IMGTRANS_OPAQUE`: UInt = 536870912u;
public const val `INVALID_END_METADATA`: `METADATATYPES` = 6;
// UNSUPPORTED Rust 696:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LIBID_ASPTypeLibrary: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd97a6da0_a85c_11cf_83ae_00a0c90c2bd8);

// UNSUPPORTED Rust 697:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LIBID_IISRSTALib: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe8fb8614_588f_11d2_9d61_00c04f79c5fe);

// UNSUPPORTED Rust 698:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LIBID_WAMREGLib: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x29822aa8_f302_11d0_9953_00c04fd919c1);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LOGGING_PARAMETERS` (
    public var `pszSessionId`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszSiteName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszUserName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszHostName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszRemoteIpAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwRemoteIpPort`: UInt,
    public var `pszLocalIpAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwLocalIpPort`: UInt,
    public var `BytesSent`: ULong,
    public var `BytesReceived`: ULong,
    public var `pszCommand`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszCommandParameters`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszFullPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwElapsedMilliseconds`: UInt,
    public var `FtpStatus`: UInt,
    public var `FtpSubStatus`: UInt,
    public var `hrStatus`: `windows_sys`.`core`.`HRESULT`,
    public var `pszInformation`: `windows_sys`.`core`.`PCWSTR`,
)
// UNSUPPORTED Rust 721:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for LOGGING_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MB_DONT_IMPERSONATE`: UInt = 9033u;
public const val `MD_ACCESS_EXECUTE`: UInt = 4u;
public const val `MD_ACCESS_MAP_CERT`: UInt = 128u;
public const val `MD_ACCESS_MASK`: UInt = 65535u;
public const val `MD_ACCESS_NEGO_CERT`: UInt = 32u;
public const val `MD_ACCESS_NO_PHYSICAL_DIR`: UInt = 32768u;
public const val `MD_ACCESS_NO_REMOTE_EXECUTE`: UInt = 8192u;
public const val `MD_ACCESS_NO_REMOTE_READ`: UInt = 4096u;
public const val `MD_ACCESS_NO_REMOTE_SCRIPT`: UInt = 16384u;
public const val `MD_ACCESS_NO_REMOTE_WRITE`: UInt = 1024u;
public const val `MD_ACCESS_PERM`: UInt = 6016u;
public const val `MD_ACCESS_READ`: UInt = 1u;
public const val `MD_ACCESS_REQUIRE_CERT`: UInt = 64u;
public const val `MD_ACCESS_SCRIPT`: UInt = 512u;
public const val `MD_ACCESS_SOURCE`: UInt = 16u;
public const val `MD_ACCESS_SSL`: UInt = 8u;
public const val `MD_ACCESS_SSL128`: UInt = 256u;
public const val `MD_ACCESS_WRITE`: UInt = 2u;
public const val `MD_ACR_ENUM_KEYS`: UInt = 8u;
public const val `MD_ACR_READ`: UInt = 1u;
public const val `MD_ACR_RESTRICTED_WRITE`: UInt = 32u;
public const val `MD_ACR_UNSECURE_PROPS_READ`: UInt = 128u;
public const val `MD_ACR_WRITE`: UInt = 2u;
public const val `MD_ACR_WRITE_DAC`: UInt = 262144u;
public const val `MD_ADMIN_ACL`: UInt = 6027u;
public const val `MD_ADMIN_INSTANCE`: UInt = 2115u;
public const val `MD_ADV_CACHE_TTL`: UInt = 2064u;
public const val `MD_ADV_NOTIFY_PWD_EXP_IN_DAYS`: UInt = 2063u;
public const val `MD_AD_CONNECTIONS_PASSWORD`: UInt = 5015u;
public const val `MD_AD_CONNECTIONS_USERNAME`: UInt = 5014u;
public const val `MD_ALLOW_ANONYMOUS`: UInt = 5005u;
public const val `MD_ALLOW_KEEPALIVES`: UInt = 6038u;
public const val `MD_ALLOW_PATH_INFO_FOR_SCRIPT_MAPPINGS`: UInt = 2095u;
public const val `MD_ALLOW_REPLACE_ON_RENAME`: UInt = 5009u;
public const val `MD_ANONYMOUS_ONLY`: UInt = 5006u;
public const val `MD_ANONYMOUS_PWD`: UInt = 6021u;
public const val `MD_ANONYMOUS_USER_NAME`: UInt = 6020u;
public const val `MD_ANONYMOUS_USE_SUBAUTH`: UInt = 6022u;
public const val `MD_APPPOOL_32_BIT_APP_ON_WIN64`: UInt = 9040u;
public const val `MD_APPPOOL_ALLOW_TRANSIENT_REGISTRATION`: UInt = 9202u;
public const val `MD_APPPOOL_APPPOOL_ID`: UInt = 9201u;
public const val `MD_APPPOOL_AUTO_SHUTDOWN_EXE`: UInt = 9035u;
public const val `MD_APPPOOL_AUTO_SHUTDOWN_PARAMS`: UInt = 9036u;
public const val `MD_APPPOOL_AUTO_START`: UInt = 9028u;
public const val `MD_APPPOOL_COMMAND`: UInt = 9026u;
public const val `MD_APPPOOL_COMMAND_START`: UInt = 1u;
public const val `MD_APPPOOL_COMMAND_STOP`: UInt = 2u;
public const val `MD_APPPOOL_DISALLOW_OVERLAPPING_ROTATION`: UInt = 9015u;
public const val `MD_APPPOOL_DISALLOW_ROTATION_ON_CONFIG_CHANGE`: UInt = 9018u;
public const val `MD_APPPOOL_EMULATION_ON_WINARM64`: UInt = 9043u;
public const val `MD_APPPOOL_IDENTITY_TYPE`: UInt = 9021u;
public const val `MD_APPPOOL_IDENTITY_TYPE_LOCALSERVICE`: UInt = 1u;
public const val `MD_APPPOOL_IDENTITY_TYPE_LOCALSYSTEM`: UInt = 0u;
public const val `MD_APPPOOL_IDENTITY_TYPE_NETWORKSERVICE`: UInt = 2u;
public const val `MD_APPPOOL_IDENTITY_TYPE_SPECIFICUSER`: UInt = 3u;
public const val `MD_APPPOOL_IDLE_TIMEOUT`: UInt = 9005u;
public const val `MD_APPPOOL_MANAGED_PIPELINE_MODE`: UInt = 9041u;
public const val `MD_APPPOOL_MANAGED_RUNTIME_VERSION`: UInt = 9039u;
public const val `MD_APPPOOL_MAX_PROCESS_COUNT`: UInt = 9003u;
public const val `MD_APPPOOL_ORPHAN_ACTION_EXE`: UInt = 9031u;
public const val `MD_APPPOOL_ORPHAN_ACTION_PARAMS`: UInt = 9032u;
public const val `MD_APPPOOL_ORPHAN_PROCESSES_FOR_DEBUGGING`: UInt = 9009u;
public const val `MD_APPPOOL_PERIODIC_RESTART_CONNECTIONS`: UInt = 9104u;
public const val `MD_APPPOOL_PERIODIC_RESTART_MEMORY`: UInt = 9024u;
public const val `MD_APPPOOL_PERIODIC_RESTART_PRIVATE_MEMORY`: UInt = 9038u;
public const val `MD_APPPOOL_PERIODIC_RESTART_REQUEST_COUNT`: UInt = 9002u;
public const val `MD_APPPOOL_PERIODIC_RESTART_SCHEDULE`: UInt = 9020u;
public const val `MD_APPPOOL_PERIODIC_RESTART_TIME`: UInt = 9001u;
public const val `MD_APPPOOL_PINGING_ENABLED`: UInt = 9004u;
public const val `MD_APPPOOL_PING_INTERVAL`: UInt = 9013u;
public const val `MD_APPPOOL_PING_RESPONSE_TIMELIMIT`: UInt = 9014u;
public const val `MD_APPPOOL_RAPID_FAIL_PROTECTION_ENABLED`: UInt = 9006u;
public const val `MD_APPPOOL_SHUTDOWN_TIMELIMIT`: UInt = 9012u;
public const val `MD_APPPOOL_SMP_AFFINITIZED`: UInt = 9007u;
public const val `MD_APPPOOL_SMP_AFFINITIZED_PROCESSOR_MASK`: UInt = 9008u;
public const val `MD_APPPOOL_STARTUP_TIMELIMIT`: UInt = 9011u;
public const val `MD_APPPOOL_STATE`: UInt = 9027u;
public const val `MD_APPPOOL_STATE_STARTED`: UInt = 2u;
public const val `MD_APPPOOL_STATE_STARTING`: UInt = 1u;
public const val `MD_APPPOOL_STATE_STOPPED`: UInt = 4u;
public const val `MD_APPPOOL_STATE_STOPPING`: UInt = 3u;
public const val `MD_APPPOOL_UL_APPPOOL_QUEUE_LENGTH`: UInt = 9017u;
public const val `MD_APP_ALLOW_TRANSIENT_REGISTRATION`: UInt = 9102u;
public const val `MD_APP_APPPOOL_ID`: UInt = 9101u;
public const val `MD_APP_AUTO_START`: UInt = 9103u;
public const val `MD_APP_DEPENDENCIES`: UInt = 2167u;
public const val `MD_APP_FRIENDLY_NAME`: UInt = 2102u;
public const val `MD_APP_ISOLATED`: UInt = 2104u;
public const val `MD_APP_OOP_RECOVER_LIMIT`: UInt = 2110u;
public const val `MD_APP_PACKAGE_ID`: UInt = 2106u;
public const val `MD_APP_PACKAGE_NAME`: UInt = 2107u;
public const val `MD_APP_PERIODIC_RESTART_REQUESTS`: UInt = 2112u;
public const val `MD_APP_PERIODIC_RESTART_SCHEDULE`: UInt = 2113u;
public const val `MD_APP_PERIODIC_RESTART_TIME`: UInt = 2111u;
public const val `MD_APP_POOL_LOG_EVENT_ON_PROCESSMODEL`: UInt = 9042u;
public const val `MD_APP_POOL_LOG_EVENT_ON_RECYCLE`: UInt = 9037u;
public const val `MD_APP_POOL_PROCESSMODEL_IDLE_TIMEOUT`: UInt = 1u;
public const val `MD_APP_POOL_RECYCLE_CONFIG_CHANGE`: UInt = 64u;
public const val `MD_APP_POOL_RECYCLE_ISAPI_UNHEALTHY`: UInt = 16u;
public const val `MD_APP_POOL_RECYCLE_MEMORY`: UInt = 8u;
public const val `MD_APP_POOL_RECYCLE_ON_DEMAND`: UInt = 32u;
public const val `MD_APP_POOL_RECYCLE_PRIVATE_MEMORY`: UInt = 128u;
public const val `MD_APP_POOL_RECYCLE_REQUESTS`: UInt = 2u;
public const val `MD_APP_POOL_RECYCLE_SCHEDULE`: UInt = 4u;
public const val `MD_APP_POOL_RECYCLE_TIME`: UInt = 1u;
public const val `MD_APP_ROOT`: UInt = 2103u;
public const val `MD_APP_SHUTDOWN_TIME_LIMIT`: UInt = 2114u;
public const val `MD_APP_TRACE_URL_LIST`: UInt = 2118u;
public const val `MD_APP_WAM_CLSID`: UInt = 2105u;
public const val `MD_ASP_ALLOWOUTOFPROCCMPNTS`: UInt = 7014u;
public const val `MD_ASP_ALLOWOUTOFPROCCOMPONENTS`: UInt = 7014u;
public const val `MD_ASP_ALLOWSESSIONSTATE`: UInt = 7011u;
public const val `MD_ASP_BUFFERINGON`: UInt = 7000u;
public const val `MD_ASP_BUFFER_LIMIT`: UInt = 7052u;
public const val `MD_ASP_CALCLINENUMBER`: UInt = 7050u;
public const val `MD_ASP_CODEPAGE`: UInt = 7016u;
public const val `MD_ASP_DISKTEMPLATECACHEDIRECTORY`: UInt = 7036u;
public const val `MD_ASP_ENABLEAPPLICATIONRESTART`: UInt = 7027u;
public const val `MD_ASP_ENABLEASPHTMLFALLBACK`: UInt = 7021u;
public const val `MD_ASP_ENABLECHUNKEDENCODING`: UInt = 7022u;
public const val `MD_ASP_ENABLECLIENTDEBUG`: UInt = 7019u;
public const val `MD_ASP_ENABLEPARENTPATHS`: UInt = 7008u;
public const val `MD_ASP_ENABLESERVERDEBUG`: UInt = 7018u;
public const val `MD_ASP_ENABLETYPELIBCACHE`: UInt = 7023u;
public const val `MD_ASP_ERRORSTONTLOG`: UInt = 7024u;
public const val `MD_ASP_EXCEPTIONCATCHENABLE`: UInt = 7015u;
public const val `MD_ASP_EXECUTEINMTA`: UInt = 7041u;
public const val `MD_ASP_ID_LAST`: UInt = 7053u;
public const val `MD_ASP_KEEPSESSIONIDSECURE`: UInt = 7043u;
public const val `MD_ASP_LCID`: UInt = 7042u;
public const val `MD_ASP_LOGERRORREQUESTS`: UInt = 7001u;
public const val `MD_ASP_MAXDISKTEMPLATECACHEFILES`: UInt = 7040u;
public const val `MD_ASP_MAXREQUESTENTITY`: UInt = 7053u;
public const val `MD_ASP_MAX_REQUEST_ENTITY_ALLOWED`: UInt = 7053u;
public const val `MD_ASP_MEMFREEFACTOR`: UInt = 7009u;
public const val `MD_ASP_MINUSEDBLOCKS`: UInt = 7010u;
public const val `MD_ASP_PROCESSORTHREADMAX`: UInt = 7025u;
public const val `MD_ASP_QUEUECONNECTIONTESTTIME`: UInt = 7028u;
public const val `MD_ASP_QUEUETIMEOUT`: UInt = 7013u;
public const val `MD_ASP_REQEUSTQUEUEMAX`: UInt = 7026u;
public const val `MD_ASP_RUN_ONEND_ANON`: UInt = 7051u;
public const val `MD_ASP_SCRIPTENGINECACHEMAX`: UInt = 7005u;
public const val `MD_ASP_SCRIPTERRORMESSAGE`: UInt = 7003u;
public const val `MD_ASP_SCRIPTERRORSSENTTOBROWSER`: UInt = 7002u;
public const val `MD_ASP_SCRIPTFILECACHESIZE`: UInt = 7004u;
public const val `MD_ASP_SCRIPTLANGUAGE`: UInt = 7012u;
public const val `MD_ASP_SCRIPTLANGUAGELIST`: UInt = 7017u;
public const val `MD_ASP_SCRIPTTIMEOUT`: UInt = 7006u;
public const val `MD_ASP_SERVICE_ENABLE_SXS`: UInt = 2u;
public const val `MD_ASP_SERVICE_ENABLE_TRACKER`: UInt = 1u;
public const val `MD_ASP_SERVICE_FLAGS`: UInt = 7044u;
public const val `MD_ASP_SERVICE_FLAG_FUSION`: UInt = 7046u;
public const val `MD_ASP_SERVICE_FLAG_PARTITIONS`: UInt = 7047u;
public const val `MD_ASP_SERVICE_FLAG_TRACKER`: UInt = 7045u;
public const val `MD_ASP_SERVICE_PARTITION_ID`: UInt = 7048u;
public const val `MD_ASP_SERVICE_SXS_NAME`: UInt = 7049u;
public const val `MD_ASP_SERVICE_USE_PARTITION`: UInt = 4u;
public const val `MD_ASP_SESSIONMAX`: UInt = 7029u;
public const val `MD_ASP_SESSIONTIMEOUT`: UInt = 7007u;
public const val `MD_ASP_THREADGATEENABLED`: UInt = 7030u;
public const val `MD_ASP_THREADGATELOADHIGH`: UInt = 7035u;
public const val `MD_ASP_THREADGATELOADLOW`: UInt = 7034u;
public const val `MD_ASP_THREADGATESLEEPDELAY`: UInt = 7032u;
public const val `MD_ASP_THREADGATESLEEPMAX`: UInt = 7033u;
public const val `MD_ASP_THREADGATETIMESLICE`: UInt = 7031u;
public const val `MD_ASP_TRACKTHREADINGMODEL`: UInt = 7020u;
public const val `MD_AUTHORIZATION`: UInt = 6000u;
public const val `MD_AUTHORIZATION_PERSISTENCE`: UInt = 6031u;
public const val `MD_AUTH_ADVNOTIFY_DISABLE`: UInt = 4u;
public const val `MD_AUTH_ANONYMOUS`: UInt = 1u;
public const val `MD_AUTH_BASIC`: UInt = 2u;
public const val `MD_AUTH_CHANGE_DISABLE`: UInt = 2u;
public const val `MD_AUTH_CHANGE_FLAGS`: UInt = 2068u;
public const val `MD_AUTH_CHANGE_UNSECURE`: UInt = 1u;
public const val `MD_AUTH_CHANGE_URL`: UInt = 2060u;
public const val `MD_AUTH_EXPIRED_UNSECUREURL`: UInt = 2067u;
public const val `MD_AUTH_EXPIRED_URL`: UInt = 2061u;
public const val `MD_AUTH_MD5`: UInt = 16u;
public const val `MD_AUTH_NT`: UInt = 4u;
public const val `MD_AUTH_PASSPORT`: UInt = 64u;
public const val `MD_AUTH_SINGLEREQUEST`: UInt = 64u;
public const val `MD_AUTH_SINGLEREQUESTALWAYSIFPROXY`: UInt = 256u;
public const val `MD_AUTH_SINGLEREQUESTIFPROXY`: UInt = 128u;
public const val `MD_BACKUP_FORCE_BACKUP`: UInt = 4u;
public const val `MD_BACKUP_HIGHEST_VERSION`: UInt = 4294967294u;
public const val `MD_BACKUP_MAX_LEN`: UInt = 100u;
public const val `MD_BACKUP_MAX_VERSION`: UInt = 9999u;
public const val `MD_BACKUP_NEXT_VERSION`: UInt = 4294967295u;
public const val `MD_BACKUP_OVERWRITE`: UInt = 1u;
public const val `MD_BACKUP_SAVE_FIRST`: UInt = 2u;
public const val `MD_BANNER_MESSAGE`: UInt = 5011u;
public const val `MD_BINDINGS`: UInt = 2022u;
public const val `MD_CACHE_EXTENSIONS`: UInt = 6034u;
public const val `MD_CAL_AUTH_RESERVE_TIMEOUT`: UInt = 2131u;
public const val `MD_CAL_SSL_RESERVE_TIMEOUT`: UInt = 2132u;
public const val `MD_CAL_VC_PER_CONNECT`: UInt = 2130u;
public const val `MD_CAL_W3_ERROR`: UInt = 2133u;
public const val `MD_CC_MAX_AGE`: UInt = 6042u;
public const val `MD_CC_NO_CACHE`: UInt = 6041u;
public const val `MD_CC_OTHER`: UInt = 6043u;
public const val `MD_CENTRAL_W3C_LOGGING_ENABLED`: UInt = 2119u;
public const val `MD_CERT_CACHE_RETRIEVAL_ONLY`: UInt = 2u;
public const val `MD_CERT_CHECK_REVOCATION_FRESHNESS_TIME`: UInt = 4u;
public const val `MD_CERT_NO_REVOC_CHECK`: UInt = 1u;
public const val `MD_CERT_NO_USAGE_CHECK`: UInt = 65536u;
public const val `MD_CGI_RESTRICTION_LIST`: UInt = 2164u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MD_CHANGE_OBJECT_W` (
    public var `pszMDPath`: `windows_sys`.`core`.`PWSTR`,
    public var `dwMDChangeType`: UInt,
    public var `dwMDNumDataIDs`: UInt,
    public var `pdwMDDataIDs`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
)
// UNSUPPORTED Rust 940:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for MD_CHANGE_OBJECT_W {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MD_CHANGE_TYPE_ADD_OBJECT`: UInt = 2u;
public const val `MD_CHANGE_TYPE_DELETE_DATA`: UInt = 8u;
public const val `MD_CHANGE_TYPE_DELETE_OBJECT`: UInt = 1u;
public const val `MD_CHANGE_TYPE_RENAME_OBJECT`: UInt = 16u;
public const val `MD_CHANGE_TYPE_RESTORE`: UInt = 32u;
public const val `MD_CHANGE_TYPE_SET_DATA`: UInt = 4u;
public const val `MD_COMMENTS`: UInt = 9990u;
public const val `MD_CONNECTION_TIMEOUT`: UInt = 1013u;
public const val `MD_CPU_ACTION`: UInt = 9022u;
public const val `MD_CPU_APP_ENABLED`: UInt = 2141u;
public const val `MD_CPU_CGI_ENABLED`: UInt = 2140u;
public const val `MD_CPU_CGI_LIMIT`: UInt = 2148u;
public const val `MD_CPU_DISABLE_ALL_LOGGING`: UInt = 0u;
public const val `MD_CPU_ENABLE_ACTIVE_PROCS`: UInt = 64u;
public const val `MD_CPU_ENABLE_ALL_PROC_LOGGING`: UInt = 1u;
public const val `MD_CPU_ENABLE_APP_LOGGING`: UInt = 4u;
public const val `MD_CPU_ENABLE_CGI_LOGGING`: UInt = 2u;
public const val `MD_CPU_ENABLE_EVENT`: UInt = 1u;
public const val `MD_CPU_ENABLE_KERNEL_TIME`: UInt = 8u;
public const val `MD_CPU_ENABLE_LOGGING`: UInt = 2147483648u;
public const val `MD_CPU_ENABLE_PAGE_FAULTS`: UInt = 16u;
public const val `MD_CPU_ENABLE_PROC_TYPE`: UInt = 2u;
public const val `MD_CPU_ENABLE_TERMINATED_PROCS`: UInt = 128u;
public const val `MD_CPU_ENABLE_TOTAL_PROCS`: UInt = 32u;
public const val `MD_CPU_ENABLE_USER_TIME`: UInt = 4u;
public const val `MD_CPU_KILL_W3WP`: UInt = 1u;
public const val `MD_CPU_LIMIT`: UInt = 9023u;
public const val `MD_CPU_LIMITS_ENABLED`: UInt = 2143u;
public const val `MD_CPU_LIMIT_LOGEVENT`: UInt = 2149u;
public const val `MD_CPU_LIMIT_PAUSE`: UInt = 2152u;
public const val `MD_CPU_LIMIT_PRIORITY`: UInt = 2150u;
public const val `MD_CPU_LIMIT_PROCSTOP`: UInt = 2151u;
public const val `MD_CPU_LOGGING_INTERVAL`: UInt = 2145u;
public const val `MD_CPU_LOGGING_MASK`: UInt = 4507u;
public const val `MD_CPU_LOGGING_OPTIONS`: UInt = 2146u;
public const val `MD_CPU_NO_ACTION`: UInt = 0u;
public const val `MD_CPU_RESET_INTERVAL`: UInt = 2144u;
public const val `MD_CPU_THROTTLE`: UInt = 3u;
public const val `MD_CPU_TRACE`: UInt = 2u;
public const val `MD_CREATE_PROCESS_AS_USER`: UInt = 6035u;
public const val `MD_CREATE_PROC_NEW_CONSOLE`: UInt = 6036u;
public const val `MD_CUSTOM_DEPLOYMENT_DATA`: UInt = 6055u;
public const val `MD_CUSTOM_ERROR`: UInt = 6008u;
public const val `MD_CUSTOM_ERROR_DESC`: UInt = 2120u;
// UNSUPPORTED Rust 989:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MD_DEFAULT_BACKUP_LOCATION: windows_sys::core::PCWSTR = windows_sys::core::w!("MDBackUp");

public const val `MD_DEFAULT_LOAD_FILE`: UInt = 6006u;
public const val `MD_DEFAULT_LOGON_DOMAIN`: UInt = 6012u;
public const val `MD_DEMAND_START_THRESHOLD`: UInt = 9207u;
public const val `MD_DIRBROW_ENABLED`: UInt = 2147483648u;
public const val `MD_DIRBROW_LOADDEFAULT`: UInt = 1073741824u;
public const val `MD_DIRBROW_LONG_DATE`: UInt = 32u;
public const val `MD_DIRBROW_SHOW_DATE`: UInt = 2u;
public const val `MD_DIRBROW_SHOW_EXTENSION`: UInt = 16u;
public const val `MD_DIRBROW_SHOW_SIZE`: UInt = 8u;
public const val `MD_DIRBROW_SHOW_TIME`: UInt = 4u;
public const val `MD_DIRECTORY_BROWSING`: UInt = 6005u;
public const val `MD_DISABLE_SOCKET_POOLING`: UInt = 1029u;
public const val `MD_DONT_LOG`: UInt = 6023u;
public const val `MD_DOWNLEVEL_ADMIN_INSTANCE`: UInt = 1021u;
public const val `MD_DO_REVERSE_DNS`: UInt = 6029u;
public const val `MD_ENABLEDPROTOCOLS`: UInt = 2023u;
public const val `MD_ENABLE_URL_AUTHORIZATION`: UInt = 6048u;
public const val `MD_ERROR_CANNOT_REMOVE_SECURE_ATTRIBUTE`: Int = -2146646008;
public const val `MD_ERROR_DATA_NOT_FOUND`: Int = -2146646015;
public const val `MD_ERROR_IISAO_INVALID_SCHEMA`: Int = -2146646000;
public const val `MD_ERROR_INVALID_VERSION`: Int = -2146646014;
public const val `MD_ERROR_NOT_INITIALIZED`: Int = -2146646016;
public const val `MD_ERROR_NO_SESSION_KEY`: Int = -2146645987;
public const val `MD_ERROR_READ_METABASE_FILE`: Int = -2146645991;
public const val `MD_ERROR_SECURE_CHANNEL_FAILURE`: Int = -2146646010;
public const val `MD_ERROR_SUB400_INVALID_CONTENT_LENGTH`: UInt = 7u;
public const val `MD_ERROR_SUB400_INVALID_DEPTH`: UInt = 2u;
public const val `MD_ERROR_SUB400_INVALID_DESTINATION`: UInt = 1u;
public const val `MD_ERROR_SUB400_INVALID_IF`: UInt = 3u;
public const val `MD_ERROR_SUB400_INVALID_LOCK_TOKEN`: UInt = 9u;
public const val `MD_ERROR_SUB400_INVALID_OVERWRITE`: UInt = 4u;
public const val `MD_ERROR_SUB400_INVALID_REQUEST_BODY`: UInt = 6u;
public const val `MD_ERROR_SUB400_INVALID_TIMEOUT`: UInt = 8u;
public const val `MD_ERROR_SUB400_INVALID_TRANSLATE`: UInt = 5u;
public const val `MD_ERROR_SUB400_INVALID_WEBSOCKET_REQUEST`: UInt = 11u;
public const val `MD_ERROR_SUB400_INVALID_XFF_HEADER`: UInt = 10u;
public const val `MD_ERROR_SUB401_APPLICATION`: UInt = 5u;
public const val `MD_ERROR_SUB401_FILTER`: UInt = 4u;
public const val `MD_ERROR_SUB401_LOGON`: UInt = 1u;
public const val `MD_ERROR_SUB401_LOGON_ACL`: UInt = 3u;
public const val `MD_ERROR_SUB401_LOGON_CONFIG`: UInt = 2u;
public const val `MD_ERROR_SUB401_URLAUTH_POLICY`: UInt = 7u;
public const val `MD_ERROR_SUB403_ADDR_REJECT`: UInt = 6u;
public const val `MD_ERROR_SUB403_APPPOOL_DENIED`: UInt = 18u;
public const val `MD_ERROR_SUB403_CAL_EXCEEDED`: UInt = 15u;
public const val `MD_ERROR_SUB403_CERT_BAD`: UInt = 16u;
public const val `MD_ERROR_SUB403_CERT_REQUIRED`: UInt = 7u;
public const val `MD_ERROR_SUB403_CERT_REVOKED`: UInt = 13u;
public const val `MD_ERROR_SUB403_CERT_TIME_INVALID`: UInt = 17u;
public const val `MD_ERROR_SUB403_DIR_LIST_DENIED`: UInt = 14u;
public const val `MD_ERROR_SUB403_EXECUTE_ACCESS_DENIED`: UInt = 1u;
public const val `MD_ERROR_SUB403_INFINITE_DEPTH_DENIED`: UInt = 22u;
public const val `MD_ERROR_SUB403_INSUFFICIENT_PRIVILEGE_FOR_CGI`: UInt = 19u;
public const val `MD_ERROR_SUB403_INVALID_CNFG`: UInt = 10u;
public const val `MD_ERROR_SUB403_LOCK_TOKEN_REQUIRED`: UInt = 23u;
public const val `MD_ERROR_SUB403_MAPPER_DENY_ACCESS`: UInt = 12u;
public const val `MD_ERROR_SUB403_PASSPORT_LOGIN_FAILURE`: UInt = 20u;
public const val `MD_ERROR_SUB403_PWD_CHANGE`: UInt = 11u;
public const val `MD_ERROR_SUB403_READ_ACCESS_DENIED`: UInt = 2u;
public const val `MD_ERROR_SUB403_SITE_ACCESS_DENIED`: UInt = 8u;
public const val `MD_ERROR_SUB403_SOURCE_ACCESS_DENIED`: UInt = 21u;
public const val `MD_ERROR_SUB403_SSL128_REQUIRED`: UInt = 5u;
public const val `MD_ERROR_SUB403_SSL_REQUIRED`: UInt = 4u;
public const val `MD_ERROR_SUB403_TOO_MANY_USERS`: UInt = 9u;
public const val `MD_ERROR_SUB403_VALIDATION_FAILURE`: UInt = 24u;
public const val `MD_ERROR_SUB403_WRITE_ACCESS_DENIED`: UInt = 3u;
public const val `MD_ERROR_SUB404_DENIED_BY_FILTERING_RULE`: UInt = 19u;
public const val `MD_ERROR_SUB404_DENIED_BY_MIMEMAP`: UInt = 3u;
public const val `MD_ERROR_SUB404_DENIED_BY_POLICY`: UInt = 2u;
public const val `MD_ERROR_SUB404_FILE_ATTRIBUTE_HIDDEN`: UInt = 9u;
public const val `MD_ERROR_SUB404_FILE_EXTENSION_DENIED`: UInt = 7u;
public const val `MD_ERROR_SUB404_HIDDEN_SEGMENT`: UInt = 8u;
public const val `MD_ERROR_SUB404_NO_HANDLER`: UInt = 4u;
public const val `MD_ERROR_SUB404_PRECONDITIONED_HANDLER`: UInt = 17u;
public const val `MD_ERROR_SUB404_QUERY_STRING_SEQUENCE_DENIED`: UInt = 18u;
public const val `MD_ERROR_SUB404_QUERY_STRING_TOO_LONG`: UInt = 15u;
public const val `MD_ERROR_SUB404_SITE_NOT_FOUND`: UInt = 1u;
public const val `MD_ERROR_SUB404_STATICFILE_DAV`: UInt = 16u;
public const val `MD_ERROR_SUB404_TOO_MANY_URL_SEGMENTS`: UInt = 20u;
public const val `MD_ERROR_SUB404_URL_DOUBLE_ESCAPED`: UInt = 11u;
public const val `MD_ERROR_SUB404_URL_HAS_HIGH_BIT_CHARS`: UInt = 12u;
public const val `MD_ERROR_SUB404_URL_SEQUENCE_DENIED`: UInt = 5u;
public const val `MD_ERROR_SUB404_URL_TOO_LONG`: UInt = 14u;
public const val `MD_ERROR_SUB404_VERB_DENIED`: UInt = 6u;
public const val `MD_ERROR_SUB413_CONTENT_LENGTH_TOO_LARGE`: UInt = 1u;
public const val `MD_ERROR_SUB423_LOCK_TOKEN_SUBMITTED`: UInt = 1u;
public const val `MD_ERROR_SUB423_NO_CONFLICTING_LOCK`: UInt = 2u;
public const val `MD_ERROR_SUB500_ASPNET_HANDLERS`: UInt = 23u;
public const val `MD_ERROR_SUB500_ASPNET_IMPERSONATION`: UInt = 24u;
public const val `MD_ERROR_SUB500_ASPNET_MODULES`: UInt = 22u;
public const val `MD_ERROR_SUB500_BAD_METADATA`: UInt = 19u;
public const val `MD_ERROR_SUB500_HANDLERS_MODULE`: UInt = 21u;
public const val `MD_ERROR_SUB500_UNC_ACCESS`: UInt = 16u;
public const val `MD_ERROR_SUB500_URLAUTH_NO_SCOPE`: UInt = 20u;
public const val `MD_ERROR_SUB500_URLAUTH_NO_STORE`: UInt = 17u;
public const val `MD_ERROR_SUB500_URLAUTH_STORE_ERROR`: UInt = 18u;
public const val `MD_ERROR_SUB502_ARR_CONNECTION_ERROR`: UInt = 3u;
public const val `MD_ERROR_SUB502_ARR_NO_SERVER`: UInt = 4u;
public const val `MD_ERROR_SUB502_PREMATURE_EXIT`: UInt = 2u;
public const val `MD_ERROR_SUB502_TIMEOUT`: UInt = 1u;
public const val `MD_ERROR_SUB503_APP_CONCURRENT`: UInt = 2u;
public const val `MD_ERROR_SUB503_ASPNET_QUEUE_FULL`: UInt = 3u;
public const val `MD_ERROR_SUB503_CONNECTION_LIMIT`: UInt = 5u;
public const val `MD_ERROR_SUB503_CPU_LIMIT`: UInt = 1u;
public const val `MD_ERROR_SUB503_FASTCGI_QUEUE_FULL`: UInt = 4u;
public const val `MD_EXIT_MESSAGE`: UInt = 5001u;
public const val `MD_EXPORT_INHERITED`: UInt = 1u;
public const val `MD_EXPORT_NODE_ONLY`: UInt = 2u;
public const val `MD_EXTLOG_BYTES_RECV`: UInt = 8192u;
public const val `MD_EXTLOG_BYTES_SENT`: UInt = 4096u;
public const val `MD_EXTLOG_CLIENT_IP`: UInt = 4u;
public const val `MD_EXTLOG_COMPUTER_NAME`: UInt = 32u;
public const val `MD_EXTLOG_COOKIE`: UInt = 131072u;
public const val `MD_EXTLOG_DATE`: UInt = 1u;
public const val `MD_EXTLOG_HOST`: UInt = 1048576u;
public const val `MD_EXTLOG_HTTP_STATUS`: UInt = 1024u;
public const val `MD_EXTLOG_HTTP_SUB_STATUS`: UInt = 2097152u;
public const val `MD_EXTLOG_METHOD`: UInt = 128u;
public const val `MD_EXTLOG_PROTOCOL_VERSION`: UInt = 524288u;
public const val `MD_EXTLOG_REFERER`: UInt = 262144u;
public const val `MD_EXTLOG_SERVER_IP`: UInt = 64u;
public const val `MD_EXTLOG_SERVER_PORT`: UInt = 32768u;
public const val `MD_EXTLOG_SITE_NAME`: UInt = 16u;
public const val `MD_EXTLOG_TIME`: UInt = 2u;
public const val `MD_EXTLOG_TIME_TAKEN`: UInt = 16384u;
public const val `MD_EXTLOG_URI_QUERY`: UInt = 512u;
public const val `MD_EXTLOG_URI_STEM`: UInt = 256u;
public const val `MD_EXTLOG_USERNAME`: UInt = 8u;
public const val `MD_EXTLOG_USER_AGENT`: UInt = 65536u;
public const val `MD_EXTLOG_WIN32_STATUS`: UInt = 2048u;
public const val `MD_FILTER_DESCRIPTION`: UInt = 2045u;
public const val `MD_FILTER_ENABLED`: UInt = 2043u;
public const val `MD_FILTER_ENABLE_CACHE`: UInt = 2046u;
public const val `MD_FILTER_FLAGS`: UInt = 2044u;
public const val `MD_FILTER_IMAGE_PATH`: UInt = 2041u;
public const val `MD_FILTER_LOAD_ORDER`: UInt = 2040u;
public const val `MD_FILTER_STATE`: UInt = 2042u;
public const val `MD_FILTER_STATE_LOADED`: UInt = 1u;
public const val `MD_FILTER_STATE_UNLOADED`: UInt = 4u;
public const val `MD_FOOTER_DOCUMENT`: UInt = 6009u;
public const val `MD_FOOTER_ENABLED`: UInt = 6010u;
public const val `MD_FRONTPAGE_WEB`: UInt = 2072u;
public const val `MD_FTPS_128_BITS`: UInt = 5053u;
public const val `MD_FTPS_ALLOW_CCC`: UInt = 5054u;
public const val `MD_FTPS_SECURE_ANONYMOUS`: UInt = 5052u;
public const val `MD_FTPS_SECURE_CONTROL_CHANNEL`: UInt = 5050u;
public const val `MD_FTPS_SECURE_DATA_CHANNEL`: UInt = 5051u;
public const val `MD_FTP_KEEP_PARTIAL_UPLOADS`: UInt = 5019u;
public const val `MD_FTP_LOG_IN_UTF_8`: UInt = 5013u;
public const val `MD_FTP_PASV_RESPONSE_IP`: UInt = 5018u;
public const val `MD_FTP_UTF8_FILE_NAMES`: UInt = 5020u;
public const val `MD_GLOBAL_BINARY_LOGGING_ENABLED`: UInt = 4016u;
public const val `MD_GLOBAL_BINSCHEMATIMESTAMP`: UInt = 9991u;
public const val `MD_GLOBAL_CHANGE_NUMBER`: UInt = 9997u;
public const val `MD_GLOBAL_EDIT_WHILE_RUNNING_MAJOR_VERSION_NUMBER`: UInt = 9994u;
public const val `MD_GLOBAL_EDIT_WHILE_RUNNING_MINOR_VERSION_NUMBER`: UInt = 9993u;
public const val `MD_GLOBAL_LOG_IN_UTF_8`: UInt = 9206u;
public const val `MD_GLOBAL_SESSIONKEY`: UInt = 9999u;
public const val `MD_GLOBAL_STANDARD_APP_MODE_ENABLED`: UInt = 9203u;
public const val `MD_GLOBAL_XMLSCHEMATIMESTAMP`: UInt = 9992u;
public const val `MD_GREETING_MESSAGE`: UInt = 5002u;
public const val `MD_HC_CACHE_CONTROL_HEADER`: UInt = 2211u;
public const val `MD_HC_COMPRESSION_BUFFER_SIZE`: UInt = 2223u;
public const val `MD_HC_COMPRESSION_DIRECTORY`: UInt = 2210u;
public const val `MD_HC_COMPRESSION_DLL`: UInt = 2237u;
public const val `MD_HC_CREATE_FLAGS`: UInt = 2243u;
public const val `MD_HC_DO_DISK_SPACE_LIMITING`: UInt = 2216u;
public const val `MD_HC_DO_DYNAMIC_COMPRESSION`: UInt = 2213u;
public const val `MD_HC_DO_NAMESPACE_DYNAMIC_COMPRESSION`: UInt = 2255u;
public const val `MD_HC_DO_NAMESPACE_STATIC_COMPRESSION`: UInt = 2256u;
public const val `MD_HC_DO_ON_DEMAND_COMPRESSION`: UInt = 2215u;
public const val `MD_HC_DO_STATIC_COMPRESSION`: UInt = 2214u;
public const val `MD_HC_DYNAMIC_COMPRESSION_LEVEL`: UInt = 2241u;
public const val `MD_HC_EXPIRES_HEADER`: UInt = 2212u;
public const val `MD_HC_FILES_DELETED_PER_DISK_FREE`: UInt = 2225u;
public const val `MD_HC_FILE_EXTENSIONS`: UInt = 2238u;
public const val `MD_HC_IO_BUFFER_SIZE`: UInt = 2222u;
public const val `MD_HC_MAX_DISK_SPACE_USAGE`: UInt = 2221u;
public const val `MD_HC_MAX_QUEUE_LENGTH`: UInt = 2224u;
public const val `MD_HC_MIME_TYPE`: UInt = 2239u;
public const val `MD_HC_MIN_FILE_SIZE_FOR_COMP`: UInt = 2226u;
public const val `MD_HC_NO_COMPRESSION_FOR_HTTP_10`: UInt = 2217u;
public const val `MD_HC_NO_COMPRESSION_FOR_PROXIES`: UInt = 2218u;
public const val `MD_HC_NO_COMPRESSION_FOR_RANGE`: UInt = 2219u;
public const val `MD_HC_ON_DEMAND_COMP_LEVEL`: UInt = 2242u;
public const val `MD_HC_PRIORITY`: UInt = 2240u;
public const val `MD_HC_SCRIPT_FILE_EXTENSIONS`: UInt = 2244u;
public const val `MD_HC_SEND_CACHE_HEADERS`: UInt = 2220u;
public const val `MD_HEADER_WAIT_TIMEOUT`: UInt = 9204u;
public const val `MD_HISTORY_LATEST`: UInt = 1u;
public const val `MD_HTTPERRORS_EXISTING_RESPONSE`: UInt = 6056u;
public const val `MD_HTTP_CUSTOM`: UInt = 6004u;
public const val `MD_HTTP_EXPIRES`: UInt = 6002u;
public const val `MD_HTTP_FORWARDER_CUSTOM`: UInt = 6054u;
public const val `MD_HTTP_PICS`: UInt = 6003u;
public const val `MD_HTTP_REDIRECT`: UInt = 6011u;
public const val `MD_IISADMIN_EXTENSIONS`: UInt = 1028u;
public const val `MD_IMPORT_INHERITED`: UInt = 1u;
public const val `MD_IMPORT_MERGE`: UInt = 4u;
public const val `MD_IMPORT_NODE_ONLY`: UInt = 2u;
// UNSUPPORTED Rust 1190:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MD_INSERT_PATH_STRING: windows_sys::core::PCWSTR = windows_sys::core::w!("<%INSERT_PATH%>");

// UNSUPPORTED Rust 1191:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const MD_INSERT_PATH_STRINGA: windows_sys::core::PCSTR = windows_sys::core::s!("<%INSERT_PATH%>");

public const val `MD_IN_PROCESS_ISAPI_APPS`: UInt = 2073u;
public const val `MD_IP_SEC`: UInt = 6019u;
public const val `MD_ISAPI_RESTRICTION_LIST`: UInt = 2163u;
public const val `MD_IS_CONTENT_INDEXED`: UInt = 6039u;
public const val `MD_KEY_TYPE`: UInt = 1002u;
public const val `MD_LEVELS_TO_SCAN`: UInt = 1022u;
public const val `MD_LOAD_BALANCER_CAPABILITIES`: UInt = 9034u;
public const val `MD_LOAD_BALANCER_CAPABILITIES_BASIC`: UInt = 1u;
public const val `MD_LOAD_BALANCER_CAPABILITIES_SOPHISTICATED`: UInt = 2u;
public const val `MD_LOCATION`: UInt = 9989u;
public const val `MD_LOGCUSTOM_DATATYPE_DOUBLE`: UInt = 5u;
public const val `MD_LOGCUSTOM_DATATYPE_FLOAT`: UInt = 4u;
public const val `MD_LOGCUSTOM_DATATYPE_INT`: UInt = 0u;
public const val `MD_LOGCUSTOM_DATATYPE_LONG`: UInt = 2u;
public const val `MD_LOGCUSTOM_DATATYPE_LPSTR`: UInt = 6u;
public const val `MD_LOGCUSTOM_DATATYPE_LPWSTR`: UInt = 7u;
public const val `MD_LOGCUSTOM_DATATYPE_UINT`: UInt = 1u;
public const val `MD_LOGCUSTOM_DATATYPE_ULONG`: UInt = 3u;
public const val `MD_LOGCUSTOM_PROPERTY_DATATYPE`: UInt = 4505u;
public const val `MD_LOGCUSTOM_PROPERTY_HEADER`: UInt = 4502u;
public const val `MD_LOGCUSTOM_PROPERTY_ID`: UInt = 4503u;
public const val `MD_LOGCUSTOM_PROPERTY_MASK`: UInt = 4504u;
public const val `MD_LOGCUSTOM_PROPERTY_NAME`: UInt = 4501u;
public const val `MD_LOGCUSTOM_PROPERTY_NODE_ID`: UInt = 4508u;
public const val `MD_LOGCUSTOM_SERVICES_STRING`: UInt = 4506u;
public const val `MD_LOGEXT_FIELD_MASK`: UInt = 4013u;
public const val `MD_LOGEXT_FIELD_MASK2`: UInt = 4014u;
public const val `MD_LOGFILE_DIRECTORY`: UInt = 4001u;
public const val `MD_LOGFILE_LOCALTIME_ROLLOVER`: UInt = 4015u;
public const val `MD_LOGFILE_PERIOD`: UInt = 4003u;
public const val `MD_LOGFILE_PERIOD_DAILY`: UInt = 1u;
public const val `MD_LOGFILE_PERIOD_HOURLY`: UInt = 4u;
public const val `MD_LOGFILE_PERIOD_MAXSIZE`: UInt = 0u;
public const val `MD_LOGFILE_PERIOD_MONTHLY`: UInt = 3u;
public const val `MD_LOGFILE_PERIOD_NONE`: UInt = 0u;
public const val `MD_LOGFILE_PERIOD_WEEKLY`: UInt = 2u;
public const val `MD_LOGFILE_TRUNCATE_SIZE`: UInt = 4004u;
public const val `MD_LOGON_BATCH`: UInt = 1u;
public const val `MD_LOGON_INTERACTIVE`: UInt = 0u;
public const val `MD_LOGON_METHOD`: UInt = 6013u;
public const val `MD_LOGON_NETWORK`: UInt = 2u;
public const val `MD_LOGON_NETWORK_CLEARTEXT`: UInt = 3u;
public const val `MD_LOGSQL_DATA_SOURCES`: UInt = 4007u;
public const val `MD_LOGSQL_PASSWORD`: UInt = 4010u;
public const val `MD_LOGSQL_TABLE_NAME`: UInt = 4008u;
public const val `MD_LOGSQL_USER_NAME`: UInt = 4009u;
public const val `MD_LOG_ANONYMOUS`: UInt = 5007u;
public const val `MD_LOG_NONANONYMOUS`: UInt = 5008u;
public const val `MD_LOG_PLUGINS_AVAILABLE`: UInt = 4012u;
public const val `MD_LOG_PLUGIN_MOD_ID`: UInt = 4005u;
public const val `MD_LOG_PLUGIN_ORDER`: UInt = 4011u;
public const val `MD_LOG_PLUGIN_UI_ID`: UInt = 4006u;
public const val `MD_LOG_TYPE`: UInt = 4000u;
public const val `MD_LOG_TYPE_DISABLED`: UInt = 0u;
public const val `MD_LOG_TYPE_ENABLED`: UInt = 1u;
public const val `MD_LOG_UNUSED1`: UInt = 4002u;
public const val `MD_MAX_BANDWIDTH`: UInt = 1000u;
public const val `MD_MAX_BANDWIDTH_BLOCKED`: UInt = 1003u;
public const val `MD_MAX_CHANGE_ENTRIES`: UInt = 100u;
public const val `MD_MAX_CLIENTS_MESSAGE`: UInt = 5003u;
public const val `MD_MAX_CONNECTIONS`: UInt = 1014u;
public const val `MD_MAX_ENDPOINT_CONNECTIONS`: UInt = 1024u;
public const val `MD_MAX_ERROR_FILES`: UInt = 9988u;
public const val `MD_MAX_GLOBAL_BANDWIDTH`: UInt = 9201u;
public const val `MD_MAX_GLOBAL_CONNECTIONS`: UInt = 9202u;
public const val `MD_MAX_REQUEST_ENTITY_ALLOWED`: UInt = 6051u;
public const val `MD_MD_SERVER_SS_AUTH_MAPPING`: UInt = 2200u;
public const val `MD_METADATA_ID_REGISTRATION`: UInt = 1030u;
public const val `MD_MIME_MAP`: UInt = 6015u;
public const val `MD_MIN_FILE_BYTES_PER_SEC`: UInt = 9205u;
public const val `MD_MSDOS_DIR_OUTPUT`: UInt = 5004u;
public const val `MD_NETLOGON_WKS_DNS`: UInt = 2u;
public const val `MD_NETLOGON_WKS_IP`: UInt = 1u;
public const val `MD_NETLOGON_WKS_NONE`: UInt = 0u;
public const val `MD_NET_LOGON_WKS`: UInt = 2065u;
public const val `MD_NOTIFEXAUTH_NTLMSSL`: UInt = 1u;
public const val `MD_NOTIFY_ACCESS_DENIED`: UInt = 2048u;
public const val `MD_NOTIFY_AUTHENTICATION`: UInt = 8192u;
public const val `MD_NOTIFY_AUTH_COMPLETE`: UInt = 67108864u;
public const val `MD_NOTIFY_END_OF_NET_SESSION`: UInt = 256u;
public const val `MD_NOTIFY_END_OF_REQUEST`: UInt = 128u;
public const val `MD_NOTIFY_LOG`: UInt = 512u;
public const val `MD_NOTIFY_NONSECURE_PORT`: UInt = 2u;
public const val `MD_NOTIFY_ORDER_DEFAULT`: UInt = 131072u;
public const val `MD_NOTIFY_ORDER_HIGH`: UInt = 524288u;
public const val `MD_NOTIFY_ORDER_LOW`: UInt = 131072u;
public const val `MD_NOTIFY_ORDER_MEDIUM`: UInt = 262144u;
public const val `MD_NOTIFY_PREPROC_HEADERS`: UInt = 16384u;
public const val `MD_NOTIFY_READ_RAW_DATA`: UInt = 32768u;
public const val `MD_NOTIFY_SECURE_PORT`: UInt = 1u;
public const val `MD_NOTIFY_SEND_RAW_DATA`: UInt = 1024u;
public const val `MD_NOTIFY_SEND_RESPONSE`: UInt = 64u;
public const val `MD_NOTIFY_URL_MAP`: UInt = 4096u;
public const val `MD_NOT_DELETABLE`: UInt = 2116u;
public const val `MD_NTAUTHENTICATION_PROVIDERS`: UInt = 6032u;
public const val `MD_PASSIVE_PORT_RANGE`: UInt = 5016u;
public const val `MD_PASSPORT_NEED_MAPPING`: UInt = 2u;
public const val `MD_PASSPORT_NO_MAPPING`: UInt = 0u;
public const val `MD_PASSPORT_REQUIRE_AD_MAPPING`: UInt = 6052u;
public const val `MD_PASSPORT_TRY_MAPPING`: UInt = 1u;
public const val `MD_POOL_IDC_TIMEOUT`: UInt = 6037u;
public const val `MD_PROCESS_NTCR_IF_LOGGED_ON`: UInt = 2070u;
public const val `MD_PUT_READ_SIZE`: UInt = 6046u;
public const val `MD_RAPID_FAIL_PROTECTION_INTERVAL`: UInt = 9029u;
public const val `MD_RAPID_FAIL_PROTECTION_MAX_CRASHES`: UInt = 9030u;
public const val `MD_REALM`: UInt = 6001u;
public const val `MD_REDIRECT_HEADERS`: UInt = 6044u;
public const val `MD_RESTRICTION_LIST_CUSTOM_DESC`: UInt = 2165u;
public const val `MD_ROOT_ENABLE_EDIT_WHILE_RUNNING`: UInt = 9998u;
public const val `MD_ROOT_ENABLE_HISTORY`: UInt = 9996u;
public const val `MD_ROOT_MAX_HISTORY_FILES`: UInt = 9995u;
public const val `MD_SCHEMA_METAID`: UInt = 1004u;
public const val `MD_SCRIPTMAPFLAG_ALLOWED_ON_READ_DIR`: UInt = 1u;
public const val `MD_SCRIPTMAPFLAG_CHECK_PATH_INFO`: UInt = 4u;
public const val `MD_SCRIPTMAPFLAG_SCRIPT`: UInt = 1u;
public const val `MD_SCRIPT_MAPS`: UInt = 6014u;
public const val `MD_SCRIPT_TIMEOUT`: UInt = 6033u;
public const val `MD_SECURE_BINDINGS`: UInt = 2021u;
public const val `MD_SECURITY_SETUP_REQUIRED`: UInt = 2166u;
public const val `MD_SERVER_AUTOSTART`: UInt = 1017u;
public const val `MD_SERVER_BINDINGS`: UInt = 1023u;
public const val `MD_SERVER_COMMAND`: UInt = 1012u;
public const val `MD_SERVER_COMMAND_CONTINUE`: UInt = 4u;
public const val `MD_SERVER_COMMAND_PAUSE`: UInt = 3u;
public const val `MD_SERVER_COMMAND_START`: UInt = 1u;
public const val `MD_SERVER_COMMAND_STOP`: UInt = 2u;
public const val `MD_SERVER_COMMENT`: UInt = 1015u;
public const val `MD_SERVER_CONFIGURATION_INFO`: UInt = 1027u;
public const val `MD_SERVER_CONFIG_ALLOW_ENCRYPT`: UInt = 4u;
public const val `MD_SERVER_CONFIG_AUTO_PW_SYNC`: UInt = 8u;
public const val `MD_SERVER_CONFIG_SSL_128`: UInt = 2u;
public const val `MD_SERVER_CONFIG_SSL_40`: UInt = 1u;
public const val `MD_SERVER_LISTEN_BACKLOG`: UInt = 1019u;
public const val `MD_SERVER_LISTEN_TIMEOUT`: UInt = 1020u;
public const val `MD_SERVER_SIZE`: UInt = 1018u;
public const val `MD_SERVER_SIZE_LARGE`: UInt = 2u;
public const val `MD_SERVER_SIZE_MEDIUM`: UInt = 1u;
public const val `MD_SERVER_SIZE_SMALL`: UInt = 0u;
public const val `MD_SERVER_STATE`: UInt = 1016u;
public const val `MD_SERVER_STATE_CONTINUING`: UInt = 7u;
public const val `MD_SERVER_STATE_PAUSED`: UInt = 6u;
public const val `MD_SERVER_STATE_PAUSING`: UInt = 5u;
public const val `MD_SERVER_STATE_STARTED`: UInt = 2u;
public const val `MD_SERVER_STATE_STARTING`: UInt = 1u;
public const val `MD_SERVER_STATE_STOPPED`: UInt = 4u;
public const val `MD_SERVER_STATE_STOPPING`: UInt = 3u;
public const val `MD_SET_HOST_NAME`: UInt = 2154u;
public const val `MD_SHOW_4_DIGIT_YEAR`: UInt = 5010u;
public const val `MD_SSI_EXEC_DISABLED`: UInt = 6028u;
public const val `MD_SSL_ACCESS_PERM`: UInt = 6030u;
public const val `MD_SSL_ALWAYS_NEGO_CLIENT_CERT`: UInt = 5521u;
public const val `MD_SSL_KEY_PASSWORD`: UInt = 5502u;
public const val `MD_SSL_KEY_REQUEST`: UInt = 5503u;
public const val `MD_SSL_PRIVATE_KEY`: UInt = 5501u;
public const val `MD_SSL_PUBLIC_KEY`: UInt = 5500u;
public const val `MD_SSL_USE_DS_MAPPER`: UInt = 5519u;
public const val `MD_STOP_LISTENING`: UInt = 9987u;
public const val `MD_SUPPRESS_DEFAULT_BANNER`: UInt = 5017u;
public const val `MD_UPLOAD_READAHEAD_SIZE`: UInt = 6045u;
public const val `MD_URL_AUTHORIZATION_IMPERSONATION_LEVEL`: UInt = 6053u;
public const val `MD_URL_AUTHORIZATION_SCOPE_NAME`: UInt = 6050u;
public const val `MD_URL_AUTHORIZATION_STORE_NAME`: UInt = 6049u;
public const val `MD_USER_ISOLATION`: UInt = 5012u;
public const val `MD_USER_ISOLATION_AD`: UInt = 2u;
public const val `MD_USER_ISOLATION_BASIC`: UInt = 1u;
public const val `MD_USER_ISOLATION_LAST`: UInt = 2u;
public const val `MD_USER_ISOLATION_NONE`: UInt = 0u;
public const val `MD_USE_DIGEST_SSP`: UInt = 6047u;
public const val `MD_USE_HOST_NAME`: UInt = 2066u;
public const val `MD_VR_IGNORE_TRANSLATE`: UInt = 3008u;
public const val `MD_VR_NO_CACHE`: UInt = 3007u;
public const val `MD_VR_PASSTHROUGH`: UInt = 3006u;
public const val `MD_VR_PASSWORD`: UInt = 3003u;
public const val `MD_VR_PATH`: UInt = 3001u;
public const val `MD_VR_USERNAME`: UInt = 3002u;
public const val `MD_WAM_PWD`: UInt = 7502u;
public const val `MD_WAM_USER_NAME`: UInt = 7501u;
public const val `MD_WARNING_DUP_NAME`: Int = 837636;
public const val `MD_WARNING_INVALID_DATA`: Int = 837637;
public const val `MD_WARNING_PATH_NOT_FOUND`: Int = 837635;
public const val `MD_WARNING_PATH_NOT_INSERTED`: Int = 837639;
public const val `MD_WARNING_SAVE_FAILED`: Int = 837641;
public const val `MD_WEBDAV_MAX_ATTRIBUTES_PER_ELEMENT`: UInt = 8501u;
public const val `MD_WEB_SVC_EXT_RESTRICTION_LIST`: UInt = 2168u;
public const val `MD_WIN32_ERROR`: UInt = 1099u;
public typealias `METADATATYPES` = Int;
public const val `METADATA_DONT_EXPAND`: UInt = 512u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `METADATA_GETALL_INTERNAL_RECORD` (
    public var `dwMDIdentifier`: UInt,
    public var `dwMDAttributes`: UInt,
    public var `dwMDUserType`: UInt,
    public var `dwMDDataType`: UInt,
    public var `dwMDDataLen`: UInt,
    public var `Anonymous`: `METADATA_GETALL_INTERNAL_RECORD_0`,
    public var `dwMDDataTag`: UInt,
)
// UNSUPPORTED Rust 1390:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for METADATA_GETALL_INTERNAL_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1395:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union METADATA_GETALL_INTERNAL_RECORD_0 {
//     pub dwMDDataOffset: usize,
//     pub pbMDData: *mut u8,
// }

// UNSUPPORTED Rust 1401:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for METADATA_GETALL_INTERNAL_RECORD_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `METADATA_GETALL_RECORD` (
    public var `dwMDIdentifier`: UInt,
    public var `dwMDAttributes`: UInt,
    public var `dwMDUserType`: UInt,
    public var `dwMDDataType`: UInt,
    public var `dwMDDataLen`: UInt,
    public var `dwMDDataOffset`: UInt,
    public var `dwMDDataTag`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `METADATA_HANDLE_INFO` (
    public var `dwMDPermissions`: UInt,
    public var `dwMDSystemChangeNumber`: UInt,
)
public const val `METADATA_INHERIT`: UInt = 1u;
public const val `METADATA_INSERT_PATH`: UInt = 64u;
public const val `METADATA_ISINHERITED`: UInt = 32u;
public const val `METADATA_LOCAL_MACHINE_ONLY`: UInt = 128u;
public const val `METADATA_MASTER_ROOT_HANDLE`: UInt = 0u;
public const val `METADATA_MAX_NAME_LEN`: UInt = 256u;
public const val `METADATA_NON_SECURE_ONLY`: UInt = 256u;
public const val `METADATA_NO_ATTRIBUTES`: UInt = 0u;
public const val `METADATA_PARTIAL_PATH`: UInt = 2u;
public const val `METADATA_PERMISSION_READ`: UInt = 1u;
public const val `METADATA_PERMISSION_WRITE`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `METADATA_RECORD` (
    public var `dwMDIdentifier`: UInt,
    public var `dwMDAttributes`: UInt,
    public var `dwMDUserType`: UInt,
    public var `dwMDDataType`: UInt,
    public var `dwMDDataLen`: UInt,
    public var `pbMDData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `dwMDDataTag`: UInt,
)
// UNSUPPORTED Rust 1445:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for METADATA_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `METADATA_REFERENCE`: UInt = 8u;
public const val `METADATA_SECURE`: UInt = 4u;
public const val `METADATA_VOLATILE`: UInt = 16u;
public const val `MSCS_MD_ID_BEGIN_RESERVED`: UInt = 53248u;
public const val `MSCS_MD_ID_END_RESERVED`: UInt = 57343u;
public const val `MULTISZ_METADATA`: `METADATATYPES` = 5;
public const val `NNTP_MD_ID_BEGIN_RESERVED`: UInt = 45056u;
public const val `NNTP_MD_ID_END_RESERVED`: UInt = 49151u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_GETEXTENSIONVERSION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`HSE_VERSION_INFO`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_HSE_CACHE_INVALIDATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_HSE_GET_PROTOCOL_MANAGER_CUSTOM_INTERFACE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_HSE_IO_COMPLETION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`EXTENSION_CONTROL_BLOCK`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_HTTPEXTENSIONPROC` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`EXTENSION_CONTROL_BLOCK`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_IIS_GETSERVERVARIABLE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HCONN`, `windows_sys`.`core`.`PCSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_IIS_READCLIENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HCONN`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_IIS_SERVERSUPPORTFUNCTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HCONN`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_IIS_WRITECLIENT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`HCONN`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_TERMINATEEXTENSION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WEB_CORE_ACTIVATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WEB_CORE_SET_METADATA_DLL_ENTRY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFN_WEB_CORE_SHUTDOWN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `POP3_MD_ID_BEGIN_RESERVED`: UInt = 40960u;
public const val `POP3_MD_ID_END_RESERVED`: UInt = 45055u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `POST_PROCESS_PARAMETERS` (
    public var `pszSessionId`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszSiteName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszUserName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszHostName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszRemoteIpAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwRemoteIpPort`: UInt,
    public var `pszLocalIpAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwLocalIpPort`: UInt,
    public var `BytesSent`: ULong,
    public var `BytesReceived`: ULong,
    public var `pszCommand`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszCommandParameters`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszFullPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszPhysicalPath`: `windows_sys`.`core`.`PCWSTR`,
    public var `FtpStatus`: UInt,
    public var `FtpSubStatus`: UInt,
    public var `hrStatus`: `windows_sys`.`core`.`HRESULT`,
    public var `SessionStartTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `BytesSentPerSession`: ULong,
    public var `BytesReceivedPerSession`: ULong,
)
// UNSUPPORTED Rust 1497:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for POST_PROCESS_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PRE_PROCESS_PARAMETERS` (
    public var `pszSessionId`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszSiteName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszUserName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszHostName`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszRemoteIpAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwRemoteIpPort`: UInt,
    public var `pszLocalIpAddress`: `windows_sys`.`core`.`PCWSTR`,
    public var `dwLocalIpPort`: UInt,
    public var `pszCommand`: `windows_sys`.`core`.`PCWSTR`,
    public var `pszCommandParameters`: `windows_sys`.`core`.`PCWSTR`,
    public var `SessionStartTime`: `super`.`super`.`Foundation`.`FILETIME`,
    public var `BytesSentPerSession`: ULong,
    public var `BytesReceivedPerSession`: ULong,
)
// UNSUPPORTED Rust 1519:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PRE_PROCESS_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `SF_DENIED_APPLICATION`: UInt = 8u;
public const val `SF_DENIED_BY_CONFIG`: UInt = 65536u;
public const val `SF_DENIED_FILTER`: UInt = 4u;
public const val `SF_DENIED_LOGON`: UInt = 1u;
public const val `SF_DENIED_RESOURCE`: UInt = 2u;
public const val `SF_MAX_AUTH_TYPE`: UInt = 33u;
public const val `SF_MAX_FILTER_DESC_LEN`: UInt = 257u;
public const val `SF_MAX_PASSWORD`: UInt = 257u;
public const val `SF_MAX_USERNAME`: UInt = 257u;
public const val `SF_NOTIFY_ACCESS_DENIED`: UInt = 2048u;
public const val `SF_NOTIFY_AUTHENTICATION`: UInt = 8192u;
public const val `SF_NOTIFY_AUTH_COMPLETE`: UInt = 67108864u;
public const val `SF_NOTIFY_END_OF_NET_SESSION`: UInt = 256u;
public const val `SF_NOTIFY_END_OF_REQUEST`: UInt = 128u;
public const val `SF_NOTIFY_LOG`: UInt = 512u;
public const val `SF_NOTIFY_NONSECURE_PORT`: UInt = 2u;
public const val `SF_NOTIFY_ORDER_DEFAULT`: UInt = 131072u;
public const val `SF_NOTIFY_ORDER_HIGH`: UInt = 524288u;
public const val `SF_NOTIFY_ORDER_LOW`: UInt = 131072u;
public const val `SF_NOTIFY_ORDER_MEDIUM`: UInt = 262144u;
public const val `SF_NOTIFY_PREPROC_HEADERS`: UInt = 16384u;
public const val `SF_NOTIFY_READ_RAW_DATA`: UInt = 32768u;
public const val `SF_NOTIFY_SECURE_PORT`: UInt = 1u;
public const val `SF_NOTIFY_SEND_RAW_DATA`: UInt = 1024u;
public const val `SF_NOTIFY_SEND_RESPONSE`: UInt = 64u;
public const val `SF_NOTIFY_URL_MAP`: UInt = 4096u;
public typealias `SF_PROPERTY_IIS` = Int;
public const val `SF_PROPERTY_INSTANCE_NUM_ID`: `SF_PROPERTY_IIS` = 1;
public const val `SF_PROPERTY_SSL_CTXT`: `SF_PROPERTY_IIS` = 0;
public const val `SF_REQ_ADD_HEADERS_ON_DENIAL`: `SF_REQ_TYPE` = 1;
public const val `SF_REQ_DISABLE_NOTIFICATIONS`: `SF_REQ_TYPE` = 8;
public const val `SF_REQ_GET_CONNID`: `SF_REQ_TYPE` = 4;
public const val `SF_REQ_GET_PROPERTY`: `SF_REQ_TYPE` = 6;
public const val `SF_REQ_NORMALIZE_URL`: `SF_REQ_TYPE` = 7;
public const val `SF_REQ_SEND_RESPONSE_HEADER`: `SF_REQ_TYPE` = 0;
public const val `SF_REQ_SET_CERTIFICATE_INFO`: `SF_REQ_TYPE` = 5;
public const val `SF_REQ_SET_NEXT_READ_SIZE`: `SF_REQ_TYPE` = 2;
public const val `SF_REQ_SET_PROXY_INFO`: `SF_REQ_TYPE` = 3;
public typealias `SF_REQ_TYPE` = Int;
public const val `SF_STATUS_REQ_ERROR`: `SF_STATUS_TYPE` = 134217732;
public const val `SF_STATUS_REQ_FINISHED`: `SF_STATUS_TYPE` = 134217728;
public const val `SF_STATUS_REQ_FINISHED_KEEP_CONN`: `SF_STATUS_TYPE` = 134217729;
public const val `SF_STATUS_REQ_HANDLED_NOTIFICATION`: `SF_STATUS_TYPE` = 134217731;
public const val `SF_STATUS_REQ_NEXT_NOTIFICATION`: `SF_STATUS_TYPE` = 134217730;
public const val `SF_STATUS_REQ_READ_NEXT`: `SF_STATUS_TYPE` = 134217733;
public typealias `SF_STATUS_TYPE` = Int;
public const val `SMTP_MD_ID_BEGIN_RESERVED`: UInt = 36864u;
public const val `SMTP_MD_ID_END_RESERVED`: UInt = 40959u;
public const val `STRING_METADATA`: `METADATATYPES` = 2;
public const val `USER_MD_ID_BASE_RESERVED`: UInt = 65535u;
public const val `WAM_MD_ID_BEGIN_RESERVED`: UInt = 29952u;
public const val `WAM_MD_ID_END_RESERVED`: UInt = 32767u;
public const val `WAM_MD_SERVER_BASE`: UInt = 7500u;
public const val `WEBDAV_MD_SERVER_BASE`: UInt = 8500u;
// UNSUPPORTED Rust 1578:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WEB_CORE_ACTIVATE_DLL_ENTRY: windows_sys::core::PCSTR = windows_sys::core::s!("WebCoreActivate");

// UNSUPPORTED Rust 1579:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WEB_CORE_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("hwebcore.dll");

// UNSUPPORTED Rust 1580:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WEB_CORE_SET_METADATA_DLL_ENTRY: windows_sys::core::PCSTR = windows_sys::core::s!("WebCoreSetMetadata");

// UNSUPPORTED Rust 1581:1: non-scalar type Ptr unsupported; syntax: no per-file syntax rule for Const
// pub const WEB_CORE_SHUTDOWN_DLL_ENTRY: windows_sys::core::PCSTR = windows_sys::core::s!("WebCoreShutdown");

