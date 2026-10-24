// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNMSGECALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`BOOL`, `windows_sys`.`core`.`PCWSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_ASSIGN_SHELL_PROTECTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_CHANGE_PASSWORD_NOTIFY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`WLX_MPR_NOTIFY_INFO`>?, UInt) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_CHANGE_PASSWORD_NOTIFY_EX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`WLX_MPR_NOTIFY_INFO`>?, UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_StationsAndDesktops")]
public typealias `PWLX_CLOSE_USER_DESKTOP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`WLX_DESKTOP`>?, `super`.`super`.`Foundation`.`HANDLE`) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_StationsAndDesktops")]
public typealias `PWLX_CREATE_USER_DESKTOP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, UInt, `windows_sys`.`core`.`PCWSTR`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLX_DESKTOP`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `PWLX_DIALOG_BOX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HWND`, `super`.`super`.`UI`.`WindowsAndMessaging`.`DLGPROC`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `PWLX_DIALOG_BOX_INDIRECT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`DLGTEMPLATE`>?, `super`.`super`.`Foundation`.`HWND`, `super`.`super`.`UI`.`WindowsAndMessaging`.`DLGPROC`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `PWLX_DIALOG_BOX_INDIRECT_PARAM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`DLGTEMPLATE`>?, `super`.`super`.`Foundation`.`HWND`, `super`.`super`.`UI`.`WindowsAndMessaging`.`DLGPROC`, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public typealias `PWLX_DIALOG_BOX_PARAM` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HANDLE`, `windows_sys`.`core`.`PCWSTR`, `super`.`super`.`Foundation`.`HWND`, `super`.`super`.`UI`.`WindowsAndMessaging`.`DLGPROC`, `super`.`super`.`Foundation`.`LPARAM`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_DISCONNECT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_GET_OPTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_StationsAndDesktops")]
public typealias `PWLX_GET_SOURCE_DESKTOP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WLX_DESKTOP`>>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_MESSAGE_BOX` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, `super`.`super`.`Foundation`.`HWND`, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_QUERY_CLIENT_CREDENTIALS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WLX_CLIENT_CREDENTIALS_INFO_V1_0`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_QUERY_CONSOLESWITCH_CREDENTIALS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WLX_CONSOLESWITCH_CREDENTIALS_INFO_V1_0`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_QUERY_IC_CREDENTIALS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WLX_CLIENT_CREDENTIALS_INFO_V1_0`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_QUERY_TERMINAL_SERVICES_DATA` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`WLX_TERMINAL_SERVICES_DATA`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_QUERY_TS_LOGON_CREDENTIALS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WLX_CLIENT_CREDENTIALS_INFO_V2_0`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_SAS_NOTIFY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_SET_CONTEXT_POINTER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_SET_OPTION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_StationsAndDesktops")]
public typealias `PWLX_SET_RETURN_DESKTOP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, /* Rust *mut */ kotlinx.cinterop.CPointer<`WLX_DESKTOP`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_SET_TIMEOUT` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`, UInt) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_SWITCH_DESKTOP_TO_USER` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_SWITCH_DESKTOP_TO_WINLOGON` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> Int>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_USE_CTRL_ALT_DEL` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWLX_WIN31_MIGRATE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`super`.`super`.`Foundation`.`HANDLE`) -> Unit>>>;
public const val `STATUSMSG_OPTION_NOANIMATION`: UInt = 1u;
public const val `STATUSMSG_OPTION_SETFOREGROUND`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_CLIENT_CREDENTIALS_INFO_V1_0` (
    public var `dwType`: UInt,
    public var `pszUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDomain`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPassword`: `windows_sys`.`core`.`PWSTR`,
    public var `fPromptForPassword`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_CLIENT_CREDENTIALS_INFO_V1_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WLX_CLIENT_CREDENTIALS_INFO_V1_0`.Companion.`default`() : `WLX_CLIENT_CREDENTIALS_INFO_V1_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_CLIENT_CREDENTIALS_INFO_V2_0` (
    public var `dwType`: UInt,
    public var `pszUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDomain`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPassword`: `windows_sys`.`core`.`PWSTR`,
    public var `fPromptForPassword`: `windows_sys`.`core`.`BOOL`,
    public var `fDisconnectOnLogonFailure`: `windows_sys`.`core`.`BOOL`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_CLIENT_CREDENTIALS_INFO_V2_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WLX_CLIENT_CREDENTIALS_INFO_V2_0`.Companion.`default`() : `WLX_CLIENT_CREDENTIALS_INFO_V2_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WLX_CONSOLESWITCHCREDENTIAL_TYPE_V1_0`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_CONSOLESWITCH_CREDENTIALS_INFO_V1_0` (
    public var `dwType`: UInt,
    public var `UserToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `LogonId`: `super`.`super`.`Foundation`.`LUID`,
    public var `Quotas`: `super`.`QUOTA_LIMITS`,
    public var `UserName`: `windows_sys`.`core`.`PWSTR`,
    public var `Domain`: `windows_sys`.`core`.`PWSTR`,
    public var `LogonTime`: Long,
    public var `SmartCardLogon`: `windows_sys`.`core`.`BOOL`,
    public var `ProfileLength`: UInt,
    public var `MessageType`: UInt,
    public var `LogonCount`: UShort,
    public var `BadPasswordCount`: UShort,
    public var `ProfileLogonTime`: Long,
    public var `LogoffTime`: Long,
    public var `KickOffTime`: Long,
    public var `PasswordLastSet`: Long,
    public var `PasswordCanChange`: Long,
    public var `PasswordMustChange`: Long,
    public var `LogonScript`: `windows_sys`.`core`.`PWSTR`,
    public var `HomeDirectory`: `windows_sys`.`core`.`PWSTR`,
    public var `FullName`: `windows_sys`.`core`.`PWSTR`,
    public var `ProfilePath`: `windows_sys`.`core`.`PWSTR`,
    public var `HomeDirectoryDrive`: `windows_sys`.`core`.`PWSTR`,
    public var `LogonServer`: `windows_sys`.`core`.`PWSTR`,
    public var `UserFlags`: UInt,
    public var `PrivateDataLen`: UInt,
    public var `PrivateData`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_CONSOLESWITCH_CREDENTIALS_INFO_V1_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WLX_CONSOLESWITCH_CREDENTIALS_INFO_V1_0`.Companion.`default`() : `WLX_CONSOLESWITCH_CREDENTIALS_INFO_V1_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WLX_CREATE_INSTANCE_ONLY`: UInt = 1u;
public const val `WLX_CREATE_USER`: UInt = 2u;
public const val `WLX_CREDENTIAL_TYPE_V1_0`: UInt = 1u;
public const val `WLX_CREDENTIAL_TYPE_V2_0`: UInt = 2u;
public const val `WLX_CURRENT_VERSION`: UInt = 65540u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_StationsAndDesktops")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_DESKTOP` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `hDesktop`: `super`.`super`.`System`.`StationsAndDesktops`.`HDESK`,
    public var `pszDesktopName`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_DESKTOP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_StationsAndDesktops")]

    public fun `WLX_DESKTOP`.Companion.`default`() : `WLX_DESKTOP` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WLX_DESKTOP_HANDLE`: UInt = 2u;
public const val `WLX_DESKTOP_NAME`: UInt = 1u;
public const val `WLX_DIRECTORY_LENGTH`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLX_DISPATCH_VERSION_1_0` (
    public var `WlxUseCtrlAltDel`: `PWLX_USE_CTRL_ALT_DEL`,
    public var `WlxSetContextPointer`: `PWLX_SET_CONTEXT_POINTER`,
    public var `WlxSasNotify`: `PWLX_SAS_NOTIFY`,
    public var `WlxSetTimeout`: `PWLX_SET_TIMEOUT`,
    public var `WlxAssignShellProtection`: `PWLX_ASSIGN_SHELL_PROTECTION`,
    public var `WlxMessageBox`: `PWLX_MESSAGE_BOX`,
    public var `WlxDialogBox`: `PWLX_DIALOG_BOX`,
    public var `WlxDialogBoxParam`: `PWLX_DIALOG_BOX_PARAM`,
    public var `WlxDialogBoxIndirect`: `PWLX_DIALOG_BOX_INDIRECT`,
    public var `WlxDialogBoxIndirectParam`: `PWLX_DIALOG_BOX_INDIRECT_PARAM`,
    public var `WlxSwitchDesktopToUser`: `PWLX_SWITCH_DESKTOP_TO_USER`,
    public var `WlxSwitchDesktopToWinlogon`: `PWLX_SWITCH_DESKTOP_TO_WINLOGON`,
    public var `WlxChangePasswordNotify`: `PWLX_CHANGE_PASSWORD_NOTIFY`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_StationsAndDesktops", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLX_DISPATCH_VERSION_1_1` (
    public var `WlxUseCtrlAltDel`: `PWLX_USE_CTRL_ALT_DEL`,
    public var `WlxSetContextPointer`: `PWLX_SET_CONTEXT_POINTER`,
    public var `WlxSasNotify`: `PWLX_SAS_NOTIFY`,
    public var `WlxSetTimeout`: `PWLX_SET_TIMEOUT`,
    public var `WlxAssignShellProtection`: `PWLX_ASSIGN_SHELL_PROTECTION`,
    public var `WlxMessageBox`: `PWLX_MESSAGE_BOX`,
    public var `WlxDialogBox`: `PWLX_DIALOG_BOX`,
    public var `WlxDialogBoxParam`: `PWLX_DIALOG_BOX_PARAM`,
    public var `WlxDialogBoxIndirect`: `PWLX_DIALOG_BOX_INDIRECT`,
    public var `WlxDialogBoxIndirectParam`: `PWLX_DIALOG_BOX_INDIRECT_PARAM`,
    public var `WlxSwitchDesktopToUser`: `PWLX_SWITCH_DESKTOP_TO_USER`,
    public var `WlxSwitchDesktopToWinlogon`: `PWLX_SWITCH_DESKTOP_TO_WINLOGON`,
    public var `WlxChangePasswordNotify`: `PWLX_CHANGE_PASSWORD_NOTIFY`,
    public var `WlxGetSourceDesktop`: `PWLX_GET_SOURCE_DESKTOP`,
    public var `WlxSetReturnDesktop`: `PWLX_SET_RETURN_DESKTOP`,
    public var `WlxCreateUserDesktop`: `PWLX_CREATE_USER_DESKTOP`,
    public var `WlxChangePasswordNotifyEx`: `PWLX_CHANGE_PASSWORD_NOTIFY_EX`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_StationsAndDesktops", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLX_DISPATCH_VERSION_1_2` (
    public var `WlxUseCtrlAltDel`: `PWLX_USE_CTRL_ALT_DEL`,
    public var `WlxSetContextPointer`: `PWLX_SET_CONTEXT_POINTER`,
    public var `WlxSasNotify`: `PWLX_SAS_NOTIFY`,
    public var `WlxSetTimeout`: `PWLX_SET_TIMEOUT`,
    public var `WlxAssignShellProtection`: `PWLX_ASSIGN_SHELL_PROTECTION`,
    public var `WlxMessageBox`: `PWLX_MESSAGE_BOX`,
    public var `WlxDialogBox`: `PWLX_DIALOG_BOX`,
    public var `WlxDialogBoxParam`: `PWLX_DIALOG_BOX_PARAM`,
    public var `WlxDialogBoxIndirect`: `PWLX_DIALOG_BOX_INDIRECT`,
    public var `WlxDialogBoxIndirectParam`: `PWLX_DIALOG_BOX_INDIRECT_PARAM`,
    public var `WlxSwitchDesktopToUser`: `PWLX_SWITCH_DESKTOP_TO_USER`,
    public var `WlxSwitchDesktopToWinlogon`: `PWLX_SWITCH_DESKTOP_TO_WINLOGON`,
    public var `WlxChangePasswordNotify`: `PWLX_CHANGE_PASSWORD_NOTIFY`,
    public var `WlxGetSourceDesktop`: `PWLX_GET_SOURCE_DESKTOP`,
    public var `WlxSetReturnDesktop`: `PWLX_SET_RETURN_DESKTOP`,
    public var `WlxCreateUserDesktop`: `PWLX_CREATE_USER_DESKTOP`,
    public var `WlxChangePasswordNotifyEx`: `PWLX_CHANGE_PASSWORD_NOTIFY_EX`,
    public var `WlxCloseUserDesktop`: `PWLX_CLOSE_USER_DESKTOP`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_StationsAndDesktops", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLX_DISPATCH_VERSION_1_3` (
    public var `WlxUseCtrlAltDel`: `PWLX_USE_CTRL_ALT_DEL`,
    public var `WlxSetContextPointer`: `PWLX_SET_CONTEXT_POINTER`,
    public var `WlxSasNotify`: `PWLX_SAS_NOTIFY`,
    public var `WlxSetTimeout`: `PWLX_SET_TIMEOUT`,
    public var `WlxAssignShellProtection`: `PWLX_ASSIGN_SHELL_PROTECTION`,
    public var `WlxMessageBox`: `PWLX_MESSAGE_BOX`,
    public var `WlxDialogBox`: `PWLX_DIALOG_BOX`,
    public var `WlxDialogBoxParam`: `PWLX_DIALOG_BOX_PARAM`,
    public var `WlxDialogBoxIndirect`: `PWLX_DIALOG_BOX_INDIRECT`,
    public var `WlxDialogBoxIndirectParam`: `PWLX_DIALOG_BOX_INDIRECT_PARAM`,
    public var `WlxSwitchDesktopToUser`: `PWLX_SWITCH_DESKTOP_TO_USER`,
    public var `WlxSwitchDesktopToWinlogon`: `PWLX_SWITCH_DESKTOP_TO_WINLOGON`,
    public var `WlxChangePasswordNotify`: `PWLX_CHANGE_PASSWORD_NOTIFY`,
    public var `WlxGetSourceDesktop`: `PWLX_GET_SOURCE_DESKTOP`,
    public var `WlxSetReturnDesktop`: `PWLX_SET_RETURN_DESKTOP`,
    public var `WlxCreateUserDesktop`: `PWLX_CREATE_USER_DESKTOP`,
    public var `WlxChangePasswordNotifyEx`: `PWLX_CHANGE_PASSWORD_NOTIFY_EX`,
    public var `WlxCloseUserDesktop`: `PWLX_CLOSE_USER_DESKTOP`,
    public var `WlxSetOption`: `PWLX_SET_OPTION`,
    public var `WlxGetOption`: `PWLX_GET_OPTION`,
    public var `WlxWin31Migrate`: `PWLX_WIN31_MIGRATE`,
    public var `WlxQueryClientCredentials`: `PWLX_QUERY_CLIENT_CREDENTIALS`,
    public var `WlxQueryInetConnectorCredentials`: `PWLX_QUERY_IC_CREDENTIALS`,
    public var `WlxDisconnect`: `PWLX_DISCONNECT`,
    public var `WlxQueryTerminalServicesData`: `PWLX_QUERY_TERMINAL_SERVICES_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(all(feature = "Win32_System_StationsAndDesktops", feature = "Win32_UI_WindowsAndMessaging"))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WLX_DISPATCH_VERSION_1_4` (
    public var `WlxUseCtrlAltDel`: `PWLX_USE_CTRL_ALT_DEL`,
    public var `WlxSetContextPointer`: `PWLX_SET_CONTEXT_POINTER`,
    public var `WlxSasNotify`: `PWLX_SAS_NOTIFY`,
    public var `WlxSetTimeout`: `PWLX_SET_TIMEOUT`,
    public var `WlxAssignShellProtection`: `PWLX_ASSIGN_SHELL_PROTECTION`,
    public var `WlxMessageBox`: `PWLX_MESSAGE_BOX`,
    public var `WlxDialogBox`: `PWLX_DIALOG_BOX`,
    public var `WlxDialogBoxParam`: `PWLX_DIALOG_BOX_PARAM`,
    public var `WlxDialogBoxIndirect`: `PWLX_DIALOG_BOX_INDIRECT`,
    public var `WlxDialogBoxIndirectParam`: `PWLX_DIALOG_BOX_INDIRECT_PARAM`,
    public var `WlxSwitchDesktopToUser`: `PWLX_SWITCH_DESKTOP_TO_USER`,
    public var `WlxSwitchDesktopToWinlogon`: `PWLX_SWITCH_DESKTOP_TO_WINLOGON`,
    public var `WlxChangePasswordNotify`: `PWLX_CHANGE_PASSWORD_NOTIFY`,
    public var `WlxGetSourceDesktop`: `PWLX_GET_SOURCE_DESKTOP`,
    public var `WlxSetReturnDesktop`: `PWLX_SET_RETURN_DESKTOP`,
    public var `WlxCreateUserDesktop`: `PWLX_CREATE_USER_DESKTOP`,
    public var `WlxChangePasswordNotifyEx`: `PWLX_CHANGE_PASSWORD_NOTIFY_EX`,
    public var `WlxCloseUserDesktop`: `PWLX_CLOSE_USER_DESKTOP`,
    public var `WlxSetOption`: `PWLX_SET_OPTION`,
    public var `WlxGetOption`: `PWLX_GET_OPTION`,
    public var `WlxWin31Migrate`: `PWLX_WIN31_MIGRATE`,
    public var `WlxQueryClientCredentials`: `PWLX_QUERY_CLIENT_CREDENTIALS`,
    public var `WlxQueryInetConnectorCredentials`: `PWLX_QUERY_IC_CREDENTIALS`,
    public var `WlxDisconnect`: `PWLX_DISCONNECT`,
    public var `WlxQueryTerminalServicesData`: `PWLX_QUERY_TERMINAL_SERVICES_DATA`,
    public var `WlxQueryConsoleSwitchCredentials`: `PWLX_QUERY_CONSOLESWITCH_CREDENTIALS`,
    public var `WlxQueryTsLogonCredentials`: `PWLX_QUERY_TS_LOGON_CREDENTIALS`,
)
public const val `WLX_DLG_INPUT_TIMEOUT`: UInt = 102u;
public const val `WLX_DLG_SAS`: UInt = 101u;
public const val `WLX_DLG_SCREEN_SAVER_TIMEOUT`: UInt = 103u;
public const val `WLX_DLG_USER_LOGOFF`: UInt = 104u;
public const val `WLX_LOGON_OPT_NO_PROFILE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_MPR_NOTIFY_INFO` (
    public var `pszUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszDomain`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPassword`: `windows_sys`.`core`.`PWSTR`,
    public var `pszOldPassword`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_MPR_NOTIFY_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WLX_MPR_NOTIFY_INFO`.Companion.`default`() : `WLX_MPR_NOTIFY_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_StationsAndDesktops")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_NOTIFICATION_INFO` (
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `UserName`: `windows_sys`.`core`.`PWSTR`,
    public var `Domain`: `windows_sys`.`core`.`PWSTR`,
    public var `WindowStation`: `windows_sys`.`core`.`PWSTR`,
    public var `hToken`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `hDesktop`: `super`.`super`.`System`.`StationsAndDesktops`.`HDESK`,
    public var `pStatusCallback`: `PFNMSGECALLBACK`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_NOTIFICATION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_StationsAndDesktops")]

    public fun `WLX_NOTIFICATION_INFO`.Companion.`default`() : `WLX_NOTIFICATION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WLX_OPTION_CONTEXT_POINTER`: UInt = 2u;
public const val `WLX_OPTION_DISPATCH_TABLE_SIZE`: UInt = 65539u;
public const val `WLX_OPTION_FORCE_LOGOFF_TIME`: UInt = 4u;
public const val `WLX_OPTION_IGNORE_AUTO_LOGON`: UInt = 8u;
public const val `WLX_OPTION_NO_SWITCH_ON_SAS`: UInt = 9u;
public const val `WLX_OPTION_SMART_CARD_INFO`: UInt = 65538u;
public const val `WLX_OPTION_SMART_CARD_PRESENT`: UInt = 65537u;
public const val `WLX_OPTION_USE_CTRL_ALT_DEL`: UInt = 1u;
public const val `WLX_OPTION_USE_SMART_CARD`: UInt = 3u;
public const val `WLX_PROFILE_TYPE_V1_0`: UInt = 1u;
public const val `WLX_PROFILE_TYPE_V2_0`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_PROFILE_V1_0` (
    public var `dwType`: UInt,
    public var `pszProfile`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_PROFILE_V1_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WLX_PROFILE_V1_0`.Companion.`default`() : `WLX_PROFILE_V1_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_PROFILE_V2_0` (
    public var `dwType`: UInt,
    public var `pszProfile`: `windows_sys`.`core`.`PWSTR`,
    public var `pszPolicy`: `windows_sys`.`core`.`PWSTR`,
    public var `pszNetworkDefaultUserProfile`: `windows_sys`.`core`.`PWSTR`,
    public var `pszServerName`: `windows_sys`.`core`.`PWSTR`,
    public var `pszEnvironment`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_PROFILE_V2_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WLX_PROFILE_V2_0`.Companion.`default`() : `WLX_PROFILE_V2_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WLX_SAS_ACTION_DELAYED_FORCE_LOGOFF`: UInt = 16u;
public const val `WLX_SAS_ACTION_FORCE_LOGOFF`: UInt = 9u;
public const val `WLX_SAS_ACTION_LOCK_WKSTA`: UInt = 3u;
public const val `WLX_SAS_ACTION_LOGOFF`: UInt = 4u;
public const val `WLX_SAS_ACTION_LOGON`: UInt = 1u;
public const val `WLX_SAS_ACTION_NONE`: UInt = 2u;
public const val `WLX_SAS_ACTION_PWD_CHANGED`: UInt = 6u;
public const val `WLX_SAS_ACTION_RECONNECTED`: UInt = 15u;
public const val `WLX_SAS_ACTION_SHUTDOWN`: `WLX_SHUTDOWN_TYPE` = 5u;
public const val `WLX_SAS_ACTION_SHUTDOWN_HIBERNATE`: UInt = 14u;
public const val `WLX_SAS_ACTION_SHUTDOWN_POWER_OFF`: `WLX_SHUTDOWN_TYPE` = 10u;
public const val `WLX_SAS_ACTION_SHUTDOWN_REBOOT`: `WLX_SHUTDOWN_TYPE` = 11u;
public const val `WLX_SAS_ACTION_SHUTDOWN_SLEEP`: UInt = 12u;
public const val `WLX_SAS_ACTION_SHUTDOWN_SLEEP2`: UInt = 13u;
public const val `WLX_SAS_ACTION_SWITCH_CONSOLE`: UInt = 17u;
public const val `WLX_SAS_ACTION_TASKLIST`: UInt = 7u;
public const val `WLX_SAS_ACTION_UNLOCK_WKSTA`: UInt = 8u;
public const val `WLX_SAS_TYPE_AUTHENTICATED`: UInt = 7u;
public const val `WLX_SAS_TYPE_CTRL_ALT_DEL`: UInt = 1u;
public const val `WLX_SAS_TYPE_MAX_MSFT_VALUE`: UInt = 127u;
public const val `WLX_SAS_TYPE_SCRNSVR_ACTIVITY`: UInt = 3u;
public const val `WLX_SAS_TYPE_SCRNSVR_TIMEOUT`: UInt = 2u;
public const val `WLX_SAS_TYPE_SC_FIRST_READER_ARRIVED`: UInt = 8u;
public const val `WLX_SAS_TYPE_SC_INSERT`: UInt = 5u;
public const val `WLX_SAS_TYPE_SC_LAST_READER_REMOVED`: UInt = 9u;
public const val `WLX_SAS_TYPE_SC_REMOVE`: UInt = 6u;
public const val `WLX_SAS_TYPE_SWITCHUSER`: UInt = 10u;
public const val `WLX_SAS_TYPE_TIMEOUT`: UInt = 0u;
public const val `WLX_SAS_TYPE_USER_LOGOFF`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_SC_NOTIFICATION_INFO` (
    public var `pszCard`: `windows_sys`.`core`.`PWSTR`,
    public var `pszReader`: `windows_sys`.`core`.`PWSTR`,
    public var `pszContainer`: `windows_sys`.`core`.`PWSTR`,
    public var `pszCryptoProvider`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_SC_NOTIFICATION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WLX_SC_NOTIFICATION_INFO`.Companion.`default`() : `WLX_SC_NOTIFICATION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WLX_SHUTDOWN_TYPE` = UInt;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 257 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WLX_TERMINAL_SERVICES_DATA` (
    public var `ProfilePath`: UShortArray,
    public var `HomeDir`: UShortArray,
    public var `HomeDirDrive`: UShortArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WLX_TERMINAL_SERVICES_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WLX_TERMINAL_SERVICES_DATA`.Companion.`default`() : `WLX_TERMINAL_SERVICES_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WLX_VERSION_1_0`: UInt = 65536u;
public const val `WLX_VERSION_1_1`: UInt = 65537u;
public const val `WLX_VERSION_1_2`: UInt = 65538u;
public const val `WLX_VERSION_1_3`: UInt = 65539u;
public const val `WLX_VERSION_1_4`: UInt = 65540u;
public const val `WLX_WM_SAS`: UInt = 1625u;
