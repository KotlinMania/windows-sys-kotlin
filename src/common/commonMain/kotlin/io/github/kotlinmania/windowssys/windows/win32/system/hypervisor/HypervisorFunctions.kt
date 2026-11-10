package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HcsSystem
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState

public expect fun applyGuestMemoryFix(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, fixbuffer: COpaquePointer?, fixbuffersize: UInt): Hresult

public expect fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult

public expect fun callStackUnwind(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, imageinfo: COpaquePointer?, imageinfocount: UInt, framecount: UInt, callstack: COpaquePointer?): Hresult

public expect fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: COpaquePointer?, found: COpaquePointer?): Hresult

public expect fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: UByte): Hresult

public expect fun forceArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: VirtualProcessorArch): Hresult

public expect fun forceNestedHostMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, hostmode: Bool, oldmode: COpaquePointer?): Hresult

public expect fun forcePagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: PagingMode): Hresult

public expect fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: COpaquePointer?): Hresult

public expect fun getArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: COpaquePointer?): Hresult

public expect fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevels: COpaquePointer?): Hresult

public expect fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevels: COpaquePointer?): Hresult

public expect fun getGuestOsInfo(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevel: UByte, guestosinfo: COpaquePointer?): Hresult

public expect fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: COpaquePointer?, memorychunkpagesize: COpaquePointer?, memorychunks: COpaquePointer?, memorychunkcount: COpaquePointer?): Hresult

public expect fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: COpaquePointer?, guestrawsavedmemorysize: COpaquePointer?): Hresult

public expect fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: COpaquePointer?): Hresult

public expect fun getNestedVirtualizationMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, enabled: COpaquePointer?): Hresult

public expect fun getPagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: COpaquePointer?): Hresult

public expect fun getRegisterValue(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, registerid: UInt, registervalue: COpaquePointer?): Hresult

public expect fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, typefieldinfomap: COpaquePointer?): Hresult

public expect fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: COpaquePointer?): Handle

public expect fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, size: COpaquePointer?): Hresult

public expect fun getVpCount(vmsavedstatedumphandle: COpaquePointer?, vpcount: COpaquePointer?): Hresult

public expect fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, rawsavedmemoryoffset: COpaquePointer?): Hresult

public expect fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, physicaladdress: COpaquePointer?, unmappedregionsize: COpaquePointer?): Hresult

public expect fun hdvCreateDeviceInstance(devicehosthandle: COpaquePointer?, devicetype: HdvDeviceType, deviceclassid: COpaquePointer?, deviceinstanceid: COpaquePointer?, deviceinterface: COpaquePointer?, devicecontext: COpaquePointer?, devicehandle: COpaquePointer?): Hresult

public expect fun hdvCreateGuestMemoryAperture(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: COpaquePointer?): Hresult

public expect fun hdvCreateSectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult

public expect fun hdvDeliverGuestInterrupt(requestor: COpaquePointer?, msiaddress: ULong, msidata: UInt): Hresult

public expect fun hdvDestroyGuestMemoryAperture(requestor: COpaquePointer?, mappedaddress: COpaquePointer?): Hresult

public expect fun hdvDestroySectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult

public expect fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: COpaquePointer?): Hresult

public expect fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: COpaquePointer?): Hresult

public expect fun hdvReadGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult

public expect fun hdvRegisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult

public expect fun hdvTeardownDeviceHost(devicehosthandle: COpaquePointer?): Hresult

public expect fun hdvUnregisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult

public expect fun hdvWriteGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult

public expect fun inKernelSpace(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, inkernelspace: COpaquePointer?): Hresult

public expect fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, activevirtualtrustlevelenabled: COpaquePointer?): Hresult

public expect fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: COpaquePointer?, enabled: COpaquePointer?): Hresult

public expect fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult

public expect fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult

public expect fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult

public expect fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult

public expect fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?, usersymbols: Pcwstr, force: Bool): Hresult

public expect fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: COpaquePointer?, vsvpath: COpaquePointer?, vmrspath: COpaquePointer?): Hresult

public expect fun readGuestPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult

public expect fun readGuestRawSavedMemory(vmsavedstatedumphandle: COpaquePointer?, rawsavedmemoryoffset: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult

public expect fun readSavedStateGlobalVariable(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, buffer: COpaquePointer?, buffersize: UInt): Hresult

public expect fun releaseSavedStateFiles(vmsavedstatedumphandle: COpaquePointer?): Hresult

public expect fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?): Hresult

public expect fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, virtualaddress: COpaquePointer?, size: COpaquePointer?): Hresult

public expect fun scanMemoryForDosImages(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: COpaquePointer?, foundimagecallback: FoundImageCallback, standaloneaddress: COpaquePointer?, standaloneaddresscount: UInt): Hresult

public expect fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: ULong): Hresult

public expect fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: COpaquePointer?, callback: GuestSymbolsProviderDebugInfoCallback): Hresult

public expect fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: COpaquePointer?): Hresult

public expect fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: COpaquePointer?, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: COpaquePointer?, advicebuffersizeinbytes: UInt): Hresult

public expect fun wHvAllocateVpciResource(providerid: COpaquePointer?, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: COpaquePointer?, resourcedescriptorsizeinbytes: UInt, vpciresource: COpaquePointer?): Hresult

public expect fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult

public expect fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult

public expect fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult

public expect fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: COpaquePointer?, eventhandle: Handle, porthandle: COpaquePointer?): Hresult

public expect fun wHvCreatePartition(partition: COpaquePointer?): Hresult

public expect fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?, eventhandle: COpaquePointer?): Hresult

public expect fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult

public expect fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: COpaquePointer?, propertycount: UInt): Hresult

public expect fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult

public expect fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: COpaquePointer?): Hresult

public expect fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult

public expect fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: COpaquePointer?): Hresult

public expect fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult

public expect fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult

public expect fun wHvEmulatorCreateEmulator(callbacks: COpaquePointer?, emulator: COpaquePointer?): Hresult

public expect fun wHvEmulatorDestroyEmulator(emulator: COpaquePointer?): Hresult

public expect fun wHvEmulatorTryIoEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, ioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult

public expect fun wHvEmulatorTryMmioEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, mmioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult

public expect fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: COpaquePointer?, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult

public expect fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: COpaquePointer?, vpcount: UInt, targetvpcount: COpaquePointer?): Hresult

public expect fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult

public expect fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult

public expect fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult

public expect fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: COpaquePointer?): Hresult

public expect fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult

public expect fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult

public expect fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult

public expect fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult

public expect fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult

public expect fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: COpaquePointer?, targetsizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult

public expect fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: COpaquePointer?, notificationsizeinbytes: UInt): Hresult

public expect fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult

public expect fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult

public expect fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult

public expect fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: COpaquePointer?, msiaddress: COpaquePointer?, msidata: COpaquePointer?): Hresult

public expect fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: COpaquePointer?, mappings: COpaquePointer?): Hresult

public expect fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: COpaquePointer?, messagesizeinbytes: UInt): Hresult

public expect fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: COpaquePointer?, bitmapsizeinbytes: UInt): Hresult

public expect fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult

public expect fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult

public expect fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?, eventhandle: Handle): Hresult

public expect fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: COpaquePointer?, interruptcontrolsize: UInt): Hresult

public expect fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult

public expect fun wHvResetPartition(partition: WhvPartitionHandle): Hresult

public expect fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult

public expect fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: COpaquePointer?): Hresult

public expect fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: COpaquePointer?, exitcontextsizeinbytes: UInt): Hresult

public expect fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: COpaquePointer?, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult

public expect fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt): Hresult

public expect fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult

public expect fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult

public expect fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult

public expect fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult

public expect fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult

public expect fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult

public expect fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult

public expect fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: COpaquePointer?): Hresult

public expect fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: COpaquePointer?): Hresult

public expect fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult

public expect fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: COpaquePointer?, gpa: COpaquePointer?): Hresult

public expect fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult

public expect fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult

public expect fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult

public expect fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?): Hresult

public expect fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?): Hresult

public expect fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult

public expect fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult
