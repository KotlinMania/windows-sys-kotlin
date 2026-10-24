// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ActivatePackageVirtualizationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ActivatePackageVirtualizationContext`(`context` : `PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE`, `cookie` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernelbase.dll, ABI=system, export=AddPackageDependency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AddPackageDependency`(`packagedependencyid` : `windows_sys`.`core`.`PCWSTR`, `rank` : Int, `options` : `AddPackageDependencyOptions`, `packagedependencycontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PACKAGEDEPENDENCY_CONTEXT`>?, `packagefullname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AppPolicyGetClrCompat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppPolicyGetClrCompat`(`processtoken` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AppPolicyClrCompat`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AppPolicyGetCreateFileAccess; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppPolicyGetCreateFileAccess`(`processtoken` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AppPolicyCreateFileAccess`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AppPolicyGetLifecycleManagement; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppPolicyGetLifecycleManagement`(`processtoken` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AppPolicyLifecycleManagement`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AppPolicyGetMediaFoundationCodecLoading; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppPolicyGetMediaFoundationCodecLoading`(`processtoken` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AppPolicyMediaFoundationCodecLoading`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AppPolicyGetProcessTerminationMethod; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppPolicyGetProcessTerminationMethod`(`processtoken` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AppPolicyProcessTerminationMethod`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AppPolicyGetShowDeveloperDiagnostic; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppPolicyGetShowDeveloperDiagnostic`(`processtoken` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AppPolicyShowDeveloperDiagnostic`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AppPolicyGetThreadInitializationType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppPolicyGetThreadInitializationType`(`processtoken` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AppPolicyThreadInitializationType`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=AppPolicyGetWindowingModel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `AppPolicyGetWindowingModel`(`processtoken` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `policy` : /* Rust *mut */ kotlinx.cinterop.CPointer<`AppPolicyWindowingModel`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CheckIsMSIXPackage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CheckIsMSIXPackage`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`, `ismsixpackage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ClosePackageInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ClosePackageInfo`(`packageinforeference` : /* Rust *const */ kotlinx.cinterop.CPointer<`_PACKAGE_INFO_REFERENCE`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=CreatePackageVirtualizationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CreatePackageVirtualizationContext`(`packagefamilyname` : `windows_sys`.`core`.`PCWSTR`, `context` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DeactivatePackageVirtualizationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeactivatePackageVirtualizationContext`(`cookie` : ULong)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernelbase.dll, ABI=system, export=DeletePackageDependency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DeletePackageDependency`(`packagedependencyid` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=DuplicatePackageVirtualizationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `DuplicatePackageVirtualizationContext`(`sourcecontext` : `PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE`, `destcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FindPackagesByPackageFamily; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindPackagesByPackageFamily`(`packagefamilyname` : `windows_sys`.`core`.`PCWSTR`, `packagefilters` : UInt, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefullnames` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PWSTR`, `packageproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=FormatApplicationUserModelId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FormatApplicationUserModelId`(`packagefamilyname` : `windows_sys`.`core`.`PCWSTR`, `packagerelativeapplicationid` : `windows_sys`.`core`.`PCWSTR`, `applicationusermodelidlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `applicationusermodelid` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetApplicationUserModelId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetApplicationUserModelId`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `applicationusermodelidlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `applicationusermodelid` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=GetApplicationUserModelIdFromToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetApplicationUserModelIdFromToken`(`token` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `applicationusermodelidlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `applicationusermodelid` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCurrentApplicationUserModelId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentApplicationUserModelId`(`applicationusermodelidlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `applicationusermodelid` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCurrentPackageFamilyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPackageFamilyName`(`packagefamilynamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefamilyname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCurrentPackageFullName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPackageFullName`(`packagefullnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefullname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCurrentPackageId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPackageId`(`bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCurrentPackageInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPackageInfo`(`flags` : UInt, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-3.dll, ABI=system, export=GetCurrentPackageInfo2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPackageInfo2`(`flags` : UInt, `packagepathtype` : `PackagePathType`, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCurrentPackageInfo3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPackageInfo3`(`flags` : UInt, `packageinfotype` : `PackageInfo3Type`, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCurrentPackagePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPackagePath`(`pathlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `path` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-3.dll, ABI=system, export=GetCurrentPackagePath2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPackagePath2`(`packagepathtype` : `PackagePathType`, `pathlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `path` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetCurrentPackageVirtualizationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetCurrentPackageVirtualizationContext`() : `PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernelbase.dll, ABI=system, export=GetIdForPackageDependencyContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetIdForPackageDependencyContext`(`packagedependencycontext` : `PACKAGEDEPENDENCY_CONTEXT`, `packagedependencyid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPackageApplicationIds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackageApplicationIds`(`packageinforeference` : /* Rust *const */ kotlinx.cinterop.CPointer<`_PACKAGE_INFO_REFERENCE`>?, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPackageFamilyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackageFamilyName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `packagefamilynamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefamilyname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=GetPackageFamilyNameFromToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackageFamilyNameFromToken`(`token` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `packagefamilynamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefamilyname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPackageFullName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackageFullName`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `packagefullnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefullname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=GetPackageFullNameFromToken; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackageFullNameFromToken`(`token` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `packagefullnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefullname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-6.dll, ABI=system, export=GetPackageGraphRevisionId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackageGraphRevisionId`() : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPackageId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackageId`(`hprocess` : `super`.`super`.`super`.`Foundation`.`HANDLE`, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPackageInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackageInfo`(`packageinforeference` : /* Rust *const */ kotlinx.cinterop.CPointer<`_PACKAGE_INFO_REFERENCE`>?, `flags` : UInt, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-3.dll, ABI=system, export=GetPackageInfo2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackageInfo2`(`packageinforeference` : /* Rust *const */ kotlinx.cinterop.CPointer<`_PACKAGE_INFO_REFERENCE`>?, `flags` : UInt, `packagepathtype` : `PackagePathType`, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPackagePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackagePath`(`packageid` : /* Rust *const */ kotlinx.cinterop.CPointer<`PACKAGE_ID`>?, `reserved` : UInt, `pathlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `path` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPackagePathByFullName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackagePathByFullName`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`, `pathlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `path` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-3.dll, ABI=system, export=GetPackagePathByFullName2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackagePathByFullName2`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`, `packagepathtype` : `PackagePathType`, `pathlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `path` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetPackagesByPackageFamily; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPackagesByPackageFamily`(`packagefamilyname` : `windows_sys`.`core`.`PCWSTR`, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefullnames` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetProcessesInVirtualizationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetProcessesInVirtualizationContext`(`packagefamilyname` : `windows_sys`.`core`.`PCWSTR`, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `processes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`super`.`Foundation`.`HANDLE`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernelbase.dll, ABI=system, export=GetResolvedPackageFullNameForPackageDependency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetResolvedPackageFullNameForPackageDependency`(`packagedependencyid` : `windows_sys`.`core`.`PCWSTR`, `packagefullname` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=GetStagedPackageOrigin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStagedPackageOrigin`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`, `origin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PackageOrigin`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=GetStagedPackagePathByFullName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStagedPackagePathByFullName`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`, `pathlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `path` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-3.dll, ABI=system, export=GetStagedPackagePathByFullName2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetStagedPackagePathByFullName2`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`, `packagepathtype` : `PackagePathType`, `pathlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `path` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=OpenPackageInfoByFullName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `OpenPackageInfoByFullName`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`, `reserved` : UInt, `packageinforeference` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`_PACKAGE_INFO_REFERENCE`>>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=OpenPackageInfoByFullNameForUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `OpenPackageInfoByFullNameForUser`(`usersid` : `super`.`super`.`super`.`Security`.`PSID`, `packagefullname` : `windows_sys`.`core`.`PCWSTR`, `reserved` : UInt, `packageinforeference` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`_PACKAGE_INFO_REFERENCE`>>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PackageFamilyNameFromFullName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PackageFamilyNameFromFullName`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`, `packagefamilynamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefamilyname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PackageFamilyNameFromId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PackageFamilyNameFromId`(`packageid` : /* Rust *const */ kotlinx.cinterop.CPointer<`PACKAGE_ID`>?, `packagefamilynamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefamilyname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PackageFullNameFromId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PackageFullNameFromId`(`packageid` : /* Rust *const */ kotlinx.cinterop.CPointer<`PACKAGE_ID`>?, `packagefullnamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefullname` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PackageIdFromFullName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PackageIdFromFullName`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`, `flags` : UInt, `bufferlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=PackageNameAndPublisherIdFromFamilyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `PackageNameAndPublisherIdFromFamilyName`(`packagefamilyname` : `windows_sys`.`core`.`PCWSTR`, `packagenamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagename` : `windows_sys`.`core`.`PWSTR`, `packagepublisheridlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagepublisherid` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ParseApplicationUserModelId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ParseApplicationUserModelId`(`applicationusermodelid` : `windows_sys`.`core`.`PCWSTR`, `packagefamilynamelength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagefamilyname` : `windows_sys`.`core`.`PWSTR`, `packagerelativeapplicationidlength` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `packagerelativeapplicationid` : `windows_sys`.`core`.`PWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernel32.dll, ABI=system, export=ReleasePackageVirtualizationContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReleasePackageVirtualizationContext`(`context` : `PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE`)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernelbase.dll, ABI=system, export=RemovePackageDependency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `RemovePackageDependency`(`packagedependencycontext` : `PACKAGEDEPENDENCY_CONTEXT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=kernelbase.dll, ABI=system, export=TryCreatePackageDependency; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Security")]
public external fun `TryCreatePackageDependency`(`user` : `super`.`super`.`super`.`Security`.`PSID`, `packagefamilyname` : `windows_sys`.`core`.`PCWSTR`, `minversion` : `PACKAGE_VERSION`, `packagedependencyprocessorarchitectures` : `PackageDependencyProcessorArchitectures`, `lifetimekind` : `PackageDependencyLifetimeKind`, `lifetimeartifact` : `windows_sys`.`core`.`PCWSTR`, `options` : `CreatePackageDependencyOptions`, `packagedependencyid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=VerifyApplicationUserModelId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerifyApplicationUserModelId`(`applicationusermodelid` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=VerifyPackageFamilyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerifyPackageFamilyName`(`packagefamilyname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=VerifyPackageFullName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerifyPackageFullName`(`packagefullname` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=VerifyPackageId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerifyPackageId`(`packageid` : /* Rust *const */ kotlinx.cinterop.CPointer<`PACKAGE_ID`>?) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=api-ms-win-appmodel-runtime-l1-1-1.dll, ABI=system, export=VerifyPackageRelativeApplicationId; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `VerifyPackageRelativeApplicationId`(`packagerelativeapplicationid` : `windows_sys`.`core`.`PCWSTR`) : `super`.`super`.`super`.`Foundation`.`WIN32_ERROR`
public const val `APPLICATION_USER_MODEL_ID_MAX_LENGTH`: UInt = 130u;
public const val `APPLICATION_USER_MODEL_ID_MIN_LENGTH`: UInt = 20u;
public typealias `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = Int;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_BLOCKMAP`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 1;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_FIRST`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 0;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_LAST`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 2;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_MANIFEST`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 0;
public const val `APPX_BUNDLE_FOOTPRINT_FILE_TYPE_SIGNATURE`: `APPX_BUNDLE_FOOTPRINT_FILE_TYPE` = 2;
public typealias `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE` = Int;
public const val `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE_APPLICATION`: `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE` = 0;
public const val `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE_RESOURCE`: `APPX_BUNDLE_PAYLOAD_PACKAGE_TYPE` = 1;
public typealias `APPX_CAPABILITIES` = Int;
public const val `APPX_CAPABILITY_APPOINTMENTS`: `APPX_CAPABILITIES` = 1024;
public const val `APPX_CAPABILITY_CLASS_ALL`: `APPX_CAPABILITY_CLASS_TYPE` = 7;
public const val `APPX_CAPABILITY_CLASS_CUSTOM`: `APPX_CAPABILITY_CLASS_TYPE` = 8;
public const val `APPX_CAPABILITY_CLASS_DEFAULT`: `APPX_CAPABILITY_CLASS_TYPE` = 0;
public const val `APPX_CAPABILITY_CLASS_GENERAL`: `APPX_CAPABILITY_CLASS_TYPE` = 1;
public const val `APPX_CAPABILITY_CLASS_RESTRICTED`: `APPX_CAPABILITY_CLASS_TYPE` = 2;
public typealias `APPX_CAPABILITY_CLASS_TYPE` = Int;
public const val `APPX_CAPABILITY_CLASS_WINDOWS`: `APPX_CAPABILITY_CLASS_TYPE` = 4;
public const val `APPX_CAPABILITY_CONTACTS`: `APPX_CAPABILITIES` = 2048;
public const val `APPX_CAPABILITY_DOCUMENTS_LIBRARY`: `APPX_CAPABILITIES` = 8;
public const val `APPX_CAPABILITY_ENTERPRISE_AUTHENTICATION`: `APPX_CAPABILITIES` = 128;
public const val `APPX_CAPABILITY_INTERNET_CLIENT`: `APPX_CAPABILITIES` = 1;
public const val `APPX_CAPABILITY_INTERNET_CLIENT_SERVER`: `APPX_CAPABILITIES` = 2;
public const val `APPX_CAPABILITY_MUSIC_LIBRARY`: `APPX_CAPABILITIES` = 64;
public const val `APPX_CAPABILITY_PICTURES_LIBRARY`: `APPX_CAPABILITIES` = 16;
public const val `APPX_CAPABILITY_PRIVATE_NETWORK_CLIENT_SERVER`: `APPX_CAPABILITIES` = 4;
public const val `APPX_CAPABILITY_REMOVABLE_STORAGE`: `APPX_CAPABILITIES` = 512;
public const val `APPX_CAPABILITY_SHARED_USER_CERTIFICATES`: `APPX_CAPABILITIES` = 256;
public const val `APPX_CAPABILITY_VIDEOS_LIBRARY`: `APPX_CAPABILITIES` = 32;
public typealias `APPX_COMPRESSION_OPTION` = Int;
public const val `APPX_COMPRESSION_OPTION_FAST`: `APPX_COMPRESSION_OPTION` = 3;
public const val `APPX_COMPRESSION_OPTION_MAXIMUM`: `APPX_COMPRESSION_OPTION` = 2;
public const val `APPX_COMPRESSION_OPTION_NONE`: `APPX_COMPRESSION_OPTION` = 0;
public const val `APPX_COMPRESSION_OPTION_NORMAL`: `APPX_COMPRESSION_OPTION` = 1;
public const val `APPX_COMPRESSION_OPTION_SUPERFAST`: `APPX_COMPRESSION_OPTION` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APPX_ENCRYPTED_EXEMPTIONS` (
    public var `count`: UInt,
    public var `plainTextFiles`: /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?,
)
// UNSUPPORTED Rust 111:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for APPX_ENCRYPTED_EXEMPTIONS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `APPX_ENCRYPTED_PACKAGE_OPTIONS` = Int;
public const val `APPX_ENCRYPTED_PACKAGE_OPTION_DIFFUSION`: `APPX_ENCRYPTED_PACKAGE_OPTIONS` = 1;
public const val `APPX_ENCRYPTED_PACKAGE_OPTION_NONE`: `APPX_ENCRYPTED_PACKAGE_OPTIONS` = 0;
public const val `APPX_ENCRYPTED_PACKAGE_OPTION_PAGE_HASHING`: `APPX_ENCRYPTED_PACKAGE_OPTIONS` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APPX_ENCRYPTED_PACKAGE_SETTINGS` (
    public var `keyLength`: UInt,
    public var `encryptionAlgorithm`: `windows_sys`.`core`.`PCWSTR`,
    public var `useDiffusion`: `windows_sys`.`core`.`BOOL`,
    public var `blockMapHashAlgorithm`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 129:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for APPX_ENCRYPTED_PACKAGE_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APPX_ENCRYPTED_PACKAGE_SETTINGS2` (
    public var `keyLength`: UInt,
    public var `encryptionAlgorithm`: `windows_sys`.`core`.`PCWSTR`,
    public var `blockMapHashAlgorithm`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `options`: UInt,
)
// UNSUPPORTED Rust 144:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for APPX_ENCRYPTED_PACKAGE_SETTINGS2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `APPX_FOOTPRINT_FILE_TYPE` = Int;
public const val `APPX_FOOTPRINT_FILE_TYPE_BLOCKMAP`: `APPX_FOOTPRINT_FILE_TYPE` = 1;
public const val `APPX_FOOTPRINT_FILE_TYPE_CODEINTEGRITY`: `APPX_FOOTPRINT_FILE_TYPE` = 3;
public const val `APPX_FOOTPRINT_FILE_TYPE_CONTENTGROUPMAP`: `APPX_FOOTPRINT_FILE_TYPE` = 4;
public const val `APPX_FOOTPRINT_FILE_TYPE_MANIFEST`: `APPX_FOOTPRINT_FILE_TYPE` = 0;
public const val `APPX_FOOTPRINT_FILE_TYPE_SIGNATURE`: `APPX_FOOTPRINT_FILE_TYPE` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APPX_KEY_INFO` (
    public var `keyLength`: UInt,
    public var `keyIdLength`: UInt,
    public var `key`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `keyId`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 164:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for APPX_KEY_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `APPX_PACKAGE_ARCHITECTURE` = Int;
public typealias `APPX_PACKAGE_ARCHITECTURE2` = Int;
public const val `APPX_PACKAGE_ARCHITECTURE2_ARM`: `APPX_PACKAGE_ARCHITECTURE2` = 5;
public const val `APPX_PACKAGE_ARCHITECTURE2_ARM64`: `APPX_PACKAGE_ARCHITECTURE2` = 12;
public const val `APPX_PACKAGE_ARCHITECTURE2_NEUTRAL`: `APPX_PACKAGE_ARCHITECTURE2` = 11;
public const val `APPX_PACKAGE_ARCHITECTURE2_UNKNOWN`: `APPX_PACKAGE_ARCHITECTURE2` = 65535;
public const val `APPX_PACKAGE_ARCHITECTURE2_X64`: `APPX_PACKAGE_ARCHITECTURE2` = 9;
public const val `APPX_PACKAGE_ARCHITECTURE2_X86`: `APPX_PACKAGE_ARCHITECTURE2` = 0;
public const val `APPX_PACKAGE_ARCHITECTURE2_X86_ON_ARM64`: `APPX_PACKAGE_ARCHITECTURE2` = 14;
public const val `APPX_PACKAGE_ARCHITECTURE_ARM`: `APPX_PACKAGE_ARCHITECTURE` = 5;
public const val `APPX_PACKAGE_ARCHITECTURE_ARM64`: `APPX_PACKAGE_ARCHITECTURE` = 12;
public const val `APPX_PACKAGE_ARCHITECTURE_NEUTRAL`: `APPX_PACKAGE_ARCHITECTURE` = 11;
public const val `APPX_PACKAGE_ARCHITECTURE_X64`: `APPX_PACKAGE_ARCHITECTURE` = 9;
public const val `APPX_PACKAGE_ARCHITECTURE_X86`: `APPX_PACKAGE_ARCHITECTURE` = 0;
public typealias `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS` = Int;
public const val `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_LOCALIZED`: `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS` = 2;
public const val `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_NONE`: `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS` = 0;
public const val `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTION_SKIP_VALIDATION`: `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_MANIFEST_OPTIONS` = 1;
public typealias `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_OPTION` = Int;
public const val `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_OPTION_APPEND_DELTA`: `APPX_PACKAGE_EDITOR_UPDATE_PACKAGE_OPTION` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APPX_PACKAGE_SETTINGS` (
    public var `forceZip32`: `windows_sys`.`core`.`BOOL`,
    public var `hashMethod`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 196:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for APPX_PACKAGE_SETTINGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `APPX_PACKAGE_WRITER_PAYLOAD_STREAM` (
    public var `inputStream`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `fileName`: `windows_sys`.`core`.`PCWSTR`,
    public var `contentType`: `windows_sys`.`core`.`PCWSTR`,
    public var `compressionOption`: `APPX_COMPRESSION_OPTION`,
)
// UNSUPPORTED Rust 211:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_Com")]
// impl Default for APPX_PACKAGE_WRITER_PAYLOAD_STREAM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = Int;
public const val `APPX_PACKAGING_CONTEXT_CHANGE_TYPE_CHANGE`: `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = 1;
public const val `APPX_PACKAGING_CONTEXT_CHANGE_TYPE_DETAILS`: `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = 2;
public const val `APPX_PACKAGING_CONTEXT_CHANGE_TYPE_END`: `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = 3;
public const val `APPX_PACKAGING_CONTEXT_CHANGE_TYPE_START`: `APPX_PACKAGING_CONTEXT_CHANGE_TYPE` = 0;
public typealias `AddPackageDependencyOptions` = Int;
public const val `AddPackageDependencyOptions_None`: `AddPackageDependencyOptions` = 0;
public const val `AddPackageDependencyOptions_PrependIfRankCollision`: `AddPackageDependencyOptions` = 1;
public typealias `AppPolicyClrCompat` = Int;
public const val `AppPolicyClrCompat_ClassicDesktop`: `AppPolicyClrCompat` = 1;
public const val `AppPolicyClrCompat_Other`: `AppPolicyClrCompat` = 0;
public const val `AppPolicyClrCompat_PackagedDesktop`: `AppPolicyClrCompat` = 3;
public const val `AppPolicyClrCompat_Universal`: `AppPolicyClrCompat` = 2;
public typealias `AppPolicyCreateFileAccess` = Int;
public const val `AppPolicyCreateFileAccess_Full`: `AppPolicyCreateFileAccess` = 0;
public const val `AppPolicyCreateFileAccess_Limited`: `AppPolicyCreateFileAccess` = 1;
public typealias `AppPolicyLifecycleManagement` = Int;
public const val `AppPolicyLifecycleManagement_Managed`: `AppPolicyLifecycleManagement` = 1;
public const val `AppPolicyLifecycleManagement_Unmanaged`: `AppPolicyLifecycleManagement` = 0;
public typealias `AppPolicyMediaFoundationCodecLoading` = Int;
public const val `AppPolicyMediaFoundationCodecLoading_All`: `AppPolicyMediaFoundationCodecLoading` = 0;
public const val `AppPolicyMediaFoundationCodecLoading_InboxOnly`: `AppPolicyMediaFoundationCodecLoading` = 1;
public typealias `AppPolicyProcessTerminationMethod` = Int;
public const val `AppPolicyProcessTerminationMethod_ExitProcess`: `AppPolicyProcessTerminationMethod` = 0;
public const val `AppPolicyProcessTerminationMethod_TerminateProcess`: `AppPolicyProcessTerminationMethod` = 1;
public typealias `AppPolicyShowDeveloperDiagnostic` = Int;
public const val `AppPolicyShowDeveloperDiagnostic_None`: `AppPolicyShowDeveloperDiagnostic` = 0;
public const val `AppPolicyShowDeveloperDiagnostic_ShowUI`: `AppPolicyShowDeveloperDiagnostic` = 1;
public typealias `AppPolicyThreadInitializationType` = Int;
public const val `AppPolicyThreadInitializationType_InitializeWinRT`: `AppPolicyThreadInitializationType` = 1;
public const val `AppPolicyThreadInitializationType_None`: `AppPolicyThreadInitializationType` = 0;
public typealias `AppPolicyWindowingModel` = Int;
public const val `AppPolicyWindowingModel_ClassicDesktop`: `AppPolicyWindowingModel` = 2;
public const val `AppPolicyWindowingModel_ClassicPhone`: `AppPolicyWindowingModel` = 3;
public const val `AppPolicyWindowingModel_None`: `AppPolicyWindowingModel` = 0;
public const val `AppPolicyWindowingModel_Universal`: `AppPolicyWindowingModel` = 1;
// UNSUPPORTED Rust 253:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AppxBundleFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x378e0446_5384_43b7_8877_e7dbdd883446);

// UNSUPPORTED Rust 254:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AppxEncryptionFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdc664fdd_d868_46ee_8780_8d196cb739f7);

// UNSUPPORTED Rust 255:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AppxFactory: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x5842a140_ff9f_4166_8f5c_62f5b7b0c781);

// UNSUPPORTED Rust 256:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AppxPackageEditor: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf004f2ca_aebc_4b0d_bf58_e516d5bcc0ab);

// UNSUPPORTED Rust 257:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const AppxPackagingDiagnosticEventSinkManager: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x50ca0a46_1588_4161_8ed2_ef9e469ced5d);

public typealias `CreatePackageDependencyOptions` = Int;
public const val `CreatePackageDependencyOptions_DoNotVerifyDependencyResolution`: `CreatePackageDependencyOptions` = 1;
public const val `CreatePackageDependencyOptions_None`: `CreatePackageDependencyOptions` = 0;
public const val `CreatePackageDependencyOptions_ScopeIsSystem`: `CreatePackageDependencyOptions` = 2;
public typealias `DX_FEATURE_LEVEL` = Int;
public const val `DX_FEATURE_LEVEL_10`: `DX_FEATURE_LEVEL` = 2;
public const val `DX_FEATURE_LEVEL_11`: `DX_FEATURE_LEVEL` = 3;
public const val `DX_FEATURE_LEVEL_9`: `DX_FEATURE_LEVEL` = 1;
public const val `DX_FEATURE_LEVEL_UNSPECIFIED`: `DX_FEATURE_LEVEL` = 0;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PACKAGEDEPENDENCY_CONTEXT` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public const val `PACKAGE_APPLICATIONS_MAX_COUNT`: UInt = 100u;
public const val `PACKAGE_APPLICATIONS_MIN_COUNT`: UInt = 0u;
public const val `PACKAGE_ARCHITECTURE_MAX_LENGTH`: UInt = 7u;
public const val `PACKAGE_ARCHITECTURE_MIN_LENGTH`: UInt = 3u;
public const val `PACKAGE_DEPENDENCY_RANK_DEFAULT`: UInt = 0u;
public const val `PACKAGE_FAMILY_MAX_RESOURCE_PACKAGES`: UInt = 512u;
public const val `PACKAGE_FAMILY_MIN_RESOURCE_PACKAGES`: UInt = 0u;
public const val `PACKAGE_FAMILY_NAME_MAX_LENGTH`: UInt = 64u;
public const val `PACKAGE_FAMILY_NAME_MIN_LENGTH`: UInt = 17u;
public const val `PACKAGE_FILTER_ALL_LOADED`: UInt = 0u;
public const val `PACKAGE_FILTER_BUNDLE`: UInt = 128u;
public const val `PACKAGE_FILTER_DIRECT`: UInt = 32u;
public const val `PACKAGE_FILTER_DYNAMIC`: UInt = 1048576u;
public const val `PACKAGE_FILTER_HEAD`: UInt = 16u;
public const val `PACKAGE_FILTER_HOSTRUNTIME`: UInt = 2097152u;
public const val `PACKAGE_FILTER_IS_IN_RELATED_SET`: UInt = 262144u;
public const val `PACKAGE_FILTER_OPTIONAL`: UInt = 131072u;
public const val `PACKAGE_FILTER_RESOURCE`: UInt = 64u;
public const val `PACKAGE_FILTER_STATIC`: UInt = 524288u;
public const val `PACKAGE_FULL_NAME_MAX_LENGTH`: UInt = 127u;
public const val `PACKAGE_FULL_NAME_MIN_LENGTH`: UInt = 30u;
public const val `PACKAGE_GRAPH_MAX_SIZE`: UInt = 641u;
public const val `PACKAGE_GRAPH_MIN_SIZE`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PACKAGE_ID` (
    public var `reserved`: UInt,
    public var `processorArchitecture`: UInt,
    public var `version`: `PACKAGE_VERSION`,
    public var `name`: `windows_sys`.`core`.`PWSTR`,
    public var `publisher`: `windows_sys`.`core`.`PWSTR`,
    public var `resourceId`: `windows_sys`.`core`.`PWSTR`,
    public var `publisherId`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 303:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for PACKAGE_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PACKAGE_ID` (
    public var `reserved`: UInt,
    public var `processorArchitecture`: UInt,
    public var `version`: `PACKAGE_VERSION`,
    public var `name`: `windows_sys`.`core`.`PWSTR`,
    public var `publisher`: `windows_sys`.`core`.`PWSTR`,
    public var `resourceId`: `windows_sys`.`core`.`PWSTR`,
    public var `publisherId`: `windows_sys`.`core`.`PWSTR`,
)
// UNSUPPORTED Rust 321:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for PACKAGE_ID {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PACKAGE_INFO` (
    public var `reserved`: UInt,
    public var `flags`: UInt,
    public var `path`: `windows_sys`.`core`.`PWSTR`,
    public var `packageFullName`: `windows_sys`.`core`.`PWSTR`,
    public var `packageFamilyName`: `windows_sys`.`core`.`PWSTR`,
    public var `packageId`: `PACKAGE_ID`,
)
// UNSUPPORTED Rust 338:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(target_arch = "x86")]
// impl Default for PACKAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(4))]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PACKAGE_INFO` (
    public var `reserved`: UInt,
    public var `flags`: UInt,
    public var `path`: `windows_sys`.`core`.`PWSTR`,
    public var `packageFullName`: `windows_sys`.`core`.`PWSTR`,
    public var `packageFamilyName`: `windows_sys`.`core`.`PWSTR`,
    public var `packageId`: `PACKAGE_ID`,
)
// UNSUPPORTED Rust 355:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// impl Default for PACKAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PACKAGE_INFORMATION_BASIC`: UInt = 0u;
public const val `PACKAGE_INFORMATION_FULL`: UInt = 256u;
public const val `PACKAGE_MAX_DEPENDENCIES`: UInt = 128u;
public const val `PACKAGE_MIN_DEPENDENCIES`: UInt = 0u;
public const val `PACKAGE_NAME_MAX_LENGTH`: UInt = 50u;
public const val `PACKAGE_NAME_MIN_LENGTH`: UInt = 3u;
public const val `PACKAGE_PROPERTY_BUNDLE`: UInt = 4u;
public const val `PACKAGE_PROPERTY_DEVELOPMENT_MODE`: UInt = 65536u;
public const val `PACKAGE_PROPERTY_DYNAMIC`: UInt = 1048576u;
public const val `PACKAGE_PROPERTY_FRAMEWORK`: UInt = 1u;
public const val `PACKAGE_PROPERTY_HOSTRUNTIME`: UInt = 2097152u;
public const val `PACKAGE_PROPERTY_IS_IN_RELATED_SET`: UInt = 262144u;
public const val `PACKAGE_PROPERTY_OPTIONAL`: UInt = 8u;
public const val `PACKAGE_PROPERTY_RESOURCE`: UInt = 2u;
public const val `PACKAGE_PROPERTY_STATIC`: UInt = 524288u;
public const val `PACKAGE_PUBLISHERID_MAX_LENGTH`: UInt = 13u;
public const val `PACKAGE_PUBLISHERID_MIN_LENGTH`: UInt = 13u;
public const val `PACKAGE_PUBLISHER_MAX_LENGTH`: UInt = 8192u;
public const val `PACKAGE_PUBLISHER_MIN_LENGTH`: UInt = 3u;
public const val `PACKAGE_RELATIVE_APPLICATION_ID_MAX_LENGTH`: UInt = 65u;
public const val `PACKAGE_RELATIVE_APPLICATION_ID_MIN_LENGTH`: UInt = 2u;
public const val `PACKAGE_RESOURCEID_MAX_LENGTH`: UInt = 30u;
public const val `PACKAGE_RESOURCEID_MIN_LENGTH`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PACKAGE_VERSION` (
    public var `Anonymous`: `PACKAGE_VERSION_0`,
)
// UNSUPPORTED Rust 389:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PACKAGE_VERSION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 394:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(4))]
// #[derive(Clone, Copy)]
// pub union PACKAGE_VERSION_0 {
//     pub Version: u64,
//     pub Anonymous: PACKAGE_VERSION_0_0,
// }

// UNSUPPORTED Rust 400:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PACKAGE_VERSION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PACKAGE_VERSION_0_0` (
    public var `Revision`: UShort,
    public var `Build`: UShort,
    public var `Minor`: UShort,
    public var `Major`: UShort,
)
public const val `PACKAGE_VERSION_MAX_LENGTH`: UInt = 23u;
public const val `PACKAGE_VERSION_MIN_LENGTH`: UInt = 7u;
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PACKAGE_VIRTUALIZATION_CONTEXT_HANDLE` = /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?;
public typealias `PackageDependencyLifetimeKind` = Int;
public const val `PackageDependencyLifetimeKind_FilePath`: `PackageDependencyLifetimeKind` = 1;
public const val `PackageDependencyLifetimeKind_Process`: `PackageDependencyLifetimeKind` = 0;
public const val `PackageDependencyLifetimeKind_RegistryKey`: `PackageDependencyLifetimeKind` = 2;
public typealias `PackageDependencyProcessorArchitectures` = Int;
public const val `PackageDependencyProcessorArchitectures_Arm`: `PackageDependencyProcessorArchitectures` = 8;
public const val `PackageDependencyProcessorArchitectures_Arm64`: `PackageDependencyProcessorArchitectures` = 16;
public const val `PackageDependencyProcessorArchitectures_Neutral`: `PackageDependencyProcessorArchitectures` = 1;
public const val `PackageDependencyProcessorArchitectures_None`: `PackageDependencyProcessorArchitectures` = 0;
public const val `PackageDependencyProcessorArchitectures_X64`: `PackageDependencyProcessorArchitectures` = 4;
public const val `PackageDependencyProcessorArchitectures_X86`: `PackageDependencyProcessorArchitectures` = 2;
public const val `PackageDependencyProcessorArchitectures_X86A64`: `PackageDependencyProcessorArchitectures` = 32;
public typealias `PackageInfo3Type` = Int;
public const val `PackageInfo3Type_PackageInfoGeneration`: `PackageInfo3Type` = 16;
public typealias `PackageOrigin` = Int;
public const val `PackageOrigin_DeveloperSigned`: `PackageOrigin` = 5;
public const val `PackageOrigin_DeveloperUnsigned`: `PackageOrigin` = 4;
public const val `PackageOrigin_Inbox`: `PackageOrigin` = 2;
public const val `PackageOrigin_LineOfBusiness`: `PackageOrigin` = 6;
public const val `PackageOrigin_Store`: `PackageOrigin` = 3;
public const val `PackageOrigin_Unknown`: `PackageOrigin` = 0;
public const val `PackageOrigin_Unsigned`: `PackageOrigin` = 1;
public typealias `PackagePathType` = Int;
public const val `PackagePathType_Effective`: `PackagePathType` = 2;
public const val `PackagePathType_EffectiveExternal`: `PackagePathType` = 5;
public const val `PackagePathType_Install`: `PackagePathType` = 0;
public const val `PackagePathType_MachineExternal`: `PackagePathType` = 3;
public const val `PackagePathType_Mutable`: `PackagePathType` = 1;
public const val `PackagePathType_UserExternal`: `PackagePathType` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `_PACKAGE_INFO_REFERENCE` (
    public var `reserved`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 450:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for _PACKAGE_INFO_REFERENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

