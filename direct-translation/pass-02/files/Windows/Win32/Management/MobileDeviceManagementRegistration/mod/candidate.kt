// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("mdmlocalmanagement.dll" "system" fn ApplyLocalManagementSyncML(syncmlrequest : windows_sys::core::PCWSTR, syncmlresult : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn DiscoverManagementService(pszupn : windows_sys::core::PCWSTR, ppmgmtinfo : *mut *mut MANAGEMENT_SERVICE_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn DiscoverManagementServiceEx(pszupn : windows_sys::core::PCWSTR, pszdiscoveryservicecandidate : windows_sys::core::PCWSTR, ppmgmtinfo : *mut *mut MANAGEMENT_SERVICE_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn GetDeviceManagementConfigInfo(providerid : windows_sys::core::PCWSTR, configstringbufferlength : *mut u32, configstring : windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn GetDeviceRegistrationInfo(deviceinformationclass : REGISTRATION_INFORMATION_CLASS, ppdeviceregistrationinfo : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn GetManagementAppHyperlink(cchhyperlink : u32, pszhyperlink : windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement : *mut windows_sys::core::BOOL, cchupn : u32, pszupn : windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn IsManagementRegistrationAllowed(pfismanagementregistrationallowed : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn IsMdmUxWithoutAadAllowed(isenrollmentallowed : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("mdmlocalmanagement.dll" "system" fn RegisterDeviceWithLocalManagement(alreadyregistered : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn RegisterDeviceWithManagement(pszupn : windows_sys::core::PCWSTR, ppszmdmserviceuri : windows_sys::core::PCWSTR, ppzsaccesstoken : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn RegisterDeviceWithManagementUsingAADCredentials(usertoken : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn RegisterDeviceWithManagementUsingAADDeviceCredentials() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn SetDeviceManagementConfigInfo(providerid : windows_sys::core::PCWSTR, configstring : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn SetManagedExternally(ismanagedexternally : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("mdmlocalmanagement.dll" "system" fn UnregisterDeviceWithLocalManagement() -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("mdmregistration.dll" "system" fn UnregisterDeviceWithManagement(enrollmentid : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

public const val `DEVICEREGISTRATIONTYPE_MAM`: UInt = 5u;
public const val `DEVICEREGISTRATIONTYPE_MDM_DEVICEWIDE_WITH_AAD`: UInt = 6u;
public const val `DEVICEREGISTRATIONTYPE_MDM_ONLY`: UInt = 0u;
public const val `DEVICEREGISTRATIONTYPE_MDM_USERSPECIFIC_WITH_AAD`: UInt = 13u;
public const val `DEVICE_ENROLLER_FACILITY_CODE`: UInt = 24u;
public const val `DeviceRegistrationBasicInfo`: `REGISTRATION_INFORMATION_CLASS` = 1;
// UNSUPPORTED Rust 25:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MANAGEMENT_REGISTRATION_INFO {
//     pub fDeviceRegisteredWithManagement: windows_sys::core::BOOL,
//     pub dwDeviceRegistionKind: u32,
//     pub pszUPN: windows_sys::core::PWSTR,
//     pub pszMDMServiceUri: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 33:1: declaration Impl has no candidate rule
// impl Default for MANAGEMENT_REGISTRATION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 38:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MANAGEMENT_SERVICE_INFO {
//     pub pszMDMServiceUri: windows_sys::core::PWSTR,
//     pub pszAuthenticationUri: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 44:1: declaration Impl has no candidate rule
// impl Default for MANAGEMENT_SERVICE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

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
