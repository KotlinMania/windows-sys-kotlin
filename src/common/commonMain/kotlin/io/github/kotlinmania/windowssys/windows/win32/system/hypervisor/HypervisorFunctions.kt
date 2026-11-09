package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HCS_SYSTEM
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE

public expect fun ApplyGuestMemoryFix(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, fixbuffer: Long, fixbuffersize: UInt): HRESULT

public expect fun ApplyPendingSavedStateFileReplayLog(vmrsfile: PCWSTR): HRESULT

public expect fun CallStackUnwind(vmsavedstatedumphandle: Long, vpid: UInt, imageinfo: Long, imageinfocount: UInt, framecount: UInt, callstack: Long): HRESULT

public expect fun FindSavedStateSymbolFieldInType(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, fieldname: PCWSTR, offset: Long, found: Long): HRESULT

public expect fun ForceActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: UByte): HRESULT

public expect fun ForceArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: VIRTUAL_PROCESSOR_ARCH): HRESULT

public expect fun ForceNestedHostMode(vmsavedstatedumphandle: Long, vpid: UInt, hostmode: BOOL, oldmode: Long): HRESULT

public expect fun ForcePagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: PAGING_MODE): HRESULT

public expect fun GetActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: Long): HRESULT

public expect fun GetArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: Long): HRESULT

public expect fun GetEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevels: Long): HRESULT

public expect fun GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, virtualtrustlevels: Long): HRESULT

public expect fun GetGuestOsInfo(vmsavedstatedumphandle: Long, virtualtrustlevel: UByte, guestosinfo: Long): HRESULT

public expect fun GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle: Long, memorychunkpagesize: Long, memorychunks: Long, memorychunkcount: Long): HRESULT

public expect fun GetGuestRawSavedMemorySize(vmsavedstatedumphandle: Long, guestrawsavedmemorysize: Long): HRESULT

public expect fun GetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): HRESULT

public expect fun GetNestedVirtualizationMode(vmsavedstatedumphandle: Long, vpid: UInt, enabled: Long): HRESULT

public expect fun GetPagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: Long): HRESULT

public expect fun GetRegisterValue(vmsavedstatedumphandle: Long, vpid: UInt, registerid: UInt, registervalue: Long): HRESULT

public expect fun GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, typefieldinfomap: Long): HRESULT

public expect fun GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle: Long): HANDLE

public expect fun GetSavedStateSymbolTypeSize(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, size: Long): HRESULT

public expect fun GetVpCount(vmsavedstatedumphandle: Long, vpcount: Long): HRESULT

public expect fun GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: Long, physicaladdress: ULong, rawsavedmemoryoffset: Long): HRESULT

public expect fun GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, physicaladdress: Long, unmappedregionsize: Long): HRESULT

public expect fun HdvCreateDeviceInstance(devicehosthandle: Long, devicetype: HDV_DEVICE_TYPE, deviceclassid: Long, deviceinstanceid: Long, deviceinterface: Long, devicecontext: Long, devicehandle: Long): HRESULT

public expect fun HdvCreateGuestMemoryAperture(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: BOOL, mappedaddress: Long): HRESULT

public expect fun HdvCreateSectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HDV_MMIO_MAPPING_FLAGS, sectionhandle: HANDLE, sectionoffsetinpages: ULong): HRESULT

public expect fun HdvDeliverGuestInterrupt(requestor: Long, msiaddress: ULong, msidata: UInt): HRESULT

public expect fun HdvDestroyGuestMemoryAperture(requestor: Long, mappedaddress: Long): HRESULT

public expect fun HdvDestroySectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong): HRESULT

public expect fun HdvInitializeDeviceHost(computesystem: HCS_SYSTEM, devicehosthandle: Long): HRESULT

public expect fun HdvInitializeDeviceHostEx(computesystem: HCS_SYSTEM, flags: HDV_DEVICE_HOST_FLAGS, devicehosthandle: Long): HRESULT

public expect fun HdvReadGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT

public expect fun HdvRegisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: HANDLE): HRESULT

public expect fun HdvTeardownDeviceHost(devicehosthandle: Long): HRESULT

public expect fun HdvUnregisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong): HRESULT

public expect fun HdvWriteGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT

public expect fun InKernelSpace(vmsavedstatedumphandle: Long, vpid: UInt, inkernelspace: Long): HRESULT

public expect fun IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: Long, vpid: UInt, activevirtualtrustlevelenabled: Long): HRESULT

public expect fun IsNestedVirtualizationEnabled(vmsavedstatedumphandle: Long, enabled: Long): HRESULT

public expect fun LoadSavedStateFile(vmrsfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT

public expect fun LoadSavedStateFiles(binfile: PCWSTR, vsvfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT

public expect fun LoadSavedStateModuleSymbols(vmsavedstatedumphandle: Long, imagename: PCSTR, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT

public expect fun LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: Long, imagename: PCSTR, imagetimestamp: UInt, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT

public expect fun LoadSavedStateSymbolProvider(vmsavedstatedumphandle: Long, usersymbols: PCWSTR, force: BOOL): HRESULT

public expect fun LocateSavedStateFiles(vmname: PCWSTR, snapshotname: PCWSTR, binpath: Long, vsvpath: Long, vmrspath: Long): HRESULT

public expect fun ReadGuestPhysicalAddress(vmsavedstatedumphandle: Long, physicaladdress: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT

public expect fun ReadGuestRawSavedMemory(vmsavedstatedumphandle: Long, rawsavedmemoryoffset: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT

public expect fun ReadSavedStateGlobalVariable(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, buffer: Long, buffersize: UInt): HRESULT

public expect fun ReleaseSavedStateFiles(vmsavedstatedumphandle: Long): HRESULT

public expect fun ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle: Long): HRESULT

public expect fun ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, virtualaddress: Long, size: Long): HRESULT

public expect fun ScanMemoryForDosImages(vmsavedstatedumphandle: Long, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: Long, foundimagecallback: FOUND_IMAGE_CALLBACK, standaloneaddress: Long, standaloneaddresscount: UInt): HRESULT

public expect fun SetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: ULong): HRESULT

public expect fun SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: Long, callback: GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK): HRESULT

public expect fun WHvAcceptPartitionMigration(migrationhandle: HANDLE, partition: Long): HRESULT

public expect fun WHvAdviseGpaRange(partition: WHV_PARTITION_HANDLE, gparanges: Long, gparangescount: UInt, advice: WHV_ADVISE_GPA_RANGE_CODE, advicebuffer: Long, advicebuffersizeinbytes: UInt): HRESULT

public expect fun WHvAllocateVpciResource(providerid: Long, flags: WHV_ALLOCATE_VPCI_RESOURCE_FLAGS, resourcedescriptor: Long, resourcedescriptorsizeinbytes: UInt, vpciresource: Long): HRESULT

public expect fun WHvCancelPartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT

public expect fun WHvCancelRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT

public expect fun WHvCompletePartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT

public expect fun WHvCreateNotificationPort(partition: WHV_PARTITION_HANDLE, parameters: Long, eventhandle: HANDLE, porthandle: Long): HRESULT

public expect fun WHvCreatePartition(partition: Long): HRESULT

public expect fun WHvCreateTrigger(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long, eventhandle: Long): HRESULT

public expect fun WHvCreateVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT

public expect fun WHvCreateVirtualProcessor2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, properties: Long, propertycount: UInt): HRESULT

public expect fun WHvCreateVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, vpciresource: HANDLE, flags: WHV_CREATE_VPCI_DEVICE_FLAGS, notificationeventhandle: HANDLE): HRESULT

public expect fun WHvDeleteNotificationPort(partition: WHV_PARTITION_HANDLE, porthandle: Long): HRESULT

public expect fun WHvDeletePartition(partition: WHV_PARTITION_HANDLE): HRESULT

public expect fun WHvDeleteTrigger(partition: WHV_PARTITION_HANDLE, triggerhandle: Long): HRESULT

public expect fun WHvDeleteVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt): HRESULT

public expect fun WHvDeleteVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT

public expect fun WHvEmulatorCreateEmulator(callbacks: Long, emulator: Long): HRESULT

public expect fun WHvEmulatorDestroyEmulator(emulator: Long): HRESULT

public expect fun WHvEmulatorTryIoEmulation(emulator: Long, context: Long, vpcontext: Long, ioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT

public expect fun WHvEmulatorTryMmioEmulation(emulator: Long, context: Long, vpcontext: Long, mmioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT

public expect fun WHvGetCapability(capabilitycode: WHV_CAPABILITY_CODE, capabilitybuffer: Long, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT

public expect fun WHvGetInterruptTargetVpSet(partition: WHV_PARTITION_HANDLE, destination: ULong, destinationmode: WHV_INTERRUPT_DESTINATION_MODE, targetvps: Long, vpcount: UInt, targetvpcount: Long): HRESULT

public expect fun WHvGetPartitionCounters(partition: WHV_PARTITION_HANDLE, counterset: WHV_PARTITION_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT

public expect fun WHvGetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT

public expect fun WHvGetVirtualProcessorCounters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, counterset: WHV_PROCESSOR_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT

public expect fun WHvGetVirtualProcessorCpuidOutput(partition: WHV_PARTITION_HANDLE, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: Long): HRESULT

public expect fun WHvGetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT

public expect fun WHvGetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT

public expect fun WHvGetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT

public expect fun WHvGetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT

public expect fun WHvGetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT

public expect fun WHvGetVpciDeviceInterruptTarget(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: Long, targetsizeinbytes: UInt, byteswritten: Long): HRESULT

public expect fun WHvGetVpciDeviceNotification(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, notification: Long, notificationsizeinbytes: UInt): HRESULT

public expect fun WHvGetVpciDeviceProperty(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, propertycode: WHV_VPCI_DEVICE_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT

public expect fun WHvMapGpaRange(partition: WHV_PARTITION_HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT

public expect fun WHvMapGpaRange2(partition: WHV_PARTITION_HANDLE, process: HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT

public expect fun WHvMapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: Long, msiaddress: Long, msidata: Long): HRESULT

public expect fun WHvMapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, mappingcount: Long, mappings: Long): HRESULT

public expect fun WHvPostVirtualProcessorSynicMessage(partition: WHV_PARTITION_HANDLE, vpindex: UInt, sintindex: UInt, message: Long, messagesizeinbytes: UInt): HRESULT

public expect fun WHvQueryGpaRangeDirtyBitmap(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: Long, bitmapsizeinbytes: UInt): HRESULT

public expect fun WHvReadGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT

public expect fun WHvReadVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT

public expect fun WHvRegisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long, eventhandle: HANDLE): HRESULT

public expect fun WHvRequestInterrupt(partition: WHV_PARTITION_HANDLE, interrupt: Long, interruptcontrolsize: UInt): HRESULT

public expect fun WHvRequestVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): HRESULT

public expect fun WHvResetPartition(partition: WHV_PARTITION_HANDLE): HRESULT

public expect fun WHvResumePartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT

public expect fun WHvRetargetVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: Long): HRESULT

public expect fun WHvRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, exitcontext: Long, exitcontextsizeinbytes: UInt): HRESULT

public expect fun WHvSetNotificationPortProperty(partition: WHV_PARTITION_HANDLE, porthandle: Long, propertycode: WHV_NOTIFICATION_PORT_PROPERTY_CODE, propertyvalue: ULong): HRESULT

public expect fun WHvSetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt): HRESULT

public expect fun WHvSetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT

public expect fun WHvSetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT

public expect fun WHvSetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT

public expect fun WHvSetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt): HRESULT

public expect fun WHvSetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt): HRESULT

public expect fun WHvSetVpciDevicePowerState(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, powerstate: DEVICE_POWER_STATE): HRESULT

public expect fun WHvSetupPartition(partition: WHV_PARTITION_HANDLE): HRESULT

public expect fun WHvSignalVirtualProcessorSynicEvent(partition: WHV_PARTITION_HANDLE, synicevent: WHV_SYNIC_EVENT_PARAMETERS, newlysignaled: Long): HRESULT

public expect fun WHvStartPartitionMigration(partition: WHV_PARTITION_HANDLE, migrationhandle: Long): HRESULT

public expect fun WHvSuspendPartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT

public expect fun WHvTranslateGva(partition: WHV_PARTITION_HANDLE, vpindex: UInt, gva: ULong, translateflags: WHV_TRANSLATE_GVA_FLAGS, translationresult: Long, gpa: Long): HRESULT

public expect fun WHvUnmapGpaRange(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, sizeinbytes: ULong): HRESULT

public expect fun WHvUnmapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt): HRESULT

public expect fun WHvUnmapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT

public expect fun WHvUnregisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long): HRESULT

public expect fun WHvUpdateTriggerParameters(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long): HRESULT

public expect fun WHvWriteGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT

public expect fun WHvWriteVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT
