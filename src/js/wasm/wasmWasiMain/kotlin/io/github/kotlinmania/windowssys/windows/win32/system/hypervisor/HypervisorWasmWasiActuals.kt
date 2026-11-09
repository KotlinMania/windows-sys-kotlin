@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HCS_SYSTEM
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE

public actual fun ApplyGuestMemoryFix(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, fixbuffer: Long, fixbuffersize: UInt): HRESULT =
    0

public actual fun ApplyPendingSavedStateFileReplayLog(vmrsfile: PCWSTR): HRESULT =
    0

public actual fun CallStackUnwind(vmsavedstatedumphandle: Long, vpid: UInt, imageinfo: Long, imageinfocount: UInt, framecount: UInt, callstack: Long): HRESULT =
    0

public actual fun FindSavedStateSymbolFieldInType(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, fieldname: PCWSTR, offset: Long, found: Long): HRESULT =
    0

public actual fun ForceActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: UByte): HRESULT =
    0

public actual fun ForceArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: VIRTUAL_PROCESSOR_ARCH): HRESULT =
    0

public actual fun ForceNestedHostMode(vmsavedstatedumphandle: Long, vpid: UInt, hostmode: BOOL, oldmode: Long): HRESULT =
    0

public actual fun ForcePagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: PAGING_MODE): HRESULT =
    0

public actual fun GetActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: Long): HRESULT =
    0

public actual fun GetArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: Long): HRESULT =
    0

public actual fun GetEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevels: Long): HRESULT =
    0

public actual fun GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, virtualtrustlevels: Long): HRESULT =
    0

public actual fun GetGuestOsInfo(vmsavedstatedumphandle: Long, virtualtrustlevel: UByte, guestosinfo: Long): HRESULT =
    0

public actual fun GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle: Long, memorychunkpagesize: Long, memorychunks: Long, memorychunkcount: Long): HRESULT =
    0

public actual fun GetGuestRawSavedMemorySize(vmsavedstatedumphandle: Long, guestrawsavedmemorysize: Long): HRESULT =
    0

public actual fun GetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): HRESULT =
    0

public actual fun GetNestedVirtualizationMode(vmsavedstatedumphandle: Long, vpid: UInt, enabled: Long): HRESULT =
    0

public actual fun GetPagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: Long): HRESULT =
    0

public actual fun GetRegisterValue(vmsavedstatedumphandle: Long, vpid: UInt, registerid: UInt, registervalue: Long): HRESULT =
    0

public actual fun GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, typefieldinfomap: Long): HRESULT =
    0

public actual fun GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle: Long): HANDLE =
    0L

public actual fun GetSavedStateSymbolTypeSize(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, size: Long): HRESULT =
    0

public actual fun GetVpCount(vmsavedstatedumphandle: Long, vpcount: Long): HRESULT =
    0

public actual fun GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: Long, physicaladdress: ULong, rawsavedmemoryoffset: Long): HRESULT =
    0

public actual fun GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, physicaladdress: Long, unmappedregionsize: Long): HRESULT =
    0

public actual fun HdvCreateDeviceInstance(devicehosthandle: Long, devicetype: HDV_DEVICE_TYPE, deviceclassid: Long, deviceinstanceid: Long, deviceinterface: Long, devicecontext: Long, devicehandle: Long): HRESULT =
    0

public actual fun HdvCreateGuestMemoryAperture(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: BOOL, mappedaddress: Long): HRESULT =
    0

public actual fun HdvCreateSectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HDV_MMIO_MAPPING_FLAGS, sectionhandle: HANDLE, sectionoffsetinpages: ULong): HRESULT =
    0

public actual fun HdvDeliverGuestInterrupt(requestor: Long, msiaddress: ULong, msidata: UInt): HRESULT =
    0

public actual fun HdvDestroyGuestMemoryAperture(requestor: Long, mappedaddress: Long): HRESULT =
    0

public actual fun HdvDestroySectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong): HRESULT =
    0

public actual fun HdvInitializeDeviceHost(computesystem: HCS_SYSTEM, devicehosthandle: Long): HRESULT =
    0

public actual fun HdvInitializeDeviceHostEx(computesystem: HCS_SYSTEM, flags: HDV_DEVICE_HOST_FLAGS, devicehosthandle: Long): HRESULT =
    0

public actual fun HdvReadGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT =
    0

public actual fun HdvRegisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: HANDLE): HRESULT =
    0

public actual fun HdvTeardownDeviceHost(devicehosthandle: Long): HRESULT =
    0

public actual fun HdvUnregisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong): HRESULT =
    0

public actual fun HdvWriteGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT =
    0

public actual fun InKernelSpace(vmsavedstatedumphandle: Long, vpid: UInt, inkernelspace: Long): HRESULT =
    0

public actual fun IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: Long, vpid: UInt, activevirtualtrustlevelenabled: Long): HRESULT =
    0

public actual fun IsNestedVirtualizationEnabled(vmsavedstatedumphandle: Long, enabled: Long): HRESULT =
    0

public actual fun LoadSavedStateFile(vmrsfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT =
    0

public actual fun LoadSavedStateFiles(binfile: PCWSTR, vsvfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT =
    0

public actual fun LoadSavedStateModuleSymbols(vmsavedstatedumphandle: Long, imagename: PCSTR, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT =
    0

public actual fun LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: Long, imagename: PCSTR, imagetimestamp: UInt, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT =
    0

public actual fun LoadSavedStateSymbolProvider(vmsavedstatedumphandle: Long, usersymbols: PCWSTR, force: BOOL): HRESULT =
    0

public actual fun LocateSavedStateFiles(vmname: PCWSTR, snapshotname: PCWSTR, binpath: Long, vsvpath: Long, vmrspath: Long): HRESULT =
    0

public actual fun ReadGuestPhysicalAddress(vmsavedstatedumphandle: Long, physicaladdress: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT =
    0

public actual fun ReadGuestRawSavedMemory(vmsavedstatedumphandle: Long, rawsavedmemoryoffset: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT =
    0

public actual fun ReadSavedStateGlobalVariable(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, buffer: Long, buffersize: UInt): HRESULT =
    0

public actual fun ReleaseSavedStateFiles(vmsavedstatedumphandle: Long): HRESULT =
    0

public actual fun ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle: Long): HRESULT =
    0

public actual fun ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, virtualaddress: Long, size: Long): HRESULT =
    0

public actual fun ScanMemoryForDosImages(vmsavedstatedumphandle: Long, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: Long, foundimagecallback: FOUND_IMAGE_CALLBACK, standaloneaddress: Long, standaloneaddresscount: UInt): HRESULT =
    0

public actual fun SetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: ULong): HRESULT =
    0

public actual fun SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: Long, callback: GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK): HRESULT =
    0

public actual fun WHvAcceptPartitionMigration(migrationhandle: HANDLE, partition: Long): HRESULT =
    0

public actual fun WHvAdviseGpaRange(partition: WHV_PARTITION_HANDLE, gparanges: Long, gparangescount: UInt, advice: WHV_ADVISE_GPA_RANGE_CODE, advicebuffer: Long, advicebuffersizeinbytes: UInt): HRESULT =
    0

public actual fun WHvAllocateVpciResource(providerid: Long, flags: WHV_ALLOCATE_VPCI_RESOURCE_FLAGS, resourcedescriptor: Long, resourcedescriptorsizeinbytes: UInt, vpciresource: Long): HRESULT =
    0

public actual fun WHvCancelPartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT =
    0

public actual fun WHvCancelRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT =
    0

public actual fun WHvCompletePartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT =
    0

public actual fun WHvCreateNotificationPort(partition: WHV_PARTITION_HANDLE, parameters: Long, eventhandle: HANDLE, porthandle: Long): HRESULT =
    0

public actual fun WHvCreatePartition(partition: Long): HRESULT =
    0

public actual fun WHvCreateTrigger(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long, eventhandle: Long): HRESULT =
    0

public actual fun WHvCreateVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT =
    0

public actual fun WHvCreateVirtualProcessor2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, properties: Long, propertycount: UInt): HRESULT =
    0

public actual fun WHvCreateVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, vpciresource: HANDLE, flags: WHV_CREATE_VPCI_DEVICE_FLAGS, notificationeventhandle: HANDLE): HRESULT =
    0

public actual fun WHvDeleteNotificationPort(partition: WHV_PARTITION_HANDLE, porthandle: Long): HRESULT =
    0

public actual fun WHvDeletePartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    0

public actual fun WHvDeleteTrigger(partition: WHV_PARTITION_HANDLE, triggerhandle: Long): HRESULT =
    0

public actual fun WHvDeleteVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt): HRESULT =
    0

public actual fun WHvDeleteVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT =
    0

public actual fun WHvEmulatorCreateEmulator(callbacks: Long, emulator: Long): HRESULT =
    0

public actual fun WHvEmulatorDestroyEmulator(emulator: Long): HRESULT =
    0

public actual fun WHvEmulatorTryIoEmulation(emulator: Long, context: Long, vpcontext: Long, ioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT =
    0

public actual fun WHvEmulatorTryMmioEmulation(emulator: Long, context: Long, vpcontext: Long, mmioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT =
    0

public actual fun WHvGetCapability(capabilitycode: WHV_CAPABILITY_CODE, capabilitybuffer: Long, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    0

public actual fun WHvGetInterruptTargetVpSet(partition: WHV_PARTITION_HANDLE, destination: ULong, destinationmode: WHV_INTERRUPT_DESTINATION_MODE, targetvps: Long, vpcount: UInt, targetvpcount: Long): HRESULT =
    0

public actual fun WHvGetPartitionCounters(partition: WHV_PARTITION_HANDLE, counterset: WHV_PARTITION_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    0

public actual fun WHvGetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    0

public actual fun WHvGetVirtualProcessorCounters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, counterset: WHV_PROCESSOR_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    0

public actual fun WHvGetVirtualProcessorCpuidOutput(partition: WHV_PARTITION_HANDLE, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: Long): HRESULT =
    0

public actual fun WHvGetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT =
    0

public actual fun WHvGetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT =
    0

public actual fun WHvGetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT =
    0

public actual fun WHvGetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    0

public actual fun WHvGetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    0

public actual fun WHvGetVpciDeviceInterruptTarget(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: Long, targetsizeinbytes: UInt, byteswritten: Long): HRESULT =
    0

public actual fun WHvGetVpciDeviceNotification(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, notification: Long, notificationsizeinbytes: UInt): HRESULT =
    0

public actual fun WHvGetVpciDeviceProperty(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, propertycode: WHV_VPCI_DEVICE_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    0

public actual fun WHvMapGpaRange(partition: WHV_PARTITION_HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT =
    0

public actual fun WHvMapGpaRange2(partition: WHV_PARTITION_HANDLE, process: HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT =
    0

public actual fun WHvMapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: Long, msiaddress: Long, msidata: Long): HRESULT =
    0

public actual fun WHvMapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, mappingcount: Long, mappings: Long): HRESULT =
    0

public actual fun WHvPostVirtualProcessorSynicMessage(partition: WHV_PARTITION_HANDLE, vpindex: UInt, sintindex: UInt, message: Long, messagesizeinbytes: UInt): HRESULT =
    0

public actual fun WHvQueryGpaRangeDirtyBitmap(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: Long, bitmapsizeinbytes: UInt): HRESULT =
    0

public actual fun WHvReadGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT =
    0

public actual fun WHvReadVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT =
    0

public actual fun WHvRegisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long, eventhandle: HANDLE): HRESULT =
    0

public actual fun WHvRequestInterrupt(partition: WHV_PARTITION_HANDLE, interrupt: Long, interruptcontrolsize: UInt): HRESULT =
    0

public actual fun WHvRequestVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): HRESULT =
    0

public actual fun WHvResetPartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    0

public actual fun WHvResumePartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT =
    0

public actual fun WHvRetargetVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: Long): HRESULT =
    0

public actual fun WHvRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, exitcontext: Long, exitcontextsizeinbytes: UInt): HRESULT =
    0

public actual fun WHvSetNotificationPortProperty(partition: WHV_PARTITION_HANDLE, porthandle: Long, propertycode: WHV_NOTIFICATION_PORT_PROPERTY_CODE, propertyvalue: ULong): HRESULT =
    0

public actual fun WHvSetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt): HRESULT =
    0

public actual fun WHvSetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT =
    0

public actual fun WHvSetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT =
    0

public actual fun WHvSetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT =
    0

public actual fun WHvSetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt): HRESULT =
    0

public actual fun WHvSetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt): HRESULT =
    0

public actual fun WHvSetVpciDevicePowerState(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, powerstate: DEVICE_POWER_STATE): HRESULT =
    0

public actual fun WHvSetupPartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    0

public actual fun WHvSignalVirtualProcessorSynicEvent(partition: WHV_PARTITION_HANDLE, synicevent: WHV_SYNIC_EVENT_PARAMETERS, newlysignaled: Long): HRESULT =
    0

public actual fun WHvStartPartitionMigration(partition: WHV_PARTITION_HANDLE, migrationhandle: Long): HRESULT =
    0

public actual fun WHvSuspendPartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT =
    0

public actual fun WHvTranslateGva(partition: WHV_PARTITION_HANDLE, vpindex: UInt, gva: ULong, translateflags: WHV_TRANSLATE_GVA_FLAGS, translationresult: Long, gpa: Long): HRESULT =
    0

public actual fun WHvUnmapGpaRange(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, sizeinbytes: ULong): HRESULT =
    0

public actual fun WHvUnmapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt): HRESULT =
    0

public actual fun WHvUnmapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT =
    0

public actual fun WHvUnregisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long): HRESULT =
    0

public actual fun WHvUpdateTriggerParameters(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long): HRESULT =
    0

public actual fun WHvWriteGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT =
    0

public actual fun WHvWriteVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT =
    0
