// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmlocalmanagement.dll, ABI=system, export=ApplyLocalManagementSyncML; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ApplyLocalManagementSyncML`(`syncmlrequest` : `windows_sys`.`core`.`PCWSTR`, `syncmlresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=DiscoverManagementService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DiscoverManagementService`(`pszupn` : `windows_sys`.`core`.`PCWSTR`, `ppmgmtinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MANAGEMENT_SERVICE_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=DiscoverManagementServiceEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DiscoverManagementServiceEx`(`pszupn` : `windows_sys`.`core`.`PCWSTR`, `pszdiscoveryservicecandidate` : `windows_sys`.`core`.`PCWSTR`, `ppmgmtinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`MANAGEMENT_SERVICE_INFO`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=GetDeviceManagementConfigInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDeviceManagementConfigInfo`(`providerid` : `windows_sys`.`core`.`PCWSTR`, `configstringbufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `configstring` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=GetDeviceRegistrationInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetDeviceRegistrationInfo`(`deviceinformationclass` : `REGISTRATION_INFORMATION_CLASS`, `ppdeviceregistrationinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=GetManagementAppHyperlink; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetManagementAppHyperlink`(`cchhyperlink` : UInt, `pszhyperlink` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=IsDeviceRegisteredWithManagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsDeviceRegisteredWithManagement`(`pfisdeviceregisteredwithmanagement` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?, `cchupn` : UInt, `pszupn` : `windows_sys`.`core`.`PWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=IsManagementRegistrationAllowed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsManagementRegistrationAllowed`(`pfismanagementregistrationallowed` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=IsMdmUxWithoutAadAllowed; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsMdmUxWithoutAadAllowed`(`isenrollmentallowed` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmlocalmanagement.dll, ABI=system, export=RegisterDeviceWithLocalManagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterDeviceWithLocalManagement`(`alreadyregistered` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=RegisterDeviceWithManagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterDeviceWithManagement`(`pszupn` : `windows_sys`.`core`.`PCWSTR`, `ppszmdmserviceuri` : `windows_sys`.`core`.`PCWSTR`, `ppzsaccesstoken` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=RegisterDeviceWithManagementUsingAADCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterDeviceWithManagementUsingAADCredentials`(`usertoken` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=RegisterDeviceWithManagementUsingAADDeviceCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterDeviceWithManagementUsingAADDeviceCredentials`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=RegisterDeviceWithManagementUsingAADDeviceCredentials2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterDeviceWithManagementUsingAADDeviceCredentials2`(`mdmapplicationid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=SetDeviceManagementConfigInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetDeviceManagementConfigInfo`(`providerid` : `windows_sys`.`core`.`PCWSTR`, `configstring` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=SetManagedExternally; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetManagedExternally`(`ismanagedexternally` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmlocalmanagement.dll, ABI=system, export=UnregisterDeviceWithLocalManagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterDeviceWithLocalManagement`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=mdmregistration.dll, ABI=system, export=UnregisterDeviceWithManagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `UnregisterDeviceWithManagement`(`enrollmentid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
public const val `DEVICEREGISTRATIONTYPE_MAM`: UInt = 5u;
public const val `DEVICEREGISTRATIONTYPE_MDM_DEVICEWIDE_WITH_AAD`: UInt = 6u;
public const val `DEVICEREGISTRATIONTYPE_MDM_ONLY`: UInt = 0u;
public const val `DEVICEREGISTRATIONTYPE_MDM_USERSPECIFIC_WITH_AAD`: UInt = 13u;
public const val `DEVICE_ENROLLER_FACILITY_CODE`: UInt = 24u;
public const val `DeviceRegistrationBasicInfo`: `REGISTRATION_INFORMATION_CLASS` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MANAGEMENT_REGISTRATION_INFO` (
    public var `fDeviceRegisteredWithManagement`: `windows_sys`.`core`.`BOOL`,
    public var `dwDeviceRegistionKind`: UInt,
    public var `pszUPN`: `windows_sys`.`core`.`PWSTR`,
    public var `pszMDMServiceUri`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MANAGEMENT_REGISTRATION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MANAGEMENT_REGISTRATION_INFO`.Companion.`default`() : `MANAGEMENT_REGISTRATION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MANAGEMENT_SERVICE_INFO` (
    public var `pszMDMServiceUri`: `windows_sys`.`core`.`PWSTR`,
    public var `pszAuthenticationUri`: `windows_sys`.`core`.`PWSTR`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MANAGEMENT_SERVICE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MANAGEMENT_SERVICE_INFO`.Companion.`default`() : `MANAGEMENT_SERVICE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `MDM_REGISTRATION_FACILITY_CODE`: UInt = 25u;
public const val `MENROLL_E_CERTAUTH_FAILED_TO_FIND_CERT`: Int = -2145910744;
public const val `MENROLL_E_CERTPOLICY_PRIVATEKEYCREATION_FAILED`: Int = -2145910745;
public const val `MENROLL_E_CONNECTIVITY`: Int = -2145910768;
public const val `MENROLL_E_CUSTOMSERVERERROR`: Int = -2145910734;
public const val `MENROLL_E_DEVICECAPREACHED`: Int = -2145910765;
public const val `MENROLL_E_DEVICENOTSUPPORTED`: Int = -2145910764;
public const val `MENROLL_E_DEVICE_ALREADY_ENROLLED`: Int = -2145910774;
public const val `MENROLL_E_DEVICE_AUTHENTICATION_ERROR`: Int = -2145910782;
public const val `MENROLL_E_DEVICE_AUTHORIZATION_ERROR`: Int = -2145910781;
public const val `MENROLL_E_DEVICE_CERTIFCATEREQUEST_ERROR`: Int = -2145910780;
public const val `MENROLL_E_DEVICE_CERTIFICATEREQUEST_ERROR`: Int = -2145910780;
public const val `MENROLL_E_DEVICE_CONFIGMGRSERVER_ERROR`: Int = -2145910779;
public const val `MENROLL_E_DEVICE_INTERNALSERVICE_ERROR`: Int = -2145910778;
public const val `MENROLL_E_DEVICE_INVALIDSECURITY_ERROR`: Int = -2145910777;
public const val `MENROLL_E_DEVICE_MANAGEMENT_BLOCKED`: Int = -2145910746;
public const val `MENROLL_E_DEVICE_MESSAGE_FORMAT_ERROR`: Int = -2145910783;
public const val `MENROLL_E_DEVICE_NOT_ENROLLED`: Int = -2145910773;
public const val `MENROLL_E_DEVICE_UNKNOWN_ERROR`: Int = -2145910776;
public const val `MENROLL_E_DISCOVERY_SEC_CERT_DATE_INVALID`: Int = -2145910771;
public const val `MENROLL_E_EMPTY_MESSAGE`: Int = -2145910743;
public const val `MENROLL_E_ENROLLMENTDATAINVALID`: Int = -2145910759;
public const val `MENROLL_E_ENROLLMENT_IN_PROGRESS`: Int = -2145910775;
public const val `MENROLL_E_INMAINTENANCE`: Int = -2145910761;
public const val `MENROLL_E_INSECUREREDIRECT`: Int = -2145910758;
public const val `MENROLL_E_INVALIDSSLCERT`: Int = -2145910766;
public const val `MENROLL_E_MDM_NOT_CONFIGURED`: Int = -2145910735;
public const val `MENROLL_E_NOTELIGIBLETORENEW`: Int = -2145910762;
public const val `MENROLL_E_NOTSUPPORTED`: Int = -2145910763;
public const val `MENROLL_E_NOT_SUPPORTED`: Int = -2145910763;
public const val `MENROLL_E_PASSWORD_NEEDED`: Int = -2145910770;
public const val `MENROLL_E_PLATFORM_LICENSE_ERROR`: Int = -2145910756;
public const val `MENROLL_E_PLATFORM_UNKNOWN_ERROR`: Int = -2145910755;
public const val `MENROLL_E_PLATFORM_WRONG_STATE`: Int = -2145910757;
public const val `MENROLL_E_PROV_CSP_APPMGMT`: Int = -2145910747;
public const val `MENROLL_E_PROV_CSP_CERTSTORE`: Int = -2145910754;
public const val `MENROLL_E_PROV_CSP_DMCLIENT`: Int = -2145910752;
public const val `MENROLL_E_PROV_CSP_MISC`: Int = -2145910750;
public const val `MENROLL_E_PROV_CSP_PFW`: Int = -2145910751;
public const val `MENROLL_E_PROV_CSP_W7`: Int = -2145910753;
public const val `MENROLL_E_PROV_SSLCERTNOTFOUND`: Int = -2145910748;
public const val `MENROLL_E_PROV_UNKNOWN`: Int = -2145910749;
public const val `MENROLL_E_USERLICENSE`: Int = -2145910760;
public const val `MENROLL_E_USER_CANCELED`: Int = -2145910742;
public const val `MENROLL_E_USER_CANCELLED`: Int = -2145910736;
public const val `MENROLL_E_USER_LICENSE`: Int = -2145910760;
public const val `MENROLL_E_WAB_ERROR`: Int = -2145910769;
public const val `MREGISTER_E_DEVICE_ALREADY_REGISTERED`: Int = -2145845238;
public const val `MREGISTER_E_DEVICE_AUTHENTICATION_ERROR`: Int = -2145845246;
public const val `MREGISTER_E_DEVICE_AUTHORIZATION_ERROR`: Int = -2145845245;
public const val `MREGISTER_E_DEVICE_CERTIFCATEREQUEST_ERROR`: Int = -2145845244;
public const val `MREGISTER_E_DEVICE_CONFIGMGRSERVER_ERROR`: Int = -2145845243;
public const val `MREGISTER_E_DEVICE_INTERNALSERVICE_ERROR`: Int = -2145845242;
public const val `MREGISTER_E_DEVICE_INVALIDSECURITY_ERROR`: Int = -2145845241;
public const val `MREGISTER_E_DEVICE_MESSAGE_FORMAT_ERROR`: Int = -2145845247;
public const val `MREGISTER_E_DEVICE_NOT_AD_REGISTERED_ERROR`: Int = -2145845235;
public const val `MREGISTER_E_DEVICE_NOT_REGISTERED`: Int = -2145845237;
public const val `MREGISTER_E_DEVICE_UNKNOWN_ERROR`: Int = -2145845240;
public const val `MREGISTER_E_DISCOVERY_FAILED`: Int = -2145845234;
public const val `MREGISTER_E_DISCOVERY_REDIRECTED`: Int = -2145845236;
public const val `MREGISTER_E_REGISTRATION_IN_PROGRESS`: Int = -2145845239;
public const val `MaxDeviceInfoClass`: `REGISTRATION_INFORMATION_CLASS` = 2;
public typealias `REGISTRATION_INFORMATION_CLASS` = Int;
