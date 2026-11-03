package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(context: Long, imageinfo: Long): BOOL
}

public fun interface FnCallback1 {
    public operator fun invoke(infomessage: PCSTR)
}

public fun ApplyGuestMemoryFix(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, fixbuffer: Long, fixbuffersize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ApplyGuestMemoryFix", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), virtualaddress.toLong(), fixbuffer, fixbuffersize.toLong())).toInt()
}

public fun ApplyPendingSavedStateFileReplayLog(vmrsfile: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ApplyPendingSavedStateFileReplayLog", longArrayOf(vmrsfile)).toInt()
}

public fun CallStackUnwind(vmsavedstatedumphandle: Long, vpid: UInt, imageinfo: Long, imageinfocount: UInt, framecount: UInt, callstack: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "CallStackUnwind", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), imageinfo, imageinfocount.toLong(), framecount.toLong(), callstack)).toInt()
}

public fun FindSavedStateSymbolFieldInType(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, fieldname: PCWSTR, offset: Long, found: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "FindSavedStateSymbolFieldInType", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), typename, fieldname, offset, found)).toInt()
}

public fun ForceActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: UByte): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ForceActiveVirtualTrustLevel", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), virtualtrustlevel.toLong())).toInt()
}

public fun ForceArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: VIRTUAL_PROCESSOR_ARCH): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ForceArchitecture", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), architecture.toLong())).toInt()
}

public fun ForceNestedHostMode(vmsavedstatedumphandle: Long, vpid: UInt, hostmode: BOOL, oldmode: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ForceNestedHostMode", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), hostmode.toLong(), oldmode)).toInt()
}

public fun ForcePagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: PAGING_MODE): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ForcePagingMode", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), pagingmode.toLong())).toInt()
}

public fun GetActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetActiveVirtualTrustLevel", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), virtualtrustlevel)).toInt()
}

public fun GetArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetArchitecture", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), architecture)).toInt()
}

public fun GetEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevels: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetEnabledVirtualTrustLevels", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), virtualtrustlevels)).toInt()
}

public fun GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, virtualtrustlevels: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetGuestEnabledVirtualTrustLevels", longArrayOf(vmsavedstatedumphandle, virtualtrustlevels)).toInt()
}

public fun GetGuestOsInfo(vmsavedstatedumphandle: Long, virtualtrustlevel: UByte, guestosinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetGuestOsInfo", longArrayOf(vmsavedstatedumphandle, virtualtrustlevel.toLong(), guestosinfo)).toInt()
}

public fun GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle: Long, memorychunkpagesize: Long, memorychunks: Long, memorychunkcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetGuestPhysicalMemoryChunks", longArrayOf(vmsavedstatedumphandle, memorychunkpagesize, memorychunks, memorychunkcount)).toInt()
}

public fun GetGuestRawSavedMemorySize(vmsavedstatedumphandle: Long, guestrawsavedmemorysize: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetGuestRawSavedMemorySize", longArrayOf(vmsavedstatedumphandle, guestrawsavedmemorysize)).toInt()
}

public fun GetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetMemoryBlockCacheLimit", longArrayOf(vmsavedstatedumphandle, memoryblockcachelimit)).toInt()
}

public fun GetNestedVirtualizationMode(vmsavedstatedumphandle: Long, vpid: UInt, enabled: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetNestedVirtualizationMode", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), enabled)).toInt()
}

public fun GetPagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetPagingMode", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), pagingmode)).toInt()
}

public fun GetRegisterValue(vmsavedstatedumphandle: Long, vpid: UInt, registerid: UInt, registervalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetRegisterValue", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), registerid.toLong(), registervalue)).toInt()
}

public fun GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, typefieldinfomap: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetSavedStateSymbolFieldInfo", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), typename, typefieldinfomap)).toInt()
}

public fun GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle: Long): Foundation.HANDLE {
    Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetSavedStateSymbolProviderHandle", longArrayOf(vmsavedstatedumphandle))
    return Foundation.HANDLE()
}

public fun GetSavedStateSymbolTypeSize(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, size: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetSavedStateSymbolTypeSize", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), typename, size)).toInt()
}

public fun GetVpCount(vmsavedstatedumphandle: Long, vpcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GetVpCount", longArrayOf(vmsavedstatedumphandle, vpcount)).toInt()
}

public fun GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: Long, physicaladdress: ULong, rawsavedmemoryoffset: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GuestPhysicalAddressToRawSavedMemoryOffset", longArrayOf(vmsavedstatedumphandle, physicaladdress.toLong(), rawsavedmemoryoffset)).toInt()
}

public fun GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, physicaladdress: Long, unmappedregionsize: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "GuestVirtualAddressToPhysicalAddress", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), virtualaddress.toLong(), physicaladdress, unmappedregionsize)).toInt()
}

public fun HdvCreateDeviceInstance(devicehosthandle: Long, devicetype: HDV_DEVICE_TYPE, deviceclassid: Long, deviceinstanceid: Long, deviceinterface: Long, devicecontext: Long, devicehandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvCreateDeviceInstance", longArrayOf(devicehosthandle, devicetype.toLong(), deviceclassid, deviceinstanceid, deviceinterface, devicecontext, devicehandle)).toInt()
}

public fun HdvCreateGuestMemoryAperture(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: BOOL, mappedaddress: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvCreateGuestMemoryAperture", longArrayOf(requestor, guestphysicaladdress.toLong(), bytecount.toLong(), writeprotected.toLong(), mappedaddress)).toInt()
}

public fun HdvCreateSectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HDV_MMIO_MAPPING_FLAGS, sectionhandle: Foundation.HANDLE, sectionoffsetinpages: ULong): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvCreateSectionBackedMmioRange", longArrayOf(requestor, barindex.toLong(), offsetinpages.toLong(), lengthinpages.toLong(), mappingflags.toLong(), Win32DynamicFfi.objectSlot(sectionhandle), sectionoffsetinpages.toLong())).toInt()
}

public fun HdvDeliverGuestInterrupt(requestor: Long, msiaddress: ULong, msidata: UInt): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvDeliverGuestInterrupt", longArrayOf(requestor, msiaddress.toLong(), msidata.toLong())).toInt()
}

public fun HdvDestroyGuestMemoryAperture(requestor: Long, mappedaddress: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvDestroyGuestMemoryAperture", longArrayOf(requestor, mappedaddress)).toInt()
}

public fun HdvDestroySectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvDestroySectionBackedMmioRange", longArrayOf(requestor, barindex.toLong(), offsetinpages.toLong())).toInt()
}

public fun HdvInitializeDeviceHost(computesystem: HostComputeSystem.HCS_SYSTEM, devicehosthandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvInitializeDeviceHost", longArrayOf(Win32DynamicFfi.objectSlot(computesystem), devicehosthandle)).toInt()
}

public fun HdvInitializeDeviceHostEx(computesystem: HostComputeSystem.HCS_SYSTEM, flags: HDV_DEVICE_HOST_FLAGS, devicehosthandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvInitializeDeviceHostEx", longArrayOf(Win32DynamicFfi.objectSlot(computesystem), flags.toLong(), devicehosthandle)).toInt()
}

public fun HdvReadGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvReadGuestMemory", longArrayOf(requestor, guestphysicaladdress.toLong(), bytecount.toLong(), buffer)).toInt()
}

public fun HdvRegisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvRegisterDoorbell", longArrayOf(requestor, barindex.toLong(), baroffset.toLong(), triggervalue.toLong(), flags.toLong(), Win32DynamicFfi.objectSlot(doorbellevent))).toInt()
}

public fun HdvTeardownDeviceHost(devicehosthandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvTeardownDeviceHost", longArrayOf(devicehosthandle)).toInt()
}

public fun HdvUnregisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvUnregisterDoorbell", longArrayOf(requestor, barindex.toLong(), baroffset.toLong(), triggervalue.toLong(), flags.toLong())).toInt()
}

public fun HdvWriteGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmdevicehost.dll", "HdvWriteGuestMemory", longArrayOf(requestor, guestphysicaladdress.toLong(), bytecount.toLong(), buffer)).toInt()
}

public fun InKernelSpace(vmsavedstatedumphandle: Long, vpid: UInt, inkernelspace: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "InKernelSpace", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), inkernelspace)).toInt()
}

public fun IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: Long, vpid: UInt, activevirtualtrustlevelenabled: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "IsActiveVirtualTrustLevelEnabled", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), activevirtualtrustlevelenabled)).toInt()
}

public fun IsNestedVirtualizationEnabled(vmsavedstatedumphandle: Long, enabled: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "IsNestedVirtualizationEnabled", longArrayOf(vmsavedstatedumphandle, enabled)).toInt()
}

public fun LoadSavedStateFile(vmrsfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "LoadSavedStateFile", longArrayOf(vmrsfile, vmsavedstatedumphandle)).toInt()
}

public fun LoadSavedStateFiles(binfile: PCWSTR, vsvfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "LoadSavedStateFiles", longArrayOf(binfile, vsvfile, vmsavedstatedumphandle)).toInt()
}

public fun LoadSavedStateModuleSymbols(vmsavedstatedumphandle: Long, imagename: PCSTR, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "LoadSavedStateModuleSymbols", longArrayOf(vmsavedstatedumphandle, imagename, modulename, baseaddress.toLong(), sizeofbase.toLong())).toInt()
}

public fun LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: Long, imagename: PCSTR, imagetimestamp: UInt, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "LoadSavedStateModuleSymbolsEx", longArrayOf(vmsavedstatedumphandle, imagename, imagetimestamp.toLong(), modulename, baseaddress.toLong(), sizeofbase.toLong())).toInt()
}

public fun LoadSavedStateSymbolProvider(vmsavedstatedumphandle: Long, usersymbols: PCWSTR, force: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "LoadSavedStateSymbolProvider", longArrayOf(vmsavedstatedumphandle, usersymbols, force.toLong())).toInt()
}

public fun LocateSavedStateFiles(vmname: PCWSTR, snapshotname: PCWSTR, binpath: Long, vsvpath: Long, vmrspath: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "LocateSavedStateFiles", longArrayOf(vmname, snapshotname, binpath, vsvpath, vmrspath)).toInt()
}

public fun ReadGuestPhysicalAddress(vmsavedstatedumphandle: Long, physicaladdress: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ReadGuestPhysicalAddress", longArrayOf(vmsavedstatedumphandle, physicaladdress.toLong(), buffer, buffersize.toLong(), bytesread)).toInt()
}

public fun ReadGuestRawSavedMemory(vmsavedstatedumphandle: Long, rawsavedmemoryoffset: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ReadGuestRawSavedMemory", longArrayOf(vmsavedstatedumphandle, rawsavedmemoryoffset.toLong(), buffer, buffersize.toLong(), bytesread)).toInt()
}

public fun ReadSavedStateGlobalVariable(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, buffer: Long, buffersize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ReadSavedStateGlobalVariable", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), globalname, buffer, buffersize.toLong())).toInt()
}

public fun ReleaseSavedStateFiles(vmsavedstatedumphandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ReleaseSavedStateFiles", longArrayOf(vmsavedstatedumphandle)).toInt()
}

public fun ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ReleaseSavedStateSymbolProvider", longArrayOf(vmsavedstatedumphandle)).toInt()
}

public fun ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, virtualaddress: Long, size: Long): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ResolveSavedStateGlobalVariableAddress", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), globalname, virtualaddress, size)).toInt()
}

public fun ScanMemoryForDosImages(vmsavedstatedumphandle: Long, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: Long, foundimagecallback: FOUND_IMAGE_CALLBACK, standaloneaddress: Long, standaloneaddresscount: UInt): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "ScanMemoryForDosImages", longArrayOf(vmsavedstatedumphandle, vpid.toLong(), startaddress.toLong(), endaddress.toLong(), callbackcontext, Win32DynamicFfi.objectSlot(foundimagecallback), standaloneaddress, standaloneaddresscount.toLong())).toInt()
}

public fun SetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: ULong): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "SetMemoryBlockCacheLimit", longArrayOf(vmsavedstatedumphandle, memoryblockcachelimit.toLong())).toInt()
}

public fun SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: Long, callback: GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK): HRESULT {
    return Win32DynamicFfi.invoke("vmsavedstatedumpprovider.dll", "SetSavedStateSymbolProviderDebugInfoCallback", longArrayOf(vmsavedstatedumphandle, Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun WHvAcceptPartitionMigration(migrationhandle: Foundation.HANDLE, partition: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvAcceptPartitionMigration", longArrayOf(Win32DynamicFfi.objectSlot(migrationhandle), partition)).toInt()
}

public fun WHvAdviseGpaRange(partition: WHV_PARTITION_HANDLE, gparanges: Long, gparangescount: UInt, advice: WHV_ADVISE_GPA_RANGE_CODE, advicebuffer: Long, advicebuffersizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvAdviseGpaRange", longArrayOf(partition, gparanges, gparangescount.toLong(), advice.toLong(), advicebuffer, advicebuffersizeinbytes.toLong())).toInt()
}

public fun WHvAllocateVpciResource(providerid: Long, flags: WHV_ALLOCATE_VPCI_RESOURCE_FLAGS, resourcedescriptor: Long, resourcedescriptorsizeinbytes: UInt, vpciresource: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvAllocateVpciResource", longArrayOf(providerid, flags.toLong(), resourcedescriptor, resourcedescriptorsizeinbytes.toLong(), vpciresource)).toInt()
}

public fun WHvCancelPartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvCancelPartitionMigration", longArrayOf(partition)).toInt()
}

public fun WHvCancelRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvCancelRunVirtualProcessor", longArrayOf(partition, vpindex.toLong(), flags.toLong())).toInt()
}

public fun WHvCompletePartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvCompletePartitionMigration", longArrayOf(partition)).toInt()
}

public fun WHvCreateNotificationPort(partition: WHV_PARTITION_HANDLE, parameters: Long, eventhandle: Foundation.HANDLE, porthandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvCreateNotificationPort", longArrayOf(partition, parameters, Win32DynamicFfi.objectSlot(eventhandle), porthandle)).toInt()
}

public fun WHvCreatePartition(partition: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvCreatePartition", longArrayOf(partition)).toInt()
}

public fun WHvCreateTrigger(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long, eventhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvCreateTrigger", longArrayOf(partition, parameters, triggerhandle, eventhandle)).toInt()
}

public fun WHvCreateVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvCreateVirtualProcessor", longArrayOf(partition, vpindex.toLong(), flags.toLong())).toInt()
}

public fun WHvCreateVirtualProcessor2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, properties: Long, propertycount: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvCreateVirtualProcessor2", longArrayOf(partition, vpindex.toLong(), properties, propertycount.toLong())).toInt()
}

public fun WHvCreateVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, vpciresource: Foundation.HANDLE, flags: WHV_CREATE_VPCI_DEVICE_FLAGS, notificationeventhandle: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvCreateVpciDevice", longArrayOf(partition, logicaldeviceid.toLong(), Win32DynamicFfi.objectSlot(vpciresource), flags.toLong(), Win32DynamicFfi.objectSlot(notificationeventhandle))).toInt()
}

public fun WHvDeleteNotificationPort(partition: WHV_PARTITION_HANDLE, porthandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvDeleteNotificationPort", longArrayOf(partition, porthandle)).toInt()
}

public fun WHvDeletePartition(partition: WHV_PARTITION_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvDeletePartition", longArrayOf(partition)).toInt()
}

public fun WHvDeleteTrigger(partition: WHV_PARTITION_HANDLE, triggerhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvDeleteTrigger", longArrayOf(partition, triggerhandle)).toInt()
}

public fun WHvDeleteVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvDeleteVirtualProcessor", longArrayOf(partition, vpindex.toLong())).toInt()
}

public fun WHvDeleteVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvDeleteVpciDevice", longArrayOf(partition, logicaldeviceid.toLong())).toInt()
}

public fun WHvEmulatorCreateEmulator(callbacks: Long, emulator: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvemulation.dll", "WHvEmulatorCreateEmulator", longArrayOf(callbacks, emulator)).toInt()
}

public fun WHvEmulatorDestroyEmulator(emulator: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvemulation.dll", "WHvEmulatorDestroyEmulator", longArrayOf(emulator)).toInt()
}

public fun WHvEmulatorTryIoEmulation(emulator: Long, context: Long, vpcontext: Long, ioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvemulation.dll", "WHvEmulatorTryIoEmulation", longArrayOf(emulator, context, vpcontext, ioinstructioncontext, emulatorreturnstatus)).toInt()
}

public fun WHvEmulatorTryMmioEmulation(emulator: Long, context: Long, vpcontext: Long, mmioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvemulation.dll", "WHvEmulatorTryMmioEmulation", longArrayOf(emulator, context, vpcontext, mmioinstructioncontext, emulatorreturnstatus)).toInt()
}

public fun WHvGetCapability(capabilitycode: WHV_CAPABILITY_CODE, capabilitybuffer: Long, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetCapability", longArrayOf(capabilitycode.toLong(), capabilitybuffer, capabilitybuffersizeinbytes.toLong(), writtensizeinbytes)).toInt()
}

public fun WHvGetInterruptTargetVpSet(partition: WHV_PARTITION_HANDLE, destination: ULong, destinationmode: WHV_INTERRUPT_DESTINATION_MODE, targetvps: Long, vpcount: UInt, targetvpcount: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetInterruptTargetVpSet", longArrayOf(partition, destination.toLong(), destinationmode.toLong(), targetvps, vpcount.toLong(), targetvpcount)).toInt()
}

public fun WHvGetPartitionCounters(partition: WHV_PARTITION_HANDLE, counterset: WHV_PARTITION_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetPartitionCounters", longArrayOf(partition, counterset.toLong(), buffer, buffersizeinbytes.toLong(), byteswritten)).toInt()
}

public fun WHvGetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetPartitionProperty", longArrayOf(partition, propertycode.toLong(), propertybuffer, propertybuffersizeinbytes.toLong(), writtensizeinbytes)).toInt()
}

public fun WHvGetVirtualProcessorCounters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, counterset: WHV_PROCESSOR_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVirtualProcessorCounters", longArrayOf(partition, vpindex.toLong(), counterset.toLong(), buffer, buffersizeinbytes.toLong(), byteswritten)).toInt()
}

public fun WHvGetVirtualProcessorCpuidOutput(partition: WHV_PARTITION_HANDLE, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVirtualProcessorCpuidOutput", longArrayOf(partition, vpindex.toLong(), eax.toLong(), ecx.toLong(), cpuidoutput)).toInt()
}

public fun WHvGetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVirtualProcessorInterruptControllerState", longArrayOf(partition, vpindex.toLong(), state, statesize.toLong(), writtensize)).toInt()
}

public fun WHvGetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVirtualProcessorInterruptControllerState2", longArrayOf(partition, vpindex.toLong(), state, statesize.toLong(), writtensize)).toInt()
}

public fun WHvGetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVirtualProcessorRegisters", longArrayOf(partition, vpindex.toLong(), registernames, registercount.toLong(), registervalues)).toInt()
}

public fun WHvGetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVirtualProcessorState", longArrayOf(partition, vpindex.toLong(), statetype.toLong(), buffer, buffersizeinbytes.toLong(), byteswritten)).toInt()
}

public fun WHvGetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVirtualProcessorXsaveState", longArrayOf(partition, vpindex.toLong(), buffer, buffersizeinbytes.toLong(), byteswritten)).toInt()
}

public fun WHvGetVpciDeviceInterruptTarget(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: Long, targetsizeinbytes: UInt, byteswritten: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVpciDeviceInterruptTarget", longArrayOf(partition, logicaldeviceid.toLong(), index.toLong(), multimessagenumber.toLong(), target, targetsizeinbytes.toLong(), byteswritten)).toInt()
}

public fun WHvGetVpciDeviceNotification(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, notification: Long, notificationsizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVpciDeviceNotification", longArrayOf(partition, logicaldeviceid.toLong(), notification, notificationsizeinbytes.toLong())).toInt()
}

public fun WHvGetVpciDeviceProperty(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, propertycode: WHV_VPCI_DEVICE_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvGetVpciDeviceProperty", longArrayOf(partition, logicaldeviceid.toLong(), propertycode.toLong(), propertybuffer, propertybuffersizeinbytes.toLong(), writtensizeinbytes)).toInt()
}

public fun WHvMapGpaRange(partition: WHV_PARTITION_HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvMapGpaRange", longArrayOf(partition, sourceaddress, guestaddress.toLong(), sizeinbytes.toLong(), flags.toLong())).toInt()
}

public fun WHvMapGpaRange2(partition: WHV_PARTITION_HANDLE, process: Foundation.HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvMapGpaRange2", longArrayOf(partition, Win32DynamicFfi.objectSlot(process), sourceaddress, guestaddress.toLong(), sizeinbytes.toLong(), flags.toLong())).toInt()
}

public fun WHvMapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: Long, msiaddress: Long, msidata: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvMapVpciDeviceInterrupt", longArrayOf(partition, logicaldeviceid.toLong(), index.toLong(), messagecount.toLong(), target, msiaddress, msidata)).toInt()
}

public fun WHvMapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, mappingcount: Long, mappings: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvMapVpciDeviceMmioRanges", longArrayOf(partition, logicaldeviceid.toLong(), mappingcount, mappings)).toInt()
}

public fun WHvPostVirtualProcessorSynicMessage(partition: WHV_PARTITION_HANDLE, vpindex: UInt, sintindex: UInt, message: Long, messagesizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvPostVirtualProcessorSynicMessage", longArrayOf(partition, vpindex.toLong(), sintindex.toLong(), message, messagesizeinbytes.toLong())).toInt()
}

public fun WHvQueryGpaRangeDirtyBitmap(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: Long, bitmapsizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvQueryGpaRangeDirtyBitmap", longArrayOf(partition, guestaddress.toLong(), rangesizeinbytes.toLong(), bitmap, bitmapsizeinbytes.toLong())).toInt()
}

public fun WHvReadGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvReadGpaRange", longArrayOf(partition, vpindex.toLong(), guestaddress.toLong(), Win32DynamicFfi.objectSlot(controls), data, datasizeinbytes.toLong())).toInt()
}

public fun WHvReadVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvReadVpciDeviceRegister", longArrayOf(partition, logicaldeviceid.toLong(), register, data)).toInt()
}

public fun WHvRegisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long, eventhandle: Foundation.HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvRegisterPartitionDoorbellEvent", longArrayOf(partition, matchdata, Win32DynamicFfi.objectSlot(eventhandle))).toInt()
}

public fun WHvRequestInterrupt(partition: WHV_PARTITION_HANDLE, interrupt: Long, interruptcontrolsize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvRequestInterrupt", longArrayOf(partition, interrupt, interruptcontrolsize.toLong())).toInt()
}

public fun WHvRequestVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvRequestVpciDeviceInterrupt", longArrayOf(partition, logicaldeviceid.toLong(), msiaddress.toLong(), msidata.toLong())).toInt()
}

public fun WHvResetPartition(partition: WHV_PARTITION_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvResetPartition", longArrayOf(partition)).toInt()
}

public fun WHvResumePartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvResumePartitionTime", longArrayOf(partition)).toInt()
}

public fun WHvRetargetVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvRetargetVpciDeviceInterrupt", longArrayOf(partition, logicaldeviceid.toLong(), msiaddress.toLong(), msidata.toLong(), target)).toInt()
}

public fun WHvRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, exitcontext: Long, exitcontextsizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvRunVirtualProcessor", longArrayOf(partition, vpindex.toLong(), exitcontext, exitcontextsizeinbytes.toLong())).toInt()
}

public fun WHvSetNotificationPortProperty(partition: WHV_PARTITION_HANDLE, porthandle: Long, propertycode: WHV_NOTIFICATION_PORT_PROPERTY_CODE, propertyvalue: ULong): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSetNotificationPortProperty", longArrayOf(partition, porthandle, propertycode.toLong(), propertyvalue.toLong())).toInt()
}

public fun WHvSetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSetPartitionProperty", longArrayOf(partition, propertycode.toLong(), propertybuffer, propertybuffersizeinbytes.toLong())).toInt()
}

public fun WHvSetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSetVirtualProcessorInterruptControllerState", longArrayOf(partition, vpindex.toLong(), state, statesize.toLong())).toInt()
}

public fun WHvSetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSetVirtualProcessorInterruptControllerState2", longArrayOf(partition, vpindex.toLong(), state, statesize.toLong())).toInt()
}

public fun WHvSetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSetVirtualProcessorRegisters", longArrayOf(partition, vpindex.toLong(), registernames, registercount.toLong(), registervalues)).toInt()
}

public fun WHvSetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSetVirtualProcessorState", longArrayOf(partition, vpindex.toLong(), statetype.toLong(), buffer, buffersizeinbytes.toLong())).toInt()
}

public fun WHvSetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSetVirtualProcessorXsaveState", longArrayOf(partition, vpindex.toLong(), buffer, buffersizeinbytes.toLong())).toInt()
}

public fun WHvSetVpciDevicePowerState(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, powerstate: Power.DEVICE_POWER_STATE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSetVpciDevicePowerState", longArrayOf(partition, logicaldeviceid.toLong(), Win32DynamicFfi.objectSlot(powerstate))).toInt()
}

public fun WHvSetupPartition(partition: WHV_PARTITION_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSetupPartition", longArrayOf(partition)).toInt()
}

public fun WHvSignalVirtualProcessorSynicEvent(partition: WHV_PARTITION_HANDLE, synicevent: WHV_SYNIC_EVENT_PARAMETERS, newlysignaled: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSignalVirtualProcessorSynicEvent", longArrayOf(partition, Win32DynamicFfi.objectSlot(synicevent), newlysignaled)).toInt()
}

public fun WHvStartPartitionMigration(partition: WHV_PARTITION_HANDLE, migrationhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvStartPartitionMigration", longArrayOf(partition, migrationhandle)).toInt()
}

public fun WHvSuspendPartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvSuspendPartitionTime", longArrayOf(partition)).toInt()
}

public fun WHvTranslateGva(partition: WHV_PARTITION_HANDLE, vpindex: UInt, gva: ULong, translateflags: WHV_TRANSLATE_GVA_FLAGS, translationresult: Long, gpa: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvTranslateGva", longArrayOf(partition, vpindex.toLong(), gva.toLong(), translateflags.toLong(), translationresult, gpa)).toInt()
}

public fun WHvUnmapGpaRange(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, sizeinbytes: ULong): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvUnmapGpaRange", longArrayOf(partition, guestaddress.toLong(), sizeinbytes.toLong())).toInt()
}

public fun WHvUnmapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvUnmapVpciDeviceInterrupt", longArrayOf(partition, logicaldeviceid.toLong(), index.toLong())).toInt()
}

public fun WHvUnmapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvUnmapVpciDeviceMmioRanges", longArrayOf(partition, logicaldeviceid.toLong())).toInt()
}

public fun WHvUnregisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvUnregisterPartitionDoorbellEvent", longArrayOf(partition, matchdata)).toInt()
}

public fun WHvUpdateTriggerParameters(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvUpdateTriggerParameters", longArrayOf(partition, parameters, triggerhandle)).toInt()
}

public fun WHvWriteGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvWriteGpaRange", longArrayOf(partition, vpindex.toLong(), guestaddress.toLong(), Win32DynamicFfi.objectSlot(controls), data, datasizeinbytes.toLong())).toInt()
}

public fun WHvWriteVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT {
    return Win32DynamicFfi.invoke("winhvplatform.dll", "WHvWriteVpciDeviceRegister", longArrayOf(partition, logicaldeviceid.toLong(), register, data)).toInt()
}
