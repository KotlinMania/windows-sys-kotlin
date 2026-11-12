@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HcsSystem
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState

private val windowsWin32SystemHypervisorNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualaddress: ULong, fixbuffer: ConstPtr<CVoid>, fixbuffersize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualaddress.toString(), fixbuffer.rawAddress.toString(), fixbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog(vmrsfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun callStackUnwind(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, imageinfo: ConstPtr<ModuleInfo>, imageinfocount: UInt, framecount: UInt, callstack: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorCallStackUnwind(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), imageinfo.rawAddress.toString(), imageinfocount.toInt(), framecount.toInt(), callstack.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: MutPtr<UInt>, found: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), typename.rawAddress.toString(), fieldname.rawAddress.toString(), offset.rawAddress.toString(), found.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualtrustlevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forceArchitecture(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorForceArchitecture(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), architecture) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forceNestedHostMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, hostmode: Bool, oldmode: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorForceNestedHostMode(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), hostmode, oldmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forcePagingMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, pagingmode: PagingMode): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorForcePagingMode(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), pagingmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevel: MutPtr<UByte>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualtrustlevel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getArchitecture(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, architecture: MutPtr<VirtualProcessorArch>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetArchitecture(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), architecture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevels: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualtrustlevels.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr<CVoid>, virtualtrustlevels: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle.rawAddress.toString(), virtualtrustlevels.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestOsInfo(vmsavedstatedumphandle: MutPtr<CVoid>, virtualtrustlevel: UByte, guestosinfo: MutPtr<GuestOsInfo>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetGuestOsInfo(vmsavedstatedumphandle.rawAddress.toString(), virtualtrustlevel.toInt(), guestosinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: MutPtr<CVoid>, memorychunkpagesize: MutPtr<ULong>, memorychunks: MutPtr<GpaMemoryChunk>, memorychunkcount: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks(vmsavedstatedumphandle.rawAddress.toString(), memorychunkpagesize.rawAddress.toString(), memorychunks.rawAddress.toString(), memorychunkcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: MutPtr<CVoid>, guestrawsavedmemorysize: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize(vmsavedstatedumphandle.rawAddress.toString(), guestrawsavedmemorysize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr<CVoid>, memoryblockcachelimit: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit(vmsavedstatedumphandle.rawAddress.toString(), memoryblockcachelimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, enabled: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), enabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPagingMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, pagingmode: MutPtr<PagingMode>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetPagingMode(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), pagingmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegisterValue(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, registerid: UInt, registervalue: MutPtr<VirtualProcessorRegister>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetRegisterValue(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), registerid.toInt(), registervalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, typefieldinfomap: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), typename.rawAddress.toString(), typefieldinfomap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: MutPtr<CVoid>): Handle =
    if (windowsWin32SystemHypervisorNapiAddon != null) MutPtr((windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle(vmsavedstatedumphandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, size: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), typename.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVpCount(vmsavedstatedumphandle: MutPtr<CVoid>, vpcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGetVpCount(vmsavedstatedumphandle.rawAddress.toString(), vpcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: MutPtr<CVoid>, physicaladdress: ULong, rawsavedmemoryoffset: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle.rawAddress.toString(), physicaladdress.toString(), rawsavedmemoryoffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualaddress: ULong, physicaladdress: MutPtr<ULong>, unmappedregionsize: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), virtualaddress.toString(), physicaladdress.rawAddress.toString(), unmappedregionsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvCreateDeviceInstance(devicehosthandle: ConstPtr<CVoid>, devicetype: HdvDeviceType, deviceclassid: ConstPtr<Guid>, deviceinstanceid: ConstPtr<Guid>, deviceinterface: ConstPtr<CVoid>, devicecontext: ConstPtr<CVoid>, devicehandle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance(devicehosthandle.rawAddress.toString(), devicetype, deviceclassid.rawAddress.toString(), deviceinstanceid.rawAddress.toString(), deviceinterface.rawAddress.toString(), devicecontext.rawAddress.toString(), devicehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvCreateGuestMemoryAperture(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture(requestor.rawAddress.toString(), guestphysicaladdress.toString(), bytecount.toInt(), writeprotected, mappedaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvCreateSectionBackedMmioRange(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange(requestor.rawAddress.toString(), barindex, offsetinpages.toString(), lengthinpages.toString(), mappingflags, sectionhandle.rawAddress.toString(), sectionoffsetinpages.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvDeliverGuestInterrupt(requestor: ConstPtr<CVoid>, msiaddress: ULong, msidata: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt(requestor.rawAddress.toString(), msiaddress.toString(), msidata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvDestroyGuestMemoryAperture(requestor: ConstPtr<CVoid>, mappedaddress: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture(requestor.rawAddress.toString(), mappedaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvDestroySectionBackedMmioRange(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange(requestor.rawAddress.toString(), barindex, offsetinpages.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost(computesystem.rawAddress.toString(), devicehosthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx(computesystem.rawAddress.toString(), flags, devicehosthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvReadGuestMemory(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, buffer: MutPtr<UByte>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory(requestor.rawAddress.toString(), guestphysicaladdress.toString(), bytecount.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvRegisterDoorbell(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell(requestor.rawAddress.toString(), barindex, baroffset.toString(), triggervalue.toString(), flags.toString(), doorbellevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvTeardownDeviceHost(devicehosthandle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost(devicehosthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvUnregisterDoorbell(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell(requestor.rawAddress.toString(), barindex, baroffset.toString(), triggervalue.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hdvWriteGuestMemory(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, buffer: ConstPtr<UByte>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory(requestor.rawAddress.toString(), guestphysicaladdress.toString(), bytecount.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inKernelSpace(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, inkernelspace: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorInKernelSpace(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), inkernelspace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, activevirtualtrustlevelenabled: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), activevirtualtrustlevelenabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: MutPtr<CVoid>, enabled: MutPtr<Bool>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled(vmsavedstatedumphandle.rawAddress.toString(), enabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorLoadSavedStateFile(vmrsfile.rawAddress.toString(), vmsavedstatedumphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles(binfile.rawAddress.toString(), vsvfile.rawAddress.toString(), vmsavedstatedumphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: MutPtr<CVoid>, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols(vmsavedstatedumphandle.rawAddress.toString(), imagename.rawAddress.toString(), modulename.rawAddress.toString(), baseaddress.toString(), sizeofbase.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: MutPtr<CVoid>, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle.rawAddress.toString(), imagename.rawAddress.toString(), imagetimestamp.toInt(), modulename.rawAddress.toString(), baseaddress.toString(), sizeofbase.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr<CVoid>, usersymbols: Pcwstr, force: Bool): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider(vmsavedstatedumphandle.rawAddress.toString(), usersymbols.rawAddress.toString(), force) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: MutPtr<Pwstr>, vsvpath: MutPtr<Pwstr>, vmrspath: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles(vmname.rawAddress.toString(), snapshotname.rawAddress.toString(), binpath.rawAddress.toString(), vsvpath.rawAddress.toString(), vmrspath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: MutPtr<CVoid>, physicaladdress: ULong, buffer: MutPtr<CVoid>, buffersize: UInt, bytesread: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress(vmsavedstatedumphandle.rawAddress.toString(), physicaladdress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), bytesread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: MutPtr<CVoid>, rawsavedmemoryoffset: ULong, buffer: MutPtr<CVoid>, buffersize: UInt, bytesread: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory(vmsavedstatedumphandle.rawAddress.toString(), rawsavedmemoryoffset.toString(), buffer.rawAddress.toString(), buffersize.toInt(), bytesread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, globalname: Pcstr, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), globalname.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles(vmsavedstatedumphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider(vmsavedstatedumphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, globalname: Pcstr, virtualaddress: MutPtr<ULong>, size: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), globalname.rawAddress.toString(), virtualaddress.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: MutPtr<CVoid>, foundimagecallback: FoundImageCallback, standaloneaddress: ConstPtr<ULong>, standaloneaddresscount: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages(vmsavedstatedumphandle.rawAddress.toString(), vpid.toInt(), startaddress.toString(), endaddress.toString(), callbackcontext.rawAddress.toString(), 0L.toString(), standaloneaddress.rawAddress.toString(), standaloneaddresscount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr<CVoid>, memoryblockcachelimit: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit(vmsavedstatedumphandle.rawAddress.toString(), memoryblockcachelimit.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: MutPtr<CVoid>, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: MutPtr<WhvPartitionHandle>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration(migrationhandle.rawAddress.toString(), partition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: ConstPtr<WhvMemoryRangeEntry>, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: ConstPtr<CVoid>, advicebuffersizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange(partition.toString(), gparanges.rawAddress.toString(), gparangescount.toInt(), advice, advicebuffer.rawAddress.toString(), advicebuffersizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvAllocateVpciResource(providerid: ConstPtr<Guid>, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: ConstPtr<CVoid>, resourcedescriptorsizeinbytes: UInt, vpciresource: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource(providerid.rawAddress.toString(), flags, resourcedescriptor.rawAddress.toString(), resourcedescriptorsizeinbytes.toInt(), vpciresource.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(partition.toString(), vpindex.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: ConstPtr<WhvNotificationPortParameters>, eventhandle: Handle, porthandle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort(partition.toString(), parameters.rawAddress.toString(), eventhandle.rawAddress.toString(), porthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreatePartition(partition: MutPtr<WhvPartitionHandle>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvCreatePartition(partition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: ConstPtr<WhvTriggerParameters>, triggerhandle: MutPtr<MutPtr<CVoid>>, eventhandle: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvCreateTrigger(partition.toString(), parameters.rawAddress.toString(), triggerhandle.rawAddress.toString(), eventhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(partition.toString(), vpindex.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: ConstPtr<WhvVirtualProcessorProperty>, propertycount: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2(partition.toString(), vpindex.toInt(), properties.rawAddress.toString(), propertycount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice(partition.toString(), logicaldeviceid.toString(), vpciresource.rawAddress.toString(), flags, notificationeventhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort(partition.toString(), porthandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvDeletePartition(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger(partition.toString(), triggerhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(partition.toString(), vpindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(partition.toString(), logicaldeviceid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorCreateEmulator(callbacks: ConstPtr<WhvEmulatorCallbacks>, emulator: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator(callbacks.rawAddress.toString(), emulator.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorDestroyEmulator(emulator: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator(emulator.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorTryIoEmulation(emulator: ConstPtr<CVoid>, context: ConstPtr<CVoid>, vpcontext: ConstPtr<WhvVpExitContext>, ioinstructioncontext: ConstPtr<WhvX64IoPortAccessContext>, emulatorreturnstatus: MutPtr<WhvEmulatorStatus>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation(emulator.rawAddress.toString(), context.rawAddress.toString(), vpcontext.rawAddress.toString(), ioinstructioncontext.rawAddress.toString(), emulatorreturnstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvEmulatorTryMmioEmulation(emulator: ConstPtr<CVoid>, context: ConstPtr<CVoid>, vpcontext: ConstPtr<WhvVpExitContext>, mmioinstructioncontext: ConstPtr<WhvMemoryAccessContext>, emulatorreturnstatus: MutPtr<WhvEmulatorStatus>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation(emulator.rawAddress.toString(), context.rawAddress.toString(), vpcontext.rawAddress.toString(), mmioinstructioncontext.rawAddress.toString(), emulatorreturnstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: MutPtr<CVoid>, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetCapability(capabilitycode, capabilitybuffer.rawAddress.toString(), capabilitybuffersizeinbytes.toInt(), writtensizeinbytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: MutPtr<UInt>, vpcount: UInt, targetvpcount: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet(partition.toString(), destination.toString(), destinationmode, targetvps.rawAddress.toString(), vpcount.toInt(), targetvpcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters(partition.toString(), counterset, buffer.rawAddress.toString(), buffersizeinbytes.toInt(), byteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: MutPtr<CVoid>, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty(partition.toString(), propertycode, propertybuffer.rawAddress.toString(), propertybuffersizeinbytes.toInt(), writtensizeinbytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters(partition.toString(), vpindex.toInt(), counterset, buffer.rawAddress.toString(), buffersizeinbytes.toInt(), byteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: MutPtr<WhvCpuidOutput>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput(partition.toString(), vpindex.toInt(), eax.toInt(), ecx.toInt(), cpuidoutput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr<CVoid>, statesize: UInt, writtensize: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState(partition.toString(), vpindex.toInt(), state.rawAddress.toString(), statesize.toInt(), writtensize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr<CVoid>, statesize: UInt, writtensize: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2(partition.toString(), vpindex.toInt(), state.rawAddress.toString(), statesize.toInt(), writtensize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: MutPtr<WhvRegisterValue>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters(partition.toString(), vpindex.toInt(), registernames.rawAddress.toString(), registercount.toInt(), registervalues.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState(partition.toString(), vpindex.toInt(), statetype, buffer.rawAddress.toString(), buffersizeinbytes.toInt(), byteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState(partition.toString(), vpindex.toInt(), buffer.rawAddress.toString(), buffersizeinbytes.toInt(), byteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: MutPtr<WhvVpciInterruptTarget>, targetsizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget(partition.toString(), logicaldeviceid.toString(), index.toInt(), multimessagenumber.toInt(), target.rawAddress.toString(), targetsizeinbytes.toInt(), byteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: MutPtr<WhvVpciDeviceNotification>, notificationsizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification(partition.toString(), logicaldeviceid.toString(), notification.rawAddress.toString(), notificationsizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: MutPtr<CVoid>, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty(partition.toString(), logicaldeviceid.toString(), propertycode, propertybuffer.rawAddress.toString(), propertybuffersizeinbytes.toInt(), writtensizeinbytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: ConstPtr<CVoid>, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvMapGpaRange(partition.toString(), sourceaddress.rawAddress.toString(), guestaddress.toString(), sizeinbytes.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: ConstPtr<CVoid>, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2(partition.toString(), process.rawAddress.toString(), sourceaddress.rawAddress.toString(), guestaddress.toString(), sizeinbytes.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: ConstPtr<WhvVpciInterruptTarget>, msiaddress: MutPtr<ULong>, msidata: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), index.toInt(), messagecount.toInt(), target.rawAddress.toString(), msiaddress.rawAddress.toString(), msidata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: MutPtr<UInt>, mappings: MutPtr<MutPtr<WhvVpciMmioMapping>>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges(partition.toString(), logicaldeviceid.toString(), mappingcount.rawAddress.toString(), mappings.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: ConstPtr<CVoid>, messagesizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage(partition.toString(), vpindex.toInt(), sintindex.toInt(), message.rawAddress.toString(), messagesizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: MutPtr<ULong>, bitmapsizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap(partition.toString(), guestaddress.toString(), rangesizeinbytes.toString(), bitmap.rawAddress.toString(), bitmapsizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: MutPtr<CVoid>, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr<WhvVpciDeviceRegister>, data: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister(partition.toString(), logicaldeviceid.toString(), register.rawAddress.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr<WhvDoorbellMatchData>, eventhandle: Handle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent(partition.toString(), matchdata.rawAddress.toString(), eventhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: ConstPtr<WhvInterruptControl>, interruptcontrolsize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt(partition.toString(), interrupt.rawAddress.toString(), interruptcontrolsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), msiaddress.toString(), msidata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvResetPartition(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvResetPartition(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: ConstPtr<WhvVpciInterruptTarget>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), msiaddress.toString(), msidata.toInt(), target.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: MutPtr<CVoid>, exitcontextsizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor(partition.toString(), vpindex.toInt(), exitcontext.rawAddress.toString(), exitcontextsizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: ConstPtr<CVoid>, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty(partition.toString(), porthandle.rawAddress.toString(), propertycode, propertyvalue.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: ConstPtr<CVoid>, propertybuffersizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty(partition.toString(), propertycode, propertybuffer.rawAddress.toString(), propertybuffersizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr<CVoid>, statesize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState(partition.toString(), vpindex.toInt(), state.rawAddress.toString(), statesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr<CVoid>, statesize: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2(partition.toString(), vpindex.toInt(), state.rawAddress.toString(), statesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: ConstPtr<WhvRegisterValue>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters(partition.toString(), vpindex.toInt(), registernames.rawAddress.toString(), registercount.toInt(), registervalues.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: ConstPtr<CVoid>, buffersizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState(partition.toString(), vpindex.toInt(), statetype, buffer.rawAddress.toString(), buffersizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: ConstPtr<CVoid>, buffersizeinbytes: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState(partition.toString(), vpindex.toInt(), buffer.rawAddress.toString(), buffersizeinbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(partition.toString(), logicaldeviceid.toString(), powerstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSetupPartition(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration(partition.toString(), migrationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(partition.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: MutPtr<WhvTranslateGvaResult>, gpa: MutPtr<ULong>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvTranslateGva(partition.toString(), vpindex.toInt(), gva.toString(), translateflags, translationresult.rawAddress.toString(), gpa.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(partition.toString(), guestaddress.toString(), sizeinbytes.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(partition.toString(), logicaldeviceid.toString(), index.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(partition.toString(), logicaldeviceid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr<WhvDoorbellMatchData>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent(partition.toString(), matchdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: ConstPtr<WhvTriggerParameters>, triggerhandle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters(partition.toString(), parameters.rawAddress.toString(), triggerhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: ConstPtr<CVoid>, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr<WhvVpciDeviceRegister>, data: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHypervisorNapiAddon != null) (windowsWin32SystemHypervisorNapiAddon.windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister(partition.toString(), logicaldeviceid.toString(), register.rawAddress.toString(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
