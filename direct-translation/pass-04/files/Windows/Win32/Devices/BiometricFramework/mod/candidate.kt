// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioAcquireFocus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioAcquireFocus`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioAsyncEnumBiometricUnits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioAsyncEnumBiometricUnits`(`frameworkhandle` : UInt, `factor` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioAsyncEnumDatabases; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioAsyncEnumDatabases`(`frameworkhandle` : UInt, `factor` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioAsyncEnumServiceProviders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioAsyncEnumServiceProviders`(`frameworkhandle` : UInt, `factor` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioAsyncMonitorFrameworkChanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioAsyncMonitorFrameworkChanges`(`frameworkhandle` : UInt, `changetypes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioAsyncOpenFramework; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioAsyncOpenFramework`(`notificationmethod` : `WINBIO_ASYNC_NOTIFICATION_METHOD`, `targetwindow` : `super`.`super`.`Foundation`.`HWND`, `messagecode` : UInt, `callbackroutine` : `PWINBIO_ASYNC_COMPLETION_CALLBACK`, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `asynchronousopen` : `windows_sys`.`core`.`BOOL`, `frameworkhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioAsyncOpenSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioAsyncOpenSession`(`factor` : UInt, `pooltype` : `WINBIO_POOL`, `flags` : UInt, `unitarray` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `unitcount` : ULong, `databaseid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `notificationmethod` : `WINBIO_ASYNC_NOTIFICATION_METHOD`, `targetwindow` : `super`.`super`.`Foundation`.`HWND`, `messagecode` : UInt, `callbackroutine` : `PWINBIO_ASYNC_COMPLETION_CALLBACK`, `userdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `asynchronousopen` : `windows_sys`.`core`.`BOOL`, `sessionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioCancel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioCancel`(`sessionhandle` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioCaptureSample; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioCaptureSample`(`sessionhandle` : UInt, `purpose` : UByte, `flags` : UByte, `unitid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `sample` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_BIR`>>?, `samplesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `rejectdetail` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioCaptureSampleWithCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioCaptureSampleWithCallback`(`sessionhandle` : UInt, `purpose` : UByte, `flags` : UByte, `capturecallback` : `PWINBIO_CAPTURE_CALLBACK`, `capturecallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioCloseFramework; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioCloseFramework`(`frameworkhandle` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioCloseSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioCloseSession`(`sessionhandle` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioControlUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioControlUnit`(`sessionhandle` : UInt, `unitid` : UInt, `component` : `WINBIO_COMPONENT`, `controlcode` : UInt, `sendbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `sendbuffersize` : ULong, `receivebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `receivebuffersize` : ULong, `receivedatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `operationstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioControlUnitPrivileged; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioControlUnitPrivileged`(`sessionhandle` : UInt, `unitid` : UInt, `component` : `WINBIO_COMPONENT`, `controlcode` : UInt, `sendbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `sendbuffersize` : ULong, `receivebuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `receivebuffersize` : ULong, `receivedatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `operationstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioDeleteTemplate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioDeleteTemplate`(`sessionhandle` : UInt, `unitid` : UInt, `identity` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, `subfactor` : UByte) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnrollBegin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnrollBegin`(`sessionhandle` : UInt, `subfactor` : UByte, `unitid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnrollCapture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnrollCapture`(`sessionhandle` : UInt, `rejectdetail` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnrollCaptureWithCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnrollCaptureWithCallback`(`sessionhandle` : UInt, `enrollcallback` : `PWINBIO_ENROLL_CAPTURE_CALLBACK`, `enrollcallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnrollCommit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnrollCommit`(`sessionhandle` : UInt, `identity` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, `isnewtemplate` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnrollDiscard; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnrollDiscard`(`sessionhandle` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnrollSelect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnrollSelect`(`sessionhandle` : UInt, `selectorvalue` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnumBiometricUnits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnumBiometricUnits`(`factor` : UInt, `unitschemaarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_UNIT_SCHEMA`>>?, `unitcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnumDatabases; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnumDatabases`(`factor` : UInt, `storageschemaarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_STORAGE_SCHEMA`>>?, `storagecount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnumEnrollments; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnumEnrollments`(`sessionhandle` : UInt, `unitid` : UInt, `identity` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, `subfactorarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, `subfactorcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioEnumServiceProviders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioEnumServiceProviders`(`factor` : UInt, `bspschemaarray` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_BSP_SCHEMA`>>?, `bspcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioFree`(`address` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioGetCredentialState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioGetCredentialState`(`identity` : `WINBIO_IDENTITY`, `type` : `WINBIO_CREDENTIAL_TYPE`, `credentialstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_CREDENTIAL_STATE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioGetDomainLogonSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioGetDomainLogonSetting`(`value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `source` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_SETTING_SOURCE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioGetEnabledSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioGetEnabledSetting`(`value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `source` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_SETTING_SOURCE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioGetEnrolledFactors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioGetEnrolledFactors`(`accountowner` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, `enrolledfactors` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioGetLogonSetting; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioGetLogonSetting`(`value` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `source` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_SETTING_SOURCE`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioGetProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioGetProperty`(`sessionhandle` : UInt, `propertytype` : UInt, `propertyid` : UInt, `unitid` : UInt, `identity` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, `subfactor` : UByte, `propertybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `propertybuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioIdentify; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioIdentify`(`sessionhandle` : UInt, `unitid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `identity` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, `subfactor` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rejectdetail` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioIdentifyWithCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioIdentifyWithCallback`(`sessionhandle` : UInt, `identifycallback` : `PWINBIO_IDENTIFY_CALLBACK`, `identifycallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioImproveBegin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioImproveBegin`(`sessionhandle` : UInt, `unitid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioImproveEnd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioImproveEnd`(`sessionhandle` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioLocateSensor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioLocateSensor`(`sessionhandle` : UInt, `unitid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioLocateSensorWithCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioLocateSensorWithCallback`(`sessionhandle` : UInt, `locatecallback` : `PWINBIO_LOCATE_SENSOR_CALLBACK`, `locatecallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioLockUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioLockUnit`(`sessionhandle` : UInt, `unitid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioLogonIdentifiedUser; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioLogonIdentifiedUser`(`sessionhandle` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioMonitorPresence; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioMonitorPresence`(`sessionhandle` : UInt, `unitid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioOpenSession; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioOpenSession`(`factor` : UInt, `pooltype` : `WINBIO_POOL`, `flags` : UInt, `unitarray` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `unitcount` : ULong, `databaseid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `sessionhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioRegisterEventMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioRegisterEventMonitor`(`sessionhandle` : UInt, `eventmask` : UInt, `eventcallback` : `PWINBIO_EVENT_CALLBACK`, `eventcallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioReleaseFocus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioReleaseFocus`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioRemoveAllCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioRemoveAllCredentials`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioRemoveAllDomainCredentials; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioRemoveAllDomainCredentials`() : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioRemoveCredential; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioRemoveCredential`(`identity` : `WINBIO_IDENTITY`, `type` : `WINBIO_CREDENTIAL_TYPE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioSetCredential; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioSetCredential`(`type` : `WINBIO_CREDENTIAL_TYPE`, `credential` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `credentialsize` : ULong, `format` : `WINBIO_CREDENTIAL_FORMAT`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioSetProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioSetProperty`(`sessionhandle` : UInt, `propertytype` : UInt, `propertyid` : UInt, `unitid` : UInt, `identity` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, `subfactor` : UByte, `propertybuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertybuffersize` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioUnlockUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioUnlockUnit`(`sessionhandle` : UInt, `unitid` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioUnregisterEventMonitor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioUnregisterEventMonitor`(`sessionhandle` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioVerify; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioVerify`(`sessionhandle` : UInt, `identity` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, `subfactor` : UByte, `unitid` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `match` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `rejectdetail` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioVerifyWithCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioVerifyWithCallback`(`sessionhandle` : UInt, `identity` : /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, `subfactor` : UByte, `verifycallback` : `PWINBIO_VERIFY_CALLBACK`, `verifycallbackcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winbio.dll, ABI=system, export=WinBioWait; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WinBioWait`(`sessionhandle` : UInt) : `windows_sys`.`core`.`HRESULT`
public const val `FACILITY_NONE`: UInt = 0u;
public const val `FACILITY_WINBIO`: UInt = 9u;
// UNSUPPORTED Rust 57:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const GUID_DEVINTERFACE_BIOMETRIC_READER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe2b5183a_99ea_4cc3_ad6b_80ca8d715b80);

public const val `IOCTL_BIOMETRIC_VENDOR`: UInt = 4464640u;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_ACCEPT_PRIVATE_SENSOR_TYPE_INFO_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_ACCEPT_SAMPLE_DATA_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_BIR`>?, ULong, UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_ACTIVATE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_ATTACH_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_CHECK_FOR_DUPLICATE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_CLEAR_CONTEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_COMMIT_ENROLLMENT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, UByte, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_CONTROL_UNIT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_CONTROL_UNIT_PRIVILEGED_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_CREATE_ENROLLMENT_AUTHENTICATED_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_CREATE_ENROLLMENT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_CREATE_KEY_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_DEACTIVATE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_DETACH_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_DISCARD_ENROLLMENT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_EXPORT_ENGINE_DATA_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_BIR`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_GET_ENROLLMENT_HASH_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_GET_ENROLLMENT_STATUS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_IDENTIFY_ALL_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_PRESENCE`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_IDENTIFY_FEATURE_SET_AUTHENTICATED_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_IDENTIFY_FEATURE_SET_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_IDENTIFY_FEATURE_SET_SECURE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_NOTIFY_POWER_CHANGE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_PIPELINE_CLEANUP_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_PIPELINE_INIT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_QUERY_CALIBRATION_DATA_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_QUERY_EXTENDED_ENROLLMENT_STATUS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_EXTENDED_ENROLLMENT_STATUS`>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_QUERY_EXTENDED_INFO_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_EXTENDED_ENGINE_INFO`>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_QUERY_HASH_ALGORITHMS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_QUERY_INDEX_VECTOR_SIZE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_QUERY_PREFERRED_FORMAT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_REGISTERED_FORMAT`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_QUERY_SAMPLE_HINT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_REFRESH_CACHE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_RESERVED_1_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_SELECT_CALIBRATION_FORMAT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_SET_ACCOUNT_POLICY_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_ACCOUNT_POLICY`>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_SET_ENROLLMENT_PARAMETERS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_EXTENDED_ENROLLMENT_PARAMETERS`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_SET_ENROLLMENT_SELECTOR_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_SET_HASH_ALGORITHM_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_UPDATE_ENROLLMENT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_ENGINE_VERIFY_FEATURE_SET_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.BooleanVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_ALLOCATE_MEMORY_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_FREE_MEMORY_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_GET_PROPERTY_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_LOCK_AND_VALIDATE_SECURE_BUFFER_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, `windows_sys`.`core`.`GUID`, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_RELEASE_SECURE_BUFFER_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, `windows_sys`.`core`.`GUID`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_SET_UNIT_STATUS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_EXTENDED_UNIT_STATUS`>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_CACHE_CLEAR_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_BEGIN_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_END_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_NEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_BEGIN_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_END_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_NEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_DECRYPT_SAMPLE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_QUERY_AUTHORIZED_ENROLLMENTS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_IDENTITY`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_1_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_2_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_3_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_ACCEPT_CALIBRATION_DATA_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_ACTIVATE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_ASYNC_IMPORT_RAW_BUFFER_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_ASYNC_IMPORT_SECURE_BUFFER_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, `windows_sys`.`core`.`GUID`, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.UByteVar>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_ATTACH_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_CANCEL_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_CLEAR_CONTEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_CONNECT_SECURE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_SECURE_CONNECTION_PARAMS`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_SECURE_CONNECTION_DATA`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_CONTROL_UNIT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_CONTROL_UNIT_PRIVILEGED_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_DEACTIVATE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_DETACH_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_EXPORT_SENSOR_DATA_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_BIR`>>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_FINISH_CAPTURE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_FINISH_NOTIFY_WAKE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_GET_INDICATOR_STATUS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_NOTIFY_POWER_CHANGE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_PIPELINE_CLEANUP_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_PIPELINE_INIT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_PUSH_DATA_TO_ENGINE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UByte, UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_QUERY_CALIBRATION_FORMATS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_QUERY_EXTENDED_INFO_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_EXTENDED_SENSOR_INFO`>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_QUERY_PRIVATE_SENSOR_TYPE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_QUERY_STATUS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_RESET_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_SET_CALIBRATION_FORMAT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_SET_INDICATOR_STATUS_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_SET_MODE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_START_CAPTURE_EX_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UByte, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`IO`.`OVERLAPPED`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_START_CAPTURE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`IO`.`OVERLAPPED`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_SENSOR_START_NOTIFY_WAKE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`super`.`super`.`System`.`IO`.`OVERLAPPED`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_ACTIVATE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_ADD_RECORD_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_STORAGE_RECORD`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_ATTACH_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_CLEAR_CONTEXT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_CLOSE_DATABASE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_CONTROL_UNIT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_CONTROL_UNIT_PRIVILEGED_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_CREATE_DATABASE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`, ULong, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_DEACTIVATE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_DELETE_RECORD_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, UByte) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_DETACH_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_ERASE_DATABASE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_FIRST_RECORD_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_GET_CURRENT_RECORD_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_STORAGE_RECORD`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_GET_DATABASE_SIZE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_GET_DATA_FORMAT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_VERSION`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_GET_RECORD_COUNT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_NEXT_RECORD_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_NOTIFY_DATABASE_CHANGE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, Boolean) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_NOTIFY_POWER_CHANGE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_OPEN_DATABASE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `windows_sys`.`core`.`PCWSTR`, `windows_sys`.`core`.`PCWSTR`) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_PIPELINE_CLEANUP_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_PIPELINE_INIT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_QUERY_BY_CONTENT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, UByte, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_QUERY_BY_SUBJECT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, UByte) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_QUERY_EXTENDED_INFO_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_EXTENDED_STORAGE_INFO`>?, ULong) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_RESERVED_1_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_RESERVED_2_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_UPDATE_RECORD_BEGIN_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, UByte, /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_STORAGE_RECORD`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PIBIO_STORAGE_UPDATE_RECORD_COMMIT_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PIPELINE`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_STORAGE_RECORD`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWINBIO_ASYNC_COMPLETION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_ASYNC_RESULT`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWINBIO_CAPTURE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`HRESULT`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_BIR`>?, ULong, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWINBIO_ENROLL_CAPTURE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`HRESULT`, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWINBIO_EVENT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`HRESULT`, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_EVENT`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWINBIO_IDENTIFY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`HRESULT`, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?, UByte, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWINBIO_LOCATE_SENSOR_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`HRESULT`, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PWINBIO_QUERY_ENGINE_INTERFACE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_ENGINE_INTERFACE`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PWINBIO_QUERY_SENSOR_INTERFACE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_SENSOR_INTERFACE`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
public typealias `PWINBIO_QUERY_STORAGE_INTERFACE_FN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WINBIO_STORAGE_INTERFACE`>>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `PWINBIO_VERIFY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`HRESULT`, UInt, Boolean, UInt) -> Unit>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ACCOUNT_POLICY` (
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `AntiSpoofBehavior`: `WINBIO_ANTI_SPOOF_POLICY_ACTION`,
)
// UNSUPPORTED Rust 318:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ACCOUNT_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ADAPTER_INTERFACE_VERSION` (
    public var `MajorVersion`: UShort,
    public var `MinorVersion`: UShort,
)
public const val `WINBIO_ANSI_381_IMG_BIT_PACKED`: UShort = 1u;
public const val `WINBIO_ANSI_381_IMG_COMPRESSED_JPEG`: UShort = 3u;
public const val `WINBIO_ANSI_381_IMG_COMPRESSED_JPEG2000`: UShort = 4u;
public const val `WINBIO_ANSI_381_IMG_COMPRESSED_PNG`: UShort = 5u;
public const val `WINBIO_ANSI_381_IMG_COMPRESSED_WSQ`: UShort = 2u;
public const val `WINBIO_ANSI_381_IMG_UNCOMPRESSED`: UShort = 0u;
public const val `WINBIO_ANSI_381_IMP_TYPE_LATENT`: UShort = 7u;
public const val `WINBIO_ANSI_381_IMP_TYPE_LIVE_SCAN_CONTACTLESS`: UShort = 9u;
public const val `WINBIO_ANSI_381_IMP_TYPE_LIVE_SCAN_PLAIN`: UShort = 0u;
public const val `WINBIO_ANSI_381_IMP_TYPE_LIVE_SCAN_ROLLED`: UShort = 1u;
public const val `WINBIO_ANSI_381_IMP_TYPE_NONLIVE_SCAN_PLAIN`: UShort = 2u;
public const val `WINBIO_ANSI_381_IMP_TYPE_NONLIVE_SCAN_ROLLED`: UShort = 3u;
public const val `WINBIO_ANSI_381_IMP_TYPE_SWIPE`: UShort = 8u;
public const val `WINBIO_ANSI_381_PIXELS_PER_CM`: UShort = 2u;
public const val `WINBIO_ANSI_381_PIXELS_PER_INCH`: UShort = 1u;
public const val `WINBIO_ANTI_SPOOF_DISABLE`: `WINBIO_ANTI_SPOOF_POLICY_ACTION` = 0;
public const val `WINBIO_ANTI_SPOOF_ENABLE`: `WINBIO_ANTI_SPOOF_POLICY_ACTION` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ANTI_SPOOF_POLICY` (
    public var `Action`: `WINBIO_ANTI_SPOOF_POLICY_ACTION`,
    public var `Source`: `WINBIO_POLICY_SOURCE`,
)
public typealias `WINBIO_ANTI_SPOOF_POLICY_ACTION` = Int;
public const val `WINBIO_ANTI_SPOOF_REMOVE`: `WINBIO_ANTI_SPOOF_POLICY_ACTION` = 2;
public typealias `WINBIO_ASYNC_NOTIFICATION_METHOD` = Int;
public const val `WINBIO_ASYNC_NOTIFY_CALLBACK`: `WINBIO_ASYNC_NOTIFICATION_METHOD` = 1;
public const val `WINBIO_ASYNC_NOTIFY_MAXIMUM_VALUE`: `WINBIO_ASYNC_NOTIFICATION_METHOD` = 3;
public const val `WINBIO_ASYNC_NOTIFY_MESSAGE`: `WINBIO_ASYNC_NOTIFICATION_METHOD` = 2;
public const val `WINBIO_ASYNC_NOTIFY_NONE`: `WINBIO_ASYNC_NOTIFICATION_METHOD` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ASYNC_RESULT` (
    public var `SessionHandle`: UInt,
    public var `Operation`: UInt,
    public var `SequenceNumber`: ULong,
    public var `TimeStamp`: Long,
    public var `ApiStatus`: `windows_sys`.`core`.`HRESULT`,
    public var `UnitId`: UInt,
    public var `UserData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Parameters`: `WINBIO_ASYNC_RESULT_0`,
)
// UNSUPPORTED Rust 371:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 376:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINBIO_ASYNC_RESULT_0 {
//     pub Verify: WINBIO_ASYNC_RESULT_0_0,
//     pub Identify: WINBIO_ASYNC_RESULT_0_1,
//     pub EnrollBegin: WINBIO_ASYNC_RESULT_0_2,
//     pub EnrollCapture: WINBIO_ASYNC_RESULT_0_3,
//     pub EnrollCommit: WINBIO_ASYNC_RESULT_0_4,
//     pub EnumEnrollments: WINBIO_ASYNC_RESULT_0_5,
//     pub CaptureSample: WINBIO_ASYNC_RESULT_0_6,
//     pub DeleteTemplate: WINBIO_ASYNC_RESULT_0_7,
//     pub GetProperty: WINBIO_ASYNC_RESULT_0_8,
//     pub SetProperty: WINBIO_ASYNC_RESULT_0_9,
//     pub GetEvent: WINBIO_ASYNC_RESULT_0_10,
//     pub ControlUnit: WINBIO_ASYNC_RESULT_0_11,
//     pub EnumServiceProviders: WINBIO_ASYNC_RESULT_0_12,
//     pub EnumBiometricUnits: WINBIO_ASYNC_RESULT_0_13,
//     pub EnumDatabases: WINBIO_ASYNC_RESULT_0_14,
//     pub VerifyAndReleaseTicket: WINBIO_ASYNC_RESULT_0_15,
//     pub IdentifyAndReleaseTicket: WINBIO_ASYNC_RESULT_0_16,
//     pub EnrollSelect: WINBIO_ASYNC_RESULT_0_17,
//     pub MonitorPresence: WINBIO_ASYNC_RESULT_0_18,
//     pub GetProtectionPolicy: WINBIO_ASYNC_RESULT_0_19,
//     pub NotifyUnitStatusChange: WINBIO_ASYNC_RESULT_0_20,
// }

// UNSUPPORTED Rust 401:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0 {
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
public class `WINBIO_ASYNC_RESULT_0_6` (
    public var `Sample`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_BIR`>?,
    public var `SampleSize`: ULong,
    public var `RejectDetail`: UInt,
)
// UNSUPPORTED Rust 413:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_6 {
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
public class `WINBIO_ASYNC_RESULT_0_11` (
    public var `Component`: `WINBIO_COMPONENT`,
    public var `ControlCode`: UInt,
    public var `OperationStatus`: UInt,
    public var `SendBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `SendBufferSize`: ULong,
    public var `ReceiveBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ReceiveBufferSize`: ULong,
    public var `ReceiveDataSize`: ULong,
)
// UNSUPPORTED Rust 430:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_11 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ASYNC_RESULT_0_7` (
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `SubFactor`: UByte,
)
// UNSUPPORTED Rust 441:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_7 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ASYNC_RESULT_0_2` (
    public var `SubFactor`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ASYNC_RESULT_0_3` (
    public var `RejectDetail`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ASYNC_RESULT_0_4` (
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `IsNewTemplate`: Boolean,
)
// UNSUPPORTED Rust 462:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ASYNC_RESULT_0_17` (
    public var `SelectorValue`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ASYNC_RESULT_0_13` (
    public var `UnitCount`: ULong,
    public var `UnitSchemaArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_UNIT_SCHEMA`>?,
)
// UNSUPPORTED Rust 478:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_13 {
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
public class `WINBIO_ASYNC_RESULT_0_14` (
    public var `StorageCount`: ULong,
    public var `StorageSchemaArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_STORAGE_SCHEMA`>?,
)
// UNSUPPORTED Rust 489:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_14 {
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
public class `WINBIO_ASYNC_RESULT_0_5` (
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `SubFactorCount`: ULong,
    public var `SubFactorArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 501:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_5 {
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
public class `WINBIO_ASYNC_RESULT_0_12` (
    public var `BspCount`: ULong,
    public var `BspSchemaArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_BSP_SCHEMA`>?,
)
// UNSUPPORTED Rust 512:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_12 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ASYNC_RESULT_0_10` (
    public var `Event`: `WINBIO_EVENT`,
)
// UNSUPPORTED Rust 522:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_10 {
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
public class `WINBIO_ASYNC_RESULT_0_8` (
    public var `PropertyType`: UInt,
    public var `PropertyId`: UInt,
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `SubFactor`: UByte,
    public var `PropertyBufferSize`: ULong,
    public var `PropertyBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 537:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_8 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ASYNC_RESULT_0_19` (
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `Policy`: `WINBIO_PROTECTION_POLICY`,
)
// UNSUPPORTED Rust 548:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_19 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ASYNC_RESULT_0_16` (
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `SubFactor`: UByte,
    public var `RejectDetail`: UInt,
    public var `Ticket`: ULong,
)
// UNSUPPORTED Rust 561:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_16 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ASYNC_RESULT_0_1` (
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `SubFactor`: UByte,
    public var `RejectDetail`: UInt,
)
// UNSUPPORTED Rust 573:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_1 {
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
public class `WINBIO_ASYNC_RESULT_0_18` (
    public var `ChangeType`: UInt,
    public var `PresenceCount`: ULong,
    public var `PresenceArray`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_PRESENCE`>?,
)
// UNSUPPORTED Rust 585:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_18 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ASYNC_RESULT_0_20` (
    public var `ExtendedStatus`: `WINBIO_EXTENDED_UNIT_STATUS`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_ASYNC_RESULT_0_9` (
    public var `PropertyType`: UInt,
    public var `PropertyId`: UInt,
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `SubFactor`: UByte,
    public var `PropertyBufferSize`: ULong,
    public var `PropertyBuffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 605:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_ASYNC_RESULT_0_9 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ASYNC_RESULT_0_15` (
    public var `Match`: Boolean,
    public var `RejectDetail`: UInt,
    public var `Ticket`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ASYNC_RESULT_0_0` (
    public var `Match`: Boolean,
    public var `RejectDetail`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_BDB_ANSI_381_HEADER` (
    public var `RecordLength`: ULong,
    public var `FormatIdentifier`: UInt,
    public var `VersionNumber`: UInt,
    public var `ProductId`: `WINBIO_REGISTERED_FORMAT`,
    public var `CaptureDeviceId`: UShort,
    public var `ImageAcquisitionLevel`: UShort,
    public var `HorizontalScanResolution`: UShort,
    public var `VerticalScanResolution`: UShort,
    public var `HorizontalImageResolution`: UShort,
    public var `VerticalImageResolution`: UShort,
    public var `ElementCount`: UByte,
    public var `ScaleUnits`: UByte,
    public var `PixelDepth`: UByte,
    public var `ImageCompressionAlg`: UByte,
    public var `Reserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_BDB_ANSI_381_RECORD` (
    public var `BlockLength`: UInt,
    public var `HorizontalLineLength`: UShort,
    public var `VerticalLineLength`: UShort,
    public var `Position`: UByte,
    public var `CountOfViews`: UByte,
    public var `ViewNumber`: UByte,
    public var `ImageQuality`: UByte,
    public var `ImpressionType`: UByte,
    public var `Reserved`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_BIR` (
    public var `HeaderBlock`: `WINBIO_BIR_DATA`,
    public var `StandardDataBlock`: `WINBIO_BIR_DATA`,
    public var `VendorDataBlock`: `WINBIO_BIR_DATA`,
    public var `SignatureBlock`: `WINBIO_BIR_DATA`,
)
public const val `WINBIO_BIR_ALGIN_SIZE`: UInt = 8u;
public const val `WINBIO_BIR_ALIGN_SIZE`: UInt = 8u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_BIR_DATA` (
    public var `Size`: UInt,
    public var `Offset`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_BIR_HEADER` (
    public var `ValidFields`: UShort,
    public var `HeaderVersion`: UByte,
    public var `PatronHeaderVersion`: UByte,
    public var `DataFlags`: UByte,
    public var `Type`: UInt,
    public var `Subtype`: UByte,
    public var `Purpose`: UByte,
    public var `DataQuality`: Byte,
    public var `CreationDate`: Long,
    public var `ValidityPeriod`: `WINBIO_BIR_HEADER_0`,
    public var `BiometricDataFormat`: `WINBIO_REGISTERED_FORMAT`,
    public var `ProductId`: `WINBIO_REGISTERED_FORMAT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_BIR_HEADER_0` (
    public var `BeginDate`: Long,
    public var `EndDate`: Long,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_BLANK_PAYLOAD` (
    public var `PayloadSize`: UInt,
    public var `WinBioHresult`: `windows_sys`.`core`.`HRESULT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_BSP_SCHEMA` (
    public var `BiometricFactor`: UInt,
    public var `BspId`: `windows_sys`.`core`.`GUID`,
    public var `Description`: UShortArray,
    public var `Vendor`: UShortArray,
    public var `Version`: `WINBIO_VERSION`,
)
// UNSUPPORTED Rust 708:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_BSP_SCHEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_CALIBRATION_INFO` (
    public var `PayloadSize`: UInt,
    public var `WinBioHresult`: `windows_sys`.`core`.`HRESULT`,
    public var `CalibrationData`: `WINBIO_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_CAPTURE_DATA` (
    public var `PayloadSize`: UInt,
    public var `WinBioHresult`: `windows_sys`.`core`.`HRESULT`,
    public var `SensorStatus`: UInt,
    public var `RejectDetail`: UInt,
    public var `CaptureData`: `WINBIO_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_CAPTURE_PARAMETERS` (
    public var `PayloadSize`: UInt,
    public var `Purpose`: UByte,
    public var `Format`: `WINBIO_REGISTERED_FORMAT`,
    public var `VendorFormat`: `windows_sys`.`core`.`GUID`,
    public var `Flags`: UByte,
)
public typealias `WINBIO_COMPONENT` = UInt;
public const val `WINBIO_COMPONENT_ENGINE`: `WINBIO_COMPONENT` = 2u;
public const val `WINBIO_COMPONENT_SENSOR`: `WINBIO_COMPONENT` = 1u;
public const val `WINBIO_COMPONENT_STORAGE`: `WINBIO_COMPONENT` = 3u;
public const val `WINBIO_CREDENTIAL_ALL`: `WINBIO_CREDENTIAL_TYPE` = -1;
public typealias `WINBIO_CREDENTIAL_FORMAT` = Int;
public const val `WINBIO_CREDENTIAL_NOT_SET`: `WINBIO_CREDENTIAL_STATE` = 1;
public const val `WINBIO_CREDENTIAL_PASSWORD`: `WINBIO_CREDENTIAL_TYPE` = 1;
public const val `WINBIO_CREDENTIAL_SET`: `WINBIO_CREDENTIAL_STATE` = 2;
public typealias `WINBIO_CREDENTIAL_STATE` = Int;
public typealias `WINBIO_CREDENTIAL_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_DATA` (
    public var `Size`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 755:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_DATA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINBIO_DATA_FLAG_INTEGRITY`: UShort = 1u;
public const val `WINBIO_DATA_FLAG_INTERMEDIATE`: UShort = 64u;
public const val `WINBIO_DATA_FLAG_OPTION_MASK_PRESENT`: UShort = 8u;
public const val `WINBIO_DATA_FLAG_PRIVACY`: UShort = 2u;
public const val `WINBIO_DATA_FLAG_PROCESSED`: UShort = 128u;
public const val `WINBIO_DATA_FLAG_RAW`: UShort = 32u;
public const val `WINBIO_DATA_FLAG_SIGNED`: UShort = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_DIAGNOSTICS` (
    public var `PayloadSize`: UInt,
    public var `WinBioHresult`: `windows_sys`.`core`.`HRESULT`,
    public var `SensorStatus`: UInt,
    public var `VendorDiagnostics`: `WINBIO_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ENCRYPTED_CAPTURE_PARAMS` (
    public var `PayloadSize`: UInt,
    public var `Purpose`: UByte,
    public var `Format`: `WINBIO_REGISTERED_FORMAT`,
    public var `VendorFormat`: `windows_sys`.`core`.`GUID`,
    public var `Flags`: UByte,
    public var `NonceSize`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_ENGINE_INTERFACE` (
    public var `Version`: `WINBIO_ADAPTER_INTERFACE_VERSION`,
    public var `Type`: UInt,
    public var `Size`: ULong,
    public var `AdapterId`: `windows_sys`.`core`.`GUID`,
    public var `Attach`: `PIBIO_ENGINE_ATTACH_FN`,
    public var `Detach`: `PIBIO_ENGINE_DETACH_FN`,
    public var `ClearContext`: `PIBIO_ENGINE_CLEAR_CONTEXT_FN`,
    public var `QueryPreferredFormat`: `PIBIO_ENGINE_QUERY_PREFERRED_FORMAT_FN`,
    public var `QueryIndexVectorSize`: `PIBIO_ENGINE_QUERY_INDEX_VECTOR_SIZE_FN`,
    public var `QueryHashAlgorithms`: `PIBIO_ENGINE_QUERY_HASH_ALGORITHMS_FN`,
    public var `SetHashAlgorithm`: `PIBIO_ENGINE_SET_HASH_ALGORITHM_FN`,
    public var `QuerySampleHint`: `PIBIO_ENGINE_QUERY_SAMPLE_HINT_FN`,
    public var `AcceptSampleData`: `PIBIO_ENGINE_ACCEPT_SAMPLE_DATA_FN`,
    public var `ExportEngineData`: `PIBIO_ENGINE_EXPORT_ENGINE_DATA_FN`,
    public var `VerifyFeatureSet`: `PIBIO_ENGINE_VERIFY_FEATURE_SET_FN`,
    public var `IdentifyFeatureSet`: `PIBIO_ENGINE_IDENTIFY_FEATURE_SET_FN`,
    public var `CreateEnrollment`: `PIBIO_ENGINE_CREATE_ENROLLMENT_FN`,
    public var `UpdateEnrollment`: `PIBIO_ENGINE_UPDATE_ENROLLMENT_FN`,
    public var `GetEnrollmentStatus`: `PIBIO_ENGINE_GET_ENROLLMENT_STATUS_FN`,
    public var `GetEnrollmentHash`: `PIBIO_ENGINE_GET_ENROLLMENT_HASH_FN`,
    public var `CheckForDuplicate`: `PIBIO_ENGINE_CHECK_FOR_DUPLICATE_FN`,
    public var `CommitEnrollment`: `PIBIO_ENGINE_COMMIT_ENROLLMENT_FN`,
    public var `DiscardEnrollment`: `PIBIO_ENGINE_DISCARD_ENROLLMENT_FN`,
    public var `ControlUnit`: `PIBIO_ENGINE_CONTROL_UNIT_FN`,
    public var `ControlUnitPrivileged`: `PIBIO_ENGINE_CONTROL_UNIT_PRIVILEGED_FN`,
    public var `NotifyPowerChange`: `PIBIO_ENGINE_NOTIFY_POWER_CHANGE_FN`,
    public var `Reserved_1`: `PIBIO_ENGINE_RESERVED_1_FN`,
    public var `PipelineInit`: `PIBIO_ENGINE_PIPELINE_INIT_FN`,
    public var `PipelineCleanup`: `PIBIO_ENGINE_PIPELINE_CLEANUP_FN`,
    public var `Activate`: `PIBIO_ENGINE_ACTIVATE_FN`,
    public var `Deactivate`: `PIBIO_ENGINE_DEACTIVATE_FN`,
    public var `QueryExtendedInfo`: `PIBIO_ENGINE_QUERY_EXTENDED_INFO_FN`,
    public var `IdentifyAll`: `PIBIO_ENGINE_IDENTIFY_ALL_FN`,
    public var `SetEnrollmentSelector`: `PIBIO_ENGINE_SET_ENROLLMENT_SELECTOR_FN`,
    public var `SetEnrollmentParameters`: `PIBIO_ENGINE_SET_ENROLLMENT_PARAMETERS_FN`,
    public var `QueryExtendedEnrollmentStatus`: `PIBIO_ENGINE_QUERY_EXTENDED_ENROLLMENT_STATUS_FN`,
    public var `RefreshCache`: `PIBIO_ENGINE_REFRESH_CACHE_FN`,
    public var `SelectCalibrationFormat`: `PIBIO_ENGINE_SELECT_CALIBRATION_FORMAT_FN`,
    public var `QueryCalibrationData`: `PIBIO_ENGINE_QUERY_CALIBRATION_DATA_FN`,
    public var `SetAccountPolicy`: `PIBIO_ENGINE_SET_ACCOUNT_POLICY_FN`,
    public var `CreateKey`: `PIBIO_ENGINE_CREATE_KEY_FN`,
    public var `IdentifyFeatureSetSecure`: `PIBIO_ENGINE_IDENTIFY_FEATURE_SET_SECURE_FN`,
    public var `AcceptPrivateSensorTypeInfo`: `PIBIO_ENGINE_ACCEPT_PRIVATE_SENSOR_TYPE_INFO_FN`,
    public var `CreateEnrollmentAuthenticated`: `PIBIO_ENGINE_CREATE_ENROLLMENT_AUTHENTICATED_FN`,
    public var `IdentifyFeatureSetAuthenticated`: `PIBIO_ENGINE_IDENTIFY_FEATURE_SET_AUTHENTICATED_FN`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_EVENT` (
    public var `Type`: UInt,
    public var `Parameters`: `WINBIO_EVENT_0`,
)
// UNSUPPORTED Rust 841:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 846:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINBIO_EVENT_0 {
//     pub Unclaimed: WINBIO_EVENT_0_0,
//     pub UnclaimedIdentify: WINBIO_EVENT_0_1,
//     pub Error: WINBIO_EVENT_0_2,
// }

// UNSUPPORTED Rust 853:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EVENT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EVENT_0_2` (
    public var `ErrorCode`: `windows_sys`.`core`.`HRESULT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_EVENT_0_1` (
    public var `UnitId`: UInt,
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `SubFactor`: UByte,
    public var `RejectDetail`: UInt,
)
// UNSUPPORTED Rust 871:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EVENT_0_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EVENT_0_0` (
    public var `UnitId`: UInt,
    public var `RejectDetail`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_EXTENDED_ENGINE_INFO` (
    public var `GenericEngineCapabilities`: UInt,
    public var `Factor`: UInt,
    public var `Specific`: `WINBIO_EXTENDED_ENGINE_INFO_0`,
)
// UNSUPPORTED Rust 889:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_ENGINE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 894:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINBIO_EXTENDED_ENGINE_INFO_0 {
//     pub Null: u32,
//     pub FacialFeatures: WINBIO_EXTENDED_ENGINE_INFO_0_0,
//     pub Fingerprint: WINBIO_EXTENDED_ENGINE_INFO_0_1,
//     pub Iris: WINBIO_EXTENDED_ENGINE_INFO_0_2,
//     pub Voice: WINBIO_EXTENDED_ENGINE_INFO_0_3,
// }

// UNSUPPORTED Rust 903:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_ENGINE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENGINE_INFO_0_0` (
    public var `Capabilities`: UInt,
    public var `EnrollmentRequirements`: `WINBIO_EXTENDED_ENGINE_INFO_0_0_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENGINE_INFO_0_0_0` (
    public var `Null`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENGINE_INFO_0_1` (
    public var `Capabilities`: UInt,
    public var `EnrollmentRequirements`: `WINBIO_EXTENDED_ENGINE_INFO_0_1_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENGINE_INFO_0_1_0` (
    public var `GeneralSamples`: UInt,
    public var `Center`: UInt,
    public var `TopEdge`: UInt,
    public var `BottomEdge`: UInt,
    public var `LeftEdge`: UInt,
    public var `RightEdge`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENGINE_INFO_0_2` (
    public var `Capabilities`: UInt,
    public var `EnrollmentRequirements`: `WINBIO_EXTENDED_ENGINE_INFO_0_2_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENGINE_INFO_0_2_0` (
    public var `Null`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENGINE_INFO_0_3` (
    public var `Capabilities`: UInt,
    public var `EnrollmentRequirements`: `WINBIO_EXTENDED_ENGINE_INFO_0_3_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENGINE_INFO_0_3_0` (
    public var `Null`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENROLLMENT_PARAMETERS` (
    public var `Size`: ULong,
    public var `SubFactor`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_EXTENDED_ENROLLMENT_STATUS` (
    public var `TemplateStatus`: `windows_sys`.`core`.`HRESULT`,
    public var `RejectDetail`: UInt,
    public var `PercentComplete`: UInt,
    public var `Factor`: UInt,
    public var `SubFactor`: UByte,
    public var `Specific`: `WINBIO_EXTENDED_ENROLLMENT_STATUS_0`,
)
// UNSUPPORTED Rust 973:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_ENROLLMENT_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 978:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINBIO_EXTENDED_ENROLLMENT_STATUS_0 {
//     pub Null: u32,
//     pub FacialFeatures: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0,
//     pub Fingerprint: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_1,
//     pub Iris: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2,
//     pub Voice: WINBIO_EXTENDED_ENROLLMENT_STATUS_0_3,
// }

// UNSUPPORTED Rust 987:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_ENROLLMENT_STATUS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0` (
    public var `BoundingBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `Distance`: Int,
    public var `OpaqueEngineData`: `WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 78 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0_0` (
    public var `AdapterId`: `windows_sys`.`core`.`GUID`,
    public var `Data`: UIntArray,
)
// UNSUPPORTED Rust 1005:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_ENROLLMENT_STATUS_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENROLLMENT_STATUS_0_1` (
    public var `GeneralSamples`: UInt,
    public var `Center`: UInt,
    public var `TopEdge`: UInt,
    public var `BottomEdge`: UInt,
    public var `LeftEdge`: UInt,
    public var `RightEdge`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2` (
    public var `EyeBoundingBox_1`: `super`.`super`.`Foundation`.`RECT`,
    public var `EyeBoundingBox_2`: `super`.`super`.`Foundation`.`RECT`,
    public var `PupilCenter_1`: `super`.`super`.`Foundation`.`POINT`,
    public var `PupilCenter_2`: `super`.`super`.`Foundation`.`POINT`,
    public var `Distance`: Int,
    public var `GridPointCompletionPercent`: UInt,
    public var `GridPointIndex`: UShort,
    public var `Point3D`: `WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2_0`,
    public var `StopCaptureAndShowCriticalFeedback`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENROLLMENT_STATUS_0_2_0` (
    public var `X`: Double,
    public var `Y`: Double,
    public var `Z`: Double,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_ENROLLMENT_STATUS_0_3` (
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_EXTENDED_SENSOR_INFO` (
    public var `GenericSensorCapabilities`: UInt,
    public var `Factor`: UInt,
    public var `Specific`: `WINBIO_EXTENDED_SENSOR_INFO_0`,
)
// UNSUPPORTED Rust 1052:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_SENSOR_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1057:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINBIO_EXTENDED_SENSOR_INFO_0 {
//     pub Null: u32,
//     pub FacialFeatures: WINBIO_EXTENDED_SENSOR_INFO_0_0,
//     pub Fingerprint: WINBIO_EXTENDED_SENSOR_INFO_0_1,
//     pub Iris: WINBIO_EXTENDED_SENSOR_INFO_0_2,
//     pub Voice: WINBIO_EXTENDED_SENSOR_INFO_0_3,
// }

// UNSUPPORTED Rust 1066:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_SENSOR_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_SENSOR_INFO_0_0` (
    public var `FrameSize`: `super`.`super`.`Foundation`.`RECT`,
    public var `FrameOffset`: `super`.`super`.`Foundation`.`POINT`,
    public var `MandatoryOrientation`: UInt,
    public var `HardwareInfo`: `WINBIO_EXTENDED_SENSOR_INFO_0_0_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 260 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_EXTENDED_SENSOR_INFO_0_0_0` (
    public var `ColorSensorId`: UShortArray,
    public var `InfraredSensorId`: UShortArray,
    public var `InfraredSensorRotationAngle`: UInt,
)
// UNSUPPORTED Rust 1086:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_SENSOR_INFO_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_SENSOR_INFO_0_1` (
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_SENSOR_INFO_0_2` (
    public var `FrameSize`: `super`.`super`.`Foundation`.`RECT`,
    public var `FrameOffset`: `super`.`super`.`Foundation`.`POINT`,
    public var `MandatoryOrientation`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_SENSOR_INFO_0_3` (
    public var `Reserved`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_EXTENDED_STORAGE_INFO` (
    public var `GenericStorageCapabilities`: UInt,
    public var `Factor`: UInt,
    public var `Specific`: `WINBIO_EXTENDED_STORAGE_INFO_0`,
)
// UNSUPPORTED Rust 1115:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_STORAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1120:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINBIO_EXTENDED_STORAGE_INFO_0 {
//     pub Null: u32,
//     pub FacialFeatures: WINBIO_EXTENDED_STORAGE_INFO_0_0,
//     pub Fingerprint: WINBIO_EXTENDED_STORAGE_INFO_0_1,
//     pub Iris: WINBIO_EXTENDED_STORAGE_INFO_0_2,
//     pub Voice: WINBIO_EXTENDED_STORAGE_INFO_0_3,
// }

// UNSUPPORTED Rust 1129:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_EXTENDED_STORAGE_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_STORAGE_INFO_0_0` (
    public var `Capabilities`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_STORAGE_INFO_0_1` (
    public var `Capabilities`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_STORAGE_INFO_0_2` (
    public var `Capabilities`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_STORAGE_INFO_0_3` (
    public var `Capabilities`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_EXTENDED_UNIT_STATUS` (
    public var `Availability`: UInt,
    public var `ReasonCode`: UInt,
)
public const val `WINBIO_E_ADAPTER_INTEGRITY_FAILURE`: Int = -2146860995;
public const val `WINBIO_E_AUTO_LOGON_DISABLED`: Int = -2146860989;
public const val `WINBIO_E_BAD_CAPTURE`: Int = -2146861048;
public const val `WINBIO_E_CALIBRATION_BUFFER_INVALID`: Int = -2146860975;
public const val `WINBIO_E_CALIBRATION_BUFFER_TOO_LARGE`: Int = -2146860976;
public const val `WINBIO_E_CALIBRATION_BUFFER_TOO_SMALL`: Int = -2146860977;
public const val `WINBIO_E_CANCELED`: Int = -2146861052;
public const val `WINBIO_E_CAPTURE_ABORTED`: Int = -2146861050;
public const val `WINBIO_E_CONFIGURATION_FAILURE`: Int = -2146861005;
public const val `WINBIO_E_CRED_PROV_DISABLED`: Int = -2146861008;
public const val `WINBIO_E_CRED_PROV_NO_CREDENTIAL`: Int = -2146861007;
public const val `WINBIO_E_CRED_PROV_SECURITY_LOCKOUT`: Int = -2146860985;
public const val `WINBIO_E_DATABASE_ALREADY_EXISTS`: Int = -2146861034;
public const val `WINBIO_E_DATABASE_BAD_INDEX_VECTOR`: Int = -2146861022;
public const val `WINBIO_E_DATABASE_CANT_CLOSE`: Int = -2146861037;
public const val `WINBIO_E_DATABASE_CANT_CREATE`: Int = -2146861039;
public const val `WINBIO_E_DATABASE_CANT_ERASE`: Int = -2146861036;
public const val `WINBIO_E_DATABASE_CANT_FIND`: Int = -2146861035;
public const val `WINBIO_E_DATABASE_CANT_OPEN`: Int = -2146861038;
public const val `WINBIO_E_DATABASE_CORRUPTED`: Int = -2146861030;
public const val `WINBIO_E_DATABASE_EOF`: Int = -2146861023;
public const val `WINBIO_E_DATABASE_FULL`: Int = -2146861032;
public const val `WINBIO_E_DATABASE_LOCKED`: Int = -2146861031;
public const val `WINBIO_E_DATABASE_NO_MORE_RECORDS`: Int = -2146861024;
public const val `WINBIO_E_DATABASE_NO_RESULTS`: Int = -2146861025;
public const val `WINBIO_E_DATABASE_NO_SUCH_RECORD`: Int = -2146861029;
public const val `WINBIO_E_DATABASE_READ_ERROR`: Int = -2146861027;
public const val `WINBIO_E_DATABASE_WRITE_ERROR`: Int = -2146861026;
public const val `WINBIO_E_DATA_COLLECTION_IN_PROGRESS`: Int = -2146861045;
public const val `WINBIO_E_DATA_PROTECTION_FAILURE`: Int = -2146860986;
public const val `WINBIO_E_DEADLOCK_DETECTED`: Int = -2146860992;
public const val `WINBIO_E_DEVICE_BUSY`: Int = -2146861040;
public const val `WINBIO_E_DEVICE_FAILURE`: Int = -2146861002;
public const val `WINBIO_E_DISABLED`: Int = -2146861006;
public const val `WINBIO_E_DUPLICATE_ENROLLMENT`: Int = -2146861028;
public const val `WINBIO_E_DUPLICATE_TEMPLATE`: Int = -2146861013;
public const val `WINBIO_E_ENROLLMENT_CANCELED_BY_SUSPEND`: Int = -2146860965;
public const val `WINBIO_E_ENROLLMENT_IN_PROGRESS`: Int = -2146861049;
public const val `WINBIO_E_EVENT_MONITOR_ACTIVE`: Int = -2146860999;
public const val `WINBIO_E_FAST_USER_SWITCH_DISABLED`: Int = -2146861001;
public const val `WINBIO_E_INCORRECT_BSP`: Int = -2146861020;
public const val `WINBIO_E_INCORRECT_SENSOR_POOL`: Int = -2146861019;
public const val `WINBIO_E_INCORRECT_SESSION_TYPE`: Int = -2146860994;
public const val `WINBIO_E_INSECURE_SENSOR`: Int = -2146860969;
public const val `WINBIO_E_INVALID_BUFFER`: Int = -2146860967;
public const val `WINBIO_E_INVALID_BUFFER_ID`: Int = -2146860968;
public const val `WINBIO_E_INVALID_CALIBRATION_FORMAT_ARRAY`: Int = -2146860980;
public const val `WINBIO_E_INVALID_CONTROL_CODE`: Int = -2146861047;
public const val `WINBIO_E_INVALID_DEVICE_STATE`: Int = -2146861041;
public const val `WINBIO_E_INVALID_KEY_IDENTIFIER`: Int = -2146860974;
public const val `WINBIO_E_INVALID_OPERATION`: Int = -2146861012;
public const val `WINBIO_E_INVALID_PROPERTY_ID`: Int = -2146860997;
public const val `WINBIO_E_INVALID_PROPERTY_TYPE`: Int = -2146860998;
public const val `WINBIO_E_INVALID_SENSOR_MODE`: Int = -2146861017;
public const val `WINBIO_E_INVALID_SUBFACTOR`: Int = -2146860981;
public const val `WINBIO_E_INVALID_TICKET`: Int = -2146860988;
public const val `WINBIO_E_INVALID_UNIT`: Int = -2146861054;
public const val `WINBIO_E_KEY_CREATION_FAILED`: Int = -2146860973;
public const val `WINBIO_E_KEY_IDENTIFIER_BUFFER_TOO_SMALL`: Int = -2146860972;
public const val `WINBIO_E_LOCK_VIOLATION`: Int = -2146861014;
public const val `WINBIO_E_MAX_ERROR_COUNT_EXCEEDED`: Int = -2146860990;
public const val `WINBIO_E_NOT_ACTIVE_CONSOLE`: Int = -2146861000;
public const val `WINBIO_E_NO_CAPTURE_DATA`: Int = -2146861018;
public const val `WINBIO_E_NO_MATCH`: Int = -2146861051;
public const val `WINBIO_E_NO_PREBOOT_IDENTITY`: Int = -2146860991;
public const val `WINBIO_E_NO_SUPPORTED_CALIBRATION_FORMAT`: Int = -2146860979;
public const val `WINBIO_E_POLICY_PROTECTION_UNAVAILABLE`: Int = -2146860970;
public const val `WINBIO_E_PRESENCE_MONITOR_ACTIVE`: Int = -2146860982;
public const val `WINBIO_E_PROPERTY_UNAVAILABLE`: Int = -2146860971;
public const val `WINBIO_E_SAS_ENABLED`: Int = -2146861003;
public const val `WINBIO_E_SELECTION_REQUIRED`: Int = -2146860983;
public const val `WINBIO_E_SENSOR_UNAVAILABLE`: Int = -2146861004;
public const val `WINBIO_E_SESSION_BUSY`: Int = -2146861011;
public const val `WINBIO_E_SESSION_HANDLE_CLOSED`: Int = -2146860993;
public const val `WINBIO_E_TICKET_QUOTA_EXCEEDED`: Int = -2146860987;
public const val `WINBIO_E_TRUSTLET_INTEGRITY_FAIL`: Int = -2146860966;
public const val `WINBIO_E_UNKNOWN_ID`: Int = -2146861053;
public const val `WINBIO_E_UNSUPPORTED_DATA_FORMAT`: Int = -2146861044;
public const val `WINBIO_E_UNSUPPORTED_DATA_TYPE`: Int = -2146861043;
public const val `WINBIO_E_UNSUPPORTED_FACTOR`: Int = -2146861055;
public const val `WINBIO_E_UNSUPPORTED_POOL_TYPE`: Int = -2146860984;
public const val `WINBIO_E_UNSUPPORTED_PROPERTY`: Int = -2146860996;
public const val `WINBIO_E_UNSUPPORTED_PURPOSE`: Int = -2146861042;
public const val `WINBIO_E_UNSUPPORTED_SENSOR_CALIBRATION_FORMAT`: Int = -2146860978;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_FP_BU_STATE` (
    public var `SensorAttached`: `windows_sys`.`core`.`BOOL`,
    public var `CreationResult`: `windows_sys`.`core`.`HRESULT`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_FRAMEWORK_INTERFACE` (
    public var `Version`: `WINBIO_ADAPTER_INTERFACE_VERSION`,
    public var `Type`: UInt,
    public var `Size`: ULong,
    public var `AdapterId`: `windows_sys`.`core`.`GUID`,
    public var `SetUnitStatus`: `PIBIO_FRAMEWORK_SET_UNIT_STATUS_FN`,
    public var `VsmStorageAttach`: `PIBIO_STORAGE_ATTACH_FN`,
    public var `VsmStorageDetach`: `PIBIO_STORAGE_DETACH_FN`,
    public var `VsmStorageClearContext`: `PIBIO_STORAGE_CLEAR_CONTEXT_FN`,
    public var `VsmStorageCreateDatabase`: `PIBIO_STORAGE_CREATE_DATABASE_FN`,
    public var `VsmStorageOpenDatabase`: `PIBIO_STORAGE_OPEN_DATABASE_FN`,
    public var `VsmStorageCloseDatabase`: `PIBIO_STORAGE_CLOSE_DATABASE_FN`,
    public var `VsmStorageDeleteRecord`: `PIBIO_STORAGE_DELETE_RECORD_FN`,
    public var `VsmStorageNotifyPowerChange`: `PIBIO_STORAGE_NOTIFY_POWER_CHANGE_FN`,
    public var `VsmStoragePipelineInit`: `PIBIO_STORAGE_PIPELINE_INIT_FN`,
    public var `VsmStoragePipelineCleanup`: `PIBIO_STORAGE_PIPELINE_CLEANUP_FN`,
    public var `VsmStorageActivate`: `PIBIO_STORAGE_ACTIVATE_FN`,
    public var `VsmStorageDeactivate`: `PIBIO_STORAGE_DEACTIVATE_FN`,
    public var `VsmStorageQueryExtendedInfo`: `PIBIO_STORAGE_QUERY_EXTENDED_INFO_FN`,
    public var `VsmStorageCacheClear`: `PIBIO_FRAMEWORK_VSM_CACHE_CLEAR_FN`,
    public var `VsmStorageCacheImportBegin`: `PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_BEGIN_FN`,
    public var `VsmStorageCacheImportNext`: `PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_NEXT_FN`,
    public var `VsmStorageCacheImportEnd`: `PIBIO_FRAMEWORK_VSM_CACHE_IMPORT_END_FN`,
    public var `VsmStorageCacheExportBegin`: `PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_BEGIN_FN`,
    public var `VsmStorageCacheExportNext`: `PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_NEXT_FN`,
    public var `VsmStorageCacheExportEnd`: `PIBIO_FRAMEWORK_VSM_CACHE_EXPORT_END_FN`,
    public var `VsmSensorAttach`: `PIBIO_SENSOR_ATTACH_FN`,
    public var `VsmSensorDetach`: `PIBIO_SENSOR_DETACH_FN`,
    public var `VsmSensorClearContext`: `PIBIO_SENSOR_CLEAR_CONTEXT_FN`,
    public var `VsmSensorPushDataToEngine`: `PIBIO_SENSOR_PUSH_DATA_TO_ENGINE_FN`,
    public var `VsmSensorNotifyPowerChange`: `PIBIO_SENSOR_NOTIFY_POWER_CHANGE_FN`,
    public var `VsmSensorPipelineInit`: `PIBIO_SENSOR_PIPELINE_INIT_FN`,
    public var `VsmSensorPipelineCleanup`: `PIBIO_SENSOR_PIPELINE_CLEANUP_FN`,
    public var `VsmSensorActivate`: `PIBIO_SENSOR_ACTIVATE_FN`,
    public var `VsmSensorDeactivate`: `PIBIO_SENSOR_DEACTIVATE_FN`,
    public var `VsmSensorAsyncImportRawBuffer`: `PIBIO_SENSOR_ASYNC_IMPORT_RAW_BUFFER_FN`,
    public var `VsmSensorAsyncImportSecureBuffer`: `PIBIO_SENSOR_ASYNC_IMPORT_SECURE_BUFFER_FN`,
    public var `Reserved1`: `PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_1_FN`,
    public var `Reserved2`: `PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_2_FN`,
    public var `Reserved3`: `PIBIO_FRAMEWORK_VSM_STORAGE_RESERVED_3_FN`,
    public var `Reserved4`: `PIBIO_STORAGE_RESERVED_1_FN`,
    public var `Reserved5`: `PIBIO_STORAGE_RESERVED_2_FN`,
    public var `AllocateMemory`: `PIBIO_FRAMEWORK_ALLOCATE_MEMORY_FN`,
    public var `FreeMemory`: `PIBIO_FRAMEWORK_FREE_MEMORY_FN`,
    public var `GetProperty`: `PIBIO_FRAMEWORK_GET_PROPERTY_FN`,
    public var `LockAndValidateSecureBuffer`: `PIBIO_FRAMEWORK_LOCK_AND_VALIDATE_SECURE_BUFFER_FN`,
    public var `ReleaseSecureBuffer`: `PIBIO_FRAMEWORK_RELEASE_SECURE_BUFFER_FN`,
    public var `QueryAuthorizedEnrollments`: `PIBIO_FRAMEWORK_VSM_QUERY_AUTHORIZED_ENROLLMENTS_FN`,
    public var `DecryptSample`: `PIBIO_FRAMEWORK_VSM_DECRYPT_SAMPLE_FN`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_GESTURE_METADATA` (
    public var `Size`: ULong,
    public var `BiometricType`: UInt,
    public var `MatchType`: UInt,
    public var `ProtectionType`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_GET_INDICATOR` (
    public var `PayloadSize`: UInt,
    public var `WinBioHresult`: `windows_sys`.`core`.`HRESULT`,
    public var `IndicatorStatus`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_IDENTITY` (
    public var `Type`: UInt,
    public var `Value`: `WINBIO_IDENTITY_0`,
)
// UNSUPPORTED Rust 1324:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_IDENTITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1329:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINBIO_IDENTITY_0 {
//     pub Null: u32,
//     pub Wildcard: u32,
//     pub TemplateGuid: windows_sys::core::GUID,
//     pub AccountSid: WINBIO_IDENTITY_0_0,
//     pub SecureId: [u8; 32],
// }

// UNSUPPORTED Rust 1338:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_IDENTITY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 68 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_IDENTITY_0_0` (
    public var `Size`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 1349:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_IDENTITY_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINBIO_I_EXTENDED_STATUS_INFORMATION`: Int = 589826;
public const val `WINBIO_I_MORE_DATA`: Int = 589825;
public const val `WINBIO_MAX_STRING_LEN`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_NOTIFY_WAKE` (
    public var `PayloadSize`: UInt,
    public var `WinBioHresult`: `windows_sys`.`core`.`HRESULT`,
    public var `Reason`: UInt,
)
public const val `WINBIO_PASSWORD_GENERIC`: `WINBIO_CREDENTIAL_FORMAT` = 1;
public const val `WINBIO_PASSWORD_PACKED`: `WINBIO_CREDENTIAL_FORMAT` = 2;
public const val `WINBIO_PASSWORD_PROTECTED`: `WINBIO_CREDENTIAL_FORMAT` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_PIPELINE` (
    public var `SensorHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `EngineHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `StorageHandle`: `super`.`super`.`Foundation`.`HANDLE`,
    public var `SensorInterface`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_SENSOR_INTERFACE`>?,
    public var `EngineInterface`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_ENGINE_INTERFACE`>?,
    public var `StorageInterface`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_STORAGE_INTERFACE`>?,
    public var `SensorContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINIBIO_SENSOR_CONTEXT`>?,
    public var `EngineContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINIBIO_ENGINE_CONTEXT`>?,
    public var `StorageContext`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINIBIO_STORAGE_CONTEXT`>?,
    public var `FrameworkInterface`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_FRAMEWORK_INTERFACE`>?,
)
// UNSUPPORTED Rust 1382:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_System_IO")]
// impl Default for WINBIO_PIPELINE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WINBIO_POLICY_ADMIN`: `WINBIO_POLICY_SOURCE` = 3;
public const val `WINBIO_POLICY_DEFAULT`: `WINBIO_POLICY_SOURCE` = 1;
public const val `WINBIO_POLICY_LOCAL`: `WINBIO_POLICY_SOURCE` = 2;
public typealias `WINBIO_POLICY_SOURCE` = Int;
public const val `WINBIO_POLICY_UNKNOWN`: `WINBIO_POLICY_SOURCE` = 0;
public typealias `WINBIO_POOL` = UInt;
public const val `WINBIO_POOL_PRIVATE`: `WINBIO_POOL` = 2u;
public const val `WINBIO_POOL_SYSTEM`: `WINBIO_POOL` = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_PRESENCE` (
    public var `Factor`: UInt,
    public var `SubFactor`: UByte,
    public var `Status`: `windows_sys`.`core`.`HRESULT`,
    public var `RejectDetail`: UInt,
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `TrackingId`: ULong,
    public var `Ticket`: ULong,
    public var `Properties`: `WINBIO_PRESENCE_PROPERTIES`,
    public var `Authorization`: `WINBIO_PRESENCE_0`,
)
// UNSUPPORTED Rust 1409:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_PRESENCE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_PRESENCE_0` (
    public var `Size`: UInt,
    public var `Data`: UByteArray,
)
// UNSUPPORTED Rust 1420:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_PRESENCE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1425:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WINBIO_PRESENCE_PROPERTIES {
//     pub FacialFeatures: WINBIO_PRESENCE_PROPERTIES_0,
//     pub Iris: WINBIO_PRESENCE_PROPERTIES_1,
// }

// UNSUPPORTED Rust 1431:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_PRESENCE_PROPERTIES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_PRESENCE_PROPERTIES_0` (
    public var `BoundingBox`: `super`.`super`.`Foundation`.`RECT`,
    public var `Distance`: Int,
    public var `OpaqueEngineData`: `WINBIO_PRESENCE_PROPERTIES_0_0`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 78 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_PRESENCE_PROPERTIES_0_0` (
    public var `AdapterId`: `windows_sys`.`core`.`GUID`,
    public var `Data`: UIntArray,
)
// UNSUPPORTED Rust 1449:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_PRESENCE_PROPERTIES_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_PRESENCE_PROPERTIES_1` (
    public var `EyeBoundingBox_1`: `super`.`super`.`Foundation`.`RECT`,
    public var `EyeBoundingBox_2`: `super`.`super`.`Foundation`.`RECT`,
    public var `PupilCenter_1`: `super`.`super`.`Foundation`.`POINT`,
    public var `PupilCenter_2`: `super`.`super`.`Foundation`.`POINT`,
    public var `Distance`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_PRIVATE_SENSOR_TYPE_INFO` (
    public var `PayloadSize`: UInt,
    public var `WinBioHresult`: `windows_sys`.`core`.`HRESULT`,
    public var `PrivateSensorTypeInfo`: `WINBIO_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 128 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_PROTECTION_POLICY` (
    public var `Version`: UInt,
    public var `Identity`: `WINBIO_IDENTITY`,
    public var `DatabaseId`: `windows_sys`.`core`.`GUID`,
    public var `UserState`: ULong,
    public var `PolicySize`: ULong,
    public var `Policy`: UByteArray,
)
// UNSUPPORTED Rust 1480:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_PROTECTION_POLICY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_REGISTERED_FORMAT` (
    public var `Owner`: UShort,
    public var `Type`: UShort,
)
public const val `WINBIO_SCP_CURVE_FIELD_SIZE_V1`: UInt = 32u;
public const val `WINBIO_SCP_DIGEST_SIZE_V1`: UInt = 32u;
public const val `WINBIO_SCP_ENCRYPTION_BLOCK_SIZE_V1`: UInt = 16u;
public const val `WINBIO_SCP_ENCRYPTION_KEY_SIZE_V1`: UInt = 32u;
public const val `WINBIO_SCP_PRIVATE_KEY_SIZE_V1`: UInt = 32u;
public const val `WINBIO_SCP_PUBLIC_KEY_SIZE_V1`: UInt = 65u;
public const val `WINBIO_SCP_RANDOM_SIZE_V1`: UInt = 32u;
public const val `WINBIO_SCP_SIGNATURE_SIZE_V1`: UInt = 64u;
public const val `WINBIO_SCP_VERSION_1`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_SECURE_BUFFER_HEADER_V1` (
    public var `Type`: UInt,
    public var `Size`: UInt,
    public var `Flags`: UInt,
    public var `ValidationTag`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_SECURE_CONNECTION_DATA` (
    public var `Size`: UInt,
    public var `Version`: UShort,
    public var `Flags`: UShort,
    public var `ModelCertificateSize`: UInt,
    public var `IntermediateCA1Size`: UInt,
    public var `IntermediateCA2Size`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_SECURE_CONNECTION_PARAMS` (
    public var `PayloadSize`: UInt,
    public var `Version`: UShort,
    public var `Flags`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_SENSOR_ATTRIBUTES` (
    public var `PayloadSize`: UInt,
    public var `WinBioHresult`: `windows_sys`.`core`.`HRESULT`,
    public var `WinBioVersion`: `WINBIO_VERSION`,
    public var `SensorType`: UInt,
    public var `SensorSubType`: UInt,
    public var `Capabilities`: UInt,
    public var `ManufacturerName`: UShortArray,
    public var `ModelName`: UShortArray,
    public var `SerialNumber`: UShortArray,
    public var `FirmwareVersion`: `WINBIO_VERSION`,
    public var `SupportedFormatEntries`: UInt,
    public var `SupportedFormat`: Array<`WINBIO_REGISTERED_FORMAT`>,
)
// UNSUPPORTED Rust 1541:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_SENSOR_ATTRIBUTES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_SENSOR_INTERFACE` (
    public var `Version`: `WINBIO_ADAPTER_INTERFACE_VERSION`,
    public var `Type`: UInt,
    public var `Size`: ULong,
    public var `AdapterId`: `windows_sys`.`core`.`GUID`,
    public var `Attach`: `PIBIO_SENSOR_ATTACH_FN`,
    public var `Detach`: `PIBIO_SENSOR_DETACH_FN`,
    public var `ClearContext`: `PIBIO_SENSOR_CLEAR_CONTEXT_FN`,
    public var `QueryStatus`: `PIBIO_SENSOR_QUERY_STATUS_FN`,
    public var `Reset`: `PIBIO_SENSOR_RESET_FN`,
    public var `SetMode`: `PIBIO_SENSOR_SET_MODE_FN`,
    public var `SetIndicatorStatus`: `PIBIO_SENSOR_SET_INDICATOR_STATUS_FN`,
    public var `GetIndicatorStatus`: `PIBIO_SENSOR_GET_INDICATOR_STATUS_FN`,
    public var `StartCapture`: `PIBIO_SENSOR_START_CAPTURE_FN`,
    public var `FinishCapture`: `PIBIO_SENSOR_FINISH_CAPTURE_FN`,
    public var `ExportSensorData`: `PIBIO_SENSOR_EXPORT_SENSOR_DATA_FN`,
    public var `Cancel`: `PIBIO_SENSOR_CANCEL_FN`,
    public var `PushDataToEngine`: `PIBIO_SENSOR_PUSH_DATA_TO_ENGINE_FN`,
    public var `ControlUnit`: `PIBIO_SENSOR_CONTROL_UNIT_FN`,
    public var `ControlUnitPrivileged`: `PIBIO_SENSOR_CONTROL_UNIT_PRIVILEGED_FN`,
    public var `NotifyPowerChange`: `PIBIO_SENSOR_NOTIFY_POWER_CHANGE_FN`,
    public var `PipelineInit`: `PIBIO_SENSOR_PIPELINE_INIT_FN`,
    public var `PipelineCleanup`: `PIBIO_SENSOR_PIPELINE_CLEANUP_FN`,
    public var `Activate`: `PIBIO_SENSOR_ACTIVATE_FN`,
    public var `Deactivate`: `PIBIO_SENSOR_DEACTIVATE_FN`,
    public var `QueryExtendedInfo`: `PIBIO_SENSOR_QUERY_EXTENDED_INFO_FN`,
    public var `QueryCalibrationFormats`: `PIBIO_SENSOR_QUERY_CALIBRATION_FORMATS_FN`,
    public var `SetCalibrationFormat`: `PIBIO_SENSOR_SET_CALIBRATION_FORMAT_FN`,
    public var `AcceptCalibrationData`: `PIBIO_SENSOR_ACCEPT_CALIBRATION_DATA_FN`,
    public var `AsyncImportRawBuffer`: `PIBIO_SENSOR_ASYNC_IMPORT_RAW_BUFFER_FN`,
    public var `AsyncImportSecureBuffer`: `PIBIO_SENSOR_ASYNC_IMPORT_SECURE_BUFFER_FN`,
    public var `QueryPrivateSensorType`: `PIBIO_SENSOR_QUERY_PRIVATE_SENSOR_TYPE_FN`,
    public var `ConnectSecure`: `PIBIO_SENSOR_CONNECT_SECURE_FN`,
    public var `StartCaptureEx`: `PIBIO_SENSOR_START_CAPTURE_EX_FN`,
    public var `StartNotifyWake`: `PIBIO_SENSOR_START_NOTIFY_WAKE_FN`,
    public var `FinishNotifyWake`: `PIBIO_SENSOR_FINISH_NOTIFY_WAKE_FN`,
)
public typealias `WINBIO_SETTING_SOURCE` = UInt;
public const val `WINBIO_SETTING_SOURCE_DEFAULT`: `WINBIO_SETTING_SOURCE` = 1u;
public const val `WINBIO_SETTING_SOURCE_INVALID`: `WINBIO_SETTING_SOURCE` = 0u;
public const val `WINBIO_SETTING_SOURCE_LOCAL`: `WINBIO_SETTING_SOURCE` = 3u;
public const val `WINBIO_SETTING_SOURCE_POLICY`: `WINBIO_SETTING_SOURCE` = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_SET_INDICATOR` (
    public var `PayloadSize`: UInt,
    public var `IndicatorStatus`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_System_IO")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_STORAGE_INTERFACE` (
    public var `Version`: `WINBIO_ADAPTER_INTERFACE_VERSION`,
    public var `Type`: UInt,
    public var `Size`: ULong,
    public var `AdapterId`: `windows_sys`.`core`.`GUID`,
    public var `Attach`: `PIBIO_STORAGE_ATTACH_FN`,
    public var `Detach`: `PIBIO_STORAGE_DETACH_FN`,
    public var `ClearContext`: `PIBIO_STORAGE_CLEAR_CONTEXT_FN`,
    public var `CreateDatabase`: `PIBIO_STORAGE_CREATE_DATABASE_FN`,
    public var `EraseDatabase`: `PIBIO_STORAGE_ERASE_DATABASE_FN`,
    public var `OpenDatabase`: `PIBIO_STORAGE_OPEN_DATABASE_FN`,
    public var `CloseDatabase`: `PIBIO_STORAGE_CLOSE_DATABASE_FN`,
    public var `GetDataFormat`: `PIBIO_STORAGE_GET_DATA_FORMAT_FN`,
    public var `GetDatabaseSize`: `PIBIO_STORAGE_GET_DATABASE_SIZE_FN`,
    public var `AddRecord`: `PIBIO_STORAGE_ADD_RECORD_FN`,
    public var `DeleteRecord`: `PIBIO_STORAGE_DELETE_RECORD_FN`,
    public var `QueryBySubject`: `PIBIO_STORAGE_QUERY_BY_SUBJECT_FN`,
    public var `QueryByContent`: `PIBIO_STORAGE_QUERY_BY_CONTENT_FN`,
    public var `GetRecordCount`: `PIBIO_STORAGE_GET_RECORD_COUNT_FN`,
    public var `FirstRecord`: `PIBIO_STORAGE_FIRST_RECORD_FN`,
    public var `NextRecord`: `PIBIO_STORAGE_NEXT_RECORD_FN`,
    public var `GetCurrentRecord`: `PIBIO_STORAGE_GET_CURRENT_RECORD_FN`,
    public var `ControlUnit`: `PIBIO_STORAGE_CONTROL_UNIT_FN`,
    public var `ControlUnitPrivileged`: `PIBIO_STORAGE_CONTROL_UNIT_PRIVILEGED_FN`,
    public var `NotifyPowerChange`: `PIBIO_STORAGE_NOTIFY_POWER_CHANGE_FN`,
    public var `PipelineInit`: `PIBIO_STORAGE_PIPELINE_INIT_FN`,
    public var `PipelineCleanup`: `PIBIO_STORAGE_PIPELINE_CLEANUP_FN`,
    public var `Activate`: `PIBIO_STORAGE_ACTIVATE_FN`,
    public var `Deactivate`: `PIBIO_STORAGE_DEACTIVATE_FN`,
    public var `QueryExtendedInfo`: `PIBIO_STORAGE_QUERY_EXTENDED_INFO_FN`,
    public var `NotifyDatabaseChange`: `PIBIO_STORAGE_NOTIFY_DATABASE_CHANGE_FN`,
    public var `Reserved1`: `PIBIO_STORAGE_RESERVED_1_FN`,
    public var `Reserved2`: `PIBIO_STORAGE_RESERVED_2_FN`,
    public var `UpdateRecordBegin`: `PIBIO_STORAGE_UPDATE_RECORD_BEGIN_FN`,
    public var `UpdateRecordCommit`: `PIBIO_STORAGE_UPDATE_RECORD_COMMIT_FN`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_STORAGE_RECORD` (
    public var `Identity`: /* Rust *mut */ kotlinx.cinterop.CPointer<`WINBIO_IDENTITY`>?,
    public var `SubFactor`: UByte,
    public var `IndexVector`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?,
    public var `IndexElementCount`: ULong,
    public var `TemplateBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `TemplateBlobSize`: ULong,
    public var `PayloadBlob`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `PayloadBlobSize`: ULong,
)
// UNSUPPORTED Rust 1648:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_STORAGE_RECORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_STORAGE_SCHEMA` (
    public var `BiometricFactor`: UInt,
    public var `DatabaseId`: `windows_sys`.`core`.`GUID`,
    public var `DataFormat`: `windows_sys`.`core`.`GUID`,
    public var `Attributes`: UInt,
    public var `FilePath`: UShortArray,
    public var `ConnectionString`: UShortArray,
)
// UNSUPPORTED Rust 1663:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_STORAGE_SCHEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_SUPPORTED_ALGORITHMS` (
    public var `PayloadSize`: UInt,
    public var `WinBioHresult`: `windows_sys`.`core`.`HRESULT`,
    public var `NumberOfAlgorithms`: UInt,
    public var `AlgorithmData`: `WINBIO_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WINBIO_UNIT_SCHEMA` (
    public var `UnitId`: UInt,
    public var `PoolType`: UInt,
    public var `BiometricFactor`: UInt,
    public var `SensorSubType`: UInt,
    public var `Capabilities`: UInt,
    public var `DeviceInstanceId`: UShortArray,
    public var `Description`: UShortArray,
    public var `Manufacturer`: UShortArray,
    public var `Model`: UShortArray,
    public var `SerialNumber`: UShortArray,
    public var `FirmwareVersion`: `WINBIO_VERSION`,
)
// UNSUPPORTED Rust 1691:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for WINBIO_UNIT_SCHEMA {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_UPDATE_FIRMWARE` (
    public var `PayloadSize`: UInt,
    public var `FirmwareData`: `WINBIO_DATA`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WINBIO_VERSION` (
    public var `MajorVersion`: UInt,
    public var `MinorVersion`: UInt,
)
public const val `WINBIO_WBDI_MAJOR_VERSION`: UInt = 1u;
public const val `WINBIO_WBDI_MINOR_VERSION`: UInt = 0u;
public typealias `WINIBIO_ENGINE_CONTEXT` = Long;
public typealias `WINIBIO_SENSOR_CONTEXT` = Long;
public typealias `WINIBIO_STORAGE_CONTEXT` = Long;
