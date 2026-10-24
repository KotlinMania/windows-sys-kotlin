// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ApplyGuestMemoryFix(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, virtualaddress : u64, fixbuffer : *const core::ffi::c_void, fixbuffersize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ApplyPendingSavedStateFileReplayLog(vmrsfile : windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn CallStackUnwind(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, imageinfo : *const MODULE_INFO, imageinfocount : u32, framecount : u32, callstack : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn FindSavedStateSymbolFieldInType(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, typename : windows_sys::core::PCSTR, fieldname : windows_sys::core::PCWSTR, offset : *mut u32, found : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ForceActiveVirtualTrustLevel(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, virtualtrustlevel : u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ForceArchitecture(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, architecture : VIRTUAL_PROCESSOR_ARCH) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ForceNestedHostMode(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, hostmode : windows_sys::core::BOOL, oldmode : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ForcePagingMode(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, pagingmode : PAGING_MODE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetActiveVirtualTrustLevel(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, virtualtrustlevel : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetArchitecture(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, architecture : *mut VIRTUAL_PROCESSOR_ARCH) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetEnabledVirtualTrustLevels(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, virtualtrustlevels : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle : *mut core::ffi::c_void, virtualtrustlevels : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetGuestOsInfo(vmsavedstatedumphandle : *mut core::ffi::c_void, virtualtrustlevel : u8, guestosinfo : *mut GUEST_OS_INFO) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle : *mut core::ffi::c_void, memorychunkpagesize : *mut u64, memorychunks : *mut GPA_MEMORY_CHUNK, memorychunkcount : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetGuestRawSavedMemorySize(vmsavedstatedumphandle : *mut core::ffi::c_void, guestrawsavedmemorysize : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetMemoryBlockCacheLimit(vmsavedstatedumphandle : *mut core::ffi::c_void, memoryblockcachelimit : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetNestedVirtualizationMode(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, enabled : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetPagingMode(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, pagingmode : *mut PAGING_MODE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetRegisterValue(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, registerid : u32, registervalue : *mut VIRTUAL_PROCESSOR_REGISTER) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, typename : windows_sys::core::PCSTR, typefieldinfomap : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle : *mut core::ffi::c_void) -> super::super::Foundation:: HANDLE);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetSavedStateSymbolTypeSize(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, typename : windows_sys::core::PCSTR, size : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GetVpCount(vmsavedstatedumphandle : *mut core::ffi::c_void, vpcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle : *mut core::ffi::c_void, physicaladdress : u64, rawsavedmemoryoffset : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, virtualaddress : u64, physicaladdress : *mut u64, unmappedregionsize : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvCreateDeviceInstance(devicehosthandle : *const core::ffi::c_void, devicetype : HDV_DEVICE_TYPE, deviceclassid : *const windows_sys::core::GUID, deviceinstanceid : *const windows_sys::core::GUID, deviceinterface : *const core::ffi::c_void, devicecontext : *const core::ffi::c_void, devicehandle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvCreateGuestMemoryAperture(requestor : *const core::ffi::c_void, guestphysicaladdress : u64, bytecount : u32, writeprotected : windows_sys::core::BOOL, mappedaddress : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvCreateSectionBackedMmioRange(requestor : *const core::ffi::c_void, barindex : HDV_PCI_BAR_SELECTOR, offsetinpages : u64, lengthinpages : u64, mappingflags : HDV_MMIO_MAPPING_FLAGS, sectionhandle : super::super::Foundation:: HANDLE, sectionoffsetinpages : u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvDeliverGuestInterrupt(requestor : *const core::ffi::c_void, msiaddress : u64, msidata : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvDestroyGuestMemoryAperture(requestor : *const core::ffi::c_void, mappedaddress : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvDestroySectionBackedMmioRange(requestor : *const core::ffi::c_void, barindex : HDV_PCI_BAR_SELECTOR, offsetinpages : u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_HostComputeSystem")]
// windows_link::link!("vmdevicehost.dll" "system" fn HdvInitializeDeviceHost(computesystem : super::HostComputeSystem:: HCS_SYSTEM, devicehosthandle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_HostComputeSystem")]
// windows_link::link!("vmdevicehost.dll" "system" fn HdvInitializeDeviceHostEx(computesystem : super::HostComputeSystem:: HCS_SYSTEM, flags : HDV_DEVICE_HOST_FLAGS, devicehosthandle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvReadGuestMemory(requestor : *const core::ffi::c_void, guestphysicaladdress : u64, bytecount : u32, buffer : *mut u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvRegisterDoorbell(requestor : *const core::ffi::c_void, barindex : HDV_PCI_BAR_SELECTOR, baroffset : u64, triggervalue : u64, flags : u64, doorbellevent : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvTeardownDeviceHost(devicehosthandle : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvUnregisterDoorbell(requestor : *const core::ffi::c_void, barindex : HDV_PCI_BAR_SELECTOR, baroffset : u64, triggervalue : u64, flags : u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("vmdevicehost.dll" "system" fn HdvWriteGuestMemory(requestor : *const core::ffi::c_void, guestphysicaladdress : u64, bytecount : u32, buffer : *const u8) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn InKernelSpace(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, inkernelspace : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, activevirtualtrustlevelenabled : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn IsNestedVirtualizationEnabled(vmsavedstatedumphandle : *mut core::ffi::c_void, enabled : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn LoadSavedStateFile(vmrsfile : windows_sys::core::PCWSTR, vmsavedstatedumphandle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn LoadSavedStateFiles(binfile : windows_sys::core::PCWSTR, vsvfile : windows_sys::core::PCWSTR, vmsavedstatedumphandle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn LoadSavedStateModuleSymbols(vmsavedstatedumphandle : *mut core::ffi::c_void, imagename : windows_sys::core::PCSTR, modulename : windows_sys::core::PCSTR, baseaddress : u64, sizeofbase : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle : *mut core::ffi::c_void, imagename : windows_sys::core::PCSTR, imagetimestamp : u32, modulename : windows_sys::core::PCSTR, baseaddress : u64, sizeofbase : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn LoadSavedStateSymbolProvider(vmsavedstatedumphandle : *mut core::ffi::c_void, usersymbols : windows_sys::core::PCWSTR, force : windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn LocateSavedStateFiles(vmname : windows_sys::core::PCWSTR, snapshotname : windows_sys::core::PCWSTR, binpath : *mut windows_sys::core::PWSTR, vsvpath : *mut windows_sys::core::PWSTR, vmrspath : *mut windows_sys::core::PWSTR) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ReadGuestPhysicalAddress(vmsavedstatedumphandle : *mut core::ffi::c_void, physicaladdress : u64, buffer : *mut core::ffi::c_void, buffersize : u32, bytesread : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ReadGuestRawSavedMemory(vmsavedstatedumphandle : *mut core::ffi::c_void, rawsavedmemoryoffset : u64, buffer : *mut core::ffi::c_void, buffersize : u32, bytesread : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ReadSavedStateGlobalVariable(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, globalname : windows_sys::core::PCSTR, buffer : *mut core::ffi::c_void, buffersize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ReleaseSavedStateFiles(vmsavedstatedumphandle : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, globalname : windows_sys::core::PCSTR, virtualaddress : *mut u64, size : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn ScanMemoryForDosImages(vmsavedstatedumphandle : *mut core::ffi::c_void, vpid : u32, startaddress : u64, endaddress : u64, callbackcontext : *mut core::ffi::c_void, foundimagecallback : FOUND_IMAGE_CALLBACK, standaloneaddress : *const u64, standaloneaddresscount : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn SetMemoryBlockCacheLimit(vmsavedstatedumphandle : *mut core::ffi::c_void, memoryblockcachelimit : u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("vmsavedstatedumpprovider.dll" "system" fn SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle : *mut core::ffi::c_void, callback : GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvAcceptPartitionMigration(migrationhandle : super::super::Foundation:: HANDLE, partition : *mut WHV_PARTITION_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvAdviseGpaRange(partition : WHV_PARTITION_HANDLE, gparanges : *const WHV_MEMORY_RANGE_ENTRY, gparangescount : u32, advice : WHV_ADVISE_GPA_RANGE_CODE, advicebuffer : *const core::ffi::c_void, advicebuffersizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvAllocateVpciResource(providerid : *const windows_sys::core::GUID, flags : WHV_ALLOCATE_VPCI_RESOURCE_FLAGS, resourcedescriptor : *const core::ffi::c_void, resourcedescriptorsizeinbytes : u32, vpciresource : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvCancelPartitionMigration(partition : WHV_PARTITION_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvCancelRunVirtualProcessor(partition : WHV_PARTITION_HANDLE, vpindex : u32, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvCompletePartitionMigration(partition : WHV_PARTITION_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvCreateNotificationPort(partition : WHV_PARTITION_HANDLE, parameters : *const WHV_NOTIFICATION_PORT_PARAMETERS, eventhandle : super::super::Foundation:: HANDLE, porthandle : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvCreatePartition(partition : *mut WHV_PARTITION_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvCreateTrigger(partition : WHV_PARTITION_HANDLE, parameters : *const WHV_TRIGGER_PARAMETERS, triggerhandle : *mut *mut core::ffi::c_void, eventhandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvCreateVirtualProcessor(partition : WHV_PARTITION_HANDLE, vpindex : u32, flags : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvCreateVirtualProcessor2(partition : WHV_PARTITION_HANDLE, vpindex : u32, properties : *const WHV_VIRTUAL_PROCESSOR_PROPERTY, propertycount : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvCreateVpciDevice(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, vpciresource : super::super::Foundation:: HANDLE, flags : WHV_CREATE_VPCI_DEVICE_FLAGS, notificationeventhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvDeleteNotificationPort(partition : WHV_PARTITION_HANDLE, porthandle : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvDeletePartition(partition : WHV_PARTITION_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvDeleteTrigger(partition : WHV_PARTITION_HANDLE, triggerhandle : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvDeleteVirtualProcessor(partition : WHV_PARTITION_HANDLE, vpindex : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvDeleteVpciDevice(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("winhvemulation.dll" "system" fn WHvEmulatorCreateEmulator(callbacks : *const WHV_EMULATOR_CALLBACKS, emulator : *mut *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("winhvemulation.dll" "system" fn WHvEmulatorDestroyEmulator(emulator : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("winhvemulation.dll" "system" fn WHvEmulatorTryIoEmulation(emulator : *const core::ffi::c_void, context : *const core::ffi::c_void, vpcontext : *const WHV_VP_EXIT_CONTEXT, ioinstructioncontext : *const WHV_X64_IO_PORT_ACCESS_CONTEXT, emulatorreturnstatus : *mut WHV_EMULATOR_STATUS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("winhvemulation.dll" "system" fn WHvEmulatorTryMmioEmulation(emulator : *const core::ffi::c_void, context : *const core::ffi::c_void, vpcontext : *const WHV_VP_EXIT_CONTEXT, mmioinstructioncontext : *const WHV_MEMORY_ACCESS_CONTEXT, emulatorreturnstatus : *mut WHV_EMULATOR_STATUS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetCapability(capabilitycode : WHV_CAPABILITY_CODE, capabilitybuffer : *mut core::ffi::c_void, capabilitybuffersizeinbytes : u32, writtensizeinbytes : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetInterruptTargetVpSet(partition : WHV_PARTITION_HANDLE, destination : u64, destinationmode : WHV_INTERRUPT_DESTINATION_MODE, targetvps : *mut u32, vpcount : u32, targetvpcount : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetPartitionCounters(partition : WHV_PARTITION_HANDLE, counterset : WHV_PARTITION_COUNTER_SET, buffer : *mut core::ffi::c_void, buffersizeinbytes : u32, byteswritten : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetPartitionProperty(partition : WHV_PARTITION_HANDLE, propertycode : WHV_PARTITION_PROPERTY_CODE, propertybuffer : *mut core::ffi::c_void, propertybuffersizeinbytes : u32, writtensizeinbytes : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVirtualProcessorCounters(partition : WHV_PARTITION_HANDLE, vpindex : u32, counterset : WHV_PROCESSOR_COUNTER_SET, buffer : *mut core::ffi::c_void, buffersizeinbytes : u32, byteswritten : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVirtualProcessorCpuidOutput(partition : WHV_PARTITION_HANDLE, vpindex : u32, eax : u32, ecx : u32, cpuidoutput : *mut WHV_CPUID_OUTPUT) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVirtualProcessorInterruptControllerState(partition : WHV_PARTITION_HANDLE, vpindex : u32, state : *mut core::ffi::c_void, statesize : u32, writtensize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVirtualProcessorInterruptControllerState2(partition : WHV_PARTITION_HANDLE, vpindex : u32, state : *mut core::ffi::c_void, statesize : u32, writtensize : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVirtualProcessorRegisters(partition : WHV_PARTITION_HANDLE, vpindex : u32, registernames : *const WHV_REGISTER_NAME, registercount : u32, registervalues : *mut WHV_REGISTER_VALUE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVirtualProcessorState(partition : WHV_PARTITION_HANDLE, vpindex : u32, statetype : WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer : *mut core::ffi::c_void, buffersizeinbytes : u32, byteswritten : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVirtualProcessorXsaveState(partition : WHV_PARTITION_HANDLE, vpindex : u32, buffer : *mut core::ffi::c_void, buffersizeinbytes : u32, byteswritten : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVpciDeviceInterruptTarget(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, index : u32, multimessagenumber : u32, target : *mut WHV_VPCI_INTERRUPT_TARGET, targetsizeinbytes : u32, byteswritten : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVpciDeviceNotification(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, notification : *mut WHV_VPCI_DEVICE_NOTIFICATION, notificationsizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvGetVpciDeviceProperty(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, propertycode : WHV_VPCI_DEVICE_PROPERTY_CODE, propertybuffer : *mut core::ffi::c_void, propertybuffersizeinbytes : u32, writtensizeinbytes : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvMapGpaRange(partition : WHV_PARTITION_HANDLE, sourceaddress : *const core::ffi::c_void, guestaddress : u64, sizeinbytes : u64, flags : WHV_MAP_GPA_RANGE_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvMapGpaRange2(partition : WHV_PARTITION_HANDLE, process : super::super::Foundation:: HANDLE, sourceaddress : *const core::ffi::c_void, guestaddress : u64, sizeinbytes : u64, flags : WHV_MAP_GPA_RANGE_FLAGS) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvMapVpciDeviceInterrupt(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, index : u32, messagecount : u32, target : *const WHV_VPCI_INTERRUPT_TARGET, msiaddress : *mut u64, msidata : *mut u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvMapVpciDeviceMmioRanges(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, mappingcount : *mut u32, mappings : *mut *mut WHV_VPCI_MMIO_MAPPING) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvPostVirtualProcessorSynicMessage(partition : WHV_PARTITION_HANDLE, vpindex : u32, sintindex : u32, message : *const core::ffi::c_void, messagesizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvQueryGpaRangeDirtyBitmap(partition : WHV_PARTITION_HANDLE, guestaddress : u64, rangesizeinbytes : u64, bitmap : *mut u64, bitmapsizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvReadGpaRange(partition : WHV_PARTITION_HANDLE, vpindex : u32, guestaddress : u64, controls : WHV_ACCESS_GPA_CONTROLS, data : *mut core::ffi::c_void, datasizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvReadVpciDeviceRegister(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, register : *const WHV_VPCI_DEVICE_REGISTER, data : *mut core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvRegisterPartitionDoorbellEvent(partition : WHV_PARTITION_HANDLE, matchdata : *const WHV_DOORBELL_MATCH_DATA, eventhandle : super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvRequestInterrupt(partition : WHV_PARTITION_HANDLE, interrupt : *const WHV_INTERRUPT_CONTROL, interruptcontrolsize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvRequestVpciDeviceInterrupt(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, msiaddress : u64, msidata : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvResetPartition(partition : WHV_PARTITION_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvResumePartitionTime(partition : WHV_PARTITION_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvRetargetVpciDeviceInterrupt(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, msiaddress : u64, msidata : u32, target : *const WHV_VPCI_INTERRUPT_TARGET) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 108:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvRunVirtualProcessor(partition : WHV_PARTITION_HANDLE, vpindex : u32, exitcontext : *mut core::ffi::c_void, exitcontextsizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSetNotificationPortProperty(partition : WHV_PARTITION_HANDLE, porthandle : *const core::ffi::c_void, propertycode : WHV_NOTIFICATION_PORT_PROPERTY_CODE, propertyvalue : u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSetPartitionProperty(partition : WHV_PARTITION_HANDLE, propertycode : WHV_PARTITION_PROPERTY_CODE, propertybuffer : *const core::ffi::c_void, propertybuffersizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSetVirtualProcessorInterruptControllerState(partition : WHV_PARTITION_HANDLE, vpindex : u32, state : *const core::ffi::c_void, statesize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSetVirtualProcessorInterruptControllerState2(partition : WHV_PARTITION_HANDLE, vpindex : u32, state : *const core::ffi::c_void, statesize : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 113:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSetVirtualProcessorRegisters(partition : WHV_PARTITION_HANDLE, vpindex : u32, registernames : *const WHV_REGISTER_NAME, registercount : u32, registervalues : *const WHV_REGISTER_VALUE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSetVirtualProcessorState(partition : WHV_PARTITION_HANDLE, vpindex : u32, statetype : WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer : *const core::ffi::c_void, buffersizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 115:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSetVirtualProcessorXsaveState(partition : WHV_PARTITION_HANDLE, vpindex : u32, buffer : *const core::ffi::c_void, buffersizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Power")]
// windows_link::link!("winhvplatform.dll" "system" fn WHvSetVpciDevicePowerState(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, powerstate : super::Power:: DEVICE_POWER_STATE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSetupPartition(partition : WHV_PARTITION_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 119:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSignalVirtualProcessorSynicEvent(partition : WHV_PARTITION_HANDLE, synicevent : WHV_SYNIC_EVENT_PARAMETERS, newlysignaled : *mut windows_sys::core::BOOL) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvStartPartitionMigration(partition : WHV_PARTITION_HANDLE, migrationhandle : *mut super::super::Foundation:: HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 121:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvSuspendPartitionTime(partition : WHV_PARTITION_HANDLE) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvTranslateGva(partition : WHV_PARTITION_HANDLE, vpindex : u32, gva : u64, translateflags : WHV_TRANSLATE_GVA_FLAGS, translationresult : *mut WHV_TRANSLATE_GVA_RESULT, gpa : *mut u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 123:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvUnmapGpaRange(partition : WHV_PARTITION_HANDLE, guestaddress : u64, sizeinbytes : u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvUnmapVpciDeviceInterrupt(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, index : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 125:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvUnmapVpciDeviceMmioRanges(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvUnregisterPartitionDoorbellEvent(partition : WHV_PARTITION_HANDLE, matchdata : *const WHV_DOORBELL_MATCH_DATA) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 127:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvUpdateTriggerParameters(partition : WHV_PARTITION_HANDLE, parameters : *const WHV_TRIGGER_PARAMETERS, triggerhandle : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvWriteGpaRange(partition : WHV_PARTITION_HANDLE, vpindex : u32, guestaddress : u64, controls : WHV_ACCESS_GPA_CONTROLS, data : *const core::ffi::c_void, datasizeinbytes : u32) -> windows_sys::core::HRESULT);

// UNSUPPORTED Rust 129:1: declaration Macro has no candidate rule
// windows_link::link!("winhvplatform.dll" "system" fn WHvWriteVpciDeviceRegister(partition : WHV_PARTITION_HANDLE, logicaldeviceid : u64, register : *const WHV_VPCI_DEVICE_REGISTER, data : *const core::ffi::c_void) -> windows_sys::core::HRESULT);

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
// UNSUPPORTED Rust 226:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct DOS_IMAGE_INFO {
//     pub PdbName: windows_sys::core::PCSTR,
//     pub ImageBaseAddress: u64,
//     pub ImageSize: u32,
//     pub Timestamp: u32,
// }

// UNSUPPORTED Rust 234:1: declaration Impl has no candidate rule
// impl Default for DOS_IMAGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 239:1: generic scalar type unsupported
// pub type FOUND_IMAGE_CALLBACK = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, imageinfo: *const DOS_IMAGE_INFO) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 240:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GPA_MEMORY_CHUNK {
//     pub GuestPhysicalStartPageIndex: u64,
//     pub PageCount: u64,
// }

// UNSUPPORTED Rust 246:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union GUEST_OS_INFO {
//     pub AsUINT64: u64,
//     pub ClosedSource: GUEST_OS_INFO_0,
//     pub OpenSource: GUEST_OS_INFO_1,
// }

// UNSUPPORTED Rust 253:1: declaration Impl has no candidate rule
// impl Default for GUEST_OS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 258:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GUEST_OS_INFO_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 263:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GUEST_OS_INFO_1 {
//     pub _bitfield: u64,
// }

public typealias `GUEST_OS_MICROSOFT_IDS` = Int;
public typealias `GUEST_OS_OPENSOURCE_IDS` = Int;
public typealias `GUEST_OS_VENDOR` = Int;
// UNSUPPORTED Rust 271:1: generic scalar type unsupported
// pub type GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK = Option<unsafe extern "system" fn(infomessage: windows_sys::core::PCSTR)>;

// UNSUPPORTED Rust 272:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 306:1: generic scalar type unsupported
// pub type HDV_PCI_DEVICE_GET_DETAILS = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void, pnpid: *mut HDV_PCI_PNP_ID, probedbarscount: u32, probedbars: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 307:1: generic scalar type unsupported
// pub type HDV_PCI_DEVICE_INITIALIZE = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 308:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HDV_PCI_DEVICE_INTERFACE {
//     pub Version: HDV_PCI_INTERFACE_VERSION,
//     pub Initialize: HDV_PCI_DEVICE_INITIALIZE,
//     pub Teardown: HDV_PCI_DEVICE_TEARDOWN,
//     pub SetConfiguration: HDV_PCI_DEVICE_SET_CONFIGURATION,
//     pub GetDetails: HDV_PCI_DEVICE_GET_DETAILS,
//     pub Start: HDV_PCI_DEVICE_START,
//     pub Stop: HDV_PCI_DEVICE_STOP,
//     pub ReadConfigSpace: HDV_PCI_READ_CONFIG_SPACE,
//     pub WriteConfigSpace: HDV_PCI_WRITE_CONFIG_SPACE,
//     pub ReadInterceptedMemory: HDV_PCI_READ_INTERCEPTED_MEMORY,
//     pub WriteInterceptedMemory: HDV_PCI_WRITE_INTERCEPTED_MEMORY,
// }

// UNSUPPORTED Rust 323:1: generic scalar type unsupported
// pub type HDV_PCI_DEVICE_SET_CONFIGURATION = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void, configurationvaluecount: u32, configurationvalues: *const windows_sys::core::PCWSTR) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 324:1: generic scalar type unsupported
// pub type HDV_PCI_DEVICE_START = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 325:1: generic scalar type unsupported
// pub type HDV_PCI_DEVICE_STOP = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void)>;

// UNSUPPORTED Rust 326:1: generic scalar type unsupported
// pub type HDV_PCI_DEVICE_TEARDOWN = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void)>;

public typealias `HDV_PCI_INTERFACE_VERSION` = Int;
// UNSUPPORTED Rust 328:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HDV_PCI_PNP_ID {
//     pub VendorID: u16,
//     pub DeviceID: u16,
//     pub RevisionID: u8,
//     pub ProgIf: u8,
//     pub SubClass: u8,
//     pub BaseClass: u8,
//     pub SubVendorID: u16,
//     pub SubSystemID: u16,
// }

// UNSUPPORTED Rust 340:1: generic scalar type unsupported
// pub type HDV_PCI_READ_CONFIG_SPACE = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void, offset: u32, value: *mut u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 341:1: generic scalar type unsupported
// pub type HDV_PCI_READ_INTERCEPTED_MEMORY = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void, barindex: HDV_PCI_BAR_SELECTOR, offset: u64, length: u64, value: *mut u8) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 342:1: generic scalar type unsupported
// pub type HDV_PCI_WRITE_CONFIG_SPACE = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void, offset: u32, value: u32) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 343:1: generic scalar type unsupported
// pub type HDV_PCI_WRITE_INTERCEPTED_MEMORY = Option<unsafe extern "system" fn(devicecontext: *const core::ffi::c_void, barindex: HDV_PCI_BAR_SELECTOR, offset: u64, length: u64, value: *const u8) -> windows_sys::core::HRESULT>;

public const val `HVSOCKET_ADDRESS_FLAG_PASSTHRU`: UInt = 1u;
// UNSUPPORTED Rust 345:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct HVSOCKET_ADDRESS_INFO {
//     pub SystemId: windows_sys::core::GUID,
//     pub VirtualMachineId: windows_sys::core::GUID,
//     pub SiloId: windows_sys::core::GUID,
//     pub Flags: u32,
// }

public const val `HVSOCKET_CONNECTED_SUSPEND`: UInt = 4u;
public const val `HVSOCKET_CONNECT_TIMEOUT`: UInt = 1u;
public const val `HVSOCKET_CONNECT_TIMEOUT_MAX`: UInt = 300000u;
public const val `HVSOCKET_HIGH_VTL`: UInt = 8u;
// UNSUPPORTED Rust 357:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const HV_GUID_BROADCAST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xffffffff_ffff_ffff_ffff_ffffffffffff);

// UNSUPPORTED Rust 358:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const HV_GUID_CHILDREN: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x90db8b89_0d35_4f79_8ce9_49ea0ac8b7cd);

// UNSUPPORTED Rust 359:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const HV_GUID_LOOPBACK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe0e16197_dd56_4a10_9195_5ee7a155a838);

// UNSUPPORTED Rust 360:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const HV_GUID_PARENT: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa42e7cda_d03f_480c_9cc2_a4de20abb878);

// UNSUPPORTED Rust 361:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const HV_GUID_SILOHOST: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x36bd0c5c_7276_4223_88ba_7d03b654c568);

// UNSUPPORTED Rust 362:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const HV_GUID_VSOCK_TEMPLATE: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x00000000_facb_11e6_bd58_64006a7986d3);

// UNSUPPORTED Rust 363:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
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
// UNSUPPORTED Rust 375:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MODULE_INFO {
//     pub ProcessImageName: windows_sys::core::PCSTR,
//     pub Image: DOS_IMAGE_INFO,
// }

// UNSUPPORTED Rust 381:1: declaration Impl has no candidate rule
// impl Default for MODULE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

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
// UNSUPPORTED Rust 399:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Networking_WinSock")]
// #[derive(Clone, Copy, Default)]
// pub struct SOCKADDR_HV {
//     pub Family: super::super::Networking::WinSock::ADDRESS_FAMILY,
//     pub Reserved: u16,
//     pub VmId: windows_sys::core::GUID,
//     pub ServiceId: windows_sys::core::GUID,
// }

public typealias `VIRTUAL_PROCESSOR_ARCH` = Int;
// UNSUPPORTED Rust 409:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 419:1: declaration Impl has no candidate rule
// impl Default for VIRTUAL_PROCESSOR_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 424:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIRTUAL_PROCESSOR_REGISTER_0 {
//     pub Low64: u64,
//     pub High64: u64,
// }

// UNSUPPORTED Rust 430:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIRTUAL_PROCESSOR_REGISTER_1 {
//     pub Segment: VIRTUAL_PROCESSOR_REGISTER_1_0,
//     pub Table: VIRTUAL_PROCESSOR_REGISTER_1_1,
//     pub FpControlStatus: VIRTUAL_PROCESSOR_REGISTER_1_2,
//     pub XmmControlStatus: VIRTUAL_PROCESSOR_REGISTER_1_3,
// }

// UNSUPPORTED Rust 438:1: declaration Impl has no candidate rule
// impl Default for VIRTUAL_PROCESSOR_REGISTER_1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 443:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIRTUAL_PROCESSOR_REGISTER_1_2 {
//     pub FpControl: u16,
//     pub FpStatus: u16,
//     pub FpTag: u8,
//     pub Reserved: u8,
//     pub LastFpOp: u16,
//     pub Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_2_0,
// }

// UNSUPPORTED Rust 453:1: declaration Impl has no candidate rule
// impl Default for VIRTUAL_PROCESSOR_REGISTER_1_2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 458:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIRTUAL_PROCESSOR_REGISTER_1_2_0 {
//     pub LastFpRip: u64,
//     pub Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_2_0_0,
// }

// UNSUPPORTED Rust 464:1: declaration Impl has no candidate rule
// impl Default for VIRTUAL_PROCESSOR_REGISTER_1_2_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 469:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIRTUAL_PROCESSOR_REGISTER_1_2_0_0 {
//     pub LastFpEip: u32,
//     pub LastFpCs: u16,
// }

// UNSUPPORTED Rust 475:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIRTUAL_PROCESSOR_REGISTER_1_0 {
//     pub Base: u64,
//     pub Limit: u32,
//     pub Selector: u16,
//     pub Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_0_0,
// }

// UNSUPPORTED Rust 483:1: declaration Impl has no candidate rule
// impl Default for VIRTUAL_PROCESSOR_REGISTER_1_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 488:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIRTUAL_PROCESSOR_REGISTER_1_0_0 {
//     pub Attributes: u16,
//     pub Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_0_0_0,
// }

// UNSUPPORTED Rust 494:1: declaration Impl has no candidate rule
// impl Default for VIRTUAL_PROCESSOR_REGISTER_1_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 499:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIRTUAL_PROCESSOR_REGISTER_1_0_0_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 504:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIRTUAL_PROCESSOR_REGISTER_1_1 {
//     pub Limit: u16,
//     pub Base: u64,
// }

// UNSUPPORTED Rust 510:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct VIRTUAL_PROCESSOR_REGISTER_1_3 {
//     pub Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_3_0,
//     pub XmmStatusControl: u32,
//     pub XmmStatusControlMask: u32,
// }

// UNSUPPORTED Rust 517:1: declaration Impl has no candidate rule
// impl Default for VIRTUAL_PROCESSOR_REGISTER_1_3 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 522:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union VIRTUAL_PROCESSOR_REGISTER_1_3_0 {
//     pub LastFpRdp: u64,
//     pub Anonymous: VIRTUAL_PROCESSOR_REGISTER_1_3_0_0,
// }

// UNSUPPORTED Rust 528:1: declaration Impl has no candidate rule
// impl Default for VIRTUAL_PROCESSOR_REGISTER_1_3_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 533:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VIRTUAL_PROCESSOR_REGISTER_1_3_0_0 {
//     pub LastFpDp: u32,
//     pub LastFpDs: u16,
// }

public typealias `VIRTUAL_PROCESSOR_VENDOR` = Int;
// UNSUPPORTED Rust 540:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct VM_GENCOUNTER {
//     pub GenerationCount: u64,
//     pub GenerationCountHigh: u64,
// }

// UNSUPPORTED Rust 546:1: non-scalar type Ptr unsupported
// pub const VM_GENCOUNTER_SYMBOLIC_LINK_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("\\VmGenerationCounter");

// UNSUPPORTED Rust 547:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_ACCESS_GPA_CONTROLS {
//     pub AsUINT64: u64,
//     pub Anonymous: WHV_ACCESS_GPA_CONTROLS_0,
// }

// UNSUPPORTED Rust 553:1: declaration Impl has no candidate rule
// impl Default for WHV_ACCESS_GPA_CONTROLS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 558:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_ACCESS_GPA_CONTROLS_0 {
//     pub CacheType: WHV_CACHE_TYPE,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 564:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_ADVISE_GPA_RANGE {
//     pub Populate: WHV_ADVISE_GPA_RANGE_POPULATE,
// }

// UNSUPPORTED Rust 569:1: declaration Impl has no candidate rule
// impl Default for WHV_ADVISE_GPA_RANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WHV_ADVISE_GPA_RANGE_CODE` = Int;
// UNSUPPORTED Rust 575:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_ADVISE_GPA_RANGE_POPULATE {
//     pub Flags: WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS,
//     pub AccessType: WHV_MEMORY_ACCESS_TYPE,
// }

// UNSUPPORTED Rust 581:1: declaration Impl has no candidate rule
// impl Default for WHV_ADVISE_GPA_RANGE_POPULATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 586:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS {
//     pub AsUINT32: u32,
//     pub Anonymous: WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS_0,
// }

// UNSUPPORTED Rust 592:1: declaration Impl has no candidate rule
// impl Default for WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 597:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_ADVISE_GPA_RANGE_POPULATE_FLAGS_0 {
//     pub _bitfield: u32,
// }

public typealias `WHV_ALLOCATE_VPCI_RESOURCE_FLAGS` = Int;
public const val `WHV_ANY_VP`: UInt = 4294967295u;
public typealias `WHV_CACHE_TYPE` = Int;
// UNSUPPORTED Rust 605:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 626:1: declaration Impl has no candidate rule
// impl Default for WHV_CAPABILITY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WHV_CAPABILITY_CODE` = Int;
// UNSUPPORTED Rust 632:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_CAPABILITY_FEATURES {
//     pub Anonymous: WHV_CAPABILITY_FEATURES_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 638:1: declaration Impl has no candidate rule
// impl Default for WHV_CAPABILITY_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 643:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_CAPABILITY_FEATURES_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 648:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_CAPABILITY_PROCESSOR_FREQUENCY_CAP {
//     pub _bitfield: u32,
//     pub HighestFrequencyMhz: u32,
//     pub NominalFrequencyMhz: u32,
//     pub LowestFrequencyMhz: u32,
//     pub FrequencyStepMhz: u32,
// }

// UNSUPPORTED Rust 657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_CPUID_OUTPUT {
//     pub Eax: u32,
//     pub Ebx: u32,
//     pub Ecx: u32,
//     pub Edx: u32,
// }

public typealias `WHV_CREATE_VPCI_DEVICE_FLAGS` = Int;
// UNSUPPORTED Rust 666:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_DOORBELL_MATCH_DATA {
//     pub GuestAddress: u64,
//     pub Value: u64,
//     pub Length: u32,
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 674:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_EMULATOR_CALLBACKS {
//     pub Size: u32,
//     pub Reserved: u32,
//     pub WHvEmulatorIoPortCallback: WHV_EMULATOR_IO_PORT_CALLBACK,
//     pub WHvEmulatorMemoryCallback: WHV_EMULATOR_MEMORY_CALLBACK,
//     pub WHvEmulatorGetVirtualProcessorRegisters: WHV_EMULATOR_GET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK,
//     pub WHvEmulatorSetVirtualProcessorRegisters: WHV_EMULATOR_SET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK,
//     pub WHvEmulatorTranslateGvaPage: WHV_EMULATOR_TRANSLATE_GVA_PAGE_CALLBACK,
// }

// UNSUPPORTED Rust 685:1: generic scalar type unsupported
// pub type WHV_EMULATOR_GET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, registernames: *const WHV_REGISTER_NAME, registercount: u32, registervalues: *mut WHV_REGISTER_VALUE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 686:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_EMULATOR_IO_ACCESS_INFO {
//     pub Direction: u8,
//     pub Port: u16,
//     pub AccessSize: u16,
//     pub Data: u32,
// }

// UNSUPPORTED Rust 694:1: generic scalar type unsupported
// pub type WHV_EMULATOR_IO_PORT_CALLBACK = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, ioaccess: *mut WHV_EMULATOR_IO_ACCESS_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 695:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_EMULATOR_MEMORY_ACCESS_INFO {
//     pub GpaAddress: u64,
//     pub Direction: u8,
//     pub AccessSize: u8,
//     pub Data: [u8; 8],
// }

// UNSUPPORTED Rust 703:1: declaration Impl has no candidate rule
// impl Default for WHV_EMULATOR_MEMORY_ACCESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 708:1: generic scalar type unsupported
// pub type WHV_EMULATOR_MEMORY_CALLBACK = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, memoryaccess: *mut WHV_EMULATOR_MEMORY_ACCESS_INFO) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 709:1: generic scalar type unsupported
// pub type WHV_EMULATOR_SET_VIRTUAL_PROCESSOR_REGISTERS_CALLBACK = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, registernames: *const WHV_REGISTER_NAME, registercount: u32, registervalues: *const WHV_REGISTER_VALUE) -> windows_sys::core::HRESULT>;

// UNSUPPORTED Rust 710:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_EMULATOR_STATUS {
//     pub Anonymous: WHV_EMULATOR_STATUS_0,
//     pub AsUINT32: u32,
// }

// UNSUPPORTED Rust 716:1: declaration Impl has no candidate rule
// impl Default for WHV_EMULATOR_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 721:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_EMULATOR_STATUS_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 726:1: generic scalar type unsupported
// pub type WHV_EMULATOR_TRANSLATE_GVA_PAGE_CALLBACK = Option<unsafe extern "system" fn(context: *const core::ffi::c_void, gva: u64, translateflags: WHV_TRANSLATE_GVA_FLAGS, translationresult: *mut WHV_TRANSLATE_GVA_RESULT_CODE, gpa: *mut u64) -> windows_sys::core::HRESULT>;

public typealias `WHV_EXCEPTION_TYPE` = Int;
// UNSUPPORTED Rust 728:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_EXTENDED_VM_EXITS {
//     pub Anonymous: WHV_EXTENDED_VM_EXITS_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 734:1: declaration Impl has no candidate rule
// impl Default for WHV_EXTENDED_VM_EXITS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 739:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_EXTENDED_VM_EXITS_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 744:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_HYPERCALL_CONTEXT {
//     pub Rax: u64,
//     pub Rbx: u64,
//     pub Rcx: u64,
//     pub Rdx: u64,
//     pub R8: u64,
//     pub Rsi: u64,
//     pub Rdi: u64,
//     pub Reserved0: u64,
//     pub XmmRegisters: [WHV_UINT128; 6],
//     pub Reserved1: [u64; 2],
// }

// UNSUPPORTED Rust 758:1: declaration Impl has no candidate rule
// impl Default for WHV_HYPERCALL_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHV_HYPERCALL_CONTEXT_MAX_XMM_REGISTERS`: UInt = 6u;
// UNSUPPORTED Rust 764:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_INTERNAL_ACTIVITY_REGISTER {
//     pub Anonymous: WHV_INTERNAL_ACTIVITY_REGISTER_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 770:1: declaration Impl has no candidate rule
// impl Default for WHV_INTERNAL_ACTIVITY_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 775:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_INTERNAL_ACTIVITY_REGISTER_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 780:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_INTERRUPT_CONTROL {
//     pub _bitfield: u64,
//     pub Destination: u32,
//     pub Vector: u32,
// }

public typealias `WHV_INTERRUPT_DESTINATION_MODE` = Int;
public typealias `WHV_INTERRUPT_TRIGGER_MODE` = Int;
public typealias `WHV_INTERRUPT_TYPE` = Int;
public typealias `WHV_MAP_GPA_RANGE_FLAGS` = Int;
public const val `WHV_MAX_DEVICE_ID_SIZE_IN_CHARS`: UInt = 200u;
// UNSUPPORTED Rust 792:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_MEMORY_ACCESS_CONTEXT {
//     pub InstructionByteCount: u8,
//     pub Reserved: [u8; 3],
//     pub InstructionBytes: [u8; 16],
//     pub AccessInfo: WHV_MEMORY_ACCESS_INFO,
//     pub Gpa: u64,
//     pub Gva: u64,
// }

// UNSUPPORTED Rust 802:1: declaration Impl has no candidate rule
// impl Default for WHV_MEMORY_ACCESS_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 807:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_MEMORY_ACCESS_INFO {
//     pub Anonymous: WHV_MEMORY_ACCESS_INFO_0,
//     pub AsUINT32: u32,
// }

// UNSUPPORTED Rust 813:1: declaration Impl has no candidate rule
// impl Default for WHV_MEMORY_ACCESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_MEMORY_ACCESS_INFO_0 {
//     pub _bitfield: u32,
// }

public typealias `WHV_MEMORY_ACCESS_TYPE` = Int;
// UNSUPPORTED Rust 824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_MEMORY_RANGE_ENTRY {
//     pub GuestAddress: u64,
//     pub SizeInBytes: u64,
// }

public typealias `WHV_MSR_ACTION` = Int;
// UNSUPPORTED Rust 831:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_MSR_ACTION_ENTRY {
//     pub Index: u32,
//     pub ReadAction: u8,
//     pub WriteAction: u8,
//     pub Reserved: u16,
// }

// UNSUPPORTED Rust 839:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_NOTIFICATION_PORT_PARAMETERS {
//     pub NotificationPortType: WHV_NOTIFICATION_PORT_TYPE,
//     pub Reserved: u32,
//     pub Anonymous: WHV_NOTIFICATION_PORT_PARAMETERS_0,
// }

// UNSUPPORTED Rust 846:1: declaration Impl has no candidate rule
// impl Default for WHV_NOTIFICATION_PORT_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 851:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_NOTIFICATION_PORT_PARAMETERS_0 {
//     pub Doorbell: WHV_DOORBELL_MATCH_DATA,
//     pub Event: WHV_NOTIFICATION_PORT_PARAMETERS_0_0,
// }

// UNSUPPORTED Rust 857:1: declaration Impl has no candidate rule
// impl Default for WHV_NOTIFICATION_PORT_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 862:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_NOTIFICATION_PORT_PARAMETERS_0_0 {
//     pub ConnectionId: u32,
// }

public typealias `WHV_NOTIFICATION_PORT_PROPERTY_CODE` = Int;
public typealias `WHV_NOTIFICATION_PORT_TYPE` = Int;
public typealias `WHV_PARTITION_COUNTER_SET` = Int;
public typealias `WHV_PARTITION_HANDLE` = Long;
// UNSUPPORTED Rust 871:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PARTITION_MEMORY_COUNTERS {
//     pub Mapped4KPageCount: u64,
//     pub Mapped2MPageCount: u64,
//     pub Mapped1GPageCount: u64,
// }

// UNSUPPORTED Rust 878:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 912:1: declaration Impl has no candidate rule
// impl Default for WHV_PARTITION_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WHV_PARTITION_PROPERTY_CODE` = Int;
// UNSUPPORTED Rust 918:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_APIC_COUNTERS {
//     pub MmioAccessCount: u64,
//     pub EoiAccessCount: u64,
//     pub TprAccessCount: u64,
//     pub SentIpiCount: u64,
//     pub SelfIpiCount: u64,
// }

public typealias `WHV_PROCESSOR_COUNTER_SET` = Int;
// UNSUPPORTED Rust 928:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_EVENT_COUNTERS {
//     pub PageFaultCount: u64,
//     pub ExceptionCount: u64,
//     pub InterruptCount: u64,
// }

// UNSUPPORTED Rust 935:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_FEATURES {
//     pub Anonymous: WHV_PROCESSOR_FEATURES_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 941:1: declaration Impl has no candidate rule
// impl Default for WHV_PROCESSOR_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 946:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_FEATURES_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 951:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_FEATURES1 {
//     pub Anonymous: WHV_PROCESSOR_FEATURES1_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 957:1: declaration Impl has no candidate rule
// impl Default for WHV_PROCESSOR_FEATURES1 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 962:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_FEATURES1_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 967:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_PROCESSOR_FEATURES_BANKS {
//     pub BanksCount: u32,
//     pub Reserved0: u32,
//     pub Anonymous: WHV_PROCESSOR_FEATURES_BANKS_0,
// }

// UNSUPPORTED Rust 974:1: declaration Impl has no candidate rule
// impl Default for WHV_PROCESSOR_FEATURES_BANKS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 979:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_FEATURES_BANKS_0 {
//     pub Anonymous: WHV_PROCESSOR_FEATURES_BANKS_0_0,
//     pub AsUINT64: [u64; 2],
// }

// UNSUPPORTED Rust 985:1: declaration Impl has no candidate rule
// impl Default for WHV_PROCESSOR_FEATURES_BANKS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 990:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_PROCESSOR_FEATURES_BANKS_0_0 {
//     pub Bank0: WHV_PROCESSOR_FEATURES,
//     pub Bank1: WHV_PROCESSOR_FEATURES1,
// }

// UNSUPPORTED Rust 996:1: declaration Impl has no candidate rule
// impl Default for WHV_PROCESSOR_FEATURES_BANKS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHV_PROCESSOR_FEATURES_BANKS_COUNT`: UInt = 2u;
// UNSUPPORTED Rust 1002:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_INTERCEPT_COUNTER {
//     pub Count: u64,
//     pub Time100ns: u64,
// }

// UNSUPPORTED Rust 1008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_INTERCEPT_COUNTERS {
//     pub PageInvalidations: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub ControlRegisterAccesses: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub IoInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub HaltInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub CpuidInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub MsrAccesses: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub OtherIntercepts: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub PendingInterrupts: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub EmulatedInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub DebugRegisterAccesses: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub PageFaultIntercepts: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub NestedPageFaultIntercepts: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub Hypercalls: WHV_PROCESSOR_INTERCEPT_COUNTER,
//     pub RdpmcInstructions: WHV_PROCESSOR_INTERCEPT_COUNTER,
// }

// UNSUPPORTED Rust 1026:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_PERFMON_FEATURES {
//     pub Anonymous: WHV_PROCESSOR_PERFMON_FEATURES_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 1032:1: declaration Impl has no candidate rule
// impl Default for WHV_PROCESSOR_PERFMON_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1037:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_PERFMON_FEATURES_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 1042:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_RUNTIME_COUNTERS {
//     pub TotalRuntime100ns: u64,
//     pub HypervisorRuntime100ns: u64,
// }

// UNSUPPORTED Rust 1048:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_SYNTHETIC_FEATURES_COUNTERS {
//     pub SyntheticInterruptsCount: u64,
//     pub LongSpinWaitHypercallsCount: u64,
//     pub OtherHypercallsCount: u64,
//     pub SyntheticInterruptHypercallsCount: u64,
//     pub VirtualInterruptHypercallsCount: u64,
//     pub VirtualMmuHypercallsCount: u64,
// }

public typealias `WHV_PROCESSOR_VENDOR` = Int;
// UNSUPPORTED Rust 1059:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_PROCESSOR_XSAVE_FEATURES {
//     pub Anonymous: WHV_PROCESSOR_XSAVE_FEATURES_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 1065:1: declaration Impl has no candidate rule
// impl Default for WHV_PROCESSOR_XSAVE_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1070:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_PROCESSOR_XSAVE_FEATURES_0 {
//     pub _bitfield: u64,
// }

public const val `WHV_READ_WRITE_GPA_RANGE_MAX_SIZE`: UInt = 16u;
public typealias `WHV_REGISTER_NAME` = Int;
// UNSUPPORTED Rust 1077:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 1098:1: declaration Impl has no candidate rule
// impl Default for WHV_REGISTER_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1103:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_RUN_VP_CANCELED_CONTEXT {
//     pub CancelReason: WHV_RUN_VP_CANCEL_REASON,
// }

public typealias `WHV_RUN_VP_CANCEL_REASON` = Int;
// UNSUPPORTED Rust 1109:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_RUN_VP_EXIT_CONTEXT {
//     pub ExitReason: WHV_RUN_VP_EXIT_REASON,
//     pub Reserved: u32,
//     pub VpContext: WHV_VP_EXIT_CONTEXT,
//     pub Anonymous: WHV_RUN_VP_EXIT_CONTEXT_0,
// }

// UNSUPPORTED Rust 1117:1: declaration Impl has no candidate rule
// impl Default for WHV_RUN_VP_EXIT_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1122:1: declaration Union has no candidate rule
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

// UNSUPPORTED Rust 1141:1: declaration Impl has no candidate rule
// impl Default for WHV_RUN_VP_EXIT_CONTEXT_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WHV_RUN_VP_EXIT_REASON` = Int;
// UNSUPPORTED Rust 1147:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_SCHEDULER_FEATURES {
//     pub Anonymous: WHV_SCHEDULER_FEATURES_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 1153:1: declaration Impl has no candidate rule
// impl Default for WHV_SCHEDULER_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1158:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_SCHEDULER_FEATURES_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 1163:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_SRIOV_RESOURCE_DESCRIPTOR {
//     pub PnpInstanceId: [u16; 200],
//     pub VirtualFunctionId: super::super::Foundation::LUID,
//     pub VirtualFunctionIndex: u16,
//     pub Reserved: u16,
// }

// UNSUPPORTED Rust 1171:1: declaration Impl has no candidate rule
// impl Default for WHV_SRIOV_RESOURCE_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1176:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_SYNIC_EVENT_PARAMETERS {
//     pub VpIndex: u32,
//     pub TargetSint: u8,
//     pub Reserved: u8,
//     pub FlagNumber: u16,
// }

public const val `WHV_SYNIC_MESSAGE_SIZE`: UInt = 256u;
// UNSUPPORTED Rust 1185:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_SYNIC_SINT_DELIVERABLE_CONTEXT {
//     pub DeliverableSints: u16,
//     pub Reserved1: u16,
//     pub Reserved2: u32,
// }

// UNSUPPORTED Rust 1192:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_SYNTHETIC_PROCESSOR_FEATURES {
//     pub Anonymous: WHV_SYNTHETIC_PROCESSOR_FEATURES_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 1198:1: declaration Impl has no candidate rule
// impl Default for WHV_SYNTHETIC_PROCESSOR_FEATURES {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1203:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_SYNTHETIC_PROCESSOR_FEATURES_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 1208:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS {
//     pub BanksCount: u32,
//     pub Reserved0: u32,
//     pub Anonymous: WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0,
// }

// UNSUPPORTED Rust 1215:1: declaration Impl has no candidate rule
// impl Default for WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1220:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0 {
//     pub Anonymous: WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0,
//     pub AsUINT64: [u64; 1],
// }

// UNSUPPORTED Rust 1226:1: declaration Impl has no candidate rule
// impl Default for WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1231:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0 {
//     pub Bank0: WHV_SYNTHETIC_PROCESSOR_FEATURES,
// }

// UNSUPPORTED Rust 1236:1: declaration Impl has no candidate rule
// impl Default for WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHV_SYNTHETIC_PROCESSOR_FEATURES_BANKS_COUNT`: UInt = 1u;
public typealias `WHV_TRANSLATE_GVA_FLAGS` = Int;
// UNSUPPORTED Rust 1243:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_TRANSLATE_GVA_RESULT {
//     pub ResultCode: WHV_TRANSLATE_GVA_RESULT_CODE,
//     pub Reserved: u32,
// }

public typealias `WHV_TRANSLATE_GVA_RESULT_CODE` = Int;
// UNSUPPORTED Rust 1250:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_TRIGGER_PARAMETERS {
//     pub TriggerType: WHV_TRIGGER_TYPE,
//     pub Reserved: u32,
//     pub Anonymous: WHV_TRIGGER_PARAMETERS_0,
// }

// UNSUPPORTED Rust 1257:1: declaration Impl has no candidate rule
// impl Default for WHV_TRIGGER_PARAMETERS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1262:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_TRIGGER_PARAMETERS_0 {
//     pub Interrupt: WHV_INTERRUPT_CONTROL,
//     pub SynicEvent: WHV_SYNIC_EVENT_PARAMETERS,
//     pub DeviceInterrupt: WHV_TRIGGER_PARAMETERS_0_0,
// }

// UNSUPPORTED Rust 1269:1: declaration Impl has no candidate rule
// impl Default for WHV_TRIGGER_PARAMETERS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1274:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_TRIGGER_PARAMETERS_0_0 {
//     pub LogicalDeviceId: u64,
//     pub MsiAddress: u64,
//     pub MsiData: u32,
//     pub Reserved: u32,
// }

public typealias `WHV_TRIGGER_TYPE` = Int;
// UNSUPPORTED Rust 1283:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_UINT128 {
//     pub Anonymous: WHV_UINT128_0,
//     pub Dword: [u32; 4],
// }

// UNSUPPORTED Rust 1289:1: declaration Impl has no candidate rule
// impl Default for WHV_UINT128 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1294:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_UINT128_0 {
//     pub Low64: u64,
//     pub High64: u64,
// }

// UNSUPPORTED Rust 1300:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_VIRTUAL_PROCESSOR_PROPERTY {
//     pub PropertyCode: WHV_VIRTUAL_PROCESSOR_PROPERTY_CODE,
//     pub Reserved: u32,
//     pub Anonymous: WHV_VIRTUAL_PROCESSOR_PROPERTY_0,
// }

// UNSUPPORTED Rust 1307:1: declaration Impl has no candidate rule
// impl Default for WHV_VIRTUAL_PROCESSOR_PROPERTY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1312:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_VIRTUAL_PROCESSOR_PROPERTY_0 {
//     pub NumaNode: u16,
//     pub Padding: u64,
// }

// UNSUPPORTED Rust 1318:1: declaration Impl has no candidate rule
// impl Default for WHV_VIRTUAL_PROCESSOR_PROPERTY_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WHV_VIRTUAL_PROCESSOR_PROPERTY_CODE` = Int;
public typealias `WHV_VIRTUAL_PROCESSOR_STATE_TYPE` = Int;
// UNSUPPORTED Rust 1325:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_VPCI_DEVICE_NOTIFICATION {
//     pub NotificationType: WHV_VPCI_DEVICE_NOTIFICATION_TYPE,
//     pub Reserved1: u32,
//     pub Anonymous: WHV_VPCI_DEVICE_NOTIFICATION_0,
// }

// UNSUPPORTED Rust 1332:1: declaration Impl has no candidate rule
// impl Default for WHV_VPCI_DEVICE_NOTIFICATION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1337:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_VPCI_DEVICE_NOTIFICATION_0 {
//     pub Reserved2: u64,
// }

// UNSUPPORTED Rust 1342:1: declaration Impl has no candidate rule
// impl Default for WHV_VPCI_DEVICE_NOTIFICATION_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WHV_VPCI_DEVICE_NOTIFICATION_TYPE` = Int;
public typealias `WHV_VPCI_DEVICE_PROPERTY_CODE` = Int;
// UNSUPPORTED Rust 1349:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_VPCI_DEVICE_REGISTER {
//     pub Location: WHV_VPCI_DEVICE_REGISTER_SPACE,
//     pub SizeInBytes: u32,
//     pub OffsetInBytes: u64,
// }

public typealias `WHV_VPCI_DEVICE_REGISTER_SPACE` = Int;
// UNSUPPORTED Rust 1357:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_VPCI_HARDWARE_IDS {
//     pub VendorID: u16,
//     pub DeviceID: u16,
//     pub RevisionID: u8,
//     pub ProgIf: u8,
//     pub SubClass: u8,
//     pub BaseClass: u8,
//     pub SubVendorID: u16,
//     pub SubSystemID: u16,
// }

// UNSUPPORTED Rust 1369:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_VPCI_INTERRUPT_TARGET {
//     pub Vector: u32,
//     pub Flags: WHV_VPCI_INTERRUPT_TARGET_FLAGS,
//     pub ProcessorCount: u32,
//     pub Processors: [u32; 1],
// }

// UNSUPPORTED Rust 1377:1: declaration Impl has no candidate rule
// impl Default for WHV_VPCI_INTERRUPT_TARGET {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WHV_VPCI_INTERRUPT_TARGET_FLAGS` = Int;
// UNSUPPORTED Rust 1383:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_VPCI_MMIO_MAPPING {
//     pub Location: WHV_VPCI_DEVICE_REGISTER_SPACE,
//     pub Flags: WHV_VPCI_MMIO_RANGE_FLAGS,
//     pub SizeInBytes: u64,
//     pub OffsetInBytes: u64,
//     pub VirtualAddress: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 1392:1: declaration Impl has no candidate rule
// impl Default for WHV_VPCI_MMIO_MAPPING {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WHV_VPCI_MMIO_RANGE_FLAGS` = Int;
// UNSUPPORTED Rust 1398:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_VPCI_PROBED_BARS {
//     pub Value: [u32; 6],
// }

// UNSUPPORTED Rust 1403:1: declaration Impl has no candidate rule
// impl Default for WHV_VPCI_PROBED_BARS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `WHV_VPCI_TYPE0_BAR_COUNT`: UInt = 6u;
// UNSUPPORTED Rust 1409:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_VP_EXCEPTION_CONTEXT {
//     pub InstructionByteCount: u8,
//     pub Reserved: [u8; 3],
//     pub InstructionBytes: [u8; 16],
//     pub ExceptionInfo: WHV_VP_EXCEPTION_INFO,
//     pub ExceptionType: u8,
//     pub Reserved2: [u8; 3],
//     pub ErrorCode: u32,
//     pub ExceptionParameter: u64,
// }

// UNSUPPORTED Rust 1421:1: declaration Impl has no candidate rule
// impl Default for WHV_VP_EXCEPTION_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1426:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_VP_EXCEPTION_INFO {
//     pub Anonymous: WHV_VP_EXCEPTION_INFO_0,
//     pub AsUINT32: u32,
// }

// UNSUPPORTED Rust 1432:1: declaration Impl has no candidate rule
// impl Default for WHV_VP_EXCEPTION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1437:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_VP_EXCEPTION_INFO_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1442:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_VP_EXIT_CONTEXT {
//     pub ExecutionState: WHV_X64_VP_EXECUTION_STATE,
//     pub _bitfield: u8,
//     pub Reserved: u8,
//     pub Reserved2: u32,
//     pub Cs: WHV_X64_SEGMENT_REGISTER,
//     pub Rip: u64,
//     pub Rflags: u64,
// }

// UNSUPPORTED Rust 1453:1: declaration Impl has no candidate rule
// impl Default for WHV_VP_EXIT_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1458:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_APIC_EOI_CONTEXT {
//     pub InterruptVector: u32,
// }

// UNSUPPORTED Rust 1463:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_APIC_INIT_SIPI_CONTEXT {
//     pub ApicIcr: u64,
// }

// UNSUPPORTED Rust 1468:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_APIC_SMI_CONTEXT {
//     pub ApicIcr: u64,
// }

// UNSUPPORTED Rust 1473:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_APIC_WRITE_CONTEXT {
//     pub Type: WHV_X64_APIC_WRITE_TYPE,
//     pub Reserved: u32,
//     pub WriteValue: u64,
// }

public typealias `WHV_X64_APIC_WRITE_TYPE` = Int;
// UNSUPPORTED Rust 1481:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_CPUID_ACCESS_CONTEXT {
//     pub Rax: u64,
//     pub Rcx: u64,
//     pub Rdx: u64,
//     pub Rbx: u64,
//     pub DefaultResultRax: u64,
//     pub DefaultResultRcx: u64,
//     pub DefaultResultRdx: u64,
//     pub DefaultResultRbx: u64,
// }

// UNSUPPORTED Rust 1493:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_X64_CPUID_RESULT {
//     pub Function: u32,
//     pub Reserved: [u32; 3],
//     pub Eax: u32,
//     pub Ebx: u32,
//     pub Ecx: u32,
//     pub Edx: u32,
// }

// UNSUPPORTED Rust 1503:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_CPUID_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1508:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_CPUID_RESULT2 {
//     pub Function: u32,
//     pub Index: u32,
//     pub VpIndex: u32,
//     pub Flags: WHV_X64_CPUID_RESULT2_FLAGS,
//     pub Output: WHV_CPUID_OUTPUT,
//     pub Mask: WHV_CPUID_OUTPUT,
// }

public typealias `WHV_X64_CPUID_RESULT2_FLAGS` = Int;
// UNSUPPORTED Rust 1519:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER {
//     pub Anonymous: WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 1525:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1530:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_DELIVERABILITY_NOTIFICATIONS_REGISTER_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 1535:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_FP_CONTROL_STATUS_REGISTER {
//     pub Anonymous: WHV_X64_FP_CONTROL_STATUS_REGISTER_0,
//     pub AsUINT128: WHV_UINT128,
// }

// UNSUPPORTED Rust 1541:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_FP_CONTROL_STATUS_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1546:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_X64_FP_CONTROL_STATUS_REGISTER_0 {
//     pub FpControl: u16,
//     pub FpStatus: u16,
//     pub FpTag: u8,
//     pub Reserved: u8,
//     pub LastFpOp: u16,
//     pub Anonymous: WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0,
// }

// UNSUPPORTED Rust 1556:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_FP_CONTROL_STATUS_REGISTER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1561:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0 {
//     pub LastFpRip: u64,
//     pub Anonymous: WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0_0,
// }

// UNSUPPORTED Rust 1567:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1572:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_FP_CONTROL_STATUS_REGISTER_0_0_0 {
//     pub LastFpEip: u32,
//     pub LastFpCs: u16,
//     pub Reserved2: u16,
// }

// UNSUPPORTED Rust 1579:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_FP_REGISTER {
//     pub Anonymous: WHV_X64_FP_REGISTER_0,
//     pub AsUINT128: WHV_UINT128,
// }

// UNSUPPORTED Rust 1585:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_FP_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1590:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_FP_REGISTER_0 {
//     pub Mantissa: u64,
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 1596:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_INTERRUPTION_DELIVERABLE_CONTEXT {
//     pub DeliverableType: WHV_X64_PENDING_INTERRUPTION_TYPE,
// }

// UNSUPPORTED Rust 1601:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_INTERRUPT_STATE_REGISTER {
//     pub Anonymous: WHV_X64_INTERRUPT_STATE_REGISTER_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 1607:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_INTERRUPT_STATE_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1612:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_INTERRUPT_STATE_REGISTER_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 1617:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_X64_IO_PORT_ACCESS_CONTEXT {
//     pub InstructionByteCount: u8,
//     pub Reserved: [u8; 3],
//     pub InstructionBytes: [u8; 16],
//     pub AccessInfo: WHV_X64_IO_PORT_ACCESS_INFO,
//     pub PortNumber: u16,
//     pub Reserved2: [u16; 3],
//     pub Rax: u64,
//     pub Rcx: u64,
//     pub Rsi: u64,
//     pub Rdi: u64,
//     pub Ds: WHV_X64_SEGMENT_REGISTER,
//     pub Es: WHV_X64_SEGMENT_REGISTER,
// }

// UNSUPPORTED Rust 1633:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_IO_PORT_ACCESS_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1638:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_IO_PORT_ACCESS_INFO {
//     pub Anonymous: WHV_X64_IO_PORT_ACCESS_INFO_0,
//     pub AsUINT32: u32,
// }

// UNSUPPORTED Rust 1644:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_IO_PORT_ACCESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1649:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_IO_PORT_ACCESS_INFO_0 {
//     pub _bitfield: u32,
// }

public typealias `WHV_X64_LOCAL_APIC_EMULATION_MODE` = Int;
// UNSUPPORTED Rust 1655:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_X64_MSR_ACCESS_CONTEXT {
//     pub AccessInfo: WHV_X64_MSR_ACCESS_INFO,
//     pub MsrNumber: u32,
//     pub Rax: u64,
//     pub Rdx: u64,
// }

// UNSUPPORTED Rust 1663:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_MSR_ACCESS_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1668:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_MSR_ACCESS_INFO {
//     pub Anonymous: WHV_X64_MSR_ACCESS_INFO_0,
//     pub AsUINT32: u32,
// }

// UNSUPPORTED Rust 1674:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_MSR_ACCESS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1679:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_MSR_ACCESS_INFO_0 {
//     pub _bitfield: u32,
// }

// UNSUPPORTED Rust 1684:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_MSR_EXIT_BITMAP {
//     pub AsUINT64: u64,
//     pub Anonymous: WHV_X64_MSR_EXIT_BITMAP_0,
// }

// UNSUPPORTED Rust 1690:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_MSR_EXIT_BITMAP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1695:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_MSR_EXIT_BITMAP_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 1700:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_PENDING_DEBUG_EXCEPTION {
//     pub AsUINT64: u64,
//     pub Anonymous: WHV_X64_PENDING_DEBUG_EXCEPTION_0,
// }

// UNSUPPORTED Rust 1706:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_PENDING_DEBUG_EXCEPTION {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1711:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_PENDING_DEBUG_EXCEPTION_0 {
//     pub _bitfield: u64,
// }

public typealias `WHV_X64_PENDING_EVENT_TYPE` = Int;
// UNSUPPORTED Rust 1717:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_PENDING_EXCEPTION_EVENT {
//     pub Anonymous: WHV_X64_PENDING_EXCEPTION_EVENT_0,
//     pub AsUINT128: WHV_UINT128,
// }

// UNSUPPORTED Rust 1723:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_PENDING_EXCEPTION_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1728:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_PENDING_EXCEPTION_EVENT_0 {
//     pub _bitfield: u32,
//     pub ErrorCode: u32,
//     pub ExceptionParameter: u64,
// }

// UNSUPPORTED Rust 1735:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_PENDING_EXT_INT_EVENT {
//     pub Anonymous: WHV_X64_PENDING_EXT_INT_EVENT_0,
//     pub AsUINT128: WHV_UINT128,
// }

// UNSUPPORTED Rust 1741:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_PENDING_EXT_INT_EVENT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1746:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_PENDING_EXT_INT_EVENT_0 {
//     pub _bitfield: u64,
//     pub Reserved2: u64,
// }

// UNSUPPORTED Rust 1752:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_PENDING_INTERRUPTION_REGISTER {
//     pub Anonymous: WHV_X64_PENDING_INTERRUPTION_REGISTER_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 1758:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_PENDING_INTERRUPTION_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1763:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_PENDING_INTERRUPTION_REGISTER_0 {
//     pub _bitfield: u32,
//     pub ErrorCode: u32,
// }

public typealias `WHV_X64_PENDING_INTERRUPTION_TYPE` = Int;
// UNSUPPORTED Rust 1770:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_X64_RDTSC_CONTEXT {
//     pub TscAux: u64,
//     pub VirtualOffset: u64,
//     pub Tsc: u64,
//     pub ReferenceTime: u64,
//     pub RdtscInfo: WHV_X64_RDTSC_INFO,
// }

// UNSUPPORTED Rust 1779:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_RDTSC_CONTEXT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1784:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_RDTSC_INFO {
//     pub Anonymous: WHV_X64_RDTSC_INFO_0,
//     pub AsUINT64: u64,
// }

// UNSUPPORTED Rust 1790:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_RDTSC_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1795:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_RDTSC_INFO_0 {
//     pub _bitfield: u64,
// }

// UNSUPPORTED Rust 1800:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_X64_SEGMENT_REGISTER {
//     pub Base: u64,
//     pub Limit: u32,
//     pub Selector: u16,
//     pub Anonymous: WHV_X64_SEGMENT_REGISTER_0,
// }

// UNSUPPORTED Rust 1808:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_SEGMENT_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1813:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_SEGMENT_REGISTER_0 {
//     pub Anonymous: WHV_X64_SEGMENT_REGISTER_0_0,
//     pub Attributes: u16,
// }

// UNSUPPORTED Rust 1819:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_SEGMENT_REGISTER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_SEGMENT_REGISTER_0_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 1829:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_X64_TABLE_REGISTER {
//     pub Pad: [u16; 3],
//     pub Limit: u16,
//     pub Base: u64,
// }

// UNSUPPORTED Rust 1836:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_TABLE_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `WHV_X64_UNSUPPORTED_FEATURE_CODE` = Int;
// UNSUPPORTED Rust 1842:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_UNSUPPORTED_FEATURE_CONTEXT {
//     pub FeatureCode: WHV_X64_UNSUPPORTED_FEATURE_CODE,
//     pub Reserved: u32,
//     pub FeatureParameter: u64,
// }

// UNSUPPORTED Rust 1849:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_VP_EXECUTION_STATE {
//     pub Anonymous: WHV_X64_VP_EXECUTION_STATE_0,
//     pub AsUINT16: u16,
// }

// UNSUPPORTED Rust 1855:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_VP_EXECUTION_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1860:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_VP_EXECUTION_STATE_0 {
//     pub _bitfield: u16,
// }

// UNSUPPORTED Rust 1865:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_XMM_CONTROL_STATUS_REGISTER {
//     pub Anonymous: WHV_X64_XMM_CONTROL_STATUS_REGISTER_0,
//     pub AsUINT128: WHV_UINT128,
// }

// UNSUPPORTED Rust 1871:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_XMM_CONTROL_STATUS_REGISTER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1876:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct WHV_X64_XMM_CONTROL_STATUS_REGISTER_0 {
//     pub Anonymous: WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0,
//     pub XmmStatusControl: u32,
//     pub XmmStatusControlMask: u32,
// }

// UNSUPPORTED Rust 1883:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_XMM_CONTROL_STATUS_REGISTER_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1888:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0 {
//     pub LastFpRdp: u64,
//     pub Anonymous: WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0_0,
// }

// UNSUPPORTED Rust 1894:1: declaration Impl has no candidate rule
// impl Default for WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1899:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WHV_X64_XMM_CONTROL_STATUS_REGISTER_0_0_0 {
//     pub LastFpDp: u32,
//     pub LastFpDs: u16,
//     pub Reserved: u16,
// }

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
