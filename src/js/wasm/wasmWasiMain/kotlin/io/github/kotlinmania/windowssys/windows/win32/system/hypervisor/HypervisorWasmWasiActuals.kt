@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualaddress: ULong, fixbuffer: ConstPtr<CVoid>, fixbuffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix")

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog")

public actual fun callStackUnwind(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, imageinfo: ConstPtr<ModuleInfo>, imageinfocount: UInt, framecount: UInt, callstack: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorCallStackUnwind")

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: MutPtr<UInt>, found: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType")

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel")

public actual fun forceArchitecture(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorForceArchitecture")

public actual fun forceNestedHostMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, hostmode: Bool, oldmode: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorForceNestedHostMode")

public actual fun forcePagingMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, pagingmode: PagingMode): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorForcePagingMode")

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevel: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel")

public actual fun getArchitecture(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, architecture: MutPtr<VirtualProcessorArch>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetArchitecture")

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevels: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels")

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr<CVoid>, virtualtrustlevels: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels")

public actual fun getGuestOsInfo(vmsavedstatedumphandle: MutPtr<CVoid>, virtualtrustlevel: UByte, guestosinfo: MutPtr<GuestOsInfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetGuestOsInfo")

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: MutPtr<CVoid>, memorychunkpagesize: MutPtr<ULong>, memorychunks: MutPtr<GpaMemoryChunk>, memorychunkcount: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks")

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: MutPtr<CVoid>, guestrawsavedmemorysize: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize")

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr<CVoid>, memoryblockcachelimit: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit")

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, enabled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode")

public actual fun getPagingMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, pagingmode: MutPtr<PagingMode>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetPagingMode")

public actual fun getRegisterValue(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, registerid: UInt, registervalue: MutPtr<VirtualProcessorRegister>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetRegisterValue")

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, typefieldinfomap: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo")

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: MutPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle")

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, size: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize")

public actual fun getVpCount(vmsavedstatedumphandle: MutPtr<CVoid>, vpcount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGetVpCount")

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: MutPtr<CVoid>, physicaladdress: ULong, rawsavedmemoryoffset: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset")

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualaddress: ULong, physicaladdress: MutPtr<ULong>, unmappedregionsize: MutPtr<ULong>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress")

public actual fun hdvCreateDeviceInstance(devicehosthandle: ConstPtr<CVoid>, devicetype: HdvDeviceType, deviceclassid: ConstPtr<Guid>, deviceinstanceid: ConstPtr<Guid>, deviceinterface: ConstPtr<CVoid>, devicecontext: ConstPtr<CVoid>, devicehandle: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance")

public actual fun hdvCreateGuestMemoryAperture(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture")

public actual fun hdvCreateSectionBackedMmioRange(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange")

public actual fun hdvDeliverGuestInterrupt(requestor: ConstPtr<CVoid>, msiaddress: ULong, msidata: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt")

public actual fun hdvDestroyGuestMemoryAperture(requestor: ConstPtr<CVoid>, mappedaddress: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture")

public actual fun hdvDestroySectionBackedMmioRange(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange")

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost")

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx")

public actual fun hdvReadGuestMemory(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, buffer: MutPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory")

public actual fun hdvRegisterDoorbell(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell")

public actual fun hdvTeardownDeviceHost(devicehosthandle: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost")

public actual fun hdvUnregisterDoorbell(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell")

public actual fun hdvWriteGuestMemory(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, buffer: ConstPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory")

public actual fun inKernelSpace(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, inkernelspace: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorInKernelSpace")

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, activevirtualtrustlevelenabled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled")

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: MutPtr<CVoid>, enabled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled")

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateFile")

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles")

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: MutPtr<CVoid>, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols")

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: MutPtr<CVoid>, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx")

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr<CVoid>, usersymbols: Pcwstr, force: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider")

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: MutPtr<Pwstr>, vsvpath: MutPtr<Pwstr>, vmrspath: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles")

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: MutPtr<CVoid>, physicaladdress: ULong, buffer: MutPtr<CVoid>, buffersize: UInt, bytesread: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress")

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: MutPtr<CVoid>, rawsavedmemoryoffset: ULong, buffer: MutPtr<CVoid>, buffersize: UInt, bytesread: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory")

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, globalname: Pcstr, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable")

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles")

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider")

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, globalname: Pcstr, virtualaddress: MutPtr<ULong>, size: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress")

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: MutPtr<CVoid>, foundimagecallback: FoundImageCallback, standaloneaddress: ConstPtr<ULong>, standaloneaddresscount: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages")

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr<CVoid>, memoryblockcachelimit: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit")

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: MutPtr<CVoid>, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback")

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: MutPtr<WhvPartitionHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration")

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: ConstPtr<WhvMemoryRangeEntry>, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: ConstPtr<CVoid>, advicebuffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange")

public actual fun wHvAllocateVpciResource(providerid: ConstPtr<Guid>, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: ConstPtr<CVoid>, resourcedescriptorsizeinbytes: UInt, vpciresource: MutPtr<Handle>): Hresult =
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

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: ConstPtr<WhvNotificationPortParameters>, eventhandle: Handle, porthandle: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort")

public actual fun wHvCreatePartition(partition: MutPtr<WhvPartitionHandle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreatePartition")

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: ConstPtr<WhvTriggerParameters>, triggerhandle: MutPtr<MutPtr<CVoid>>, eventhandle: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreateTrigger")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(partition: Long, vpindex: Int, flags: Int): Int

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(partition, vpindex.toInt(), flags.toInt())

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: ConstPtr<WhvVirtualProcessorProperty>, propertycount: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2")

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice")

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvDeletePartition")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvDeletePartition(partition: Long): Int

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvDeletePartition(partition)

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(partition: Long, vpindex: Int): Int

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(partition, vpindex.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(partition: Long, logicaldeviceid: Long): Int

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(partition, logicaldeviceid.toLong())

public actual fun wHvEmulatorCreateEmulator(callbacks: ConstPtr<WhvEmulatorCallbacks>, emulator: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator")

public actual fun wHvEmulatorDestroyEmulator(emulator: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator")

public actual fun wHvEmulatorTryIoEmulation(emulator: ConstPtr<CVoid>, context: ConstPtr<CVoid>, vpcontext: ConstPtr<WhvVpExitContext>, ioinstructioncontext: ConstPtr<WhvX64IoPortAccessContext>, emulatorreturnstatus: MutPtr<WhvEmulatorStatus>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation")

public actual fun wHvEmulatorTryMmioEmulation(emulator: ConstPtr<CVoid>, context: ConstPtr<CVoid>, vpcontext: ConstPtr<WhvVpExitContext>, mmioinstructioncontext: ConstPtr<WhvMemoryAccessContext>, emulatorreturnstatus: MutPtr<WhvEmulatorStatus>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation")

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: MutPtr<CVoid>, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetCapability")

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: MutPtr<UInt>, vpcount: UInt, targetvpcount: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet")

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters")

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: MutPtr<CVoid>, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty")

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters")

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: MutPtr<WhvCpuidOutput>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput")

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr<CVoid>, statesize: UInt, writtensize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState")

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr<CVoid>, statesize: UInt, writtensize: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2")

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: MutPtr<WhvRegisterValue>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters")

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState")

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState")

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: MutPtr<WhvVpciInterruptTarget>, targetsizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget")

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: MutPtr<WhvVpciDeviceNotification>, notificationsizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification")

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: MutPtr<CVoid>, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty")

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: ConstPtr<CVoid>, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvMapGpaRange")

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: ConstPtr<CVoid>, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2")

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: ConstPtr<WhvVpciInterruptTarget>, msiaddress: MutPtr<ULong>, msidata: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt")

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: MutPtr<UInt>, mappings: MutPtr<MutPtr<WhvVpciMmioMapping>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges")

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: ConstPtr<CVoid>, messagesizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage")

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: MutPtr<ULong>, bitmapsizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap")

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: MutPtr<CVoid>, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvReadGpaRange")

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr<WhvVpciDeviceRegister>, data: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister")

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr<WhvDoorbellMatchData>, eventhandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent")

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: ConstPtr<WhvInterruptControl>, interruptcontrolsize: UInt): Hresult =
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

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: ConstPtr<WhvVpciInterruptTarget>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt")

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: MutPtr<CVoid>, exitcontextsizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor")

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: ConstPtr<CVoid>, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty")

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: ConstPtr<CVoid>, propertybuffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty")

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr<CVoid>, statesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState")

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr<CVoid>, statesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2")

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: ConstPtr<WhvRegisterValue>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters")

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: ConstPtr<CVoid>, buffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState")

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: ConstPtr<CVoid>, buffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(partition: Long, logicaldeviceid: Long, powerstate: Int): Int

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(partition, logicaldeviceid.toLong(), powerstate)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvSetupPartition")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvSetupPartition(partition: Long): Int

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvSetupPartition(partition)

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvSignalVirtualProcessorSynicEvent")

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime")
private external fun wasiWindowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(partition: Long): Int

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    wasiWindowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(partition)

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: MutPtr<WhvTranslateGvaResult>, gpa: MutPtr<ULong>): Hresult =
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

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr<WhvDoorbellMatchData>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent")

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: ConstPtr<WhvTriggerParameters>, triggerhandle: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters")

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: ConstPtr<CVoid>, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvWriteGpaRange")

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr<WhvVpciDeviceRegister>, data: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister")
