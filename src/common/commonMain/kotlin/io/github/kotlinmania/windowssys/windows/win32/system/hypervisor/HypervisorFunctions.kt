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

public expect fun applyGuestMemoryFix(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualaddress: ULong, fixbuffer: ConstPtr, fixbuffersize: UInt): Hresult

public expect fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult

public expect fun callStackUnwind(vmsavedstatedumphandle: MutPtr, vpid: UInt, imageinfo: ConstPtr, imageinfocount: UInt, framecount: UInt, callstack: MutPtr): Hresult

public expect fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: MutPtr, found: MutPtr): Hresult

public expect fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevel: UByte): Hresult

public expect fun forceArchitecture(vmsavedstatedumphandle: MutPtr, vpid: UInt, architecture: VirtualProcessorArch): Hresult

public expect fun forceNestedHostMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, hostmode: Bool, oldmode: MutPtr): Hresult

public expect fun forcePagingMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, pagingmode: PagingMode): Hresult

public expect fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevel: MutPtr): Hresult

public expect fun getArchitecture(vmsavedstatedumphandle: MutPtr, vpid: UInt, architecture: MutPtr): Hresult

public expect fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevels: MutPtr): Hresult

public expect fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr, virtualtrustlevels: MutPtr): Hresult

public expect fun getGuestOsInfo(vmsavedstatedumphandle: MutPtr, virtualtrustlevel: UByte, guestosinfo: MutPtr): Hresult

public expect fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: MutPtr, memorychunkpagesize: MutPtr, memorychunks: MutPtr, memorychunkcount: MutPtr): Hresult

public expect fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: MutPtr, guestrawsavedmemorysize: MutPtr): Hresult

public expect fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr, memoryblockcachelimit: MutPtr): Hresult

public expect fun getNestedVirtualizationMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, enabled: MutPtr): Hresult

public expect fun getPagingMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, pagingmode: MutPtr): Hresult

public expect fun getRegisterValue(vmsavedstatedumphandle: MutPtr, vpid: UInt, registerid: UInt, registervalue: MutPtr): Hresult

public expect fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, typefieldinfomap: MutPtr): Hresult

public expect fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: MutPtr): Handle

public expect fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, size: MutPtr): Hresult

public expect fun getVpCount(vmsavedstatedumphandle: MutPtr, vpcount: MutPtr): Hresult

public expect fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: MutPtr, physicaladdress: ULong, rawsavedmemoryoffset: MutPtr): Hresult

public expect fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualaddress: ULong, physicaladdress: MutPtr, unmappedregionsize: MutPtr): Hresult

public expect fun hdvCreateDeviceInstance(devicehosthandle: ConstPtr, devicetype: HdvDeviceType, deviceclassid: ConstPtr, deviceinstanceid: ConstPtr, deviceinterface: ConstPtr, devicecontext: ConstPtr, devicehandle: MutPtr): Hresult

public expect fun hdvCreateGuestMemoryAperture(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: MutPtr): Hresult

public expect fun hdvCreateSectionBackedMmioRange(requestor: ConstPtr, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult

public expect fun hdvDeliverGuestInterrupt(requestor: ConstPtr, msiaddress: ULong, msidata: UInt): Hresult

public expect fun hdvDestroyGuestMemoryAperture(requestor: ConstPtr, mappedaddress: ConstPtr): Hresult

public expect fun hdvDestroySectionBackedMmioRange(requestor: ConstPtr, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult

public expect fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: MutPtr): Hresult

public expect fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: MutPtr): Hresult

public expect fun hdvReadGuestMemory(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, buffer: MutPtr): Hresult

public expect fun hdvRegisterDoorbell(requestor: ConstPtr, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult

public expect fun hdvTeardownDeviceHost(devicehosthandle: ConstPtr): Hresult

public expect fun hdvUnregisterDoorbell(requestor: ConstPtr, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult

public expect fun hdvWriteGuestMemory(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, buffer: ConstPtr): Hresult

public expect fun inKernelSpace(vmsavedstatedumphandle: MutPtr, vpid: UInt, inkernelspace: MutPtr): Hresult

public expect fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: MutPtr, vpid: UInt, activevirtualtrustlevelenabled: MutPtr): Hresult

public expect fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: MutPtr, enabled: MutPtr): Hresult

public expect fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: MutPtr): Hresult

public expect fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: MutPtr): Hresult

public expect fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: MutPtr, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult

public expect fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: MutPtr, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult

public expect fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr, usersymbols: Pcwstr, force: Bool): Hresult

public expect fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: MutPtr, vsvpath: MutPtr, vmrspath: MutPtr): Hresult

public expect fun readGuestPhysicalAddress(vmsavedstatedumphandle: MutPtr, physicaladdress: ULong, buffer: MutPtr, buffersize: UInt, bytesread: MutPtr): Hresult

public expect fun readGuestRawSavedMemory(vmsavedstatedumphandle: MutPtr, rawsavedmemoryoffset: ULong, buffer: MutPtr, buffersize: UInt, bytesread: MutPtr): Hresult

public expect fun readSavedStateGlobalVariable(vmsavedstatedumphandle: MutPtr, vpid: UInt, globalname: Pcstr, buffer: MutPtr, buffersize: UInt): Hresult

public expect fun releaseSavedStateFiles(vmsavedstatedumphandle: MutPtr): Hresult

public expect fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr): Hresult

public expect fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: MutPtr, vpid: UInt, globalname: Pcstr, virtualaddress: MutPtr, size: MutPtr): Hresult

public expect fun scanMemoryForDosImages(vmsavedstatedumphandle: MutPtr, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: MutPtr, foundimagecallback: FoundImageCallback, standaloneaddress: ConstPtr, standaloneaddresscount: UInt): Hresult

public expect fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr, memoryblockcachelimit: ULong): Hresult

public expect fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: MutPtr, callback: GuestSymbolsProviderDebugInfoCallback): Hresult

public expect fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: MutPtr): Hresult

public expect fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: ConstPtr, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: ConstPtr, advicebuffersizeinbytes: UInt): Hresult

public expect fun wHvAllocateVpciResource(providerid: ConstPtr, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: ConstPtr, resourcedescriptorsizeinbytes: UInt, vpciresource: MutPtr): Hresult

public expect fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult

public expect fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult

public expect fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult

public expect fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: ConstPtr, eventhandle: Handle, porthandle: MutPtr): Hresult

public expect fun wHvCreatePartition(partition: MutPtr): Hresult

public expect fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: ConstPtr, triggerhandle: MutPtr, eventhandle: MutPtr): Hresult

public expect fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult

public expect fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: ConstPtr, propertycount: UInt): Hresult

public expect fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult

public expect fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: ConstPtr): Hresult

public expect fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult

public expect fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: ConstPtr): Hresult

public expect fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult

public expect fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult

public expect fun wHvEmulatorCreateEmulator(callbacks: ConstPtr, emulator: MutPtr): Hresult

public expect fun wHvEmulatorDestroyEmulator(emulator: ConstPtr): Hresult

public expect fun wHvEmulatorTryIoEmulation(emulator: ConstPtr, context: ConstPtr, vpcontext: ConstPtr, ioinstructioncontext: ConstPtr, emulatorreturnstatus: MutPtr): Hresult

public expect fun wHvEmulatorTryMmioEmulation(emulator: ConstPtr, context: ConstPtr, vpcontext: ConstPtr, mmioinstructioncontext: ConstPtr, emulatorreturnstatus: MutPtr): Hresult

public expect fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: MutPtr, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult

public expect fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: MutPtr, vpcount: UInt, targetvpcount: MutPtr): Hresult

public expect fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult

public expect fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: MutPtr, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult

public expect fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult

public expect fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: MutPtr): Hresult

public expect fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr, statesize: UInt, writtensize: MutPtr): Hresult

public expect fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr, statesize: UInt, writtensize: MutPtr): Hresult

public expect fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr, registercount: UInt, registervalues: MutPtr): Hresult

public expect fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult

public expect fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult

public expect fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: MutPtr, targetsizeinbytes: UInt, byteswritten: MutPtr): Hresult

public expect fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: MutPtr, notificationsizeinbytes: UInt): Hresult

public expect fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: MutPtr, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult

public expect fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: ConstPtr, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult

public expect fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: ConstPtr, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult

public expect fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: ConstPtr, msiaddress: MutPtr, msidata: MutPtr): Hresult

public expect fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: MutPtr, mappings: MutPtr): Hresult

public expect fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: ConstPtr, messagesizeinbytes: UInt): Hresult

public expect fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: MutPtr, bitmapsizeinbytes: UInt): Hresult

public expect fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: MutPtr, datasizeinbytes: UInt): Hresult

public expect fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr, data: MutPtr): Hresult

public expect fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr, eventhandle: Handle): Hresult

public expect fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: ConstPtr, interruptcontrolsize: UInt): Hresult

public expect fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult

public expect fun wHvResetPartition(partition: WhvPartitionHandle): Hresult

public expect fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult

public expect fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: ConstPtr): Hresult

public expect fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: MutPtr, exitcontextsizeinbytes: UInt): Hresult

public expect fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: ConstPtr, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult

public expect fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: ConstPtr, propertybuffersizeinbytes: UInt): Hresult

public expect fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr, statesize: UInt): Hresult

public expect fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr, statesize: UInt): Hresult

public expect fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr, registercount: UInt, registervalues: ConstPtr): Hresult

public expect fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: ConstPtr, buffersizeinbytes: UInt): Hresult

public expect fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: ConstPtr, buffersizeinbytes: UInt): Hresult

public expect fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult

public expect fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult

public expect fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: MutPtr): Hresult

public expect fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: MutPtr): Hresult

public expect fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult

public expect fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: MutPtr, gpa: MutPtr): Hresult

public expect fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult

public expect fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult

public expect fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult

public expect fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr): Hresult

public expect fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: ConstPtr, triggerhandle: ConstPtr): Hresult

public expect fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: ConstPtr, datasizeinbytes: UInt): Hresult

public expect fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr, data: ConstPtr): Hresult
