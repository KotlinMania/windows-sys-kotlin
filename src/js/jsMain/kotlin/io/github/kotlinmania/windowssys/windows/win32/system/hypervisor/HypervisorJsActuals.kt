@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HcsSystem
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState

private val _windowsWin32SystemHypervisorNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, fixbuffer: COpaquePointer?, fixbuffersize: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), virtualaddress.toString(), (fixbuffer?.value ?: 0L).toString(), fixbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog((vmrsfile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callStackUnwind(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, imageinfo: COpaquePointer?, imageinfocount: UInt, framecount: UInt, callstack: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_callStackUnwind((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (imageinfo?.value ?: 0L).toString(), imageinfocount.toInt(), framecount.toInt(), (callstack?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: COpaquePointer?, found: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (typename?.value ?: 0L).toString(), (fieldname?.value ?: 0L).toString(), (offset?.value ?: 0L).toString(), (found?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), virtualtrustlevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forceArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_forceArchitecture((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), architecture) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forceNestedHostMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, hostmode: Bool, oldmode: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_forceNestedHostMode((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), hostmode, (oldmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forcePagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: PagingMode): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_forcePagingMode((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), pagingmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (virtualtrustlevel?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getArchitecture((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (architecture?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevels: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (virtualtrustlevels?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevels: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels((vmsavedstatedumphandle?.value ?: 0L).toString(), (virtualtrustlevels?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestOsInfo(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevel: UByte, guestosinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getGuestOsInfo((vmsavedstatedumphandle?.value ?: 0L).toString(), virtualtrustlevel.toInt(), (guestosinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: COpaquePointer?, memorychunkpagesize: COpaquePointer?, memorychunks: COpaquePointer?, memorychunkcount: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks((vmsavedstatedumphandle?.value ?: 0L).toString(), (memorychunkpagesize?.value ?: 0L).toString(), (memorychunks?.value ?: 0L).toString(), (memorychunkcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: COpaquePointer?, guestrawsavedmemorysize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize((vmsavedstatedumphandle?.value ?: 0L).toString(), (guestrawsavedmemorysize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit((vmsavedstatedumphandle?.value ?: 0L).toString(), (memoryblockcachelimit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, enabled: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (enabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getPagingMode((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (pagingmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegisterValue(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, registerid: UInt, registervalue: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getRegisterValue((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), registerid.toInt(), (registervalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, typefieldinfomap: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (typename?.value ?: 0L).toString(), (typefieldinfomap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: COpaquePointer?): Handle =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle((vmsavedstatedumphandle?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, size: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (typename?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVpCount(vmsavedstatedumphandle: COpaquePointer?, vpcount: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_getVpCount((vmsavedstatedumphandle?.value ?: 0L).toString(), (vpcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, rawsavedmemoryoffset: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset((vmsavedstatedumphandle?.value ?: 0L).toString(), physicaladdress.toString(), (rawsavedmemoryoffset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, physicaladdress: COpaquePointer?, unmappedregionsize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), virtualaddress.toString(), (physicaladdress?.value ?: 0L).toString(), (unmappedregionsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvCreateDeviceInstance(devicehosthandle: COpaquePointer?, devicetype: HdvDeviceType, deviceclassid: COpaquePointer?, deviceinstanceid: COpaquePointer?, deviceinterface: COpaquePointer?, devicecontext: COpaquePointer?, devicehandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance((devicehosthandle?.value ?: 0L).toString(), devicetype, (deviceclassid?.value ?: 0L).toString(), (deviceinstanceid?.value ?: 0L).toString(), (deviceinterface?.value ?: 0L).toString(), (devicecontext?.value ?: 0L).toString(), (devicehandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvCreateGuestMemoryAperture(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture((requestor?.value ?: 0L).toString(), guestphysicaladdress.toString(), bytecount.toInt(), writeprotected, (mappedaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvCreateSectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange((requestor?.value ?: 0L).toString(), barindex, offsetinpages.toString(), lengthinpages.toString(), mappingflags, (sectionhandle?.value ?: 0L).toString(), sectionoffsetinpages.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvDeliverGuestInterrupt(requestor: COpaquePointer?, msiaddress: ULong, msidata: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt((requestor?.value ?: 0L).toString(), msiaddress.toString(), msidata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvDestroyGuestMemoryAperture(requestor: COpaquePointer?, mappedaddress: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture((requestor?.value ?: 0L).toString(), (mappedaddress?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvDestroySectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange((requestor?.value ?: 0L).toString(), barindex, offsetinpages.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost((computesystem?.value ?: 0L).toString(), (devicehosthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx((computesystem?.value ?: 0L).toString(), flags, (devicehosthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvReadGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory((requestor?.value ?: 0L).toString(), guestphysicaladdress.toString(), bytecount.toInt(), (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvRegisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell((requestor?.value ?: 0L).toString(), barindex, baroffset.toString(), triggervalue.toString(), flags.toString(), (doorbellevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvTeardownDeviceHost(devicehosthandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost((devicehosthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvUnregisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell((requestor?.value ?: 0L).toString(), barindex, baroffset.toString(), triggervalue.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvWriteGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory((requestor?.value ?: 0L).toString(), guestphysicaladdress.toString(), bytecount.toInt(), (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inKernelSpace(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, inkernelspace: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_inKernelSpace((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (inkernelspace?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, activevirtualtrustlevelenabled: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (activevirtualtrustlevelenabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: COpaquePointer?, enabled: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled((vmsavedstatedumphandle?.value ?: 0L).toString(), (enabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_loadSavedStateFile((vmrsfile?.value ?: 0L).toString(), (vmsavedstatedumphandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_loadSavedStateFiles((binfile?.value ?: 0L).toString(), (vsvfile?.value ?: 0L).toString(), (vmsavedstatedumphandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols((vmsavedstatedumphandle?.value ?: 0L).toString(), (imagename?.value ?: 0L).toString(), (modulename?.value ?: 0L).toString(), baseaddress.toString(), sizeofbase.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx((vmsavedstatedumphandle?.value ?: 0L).toString(), (imagename?.value ?: 0L).toString(), imagetimestamp.toInt(), (modulename?.value ?: 0L).toString(), baseaddress.toString(), sizeofbase.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?, usersymbols: Pcwstr, force: Bool): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider((vmsavedstatedumphandle?.value ?: 0L).toString(), (usersymbols?.value ?: 0L).toString(), force) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: COpaquePointer?, vsvpath: COpaquePointer?, vmrspath: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_locateSavedStateFiles((vmname?.value ?: 0L).toString(), (snapshotname?.value ?: 0L).toString(), (binpath?.value ?: 0L).toString(), (vsvpath?.value ?: 0L).toString(), (vmrspath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress((vmsavedstatedumphandle?.value ?: 0L).toString(), physicaladdress.toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: COpaquePointer?, rawsavedmemoryoffset: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory((vmsavedstatedumphandle?.value ?: 0L).toString(), rawsavedmemoryoffset.toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bytesread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (globalname?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles((vmsavedstatedumphandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider((vmsavedstatedumphandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, virtualaddress: COpaquePointer?, size: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), (globalname?.value ?: 0L).toString(), (virtualaddress?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: COpaquePointer?, foundimagecallback: FoundImageCallback, standaloneaddress: COpaquePointer?, standaloneaddresscount: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages((vmsavedstatedumphandle?.value ?: 0L).toString(), vpid.toInt(), startaddress.toString(), endaddress.toString(), (callbackcontext?.value ?: 0L).toString(), 0L.toString(), (standaloneaddress?.value ?: 0L).toString(), standaloneaddresscount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: ULong): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit((vmsavedstatedumphandle?.value ?: 0L).toString(), memoryblockcachelimit.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: COpaquePointer?, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback((vmsavedstatedumphandle?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration((migrationhandle?.value ?: 0L).toString(), (partition?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: COpaquePointer?, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: COpaquePointer?, advicebuffersizeinbytes: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange(partition.toString(), (gparanges?.value ?: 0L).toString(), gparangescount.toInt(), advice, (advicebuffer?.value ?: 0L).toString(), advicebuffersizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvAllocateVpciResource(providerid: COpaquePointer?, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: COpaquePointer?, resourcedescriptorsizeinbytes: UInt, vpciresource: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource((providerid?.value ?: 0L).toString(), flags, (resourcedescriptor?.value ?: 0L).toString(), resourcedescriptorsizeinbytes.toInt(), (vpciresource?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor(partition.toString(), vpindex.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: COpaquePointer?, eventhandle: Handle, porthandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort(partition.toString(), (parameters?.value ?: 0L).toString(), (eventhandle?.value ?: 0L).toString(), (porthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreatePartition(partition: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvCreatePartition((partition?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?, eventhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvCreateTrigger(partition.toString(), (parameters?.value ?: 0L).toString(), (triggerhandle?.value ?: 0L).toString(), (eventhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor(partition.toString(), vpindex.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: COpaquePointer?, propertycount: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2(partition.toString(), vpindex.toInt(), (properties?.value ?: 0L).toString(), propertycount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice(partition.toString(), logicaldeviceid.toString(), (vpciresource?.value ?: 0L).toString(), flags, (notificationeventhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort(partition.toString(), (porthandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvDeletePartition(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger(partition.toString(), (triggerhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor(partition.toString(), vpindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice(partition.toString(), logicaldeviceid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorCreateEmulator(callbacks: COpaquePointer?, emulator: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator((callbacks?.value ?: 0L).toString(), (emulator?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorDestroyEmulator(emulator: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator((emulator?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorTryIoEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, ioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation((emulator?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (vpcontext?.value ?: 0L).toString(), (ioinstructioncontext?.value ?: 0L).toString(), (emulatorreturnstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorTryMmioEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, mmioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation((emulator?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (vpcontext?.value ?: 0L).toString(), (mmioinstructioncontext?.value ?: 0L).toString(), (emulatorreturnstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: COpaquePointer?, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetCapability(capabilitycode, (capabilitybuffer?.value ?: 0L).toString(), capabilitybuffersizeinbytes.toInt(), (writtensizeinbytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: COpaquePointer?, vpcount: UInt, targetvpcount: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet(partition.toString(), destination.toString(), destinationmode, (targetvps?.value ?: 0L).toString(), vpcount.toInt(), (targetvpcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters(partition.toString(), counterset, (buffer?.value ?: 0L).toString(), buffersizeinbytes.toInt(), (byteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty(partition.toString(), propertycode, (propertybuffer?.value ?: 0L).toString(), propertybuffersizeinbytes.toInt(), (writtensizeinbytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters(partition.toString(), vpindex.toInt(), counterset, (buffer?.value ?: 0L).toString(), buffersizeinbytes.toInt(), (byteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput(partition.toString(), vpindex.toInt(), eax.toInt(), ecx.toInt(), (cpuidoutput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState(partition.toString(), vpindex.toInt(), (state?.value ?: 0L).toString(), statesize.toInt(), (writtensize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2(partition.toString(), vpindex.toInt(), (state?.value ?: 0L).toString(), statesize.toInt(), (writtensize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters(partition.toString(), vpindex.toInt(), (registernames?.value ?: 0L).toString(), registercount.toInt(), (registervalues?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState(partition.toString(), vpindex.toInt(), statetype, (buffer?.value ?: 0L).toString(), buffersizeinbytes.toInt(), (byteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState(partition.toString(), vpindex.toInt(), (buffer?.value ?: 0L).toString(), buffersizeinbytes.toInt(), (byteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: COpaquePointer?, targetsizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget(partition.toString(), logicaldeviceid.toString(), index.toInt(), multimessagenumber.toInt(), (target?.value ?: 0L).toString(), targetsizeinbytes.toInt(), (byteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: COpaquePointer?, notificationsizeinbytes: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification(partition.toString(), logicaldeviceid.toString(), (notification?.value ?: 0L).toString(), notificationsizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty(partition.toString(), logicaldeviceid.toString(), propertycode, (propertybuffer?.value ?: 0L).toString(), propertybuffersizeinbytes.toInt(), (writtensizeinbytes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvMapGpaRange(partition.toString(), (sourceaddress?.value ?: 0L).toString(), guestaddress.toString(), sizeinbytes.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2(partition.toString(), (process?.value ?: 0L).toString(), (sourceaddress?.value ?: 0L).toString(), guestaddress.toString(), sizeinbytes.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: COpaquePointer?, msiaddress: COpaquePointer?, msidata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), index.toInt(), messagecount.toInt(), (target?.value ?: 0L).toString(), (msiaddress?.value ?: 0L).toString(), (msidata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: COpaquePointer?, mappings: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges(partition.toString(), logicaldeviceid.toString(), (mappingcount?.value ?: 0L).toString(), (mappings?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: COpaquePointer?, messagesizeinbytes: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage(partition.toString(), vpindex.toInt(), sintindex.toInt(), (message?.value ?: 0L).toString(), messagesizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: COpaquePointer?, bitmapsizeinbytes: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap(partition.toString(), guestaddress.toString(), rangesizeinbytes.toString(), (bitmap?.value ?: 0L).toString(), bitmapsizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister(partition.toString(), logicaldeviceid.toString(), (register?.value ?: 0L).toString(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?, eventhandle: Handle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent(partition.toString(), (matchdata?.value ?: 0L).toString(), (eventhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: COpaquePointer?, interruptcontrolsize: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt(partition.toString(), (interrupt?.value ?: 0L).toString(), interruptcontrolsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), msiaddress.toString(), msidata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvResetPartition(partition: WhvPartitionHandle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvResetPartition(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), msiaddress.toString(), msidata.toInt(), (target?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: COpaquePointer?, exitcontextsizeinbytes: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor(partition.toString(), vpindex.toInt(), (exitcontext?.value ?: 0L).toString(), exitcontextsizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: COpaquePointer?, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty(partition.toString(), (porthandle?.value ?: 0L).toString(), propertycode, propertyvalue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty(partition.toString(), propertycode, (propertybuffer?.value ?: 0L).toString(), propertybuffersizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState(partition.toString(), vpindex.toInt(), (state?.value ?: 0L).toString(), statesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2(partition.toString(), vpindex.toInt(), (state?.value ?: 0L).toString(), statesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters(partition.toString(), vpindex.toInt(), (registernames?.value ?: 0L).toString(), registercount.toInt(), (registervalues?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState(partition.toString(), vpindex.toInt(), statetype, (buffer?.value ?: 0L).toString(), buffersizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState(partition.toString(), vpindex.toInt(), (buffer?.value ?: 0L).toString(), buffersizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState(partition.toString(), logicaldeviceid.toString(), powerstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSetupPartition(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration(partition.toString(), (migrationhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: COpaquePointer?, gpa: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvTranslateGva(partition.toString(), vpindex.toInt(), gva.toString(), translateflags, (translationresult?.value ?: 0L).toString(), (gpa?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange(partition.toString(), guestaddress.toString(), sizeinbytes.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), index.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges(partition.toString(), logicaldeviceid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent(partition.toString(), (matchdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters(partition.toString(), (parameters?.value ?: 0L).toString(), (triggerhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHypervisorNapiAddon != null) (_windowsWin32SystemHypervisorNapiAddon.windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister(partition.toString(), logicaldeviceid.toString(), (register?.value ?: 0L).toString(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
