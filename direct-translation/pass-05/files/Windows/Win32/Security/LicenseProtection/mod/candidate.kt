// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=licenseprotection.dll, ABI=system, export=RegisterLicenseKeyWithExpiration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RegisterLicenseKeyWithExpiration`(`licensekey` : `windows_sys`.`core`.`PCWSTR`, `validityindays` : UInt, `status` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LicenseProtectionStatus`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=licenseprotection.dll, ABI=system, export=ValidateLicenseKeyProtection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ValidateLicenseKeyProtection`(`licensekey` : `windows_sys`.`core`.`PCWSTR`, `notvalidbefore` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `notvalidafter` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`FILETIME`>?, `status` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LicenseProtectionStatus`>?) : `windows_sys`.`core`.`HRESULT`
public const val `LicenseKeyAlreadyExists`: `LicenseProtectionStatus` = 4;
public const val `LicenseKeyCorrupted`: `LicenseProtectionStatus` = 3;
public const val `LicenseKeyNotFound`: `LicenseProtectionStatus` = 1;
public const val `LicenseKeyUnprotected`: `LicenseProtectionStatus` = 2;
public typealias `LicenseProtectionStatus` = Int;
public const val `Success`: `LicenseProtectionStatus` = 0;
