// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("licenseprotection.dll" "system" fn RegisterLicenseKeyWithExpiration(licensekey : windows_sys::core::PCWSTR, validityindays : u32, status : *mut LicenseProtectionStatus) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("licenseprotection.dll" "system" fn ValidateLicenseKeyProtection(licensekey : windows_sys::core::PCWSTR, notvalidbefore : *mut super::super::Foundation:: FILETIME, notvalidafter : *mut super::super::Foundation:: FILETIME, status : *mut LicenseProtectionStatus) -> windows_sys::core::HRESULT);

public const val `LicenseKeyAlreadyExists`: `LicenseProtectionStatus` = 4;
public const val `LicenseKeyCorrupted`: `LicenseProtectionStatus` = 3;
public const val `LicenseKeyNotFound`: `LicenseProtectionStatus` = 1;
public const val `LicenseKeyUnprotected`: `LicenseProtectionStatus` = 2;
public typealias `LicenseProtectionStatus` = Int;
public const val `Success`: `LicenseProtectionStatus` = 0;
