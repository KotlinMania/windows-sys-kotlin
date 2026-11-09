@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HCS_SYSTEM
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE

private val _windowsWin32SystemHypervisorNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ApplyGuestMemoryFix(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, fixbuffer: Long, fixbuffersize: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ApplyGuestMemoryFix(vmsavedstatedumphandle.toString(), vpid.toInt(), virtualaddress.toString(), fixbuffer.toString(), fixbuffersize.toInt()) as Int) else 0

public actual fun ApplyPendingSavedStateFileReplayLog(vmrsfile: PCWSTR): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ApplyPendingSavedStateFileReplayLog(vmrsfile.toString()) as Int) else 0

public actual fun CallStackUnwind(vmsavedstatedumphandle: Long, vpid: UInt, imageinfo: Long, imageinfocount: UInt, framecount: UInt, callstack: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_CallStackUnwind(vmsavedstatedumphandle.toString(), vpid.toInt(), imageinfo.toString(), imageinfocount.toInt(), framecount.toInt(), callstack.toString()) as Int) else 0

public actual fun FindSavedStateSymbolFieldInType(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, fieldname: PCWSTR, offset: Long, found: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_FindSavedStateSymbolFieldInType(vmsavedstatedumphandle.toString(), vpid.toInt(), typename.toString(), fieldname.toString(), offset.toString(), found.toString()) as Int) else 0

public actual fun ForceActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: UByte): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ForceActiveVirtualTrustLevel(vmsavedstatedumphandle.toString(), vpid.toInt(), virtualtrustlevel.toInt()) as Int) else 0

public actual fun ForceArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: VIRTUAL_PROCESSOR_ARCH): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ForceArchitecture(vmsavedstatedumphandle.toString(), vpid.toInt(), architecture) as Int) else 0

public actual fun ForceNestedHostMode(vmsavedstatedumphandle: Long, vpid: UInt, hostmode: BOOL, oldmode: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ForceNestedHostMode(vmsavedstatedumphandle.toString(), vpid.toInt(), hostmode, oldmode.toString()) as Int) else 0

public actual fun ForcePagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: PAGING_MODE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ForcePagingMode(vmsavedstatedumphandle.toString(), vpid.toInt(), pagingmode) as Int) else 0

public actual fun GetActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetActiveVirtualTrustLevel(vmsavedstatedumphandle.toString(), vpid.toInt(), virtualtrustlevel.toString()) as Int) else 0

public actual fun GetArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetArchitecture(vmsavedstatedumphandle.toString(), vpid.toInt(), architecture.toString()) as Int) else 0

public actual fun GetEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevels: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetEnabledVirtualTrustLevels(vmsavedstatedumphandle.toString(), vpid.toInt(), virtualtrustlevels.toString()) as Int) else 0

public actual fun GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, virtualtrustlevels: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle.toString(), virtualtrustlevels.toString()) as Int) else 0

public actual fun GetGuestOsInfo(vmsavedstatedumphandle: Long, virtualtrustlevel: UByte, guestosinfo: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetGuestOsInfo(vmsavedstatedumphandle.toString(), virtualtrustlevel.toInt(), guestosinfo.toString()) as Int) else 0

public actual fun GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle: Long, memorychunkpagesize: Long, memorychunks: Long, memorychunkcount: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle.toString(), memorychunkpagesize.toString(), memorychunks.toString(), memorychunkcount.toString()) as Int) else 0

public actual fun GetGuestRawSavedMemorySize(vmsavedstatedumphandle: Long, guestrawsavedmemorysize: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetGuestRawSavedMemorySize(vmsavedstatedumphandle.toString(), guestrawsavedmemorysize.toString()) as Int) else 0

public actual fun GetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetMemoryBlockCacheLimit(vmsavedstatedumphandle.toString(), memoryblockcachelimit.toString()) as Int) else 0

public actual fun GetNestedVirtualizationMode(vmsavedstatedumphandle: Long, vpid: UInt, enabled: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetNestedVirtualizationMode(vmsavedstatedumphandle.toString(), vpid.toInt(), enabled.toString()) as Int) else 0

public actual fun GetPagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetPagingMode(vmsavedstatedumphandle.toString(), vpid.toInt(), pagingmode.toString()) as Int) else 0

public actual fun GetRegisterValue(vmsavedstatedumphandle: Long, vpid: UInt, registerid: UInt, registervalue: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetRegisterValue(vmsavedstatedumphandle.toString(), vpid.toInt(), registerid.toInt(), registervalue.toString()) as Int) else 0

public actual fun GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, typefieldinfomap: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle.toString(), vpid.toInt(), typename.toString(), typefieldinfomap.toString()) as Int) else 0

public actual fun GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle: Long): HANDLE =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle.toString()) as String).toLong() else 0L

public actual fun GetSavedStateSymbolTypeSize(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, size: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolTypeSize(vmsavedstatedumphandle.toString(), vpid.toInt(), typename.toString(), size.toString()) as Int) else 0

public actual fun GetVpCount(vmsavedstatedumphandle: Long, vpcount: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GetVpCount(vmsavedstatedumphandle.toString(), vpcount.toString()) as Int) else 0

public actual fun GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: Long, physicaladdress: ULong, rawsavedmemoryoffset: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle.toString(), physicaladdress.toString(), rawsavedmemoryoffset.toString()) as Int) else 0

public actual fun GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, physicaladdress: Long, unmappedregionsize: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle.toString(), vpid.toInt(), virtualaddress.toString(), physicaladdress.toString(), unmappedregionsize.toString()) as Int) else 0

public actual fun HdvCreateDeviceInstance(devicehosthandle: Long, devicetype: HDV_DEVICE_TYPE, deviceclassid: Long, deviceinstanceid: Long, deviceinterface: Long, devicecontext: Long, devicehandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvCreateDeviceInstance(devicehosthandle.toString(), devicetype, deviceclassid.toString(), deviceinstanceid.toString(), deviceinterface.toString(), devicecontext.toString(), devicehandle.toString()) as Int) else 0

public actual fun HdvCreateGuestMemoryAperture(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: BOOL, mappedaddress: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvCreateGuestMemoryAperture(requestor.toString(), guestphysicaladdress.toString(), bytecount.toInt(), writeprotected, mappedaddress.toString()) as Int) else 0

public actual fun HdvCreateSectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HDV_MMIO_MAPPING_FLAGS, sectionhandle: HANDLE, sectionoffsetinpages: ULong): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvCreateSectionBackedMmioRange(requestor.toString(), barindex, offsetinpages.toString(), lengthinpages.toString(), mappingflags, sectionhandle.toString(), sectionoffsetinpages.toString()) as Int) else 0

public actual fun HdvDeliverGuestInterrupt(requestor: Long, msiaddress: ULong, msidata: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvDeliverGuestInterrupt(requestor.toString(), msiaddress.toString(), msidata.toInt()) as Int) else 0

public actual fun HdvDestroyGuestMemoryAperture(requestor: Long, mappedaddress: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvDestroyGuestMemoryAperture(requestor.toString(), mappedaddress.toString()) as Int) else 0

public actual fun HdvDestroySectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvDestroySectionBackedMmioRange(requestor.toString(), barindex, offsetinpages.toString()) as Int) else 0

public actual fun HdvInitializeDeviceHost(computesystem: HCS_SYSTEM, devicehosthandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHost(computesystem.toString(), devicehosthandle.toString()) as Int) else 0

public actual fun HdvInitializeDeviceHostEx(computesystem: HCS_SYSTEM, flags: HDV_DEVICE_HOST_FLAGS, devicehosthandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHostEx(computesystem.toString(), flags, devicehosthandle.toString()) as Int) else 0

public actual fun HdvReadGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvReadGuestMemory(requestor.toString(), guestphysicaladdress.toString(), bytecount.toInt(), buffer.toString()) as Int) else 0

public actual fun HdvRegisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvRegisterDoorbell(requestor.toString(), barindex, baroffset.toString(), triggervalue.toString(), flags.toString(), doorbellevent.toString()) as Int) else 0

public actual fun HdvTeardownDeviceHost(devicehosthandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvTeardownDeviceHost(devicehosthandle.toString()) as Int) else 0

public actual fun HdvUnregisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvUnregisterDoorbell(requestor.toString(), barindex, baroffset.toString(), triggervalue.toString(), flags.toString()) as Int) else 0

public actual fun HdvWriteGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_HdvWriteGuestMemory(requestor.toString(), guestphysicaladdress.toString(), bytecount.toInt(), buffer.toString()) as Int) else 0

public actual fun InKernelSpace(vmsavedstatedumphandle: Long, vpid: UInt, inkernelspace: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_InKernelSpace(vmsavedstatedumphandle.toString(), vpid.toInt(), inkernelspace.toString()) as Int) else 0

public actual fun IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: Long, vpid: UInt, activevirtualtrustlevelenabled: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle.toString(), vpid.toInt(), activevirtualtrustlevelenabled.toString()) as Int) else 0

public actual fun IsNestedVirtualizationEnabled(vmsavedstatedumphandle: Long, enabled: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_IsNestedVirtualizationEnabled(vmsavedstatedumphandle.toString(), enabled.toString()) as Int) else 0

public actual fun LoadSavedStateFile(vmrsfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_LoadSavedStateFile(vmrsfile.toString(), vmsavedstatedumphandle.toString()) as Int) else 0

public actual fun LoadSavedStateFiles(binfile: PCWSTR, vsvfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_LoadSavedStateFiles(binfile.toString(), vsvfile.toString(), vmsavedstatedumphandle.toString()) as Int) else 0

public actual fun LoadSavedStateModuleSymbols(vmsavedstatedumphandle: Long, imagename: PCSTR, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbols(vmsavedstatedumphandle.toString(), imagename.toString(), modulename.toString(), baseaddress.toString(), sizeofbase.toInt()) as Int) else 0

public actual fun LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: Long, imagename: PCSTR, imagetimestamp: UInt, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle.toString(), imagename.toString(), imagetimestamp.toInt(), modulename.toString(), baseaddress.toString(), sizeofbase.toInt()) as Int) else 0

public actual fun LoadSavedStateSymbolProvider(vmsavedstatedumphandle: Long, usersymbols: PCWSTR, force: BOOL): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_LoadSavedStateSymbolProvider(vmsavedstatedumphandle.toString(), usersymbols.toString(), force) as Int) else 0

public actual fun LocateSavedStateFiles(vmname: PCWSTR, snapshotname: PCWSTR, binpath: Long, vsvpath: Long, vmrspath: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_LocateSavedStateFiles(vmname.toString(), snapshotname.toString(), binpath.toString(), vsvpath.toString(), vmrspath.toString()) as Int) else 0

public actual fun ReadGuestPhysicalAddress(vmsavedstatedumphandle: Long, physicaladdress: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ReadGuestPhysicalAddress(vmsavedstatedumphandle.toString(), physicaladdress.toString(), buffer.toString(), buffersize.toInt(), bytesread.toString()) as Int) else 0

public actual fun ReadGuestRawSavedMemory(vmsavedstatedumphandle: Long, rawsavedmemoryoffset: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ReadGuestRawSavedMemory(vmsavedstatedumphandle.toString(), rawsavedmemoryoffset.toString(), buffer.toString(), buffersize.toInt(), bytesread.toString()) as Int) else 0

public actual fun ReadSavedStateGlobalVariable(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, buffer: Long, buffersize: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ReadSavedStateGlobalVariable(vmsavedstatedumphandle.toString(), vpid.toInt(), globalname.toString(), buffer.toString(), buffersize.toInt()) as Int) else 0

public actual fun ReleaseSavedStateFiles(vmsavedstatedumphandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ReleaseSavedStateFiles(vmsavedstatedumphandle.toString()) as Int) else 0

public actual fun ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle.toString()) as Int) else 0

public actual fun ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, virtualaddress: Long, size: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle.toString(), vpid.toInt(), globalname.toString(), virtualaddress.toString(), size.toString()) as Int) else 0

public actual fun ScanMemoryForDosImages(vmsavedstatedumphandle: Long, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: Long, foundimagecallback: FOUND_IMAGE_CALLBACK, standaloneaddress: Long, standaloneaddresscount: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_ScanMemoryForDosImages(vmsavedstatedumphandle.toString(), vpid.toInt(), startaddress.toString(), endaddress.toString(), callbackcontext.toString(), foundimagecallback.toLong().toString(), standaloneaddress.toString(), standaloneaddresscount.toInt()) as Int) else 0

public actual fun SetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: ULong): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_SetMemoryBlockCacheLimit(vmsavedstatedumphandle.toString(), memoryblockcachelimit.toString()) as Int) else 0

public actual fun SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: Long, callback: GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle.toString(), callback.toLong().toString()) as Int) else 0

public actual fun WHvAcceptPartitionMigration(migrationhandle: HANDLE, partition: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvAcceptPartitionMigration(migrationhandle.toString(), partition.toString()) as Int) else 0

public actual fun WHvAdviseGpaRange(partition: WHV_PARTITION_HANDLE, gparanges: Long, gparangescount: UInt, advice: WHV_ADVISE_GPA_RANGE_CODE, advicebuffer: Long, advicebuffersizeinbytes: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvAdviseGpaRange(partition.toString(), gparanges.toString(), gparangescount.toInt(), advice, advicebuffer.toString(), advicebuffersizeinbytes.toInt()) as Int) else 0

public actual fun WHvAllocateVpciResource(providerid: Long, flags: WHV_ALLOCATE_VPCI_RESOURCE_FLAGS, resourcedescriptor: Long, resourcedescriptorsizeinbytes: UInt, vpciresource: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvAllocateVpciResource(providerid.toString(), flags, resourcedescriptor.toString(), resourcedescriptorsizeinbytes.toInt(), vpciresource.toString()) as Int) else 0

public actual fun WHvCancelPartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvCancelPartitionMigration(partition.toString()) as Int) else 0

public actual fun WHvCancelRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvCancelRunVirtualProcessor(partition.toString(), vpindex.toInt(), flags.toInt()) as Int) else 0

public actual fun WHvCompletePartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvCompletePartitionMigration(partition.toString()) as Int) else 0

public actual fun WHvCreateNotificationPort(partition: WHV_PARTITION_HANDLE, parameters: Long, eventhandle: HANDLE, porthandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvCreateNotificationPort(partition.toString(), parameters.toString(), eventhandle.toString(), porthandle.toString()) as Int) else 0

public actual fun WHvCreatePartition(partition: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvCreatePartition(partition.toString()) as Int) else 0

public actual fun WHvCreateTrigger(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long, eventhandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvCreateTrigger(partition.toString(), parameters.toString(), triggerhandle.toString(), eventhandle.toString()) as Int) else 0

public actual fun WHvCreateVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor(partition.toString(), vpindex.toInt(), flags.toInt()) as Int) else 0

public actual fun WHvCreateVirtualProcessor2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, properties: Long, propertycount: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor2(partition.toString(), vpindex.toInt(), properties.toString(), propertycount.toInt()) as Int) else 0

public actual fun WHvCreateVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, vpciresource: HANDLE, flags: WHV_CREATE_VPCI_DEVICE_FLAGS, notificationeventhandle: HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvCreateVpciDevice(partition.toString(), logicaldeviceid.toString(), vpciresource.toString(), flags, notificationeventhandle.toString()) as Int) else 0

public actual fun WHvDeleteNotificationPort(partition: WHV_PARTITION_HANDLE, porthandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvDeleteNotificationPort(partition.toString(), porthandle.toString()) as Int) else 0

public actual fun WHvDeletePartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvDeletePartition(partition.toString()) as Int) else 0

public actual fun WHvDeleteTrigger(partition: WHV_PARTITION_HANDLE, triggerhandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvDeleteTrigger(partition.toString(), triggerhandle.toString()) as Int) else 0

public actual fun WHvDeleteVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvDeleteVirtualProcessor(partition.toString(), vpindex.toInt()) as Int) else 0

public actual fun WHvDeleteVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvDeleteVpciDevice(partition.toString(), logicaldeviceid.toString()) as Int) else 0

public actual fun WHvEmulatorCreateEmulator(callbacks: Long, emulator: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvEmulatorCreateEmulator(callbacks.toString(), emulator.toString()) as Int) else 0

public actual fun WHvEmulatorDestroyEmulator(emulator: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvEmulatorDestroyEmulator(emulator.toString()) as Int) else 0

public actual fun WHvEmulatorTryIoEmulation(emulator: Long, context: Long, vpcontext: Long, ioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvEmulatorTryIoEmulation(emulator.toString(), context.toString(), vpcontext.toString(), ioinstructioncontext.toString(), emulatorreturnstatus.toString()) as Int) else 0

public actual fun WHvEmulatorTryMmioEmulation(emulator: Long, context: Long, vpcontext: Long, mmioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvEmulatorTryMmioEmulation(emulator.toString(), context.toString(), vpcontext.toString(), mmioinstructioncontext.toString(), emulatorreturnstatus.toString()) as Int) else 0

public actual fun WHvGetCapability(capabilitycode: WHV_CAPABILITY_CODE, capabilitybuffer: Long, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetCapability(capabilitycode, capabilitybuffer.toString(), capabilitybuffersizeinbytes.toInt(), writtensizeinbytes.toString()) as Int) else 0

public actual fun WHvGetInterruptTargetVpSet(partition: WHV_PARTITION_HANDLE, destination: ULong, destinationmode: WHV_INTERRUPT_DESTINATION_MODE, targetvps: Long, vpcount: UInt, targetvpcount: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetInterruptTargetVpSet(partition.toString(), destination.toString(), destinationmode, targetvps.toString(), vpcount.toInt(), targetvpcount.toString()) as Int) else 0

public actual fun WHvGetPartitionCounters(partition: WHV_PARTITION_HANDLE, counterset: WHV_PARTITION_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetPartitionCounters(partition.toString(), counterset, buffer.toString(), buffersizeinbytes.toInt(), byteswritten.toString()) as Int) else 0

public actual fun WHvGetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetPartitionProperty(partition.toString(), propertycode, propertybuffer.toString(), propertybuffersizeinbytes.toInt(), writtensizeinbytes.toString()) as Int) else 0

public actual fun WHvGetVirtualProcessorCounters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, counterset: WHV_PROCESSOR_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCounters(partition.toString(), vpindex.toInt(), counterset, buffer.toString(), buffersizeinbytes.toInt(), byteswritten.toString()) as Int) else 0

public actual fun WHvGetVirtualProcessorCpuidOutput(partition: WHV_PARTITION_HANDLE, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCpuidOutput(partition.toString(), vpindex.toInt(), eax.toInt(), ecx.toInt(), cpuidoutput.toString()) as Int) else 0

public actual fun WHvGetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState(partition.toString(), vpindex.toInt(), state.toString(), statesize.toInt(), writtensize.toString()) as Int) else 0

public actual fun WHvGetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState2(partition.toString(), vpindex.toInt(), state.toString(), statesize.toInt(), writtensize.toString()) as Int) else 0

public actual fun WHvGetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorRegisters(partition.toString(), vpindex.toInt(), registernames.toString(), registercount.toInt(), registervalues.toString()) as Int) else 0

public actual fun WHvGetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorState(partition.toString(), vpindex.toInt(), statetype, buffer.toString(), buffersizeinbytes.toInt(), byteswritten.toString()) as Int) else 0

public actual fun WHvGetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorXsaveState(partition.toString(), vpindex.toInt(), buffer.toString(), buffersizeinbytes.toInt(), byteswritten.toString()) as Int) else 0

public actual fun WHvGetVpciDeviceInterruptTarget(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: Long, targetsizeinbytes: UInt, byteswritten: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceInterruptTarget(partition.toString(), logicaldeviceid.toString(), index.toInt(), multimessagenumber.toInt(), target.toString(), targetsizeinbytes.toInt(), byteswritten.toString()) as Int) else 0

public actual fun WHvGetVpciDeviceNotification(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, notification: Long, notificationsizeinbytes: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceNotification(partition.toString(), logicaldeviceid.toString(), notification.toString(), notificationsizeinbytes.toInt()) as Int) else 0

public actual fun WHvGetVpciDeviceProperty(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, propertycode: WHV_VPCI_DEVICE_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceProperty(partition.toString(), logicaldeviceid.toString(), propertycode, propertybuffer.toString(), propertybuffersizeinbytes.toInt(), writtensizeinbytes.toString()) as Int) else 0

public actual fun WHvMapGpaRange(partition: WHV_PARTITION_HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvMapGpaRange(partition.toString(), sourceaddress.toString(), guestaddress.toString(), sizeinbytes.toString(), flags) as Int) else 0

public actual fun WHvMapGpaRange2(partition: WHV_PARTITION_HANDLE, process: HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvMapGpaRange2(partition.toString(), process.toString(), sourceaddress.toString(), guestaddress.toString(), sizeinbytes.toString(), flags) as Int) else 0

public actual fun WHvMapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: Long, msiaddress: Long, msidata: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), index.toInt(), messagecount.toInt(), target.toString(), msiaddress.toString(), msidata.toString()) as Int) else 0

public actual fun WHvMapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, mappingcount: Long, mappings: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceMmioRanges(partition.toString(), logicaldeviceid.toString(), mappingcount.toString(), mappings.toString()) as Int) else 0

public actual fun WHvPostVirtualProcessorSynicMessage(partition: WHV_PARTITION_HANDLE, vpindex: UInt, sintindex: UInt, message: Long, messagesizeinbytes: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvPostVirtualProcessorSynicMessage(partition.toString(), vpindex.toInt(), sintindex.toInt(), message.toString(), messagesizeinbytes.toInt()) as Int) else 0

public actual fun WHvQueryGpaRangeDirtyBitmap(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: Long, bitmapsizeinbytes: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvQueryGpaRangeDirtyBitmap(partition.toString(), guestaddress.toString(), rangesizeinbytes.toString(), bitmap.toString(), bitmapsizeinbytes.toInt()) as Int) else 0

public actual fun WHvReadGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT =
    0

public actual fun WHvReadVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvReadVpciDeviceRegister(partition.toString(), logicaldeviceid.toString(), register.toString(), data.toString()) as Int) else 0

public actual fun WHvRegisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long, eventhandle: HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvRegisterPartitionDoorbellEvent(partition.toString(), matchdata.toString(), eventhandle.toString()) as Int) else 0

public actual fun WHvRequestInterrupt(partition: WHV_PARTITION_HANDLE, interrupt: Long, interruptcontrolsize: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvRequestInterrupt(partition.toString(), interrupt.toString(), interruptcontrolsize.toInt()) as Int) else 0

public actual fun WHvRequestVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvRequestVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), msiaddress.toString(), msidata.toInt()) as Int) else 0

public actual fun WHvResetPartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvResetPartition(partition.toString()) as Int) else 0

public actual fun WHvResumePartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvResumePartitionTime(partition.toString()) as Int) else 0

public actual fun WHvRetargetVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvRetargetVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), msiaddress.toString(), msidata.toInt(), target.toString()) as Int) else 0

public actual fun WHvRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, exitcontext: Long, exitcontextsizeinbytes: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvRunVirtualProcessor(partition.toString(), vpindex.toInt(), exitcontext.toString(), exitcontextsizeinbytes.toInt()) as Int) else 0

public actual fun WHvSetNotificationPortProperty(partition: WHV_PARTITION_HANDLE, porthandle: Long, propertycode: WHV_NOTIFICATION_PORT_PROPERTY_CODE, propertyvalue: ULong): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSetNotificationPortProperty(partition.toString(), porthandle.toString(), propertycode, propertyvalue.toString()) as Int) else 0

public actual fun WHvSetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSetPartitionProperty(partition.toString(), propertycode, propertybuffer.toString(), propertybuffersizeinbytes.toInt()) as Int) else 0

public actual fun WHvSetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState(partition.toString(), vpindex.toInt(), state.toString(), statesize.toInt()) as Int) else 0

public actual fun WHvSetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState2(partition.toString(), vpindex.toInt(), state.toString(), statesize.toInt()) as Int) else 0

public actual fun WHvSetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorRegisters(partition.toString(), vpindex.toInt(), registernames.toString(), registercount.toInt(), registervalues.toString()) as Int) else 0

public actual fun WHvSetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorState(partition.toString(), vpindex.toInt(), statetype, buffer.toString(), buffersizeinbytes.toInt()) as Int) else 0

public actual fun WHvSetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorXsaveState(partition.toString(), vpindex.toInt(), buffer.toString(), buffersizeinbytes.toInt()) as Int) else 0

public actual fun WHvSetVpciDevicePowerState(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, powerstate: DEVICE_POWER_STATE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSetVpciDevicePowerState(partition.toString(), logicaldeviceid.toString(), powerstate) as Int) else 0

public actual fun WHvSetupPartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSetupPartition(partition.toString()) as Int) else 0

public actual fun WHvSignalVirtualProcessorSynicEvent(partition: WHV_PARTITION_HANDLE, synicevent: WHV_SYNIC_EVENT_PARAMETERS, newlysignaled: Long): HRESULT =
    0

public actual fun WHvStartPartitionMigration(partition: WHV_PARTITION_HANDLE, migrationhandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvStartPartitionMigration(partition.toString(), migrationhandle.toString()) as Int) else 0

public actual fun WHvSuspendPartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvSuspendPartitionTime(partition.toString()) as Int) else 0

public actual fun WHvTranslateGva(partition: WHV_PARTITION_HANDLE, vpindex: UInt, gva: ULong, translateflags: WHV_TRANSLATE_GVA_FLAGS, translationresult: Long, gpa: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvTranslateGva(partition.toString(), vpindex.toInt(), gva.toString(), translateflags, translationresult.toString(), gpa.toString()) as Int) else 0

public actual fun WHvUnmapGpaRange(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, sizeinbytes: ULong): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvUnmapGpaRange(partition.toString(), guestaddress.toString(), sizeinbytes.toString()) as Int) else 0

public actual fun WHvUnmapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), index.toInt()) as Int) else 0

public actual fun WHvUnmapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceMmioRanges(partition.toString(), logicaldeviceid.toString()) as Int) else 0

public actual fun WHvUnregisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvUnregisterPartitionDoorbellEvent(partition.toString(), matchdata.toString()) as Int) else 0

public actual fun WHvUpdateTriggerParameters(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvUpdateTriggerParameters(partition.toString(), parameters.toString(), triggerhandle.toString()) as Int) else 0

public actual fun WHvWriteGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT =
    0

public actual fun WHvWriteVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_WHvWriteVpciDeviceRegister(partition.toString(), logicaldeviceid.toString(), register.toString(), data.toString()) as Int) else 0
