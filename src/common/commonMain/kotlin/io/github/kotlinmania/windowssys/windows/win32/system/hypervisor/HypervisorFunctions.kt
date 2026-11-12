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

public expect fun applyGuestMemoryFix(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualaddress: ULong, fixbuffer: ConstPtr<CVoid>, fixbuffersize: UInt): Hresult

public expect fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult

public expect fun callStackUnwind(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, imageinfo: ConstPtr<ModuleInfo>, imageinfocount: UInt, framecount: UInt, callstack: MutPtr<Pwstr>): Hresult

public expect fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: MutPtr<UInt>, found: MutPtr<Bool>): Hresult

public expect fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevel: UByte): Hresult

public expect fun forceArchitecture(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, architecture: VirtualProcessorArch): Hresult

public expect fun forceNestedHostMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, hostmode: Bool, oldmode: MutPtr<Bool>): Hresult

public expect fun forcePagingMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, pagingmode: PagingMode): Hresult

public expect fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevel: MutPtr<UByte>): Hresult

public expect fun getArchitecture(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, architecture: MutPtr<VirtualProcessorArch>): Hresult

public expect fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevels: MutPtr<UInt>): Hresult

public expect fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr<CVoid>, virtualtrustlevels: MutPtr<UInt>): Hresult

public expect fun getGuestOsInfo(vmsavedstatedumphandle: MutPtr<CVoid>, virtualtrustlevel: UByte, guestosinfo: MutPtr<GuestOsInfo>): Hresult

public expect fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: MutPtr<CVoid>, memorychunkpagesize: MutPtr<ULong>, memorychunks: MutPtr<GpaMemoryChunk>, memorychunkcount: MutPtr<ULong>): Hresult

public expect fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: MutPtr<CVoid>, guestrawsavedmemorysize: MutPtr<ULong>): Hresult

public expect fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr<CVoid>, memoryblockcachelimit: MutPtr<ULong>): Hresult

public expect fun getNestedVirtualizationMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, enabled: MutPtr<Bool>): Hresult

public expect fun getPagingMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, pagingmode: MutPtr<PagingMode>): Hresult

public expect fun getRegisterValue(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, registerid: UInt, registervalue: MutPtr<VirtualProcessorRegister>): Hresult

public expect fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, typefieldinfomap: MutPtr<Pwstr>): Hresult

public expect fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: MutPtr<CVoid>): Handle

public expect fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, size: MutPtr<UInt>): Hresult

public expect fun getVpCount(vmsavedstatedumphandle: MutPtr<CVoid>, vpcount: MutPtr<UInt>): Hresult

public expect fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: MutPtr<CVoid>, physicaladdress: ULong, rawsavedmemoryoffset: MutPtr<ULong>): Hresult

public expect fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualaddress: ULong, physicaladdress: MutPtr<ULong>, unmappedregionsize: MutPtr<ULong>): Hresult

public expect fun hdvCreateDeviceInstance(devicehosthandle: ConstPtr<CVoid>, devicetype: HdvDeviceType, deviceclassid: ConstPtr<Guid>, deviceinstanceid: ConstPtr<Guid>, deviceinterface: ConstPtr<CVoid>, devicecontext: ConstPtr<CVoid>, devicehandle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hdvCreateGuestMemoryAperture(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hdvCreateSectionBackedMmioRange(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult

public expect fun hdvDeliverGuestInterrupt(requestor: ConstPtr<CVoid>, msiaddress: ULong, msidata: UInt): Hresult

public expect fun hdvDestroyGuestMemoryAperture(requestor: ConstPtr<CVoid>, mappedaddress: ConstPtr<CVoid>): Hresult

public expect fun hdvDestroySectionBackedMmioRange(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult

public expect fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hdvReadGuestMemory(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, buffer: MutPtr<UByte>): Hresult

public expect fun hdvRegisterDoorbell(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult

public expect fun hdvTeardownDeviceHost(devicehosthandle: ConstPtr<CVoid>): Hresult

public expect fun hdvUnregisterDoorbell(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult

public expect fun hdvWriteGuestMemory(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, buffer: ConstPtr<UByte>): Hresult

public expect fun inKernelSpace(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, inkernelspace: MutPtr<Bool>): Hresult

public expect fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, activevirtualtrustlevelenabled: MutPtr<Bool>): Hresult

public expect fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: MutPtr<CVoid>, enabled: MutPtr<Bool>): Hresult

public expect fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: MutPtr<CVoid>, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult

public expect fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: MutPtr<CVoid>, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult

public expect fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr<CVoid>, usersymbols: Pcwstr, force: Bool): Hresult

public expect fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: MutPtr<Pwstr>, vsvpath: MutPtr<Pwstr>, vmrspath: MutPtr<Pwstr>): Hresult

public expect fun readGuestPhysicalAddress(vmsavedstatedumphandle: MutPtr<CVoid>, physicaladdress: ULong, buffer: MutPtr<CVoid>, buffersize: UInt, bytesread: MutPtr<UInt>): Hresult

public expect fun readGuestRawSavedMemory(vmsavedstatedumphandle: MutPtr<CVoid>, rawsavedmemoryoffset: ULong, buffer: MutPtr<CVoid>, buffersize: UInt, bytesread: MutPtr<UInt>): Hresult

public expect fun readSavedStateGlobalVariable(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, globalname: Pcstr, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult

public expect fun releaseSavedStateFiles(vmsavedstatedumphandle: MutPtr<CVoid>): Hresult

public expect fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr<CVoid>): Hresult

public expect fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, globalname: Pcstr, virtualaddress: MutPtr<ULong>, size: MutPtr<UInt>): Hresult

public expect fun scanMemoryForDosImages(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: MutPtr<CVoid>, foundimagecallback: FoundImageCallback, standaloneaddress: ConstPtr<ULong>, standaloneaddresscount: UInt): Hresult

public expect fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr<CVoid>, memoryblockcachelimit: ULong): Hresult

public expect fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: MutPtr<CVoid>, callback: GuestSymbolsProviderDebugInfoCallback): Hresult

public expect fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: MutPtr<WhvPartitionHandle>): Hresult

public expect fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: ConstPtr<WhvMemoryRangeEntry>, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: ConstPtr<CVoid>, advicebuffersizeinbytes: UInt): Hresult

public expect fun wHvAllocateVpciResource(providerid: ConstPtr<Guid>, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: ConstPtr<CVoid>, resourcedescriptorsizeinbytes: UInt, vpciresource: MutPtr<Handle>): Hresult

public expect fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult

public expect fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult

public expect fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult

public expect fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: ConstPtr<WhvNotificationPortParameters>, eventhandle: Handle, porthandle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wHvCreatePartition(partition: MutPtr<WhvPartitionHandle>): Hresult

public expect fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: ConstPtr<WhvTriggerParameters>, triggerhandle: MutPtr<MutPtr<CVoid>>, eventhandle: MutPtr<Handle>): Hresult

public expect fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult

public expect fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: ConstPtr<WhvVirtualProcessorProperty>, propertycount: UInt): Hresult

public expect fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult

public expect fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: ConstPtr<CVoid>): Hresult

public expect fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult

public expect fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: ConstPtr<CVoid>): Hresult

public expect fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult

public expect fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult

public expect fun wHvEmulatorCreateEmulator(callbacks: ConstPtr<WhvEmulatorCallbacks>, emulator: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun wHvEmulatorDestroyEmulator(emulator: ConstPtr<CVoid>): Hresult

public expect fun wHvEmulatorTryIoEmulation(emulator: ConstPtr<CVoid>, context: ConstPtr<CVoid>, vpcontext: ConstPtr<WhvVpExitContext>, ioinstructioncontext: ConstPtr<WhvX64IoPortAccessContext>, emulatorreturnstatus: MutPtr<WhvEmulatorStatus>): Hresult

public expect fun wHvEmulatorTryMmioEmulation(emulator: ConstPtr<CVoid>, context: ConstPtr<CVoid>, vpcontext: ConstPtr<WhvVpExitContext>, mmioinstructioncontext: ConstPtr<WhvMemoryAccessContext>, emulatorreturnstatus: MutPtr<WhvEmulatorStatus>): Hresult

public expect fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: MutPtr<CVoid>, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult

public expect fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: MutPtr<UInt>, vpcount: UInt, targetvpcount: MutPtr<UInt>): Hresult

public expect fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult

public expect fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: MutPtr<CVoid>, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult

public expect fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult

public expect fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: MutPtr<WhvCpuidOutput>): Hresult

public expect fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr<CVoid>, statesize: UInt, writtensize: MutPtr<UInt>): Hresult

public expect fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr<CVoid>, statesize: UInt, writtensize: MutPtr<UInt>): Hresult

public expect fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: MutPtr<WhvRegisterValue>): Hresult

public expect fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult

public expect fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult

public expect fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: MutPtr<WhvVpciInterruptTarget>, targetsizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult

public expect fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: MutPtr<WhvVpciDeviceNotification>, notificationsizeinbytes: UInt): Hresult

public expect fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: MutPtr<CVoid>, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult

public expect fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: ConstPtr<CVoid>, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult

public expect fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: ConstPtr<CVoid>, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult

public expect fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: ConstPtr<WhvVpciInterruptTarget>, msiaddress: MutPtr<ULong>, msidata: MutPtr<UInt>): Hresult

public expect fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: MutPtr<UInt>, mappings: MutPtr<MutPtr<WhvVpciMmioMapping>>): Hresult

public expect fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: ConstPtr<CVoid>, messagesizeinbytes: UInt): Hresult

public expect fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: MutPtr<ULong>, bitmapsizeinbytes: UInt): Hresult

public expect fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: MutPtr<CVoid>, datasizeinbytes: UInt): Hresult

public expect fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr<WhvVpciDeviceRegister>, data: MutPtr<CVoid>): Hresult

public expect fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr<WhvDoorbellMatchData>, eventhandle: Handle): Hresult

public expect fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: ConstPtr<WhvInterruptControl>, interruptcontrolsize: UInt): Hresult

public expect fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult

public expect fun wHvResetPartition(partition: WhvPartitionHandle): Hresult

public expect fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult

public expect fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: ConstPtr<WhvVpciInterruptTarget>): Hresult

public expect fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: MutPtr<CVoid>, exitcontextsizeinbytes: UInt): Hresult

public expect fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: ConstPtr<CVoid>, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult

public expect fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: ConstPtr<CVoid>, propertybuffersizeinbytes: UInt): Hresult

public expect fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr<CVoid>, statesize: UInt): Hresult

public expect fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr<CVoid>, statesize: UInt): Hresult

public expect fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: ConstPtr<WhvRegisterValue>): Hresult

public expect fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: ConstPtr<CVoid>, buffersizeinbytes: UInt): Hresult

public expect fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: ConstPtr<CVoid>, buffersizeinbytes: UInt): Hresult

public expect fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult

public expect fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult

public expect fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: MutPtr<Bool>): Hresult

public expect fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: MutPtr<Handle>): Hresult

public expect fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult

public expect fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: MutPtr<WhvTranslateGvaResult>, gpa: MutPtr<ULong>): Hresult

public expect fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult

public expect fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult

public expect fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult

public expect fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr<WhvDoorbellMatchData>): Hresult

public expect fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: ConstPtr<WhvTriggerParameters>, triggerhandle: ConstPtr<CVoid>): Hresult

public expect fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: ConstPtr<CVoid>, datasizeinbytes: UInt): Hresult

public expect fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr<WhvVpciDeviceRegister>, data: ConstPtr<CVoid>): Hresult
