@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HcsSystem
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualaddress: ULong, fixbuffer: ConstPtr, fixbuffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix")

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog")

public actual fun callStackUnwind(vmsavedstatedumphandle: MutPtr, vpid: UInt, imageinfo: ConstPtr, imageinfocount: UInt, framecount: UInt, callstack: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorCallStackUnwind")

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: MutPtr, found: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType")

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel")

public actual fun forceArchitecture(vmsavedstatedumphandle: MutPtr, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorForceArchitecture")

public actual fun forceNestedHostMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, hostmode: Bool, oldmode: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorForceNestedHostMode")

public actual fun forcePagingMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, pagingmode: PagingMode): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorForcePagingMode")

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevel: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel")

public actual fun getArchitecture(vmsavedstatedumphandle: MutPtr, vpid: UInt, architecture: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetArchitecture")

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevels: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels")

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr, virtualtrustlevels: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels")

public actual fun getGuestOsInfo(vmsavedstatedumphandle: MutPtr, virtualtrustlevel: UByte, guestosinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetGuestOsInfo")

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: MutPtr, memorychunkpagesize: MutPtr, memorychunks: MutPtr, memorychunkcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks")

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: MutPtr, guestrawsavedmemorysize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize")

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr, memoryblockcachelimit: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit")

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, enabled: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode")

public actual fun getPagingMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, pagingmode: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetPagingMode")

public actual fun getRegisterValue(vmsavedstatedumphandle: MutPtr, vpid: UInt, registerid: UInt, registervalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetRegisterValue")

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, typefieldinfomap: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo")

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle")

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, size: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize")

public actual fun getVpCount(vmsavedstatedumphandle: MutPtr, vpcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetVpCount")

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: MutPtr, physicaladdress: ULong, rawsavedmemoryoffset: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset")

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualaddress: ULong, physicaladdress: MutPtr, unmappedregionsize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress")

public actual fun hdvCreateDeviceInstance(devicehosthandle: ConstPtr, devicetype: HdvDeviceType, deviceclassid: ConstPtr, deviceinstanceid: ConstPtr, deviceinterface: ConstPtr, devicecontext: ConstPtr, devicehandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance")

public actual fun hdvCreateGuestMemoryAperture(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture")

public actual fun hdvCreateSectionBackedMmioRange(requestor: ConstPtr, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange")

public actual fun hdvDeliverGuestInterrupt(requestor: ConstPtr, msiaddress: ULong, msidata: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt")

public actual fun hdvDestroyGuestMemoryAperture(requestor: ConstPtr, mappedaddress: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture")

public actual fun hdvDestroySectionBackedMmioRange(requestor: ConstPtr, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange")

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost")

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx")

public actual fun hdvReadGuestMemory(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, buffer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory")

public actual fun hdvRegisterDoorbell(requestor: ConstPtr, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell")

public actual fun hdvTeardownDeviceHost(devicehosthandle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost")

public actual fun hdvUnregisterDoorbell(requestor: ConstPtr, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell")

public actual fun hdvWriteGuestMemory(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, buffer: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory")

public actual fun inKernelSpace(vmsavedstatedumphandle: MutPtr, vpid: UInt, inkernelspace: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorInKernelSpace")

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: MutPtr, vpid: UInt, activevirtualtrustlevelenabled: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled")

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: MutPtr, enabled: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled")

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateFile")

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles")

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: MutPtr, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols")

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: MutPtr, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx")

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr, usersymbols: Pcwstr, force: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider")

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: MutPtr, vsvpath: MutPtr, vmrspath: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles")

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: MutPtr, physicaladdress: ULong, buffer: MutPtr, buffersize: UInt, bytesread: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress")

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: MutPtr, rawsavedmemoryoffset: ULong, buffer: MutPtr, buffersize: UInt, bytesread: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory")

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: MutPtr, vpid: UInt, globalname: Pcstr, buffer: MutPtr, buffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable")

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles")

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider")

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: MutPtr, vpid: UInt, globalname: Pcstr, virtualaddress: MutPtr, size: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress")

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: MutPtr, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: MutPtr, foundimagecallback: FoundImageCallback, standaloneaddress: ConstPtr, standaloneaddresscount: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages")

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr, memoryblockcachelimit: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit")

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: MutPtr, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback")

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration")

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: ConstPtr, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: ConstPtr, advicebuffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange")

public actual fun wHvAllocateVpciResource(providerid: ConstPtr, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: ConstPtr, resourcedescriptorsizeinbytes: UInt, vpciresource: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(partition: Long): Int

public actual fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(partition)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(partition: Long, vpindex: Int, flags: Int): Int

public actual fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(partition, vpindex.toInt(), flags.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(partition: Long): Int

public actual fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(partition)

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: ConstPtr, eventhandle: Handle, porthandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort")

public actual fun wHvCreatePartition(partition: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreatePartition")

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: ConstPtr, triggerhandle: MutPtr, eventhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreateTrigger")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(partition: Long, vpindex: Int, flags: Int): Int

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(partition, vpindex.toInt(), flags.toInt())

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: ConstPtr, propertycount: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2")

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice")

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvDeletePartition")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvDeletePartition(partition: Long): Int

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvDeletePartition(partition)

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(partition: Long, vpindex: Int): Int

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(partition, vpindex.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(partition: Long, logicaldeviceid: Long): Int

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(partition, logicaldeviceid.toLong())

public actual fun wHvEmulatorCreateEmulator(callbacks: ConstPtr, emulator: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator")

public actual fun wHvEmulatorDestroyEmulator(emulator: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator")

public actual fun wHvEmulatorTryIoEmulation(emulator: ConstPtr, context: ConstPtr, vpcontext: ConstPtr, ioinstructioncontext: ConstPtr, emulatorreturnstatus: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation")

public actual fun wHvEmulatorTryMmioEmulation(emulator: ConstPtr, context: ConstPtr, vpcontext: ConstPtr, mmioinstructioncontext: ConstPtr, emulatorreturnstatus: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation")

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: MutPtr, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetCapability")

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: MutPtr, vpcount: UInt, targetvpcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet")

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters")

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: MutPtr, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty")

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters")

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput")

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr, statesize: UInt, writtensize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState")

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr, statesize: UInt, writtensize: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2")

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr, registercount: UInt, registervalues: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters")

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState")

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState")

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: MutPtr, targetsizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget")

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: MutPtr, notificationsizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification")

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: MutPtr, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty")

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: ConstPtr, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvMapGpaRange")

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: ConstPtr, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2")

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: ConstPtr, msiaddress: MutPtr, msidata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt")

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: MutPtr, mappings: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges")

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: ConstPtr, messagesizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage")

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: MutPtr, bitmapsizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap")

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: MutPtr, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvReadGpaRange")

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr, data: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister")

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr, eventhandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent")

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: ConstPtr, interruptcontrolsize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, msiaddress: Long, msidata: Int): Int

public actual fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), msiaddress.toLong(), msidata.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvResetPartition")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvResetPartition(partition: Long): Int

public actual fun wHvResetPartition(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvResetPartition(partition)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(partition: Long): Int

public actual fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(partition)

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt")

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: MutPtr, exitcontextsizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor")

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: ConstPtr, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty")

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: ConstPtr, propertybuffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty")

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr, statesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState")

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr, statesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2")

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr, registercount: UInt, registervalues: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters")

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: ConstPtr, buffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState")

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: ConstPtr, buffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(partition: Long, logicaldeviceid: Long, powerstate: Int): Int

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(partition, logicaldeviceid.toLong(), powerstate)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvSetupPartition")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvSetupPartition(partition: Long): Int

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvSetupPartition(partition)

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSignalVirtualProcessorSynicEvent")

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(partition: Long): Int

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(partition)

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: MutPtr, gpa: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvTranslateGva")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(partition: Long, guestaddress: Long, sizeinbytes: Long): Int

public actual fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(partition, guestaddress.toLong(), sizeinbytes.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, index: Int): Int

public actual fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), index.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(partition: Long, logicaldeviceid: Long): Int

public actual fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(partition, logicaldeviceid.toLong())

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent")

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: ConstPtr, triggerhandle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters")

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: ConstPtr, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvWriteGpaRange")

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr, data: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister")
