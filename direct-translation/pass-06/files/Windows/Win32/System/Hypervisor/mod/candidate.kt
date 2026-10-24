// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ApplyGuestMemoryFix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ApplyGuestMemoryFix`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `virtualaddress` : ULong, `fixbuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `fixbuffersize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ApplyPendingSavedStateFileReplayLog; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ApplyPendingSavedStateFileReplayLog`(`vmrsfile` : `windows_sys`.`core`.`PCWSTR`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=CallStackUnwind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `CallStackUnwind`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `imageinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`MODULE_INFO`>?, `imageinfocount` : UInt, `framecount` : UInt, `callstack` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=FindSavedStateSymbolFieldInType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `FindSavedStateSymbolFieldInType`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `typename` : `windows_sys`.`core`.`PCSTR`, `fieldname` : `windows_sys`.`core`.`PCWSTR`, `offset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `found` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ForceActiveVirtualTrustLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ForceActiveVirtualTrustLevel`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `virtualtrustlevel` : UByte) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ForceArchitecture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ForceArchitecture`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `architecture` : `VIRTUAL_PROCESSOR_ARCH`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ForceNestedHostMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ForceNestedHostMode`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `hostmode` : `windows_sys`.`core`.`BOOL`, `oldmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ForcePagingMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ForcePagingMode`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `pagingmode` : `PAGING_MODE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetActiveVirtualTrustLevel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetActiveVirtualTrustLevel`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `virtualtrustlevel` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetArchitecture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetArchitecture`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `architecture` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VIRTUAL_PROCESSOR_ARCH`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetEnabledVirtualTrustLevels; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetEnabledVirtualTrustLevels`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `virtualtrustlevels` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetGuestEnabledVirtualTrustLevels; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGuestEnabledVirtualTrustLevels`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `virtualtrustlevels` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetGuestOsInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGuestOsInfo`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `virtualtrustlevel` : UByte, `guestosinfo` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GUEST_OS_INFO`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetGuestPhysicalMemoryChunks; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGuestPhysicalMemoryChunks`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `memorychunkpagesize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `memorychunks` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GPA_MEMORY_CHUNK`>?, `memorychunkcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetGuestRawSavedMemorySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetGuestRawSavedMemorySize`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `guestrawsavedmemorysize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetMemoryBlockCacheLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetMemoryBlockCacheLimit`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `memoryblockcachelimit` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetNestedVirtualizationMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetNestedVirtualizationMode`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `enabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetPagingMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetPagingMode`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `pagingmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PAGING_MODE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetRegisterValue; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetRegisterValue`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `registerid` : UInt, `registervalue` : /* Rust *mut */ kotlinx.cinterop.CPointer<`VIRTUAL_PROCESSOR_REGISTER`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetSavedStateSymbolFieldInfo; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSavedStateSymbolFieldInfo`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `typename` : `windows_sys`.`core`.`PCSTR`, `typefieldinfomap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetSavedStateSymbolProviderHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSavedStateSymbolProviderHandle`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `super`.`super`.`Foundation`.`HANDLE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetSavedStateSymbolTypeSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetSavedStateSymbolTypeSize`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `typename` : `windows_sys`.`core`.`PCSTR`, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GetVpCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GetVpCount`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GuestPhysicalAddressToRawSavedMemoryOffset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GuestPhysicalAddressToRawSavedMemoryOffset`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `physicaladdress` : ULong, `rawsavedmemoryoffset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=GuestVirtualAddressToPhysicalAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GuestVirtualAddressToPhysicalAddress`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `virtualaddress` : ULong, `physicaladdress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `unmappedregionsize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvCreateDeviceInstance; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvCreateDeviceInstance`(`devicehosthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `devicetype` : `HDV_DEVICE_TYPE`, `deviceclassid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `deviceinstanceid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `deviceinterface` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `devicecontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `devicehandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvCreateGuestMemoryAperture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvCreateGuestMemoryAperture`(`requestor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `guestphysicaladdress` : ULong, `bytecount` : UInt, `writeprotected` : `windows_sys`.`core`.`BOOL`, `mappedaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvCreateSectionBackedMmioRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvCreateSectionBackedMmioRange`(`requestor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `barindex` : `HDV_PCI_BAR_SELECTOR`, `offsetinpages` : ULong, `lengthinpages` : ULong, `mappingflags` : `HDV_MMIO_MAPPING_FLAGS`, `sectionhandle` : `super`.`super`.`Foundation`.`HANDLE`, `sectionoffsetinpages` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvDeliverGuestInterrupt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvDeliverGuestInterrupt`(`requestor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `msiaddress` : ULong, `msidata` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvDestroyGuestMemoryAperture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvDestroyGuestMemoryAperture`(`requestor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `mappedaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvDestroySectionBackedMmioRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvDestroySectionBackedMmioRange`(`requestor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `barindex` : `HDV_PCI_BAR_SELECTOR`, `offsetinpages` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvInitializeDeviceHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_HostComputeSystem")]
public external fun `HdvInitializeDeviceHost`(`computesystem` : `super`.`HostComputeSystem`.`HCS_SYSTEM`, `devicehosthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvInitializeDeviceHostEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_HostComputeSystem")]
public external fun `HdvInitializeDeviceHostEx`(`computesystem` : `super`.`HostComputeSystem`.`HCS_SYSTEM`, `flags` : `HDV_DEVICE_HOST_FLAGS`, `devicehosthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvReadGuestMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvReadGuestMemory`(`requestor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `guestphysicaladdress` : ULong, `bytecount` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvRegisterDoorbell; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvRegisterDoorbell`(`requestor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `barindex` : `HDV_PCI_BAR_SELECTOR`, `baroffset` : ULong, `triggervalue` : ULong, `flags` : ULong, `doorbellevent` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvTeardownDeviceHost; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvTeardownDeviceHost`(`devicehosthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvUnregisterDoorbell; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvUnregisterDoorbell`(`requestor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `barindex` : `HDV_PCI_BAR_SELECTOR`, `baroffset` : ULong, `triggervalue` : ULong, `flags` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmdevicehost.dll, ABI=system, export=HdvWriteGuestMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HdvWriteGuestMemory`(`requestor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `guestphysicaladdress` : ULong, `bytecount` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=InKernelSpace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `InKernelSpace`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `inkernelspace` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=IsActiveVirtualTrustLevelEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsActiveVirtualTrustLevelEnabled`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `activevirtualtrustlevelenabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=IsNestedVirtualizationEnabled; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `IsNestedVirtualizationEnabled`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `enabled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=LoadSavedStateFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadSavedStateFile`(`vmrsfile` : `windows_sys`.`core`.`PCWSTR`, `vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=LoadSavedStateFiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadSavedStateFiles`(`binfile` : `windows_sys`.`core`.`PCWSTR`, `vsvfile` : `windows_sys`.`core`.`PCWSTR`, `vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=LoadSavedStateModuleSymbols; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadSavedStateModuleSymbols`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imagename` : `windows_sys`.`core`.`PCSTR`, `modulename` : `windows_sys`.`core`.`PCSTR`, `baseaddress` : ULong, `sizeofbase` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=LoadSavedStateModuleSymbolsEx; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadSavedStateModuleSymbolsEx`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imagename` : `windows_sys`.`core`.`PCSTR`, `imagetimestamp` : UInt, `modulename` : `windows_sys`.`core`.`PCSTR`, `baseaddress` : ULong, `sizeofbase` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=LoadSavedStateSymbolProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LoadSavedStateSymbolProvider`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `usersymbols` : `windows_sys`.`core`.`PCWSTR`, `force` : `windows_sys`.`core`.`BOOL`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=LocateSavedStateFiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `LocateSavedStateFiles`(`vmname` : `windows_sys`.`core`.`PCWSTR`, `snapshotname` : `windows_sys`.`core`.`PCWSTR`, `binpath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `vsvpath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `vmrspath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ReadGuestPhysicalAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadGuestPhysicalAddress`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `physicaladdress` : ULong, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ReadGuestRawSavedMemory; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadGuestRawSavedMemory`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `rawsavedmemoryoffset` : ULong, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt, `bytesread` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ReadSavedStateGlobalVariable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReadSavedStateGlobalVariable`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `globalname` : `windows_sys`.`core`.`PCSTR`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ReleaseSavedStateFiles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReleaseSavedStateFiles`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ReleaseSavedStateSymbolProvider; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ReleaseSavedStateSymbolProvider`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ResolveSavedStateGlobalVariableAddress; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ResolveSavedStateGlobalVariableAddress`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `globalname` : `windows_sys`.`core`.`PCSTR`, `virtualaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=ScanMemoryForDosImages; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `ScanMemoryForDosImages`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpid` : UInt, `startaddress` : ULong, `endaddress` : ULong, `callbackcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `foundimagecallback` : `FOUND_IMAGE_CALLBACK`, `standaloneaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `standaloneaddresscount` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=SetMemoryBlockCacheLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetMemoryBlockCacheLimit`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `memoryblockcachelimit` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=vmsavedstatedumpprovider.dll, ABI=system, export=SetSavedStateSymbolProviderDebugInfoCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `SetSavedStateSymbolProviderDebugInfoCallback`(`vmsavedstatedumphandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvAcceptPartitionMigration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvAcceptPartitionMigration`(`migrationhandle` : `super`.`super`.`Foundation`.`HANDLE`, `partition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_PARTITION_HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvAdviseGpaRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvAdviseGpaRange`(`partition` : `WHV_PARTITION_HANDLE`, `gparanges` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_MEMORY_RANGE_ENTRY`>?, `gparangescount` : UInt, `advice` : `WHV_ADVISE_GPA_RANGE_CODE`, `advicebuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `advicebuffersizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvAllocateVpciResource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvAllocateVpciResource`(`providerid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `flags` : `WHV_ALLOCATE_VPCI_RESOURCE_FLAGS`, `resourcedescriptor` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `resourcedescriptorsizeinbytes` : UInt, `vpciresource` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvCancelPartitionMigration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvCancelPartitionMigration`(`partition` : `WHV_PARTITION_HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvCancelRunVirtualProcessor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvCancelRunVirtualProcessor`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `flags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvCompletePartitionMigration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvCompletePartitionMigration`(`partition` : `WHV_PARTITION_HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvCreateNotificationPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvCreateNotificationPort`(`partition` : `WHV_PARTITION_HANDLE`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_NOTIFICATION_PORT_PARAMETERS`>?, `eventhandle` : `super`.`super`.`Foundation`.`HANDLE`, `porthandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvCreatePartition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvCreatePartition`(`partition` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_PARTITION_HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvCreateTrigger; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvCreateTrigger`(`partition` : `WHV_PARTITION_HANDLE`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_TRIGGER_PARAMETERS`>?, `triggerhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `eventhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvCreateVirtualProcessor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvCreateVirtualProcessor`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `flags` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvCreateVirtualProcessor2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvCreateVirtualProcessor2`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `properties` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_VIRTUAL_PROCESSOR_PROPERTY`>?, `propertycount` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvCreateVpciDevice; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvCreateVpciDevice`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `vpciresource` : `super`.`super`.`Foundation`.`HANDLE`, `flags` : `WHV_CREATE_VPCI_DEVICE_FLAGS`, `notificationeventhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvDeleteNotificationPort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvDeleteNotificationPort`(`partition` : `WHV_PARTITION_HANDLE`, `porthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvDeletePartition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvDeletePartition`(`partition` : `WHV_PARTITION_HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvDeleteTrigger; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvDeleteTrigger`(`partition` : `WHV_PARTITION_HANDLE`, `triggerhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvDeleteVirtualProcessor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvDeleteVirtualProcessor`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvDeleteVpciDevice; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvDeleteVpciDevice`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvemulation.dll, ABI=system, export=WHvEmulatorCreateEmulator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvEmulatorCreateEmulator`(`callbacks` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_EMULATOR_CALLBACKS`>?, `emulator` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvemulation.dll, ABI=system, export=WHvEmulatorDestroyEmulator; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvEmulatorDestroyEmulator`(`emulator` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvemulation.dll, ABI=system, export=WHvEmulatorTryIoEmulation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvEmulatorTryIoEmulation`(`emulator` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_VP_EXIT_CONTEXT`>?, `ioinstructioncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_X64_IO_PORT_ACCESS_CONTEXT`>?, `emulatorreturnstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_EMULATOR_STATUS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvemulation.dll, ABI=system, export=WHvEmulatorTryMmioEmulation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvEmulatorTryMmioEmulation`(`emulator` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `vpcontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_VP_EXIT_CONTEXT`>?, `mmioinstructioncontext` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_MEMORY_ACCESS_CONTEXT`>?, `emulatorreturnstatus` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_EMULATOR_STATUS`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetCapability; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetCapability`(`capabilitycode` : `WHV_CAPABILITY_CODE`, `capabilitybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `capabilitybuffersizeinbytes` : UInt, `writtensizeinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetInterruptTargetVpSet; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetInterruptTargetVpSet`(`partition` : `WHV_PARTITION_HANDLE`, `destination` : ULong, `destinationmode` : `WHV_INTERRUPT_DESTINATION_MODE`, `targetvps` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `vpcount` : UInt, `targetvpcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetPartitionCounters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetPartitionCounters`(`partition` : `WHV_PARTITION_HANDLE`, `counterset` : `WHV_PARTITION_COUNTER_SET`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersizeinbytes` : UInt, `byteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetPartitionProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetPartitionProperty`(`partition` : `WHV_PARTITION_HANDLE`, `propertycode` : `WHV_PARTITION_PROPERTY_CODE`, `propertybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertybuffersizeinbytes` : UInt, `writtensizeinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVirtualProcessorCounters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVirtualProcessorCounters`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `counterset` : `WHV_PROCESSOR_COUNTER_SET`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersizeinbytes` : UInt, `byteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVirtualProcessorCpuidOutput; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVirtualProcessorCpuidOutput`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `eax` : UInt, `ecx` : UInt, `cpuidoutput` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_CPUID_OUTPUT`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVirtualProcessorInterruptControllerState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVirtualProcessorInterruptControllerState`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `state` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `statesize` : UInt, `writtensize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVirtualProcessorInterruptControllerState2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVirtualProcessorInterruptControllerState2`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `state` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `statesize` : UInt, `writtensize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVirtualProcessorRegisters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVirtualProcessorRegisters`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `registernames` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_REGISTER_NAME`>?, `registercount` : UInt, `registervalues` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_REGISTER_VALUE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVirtualProcessorState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVirtualProcessorState`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `statetype` : `WHV_VIRTUAL_PROCESSOR_STATE_TYPE`, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersizeinbytes` : UInt, `byteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVirtualProcessorXsaveState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVirtualProcessorXsaveState`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersizeinbytes` : UInt, `byteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVpciDeviceInterruptTarget; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVpciDeviceInterruptTarget`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `index` : UInt, `multimessagenumber` : UInt, `target` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_VPCI_INTERRUPT_TARGET`>?, `targetsizeinbytes` : UInt, `byteswritten` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVpciDeviceNotification; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVpciDeviceNotification`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `notification` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_VPCI_DEVICE_NOTIFICATION`>?, `notificationsizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvGetVpciDeviceProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvGetVpciDeviceProperty`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `propertycode` : `WHV_VPCI_DEVICE_PROPERTY_CODE`, `propertybuffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertybuffersizeinbytes` : UInt, `writtensizeinbytes` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvMapGpaRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvMapGpaRange`(`partition` : `WHV_PARTITION_HANDLE`, `sourceaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `guestaddress` : ULong, `sizeinbytes` : ULong, `flags` : `WHV_MAP_GPA_RANGE_FLAGS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvMapGpaRange2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvMapGpaRange2`(`partition` : `WHV_PARTITION_HANDLE`, `process` : `super`.`super`.`Foundation`.`HANDLE`, `sourceaddress` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `guestaddress` : ULong, `sizeinbytes` : ULong, `flags` : `WHV_MAP_GPA_RANGE_FLAGS`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvMapVpciDeviceInterrupt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvMapVpciDeviceInterrupt`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `index` : UInt, `messagecount` : UInt, `target` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_VPCI_INTERRUPT_TARGET`>?, `msiaddress` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `msidata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvMapVpciDeviceMmioRanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvMapVpciDeviceMmioRanges`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `mappingcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `mappings` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`WHV_VPCI_MMIO_MAPPING`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvPostVirtualProcessorSynicMessage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvPostVirtualProcessorSynicMessage`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `sintindex` : UInt, `message` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `messagesizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvQueryGpaRangeDirtyBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvQueryGpaRangeDirtyBitmap`(`partition` : `WHV_PARTITION_HANDLE`, `guestaddress` : ULong, `rangesizeinbytes` : ULong, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `bitmapsizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvReadGpaRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvReadGpaRange`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `guestaddress` : ULong, `controls` : `WHV_ACCESS_GPA_CONTROLS`, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datasizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvReadVpciDeviceRegister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvReadVpciDeviceRegister`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `register` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_VPCI_DEVICE_REGISTER`>?, `data` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvRegisterPartitionDoorbellEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvRegisterPartitionDoorbellEvent`(`partition` : `WHV_PARTITION_HANDLE`, `matchdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_DOORBELL_MATCH_DATA`>?, `eventhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvRequestInterrupt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvRequestInterrupt`(`partition` : `WHV_PARTITION_HANDLE`, `interrupt` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_INTERRUPT_CONTROL`>?, `interruptcontrolsize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvRequestVpciDeviceInterrupt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvRequestVpciDeviceInterrupt`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `msiaddress` : ULong, `msidata` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvResetPartition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvResetPartition`(`partition` : `WHV_PARTITION_HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvResumePartitionTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvResumePartitionTime`(`partition` : `WHV_PARTITION_HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvRetargetVpciDeviceInterrupt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvRetargetVpciDeviceInterrupt`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `msiaddress` : ULong, `msidata` : UInt, `target` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_VPCI_INTERRUPT_TARGET`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvRunVirtualProcessor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvRunVirtualProcessor`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `exitcontext` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `exitcontextsizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSetNotificationPortProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSetNotificationPortProperty`(`partition` : `WHV_PARTITION_HANDLE`, `porthandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertycode` : `WHV_NOTIFICATION_PORT_PROPERTY_CODE`, `propertyvalue` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSetPartitionProperty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSetPartitionProperty`(`partition` : `WHV_PARTITION_HANDLE`, `propertycode` : `WHV_PARTITION_PROPERTY_CODE`, `propertybuffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `propertybuffersizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSetVirtualProcessorInterruptControllerState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSetVirtualProcessorInterruptControllerState`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `state` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `statesize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSetVirtualProcessorInterruptControllerState2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSetVirtualProcessorInterruptControllerState2`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `state` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `statesize` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSetVirtualProcessorRegisters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSetVirtualProcessorRegisters`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `registernames` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_REGISTER_NAME`>?, `registercount` : UInt, `registervalues` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_REGISTER_VALUE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSetVirtualProcessorState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSetVirtualProcessorState`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `statetype` : `WHV_VIRTUAL_PROCESSOR_STATE_TYPE`, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSetVirtualProcessorXsaveState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSetVirtualProcessorXsaveState`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `buffer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `buffersizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSetVpciDevicePowerState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Power")]
public external fun `WHvSetVpciDevicePowerState`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `powerstate` : `super`.`Power`.`DEVICE_POWER_STATE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSetupPartition; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSetupPartition`(`partition` : `WHV_PARTITION_HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSignalVirtualProcessorSynicEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSignalVirtualProcessorSynicEvent`(`partition` : `WHV_PARTITION_HANDLE`, `synicevent` : `WHV_SYNIC_EVENT_PARAMETERS`, `newlysignaled` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvStartPartitionMigration; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvStartPartitionMigration`(`partition` : `WHV_PARTITION_HANDLE`, `migrationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvSuspendPartitionTime; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvSuspendPartitionTime`(`partition` : `WHV_PARTITION_HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvTranslateGva; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvTranslateGva`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `gva` : ULong, `translateflags` : `WHV_TRANSLATE_GVA_FLAGS`, `translationresult` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_TRANSLATE_GVA_RESULT`>?, `gpa` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvUnmapGpaRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvUnmapGpaRange`(`partition` : `WHV_PARTITION_HANDLE`, `guestaddress` : ULong, `sizeinbytes` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvUnmapVpciDeviceInterrupt; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvUnmapVpciDeviceInterrupt`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `index` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvUnmapVpciDeviceMmioRanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvUnmapVpciDeviceMmioRanges`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvUnregisterPartitionDoorbellEvent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvUnregisterPartitionDoorbellEvent`(`partition` : `WHV_PARTITION_HANDLE`, `matchdata` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_DOORBELL_MATCH_DATA`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvUpdateTriggerParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvUpdateTriggerParameters`(`partition` : `WHV_PARTITION_HANDLE`, `parameters` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_TRIGGER_PARAMETERS`>?, `triggerhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvWriteGpaRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvWriteGpaRange`(`partition` : `WHV_PARTITION_HANDLE`, `vpindex` : UInt, `guestaddress` : ULong, `controls` : `WHV_ACCESS_GPA_CONTROLS`, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `datasizeinbytes` : UInt) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=winhvplatform.dll, ABI=system, export=WHvWriteVpciDeviceRegister; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `WHvWriteVpciDeviceRegister`(`partition` : `WHV_PARTITION_HANDLE`, `logicaldeviceid` : ULong, `register` : /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_VPCI_DEVICE_REGISTER`>?, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
public const val `ARM64_RegisterActlrEl1`: `REGISTER_ID` = 145;
public const val `ARM64_RegisterAmairEl1`: `REGISTER_ID` = 148;
public const val `ARM64_RegisterCntkctlEl1`: `REGISTER_ID` = 155;
public const val `ARM64_RegisterCntvCtlEl0`: `REGISTER_ID` = 157;
public const val `ARM64_RegisterCntvCvalEl0`: `REGISTER_ID` = 156;
public const val `ARM64_RegisterContextIdrEl1`: `REGISTER_ID` = 152;
public const val `ARM64_RegisterCpacrEl1`: `REGISTER_ID` = 153;
public const val `ARM64_RegisterCpsr`: `REGISTER_ID` = 101;
public const val `ARM64_RegisterCsselrEl1`: `REGISTER_ID` = 154;
public const val `ARM64_RegisterElrEl1`: `REGISTER_ID` = 140;
public const val `ARM64_RegisterEsrEl1`: `REGISTER_ID` = 136;
public const val `ARM64_RegisterFarEl1`: `REGISTER_ID` = 138;
public const val `ARM64_RegisterFpControl`: `REGISTER_ID` = 135;
public const val `ARM64_RegisterFpStatus`: `REGISTER_ID` = 134;
public const val `ARM64_RegisterMairEl1`: `REGISTER_ID` = 147;
public const val `ARM64_RegisterMax`: `REGISTER_ID` = 158;
public const val `ARM64_RegisterParEl1`: `REGISTER_ID` = 139;
public const val `ARM64_RegisterPc`: `REGISTER_ID` = 98;
public const val `ARM64_RegisterQ0`: `REGISTER_ID` = 102;
public const val `ARM64_RegisterQ1`: `REGISTER_ID` = 103;
public const val `ARM64_RegisterQ10`: `REGISTER_ID` = 112;
public const val `ARM64_RegisterQ11`: `REGISTER_ID` = 113;
public const val `ARM64_RegisterQ12`: `REGISTER_ID` = 114;
public const val `ARM64_RegisterQ13`: `REGISTER_ID` = 115;
public const val `ARM64_RegisterQ14`: `REGISTER_ID` = 116;
public const val `ARM64_RegisterQ15`: `REGISTER_ID` = 117;
public const val `ARM64_RegisterQ16`: `REGISTER_ID` = 118;
public const val `ARM64_RegisterQ17`: `REGISTER_ID` = 119;
public const val `ARM64_RegisterQ18`: `REGISTER_ID` = 120;
public const val `ARM64_RegisterQ19`: `REGISTER_ID` = 121;
public const val `ARM64_RegisterQ2`: `REGISTER_ID` = 104;
public const val `ARM64_RegisterQ20`: `REGISTER_ID` = 122;
public const val `ARM64_RegisterQ21`: `REGISTER_ID` = 123;
public const val `ARM64_RegisterQ22`: `REGISTER_ID` = 124;
public const val `ARM64_RegisterQ23`: `REGISTER_ID` = 125;
public const val `ARM64_RegisterQ24`: `REGISTER_ID` = 126;
public const val `ARM64_RegisterQ25`: `REGISTER_ID` = 127;
public const val `ARM64_RegisterQ26`: `REGISTER_ID` = 128;
public const val `ARM64_RegisterQ27`: `REGISTER_ID` = 129;
public const val `ARM64_RegisterQ28`: `REGISTER_ID` = 130;
public const val `ARM64_RegisterQ29`: `REGISTER_ID` = 131;
public const val `ARM64_RegisterQ3`: `REGISTER_ID` = 105;
public const val `ARM64_RegisterQ30`: `REGISTER_ID` = 132;
public const val `ARM64_RegisterQ31`: `REGISTER_ID` = 133;
public const val `ARM64_RegisterQ4`: `REGISTER_ID` = 106;
public const val `ARM64_RegisterQ5`: `REGISTER_ID` = 107;
public const val `ARM64_RegisterQ6`: `REGISTER_ID` = 108;
public const val `ARM64_RegisterQ7`: `REGISTER_ID` = 109;
public const val `ARM64_RegisterQ8`: `REGISTER_ID` = 110;
public const val `ARM64_RegisterQ9`: `REGISTER_ID` = 111;
public const val `ARM64_RegisterSctlrEl1`: `REGISTER_ID` = 144;
public const val `ARM64_RegisterSpEl0`: `REGISTER_ID` = 99;
public const val `ARM64_RegisterSpEl1`: `REGISTER_ID` = 100;
public const val `ARM64_RegisterSpsrEl1`: `REGISTER_ID` = 137;
public const val `ARM64_RegisterTcrEl1`: `REGISTER_ID` = 146;
public const val `ARM64_RegisterTpidrEl0`: `REGISTER_ID` = 149;
public const val `ARM64_RegisterTpidrEl1`: `REGISTER_ID` = 151;
public const val `ARM64_RegisterTpidrroEl0`: `REGISTER_ID` = 150;
public const val `ARM64_RegisterTtbr0El1`: `REGISTER_ID` = 141;
public const val `ARM64_RegisterTtbr1El1`: `REGISTER_ID` = 142;
public const val `ARM64_RegisterVbarEl1`: `REGISTER_ID` = 143;
public const val `ARM64_RegisterX0`: `REGISTER_ID` = 67;
public const val `ARM64_RegisterX1`: `REGISTER_ID` = 68;
public const val `ARM64_RegisterX10`: `REGISTER_ID` = 77;
public const val `ARM64_RegisterX11`: `REGISTER_ID` = 78;
public const val `ARM64_RegisterX12`: `REGISTER_ID` = 79;
public const val `ARM64_RegisterX13`: `REGISTER_ID` = 80;
public const val `ARM64_RegisterX14`: `REGISTER_ID` = 81;
public const val `ARM64_RegisterX15`: `REGISTER_ID` = 82;
public const val `ARM64_RegisterX16`: `REGISTER_ID` = 83;
public const val `ARM64_RegisterX17`: `REGISTER_ID` = 84;
public const val `ARM64_RegisterX18`: `REGISTER_ID` = 85;
public const val `ARM64_RegisterX19`: `REGISTER_ID` = 86;
public const val `ARM64_RegisterX2`: `REGISTER_ID` = 69;
public const val `ARM64_RegisterX20`: `REGISTER_ID` = 87;
public const val `ARM64_RegisterX21`: `REGISTER_ID` = 88;
public const val `ARM64_RegisterX22`: `REGISTER_ID` = 89;
public const val `ARM64_RegisterX23`: `REGISTER_ID` = 90;
public const val `ARM64_RegisterX24`: `REGISTER_ID` = 91;
public const val `ARM64_RegisterX25`: `REGISTER_ID` = 92;
public const val `ARM64_RegisterX26`: `REGISTER_ID` = 93;
public const val `ARM64_RegisterX27`: `REGISTER_ID` = 94;
public const val `ARM64_RegisterX28`: `REGISTER_ID` = 95;
public const val `ARM64_RegisterX3`: `REGISTER_ID` = 70;
public const val `ARM64_RegisterX4`: `REGISTER_ID` = 71;
public const val `ARM64_RegisterX5`: `REGISTER_ID` = 72;
public const val `ARM64_RegisterX6`: `REGISTER_ID` = 73;
public const val `ARM64_RegisterX7`: `REGISTER_ID` = 74;
public const val `ARM64_RegisterX8`: `REGISTER_ID` = 75;
public const val `ARM64_RegisterX9`: `REGISTER_ID` = 76;
public const val `ARM64_RegisterXFp`: `REGISTER_ID` = 96;
public const val `ARM64_RegisterXLr`: `REGISTER_ID` = 97;
public const val `Arch_Armv8`: `VIRTUAL_PROCESSOR_ARCH` = 3;
public const val `Arch_Unknown`: `VIRTUAL_PROCESSOR_ARCH` = 0;
public const val `Arch_x64`: `VIRTUAL_PROCESSOR_ARCH` = 2;
public const val `Arch_x86`: `VIRTUAL_PROCESSOR_ARCH` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DOS_IMAGE_INFO` (
    public var `PdbName`: `windows_sys`.`core`.`PCSTR`,
    public var `ImageBaseAddress`: ULong,
    public var `ImageSize`: UInt,
    public var `Timestamp`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DOS_IMAGE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DOS_IMAGE_INFO`.Companion.`default`() : `DOS_IMAGE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `FOUND_IMAGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`DOS_IMAGE_INFO`>?) -> `windows_sys`.`core`.`BOOL`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GPA_MEMORY_CHUNK` (
    public var `GuestPhysicalStartPageIndex`: ULong,
    public var `PageCount`: ULong,
)
// UNSUPPORTED Rust 246:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union GUEST_OS_INFO {
//     pub AsUINT64: u64,
//     pub ClosedSource: GUEST_OS_INFO_0,
//     pub OpenSource: GUEST_OS_INFO_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `GUEST_OS_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `GUEST_OS_INFO`.Companion.`default`() : `GUEST_OS_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GUEST_OS_INFO_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GUEST_OS_INFO_1` (
    public var `_bitfield`: ULong,
)
public typealias `GUEST_OS_MICROSOFT_IDS` = Int;
public typealias `GUEST_OS_OPENSOURCE_IDS` = Int;
public typealias `GUEST_OS_VENDOR` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`windows_sys`.`core`.`PCSTR`) -> Unit>>>;
// UNSUPPORTED Rust 272:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const GUID_DEVINTERFACE_VM_GENCOUNTER: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3ff2c92b_6598_4e60_8e1c_0ccf4927e319);

public const val `GuestOsMicrosoftMSDOS`: `GUEST_OS_MICROSOFT_IDS` = 1;
public const val `GuestOsMicrosoftUndefined`: `GUEST_OS_MICROSOFT_IDS` = 0;
public const val `GuestOsMicrosoftWindows3x`: `GUEST_OS_MICROSOFT_IDS` = 2;
public const val `GuestOsMicrosoftWindows9x`: `GUEST_OS_MICROSOFT_IDS` = 3;
public const val `GuestOsMicrosoftWindowsCE`: `GUEST_OS_MICROSOFT_IDS` = 5;
public const val `GuestOsMicrosoftWindowsNT`: `GUEST_OS_MICROSOFT_IDS` = 4;
public const val `GuestOsOpenSourceFreeBSD`: `GUEST_OS_OPENSOURCE_IDS` = 2;
public const val `GuestOsOpenSourceIllumos`: `GUEST_OS_OPENSOURCE_IDS` = 4;
public const val `GuestOsOpenSourceLinux`: `GUEST_OS_OPENSOURCE_IDS` = 1;
public const val `GuestOsOpenSourceUndefined`: `GUEST_OS_OPENSOURCE_IDS` = 0;
public const val `GuestOsOpenSourceXen`: `GUEST_OS_OPENSOURCE_IDS` = 3;
public const val `GuestOsVendorHPE`: `GUEST_OS_VENDOR` = 2;
public const val `GuestOsVendorLANCOM`: `GUEST_OS_VENDOR` = 512;
public const val `GuestOsVendorMicrosoft`: `GUEST_OS_VENDOR` = 1;
public const val `GuestOsVendorUndefined`: `GUEST_OS_VENDOR` = 0;
public typealias `HDV_DEVICE_HOST_FLAGS` = Int;
public typealias `HDV_DEVICE_TYPE` = Int;
public typealias `HDV_DOORBELL_FLAGS` = Int;
public const val `HDV_DOORBELL_FLAG_TRIGGER_ANY_VALUE`: `HDV_DOORBELL_FLAGS` = -2147483648;
public const val `HDV_DOORBELL_FLAG_TRIGGER_SIZE_ANY`: `HDV_DOORBELL_FLAGS` = 0;
public const val `HDV_DOORBELL_FLAG_TRIGGER_SIZE_BYTE`: `HDV_DOORBELL_FLAGS` = 1;
public const val `HDV_DOORBELL_FLAG_TRIGGER_SIZE_DWORD`: `HDV_DOORBELL_FLAGS` = 3;
public const val `HDV_DOORBELL_FLAG_TRIGGER_SIZE_QWORD`: `HDV_DOORBELL_FLAGS` = 4;
public const val `HDV_DOORBELL_FLAG_TRIGGER_SIZE_WORD`: `HDV_DOORBELL_FLAGS` = 2;
public typealias `HDV_MMIO_MAPPING_FLAGS` = Int;
public const val `HDV_PCI_BAR0`: `HDV_PCI_BAR_SELECTOR` = 0;
public const val `HDV_PCI_BAR1`: `HDV_PCI_BAR_SELECTOR` = 1;
public const val `HDV_PCI_BAR2`: `HDV_PCI_BAR_SELECTOR` = 2;
public const val `HDV_PCI_BAR3`: `HDV_PCI_BAR_SELECTOR` = 3;
public const val `HDV_PCI_BAR4`: `HDV_PCI_BAR_SELECTOR` = 4;
public const val `HDV_PCI_BAR5`: `HDV_PCI_BAR_SELECTOR` = 5;
public const val `HDV_PCI_BAR_COUNT`: UInt = 6u;
public typealias `HDV_PCI_BAR_SELECTOR` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_DEVICE_GET_DETAILS` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`HDV_PCI_PNP_ID`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_DEVICE_INITIALIZE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HDV_PCI_DEVICE_INTERFACE` (
    public var `Version`: `HDV_PCI_INTERFACE_VERSION`,
    public var `Initialize`: `HDV_PCI_DEVICE_INITIALIZE`,
    public var `Teardown`: `HDV_PCI_DEVICE_TEARDOWN`,
    public var `SetConfiguration`: `HDV_PCI_DEVICE_SET_CONFIGURATION`,
    public var `GetDetails`: `HDV_PCI_DEVICE_GET_DETAILS`,
    public var `Start`: `HDV_PCI_DEVICE_START`,
    public var `Stop`: `HDV_PCI_DEVICE_STOP`,
    public var `ReadConfigSpace`: `HDV_PCI_READ_CONFIG_SPACE`,
    public var `WriteConfigSpace`: `HDV_PCI_WRITE_CONFIG_SPACE`,
    public var `ReadInterceptedMemory`: `HDV_PCI_READ_INTERCEPTED_MEMORY`,
    public var `WriteInterceptedMemory`: `HDV_PCI_WRITE_INTERCEPTED_MEMORY`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_DEVICE_SET_CONFIGURATION` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PCWSTR`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_DEVICE_START` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_DEVICE_STOP` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_DEVICE_TEARDOWN` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> Unit>>>;
public typealias `HDV_PCI_INTERFACE_VERSION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HDV_PCI_PNP_ID` (
    public var `VendorID`: UShort,
    public var `DeviceID`: UShort,
    public var `RevisionID`: UByte,
    public var `ProgIf`: UByte,
    public var `SubClass`: UByte,
    public var `BaseClass`: UByte,
    public var `SubVendorID`: UShort,
    public var `SubSystemID`: UShort,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_READ_CONFIG_SPACE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_READ_INTERCEPTED_MEMORY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `HDV_PCI_BAR_SELECTOR`, ULong, ULong, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_WRITE_CONFIG_SPACE` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, UInt, UInt) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HDV_PCI_WRITE_INTERCEPTED_MEMORY` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `HDV_PCI_BAR_SELECTOR`, ULong, ULong, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public const val `HVSOCKET_ADDRESS_FLAG_PASSTHRU`: UInt = 1u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HVSOCKET_ADDRESS_INFO` (
    public var `SystemId`: `windows_sys`.`core`.`GUID`,
    public var `VirtualMachineId`: `windows_sys`.`core`.`GUID`,
    public var `SiloId`: `windows_sys`.`core`.`GUID`,
    public var `Flags`: UInt,
)
public const val `HVSOCKET_CONNECTED_SUSPEND`: UInt = 4u;
public const val `HVSOCKET_CONNECT_TIMEOUT`: UInt = 1u;
public const val `HVSOCKET_CONNECT_TIMEOUT_MAX`: UInt = 300000u;
public const val `HVSOCKET_HIGH_VTL`: UInt = 8u;
// UNSUPPORTED Rust 357:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const HV_GUID_BROADCAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xffffffff_ffff_ffff_ffff_ffffffffffff);

// UNSUPPORTED Rust 358:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const HV_GUID_CHILDREN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90db8b89_0d35_4f79_8ce9_49ea0ac8b7cd);

// UNSUPPORTED Rust 359:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const HV_GUID_LOOPBACK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe0e16197_dd56_4a10_9195_5ee7a155a838);

// UNSUPPORTED Rust 360:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const HV_GUID_PARENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa42e7cda_d03f_480c_9cc2_a4de20abb878);

// UNSUPPORTED Rust 361:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const HV_GUID_SILOHOST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36bd0c5c_7276_4223_88ba_7d03b654c568);

// UNSUPPORTED Rust 362:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const HV_GUID_VSOCK_TEMPLATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_facb_11e6_bd58_64006a7986d3);

// UNSUPPORTED Rust 363:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: constant expression has no syntax candidate rule
// pub const HV_GUID_ZERO: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_0000_0000_0000_000000000000);

public const val `HV_PROTOCOL_RAW`: UInt = 1u;
public const val `HdvDeviceHostFlagInitializeComSecurity`: `HDV_DEVICE_HOST_FLAGS` = 1;
public const val `HdvDeviceHostFlagNone`: `HDV_DEVICE_HOST_FLAGS` = 0;
public const val `HdvDeviceTypePCI`: `HDV_DEVICE_TYPE` = 1;
public const val `HdvDeviceTypeUndefined`: `HDV_DEVICE_TYPE` = 0;
public const val `HdvMmioMappingFlagExecutable`: `HDV_MMIO_MAPPING_FLAGS` = 2;
public const val `HdvMmioMappingFlagNone`: `HDV_MMIO_MAPPING_FLAGS` = 0;
public const val `HdvMmioMappingFlagWriteable`: `HDV_MMIO_MAPPING_FLAGS` = 1;
public const val `HdvPciDeviceInterfaceVersion1`: `HDV_PCI_INTERFACE_VERSION` = 1;
public const val `HdvPciDeviceInterfaceVersionInvalid`: `HDV_PCI_INTERFACE_VERSION` = 0;
public const val `IOCTL_VMGENCOUNTER_READ`: UInt = 3325956u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MODULE_INFO` (
    public var `ProcessImageName`: `windows_sys`.`core`.`PCSTR`,
    public var `Image`: `DOS_IMAGE_INFO`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `MODULE_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `MODULE_INFO`.Companion.`default`() : `MODULE_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `PAGING_MODE` = Int;
public const val `Paging_32Bit`: `PAGING_MODE` = 2;
public const val `Paging_Armv8`: `PAGING_MODE` = 5;
public const val `Paging_Invalid`: `PAGING_MODE` = 0;
public const val `Paging_Long`: `PAGING_MODE` = 4;
public const val `Paging_NonPaged`: `PAGING_MODE` = 1;
public const val `Paging_Pae`: `PAGING_MODE` = 3;
public const val `ProcessorVendor_Amd`: `VIRTUAL_PROCESSOR_VENDOR` = 1;
public const val `ProcessorVendor_Arm`: `VIRTUAL_PROCESSOR_VENDOR` = 4;
public const val `ProcessorVendor_Hygon`: `VIRTUAL_PROCESSOR_VENDOR` = 3;
public const val `ProcessorVendor_Intel`: `VIRTUAL_PROCESSOR_VENDOR` = 2;
public const val `ProcessorVendor_Unknown`: `VIRTUAL_PROCESSOR_VENDOR` = 0;
public typealias `REGISTER_ID` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Networking_WinSock")]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SOCKADDR_HV` (
    public var `Family`: `super`.`super`.`Networking`.`WinSock`.`ADDRESS_FAMILY`,
    public var `Reserved`: UShort,
    public var `VmId`: `windows_sys`.`core`.`GUID`,
    public var `ServiceId`: `windows_sys`.`core`.`GUID`,
)
public typealias `VIRTUAL_PROCESSOR_ARCH` = Int;
// UNSUPPORTED Rust 409:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIRTUAL_PROCESSOR_REGISTER {
//     pub Reg64: u64,
//     pub Reg32: u32,
//     pub Reg16: u16,
//     pub Reg8: u8,
//     pub Reg128: VIRTUAL_PROCESSOR_REGISTER_0,
//     pub X64: VIRTUAL_PROCESSOR_REGISTER_1,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `VIRTUAL_PROCESSOR_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `VIRTUAL_PROCESSOR_REGISTER`.Companion.`default`() : `VIRTUAL_PROCESSOR_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUAL_PROCESSOR_REGISTER_0` (
    public var `Low64`: ULong,
    public var `High64`: ULong,
)
// UNSUPPORTED Rust 430:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIRTUAL_PROCESSOR_REGISTER_1 {
//     pub Segment: VIRTUAL_PROCESSOR_REGISTER_1_0,
//     pub Table: VIRTUAL_PROCESSOR_REGISTER_1_1,
//     pub FpControlStatus: VIRTUAL_PROCESSOR_REGISTER_1_2,
//     pub XmmControlStatus: VIRTUAL_PROCESSOR_REGISTER_1_3,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `VIRTUAL_PROCESSOR_REGISTER_1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `VIRTUAL_PROCESSOR_REGISTER_1`.Companion.`default`() : `VIRTUAL_PROCESSOR_REGISTER_1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIRTUAL_PROCESSOR_REGISTER_1_2` (
    public var `FpControl`: UShort,
    public var `FpStatus`: UShort,
    public var `FpTag`: UByte,
    public var `Reserved`: UByte,
    public var `LastFpOp`: UShort,
    public var `Anonymous`: `VIRTUAL_PROCESSOR_REGISTER_1_2_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `VIRTUAL_PROCESSOR_REGISTER_1_2`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `VIRTUAL_PROCESSOR_REGISTER_1_2`.Companion.`default`() : `VIRTUAL_PROCESSOR_REGISTER_1_2` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 458:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIRTUAL_PROCESSOR_REGISTER_1_2_0 {
//     pub LastFpRip: u64,
//     pub Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_2_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `VIRTUAL_PROCESSOR_REGISTER_1_2_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `VIRTUAL_PROCESSOR_REGISTER_1_2_0`.Companion.`default`() : `VIRTUAL_PROCESSOR_REGISTER_1_2_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUAL_PROCESSOR_REGISTER_1_2_0_0` (
    public var `LastFpEip`: UInt,
    public var `LastFpCs`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIRTUAL_PROCESSOR_REGISTER_1_0` (
    public var `Base`: ULong,
    public var `Limit`: UInt,
    public var `Selector`: UShort,
    public var `Anonymous`: `VIRTUAL_PROCESSOR_REGISTER_1_0_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `VIRTUAL_PROCESSOR_REGISTER_1_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `VIRTUAL_PROCESSOR_REGISTER_1_0`.Companion.`default`() : `VIRTUAL_PROCESSOR_REGISTER_1_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 488:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIRTUAL_PROCESSOR_REGISTER_1_0_0 {
//     pub Attributes: u16,
//     pub Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_0_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `VIRTUAL_PROCESSOR_REGISTER_1_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `VIRTUAL_PROCESSOR_REGISTER_1_0_0`.Companion.`default`() : `VIRTUAL_PROCESSOR_REGISTER_1_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUAL_PROCESSOR_REGISTER_1_0_0_0` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUAL_PROCESSOR_REGISTER_1_1` (
    public var `Limit`: UShort,
    public var `Base`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `VIRTUAL_PROCESSOR_REGISTER_1_3` (
    public var `Anonymous`: `VIRTUAL_PROCESSOR_REGISTER_1_3_0`,
    public var `XmmStatusControl`: UInt,
    public var `XmmStatusControlMask`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `VIRTUAL_PROCESSOR_REGISTER_1_3`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `VIRTUAL_PROCESSOR_REGISTER_1_3`.Companion.`default`() : `VIRTUAL_PROCESSOR_REGISTER_1_3` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 522:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIRTUAL_PROCESSOR_REGISTER_1_3_0 {
//     pub LastFpRdp: u64,
//     pub Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_3_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `VIRTUAL_PROCESSOR_REGISTER_1_3_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `VIRTUAL_PROCESSOR_REGISTER_1_3_0`.Companion.`default`() : `VIRTUAL_PROCESSOR_REGISTER_1_3_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VIRTUAL_PROCESSOR_REGISTER_1_3_0_0` (
    public var `LastFpDp`: UInt,
    public var `LastFpDs`: UShort,
)
public typealias `VIRTUAL_PROCESSOR_VENDOR` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `VM_GENCOUNTER` (
    public var `GenerationCount`: ULong,
    public var `GenerationCountHigh`: ULong,
)
// INTEGRATION REQUIRED: Rust windows_sys::core::w! is emitted as a call shape. Supply its source-faithful UTF-16 *const u16 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `VM_GENCOUNTER_SYMBOLIC_LINK_NAME`: `windows_sys`.`core`.`PCWSTR` = `windows_sys`.`core`.`w`("\\VmGenerationCounter");
// UNSUPPORTED Rust 547:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_ACCESS_GPA_CONTROLS {
//     pub AsUINT64: u64,
//     pub Anonymous: WHV_ACCESS_GPA_CONTROLS_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_ACCESS_GPA_CONTROLS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_ACCESS_GPA_CONTROLS`.Companion.`default`() : `WHV_ACCESS_GPA_CONTROLS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_ACCESS_GPA_CONTROLS_0` (
    public var `CacheType`: `WHV_CACHE_TYPE`,
    public var `Reserved`: UInt,
)
// UNSUPPORTED Rust 564:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_ADVISE_GPA_RANGE {
//     pub Populate: WHV_ADVISE_GPA_RANGE_POPULATE,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_ADVISE_GPA_RANGE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_ADVISE_GPA_RANGE`.Companion.`default`() : `WHV_ADVISE_GPA_RANGE` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WHV_ADVISE_GPA_RANGE_CODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_ADVISE_GPA_RANGE_POPULATE` (
    public var `Flags`: `WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS`,
    public var `AccessType`: `WHV_MEMORY_ACCESS_TYPE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_ADVISE_GPA_RANGE_POPULATE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_ADVISE_GPA_RANGE_POPULATE`.Companion.`default`() : `WHV_ADVISE_GPA_RANGE_POPULATE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 586:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS {
//     pub AsUINT32: u32,
//     pub Anonymous: WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS`.Companion.`default`() : `WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS_0` (
    public var `_bitfield`: UInt,
)
public typealias `WHV_ALLOCATE_VPCI_RESOURCE_FLAGS` = Int;
public const val `WHV_ANY_VP`: UInt = 4294967295u;
public typealias `WHV_CACHE_TYPE` = Int;
// UNSUPPORTED Rust 605:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_CAPABILITY {
//     pub HypervisorPresent: windows_sys::core::BOOL,
//     pub Features: WHV_CAPABILITY_FEATURES,
//     pub ExtendedVmExits: WHV_EXTENDED_VM_EXITS,
//     pub ProcessorVendor: WHV_PROCESSOR_VENDOR,
//     pub ProcessorFeatures: WHV_PROCESSOR_FEATURES,
//     pub SyntheticProcessorFeaturesBanks: WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS,
//     pub ProcessorXsaveFeatures: WHV_PROCESSOR_XSAVE_FEATURES,
//     pub ProcessorClFlushSize: u8,
//     pub ExceptionExitBitmap: u64,
//     pub X64MsrExitBitmap: WHV_X64_MSR_EXIT_BITMAP,
//     pub ProcessorClockFrequency: u64,
//     pub InterruptClockFrequency: u64,
//     pub ProcessorFeaturesBanks: WHV_PROCESSOR_FEATURES_BANKS,
//     pub GpaRangePopulateFlags: WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS,
//     pub ProcessorFrequencyCap: WHV_CAPABILITY_PROCESSOR_FREQUENCY_CAP,
//     pub ProcessorPerfmonFeatures: WHV_PROCESSOR_PERFMON_FEATURES,
//     pub SchedulerFeatures: WHV_SCHEDULER_FEATURES,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_CAPABILITY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_CAPABILITY`.Companion.`default`() : `WHV_CAPABILITY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WHV_CAPABILITY_CODE` = Int;
// UNSUPPORTED Rust 632:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_CAPABILITY_FEATURES {
//     pub Anonymous: WHV_CAPABILITY_FEATURES_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_CAPABILITY_FEATURES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_CAPABILITY_FEATURES`.Companion.`default`() : `WHV_CAPABILITY_FEATURES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_CAPABILITY_FEATURES_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_CAPABILITY_PROCESSOR_FREQUENCY_CAP` (
    public var `_bitfield`: UInt,
    public var `HighestFrequencyMhz`: UInt,
    public var `NominalFrequencyMhz`: UInt,
    public var `LowestFrequencyMhz`: UInt,
    public var `FrequencyStepMhz`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_CPUID_OUTPUT` (
    public var `Eax`: UInt,
    public var `Ebx`: UInt,
    public var `Ecx`: UInt,
    public var `Edx`: UInt,
)
public typealias `WHV_CREATE_VPCI_DEVICE_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_DOORBELL_MATCH_DATA` (
    public var `GuestAddress`: ULong,
    public var `Value`: ULong,
    public var `Length`: UInt,
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_EMULATOR_CALLBACKS` (
    public var `Size`: UInt,
    public var `Reserved`: UInt,
    public var `WHvEmulatorIoPortCallback`: `WHV_EMULATOR_IO_PORT_CALLBACK`,
    public var `WHvEmulatorMemoryCallback`: `WHV_EMULATOR_MEMORY_CALLBACK`,
    public var `WHvEmulatorGetVirtualProcessorRegisters`: `WHV_EMULATOR_GET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK`,
    public var `WHvEmulatorSetVirtualProcessorRegisters`: `WHV_EMULATOR_SET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK`,
    public var `WHvEmulatorTranslateGvaPage`: `WHV_EMULATOR_TRANSLATE_GVA_PAGE_CALLBACK`,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WHV_EMULATOR_GET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_REGISTER_NAME`>?, UInt, /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_REGISTER_VALUE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_EMULATOR_IO_ACCESS_INFO` (
    public var `Direction`: UByte,
    public var `Port`: UShort,
    public var `AccessSize`: UShort,
    public var `Data`: UInt,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WHV_EMULATOR_IO_PORT_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_EMULATOR_IO_ACCESS_INFO`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 8 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_EMULATOR_MEMORY_ACCESS_INFO` (
    public var `GpaAddress`: ULong,
    public var `Direction`: UByte,
    public var `AccessSize`: UByte,
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_EMULATOR_MEMORY_ACCESS_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_EMULATOR_MEMORY_ACCESS_INFO`.Companion.`default`() : `WHV_EMULATOR_MEMORY_ACCESS_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WHV_EMULATOR_MEMORY_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_EMULATOR_MEMORY_ACCESS_INFO`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WHV_EMULATOR_SET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_REGISTER_NAME`>?, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`WHV_REGISTER_VALUE`>?) -> `windows_sys`.`core`.`HRESULT`>>>;
// UNSUPPORTED Rust 710:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_EMULATOR_STATUS {
//     pub Anonymous: WHV_EMULATOR_STATUS_0,
//     pub AsUINT32: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_EMULATOR_STATUS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_EMULATOR_STATUS`.Companion.`default`() : `WHV_EMULATOR_STATUS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_EMULATOR_STATUS_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `WHV_EMULATOR_TRANSLATE_GVA_PAGE_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, ULong, `WHV_TRANSLATE_GVA_FLAGS`, /* Rust *mut */ kotlinx.cinterop.CPointer<`WHV_TRANSLATE_GVA_RESULT_CODE`>?, /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `windows_sys`.`core`.`HRESULT`>>>;
public typealias `WHV_EXCEPTION_TYPE` = Int;
// UNSUPPORTED Rust 728:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_EXTENDED_VM_EXITS {
//     pub Anonymous: WHV_EXTENDED_VM_EXITS_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_EXTENDED_VM_EXITS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_EXTENDED_VM_EXITS`.Companion.`default`() : `WHV_EXTENDED_VM_EXITS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_EXTENDED_VM_EXITS_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_HYPERCALL_CONTEXT` (
    public var `Rax`: ULong,
    public var `Rbx`: ULong,
    public var `Rcx`: ULong,
    public var `Rdx`: ULong,
    public var `R8`: ULong,
    public var `Rsi`: ULong,
    public var `Rdi`: ULong,
    public var `Reserved0`: ULong,
    public var `XmmRegisters`: Array<`WHV_UINT128`>,
    public var `Reserved1`: ULongArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_HYPERCALL_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_HYPERCALL_CONTEXT`.Companion.`default`() : `WHV_HYPERCALL_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WHV_HYPERCALL_CONTEXT_MAX_XMM_REGISTERS`: UInt = 6u;
// UNSUPPORTED Rust 764:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_INTERNAL_ACTIVITY_REGISTER {
//     pub Anonymous: WHV_INTERNAL_ACTIVITY_REGISTER_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_INTERNAL_ACTIVITY_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_INTERNAL_ACTIVITY_REGISTER`.Companion.`default`() : `WHV_INTERNAL_ACTIVITY_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_INTERNAL_ACTIVITY_REGISTER_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_INTERRUPT_CONTROL` (
    public var `_bitfield`: ULong,
    public var `Destination`: UInt,
    public var `Vector`: UInt,
)
public typealias `WHV_INTERRUPT_DESTINATION_MODE` = Int;
public typealias `WHV_INTERRUPT_TRIGGER_MODE` = Int;
public typealias `WHV_INTERRUPT_TYPE` = Int;
public typealias `WHV_MAP_GPA_RANGE_FLAGS` = Int;
public const val `WHV_MAX_DEVICE_ID_SIZE_IN_CHARS`: UInt = 200u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_MEMORY_ACCESS_CONTEXT` (
    public var `InstructionByteCount`: UByte,
    public var `Reserved`: UByteArray,
    public var `InstructionBytes`: UByteArray,
    public var `AccessInfo`: `WHV_MEMORY_ACCESS_INFO`,
    public var `Gpa`: ULong,
    public var `Gva`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_MEMORY_ACCESS_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_MEMORY_ACCESS_CONTEXT`.Companion.`default`() : `WHV_MEMORY_ACCESS_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 807:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_MEMORY_ACCESS_INFO {
//     pub Anonymous: WHV_MEMORY_ACCESS_INFO_0,
//     pub AsUINT32: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_MEMORY_ACCESS_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_MEMORY_ACCESS_INFO`.Companion.`default`() : `WHV_MEMORY_ACCESS_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_MEMORY_ACCESS_INFO_0` (
    public var `_bitfield`: UInt,
)
public typealias `WHV_MEMORY_ACCESS_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_MEMORY_RANGE_ENTRY` (
    public var `GuestAddress`: ULong,
    public var `SizeInBytes`: ULong,
)
public typealias `WHV_MSR_ACTION` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_MSR_ACTION_ENTRY` (
    public var `Index`: UInt,
    public var `ReadAction`: UByte,
    public var `WriteAction`: UByte,
    public var `Reserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_NOTIFICATION_PORT_PARAMETERS` (
    public var `NotificationPortType`: `WHV_NOTIFICATION_PORT_TYPE`,
    public var `Reserved`: UInt,
    public var `Anonymous`: `WHV_NOTIFICATION_PORT_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_NOTIFICATION_PORT_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_NOTIFICATION_PORT_PARAMETERS`.Companion.`default`() : `WHV_NOTIFICATION_PORT_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 851:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_NOTIFICATION_PORT_PARAMETERS_0 {
//     pub Doorbell: WHV_DOORBELL_MATCH_DATA,
//     pub Event: WHV_NOTIFICATION_PORT_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_NOTIFICATION_PORT_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_NOTIFICATION_PORT_PARAMETERS_0`.Companion.`default`() : `WHV_NOTIFICATION_PORT_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_NOTIFICATION_PORT_PARAMETERS_0_0` (
    public var `ConnectionId`: UInt,
)
public typealias `WHV_NOTIFICATION_PORT_PROPERTY_CODE` = Int;
public typealias `WHV_NOTIFICATION_PORT_TYPE` = Int;
public typealias `WHV_PARTITION_COUNTER_SET` = Int;
public typealias `WHV_PARTITION_HANDLE` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PARTITION_MEMORY_COUNTERS` (
    public var `Mapped4KPageCount`: ULong,
    public var `Mapped2MPageCount`: ULong,
    public var `Mapped1GPageCount`: ULong,
)
// UNSUPPORTED Rust 878:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PARTITION_PROPERTY {
//     pub ExtendedVmExits: WHV_EXTENDED_VM_EXITS,
//     pub ProcessorFeatures: WHV_PROCESSOR_FEATURES,
//     pub SyntheticProcessorFeaturesBanks: WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS,
//     pub ProcessorXsaveFeatures: WHV_PROCESSOR_XSAVE_FEATURES,
//     pub ProcessorClFlushSize: u8,
//     pub ProcessorCount: u32,
//     pub CpuidExitList: [u32; 1],
//     pub CpuidResultList: [WHV_X64_CPUID_RESULT; 1],
//     pub CpuidResultList2: [WHV_X64_CPUID_RESULT2; 1],
//     pub MsrActionList: [WHV_MSR_ACTION_ENTRY; 1],
//     pub UnimplementedMsrAction: WHV_MSR_ACTION,
//     pub ExceptionExitBitmap: u64,
//     pub LocalApicEmulationMode: WHV_X64_LOCAL_APIC_EMULATION_MODE,
//     pub SeparateSecurityDomain: windows_sys::core::BOOL,
//     pub NestedVirtualization: windows_sys::core::BOOL,
//     pub X64MsrExitBitmap: WHV_X64_MSR_EXIT_BITMAP,
//     pub ProcessorClockFrequency: u64,
//     pub InterruptClockFrequency: u64,
//     pub ApicRemoteRead: windows_sys::core::BOOL,
//     pub ProcessorFeaturesBanks: WHV_PROCESSOR_FEATURES_BANKS,
//     pub ReferenceTime: u64,
//     pub PrimaryNumaNode: u16,
//     pub CpuReserve: u32,
//     pub CpuCap: u32,
//     pub CpuWeight: u32,
//     pub CpuGroupId: u64,
//     pub ProcessorFrequencyCap: u32,
//     pub AllowDeviceAssignment: windows_sys::core::BOOL,
//     pub ProcessorPerfmonFeatures: WHV_PROCESSOR_PERFMON_FEATURES,
//     pub DisableSmt: windows_sys::core::BOOL,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_PARTITION_PROPERTY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_PARTITION_PROPERTY`.Companion.`default`() : `WHV_PARTITION_PROPERTY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WHV_PARTITION_PROPERTY_CODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_APIC_COUNTERS` (
    public var `MmioAccessCount`: ULong,
    public var `EoiAccessCount`: ULong,
    public var `TprAccessCount`: ULong,
    public var `SentIpiCount`: ULong,
    public var `SelfIpiCount`: ULong,
)
public typealias `WHV_PROCESSOR_COUNTER_SET` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_EVENT_COUNTERS` (
    public var `PageFaultCount`: ULong,
    public var `ExceptionCount`: ULong,
    public var `InterruptCount`: ULong,
)
// UNSUPPORTED Rust 935:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_FEATURES {
//     pub Anonymous: WHV_PROCESSOR_FEATURES_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_PROCESSOR_FEATURES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_PROCESSOR_FEATURES`.Companion.`default`() : `WHV_PROCESSOR_FEATURES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_FEATURES_0` (
    public var `_bitfield`: ULong,
)
// UNSUPPORTED Rust 951:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_FEATURES1 {
//     pub Anonymous: WHV_PROCESSOR_FEATURES1_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_PROCESSOR_FEATURES1`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_PROCESSOR_FEATURES1`.Companion.`default`() : `WHV_PROCESSOR_FEATURES1` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_FEATURES1_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_PROCESSOR_FEATURES_BANKS` (
    public var `BanksCount`: UInt,
    public var `Reserved0`: UInt,
    public var `Anonymous`: `WHV_PROCESSOR_FEATURES_BANKS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_PROCESSOR_FEATURES_BANKS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_PROCESSOR_FEATURES_BANKS`.Companion.`default`() : `WHV_PROCESSOR_FEATURES_BANKS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 979:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_FEATURES_BANKS_0 {
//     pub Anonymous: WHV_PROCESSOR_FEATURES_BANKS_0_0,
//     pub AsUINT64: [u64; 2],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_PROCESSOR_FEATURES_BANKS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_PROCESSOR_FEATURES_BANKS_0`.Companion.`default`() : `WHV_PROCESSOR_FEATURES_BANKS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_PROCESSOR_FEATURES_BANKS_0_0` (
    public var `Bank0`: `WHV_PROCESSOR_FEATURES`,
    public var `Bank1`: `WHV_PROCESSOR_FEATURES1`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_PROCESSOR_FEATURES_BANKS_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_PROCESSOR_FEATURES_BANKS_0_0`.Companion.`default`() : `WHV_PROCESSOR_FEATURES_BANKS_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WHV_PROCESSOR_FEATURES_BANKS_COUNT`: UInt = 2u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_INTERCEPT_COUNTER` (
    public var `Count`: ULong,
    public var `Time100ns`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_INTERCEPT_COUNTERS` (
    public var `PageInvalidations`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `ControlRegisterAccesses`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `IoInstructions`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `HaltInstructions`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `CpuidInstructions`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `MsrAccesses`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `OtherIntercepts`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `PendingInterrupts`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `EmulatedInstructions`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `DebugRegisterAccesses`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `PageFaultIntercepts`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `NestedPageFaultIntercepts`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `Hypercalls`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
    public var `RdpmcInstructions`: `WHV_PROCESSOR_INTERCEPT_COUNTER`,
)
// UNSUPPORTED Rust 1026:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_PERFMON_FEATURES {
//     pub Anonymous: WHV_PROCESSOR_PERFMON_FEATURES_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_PROCESSOR_PERFMON_FEATURES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_PROCESSOR_PERFMON_FEATURES`.Companion.`default`() : `WHV_PROCESSOR_PERFMON_FEATURES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_PERFMON_FEATURES_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_RUNTIME_COUNTERS` (
    public var `TotalRuntime100ns`: ULong,
    public var `HypervisorRuntime100ns`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_SYNTHETIC_FEATURES_COUNTERS` (
    public var `SyntheticInterruptsCount`: ULong,
    public var `LongSpinWaitHypercallsCount`: ULong,
    public var `OtherHypercallsCount`: ULong,
    public var `SyntheticInterruptHypercallsCount`: ULong,
    public var `VirtualInterruptHypercallsCount`: ULong,
    public var `VirtualMmuHypercallsCount`: ULong,
)
public typealias `WHV_PROCESSOR_VENDOR` = Int;
// UNSUPPORTED Rust 1059:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_XSAVE_FEATURES {
//     pub Anonymous: WHV_PROCESSOR_XSAVE_FEATURES_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_PROCESSOR_XSAVE_FEATURES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_PROCESSOR_XSAVE_FEATURES`.Companion.`default`() : `WHV_PROCESSOR_XSAVE_FEATURES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_PROCESSOR_XSAVE_FEATURES_0` (
    public var `_bitfield`: ULong,
)
public const val `WHV_READ_WRITE_GPA_RANGE_MAX_SIZE`: UInt = 16u;
public typealias `WHV_REGISTER_NAME` = Int;
// UNSUPPORTED Rust 1077:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_REGISTER_VALUE {
//     pub Reg128: WHV_UINT128,
//     pub Reg64: u64,
//     pub Reg32: u32,
//     pub Reg16: u16,
//     pub Reg8: u8,
//     pub Fp: WHV_X64_FP_REGISTER,
//     pub FpControlStatus: WHV_X64_FP_CONTROL_STATUS_REGISTER,
//     pub XmmControlStatus: WHV_X64_XMM_CONTROL_STATUS_REGISTER,
//     pub Segment: WHV_X64_SEGMENT_REGISTER,
//     pub Table: WHV_X64_TABLE_REGISTER,
//     pub InterruptState: WHV_X64_INTERRUPT_STATE_REGISTER,
//     pub PendingInterruption: WHV_X64_PENDING_INTERRUPTION_REGISTER,
//     pub DeliverabilityNotifications: WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER,
//     pub ExceptionEvent: WHV_X64_PENDING_EXCEPTION_EVENT,
//     pub ExtIntEvent: WHV_X64_PENDING_EXT_INT_EVENT,
//     pub InternalActivity: WHV_INTERNAL_ACTIVITY_REGISTER,
//     pub PendingDebugException: WHV_X64_PENDING_DEBUG_EXCEPTION,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_REGISTER_VALUE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_REGISTER_VALUE`.Companion.`default`() : `WHV_REGISTER_VALUE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_RUN_VP_CANCELED_CONTEXT` (
    public var `CancelReason`: `WHV_RUN_VP_CANCEL_REASON`,
)
public typealias `WHV_RUN_VP_CANCEL_REASON` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_RUN_VP_EXIT_CONTEXT` (
    public var `ExitReason`: `WHV_RUN_VP_EXIT_REASON`,
    public var `Reserved`: UInt,
    public var `VpContext`: `WHV_VP_EXIT_CONTEXT`,
    public var `Anonymous`: `WHV_RUN_VP_EXIT_CONTEXT_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_RUN_VP_EXIT_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_RUN_VP_EXIT_CONTEXT`.Companion.`default`() : `WHV_RUN_VP_EXIT_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1122:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_RUN_VP_EXIT_CONTEXT_0 {
//     pub MemoryAccess: WHV_MEMORY_ACCESS_CONTEXT,
//     pub IoPortAccess: WHV_X64_IO_PORT_ACCESS_CONTEXT,
//     pub MsrAccess: WHV_X64_MSR_ACCESS_CONTEXT,
//     pub CpuidAccess: WHV_X64_CPUID_ACCESS_CONTEXT,
//     pub VpException: WHV_VP_EXCEPTION_CONTEXT,
//     pub InterruptWindow: WHV_X64_INTERRUPTION_DELIVERABLE_CONTEXT,
//     pub UnsupportedFeature: WHV_X64_UNSUPPORTED_FEATURE_CONTEXT,
//     pub CancelReason: WHV_RUN_VP_CANCELED_CONTEXT,
//     pub ApicEoi: WHV_X64_APIC_EOI_CONTEXT,
//     pub ReadTsc: WHV_X64_RDTSC_CONTEXT,
//     pub ApicSmi: WHV_X64_APIC_SMI_CONTEXT,
//     pub Hypercall: WHV_HYPERCALL_CONTEXT,
//     pub ApicInitSipi: WHV_X64_APIC_INIT_SIPI_CONTEXT,
//     pub ApicWrite: WHV_X64_APIC_WRITE_CONTEXT,
//     pub SynicSintDeliverable: WHV_SYNIC_SINT_DELIVERABLE_CONTEXT,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_RUN_VP_EXIT_CONTEXT_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_RUN_VP_EXIT_CONTEXT_0`.Companion.`default`() : `WHV_RUN_VP_EXIT_CONTEXT_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WHV_RUN_VP_EXIT_REASON` = Int;
// UNSUPPORTED Rust 1147:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_SCHEDULER_FEATURES {
//     pub Anonymous: WHV_SCHEDULER_FEATURES_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_SCHEDULER_FEATURES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_SCHEDULER_FEATURES`.Companion.`default`() : `WHV_SCHEDULER_FEATURES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_SCHEDULER_FEATURES_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 200 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_SRIOV_RESOURCE_DESCRIPTOR` (
    public var `PnpInstanceId`: UShortArray,
    public var `VirtualFunctionId`: `super`.`super`.`Foundation`.`LUID`,
    public var `VirtualFunctionIndex`: UShort,
    public var `Reserved`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_SRIOV_RESOURCE_DESCRIPTOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_SRIOV_RESOURCE_DESCRIPTOR`.Companion.`default`() : `WHV_SRIOV_RESOURCE_DESCRIPTOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_SYNIC_EVENT_PARAMETERS` (
    public var `VpIndex`: UInt,
    public var `TargetSint`: UByte,
    public var `Reserved`: UByte,
    public var `FlagNumber`: UShort,
)
public const val `WHV_SYNIC_MESSAGE_SIZE`: UInt = 256u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_SYNIC_SINT_DELIVERABLE_CONTEXT` (
    public var `DeliverableSints`: UShort,
    public var `Reserved1`: UShort,
    public var `Reserved2`: UInt,
)
// UNSUPPORTED Rust 1192:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_SYNTHETIC_PROCESSOR_FEATURES {
//     pub Anonymous: WHV_SYNTHETIC_PROCESSOR_FEATURES_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_SYNTHETIC_PROCESSOR_FEATURES`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_SYNTHETIC_PROCESSOR_FEATURES`.Companion.`default`() : `WHV_SYNTHETIC_PROCESSOR_FEATURES` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_SYNTHETIC_PROCESSOR_FEATURES_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS` (
    public var `BanksCount`: UInt,
    public var `Reserved0`: UInt,
    public var `Anonymous`: `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS`.Companion.`default`() : `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1220:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0 {
//     pub Anonymous: WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0,
//     pub AsUINT64: [u64; 1],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0`.Companion.`default`() : `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0` (
    public var `Bank0`: `WHV_SYNTHETIC_PROCESSOR_FEATURES`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0`.Companion.`default`() : `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_COUNT`: UInt = 1u;
public typealias `WHV_TRANSLATE_GVA_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_TRANSLATE_GVA_RESULT` (
    public var `ResultCode`: `WHV_TRANSLATE_GVA_RESULT_CODE`,
    public var `Reserved`: UInt,
)
public typealias `WHV_TRANSLATE_GVA_RESULT_CODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_TRIGGER_PARAMETERS` (
    public var `TriggerType`: `WHV_TRIGGER_TYPE`,
    public var `Reserved`: UInt,
    public var `Anonymous`: `WHV_TRIGGER_PARAMETERS_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_TRIGGER_PARAMETERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_TRIGGER_PARAMETERS`.Companion.`default`() : `WHV_TRIGGER_PARAMETERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1262:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_TRIGGER_PARAMETERS_0 {
//     pub Interrupt: WHV_INTERRUPT_CONTROL,
//     pub SynicEvent: WHV_SYNIC_EVENT_PARAMETERS,
//     pub DeviceInterrupt: WHV_TRIGGER_PARAMETERS_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_TRIGGER_PARAMETERS_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_TRIGGER_PARAMETERS_0`.Companion.`default`() : `WHV_TRIGGER_PARAMETERS_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_TRIGGER_PARAMETERS_0_0` (
    public var `LogicalDeviceId`: ULong,
    public var `MsiAddress`: ULong,
    public var `MsiData`: UInt,
    public var `Reserved`: UInt,
)
public typealias `WHV_TRIGGER_TYPE` = Int;
// UNSUPPORTED Rust 1283:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_UINT128 {
//     pub Anonymous: WHV_UINT128_0,
//     pub Dword: [u32; 4],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_UINT128`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_UINT128`.Companion.`default`() : `WHV_UINT128` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_UINT128_0` (
    public var `Low64`: ULong,
    public var `High64`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_VIRTUAL_PROCESSOR_PROPERTY` (
    public var `PropertyCode`: `WHV_VIRTUAL_PROCESSOR_PROPERTY_CODE`,
    public var `Reserved`: UInt,
    public var `Anonymous`: `WHV_VIRTUAL_PROCESSOR_PROPERTY_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VIRTUAL_PROCESSOR_PROPERTY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VIRTUAL_PROCESSOR_PROPERTY`.Companion.`default`() : `WHV_VIRTUAL_PROCESSOR_PROPERTY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1312:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_VIRTUAL_PROCESSOR_PROPERTY_0 {
//     pub NumaNode: u16,
//     pub Padding: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VIRTUAL_PROCESSOR_PROPERTY_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VIRTUAL_PROCESSOR_PROPERTY_0`.Companion.`default`() : `WHV_VIRTUAL_PROCESSOR_PROPERTY_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WHV_VIRTUAL_PROCESSOR_PROPERTY_CODE` = Int;
public typealias `WHV_VIRTUAL_PROCESSOR_STATE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_VPCI_DEVICE_NOTIFICATION` (
    public var `NotificationType`: `WHV_VPCI_DEVICE_NOTIFICATION_TYPE`,
    public var `Reserved1`: UInt,
    public var `Anonymous`: `WHV_VPCI_DEVICE_NOTIFICATION_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VPCI_DEVICE_NOTIFICATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VPCI_DEVICE_NOTIFICATION`.Companion.`default`() : `WHV_VPCI_DEVICE_NOTIFICATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1337:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_VPCI_DEVICE_NOTIFICATION_0 {
//     pub Reserved2: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VPCI_DEVICE_NOTIFICATION_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VPCI_DEVICE_NOTIFICATION_0`.Companion.`default`() : `WHV_VPCI_DEVICE_NOTIFICATION_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WHV_VPCI_DEVICE_NOTIFICATION_TYPE` = Int;
public typealias `WHV_VPCI_DEVICE_PROPERTY_CODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_VPCI_DEVICE_REGISTER` (
    public var `Location`: `WHV_VPCI_DEVICE_REGISTER_SPACE`,
    public var `SizeInBytes`: UInt,
    public var `OffsetInBytes`: ULong,
)
public typealias `WHV_VPCI_DEVICE_REGISTER_SPACE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_VPCI_HARDWARE_IDS` (
    public var `VendorID`: UShort,
    public var `DeviceID`: UShort,
    public var `RevisionID`: UByte,
    public var `ProgIf`: UByte,
    public var `SubClass`: UByte,
    public var `BaseClass`: UByte,
    public var `SubVendorID`: UShort,
    public var `SubSystemID`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_VPCI_INTERRUPT_TARGET` (
    public var `Vector`: UInt,
    public var `Flags`: `WHV_VPCI_INTERRUPT_TARGET_FLAGS`,
    public var `ProcessorCount`: UInt,
    public var `Processors`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VPCI_INTERRUPT_TARGET`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VPCI_INTERRUPT_TARGET`.Companion.`default`() : `WHV_VPCI_INTERRUPT_TARGET` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WHV_VPCI_INTERRUPT_TARGET_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_VPCI_MMIO_MAPPING` (
    public var `Location`: `WHV_VPCI_DEVICE_REGISTER_SPACE`,
    public var `Flags`: `WHV_VPCI_MMIO_RANGE_FLAGS`,
    public var `SizeInBytes`: ULong,
    public var `OffsetInBytes`: ULong,
    public var `VirtualAddress`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VPCI_MMIO_MAPPING`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VPCI_MMIO_MAPPING`.Companion.`default`() : `WHV_VPCI_MMIO_MAPPING` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WHV_VPCI_MMIO_RANGE_FLAGS` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_VPCI_PROBED_BARS` (
    public var `Value`: UIntArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VPCI_PROBED_BARS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VPCI_PROBED_BARS`.Companion.`default`() : `WHV_VPCI_PROBED_BARS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `WHV_VPCI_TYPE0_BAR_COUNT`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_VP_EXCEPTION_CONTEXT` (
    public var `InstructionByteCount`: UByte,
    public var `Reserved`: UByteArray,
    public var `InstructionBytes`: UByteArray,
    public var `ExceptionInfo`: `WHV_VP_EXCEPTION_INFO`,
    public var `ExceptionType`: UByte,
    public var `Reserved2`: UByteArray,
    public var `ErrorCode`: UInt,
    public var `ExceptionParameter`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VP_EXCEPTION_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VP_EXCEPTION_CONTEXT`.Companion.`default`() : `WHV_VP_EXCEPTION_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1426:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_VP_EXCEPTION_INFO {
//     pub Anonymous: WHV_VP_EXCEPTION_INFO_0,
//     pub AsUINT32: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VP_EXCEPTION_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VP_EXCEPTION_INFO`.Companion.`default`() : `WHV_VP_EXCEPTION_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_VP_EXCEPTION_INFO_0` (
    public var `_bitfield`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_VP_EXIT_CONTEXT` (
    public var `ExecutionState`: `WHV_X64_VP_EXECUTION_STATE`,
    public var `_bitfield`: UByte,
    public var `Reserved`: UByte,
    public var `Reserved2`: UInt,
    public var `Cs`: `WHV_X64_SEGMENT_REGISTER`,
    public var `Rip`: ULong,
    public var `Rflags`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_VP_EXIT_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_VP_EXIT_CONTEXT`.Companion.`default`() : `WHV_VP_EXIT_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_APIC_EOI_CONTEXT` (
    public var `InterruptVector`: UInt,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_APIC_INIT_SIPI_CONTEXT` (
    public var `ApicIcr`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_APIC_SMI_CONTEXT` (
    public var `ApicIcr`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_APIC_WRITE_CONTEXT` (
    public var `Type`: `WHV_X64_APIC_WRITE_TYPE`,
    public var `Reserved`: UInt,
    public var `WriteValue`: ULong,
)
public typealias `WHV_X64_APIC_WRITE_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_CPUID_ACCESS_CONTEXT` (
    public var `Rax`: ULong,
    public var `Rcx`: ULong,
    public var `Rdx`: ULong,
    public var `Rbx`: ULong,
    public var `DefaultResultRax`: ULong,
    public var `DefaultResultRcx`: ULong,
    public var `DefaultResultRdx`: ULong,
    public var `DefaultResultRbx`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_X64_CPUID_RESULT` (
    public var `Function`: UInt,
    public var `Reserved`: UIntArray,
    public var `Eax`: UInt,
    public var `Ebx`: UInt,
    public var `Ecx`: UInt,
    public var `Edx`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_CPUID_RESULT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_CPUID_RESULT`.Companion.`default`() : `WHV_X64_CPUID_RESULT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_CPUID_RESULT2` (
    public var `Function`: UInt,
    public var `Index`: UInt,
    public var `VpIndex`: UInt,
    public var `Flags`: `WHV_X64_CPUID_RESULT2_FLAGS`,
    public var `Output`: `WHV_CPUID_OUTPUT`,
    public var `Mask`: `WHV_CPUID_OUTPUT`,
)
public typealias `WHV_X64_CPUID_RESULT2_FLAGS` = Int;
// UNSUPPORTED Rust 1519:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER {
//     pub Anonymous: WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER`.Companion.`default`() : `WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER_0` (
    public var `_bitfield`: ULong,
)
// UNSUPPORTED Rust 1535:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_FP_CONTROL_STATUS_REGISTER {
//     pub Anonymous: WHV_X64_FP_CONTROL_STATUS_REGISTER_0,
//     pub AsUINT128: WHV_UINT128,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_FP_CONTROL_STATUS_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_FP_CONTROL_STATUS_REGISTER`.Companion.`default`() : `WHV_X64_FP_CONTROL_STATUS_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_X64_FP_CONTROL_STATUS_REGISTER_0` (
    public var `FpControl`: UShort,
    public var `FpStatus`: UShort,
    public var `FpTag`: UByte,
    public var `Reserved`: UByte,
    public var `LastFpOp`: UShort,
    public var `Anonymous`: `WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_FP_CONTROL_STATUS_REGISTER_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_FP_CONTROL_STATUS_REGISTER_0`.Companion.`default`() : `WHV_X64_FP_CONTROL_STATUS_REGISTER_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1561:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0 {
//     pub LastFpRip: u64,
//     pub Anonymous: WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0`.Companion.`default`() : `WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0_0` (
    public var `LastFpEip`: UInt,
    public var `LastFpCs`: UShort,
    public var `Reserved2`: UShort,
)
// UNSUPPORTED Rust 1579:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_FP_REGISTER {
//     pub Anonymous: WHV_X64_FP_REGISTER_0,
//     pub AsUINT128: WHV_UINT128,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_FP_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_FP_REGISTER`.Companion.`default`() : `WHV_X64_FP_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_FP_REGISTER_0` (
    public var `Mantissa`: ULong,
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_INTERRUPTION_DELIVERABLE_CONTEXT` (
    public var `DeliverableType`: `WHV_X64_PENDING_INTERRUPTION_TYPE`,
)
// UNSUPPORTED Rust 1601:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_INTERRUPT_STATE_REGISTER {
//     pub Anonymous: WHV_X64_INTERRUPT_STATE_REGISTER_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_INTERRUPT_STATE_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_INTERRUPT_STATE_REGISTER`.Companion.`default`() : `WHV_X64_INTERRUPT_STATE_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_INTERRUPT_STATE_REGISTER_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_X64_IO_PORT_ACCESS_CONTEXT` (
    public var `InstructionByteCount`: UByte,
    public var `Reserved`: UByteArray,
    public var `InstructionBytes`: UByteArray,
    public var `AccessInfo`: `WHV_X64_IO_PORT_ACCESS_INFO`,
    public var `PortNumber`: UShort,
    public var `Reserved2`: UShortArray,
    public var `Rax`: ULong,
    public var `Rcx`: ULong,
    public var `Rsi`: ULong,
    public var `Rdi`: ULong,
    public var `Ds`: `WHV_X64_SEGMENT_REGISTER`,
    public var `Es`: `WHV_X64_SEGMENT_REGISTER`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_IO_PORT_ACCESS_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_IO_PORT_ACCESS_CONTEXT`.Companion.`default`() : `WHV_X64_IO_PORT_ACCESS_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1638:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_IO_PORT_ACCESS_INFO {
//     pub Anonymous: WHV_X64_IO_PORT_ACCESS_INFO_0,
//     pub AsUINT32: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_IO_PORT_ACCESS_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_IO_PORT_ACCESS_INFO`.Companion.`default`() : `WHV_X64_IO_PORT_ACCESS_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_IO_PORT_ACCESS_INFO_0` (
    public var `_bitfield`: UInt,
)
public typealias `WHV_X64_LOCAL_APIC_EMULATION_MODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_X64_MSR_ACCESS_CONTEXT` (
    public var `AccessInfo`: `WHV_X64_MSR_ACCESS_INFO`,
    public var `MsrNumber`: UInt,
    public var `Rax`: ULong,
    public var `Rdx`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_MSR_ACCESS_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_MSR_ACCESS_CONTEXT`.Companion.`default`() : `WHV_X64_MSR_ACCESS_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1668:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_MSR_ACCESS_INFO {
//     pub Anonymous: WHV_X64_MSR_ACCESS_INFO_0,
//     pub AsUINT32: u32,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_MSR_ACCESS_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_MSR_ACCESS_INFO`.Companion.`default`() : `WHV_X64_MSR_ACCESS_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_MSR_ACCESS_INFO_0` (
    public var `_bitfield`: UInt,
)
// UNSUPPORTED Rust 1684:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_MSR_EXIT_BITMAP {
//     pub AsUINT64: u64,
//     pub Anonymous: WHV_X64_MSR_EXIT_BITMAP_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_MSR_EXIT_BITMAP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_MSR_EXIT_BITMAP`.Companion.`default`() : `WHV_X64_MSR_EXIT_BITMAP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_MSR_EXIT_BITMAP_0` (
    public var `_bitfield`: ULong,
)
// UNSUPPORTED Rust 1700:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_PENDING_DEBUG_EXCEPTION {
//     pub AsUINT64: u64,
//     pub Anonymous: WHV_X64_PENDING_DEBUG_EXCEPTION_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_PENDING_DEBUG_EXCEPTION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_PENDING_DEBUG_EXCEPTION`.Companion.`default`() : `WHV_X64_PENDING_DEBUG_EXCEPTION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_PENDING_DEBUG_EXCEPTION_0` (
    public var `_bitfield`: ULong,
)
public typealias `WHV_X64_PENDING_EVENT_TYPE` = Int;
// UNSUPPORTED Rust 1717:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_PENDING_EXCEPTION_EVENT {
//     pub Anonymous: WHV_X64_PENDING_EXCEPTION_EVENT_0,
//     pub AsUINT128: WHV_UINT128,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_PENDING_EXCEPTION_EVENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_PENDING_EXCEPTION_EVENT`.Companion.`default`() : `WHV_X64_PENDING_EXCEPTION_EVENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_PENDING_EXCEPTION_EVENT_0` (
    public var `_bitfield`: UInt,
    public var `ErrorCode`: UInt,
    public var `ExceptionParameter`: ULong,
)
// UNSUPPORTED Rust 1735:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_PENDING_EXT_INT_EVENT {
//     pub Anonymous: WHV_X64_PENDING_EXT_INT_EVENT_0,
//     pub AsUINT128: WHV_UINT128,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_PENDING_EXT_INT_EVENT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_PENDING_EXT_INT_EVENT`.Companion.`default`() : `WHV_X64_PENDING_EXT_INT_EVENT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_PENDING_EXT_INT_EVENT_0` (
    public var `_bitfield`: ULong,
    public var `Reserved2`: ULong,
)
// UNSUPPORTED Rust 1752:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_PENDING_INTERRUPTION_REGISTER {
//     pub Anonymous: WHV_X64_PENDING_INTERRUPTION_REGISTER_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_PENDING_INTERRUPTION_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_PENDING_INTERRUPTION_REGISTER`.Companion.`default`() : `WHV_X64_PENDING_INTERRUPTION_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_PENDING_INTERRUPTION_REGISTER_0` (
    public var `_bitfield`: UInt,
    public var `ErrorCode`: UInt,
)
public typealias `WHV_X64_PENDING_INTERRUPTION_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_X64_RDTSC_CONTEXT` (
    public var `TscAux`: ULong,
    public var `VirtualOffset`: ULong,
    public var `Tsc`: ULong,
    public var `ReferenceTime`: ULong,
    public var `RdtscInfo`: `WHV_X64_RDTSC_INFO`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_RDTSC_CONTEXT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_RDTSC_CONTEXT`.Companion.`default`() : `WHV_X64_RDTSC_CONTEXT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1784:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_RDTSC_INFO {
//     pub Anonymous: WHV_X64_RDTSC_INFO_0,
//     pub AsUINT64: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_RDTSC_INFO`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_RDTSC_INFO`.Companion.`default`() : `WHV_X64_RDTSC_INFO` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_RDTSC_INFO_0` (
    public var `_bitfield`: ULong,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_X64_SEGMENT_REGISTER` (
    public var `Base`: ULong,
    public var `Limit`: UInt,
    public var `Selector`: UShort,
    public var `Anonymous`: `WHV_X64_SEGMENT_REGISTER_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_SEGMENT_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_SEGMENT_REGISTER`.Companion.`default`() : `WHV_X64_SEGMENT_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1813:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_SEGMENT_REGISTER_0 {
//     pub Anonymous: WHV_X64_SEGMENT_REGISTER_0_0,
//     pub Attributes: u16,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_SEGMENT_REGISTER_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_SEGMENT_REGISTER_0`.Companion.`default`() : `WHV_X64_SEGMENT_REGISTER_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_SEGMENT_REGISTER_0_0` (
    public var `_bitfield`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_X64_TABLE_REGISTER` (
    public var `Pad`: UShortArray,
    public var `Limit`: UShort,
    public var `Base`: ULong,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_TABLE_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_TABLE_REGISTER`.Companion.`default`() : `WHV_X64_TABLE_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `WHV_X64_UNSUPPORTED_FEATURE_CODE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_UNSUPPORTED_FEATURE_CONTEXT` (
    public var `FeatureCode`: `WHV_X64_UNSUPPORTED_FEATURE_CODE`,
    public var `Reserved`: UInt,
    public var `FeatureParameter`: ULong,
)
// UNSUPPORTED Rust 1849:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_VP_EXECUTION_STATE {
//     pub Anonymous: WHV_X64_VP_EXECUTION_STATE_0,
//     pub AsUINT16: u16,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_VP_EXECUTION_STATE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_VP_EXECUTION_STATE`.Companion.`default`() : `WHV_X64_VP_EXECUTION_STATE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_VP_EXECUTION_STATE_0` (
    public var `_bitfield`: UShort,
)
// UNSUPPORTED Rust 1865:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_XMM_CONTROL_STATUS_REGISTER {
//     pub Anonymous: WHV_X64_XMM_CONTROL_STATUS_REGISTER_0,
//     pub AsUINT128: WHV_UINT128,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_XMM_CONTROL_STATUS_REGISTER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_XMM_CONTROL_STATUS_REGISTER`.Companion.`default`() : `WHV_X64_XMM_CONTROL_STATUS_REGISTER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `WHV_X64_XMM_CONTROL_STATUS_REGISTER_0` (
    public var `Anonymous`: `WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0`,
    public var `XmmStatusControl`: UInt,
    public var `XmmStatusControlMask`: UInt,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_XMM_CONTROL_STATUS_REGISTER_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_XMM_CONTROL_STATUS_REGISTER_0`.Companion.`default`() : `WHV_X64_XMM_CONTROL_STATUS_REGISTER_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 1888:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0 {
//     pub LastFpRdp: u64,
//     pub Anonymous: WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0_0,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0`.Companion.`default`() : `WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0_0` (
    public var `LastFpDp`: UInt,
    public var `LastFpDs`: UShort,
    public var `Reserved`: UShort,
)
public const val `WHvAdviseGpaRangeCodePin`: `WHV_ADVISE_GPA_RANGE_CODE` = 1;
public const val `WHvAdviseGpaRangeCodePopulate`: `WHV_ADVISE_GPA_RANGE_CODE` = 0;
public const val `WHvAdviseGpaRangeCodeUnpin`: `WHV_ADVISE_GPA_RANGE_CODE` = 2;
public const val `WHvAllocateVpciResourceFlagAllowDirectP2P`: `WHV_ALLOCATE_VPCI_RESOURCE_FLAGS` = 1;
public const val `WHvAllocateVpciResourceFlagNone`: `WHV_ALLOCATE_VPCI_RESOURCE_FLAGS` = 0;
public const val `WHvCacheTypeUncached`: `WHV_CACHE_TYPE` = 0;
public const val `WHvCacheTypeWriteBack`: `WHV_CACHE_TYPE` = 6;
public const val `WHvCacheTypeWriteCombining`: `WHV_CACHE_TYPE` = 1;
public const val `WHvCacheTypeWriteThrough`: `WHV_CACHE_TYPE` = 4;
public const val `WHvCapabilityCodeExceptionExitBitmap`: `WHV_CAPABILITY_CODE` = 3;
public const val `WHvCapabilityCodeExtendedVmExits`: `WHV_CAPABILITY_CODE` = 2;
public const val `WHvCapabilityCodeFeatures`: `WHV_CAPABILITY_CODE` = 1;
public const val `WHvCapabilityCodeGpaRangePopulateFlags`: `WHV_CAPABILITY_CODE` = 5;
public const val `WHvCapabilityCodeHypervisorPresent`: `WHV_CAPABILITY_CODE` = 0;
public const val `WHvCapabilityCodeInterruptClockFrequency`: `WHV_CAPABILITY_CODE` = 4101;
public const val `WHvCapabilityCodeProcessorClFlushSize`: `WHV_CAPABILITY_CODE` = 4098;
public const val `WHvCapabilityCodeProcessorClockFrequency`: `WHV_CAPABILITY_CODE` = 4100;
public const val `WHvCapabilityCodeProcessorFeatures`: `WHV_CAPABILITY_CODE` = 4097;
public const val `WHvCapabilityCodeProcessorFeaturesBanks`: `WHV_CAPABILITY_CODE` = 4102;
public const val `WHvCapabilityCodeProcessorFrequencyCap`: `WHV_CAPABILITY_CODE` = 4103;
public const val `WHvCapabilityCodeProcessorPerfmonFeatures`: `WHV_CAPABILITY_CODE` = 4105;
public const val `WHvCapabilityCodeProcessorVendor`: `WHV_CAPABILITY_CODE` = 4096;
public const val `WHvCapabilityCodeProcessorXsaveFeatures`: `WHV_CAPABILITY_CODE` = 4099;
public const val `WHvCapabilityCodeSchedulerFeatures`: `WHV_CAPABILITY_CODE` = 6;
public const val `WHvCapabilityCodeSyntheticProcessorFeaturesBanks`: `WHV_CAPABILITY_CODE` = 4104;
public const val `WHvCapabilityCodeX64MsrExitBitmap`: `WHV_CAPABILITY_CODE` = 4;
public const val `WHvCreateVpciDeviceFlagNone`: `WHV_CREATE_VPCI_DEVICE_FLAGS` = 0;
public const val `WHvCreateVpciDeviceFlagPhysicallyBacked`: `WHV_CREATE_VPCI_DEVICE_FLAGS` = 1;
public const val `WHvCreateVpciDeviceFlagUseLogicalInterrupts`: `WHV_CREATE_VPCI_DEVICE_FLAGS` = 2;
public const val `WHvMapGpaRangeFlagExecute`: `WHV_MAP_GPA_RANGE_FLAGS` = 4;
public const val `WHvMapGpaRangeFlagNone`: `WHV_MAP_GPA_RANGE_FLAGS` = 0;
public const val `WHvMapGpaRangeFlagRead`: `WHV_MAP_GPA_RANGE_FLAGS` = 1;
public const val `WHvMapGpaRangeFlagTrackDirtyPages`: `WHV_MAP_GPA_RANGE_FLAGS` = 8;
public const val `WHvMapGpaRangeFlagWrite`: `WHV_MAP_GPA_RANGE_FLAGS` = 2;
public const val `WHvMemoryAccessExecute`: `WHV_MEMORY_ACCESS_TYPE` = 2;
public const val `WHvMemoryAccessRead`: `WHV_MEMORY_ACCESS_TYPE` = 0;
public const val `WHvMemoryAccessWrite`: `WHV_MEMORY_ACCESS_TYPE` = 1;
public const val `WHvMsrActionArchitectureDefault`: `WHV_MSR_ACTION` = 0;
public const val `WHvMsrActionExit`: `WHV_MSR_ACTION` = 2;
public const val `WHvMsrActionIgnoreWriteReadZero`: `WHV_MSR_ACTION` = 1;
public const val `WHvNotificationPortPropertyPreferredTargetDuration`: `WHV_NOTIFICATION_PORT_PROPERTY_CODE` = 5;
public const val `WHvNotificationPortPropertyPreferredTargetVp`: `WHV_NOTIFICATION_PORT_PROPERTY_CODE` = 1;
public const val `WHvNotificationPortTypeDoorbell`: `WHV_NOTIFICATION_PORT_TYPE` = 4;
public const val `WHvNotificationPortTypeEvent`: `WHV_NOTIFICATION_PORT_TYPE` = 2;
public const val `WHvPartitionCounterSetMemory`: `WHV_PARTITION_COUNTER_SET` = 0;
public const val `WHvPartitionPropertyCodeAllowDeviceAssignment`: `WHV_PARTITION_PROPERTY_CODE` = 12;
public const val `WHvPartitionPropertyCodeApicRemoteReadSupport`: `WHV_PARTITION_PROPERTY_CODE` = 4105;
public const val `WHvPartitionPropertyCodeCpuCap`: `WHV_PARTITION_PROPERTY_CODE` = 8;
public const val `WHvPartitionPropertyCodeCpuGroupId`: `WHV_PARTITION_PROPERTY_CODE` = 10;
public const val `WHvPartitionPropertyCodeCpuReserve`: `WHV_PARTITION_PROPERTY_CODE` = 7;
public const val `WHvPartitionPropertyCodeCpuWeight`: `WHV_PARTITION_PROPERTY_CODE` = 9;
public const val `WHvPartitionPropertyCodeCpuidExitList`: `WHV_PARTITION_PROPERTY_CODE` = 4099;
public const val `WHvPartitionPropertyCodeCpuidResultList`: `WHV_PARTITION_PROPERTY_CODE` = 4100;
public const val `WHvPartitionPropertyCodeCpuidResultList2`: `WHV_PARTITION_PROPERTY_CODE` = 4109;
public const val `WHvPartitionPropertyCodeDisableSmt`: `WHV_PARTITION_PROPERTY_CODE` = 13;
public const val `WHvPartitionPropertyCodeExceptionExitBitmap`: `WHV_PARTITION_PROPERTY_CODE` = 2;
public const val `WHvPartitionPropertyCodeExtendedVmExits`: `WHV_PARTITION_PROPERTY_CODE` = 1;
public const val `WHvPartitionPropertyCodeInterruptClockFrequency`: `WHV_PARTITION_PROPERTY_CODE` = 4104;
public const val `WHvPartitionPropertyCodeLocalApicEmulationMode`: `WHV_PARTITION_PROPERTY_CODE` = 4101;
public const val `WHvPartitionPropertyCodeMsrActionList`: `WHV_PARTITION_PROPERTY_CODE` = 4111;
public const val `WHvPartitionPropertyCodeNestedVirtualization`: `WHV_PARTITION_PROPERTY_CODE` = 4;
public const val `WHvPartitionPropertyCodePrimaryNumaNode`: `WHV_PARTITION_PROPERTY_CODE` = 6;
public const val `WHvPartitionPropertyCodeProcessorClFlushSize`: `WHV_PARTITION_PROPERTY_CODE` = 4098;
public const val `WHvPartitionPropertyCodeProcessorClockFrequency`: `WHV_PARTITION_PROPERTY_CODE` = 4103;
public const val `WHvPartitionPropertyCodeProcessorCount`: `WHV_PARTITION_PROPERTY_CODE` = 8191;
public const val `WHvPartitionPropertyCodeProcessorFeatures`: `WHV_PARTITION_PROPERTY_CODE` = 4097;
public const val `WHvPartitionPropertyCodeProcessorFeaturesBanks`: `WHV_PARTITION_PROPERTY_CODE` = 4106;
public const val `WHvPartitionPropertyCodeProcessorFrequencyCap`: `WHV_PARTITION_PROPERTY_CODE` = 11;
public const val `WHvPartitionPropertyCodeProcessorPerfmonFeatures`: `WHV_PARTITION_PROPERTY_CODE` = 4110;
public const val `WHvPartitionPropertyCodeProcessorXsaveFeatures`: `WHV_PARTITION_PROPERTY_CODE` = 4102;
public const val `WHvPartitionPropertyCodeReferenceTime`: `WHV_PARTITION_PROPERTY_CODE` = 4107;
public const val `WHvPartitionPropertyCodeSeparateSecurityDomain`: `WHV_PARTITION_PROPERTY_CODE` = 3;
public const val `WHvPartitionPropertyCodeSyntheticProcessorFeaturesBanks`: `WHV_PARTITION_PROPERTY_CODE` = 4108;
public const val `WHvPartitionPropertyCodeUnimplementedMsrAction`: `WHV_PARTITION_PROPERTY_CODE` = 4112;
public const val `WHvPartitionPropertyCodeX64MsrExitBitmap`: `WHV_PARTITION_PROPERTY_CODE` = 5;
public const val `WHvProcessorCounterSetApic`: `WHV_PROCESSOR_COUNTER_SET` = 3;
public const val `WHvProcessorCounterSetEvents`: `WHV_PROCESSOR_COUNTER_SET` = 2;
public const val `WHvProcessorCounterSetIntercepts`: `WHV_PROCESSOR_COUNTER_SET` = 1;
public const val `WHvProcessorCounterSetRuntime`: `WHV_PROCESSOR_COUNTER_SET` = 0;
public const val `WHvProcessorCounterSetSyntheticFeatures`: `WHV_PROCESSOR_COUNTER_SET` = 4;
public const val `WHvProcessorVendorAmd`: `WHV_PROCESSOR_VENDOR` = 0;
public const val `WHvProcessorVendorHygon`: `WHV_PROCESSOR_VENDOR` = 2;
public const val `WHvProcessorVendorIntel`: `WHV_PROCESSOR_VENDOR` = 1;
public const val `WHvRegisterEom`: `WHV_REGISTER_NAME` = 16404;
public const val `WHvRegisterGuestOsId`: `WHV_REGISTER_NAME` = 20482;
public const val `WHvRegisterInternalActivityState`: `WHV_REGISTER_NAME` = -2147483643;
public const val `WHvRegisterInterruptState`: `WHV_REGISTER_NAME` = -2147483647;
public const val `WHvRegisterPendingEvent`: `WHV_REGISTER_NAME` = -2147483646;
public const val `WHvRegisterPendingInterruption`: `WHV_REGISTER_NAME` = -2147483648;
public const val `WHvRegisterReferenceTsc`: `WHV_REGISTER_NAME` = 20503;
public const val `WHvRegisterReferenceTscSequence`: `WHV_REGISTER_NAME` = 20506;
public const val `WHvRegisterScontrol`: `WHV_REGISTER_NAME` = 16400;
public const val `WHvRegisterSiefp`: `WHV_REGISTER_NAME` = 16402;
public const val `WHvRegisterSimp`: `WHV_REGISTER_NAME` = 16403;
public const val `WHvRegisterSint0`: `WHV_REGISTER_NAME` = 16384;
public const val `WHvRegisterSint1`: `WHV_REGISTER_NAME` = 16385;
public const val `WHvRegisterSint10`: `WHV_REGISTER_NAME` = 16394;
public const val `WHvRegisterSint11`: `WHV_REGISTER_NAME` = 16395;
public const val `WHvRegisterSint12`: `WHV_REGISTER_NAME` = 16396;
public const val `WHvRegisterSint13`: `WHV_REGISTER_NAME` = 16397;
public const val `WHvRegisterSint14`: `WHV_REGISTER_NAME` = 16398;
public const val `WHvRegisterSint15`: `WHV_REGISTER_NAME` = 16399;
public const val `WHvRegisterSint2`: `WHV_REGISTER_NAME` = 16386;
public const val `WHvRegisterSint3`: `WHV_REGISTER_NAME` = 16387;
public const val `WHvRegisterSint4`: `WHV_REGISTER_NAME` = 16388;
public const val `WHvRegisterSint5`: `WHV_REGISTER_NAME` = 16389;
public const val `WHvRegisterSint6`: `WHV_REGISTER_NAME` = 16390;
public const val `WHvRegisterSint7`: `WHV_REGISTER_NAME` = 16391;
public const val `WHvRegisterSint8`: `WHV_REGISTER_NAME` = 16392;
public const val `WHvRegisterSint9`: `WHV_REGISTER_NAME` = 16393;
public const val `WHvRegisterSversion`: `WHV_REGISTER_NAME` = 16401;
public const val `WHvRegisterVpAssistPage`: `WHV_REGISTER_NAME` = 20499;
public const val `WHvRegisterVpRuntime`: `WHV_REGISTER_NAME` = 20480;
public const val `WHvRunVpCancelReasonUser`: `WHV_RUN_VP_CANCEL_REASON` = 0;
public const val `WHvRunVpExitReasonCanceled`: `WHV_RUN_VP_EXIT_REASON` = 8193;
public const val `WHvRunVpExitReasonException`: `WHV_RUN_VP_EXIT_REASON` = 4098;
public const val `WHvRunVpExitReasonHypercall`: `WHV_RUN_VP_EXIT_REASON` = 4101;
public const val `WHvRunVpExitReasonInvalidVpRegisterValue`: `WHV_RUN_VP_EXIT_REASON` = 5;
public const val `WHvRunVpExitReasonMemoryAccess`: `WHV_RUN_VP_EXIT_REASON` = 1;
public const val `WHvRunVpExitReasonNone`: `WHV_RUN_VP_EXIT_REASON` = 0;
public const val `WHvRunVpExitReasonSynicSintDeliverable`: `WHV_RUN_VP_EXIT_REASON` = 10;
public const val `WHvRunVpExitReasonUnrecoverableException`: `WHV_RUN_VP_EXIT_REASON` = 4;
public const val `WHvRunVpExitReasonUnsupportedFeature`: `WHV_RUN_VP_EXIT_REASON` = 6;
public const val `WHvRunVpExitReasonX64ApicEoi`: `WHV_RUN_VP_EXIT_REASON` = 9;
public const val `WHvRunVpExitReasonX64ApicInitSipiTrap`: `WHV_RUN_VP_EXIT_REASON` = 4102;
public const val `WHvRunVpExitReasonX64ApicSmiTrap`: `WHV_RUN_VP_EXIT_REASON` = 4100;
public const val `WHvRunVpExitReasonX64ApicWriteTrap`: `WHV_RUN_VP_EXIT_REASON` = 4103;
public const val `WHvRunVpExitReasonX64Cpuid`: `WHV_RUN_VP_EXIT_REASON` = 4097;
public const val `WHvRunVpExitReasonX64Halt`: `WHV_RUN_VP_EXIT_REASON` = 8;
public const val `WHvRunVpExitReasonX64InterruptWindow`: `WHV_RUN_VP_EXIT_REASON` = 7;
public const val `WHvRunVpExitReasonX64IoPortAccess`: `WHV_RUN_VP_EXIT_REASON` = 2;
public const val `WHvRunVpExitReasonX64MsrAccess`: `WHV_RUN_VP_EXIT_REASON` = 4096;
public const val `WHvRunVpExitReasonX64Rdtsc`: `WHV_RUN_VP_EXIT_REASON` = 4099;
public const val `WHvTranslateGvaFlagEnforceSmap`: `WHV_TRANSLATE_GVA_FLAGS` = 256;
public const val `WHvTranslateGvaFlagNone`: `WHV_TRANSLATE_GVA_FLAGS` = 0;
public const val `WHvTranslateGvaFlagOverrideSmap`: `WHV_TRANSLATE_GVA_FLAGS` = 512;
public const val `WHvTranslateGvaFlagPrivilegeExempt`: `WHV_TRANSLATE_GVA_FLAGS` = 8;
public const val `WHvTranslateGvaFlagSetPageTableBits`: `WHV_TRANSLATE_GVA_FLAGS` = 16;
public const val `WHvTranslateGvaFlagValidateExecute`: `WHV_TRANSLATE_GVA_FLAGS` = 4;
public const val `WHvTranslateGvaFlagValidateRead`: `WHV_TRANSLATE_GVA_FLAGS` = 1;
public const val `WHvTranslateGvaFlagValidateWrite`: `WHV_TRANSLATE_GVA_FLAGS` = 2;
public const val `WHvTranslateGvaResultGpaIllegalOverlayAccess`: `WHV_TRANSLATE_GVA_RESULT_CODE` = 7;
public const val `WHvTranslateGvaResultGpaNoReadAccess`: `WHV_TRANSLATE_GVA_RESULT_CODE` = 5;
public const val `WHvTranslateGvaResultGpaNoWriteAccess`: `WHV_TRANSLATE_GVA_RESULT_CODE` = 6;
public const val `WHvTranslateGvaResultGpaUnmapped`: `WHV_TRANSLATE_GVA_RESULT_CODE` = 4;
public const val `WHvTranslateGvaResultIntercept`: `WHV_TRANSLATE_GVA_RESULT_CODE` = 8;
public const val `WHvTranslateGvaResultInvalidPageTableFlags`: `WHV_TRANSLATE_GVA_RESULT_CODE` = 3;
public const val `WHvTranslateGvaResultPageNotPresent`: `WHV_TRANSLATE_GVA_RESULT_CODE` = 1;
public const val `WHvTranslateGvaResultPrivilegeViolation`: `WHV_TRANSLATE_GVA_RESULT_CODE` = 2;
public const val `WHvTranslateGvaResultSuccess`: `WHV_TRANSLATE_GVA_RESULT_CODE` = 0;
public const val `WHvTriggerTypeDeviceInterrupt`: `WHV_TRIGGER_TYPE` = 2;
public const val `WHvTriggerTypeInterrupt`: `WHV_TRIGGER_TYPE` = 0;
public const val `WHvTriggerTypeSynicEvent`: `WHV_TRIGGER_TYPE` = 1;
public const val `WHvUnsupportedFeatureIntercept`: `WHV_X64_UNSUPPORTED_FEATURE_CODE` = 1;
public const val `WHvUnsupportedFeatureTaskSwitchTss`: `WHV_X64_UNSUPPORTED_FEATURE_CODE` = 2;
public const val `WHvVirtualProcessorPropertyCodeNumaNode`: `WHV_VIRTUAL_PROCESSOR_PROPERTY_CODE` = 0;
public const val `WHvVirtualProcessorStateTypeInterruptControllerState2`: `WHV_VIRTUAL_PROCESSOR_STATE_TYPE` = 4096;
public const val `WHvVirtualProcessorStateTypeSynicEventFlagPage`: `WHV_VIRTUAL_PROCESSOR_STATE_TYPE` = 1;
public const val `WHvVirtualProcessorStateTypeSynicMessagePage`: `WHV_VIRTUAL_PROCESSOR_STATE_TYPE` = 0;
public const val `WHvVirtualProcessorStateTypeSynicTimerState`: `WHV_VIRTUAL_PROCESSOR_STATE_TYPE` = 2;
public const val `WHvVirtualProcessorStateTypeXsaveState`: `WHV_VIRTUAL_PROCESSOR_STATE_TYPE` = 4097;
public const val `WHvVpciBar0`: `WHV_VPCI_DEVICE_REGISTER_SPACE` = 0;
public const val `WHvVpciBar1`: `WHV_VPCI_DEVICE_REGISTER_SPACE` = 1;
public const val `WHvVpciBar2`: `WHV_VPCI_DEVICE_REGISTER_SPACE` = 2;
public const val `WHvVpciBar3`: `WHV_VPCI_DEVICE_REGISTER_SPACE` = 3;
public const val `WHvVpciBar4`: `WHV_VPCI_DEVICE_REGISTER_SPACE` = 4;
public const val `WHvVpciBar5`: `WHV_VPCI_DEVICE_REGISTER_SPACE` = 5;
public const val `WHvVpciConfigSpace`: `WHV_VPCI_DEVICE_REGISTER_SPACE` = -1;
public const val `WHvVpciDeviceNotificationMmioRemapping`: `WHV_VPCI_DEVICE_NOTIFICATION_TYPE` = 1;
public const val `WHvVpciDeviceNotificationSurpriseRemoval`: `WHV_VPCI_DEVICE_NOTIFICATION_TYPE` = 2;
public const val `WHvVpciDeviceNotificationUndefined`: `WHV_VPCI_DEVICE_NOTIFICATION_TYPE` = 0;
public const val `WHvVpciDevicePropertyCodeHardwareIDs`: `WHV_VPCI_DEVICE_PROPERTY_CODE` = 1;
public const val `WHvVpciDevicePropertyCodeProbedBARs`: `WHV_VPCI_DEVICE_PROPERTY_CODE` = 2;
public const val `WHvVpciDevicePropertyCodeUndefined`: `WHV_VPCI_DEVICE_PROPERTY_CODE` = 0;
public const val `WHvVpciInterruptTargetFlagMulticast`: `WHV_VPCI_INTERRUPT_TARGET_FLAGS` = 1;
public const val `WHvVpciInterruptTargetFlagNone`: `WHV_VPCI_INTERRUPT_TARGET_FLAGS` = 0;
public const val `WHvVpciMmioRangeFlagReadAccess`: `WHV_VPCI_MMIO_RANGE_FLAGS` = 1;
public const val `WHvVpciMmioRangeFlagWriteAccess`: `WHV_VPCI_MMIO_RANGE_FLAGS` = 2;
public const val `WHvX64ApicWriteTypeDfr`: `WHV_X64_APIC_WRITE_TYPE` = 224;
public const val `WHvX64ApicWriteTypeLdr`: `WHV_X64_APIC_WRITE_TYPE` = 208;
public const val `WHvX64ApicWriteTypeLint0`: `WHV_X64_APIC_WRITE_TYPE` = 848;
public const val `WHvX64ApicWriteTypeLint1`: `WHV_X64_APIC_WRITE_TYPE` = 864;
public const val `WHvX64ApicWriteTypeSvr`: `WHV_X64_APIC_WRITE_TYPE` = 240;
public const val `WHvX64CpuidResult2FlagSubleafSpecific`: `WHV_X64_CPUID_RESULT2_FLAGS` = 1;
public const val `WHvX64CpuidResult2FlagVpSpecific`: `WHV_X64_CPUID_RESULT2_FLAGS` = 2;
public const val `WHvX64ExceptionTypeAlignmentCheckFault`: `WHV_EXCEPTION_TYPE` = 17;
public const val `WHvX64ExceptionTypeBoundRangeFault`: `WHV_EXCEPTION_TYPE` = 5;
public const val `WHvX64ExceptionTypeBreakpointTrap`: `WHV_EXCEPTION_TYPE` = 3;
public const val `WHvX64ExceptionTypeDebugTrapOrFault`: `WHV_EXCEPTION_TYPE` = 1;
public const val `WHvX64ExceptionTypeDeviceNotAvailableFault`: `WHV_EXCEPTION_TYPE` = 7;
public const val `WHvX64ExceptionTypeDivideErrorFault`: `WHV_EXCEPTION_TYPE` = 0;
public const val `WHvX64ExceptionTypeDoubleFaultAbort`: `WHV_EXCEPTION_TYPE` = 8;
public const val `WHvX64ExceptionTypeFloatingPointErrorFault`: `WHV_EXCEPTION_TYPE` = 16;
public const val `WHvX64ExceptionTypeGeneralProtectionFault`: `WHV_EXCEPTION_TYPE` = 13;
public const val `WHvX64ExceptionTypeInvalidOpcodeFault`: `WHV_EXCEPTION_TYPE` = 6;
public const val `WHvX64ExceptionTypeInvalidTaskStateSegmentFault`: `WHV_EXCEPTION_TYPE` = 10;
public const val `WHvX64ExceptionTypeMachineCheckAbort`: `WHV_EXCEPTION_TYPE` = 18;
public const val `WHvX64ExceptionTypeOverflowTrap`: `WHV_EXCEPTION_TYPE` = 4;
public const val `WHvX64ExceptionTypePageFault`: `WHV_EXCEPTION_TYPE` = 14;
public const val `WHvX64ExceptionTypeSegmentNotPresentFault`: `WHV_EXCEPTION_TYPE` = 11;
public const val `WHvX64ExceptionTypeSimdFloatingPointFault`: `WHV_EXCEPTION_TYPE` = 19;
public const val `WHvX64ExceptionTypeStackFault`: `WHV_EXCEPTION_TYPE` = 12;
public const val `WHvX64InterruptDestinationModeLogical`: `WHV_INTERRUPT_DESTINATION_MODE` = 1;
public const val `WHvX64InterruptDestinationModePhysical`: `WHV_INTERRUPT_DESTINATION_MODE` = 0;
public const val `WHvX64InterruptTriggerModeEdge`: `WHV_INTERRUPT_TRIGGER_MODE` = 0;
public const val `WHvX64InterruptTriggerModeLevel`: `WHV_INTERRUPT_TRIGGER_MODE` = 1;
public const val `WHvX64InterruptTypeFixed`: `WHV_INTERRUPT_TYPE` = 0;
public const val `WHvX64InterruptTypeInit`: `WHV_INTERRUPT_TYPE` = 5;
public const val `WHvX64InterruptTypeLocalInt1`: `WHV_INTERRUPT_TYPE` = 9;
public const val `WHvX64InterruptTypeLowestPriority`: `WHV_INTERRUPT_TYPE` = 1;
public const val `WHvX64InterruptTypeNmi`: `WHV_INTERRUPT_TYPE` = 4;
public const val `WHvX64InterruptTypeSipi`: `WHV_INTERRUPT_TYPE` = 6;
public const val `WHvX64LocalApicEmulationModeNone`: `WHV_X64_LOCAL_APIC_EMULATION_MODE` = 0;
public const val `WHvX64LocalApicEmulationModeX2Apic`: `WHV_X64_LOCAL_APIC_EMULATION_MODE` = 2;
public const val `WHvX64LocalApicEmulationModeXApic`: `WHV_X64_LOCAL_APIC_EMULATION_MODE` = 1;
public const val `WHvX64PendingEventException`: `WHV_X64_PENDING_EVENT_TYPE` = 0;
public const val `WHvX64PendingEventExtInt`: `WHV_X64_PENDING_EVENT_TYPE` = 5;
public const val `WHvX64PendingException`: `WHV_X64_PENDING_INTERRUPTION_TYPE` = 3;
public const val `WHvX64PendingInterrupt`: `WHV_X64_PENDING_INTERRUPTION_TYPE` = 0;
public const val `WHvX64PendingNmi`: `WHV_X64_PENDING_INTERRUPTION_TYPE` = 2;
public const val `WHvX64RegisterACount`: `WHV_REGISTER_NAME` = 8319;
public const val `WHvX64RegisterApicBase`: `WHV_REGISTER_NAME` = 8195;
public const val `WHvX64RegisterApicCurrentCount`: `WHV_REGISTER_NAME` = 12345;
public const val `WHvX64RegisterApicDivide`: `WHV_REGISTER_NAME` = 12350;
public const val `WHvX64RegisterApicEoi`: `WHV_REGISTER_NAME` = 12299;
public const val `WHvX64RegisterApicEse`: `WHV_REGISTER_NAME` = 12328;
public const val `WHvX64RegisterApicIcr`: `WHV_REGISTER_NAME` = 12336;
public const val `WHvX64RegisterApicId`: `WHV_REGISTER_NAME` = 12290;
public const val `WHvX64RegisterApicInitCount`: `WHV_REGISTER_NAME` = 12344;
public const val `WHvX64RegisterApicIrr0`: `WHV_REGISTER_NAME` = 12320;
public const val `WHvX64RegisterApicIrr1`: `WHV_REGISTER_NAME` = 12321;
public const val `WHvX64RegisterApicIrr2`: `WHV_REGISTER_NAME` = 12322;
public const val `WHvX64RegisterApicIrr3`: `WHV_REGISTER_NAME` = 12323;
public const val `WHvX64RegisterApicIrr4`: `WHV_REGISTER_NAME` = 12324;
public const val `WHvX64RegisterApicIrr5`: `WHV_REGISTER_NAME` = 12325;
public const val `WHvX64RegisterApicIrr6`: `WHV_REGISTER_NAME` = 12326;
public const val `WHvX64RegisterApicIrr7`: `WHV_REGISTER_NAME` = 12327;
public const val `WHvX64RegisterApicIsr0`: `WHV_REGISTER_NAME` = 12304;
public const val `WHvX64RegisterApicIsr1`: `WHV_REGISTER_NAME` = 12305;
public const val `WHvX64RegisterApicIsr2`: `WHV_REGISTER_NAME` = 12306;
public const val `WHvX64RegisterApicIsr3`: `WHV_REGISTER_NAME` = 12307;
public const val `WHvX64RegisterApicIsr4`: `WHV_REGISTER_NAME` = 12308;
public const val `WHvX64RegisterApicIsr5`: `WHV_REGISTER_NAME` = 12309;
public const val `WHvX64RegisterApicIsr6`: `WHV_REGISTER_NAME` = 12310;
public const val `WHvX64RegisterApicIsr7`: `WHV_REGISTER_NAME` = 12311;
public const val `WHvX64RegisterApicLdr`: `WHV_REGISTER_NAME` = 12301;
public const val `WHvX64RegisterApicLvtError`: `WHV_REGISTER_NAME` = 12343;
public const val `WHvX64RegisterApicLvtLint0`: `WHV_REGISTER_NAME` = 12341;
public const val `WHvX64RegisterApicLvtLint1`: `WHV_REGISTER_NAME` = 12342;
public const val `WHvX64RegisterApicLvtPerfmon`: `WHV_REGISTER_NAME` = 12340;
public const val `WHvX64RegisterApicLvtThermal`: `WHV_REGISTER_NAME` = 12339;
public const val `WHvX64RegisterApicLvtTimer`: `WHV_REGISTER_NAME` = 12338;
public const val `WHvX64RegisterApicPpr`: `WHV_REGISTER_NAME` = 12298;
public const val `WHvX64RegisterApicSelfIpi`: `WHV_REGISTER_NAME` = 12351;
public const val `WHvX64RegisterApicSpurious`: `WHV_REGISTER_NAME` = 12303;
public const val `WHvX64RegisterApicTmr0`: `WHV_REGISTER_NAME` = 12312;
public const val `WHvX64RegisterApicTmr1`: `WHV_REGISTER_NAME` = 12313;
public const val `WHvX64RegisterApicTmr2`: `WHV_REGISTER_NAME` = 12314;
public const val `WHvX64RegisterApicTmr3`: `WHV_REGISTER_NAME` = 12315;
public const val `WHvX64RegisterApicTmr4`: `WHV_REGISTER_NAME` = 12316;
public const val `WHvX64RegisterApicTmr5`: `WHV_REGISTER_NAME` = 12317;
public const val `WHvX64RegisterApicTmr6`: `WHV_REGISTER_NAME` = 12318;
public const val `WHvX64RegisterApicTmr7`: `WHV_REGISTER_NAME` = 12319;
public const val `WHvX64RegisterApicTpr`: `WHV_REGISTER_NAME` = 12296;
public const val `WHvX64RegisterApicVersion`: `WHV_REGISTER_NAME` = 12291;
public const val `WHvX64RegisterBndcfgs`: `WHV_REGISTER_NAME` = 8316;
public const val `WHvX64RegisterCr0`: `WHV_REGISTER_NAME` = 28;
public const val `WHvX64RegisterCr2`: `WHV_REGISTER_NAME` = 29;
public const val `WHvX64RegisterCr3`: `WHV_REGISTER_NAME` = 30;
public const val `WHvX64RegisterCr4`: `WHV_REGISTER_NAME` = 31;
public const val `WHvX64RegisterCr8`: `WHV_REGISTER_NAME` = 32;
public const val `WHvX64RegisterCs`: `WHV_REGISTER_NAME` = 19;
public const val `WHvX64RegisterCstar`: `WHV_REGISTER_NAME` = 8202;
public const val `WHvX64RegisterDeliverabilityNotifications`: `WHV_REGISTER_NAME` = -2147483644;
public const val `WHvX64RegisterDr0`: `WHV_REGISTER_NAME` = 33;
public const val `WHvX64RegisterDr1`: `WHV_REGISTER_NAME` = 34;
public const val `WHvX64RegisterDr2`: `WHV_REGISTER_NAME` = 35;
public const val `WHvX64RegisterDr3`: `WHV_REGISTER_NAME` = 36;
public const val `WHvX64RegisterDr6`: `WHV_REGISTER_NAME` = 37;
public const val `WHvX64RegisterDr7`: `WHV_REGISTER_NAME` = 38;
public const val `WHvX64RegisterDs`: `WHV_REGISTER_NAME` = 21;
public const val `WHvX64RegisterEfer`: `WHV_REGISTER_NAME` = 8193;
public const val `WHvX64RegisterEs`: `WHV_REGISTER_NAME` = 18;
public const val `WHvX64RegisterFpControlStatus`: `WHV_REGISTER_NAME` = 4120;
public const val `WHvX64RegisterFpMmx0`: `WHV_REGISTER_NAME` = 4112;
public const val `WHvX64RegisterFpMmx1`: `WHV_REGISTER_NAME` = 4113;
public const val `WHvX64RegisterFpMmx2`: `WHV_REGISTER_NAME` = 4114;
public const val `WHvX64RegisterFpMmx3`: `WHV_REGISTER_NAME` = 4115;
public const val `WHvX64RegisterFpMmx4`: `WHV_REGISTER_NAME` = 4116;
public const val `WHvX64RegisterFpMmx5`: `WHV_REGISTER_NAME` = 4117;
public const val `WHvX64RegisterFpMmx6`: `WHV_REGISTER_NAME` = 4118;
public const val `WHvX64RegisterFpMmx7`: `WHV_REGISTER_NAME` = 4119;
public const val `WHvX64RegisterFs`: `WHV_REGISTER_NAME` = 22;
public const val `WHvX64RegisterGdtr`: `WHV_REGISTER_NAME` = 27;
public const val `WHvX64RegisterGs`: `WHV_REGISTER_NAME` = 23;
public const val `WHvX64RegisterHypercall`: `WHV_REGISTER_NAME` = 20481;
public const val `WHvX64RegisterIdtr`: `WHV_REGISTER_NAME` = 26;
public const val `WHvX64RegisterInitialApicId`: `WHV_REGISTER_NAME` = 8204;
public const val `WHvX64RegisterInterruptSspTableAddr`: `WHV_REGISTER_NAME` = 8339;
public const val `WHvX64RegisterKernelGsBase`: `WHV_REGISTER_NAME` = 8194;
public const val `WHvX64RegisterLdtr`: `WHV_REGISTER_NAME` = 24;
public const val `WHvX64RegisterLstar`: `WHV_REGISTER_NAME` = 8201;
public const val `WHvX64RegisterMCount`: `WHV_REGISTER_NAME` = 8318;
public const val `WHvX64RegisterMsrMtrrCap`: `WHV_REGISTER_NAME` = 8205;
public const val `WHvX64RegisterMsrMtrrDefType`: `WHV_REGISTER_NAME` = 8206;
public const val `WHvX64RegisterMsrMtrrFix16k80000`: `WHV_REGISTER_NAME` = 8305;
public const val `WHvX64RegisterMsrMtrrFix16kA0000`: `WHV_REGISTER_NAME` = 8306;
public const val `WHvX64RegisterMsrMtrrFix4kC0000`: `WHV_REGISTER_NAME` = 8307;
public const val `WHvX64RegisterMsrMtrrFix4kC8000`: `WHV_REGISTER_NAME` = 8308;
public const val `WHvX64RegisterMsrMtrrFix4kD0000`: `WHV_REGISTER_NAME` = 8309;
public const val `WHvX64RegisterMsrMtrrFix4kD8000`: `WHV_REGISTER_NAME` = 8310;
public const val `WHvX64RegisterMsrMtrrFix4kE0000`: `WHV_REGISTER_NAME` = 8311;
public const val `WHvX64RegisterMsrMtrrFix4kE8000`: `WHV_REGISTER_NAME` = 8312;
public const val `WHvX64RegisterMsrMtrrFix4kF0000`: `WHV_REGISTER_NAME` = 8313;
public const val `WHvX64RegisterMsrMtrrFix4kF8000`: `WHV_REGISTER_NAME` = 8314;
public const val `WHvX64RegisterMsrMtrrFix64k00000`: `WHV_REGISTER_NAME` = 8304;
public const val `WHvX64RegisterMsrMtrrPhysBase0`: `WHV_REGISTER_NAME` = 8208;
public const val `WHvX64RegisterMsrMtrrPhysBase1`: `WHV_REGISTER_NAME` = 8209;
public const val `WHvX64RegisterMsrMtrrPhysBase2`: `WHV_REGISTER_NAME` = 8210;
public const val `WHvX64RegisterMsrMtrrPhysBase3`: `WHV_REGISTER_NAME` = 8211;
public const val `WHvX64RegisterMsrMtrrPhysBase4`: `WHV_REGISTER_NAME` = 8212;
public const val `WHvX64RegisterMsrMtrrPhysBase5`: `WHV_REGISTER_NAME` = 8213;
public const val `WHvX64RegisterMsrMtrrPhysBase6`: `WHV_REGISTER_NAME` = 8214;
public const val `WHvX64RegisterMsrMtrrPhysBase7`: `WHV_REGISTER_NAME` = 8215;
public const val `WHvX64RegisterMsrMtrrPhysBase8`: `WHV_REGISTER_NAME` = 8216;
public const val `WHvX64RegisterMsrMtrrPhysBase9`: `WHV_REGISTER_NAME` = 8217;
public const val `WHvX64RegisterMsrMtrrPhysBaseA`: `WHV_REGISTER_NAME` = 8218;
public const val `WHvX64RegisterMsrMtrrPhysBaseB`: `WHV_REGISTER_NAME` = 8219;
public const val `WHvX64RegisterMsrMtrrPhysBaseC`: `WHV_REGISTER_NAME` = 8220;
public const val `WHvX64RegisterMsrMtrrPhysBaseD`: `WHV_REGISTER_NAME` = 8221;
public const val `WHvX64RegisterMsrMtrrPhysBaseE`: `WHV_REGISTER_NAME` = 8222;
public const val `WHvX64RegisterMsrMtrrPhysBaseF`: `WHV_REGISTER_NAME` = 8223;
public const val `WHvX64RegisterMsrMtrrPhysMask0`: `WHV_REGISTER_NAME` = 8256;
public const val `WHvX64RegisterMsrMtrrPhysMask1`: `WHV_REGISTER_NAME` = 8257;
public const val `WHvX64RegisterMsrMtrrPhysMask2`: `WHV_REGISTER_NAME` = 8258;
public const val `WHvX64RegisterMsrMtrrPhysMask3`: `WHV_REGISTER_NAME` = 8259;
public const val `WHvX64RegisterMsrMtrrPhysMask4`: `WHV_REGISTER_NAME` = 8260;
public const val `WHvX64RegisterMsrMtrrPhysMask5`: `WHV_REGISTER_NAME` = 8261;
public const val `WHvX64RegisterMsrMtrrPhysMask6`: `WHV_REGISTER_NAME` = 8262;
public const val `WHvX64RegisterMsrMtrrPhysMask7`: `WHV_REGISTER_NAME` = 8263;
public const val `WHvX64RegisterMsrMtrrPhysMask8`: `WHV_REGISTER_NAME` = 8264;
public const val `WHvX64RegisterMsrMtrrPhysMask9`: `WHV_REGISTER_NAME` = 8265;
public const val `WHvX64RegisterMsrMtrrPhysMaskA`: `WHV_REGISTER_NAME` = 8266;
public const val `WHvX64RegisterMsrMtrrPhysMaskB`: `WHV_REGISTER_NAME` = 8267;
public const val `WHvX64RegisterMsrMtrrPhysMaskC`: `WHV_REGISTER_NAME` = 8268;
public const val `WHvX64RegisterMsrMtrrPhysMaskD`: `WHV_REGISTER_NAME` = 8269;
public const val `WHvX64RegisterMsrMtrrPhysMaskE`: `WHV_REGISTER_NAME` = 8270;
public const val `WHvX64RegisterMsrMtrrPhysMaskF`: `WHV_REGISTER_NAME` = 8271;
public const val `WHvX64RegisterPat`: `WHV_REGISTER_NAME` = 8196;
public const val `WHvX64RegisterPendingDebugException`: `WHV_REGISTER_NAME` = -2147483642;
public const val `WHvX64RegisterPl0Ssp`: `WHV_REGISTER_NAME` = 8335;
public const val `WHvX64RegisterPl1Ssp`: `WHV_REGISTER_NAME` = 8336;
public const val `WHvX64RegisterPl2Ssp`: `WHV_REGISTER_NAME` = 8337;
public const val `WHvX64RegisterPl3Ssp`: `WHV_REGISTER_NAME` = 8338;
public const val `WHvX64RegisterPredCmd`: `WHV_REGISTER_NAME` = 8325;
public const val `WHvX64RegisterR10`: `WHV_REGISTER_NAME` = 10;
public const val `WHvX64RegisterR11`: `WHV_REGISTER_NAME` = 11;
public const val `WHvX64RegisterR12`: `WHV_REGISTER_NAME` = 12;
public const val `WHvX64RegisterR13`: `WHV_REGISTER_NAME` = 13;
public const val `WHvX64RegisterR14`: `WHV_REGISTER_NAME` = 14;
public const val `WHvX64RegisterR15`: `WHV_REGISTER_NAME` = 15;
public const val `WHvX64RegisterR8`: `WHV_REGISTER_NAME` = 8;
public const val `WHvX64RegisterR9`: `WHV_REGISTER_NAME` = 9;
public const val `WHvX64RegisterRax`: `WHV_REGISTER_NAME` = 0;
public const val `WHvX64RegisterRbp`: `WHV_REGISTER_NAME` = 5;
public const val `WHvX64RegisterRbx`: `WHV_REGISTER_NAME` = 3;
public const val `WHvX64RegisterRcx`: `WHV_REGISTER_NAME` = 1;
public const val `WHvX64RegisterRdi`: `WHV_REGISTER_NAME` = 7;
public const val `WHvX64RegisterRdx`: `WHV_REGISTER_NAME` = 2;
public const val `WHvX64RegisterRflags`: `WHV_REGISTER_NAME` = 17;
public const val `WHvX64RegisterRip`: `WHV_REGISTER_NAME` = 16;
public const val `WHvX64RegisterRsi`: `WHV_REGISTER_NAME` = 6;
public const val `WHvX64RegisterRsp`: `WHV_REGISTER_NAME` = 4;
public const val `WHvX64RegisterSCet`: `WHV_REGISTER_NAME` = 8333;
public const val `WHvX64RegisterSfmask`: `WHV_REGISTER_NAME` = 8203;
public const val `WHvX64RegisterSpecCtrl`: `WHV_REGISTER_NAME` = 8324;
public const val `WHvX64RegisterSs`: `WHV_REGISTER_NAME` = 20;
public const val `WHvX64RegisterSsp`: `WHV_REGISTER_NAME` = 8334;
public const val `WHvX64RegisterStar`: `WHV_REGISTER_NAME` = 8200;
public const val `WHvX64RegisterSysenterCs`: `WHV_REGISTER_NAME` = 8197;
public const val `WHvX64RegisterSysenterEip`: `WHV_REGISTER_NAME` = 8198;
public const val `WHvX64RegisterSysenterEsp`: `WHV_REGISTER_NAME` = 8199;
public const val `WHvX64RegisterTr`: `WHV_REGISTER_NAME` = 25;
public const val `WHvX64RegisterTsc`: `WHV_REGISTER_NAME` = 8192;
public const val `WHvX64RegisterTscAdjust`: `WHV_REGISTER_NAME` = 8342;
public const val `WHvX64RegisterTscAux`: `WHV_REGISTER_NAME` = 8315;
public const val `WHvX64RegisterTscDeadline`: `WHV_REGISTER_NAME` = 8341;
public const val `WHvX64RegisterTscVirtualOffset`: `WHV_REGISTER_NAME` = 8327;
public const val `WHvX64RegisterTsxCtrl`: `WHV_REGISTER_NAME` = 8328;
public const val `WHvX64RegisterUCet`: `WHV_REGISTER_NAME` = 8332;
public const val `WHvX64RegisterUmwaitControl`: `WHV_REGISTER_NAME` = 8344;
public const val `WHvX64RegisterVirtualCr0`: `WHV_REGISTER_NAME` = 40;
public const val `WHvX64RegisterVirtualCr3`: `WHV_REGISTER_NAME` = 41;
public const val `WHvX64RegisterVirtualCr4`: `WHV_REGISTER_NAME` = 42;
public const val `WHvX64RegisterVirtualCr8`: `WHV_REGISTER_NAME` = 43;
public const val `WHvX64RegisterXCr0`: `WHV_REGISTER_NAME` = 39;
public const val `WHvX64RegisterXfd`: `WHV_REGISTER_NAME` = 8345;
public const val `WHvX64RegisterXfdErr`: `WHV_REGISTER_NAME` = 8346;
public const val `WHvX64RegisterXmm0`: `WHV_REGISTER_NAME` = 4096;
public const val `WHvX64RegisterXmm1`: `WHV_REGISTER_NAME` = 4097;
public const val `WHvX64RegisterXmm10`: `WHV_REGISTER_NAME` = 4106;
public const val `WHvX64RegisterXmm11`: `WHV_REGISTER_NAME` = 4107;
public const val `WHvX64RegisterXmm12`: `WHV_REGISTER_NAME` = 4108;
public const val `WHvX64RegisterXmm13`: `WHV_REGISTER_NAME` = 4109;
public const val `WHvX64RegisterXmm14`: `WHV_REGISTER_NAME` = 4110;
public const val `WHvX64RegisterXmm15`: `WHV_REGISTER_NAME` = 4111;
public const val `WHvX64RegisterXmm2`: `WHV_REGISTER_NAME` = 4098;
public const val `WHvX64RegisterXmm3`: `WHV_REGISTER_NAME` = 4099;
public const val `WHvX64RegisterXmm4`: `WHV_REGISTER_NAME` = 4100;
public const val `WHvX64RegisterXmm5`: `WHV_REGISTER_NAME` = 4101;
public const val `WHvX64RegisterXmm6`: `WHV_REGISTER_NAME` = 4102;
public const val `WHvX64RegisterXmm7`: `WHV_REGISTER_NAME` = 4103;
public const val `WHvX64RegisterXmm8`: `WHV_REGISTER_NAME` = 4104;
public const val `WHvX64RegisterXmm9`: `WHV_REGISTER_NAME` = 4105;
public const val `WHvX64RegisterXmmControlStatus`: `WHV_REGISTER_NAME` = 4121;
public const val `WHvX64RegisterXss`: `WHV_REGISTER_NAME` = 8331;
public const val `X64_RegisterCr0`: `REGISTER_ID` = 44;
public const val `X64_RegisterCr2`: `REGISTER_ID` = 45;
public const val `X64_RegisterCr3`: `REGISTER_ID` = 46;
public const val `X64_RegisterCr4`: `REGISTER_ID` = 47;
public const val `X64_RegisterCr8`: `REGISTER_ID` = 48;
public const val `X64_RegisterCs`: `REGISTER_ID` = 57;
public const val `X64_RegisterDr0`: `REGISTER_ID` = 50;
public const val `X64_RegisterDr1`: `REGISTER_ID` = 51;
public const val `X64_RegisterDr2`: `REGISTER_ID` = 52;
public const val `X64_RegisterDr3`: `REGISTER_ID` = 53;
public const val `X64_RegisterDr6`: `REGISTER_ID` = 54;
public const val `X64_RegisterDr7`: `REGISTER_ID` = 55;
public const val `X64_RegisterDs`: `REGISTER_ID` = 59;
public const val `X64_RegisterEfer`: `REGISTER_ID` = 49;
public const val `X64_RegisterEs`: `REGISTER_ID` = 56;
public const val `X64_RegisterFpControlStatus`: `REGISTER_ID` = 42;
public const val `X64_RegisterFpMmx0`: `REGISTER_ID` = 34;
public const val `X64_RegisterFpMmx1`: `REGISTER_ID` = 35;
public const val `X64_RegisterFpMmx2`: `REGISTER_ID` = 36;
public const val `X64_RegisterFpMmx3`: `REGISTER_ID` = 37;
public const val `X64_RegisterFpMmx4`: `REGISTER_ID` = 38;
public const val `X64_RegisterFpMmx5`: `REGISTER_ID` = 39;
public const val `X64_RegisterFpMmx6`: `REGISTER_ID` = 40;
public const val `X64_RegisterFpMmx7`: `REGISTER_ID` = 41;
public const val `X64_RegisterFs`: `REGISTER_ID` = 60;
public const val `X64_RegisterGdtr`: `REGISTER_ID` = 65;
public const val `X64_RegisterGs`: `REGISTER_ID` = 61;
public const val `X64_RegisterIdtr`: `REGISTER_ID` = 64;
public const val `X64_RegisterLdtr`: `REGISTER_ID` = 62;
public const val `X64_RegisterMax`: `REGISTER_ID` = 66;
public const val `X64_RegisterR10`: `REGISTER_ID` = 10;
public const val `X64_RegisterR11`: `REGISTER_ID` = 11;
public const val `X64_RegisterR12`: `REGISTER_ID` = 12;
public const val `X64_RegisterR13`: `REGISTER_ID` = 13;
public const val `X64_RegisterR14`: `REGISTER_ID` = 14;
public const val `X64_RegisterR15`: `REGISTER_ID` = 15;
public const val `X64_RegisterR8`: `REGISTER_ID` = 8;
public const val `X64_RegisterR9`: `REGISTER_ID` = 9;
public const val `X64_RegisterRFlags`: `REGISTER_ID` = 17;
public const val `X64_RegisterRax`: `REGISTER_ID` = 0;
public const val `X64_RegisterRbp`: `REGISTER_ID` = 5;
public const val `X64_RegisterRbx`: `REGISTER_ID` = 3;
public const val `X64_RegisterRcx`: `REGISTER_ID` = 1;
public const val `X64_RegisterRdi`: `REGISTER_ID` = 7;
public const val `X64_RegisterRdx`: `REGISTER_ID` = 2;
public const val `X64_RegisterRip`: `REGISTER_ID` = 16;
public const val `X64_RegisterRsi`: `REGISTER_ID` = 6;
public const val `X64_RegisterRsp`: `REGISTER_ID` = 4;
public const val `X64_RegisterSs`: `REGISTER_ID` = 58;
public const val `X64_RegisterTr`: `REGISTER_ID` = 63;
public const val `X64_RegisterXmm0`: `REGISTER_ID` = 18;
public const val `X64_RegisterXmm1`: `REGISTER_ID` = 19;
public const val `X64_RegisterXmm10`: `REGISTER_ID` = 28;
public const val `X64_RegisterXmm11`: `REGISTER_ID` = 29;
public const val `X64_RegisterXmm12`: `REGISTER_ID` = 30;
public const val `X64_RegisterXmm13`: `REGISTER_ID` = 31;
public const val `X64_RegisterXmm14`: `REGISTER_ID` = 32;
public const val `X64_RegisterXmm15`: `REGISTER_ID` = 33;
public const val `X64_RegisterXmm2`: `REGISTER_ID` = 20;
public const val `X64_RegisterXmm3`: `REGISTER_ID` = 21;
public const val `X64_RegisterXmm4`: `REGISTER_ID` = 22;
public const val `X64_RegisterXmm5`: `REGISTER_ID` = 23;
public const val `X64_RegisterXmm6`: `REGISTER_ID` = 24;
public const val `X64_RegisterXmm7`: `REGISTER_ID` = 25;
public const val `X64_RegisterXmm8`: `REGISTER_ID` = 26;
public const val `X64_RegisterXmm9`: `REGISTER_ID` = 27;
public const val `X64_RegisterXmmControlStatus`: `REGISTER_ID` = 43;
