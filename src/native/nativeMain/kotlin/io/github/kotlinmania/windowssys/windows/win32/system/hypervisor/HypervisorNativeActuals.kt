@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HCS_SYSTEM
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ApplyGuestMemoryFix(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, fixbuffer: Long, fixbuffersize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ApplyGuestMemoryFix(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, virtualaddress, fixbuffer.toCPointer<ByteVar>(), fixbuffersize)

public actual fun ApplyPendingSavedStateFileReplayLog(vmrsfile: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ApplyPendingSavedStateFileReplayLog(vmrsfile.toCPointer<ByteVar>())

public actual fun CallStackUnwind(vmsavedstatedumphandle: Long, vpid: UInt, imageinfo: Long, imageinfocount: UInt, framecount: UInt, callstack: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_CallStackUnwind(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, imageinfo.toCPointer<ByteVar>(), imageinfocount, framecount, callstack.toCPointer<ByteVar>())

public actual fun FindSavedStateSymbolFieldInType(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, fieldname: PCWSTR, offset: Long, found: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_FindSavedStateSymbolFieldInType(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, typename.toCPointer<ByteVar>(), fieldname.toCPointer<ByteVar>(), offset.toCPointer<ByteVar>(), found.toCPointer<ByteVar>())

public actual fun ForceActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: UByte): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ForceActiveVirtualTrustLevel(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, virtualtrustlevel)

public actual fun ForceArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: VIRTUAL_PROCESSOR_ARCH): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ForceArchitecture(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, architecture)

public actual fun ForceNestedHostMode(vmsavedstatedumphandle: Long, vpid: UInt, hostmode: BOOL, oldmode: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ForceNestedHostMode(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, hostmode, oldmode.toCPointer<ByteVar>())

public actual fun ForcePagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: PAGING_MODE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ForcePagingMode(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, pagingmode)

public actual fun GetActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetActiveVirtualTrustLevel(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, virtualtrustlevel.toCPointer<ByteVar>())

public actual fun GetArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetArchitecture(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, architecture.toCPointer<ByteVar>())

public actual fun GetEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevels: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetEnabledVirtualTrustLevels(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, virtualtrustlevels.toCPointer<ByteVar>())

public actual fun GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, virtualtrustlevels: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle.toCPointer<ByteVar>(), virtualtrustlevels.toCPointer<ByteVar>())

public actual fun GetGuestOsInfo(vmsavedstatedumphandle: Long, virtualtrustlevel: UByte, guestosinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetGuestOsInfo(vmsavedstatedumphandle.toCPointer<ByteVar>(), virtualtrustlevel, guestosinfo.toCPointer<ByteVar>())

public actual fun GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle: Long, memorychunkpagesize: Long, memorychunks: Long, memorychunkcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle.toCPointer<ByteVar>(), memorychunkpagesize.toCPointer<ByteVar>(), memorychunks.toCPointer<ByteVar>(), memorychunkcount.toCPointer<ByteVar>())

public actual fun GetGuestRawSavedMemorySize(vmsavedstatedumphandle: Long, guestrawsavedmemorysize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetGuestRawSavedMemorySize(vmsavedstatedumphandle.toCPointer<ByteVar>(), guestrawsavedmemorysize.toCPointer<ByteVar>())

public actual fun GetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetMemoryBlockCacheLimit(vmsavedstatedumphandle.toCPointer<ByteVar>(), memoryblockcachelimit.toCPointer<ByteVar>())

public actual fun GetNestedVirtualizationMode(vmsavedstatedumphandle: Long, vpid: UInt, enabled: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetNestedVirtualizationMode(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, enabled.toCPointer<ByteVar>())

public actual fun GetPagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetPagingMode(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, pagingmode.toCPointer<ByteVar>())

public actual fun GetRegisterValue(vmsavedstatedumphandle: Long, vpid: UInt, registerid: UInt, registervalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetRegisterValue(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, registerid, registervalue.toCPointer<ByteVar>())

public actual fun GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, typefieldinfomap: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, typename.toCPointer<ByteVar>(), typefieldinfomap.toCPointer<ByteVar>())

public actual fun GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetSavedStateSymbolTypeSize(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, size: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolTypeSize(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, typename.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun GetVpCount(vmsavedstatedumphandle: Long, vpcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GetVpCount(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpcount.toCPointer<ByteVar>())

public actual fun GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: Long, physicaladdress: ULong, rawsavedmemoryoffset: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle.toCPointer<ByteVar>(), physicaladdress, rawsavedmemoryoffset.toCPointer<ByteVar>())

public actual fun GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, physicaladdress: Long, unmappedregionsize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, virtualaddress, physicaladdress.toCPointer<ByteVar>(), unmappedregionsize.toCPointer<ByteVar>())

public actual fun HdvCreateDeviceInstance(devicehosthandle: Long, devicetype: HDV_DEVICE_TYPE, deviceclassid: Long, deviceinstanceid: Long, deviceinterface: Long, devicecontext: Long, devicehandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvCreateDeviceInstance(devicehosthandle.toCPointer<ByteVar>(), devicetype, deviceclassid.toCPointer<ByteVar>(), deviceinstanceid.toCPointer<ByteVar>(), deviceinterface.toCPointer<ByteVar>(), devicecontext.toCPointer<ByteVar>(), devicehandle.toCPointer<ByteVar>())

public actual fun HdvCreateGuestMemoryAperture(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: BOOL, mappedaddress: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvCreateGuestMemoryAperture(requestor.toCPointer<ByteVar>(), guestphysicaladdress, bytecount, writeprotected, mappedaddress.toCPointer<ByteVar>())

public actual fun HdvCreateSectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HDV_MMIO_MAPPING_FLAGS, sectionhandle: HANDLE, sectionoffsetinpages: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvCreateSectionBackedMmioRange(requestor.toCPointer<ByteVar>(), barindex, offsetinpages, lengthinpages, mappingflags, sectionhandle.toCPointer<ByteVar>(), sectionoffsetinpages)

public actual fun HdvDeliverGuestInterrupt(requestor: Long, msiaddress: ULong, msidata: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvDeliverGuestInterrupt(requestor.toCPointer<ByteVar>(), msiaddress, msidata)

public actual fun HdvDestroyGuestMemoryAperture(requestor: Long, mappedaddress: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvDestroyGuestMemoryAperture(requestor.toCPointer<ByteVar>(), mappedaddress.toCPointer<ByteVar>())

public actual fun HdvDestroySectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvDestroySectionBackedMmioRange(requestor.toCPointer<ByteVar>(), barindex, offsetinpages)

public actual fun HdvInitializeDeviceHost(computesystem: HCS_SYSTEM, devicehosthandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHost(computesystem.toCPointer<ByteVar>(), devicehosthandle.toCPointer<ByteVar>())

public actual fun HdvInitializeDeviceHostEx(computesystem: HCS_SYSTEM, flags: HDV_DEVICE_HOST_FLAGS, devicehosthandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHostEx(computesystem.toCPointer<ByteVar>(), flags, devicehosthandle.toCPointer<ByteVar>())

public actual fun HdvReadGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvReadGuestMemory(requestor.toCPointer<ByteVar>(), guestphysicaladdress, bytecount, buffer.toCPointer<ByteVar>())

public actual fun HdvRegisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvRegisterDoorbell(requestor.toCPointer<ByteVar>(), barindex, baroffset, triggervalue, flags, doorbellevent.toCPointer<ByteVar>())

public actual fun HdvTeardownDeviceHost(devicehosthandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvTeardownDeviceHost(devicehosthandle.toCPointer<ByteVar>())

public actual fun HdvUnregisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvUnregisterDoorbell(requestor.toCPointer<ByteVar>(), barindex, baroffset, triggervalue, flags)

public actual fun HdvWriteGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_HdvWriteGuestMemory(requestor.toCPointer<ByteVar>(), guestphysicaladdress, bytecount, buffer.toCPointer<ByteVar>())

public actual fun InKernelSpace(vmsavedstatedumphandle: Long, vpid: UInt, inkernelspace: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_InKernelSpace(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, inkernelspace.toCPointer<ByteVar>())

public actual fun IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: Long, vpid: UInt, activevirtualtrustlevelenabled: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, activevirtualtrustlevelenabled.toCPointer<ByteVar>())

public actual fun IsNestedVirtualizationEnabled(vmsavedstatedumphandle: Long, enabled: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_IsNestedVirtualizationEnabled(vmsavedstatedumphandle.toCPointer<ByteVar>(), enabled.toCPointer<ByteVar>())

public actual fun LoadSavedStateFile(vmrsfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_LoadSavedStateFile(vmrsfile.toCPointer<ByteVar>(), vmsavedstatedumphandle.toCPointer<ByteVar>())

public actual fun LoadSavedStateFiles(binfile: PCWSTR, vsvfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_LoadSavedStateFiles(binfile.toCPointer<ByteVar>(), vsvfile.toCPointer<ByteVar>(), vmsavedstatedumphandle.toCPointer<ByteVar>())

public actual fun LoadSavedStateModuleSymbols(vmsavedstatedumphandle: Long, imagename: PCSTR, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbols(vmsavedstatedumphandle.toCPointer<ByteVar>(), imagename.toCPointer<ByteVar>(), modulename.toCPointer<ByteVar>(), baseaddress, sizeofbase)

public actual fun LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: Long, imagename: PCSTR, imagetimestamp: UInt, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle.toCPointer<ByteVar>(), imagename.toCPointer<ByteVar>(), imagetimestamp, modulename.toCPointer<ByteVar>(), baseaddress, sizeofbase)

public actual fun LoadSavedStateSymbolProvider(vmsavedstatedumphandle: Long, usersymbols: PCWSTR, force: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_LoadSavedStateSymbolProvider(vmsavedstatedumphandle.toCPointer<ByteVar>(), usersymbols.toCPointer<ByteVar>(), force)

public actual fun LocateSavedStateFiles(vmname: PCWSTR, snapshotname: PCWSTR, binpath: Long, vsvpath: Long, vmrspath: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_LocateSavedStateFiles(vmname.toCPointer<ByteVar>(), snapshotname.toCPointer<ByteVar>(), binpath.toCPointer<ByteVar>(), vsvpath.toCPointer<ByteVar>(), vmrspath.toCPointer<ByteVar>())

public actual fun ReadGuestPhysicalAddress(vmsavedstatedumphandle: Long, physicaladdress: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ReadGuestPhysicalAddress(vmsavedstatedumphandle.toCPointer<ByteVar>(), physicaladdress, buffer.toCPointer<ByteVar>(), buffersize, bytesread.toCPointer<ByteVar>())

public actual fun ReadGuestRawSavedMemory(vmsavedstatedumphandle: Long, rawsavedmemoryoffset: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ReadGuestRawSavedMemory(vmsavedstatedumphandle.toCPointer<ByteVar>(), rawsavedmemoryoffset, buffer.toCPointer<ByteVar>(), buffersize, bytesread.toCPointer<ByteVar>())

public actual fun ReadSavedStateGlobalVariable(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, buffer: Long, buffersize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ReadSavedStateGlobalVariable(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, globalname.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize)

public actual fun ReleaseSavedStateFiles(vmsavedstatedumphandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ReleaseSavedStateFiles(vmsavedstatedumphandle.toCPointer<ByteVar>())

public actual fun ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle.toCPointer<ByteVar>())

public actual fun ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, virtualaddress: Long, size: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, globalname.toCPointer<ByteVar>(), virtualaddress.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun ScanMemoryForDosImages(vmsavedstatedumphandle: Long, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: Long, foundimagecallback: FOUND_IMAGE_CALLBACK, standaloneaddress: Long, standaloneaddresscount: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_ScanMemoryForDosImages(vmsavedstatedumphandle.toCPointer<ByteVar>(), vpid, startaddress, endaddress, callbackcontext.toCPointer<ByteVar>(), foundimagecallback.toLong().toCPointer<ByteVar>(), standaloneaddress.toCPointer<ByteVar>(), standaloneaddresscount)

public actual fun SetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_SetMemoryBlockCacheLimit(vmsavedstatedumphandle.toCPointer<ByteVar>(), memoryblockcachelimit)

public actual fun SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: Long, callback: GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>())

public actual fun WHvAcceptPartitionMigration(migrationhandle: HANDLE, partition: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvAcceptPartitionMigration(migrationhandle.toCPointer<ByteVar>(), partition.toCPointer<ByteVar>())

public actual fun WHvAdviseGpaRange(partition: WHV_PARTITION_HANDLE, gparanges: Long, gparangescount: UInt, advice: WHV_ADVISE_GPA_RANGE_CODE, advicebuffer: Long, advicebuffersizeinbytes: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvAdviseGpaRange(partition, gparanges.toCPointer<ByteVar>(), gparangescount, advice, advicebuffer.toCPointer<ByteVar>(), advicebuffersizeinbytes)

public actual fun WHvAllocateVpciResource(providerid: Long, flags: WHV_ALLOCATE_VPCI_RESOURCE_FLAGS, resourcedescriptor: Long, resourcedescriptorsizeinbytes: UInt, vpciresource: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvAllocateVpciResource(providerid.toCPointer<ByteVar>(), flags, resourcedescriptor.toCPointer<ByteVar>(), resourcedescriptorsizeinbytes, vpciresource.toCPointer<ByteVar>())

public actual fun WHvCancelPartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvCancelPartitionMigration(partition)

public actual fun WHvCancelRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvCancelRunVirtualProcessor(partition, vpindex, flags)

public actual fun WHvCompletePartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvCompletePartitionMigration(partition)

public actual fun WHvCreateNotificationPort(partition: WHV_PARTITION_HANDLE, parameters: Long, eventhandle: HANDLE, porthandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvCreateNotificationPort(partition, parameters.toCPointer<ByteVar>(), eventhandle.toCPointer<ByteVar>(), porthandle.toCPointer<ByteVar>())

public actual fun WHvCreatePartition(partition: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvCreatePartition(partition.toCPointer<ByteVar>())

public actual fun WHvCreateTrigger(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long, eventhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvCreateTrigger(partition, parameters.toCPointer<ByteVar>(), triggerhandle.toCPointer<ByteVar>(), eventhandle.toCPointer<ByteVar>())

public actual fun WHvCreateVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor(partition, vpindex, flags)

public actual fun WHvCreateVirtualProcessor2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, properties: Long, propertycount: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor2(partition, vpindex, properties.toCPointer<ByteVar>(), propertycount)

public actual fun WHvCreateVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, vpciresource: HANDLE, flags: WHV_CREATE_VPCI_DEVICE_FLAGS, notificationeventhandle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvCreateVpciDevice(partition, logicaldeviceid, vpciresource.toCPointer<ByteVar>(), flags, notificationeventhandle.toCPointer<ByteVar>())

public actual fun WHvDeleteNotificationPort(partition: WHV_PARTITION_HANDLE, porthandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvDeleteNotificationPort(partition, porthandle.toCPointer<ByteVar>())

public actual fun WHvDeletePartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvDeletePartition(partition)

public actual fun WHvDeleteTrigger(partition: WHV_PARTITION_HANDLE, triggerhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvDeleteTrigger(partition, triggerhandle.toCPointer<ByteVar>())

public actual fun WHvDeleteVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvDeleteVirtualProcessor(partition, vpindex)

public actual fun WHvDeleteVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvDeleteVpciDevice(partition, logicaldeviceid)

public actual fun WHvEmulatorCreateEmulator(callbacks: Long, emulator: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvEmulatorCreateEmulator(callbacks.toCPointer<ByteVar>(), emulator.toCPointer<ByteVar>())

public actual fun WHvEmulatorDestroyEmulator(emulator: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvEmulatorDestroyEmulator(emulator.toCPointer<ByteVar>())

public actual fun WHvEmulatorTryIoEmulation(emulator: Long, context: Long, vpcontext: Long, ioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvEmulatorTryIoEmulation(emulator.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), vpcontext.toCPointer<ByteVar>(), ioinstructioncontext.toCPointer<ByteVar>(), emulatorreturnstatus.toCPointer<ByteVar>())

public actual fun WHvEmulatorTryMmioEmulation(emulator: Long, context: Long, vpcontext: Long, mmioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvEmulatorTryMmioEmulation(emulator.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), vpcontext.toCPointer<ByteVar>(), mmioinstructioncontext.toCPointer<ByteVar>(), emulatorreturnstatus.toCPointer<ByteVar>())

public actual fun WHvGetCapability(capabilitycode: WHV_CAPABILITY_CODE, capabilitybuffer: Long, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetCapability(capabilitycode, capabilitybuffer.toCPointer<ByteVar>(), capabilitybuffersizeinbytes, writtensizeinbytes.toCPointer<ByteVar>())

public actual fun WHvGetInterruptTargetVpSet(partition: WHV_PARTITION_HANDLE, destination: ULong, destinationmode: WHV_INTERRUPT_DESTINATION_MODE, targetvps: Long, vpcount: UInt, targetvpcount: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetInterruptTargetVpSet(partition, destination, destinationmode, targetvps.toCPointer<ByteVar>(), vpcount, targetvpcount.toCPointer<ByteVar>())

public actual fun WHvGetPartitionCounters(partition: WHV_PARTITION_HANDLE, counterset: WHV_PARTITION_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetPartitionCounters(partition, counterset, buffer.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten.toCPointer<ByteVar>())

public actual fun WHvGetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetPartitionProperty(partition, propertycode, propertybuffer.toCPointer<ByteVar>(), propertybuffersizeinbytes, writtensizeinbytes.toCPointer<ByteVar>())

public actual fun WHvGetVirtualProcessorCounters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, counterset: WHV_PROCESSOR_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCounters(partition, vpindex, counterset, buffer.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten.toCPointer<ByteVar>())

public actual fun WHvGetVirtualProcessorCpuidOutput(partition: WHV_PARTITION_HANDLE, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCpuidOutput(partition, vpindex, eax, ecx, cpuidoutput.toCPointer<ByteVar>())

public actual fun WHvGetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState(partition, vpindex, state.toCPointer<ByteVar>(), statesize, writtensize.toCPointer<ByteVar>())

public actual fun WHvGetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState2(partition, vpindex, state.toCPointer<ByteVar>(), statesize, writtensize.toCPointer<ByteVar>())

public actual fun WHvGetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorRegisters(partition, vpindex, registernames.toCPointer<ByteVar>(), registercount, registervalues.toCPointer<ByteVar>())

public actual fun WHvGetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorState(partition, vpindex, statetype, buffer.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten.toCPointer<ByteVar>())

public actual fun WHvGetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorXsaveState(partition, vpindex, buffer.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten.toCPointer<ByteVar>())

public actual fun WHvGetVpciDeviceInterruptTarget(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: Long, targetsizeinbytes: UInt, byteswritten: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceInterruptTarget(partition, logicaldeviceid, index, multimessagenumber, target.toCPointer<ByteVar>(), targetsizeinbytes, byteswritten.toCPointer<ByteVar>())

public actual fun WHvGetVpciDeviceNotification(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, notification: Long, notificationsizeinbytes: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceNotification(partition, logicaldeviceid, notification.toCPointer<ByteVar>(), notificationsizeinbytes)

public actual fun WHvGetVpciDeviceProperty(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, propertycode: WHV_VPCI_DEVICE_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceProperty(partition, logicaldeviceid, propertycode, propertybuffer.toCPointer<ByteVar>(), propertybuffersizeinbytes, writtensizeinbytes.toCPointer<ByteVar>())

public actual fun WHvMapGpaRange(partition: WHV_PARTITION_HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvMapGpaRange(partition, sourceaddress.toCPointer<ByteVar>(), guestaddress, sizeinbytes, flags)

public actual fun WHvMapGpaRange2(partition: WHV_PARTITION_HANDLE, process: HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvMapGpaRange2(partition, process.toCPointer<ByteVar>(), sourceaddress.toCPointer<ByteVar>(), guestaddress, sizeinbytes, flags)

public actual fun WHvMapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: Long, msiaddress: Long, msidata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceInterrupt(partition, logicaldeviceid, index, messagecount, target.toCPointer<ByteVar>(), msiaddress.toCPointer<ByteVar>(), msidata.toCPointer<ByteVar>())

public actual fun WHvMapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, mappingcount: Long, mappings: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceMmioRanges(partition, logicaldeviceid, mappingcount.toCPointer<ByteVar>(), mappings.toCPointer<ByteVar>())

public actual fun WHvPostVirtualProcessorSynicMessage(partition: WHV_PARTITION_HANDLE, vpindex: UInt, sintindex: UInt, message: Long, messagesizeinbytes: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvPostVirtualProcessorSynicMessage(partition, vpindex, sintindex, message.toCPointer<ByteVar>(), messagesizeinbytes)

public actual fun WHvQueryGpaRangeDirtyBitmap(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: Long, bitmapsizeinbytes: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvQueryGpaRangeDirtyBitmap(partition, guestaddress, rangesizeinbytes, bitmap.toCPointer<ByteVar>(), bitmapsizeinbytes)

public actual fun WHvReadGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT =
    0

public actual fun WHvReadVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvReadVpciDeviceRegister(partition, logicaldeviceid, register.toCPointer<ByteVar>(), data.toCPointer<ByteVar>())

public actual fun WHvRegisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long, eventhandle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvRegisterPartitionDoorbellEvent(partition, matchdata.toCPointer<ByteVar>(), eventhandle.toCPointer<ByteVar>())

public actual fun WHvRequestInterrupt(partition: WHV_PARTITION_HANDLE, interrupt: Long, interruptcontrolsize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvRequestInterrupt(partition, interrupt.toCPointer<ByteVar>(), interruptcontrolsize)

public actual fun WHvRequestVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvRequestVpciDeviceInterrupt(partition, logicaldeviceid, msiaddress, msidata)

public actual fun WHvResetPartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvResetPartition(partition)

public actual fun WHvResumePartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvResumePartitionTime(partition)

public actual fun WHvRetargetVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvRetargetVpciDeviceInterrupt(partition, logicaldeviceid, msiaddress, msidata, target.toCPointer<ByteVar>())

public actual fun WHvRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, exitcontext: Long, exitcontextsizeinbytes: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvRunVirtualProcessor(partition, vpindex, exitcontext.toCPointer<ByteVar>(), exitcontextsizeinbytes)

public actual fun WHvSetNotificationPortProperty(partition: WHV_PARTITION_HANDLE, porthandle: Long, propertycode: WHV_NOTIFICATION_PORT_PROPERTY_CODE, propertyvalue: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSetNotificationPortProperty(partition, porthandle.toCPointer<ByteVar>(), propertycode, propertyvalue)

public actual fun WHvSetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSetPartitionProperty(partition, propertycode, propertybuffer.toCPointer<ByteVar>(), propertybuffersizeinbytes)

public actual fun WHvSetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState(partition, vpindex, state.toCPointer<ByteVar>(), statesize)

public actual fun WHvSetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState2(partition, vpindex, state.toCPointer<ByteVar>(), statesize)

public actual fun WHvSetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorRegisters(partition, vpindex, registernames.toCPointer<ByteVar>(), registercount, registervalues.toCPointer<ByteVar>())

public actual fun WHvSetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorState(partition, vpindex, statetype, buffer.toCPointer<ByteVar>(), buffersizeinbytes)

public actual fun WHvSetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorXsaveState(partition, vpindex, buffer.toCPointer<ByteVar>(), buffersizeinbytes)

public actual fun WHvSetVpciDevicePowerState(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, powerstate: DEVICE_POWER_STATE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSetVpciDevicePowerState(partition, logicaldeviceid, powerstate)

public actual fun WHvSetupPartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSetupPartition(partition)

public actual fun WHvSignalVirtualProcessorSynicEvent(partition: WHV_PARTITION_HANDLE, synicevent: WHV_SYNIC_EVENT_PARAMETERS, newlysignaled: Long): HRESULT =
    0

public actual fun WHvStartPartitionMigration(partition: WHV_PARTITION_HANDLE, migrationhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvStartPartitionMigration(partition, migrationhandle.toCPointer<ByteVar>())

public actual fun WHvSuspendPartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvSuspendPartitionTime(partition)

public actual fun WHvTranslateGva(partition: WHV_PARTITION_HANDLE, vpindex: UInt, gva: ULong, translateflags: WHV_TRANSLATE_GVA_FLAGS, translationresult: Long, gpa: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvTranslateGva(partition, vpindex, gva, translateflags, translationresult.toCPointer<ByteVar>(), gpa.toCPointer<ByteVar>())

public actual fun WHvUnmapGpaRange(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, sizeinbytes: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvUnmapGpaRange(partition, guestaddress, sizeinbytes)

public actual fun WHvUnmapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceInterrupt(partition, logicaldeviceid, index)

public actual fun WHvUnmapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceMmioRanges(partition, logicaldeviceid)

public actual fun WHvUnregisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvUnregisterPartitionDoorbellEvent(partition, matchdata.toCPointer<ByteVar>())

public actual fun WHvUpdateTriggerParameters(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvUpdateTriggerParameters(partition, parameters.toCPointer<ByteVar>(), triggerhandle.toCPointer<ByteVar>())

public actual fun WHvWriteGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT =
    0

public actual fun WHvWriteVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_WHvWriteVpciDeviceRegister(partition, logicaldeviceid, register.toCPointer<ByteVar>(), data.toCPointer<ByteVar>())
