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

public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, fixbuffer: COpaquePointer?, fixbuffersize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun callStackUnwind(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, imageinfo: COpaquePointer?, imageinfocount: UInt, framecount: UInt, callstack: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: COpaquePointer?, found: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun forceArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun forceNestedHostMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, hostmode: Bool, oldmode: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun forcePagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: PagingMode): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevels: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevels: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGuestOsInfo(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevel: UByte, guestosinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: COpaquePointer?, memorychunkpagesize: COpaquePointer?, memorychunks: COpaquePointer?, memorychunkcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: COpaquePointer?, guestrawsavedmemorysize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, enabled: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRegisterValue(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, registerid: UInt, registervalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, typefieldinfomap: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, size: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getVpCount(vmsavedstatedumphandle: COpaquePointer?, vpcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, rawsavedmemoryoffset: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, physicaladdress: COpaquePointer?, unmappedregionsize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvCreateDeviceInstance(devicehosthandle: COpaquePointer?, devicetype: HdvDeviceType, deviceclassid: COpaquePointer?, deviceinstanceid: COpaquePointer?, deviceinterface: COpaquePointer?, devicecontext: COpaquePointer?, devicehandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvCreateGuestMemoryAperture(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvCreateSectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvDeliverGuestInterrupt(requestor: COpaquePointer?, msiaddress: ULong, msidata: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvDestroyGuestMemoryAperture(requestor: COpaquePointer?, mappedaddress: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvDestroySectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvReadGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvRegisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvTeardownDeviceHost(devicehosthandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvUnregisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun hdvWriteGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun inKernelSpace(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, inkernelspace: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, activevirtualtrustlevelenabled: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: COpaquePointer?, enabled: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?, usersymbols: Pcwstr, force: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: COpaquePointer?, vsvpath: COpaquePointer?, vmrspath: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: COpaquePointer?, rawsavedmemoryoffset: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, virtualaddress: COpaquePointer?, size: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: COpaquePointer?, foundimagecallback: FoundImageCallback, standaloneaddress: COpaquePointer?, standaloneaddresscount: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: COpaquePointer?, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: COpaquePointer?, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: COpaquePointer?, advicebuffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvAllocateVpciResource(providerid: COpaquePointer?, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: COpaquePointer?, resourcedescriptorsizeinbytes: UInt, vpciresource: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: COpaquePointer?, eventhandle: Handle, porthandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvCreatePartition(partition: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?, eventhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: COpaquePointer?, propertycount: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvEmulatorCreateEmulator(callbacks: COpaquePointer?, emulator: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvEmulatorDestroyEmulator(emulator: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvEmulatorTryIoEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, ioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvEmulatorTryMmioEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, mmioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: COpaquePointer?, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: COpaquePointer?, vpcount: UInt, targetvpcount: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: COpaquePointer?, targetsizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: COpaquePointer?, notificationsizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: COpaquePointer?, msiaddress: COpaquePointer?, msidata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: COpaquePointer?, mappings: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: COpaquePointer?, messagesizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: COpaquePointer?, bitmapsizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?, eventhandle: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: COpaquePointer?, interruptcontrolsize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvResetPartition(partition: WhvPartitionHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: COpaquePointer?, exitcontextsizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: COpaquePointer?, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: COpaquePointer?, gpa: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
