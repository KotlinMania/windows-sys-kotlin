// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DavAddConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavAddConnection`(`connectionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?, `remotename` : `windows_sys`.`core`.`PCWSTR`, `username` : `windows_sys`.`core`.`PCWSTR`, `password` : `windows_sys`.`core`.`PCWSTR`, `clientcert` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `certsize` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=DavCancelConnectionsToServer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavCancelConnectionsToServer`(`lpname` : `windows_sys`.`core`.`PCWSTR`, `fforce` : `windows_sys`.`core`.`BOOL`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DavDeleteConnection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavDeleteConnection`(`connectionhandle` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DavFlushFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavFlushFile`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DavGetExtendedError; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavGetExtendedError`(`hfile` : `super`.`super`.`Foundation`.`HANDLE`, `exterror` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `exterrorstring` : `windows_sys`.`core`.`PWSTR`, `cchsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DavGetHTTPFromUNCPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavGetHTTPFromUNCPath`(`uncpath` : `windows_sys`.`core`.`PCWSTR`, `url` : `windows_sys`.`core`.`PWSTR`, `lpsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=DavGetTheLockOwnerOfTheFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavGetTheLockOwnerOfTheFile`(`filename` : `windows_sys`.`core`.`PCWSTR`, `lockownername` : `windows_sys`.`core`.`PWSTR`, `lockownernamelengthinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=DavGetUNCFromHTTPPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavGetUNCFromHTTPPath`(`url` : `windows_sys`.`core`.`PCWSTR`, `uncpath` : `windows_sys`.`core`.`PWSTR`, `lpsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=DavInvalidateCache; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavInvalidateCache`(`urlname` : `windows_sys`.`core`.`PCWSTR`) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=DavRegisterAuthCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavRegisterAuthCallback`(`callback` : `PFNDAVAUTHCALLBACK`, `version` : UInt) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=davclnt.dll, ABI=system, export=DavUnregisterAuthCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DavUnregisterAuthCallback`(`hcallback` : UInt)
public typealias `AUTHNEXTSTEP` = Int;
public const val `CancelRequest`: `AUTHNEXTSTEP` = 2;
public const val `DAV_AUTHN_SCHEME_BASIC`: UInt = 1u;
public const val `DAV_AUTHN_SCHEME_CERT`: UInt = 65536u;
public const val `DAV_AUTHN_SCHEME_DIGEST`: UInt = 8u;
public const val `DAV_AUTHN_SCHEME_FBA`: UInt = 1048576u;
public const val `DAV_AUTHN_SCHEME_NEGOTIATE`: UInt = 16u;
public const val `DAV_AUTHN_SCHEME_NTLM`: UInt = 2u;
public const val `DAV_AUTHN_SCHEME_PASSPORT`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DAV_CALLBACK_AUTH_BLOB` (
    public var `pBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `ulSize`: UInt,
    public var `ulType`: UInt,
)
// UNSUPPORTED Rust 28:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DAV_CALLBACK_AUTH_BLOB {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DAV_CALLBACK_AUTH_UNP` (
    public var `pszUserName`: `windows_sys`.`core`.`PWSTR`,
    public var `ulUserNameLength`: UInt,
    public var `pszPassword`: `windows_sys`.`core`.`PWSTR`,
    public var `ulPasswordLength`: UInt,
)
// UNSUPPORTED Rust 41:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for DAV_CALLBACK_AUTH_UNP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DAV_CALLBACK_CRED` (
    public var `AuthBlob`: `DAV_CALLBACK_AUTH_BLOB`,
    public var `UNPBlob`: `DAV_CALLBACK_AUTH_UNP`,
    public var `bAuthBlobValid`: `windows_sys`.`core`.`BOOL`,
    public var `bSave`: `windows_sys`.`core`.`BOOL`,
)
public const val `DefaultBehavior`: `AUTHNEXTSTEP` = 0;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNDAVAUTHCALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, UInt, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`DAV_CALLBACK_CRED`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`AUTHNEXTSTEP`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`PFNDAVAUTHCALLBACK_FREECRED`>?) -> UInt>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PFNDAVAUTHCALLBACK_FREECRED` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> UInt>>>;
public const val `RetryRequest`: `AUTHNEXTSTEP` = 1;
