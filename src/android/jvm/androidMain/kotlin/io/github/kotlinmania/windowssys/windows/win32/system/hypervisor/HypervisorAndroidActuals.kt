@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HCS_SYSTEM
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE

private object WindowsWin32SystemHypervisorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ApplyGuestMemoryFix(vmsavedstatedumphandle: Long, vpid: Int, virtualaddress: Long, fixbuffer: Long, fixbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ApplyPendingSavedStateFileReplayLog(vmrsfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_CallStackUnwind(vmsavedstatedumphandle: Long, vpid: Int, imageinfo: Long, imageinfocount: Int, framecount: Int, callstack: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_FindSavedStateSymbolFieldInType(vmsavedstatedumphandle: Long, vpid: Int, typename: Long, fieldname: Long, offset: Long, found: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ForceActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: Int, virtualtrustlevel: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ForceArchitecture(vmsavedstatedumphandle: Long, vpid: Int, architecture: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ForceNestedHostMode(vmsavedstatedumphandle: Long, vpid: Int, hostmode: Int, oldmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ForcePagingMode(vmsavedstatedumphandle: Long, vpid: Int, pagingmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: Int, virtualtrustlevel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetArchitecture(vmsavedstatedumphandle: Long, vpid: Int, architecture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, vpid: Int, virtualtrustlevels: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, virtualtrustlevels: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetGuestOsInfo(vmsavedstatedumphandle: Long, virtualtrustlevel: Byte, guestosinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle: Long, memorychunkpagesize: Long, memorychunks: Long, memorychunkcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetGuestRawSavedMemorySize(vmsavedstatedumphandle: Long, guestrawsavedmemorysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetNestedVirtualizationMode(vmsavedstatedumphandle: Long, vpid: Int, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetPagingMode(vmsavedstatedumphandle: Long, vpid: Int, pagingmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetRegisterValue(vmsavedstatedumphandle: Long, vpid: Int, registerid: Int, registervalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle: Long, vpid: Int, typename: Long, typefieldinfomap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolTypeSize(vmsavedstatedumphandle: Long, vpid: Int, typename: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GetVpCount(vmsavedstatedumphandle: Long, vpcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: Long, physicaladdress: Long, rawsavedmemoryoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: Long, vpid: Int, virtualaddress: Long, physicaladdress: Long, unmappedregionsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvCreateDeviceInstance(devicehosthandle: Long, devicetype: Int, deviceclassid: Long, deviceinstanceid: Long, deviceinterface: Long, devicecontext: Long, devicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvCreateGuestMemoryAperture(requestor: Long, guestphysicaladdress: Long, bytecount: Int, writeprotected: Int, mappedaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvCreateSectionBackedMmioRange(requestor: Long, barindex: Int, offsetinpages: Long, lengthinpages: Long, mappingflags: Int, sectionhandle: Long, sectionoffsetinpages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvDeliverGuestInterrupt(requestor: Long, msiaddress: Long, msidata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvDestroyGuestMemoryAperture(requestor: Long, mappedaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvDestroySectionBackedMmioRange(requestor: Long, barindex: Int, offsetinpages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHost(computesystem: Long, devicehosthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHostEx(computesystem: Long, flags: Int, devicehosthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvReadGuestMemory(requestor: Long, guestphysicaladdress: Long, bytecount: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvRegisterDoorbell(requestor: Long, barindex: Int, baroffset: Long, triggervalue: Long, flags: Long, doorbellevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvTeardownDeviceHost(devicehosthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvUnregisterDoorbell(requestor: Long, barindex: Int, baroffset: Long, triggervalue: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_HdvWriteGuestMemory(requestor: Long, guestphysicaladdress: Long, bytecount: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_InKernelSpace(vmsavedstatedumphandle: Long, vpid: Int, inkernelspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: Long, vpid: Int, activevirtualtrustlevelenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_IsNestedVirtualizationEnabled(vmsavedstatedumphandle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_LoadSavedStateFile(vmrsfile: Long, vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_LoadSavedStateFiles(binfile: Long, vsvfile: Long, vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbols(vmsavedstatedumphandle: Long, imagename: Long, modulename: Long, baseaddress: Long, sizeofbase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: Long, imagename: Long, imagetimestamp: Int, modulename: Long, baseaddress: Long, sizeofbase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_LoadSavedStateSymbolProvider(vmsavedstatedumphandle: Long, usersymbols: Long, force: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_LocateSavedStateFiles(vmname: Long, snapshotname: Long, binpath: Long, vsvpath: Long, vmrspath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ReadGuestPhysicalAddress(vmsavedstatedumphandle: Long, physicaladdress: Long, buffer: Long, buffersize: Int, bytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ReadGuestRawSavedMemory(vmsavedstatedumphandle: Long, rawsavedmemoryoffset: Long, buffer: Long, buffersize: Int, bytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ReadSavedStateGlobalVariable(vmsavedstatedumphandle: Long, vpid: Int, globalname: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ReleaseSavedStateFiles(vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: Long, vpid: Int, globalname: Long, virtualaddress: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_ScanMemoryForDosImages(vmsavedstatedumphandle: Long, vpid: Int, startaddress: Long, endaddress: Long, callbackcontext: Long, foundimagecallback: Long, standaloneaddress: Long, standaloneaddresscount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_SetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvAcceptPartitionMigration(migrationhandle: Long, partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvAdviseGpaRange(partition: Long, gparanges: Long, gparangescount: Int, advice: Int, advicebuffer: Long, advicebuffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvAllocateVpciResource(providerid: Long, flags: Int, resourcedescriptor: Long, resourcedescriptorsizeinbytes: Int, vpciresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvCancelPartitionMigration(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvCancelRunVirtualProcessor(partition: Long, vpindex: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvCompletePartitionMigration(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvCreateNotificationPort(partition: Long, parameters: Long, eventhandle: Long, porthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvCreatePartition(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvCreateTrigger(partition: Long, parameters: Long, triggerhandle: Long, eventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor(partition: Long, vpindex: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor2(partition: Long, vpindex: Int, properties: Long, propertycount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvCreateVpciDevice(partition: Long, logicaldeviceid: Long, vpciresource: Long, flags: Int, notificationeventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvDeleteNotificationPort(partition: Long, porthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvDeletePartition(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvDeleteTrigger(partition: Long, triggerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvDeleteVirtualProcessor(partition: Long, vpindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvDeleteVpciDevice(partition: Long, logicaldeviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvEmulatorCreateEmulator(callbacks: Long, emulator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvEmulatorDestroyEmulator(emulator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvEmulatorTryIoEmulation(emulator: Long, context: Long, vpcontext: Long, ioinstructioncontext: Long, emulatorreturnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvEmulatorTryMmioEmulation(emulator: Long, context: Long, vpcontext: Long, mmioinstructioncontext: Long, emulatorreturnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetCapability(capabilitycode: Int, capabilitybuffer: Long, capabilitybuffersizeinbytes: Int, writtensizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetInterruptTargetVpSet(partition: Long, destination: Long, destinationmode: Int, targetvps: Long, vpcount: Int, targetvpcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetPartitionCounters(partition: Long, counterset: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetPartitionProperty(partition: Long, propertycode: Int, propertybuffer: Long, propertybuffersizeinbytes: Int, writtensizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCounters(partition: Long, vpindex: Int, counterset: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCpuidOutput(partition: Long, vpindex: Int, eax: Int, ecx: Int, cpuidoutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState(partition: Long, vpindex: Int, state: Long, statesize: Int, writtensize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState2(partition: Long, vpindex: Int, state: Long, statesize: Int, writtensize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorRegisters(partition: Long, vpindex: Int, registernames: Long, registercount: Int, registervalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorState(partition: Long, vpindex: Int, statetype: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorXsaveState(partition: Long, vpindex: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceInterruptTarget(partition: Long, logicaldeviceid: Long, index: Int, multimessagenumber: Int, target: Long, targetsizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceNotification(partition: Long, logicaldeviceid: Long, notification: Long, notificationsizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceProperty(partition: Long, logicaldeviceid: Long, propertycode: Int, propertybuffer: Long, propertybuffersizeinbytes: Int, writtensizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvMapGpaRange(partition: Long, sourceaddress: Long, guestaddress: Long, sizeinbytes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvMapGpaRange2(partition: Long, process: Long, sourceaddress: Long, guestaddress: Long, sizeinbytes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, index: Int, messagecount: Int, target: Long, msiaddress: Long, msidata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceMmioRanges(partition: Long, logicaldeviceid: Long, mappingcount: Long, mappings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvPostVirtualProcessorSynicMessage(partition: Long, vpindex: Int, sintindex: Int, message: Long, messagesizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvQueryGpaRangeDirtyBitmap(partition: Long, guestaddress: Long, rangesizeinbytes: Long, bitmap: Long, bitmapsizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvReadVpciDeviceRegister(partition: Long, logicaldeviceid: Long, register: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvRegisterPartitionDoorbellEvent(partition: Long, matchdata: Long, eventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvRequestInterrupt(partition: Long, interrupt: Long, interruptcontrolsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvRequestVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, msiaddress: Long, msidata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvResetPartition(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvResumePartitionTime(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvRetargetVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, msiaddress: Long, msidata: Int, target: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvRunVirtualProcessor(partition: Long, vpindex: Int, exitcontext: Long, exitcontextsizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSetNotificationPortProperty(partition: Long, porthandle: Long, propertycode: Int, propertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSetPartitionProperty(partition: Long, propertycode: Int, propertybuffer: Long, propertybuffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState(partition: Long, vpindex: Int, state: Long, statesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState2(partition: Long, vpindex: Int, state: Long, statesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorRegisters(partition: Long, vpindex: Int, registernames: Long, registercount: Int, registervalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorState(partition: Long, vpindex: Int, statetype: Int, buffer: Long, buffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorXsaveState(partition: Long, vpindex: Int, buffer: Long, buffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSetVpciDevicePowerState(partition: Long, logicaldeviceid: Long, powerstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSetupPartition(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvStartPartitionMigration(partition: Long, migrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvSuspendPartitionTime(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvTranslateGva(partition: Long, vpindex: Int, gva: Long, translateflags: Int, translationresult: Long, gpa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvUnmapGpaRange(partition: Long, guestaddress: Long, sizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceMmioRanges(partition: Long, logicaldeviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvUnregisterPartitionDoorbellEvent(partition: Long, matchdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvUpdateTriggerParameters(partition: Long, parameters: Long, triggerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_WHvWriteVpciDeviceRegister(partition: Long, logicaldeviceid: Long, register: Long, data: Long): Int
}

public actual fun ApplyGuestMemoryFix(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, fixbuffer: Long, fixbuffersize: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ApplyGuestMemoryFix(vmsavedstatedumphandle, vpid.toInt(), virtualaddress.toLong(), fixbuffer, fixbuffersize.toInt())

public actual fun ApplyPendingSavedStateFileReplayLog(vmrsfile: PCWSTR): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ApplyPendingSavedStateFileReplayLog(vmrsfile)

public actual fun CallStackUnwind(vmsavedstatedumphandle: Long, vpid: UInt, imageinfo: Long, imageinfocount: UInt, framecount: UInt, callstack: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_CallStackUnwind(vmsavedstatedumphandle, vpid.toInt(), imageinfo, imageinfocount.toInt(), framecount.toInt(), callstack)

public actual fun FindSavedStateSymbolFieldInType(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, fieldname: PCWSTR, offset: Long, found: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_FindSavedStateSymbolFieldInType(vmsavedstatedumphandle, vpid.toInt(), typename, fieldname, offset, found)

public actual fun ForceActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: UByte): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ForceActiveVirtualTrustLevel(vmsavedstatedumphandle, vpid.toInt(), virtualtrustlevel.toByte())

public actual fun ForceArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: VIRTUAL_PROCESSOR_ARCH): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ForceArchitecture(vmsavedstatedumphandle, vpid.toInt(), architecture)

public actual fun ForceNestedHostMode(vmsavedstatedumphandle: Long, vpid: UInt, hostmode: BOOL, oldmode: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ForceNestedHostMode(vmsavedstatedumphandle, vpid.toInt(), hostmode, oldmode)

public actual fun ForcePagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: PAGING_MODE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ForcePagingMode(vmsavedstatedumphandle, vpid.toInt(), pagingmode)

public actual fun GetActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevel: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetActiveVirtualTrustLevel(vmsavedstatedumphandle, vpid.toInt(), virtualtrustlevel)

public actual fun GetArchitecture(vmsavedstatedumphandle: Long, vpid: UInt, architecture: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetArchitecture(vmsavedstatedumphandle, vpid.toInt(), architecture)

public actual fun GetEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, vpid: UInt, virtualtrustlevels: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetEnabledVirtualTrustLevels(vmsavedstatedumphandle, vpid.toInt(), virtualtrustlevels)

public actual fun GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, virtualtrustlevels: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle, virtualtrustlevels)

public actual fun GetGuestOsInfo(vmsavedstatedumphandle: Long, virtualtrustlevel: UByte, guestosinfo: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetGuestOsInfo(vmsavedstatedumphandle, virtualtrustlevel.toByte(), guestosinfo)

public actual fun GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle: Long, memorychunkpagesize: Long, memorychunks: Long, memorychunkcount: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetGuestPhysicalMemoryChunks(vmsavedstatedumphandle, memorychunkpagesize, memorychunks, memorychunkcount)

public actual fun GetGuestRawSavedMemorySize(vmsavedstatedumphandle: Long, guestrawsavedmemorysize: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetGuestRawSavedMemorySize(vmsavedstatedumphandle, guestrawsavedmemorysize)

public actual fun GetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetMemoryBlockCacheLimit(vmsavedstatedumphandle, memoryblockcachelimit)

public actual fun GetNestedVirtualizationMode(vmsavedstatedumphandle: Long, vpid: UInt, enabled: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetNestedVirtualizationMode(vmsavedstatedumphandle, vpid.toInt(), enabled)

public actual fun GetPagingMode(vmsavedstatedumphandle: Long, vpid: UInt, pagingmode: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetPagingMode(vmsavedstatedumphandle, vpid.toInt(), pagingmode)

public actual fun GetRegisterValue(vmsavedstatedumphandle: Long, vpid: UInt, registerid: UInt, registervalue: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetRegisterValue(vmsavedstatedumphandle, vpid.toInt(), registerid.toInt(), registervalue)

public actual fun GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, typefieldinfomap: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolFieldInfo(vmsavedstatedumphandle, vpid.toInt(), typename, typefieldinfomap)

public actual fun GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle: Long): HANDLE =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolProviderHandle(vmsavedstatedumphandle)

public actual fun GetSavedStateSymbolTypeSize(vmsavedstatedumphandle: Long, vpid: UInt, typename: PCSTR, size: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetSavedStateSymbolTypeSize(vmsavedstatedumphandle, vpid.toInt(), typename, size)

public actual fun GetVpCount(vmsavedstatedumphandle: Long, vpcount: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GetVpCount(vmsavedstatedumphandle, vpcount)

public actual fun GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: Long, physicaladdress: ULong, rawsavedmemoryoffset: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle, physicaladdress.toLong(), rawsavedmemoryoffset)

public actual fun GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: Long, vpid: UInt, virtualaddress: ULong, physicaladdress: Long, unmappedregionsize: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_GuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle, vpid.toInt(), virtualaddress.toLong(), physicaladdress, unmappedregionsize)

public actual fun HdvCreateDeviceInstance(devicehosthandle: Long, devicetype: HDV_DEVICE_TYPE, deviceclassid: Long, deviceinstanceid: Long, deviceinterface: Long, devicecontext: Long, devicehandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvCreateDeviceInstance(devicehosthandle, devicetype, deviceclassid, deviceinstanceid, deviceinterface, devicecontext, devicehandle)

public actual fun HdvCreateGuestMemoryAperture(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: BOOL, mappedaddress: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvCreateGuestMemoryAperture(requestor, guestphysicaladdress.toLong(), bytecount.toInt(), writeprotected, mappedaddress)

public actual fun HdvCreateSectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HDV_MMIO_MAPPING_FLAGS, sectionhandle: HANDLE, sectionoffsetinpages: ULong): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvCreateSectionBackedMmioRange(requestor, barindex, offsetinpages.toLong(), lengthinpages.toLong(), mappingflags, sectionhandle, sectionoffsetinpages.toLong())

public actual fun HdvDeliverGuestInterrupt(requestor: Long, msiaddress: ULong, msidata: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvDeliverGuestInterrupt(requestor, msiaddress.toLong(), msidata.toInt())

public actual fun HdvDestroyGuestMemoryAperture(requestor: Long, mappedaddress: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvDestroyGuestMemoryAperture(requestor, mappedaddress)

public actual fun HdvDestroySectionBackedMmioRange(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, offsetinpages: ULong): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvDestroySectionBackedMmioRange(requestor, barindex, offsetinpages.toLong())

public actual fun HdvInitializeDeviceHost(computesystem: HCS_SYSTEM, devicehosthandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHost(computesystem, devicehosthandle)

public actual fun HdvInitializeDeviceHostEx(computesystem: HCS_SYSTEM, flags: HDV_DEVICE_HOST_FLAGS, devicehosthandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvInitializeDeviceHostEx(computesystem, flags, devicehosthandle)

public actual fun HdvReadGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvReadGuestMemory(requestor, guestphysicaladdress.toLong(), bytecount.toInt(), buffer)

public actual fun HdvRegisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvRegisterDoorbell(requestor, barindex, baroffset.toLong(), triggervalue.toLong(), flags.toLong(), doorbellevent)

public actual fun HdvTeardownDeviceHost(devicehosthandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvTeardownDeviceHost(devicehosthandle)

public actual fun HdvUnregisterDoorbell(requestor: Long, barindex: HDV_PCI_BAR_SELECTOR, baroffset: ULong, triggervalue: ULong, flags: ULong): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvUnregisterDoorbell(requestor, barindex, baroffset.toLong(), triggervalue.toLong(), flags.toLong())

public actual fun HdvWriteGuestMemory(requestor: Long, guestphysicaladdress: ULong, bytecount: UInt, buffer: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_HdvWriteGuestMemory(requestor, guestphysicaladdress.toLong(), bytecount.toInt(), buffer)

public actual fun InKernelSpace(vmsavedstatedumphandle: Long, vpid: UInt, inkernelspace: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_InKernelSpace(vmsavedstatedumphandle, vpid.toInt(), inkernelspace)

public actual fun IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: Long, vpid: UInt, activevirtualtrustlevelenabled: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_IsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle, vpid.toInt(), activevirtualtrustlevelenabled)

public actual fun IsNestedVirtualizationEnabled(vmsavedstatedumphandle: Long, enabled: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_IsNestedVirtualizationEnabled(vmsavedstatedumphandle, enabled)

public actual fun LoadSavedStateFile(vmrsfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_LoadSavedStateFile(vmrsfile, vmsavedstatedumphandle)

public actual fun LoadSavedStateFiles(binfile: PCWSTR, vsvfile: PCWSTR, vmsavedstatedumphandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_LoadSavedStateFiles(binfile, vsvfile, vmsavedstatedumphandle)

public actual fun LoadSavedStateModuleSymbols(vmsavedstatedumphandle: Long, imagename: PCSTR, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbols(vmsavedstatedumphandle, imagename, modulename, baseaddress.toLong(), sizeofbase.toInt())

public actual fun LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: Long, imagename: PCSTR, imagetimestamp: UInt, modulename: PCSTR, baseaddress: ULong, sizeofbase: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_LoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle, imagename, imagetimestamp.toInt(), modulename, baseaddress.toLong(), sizeofbase.toInt())

public actual fun LoadSavedStateSymbolProvider(vmsavedstatedumphandle: Long, usersymbols: PCWSTR, force: BOOL): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_LoadSavedStateSymbolProvider(vmsavedstatedumphandle, usersymbols, force)

public actual fun LocateSavedStateFiles(vmname: PCWSTR, snapshotname: PCWSTR, binpath: Long, vsvpath: Long, vmrspath: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_LocateSavedStateFiles(vmname, snapshotname, binpath, vsvpath, vmrspath)

public actual fun ReadGuestPhysicalAddress(vmsavedstatedumphandle: Long, physicaladdress: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ReadGuestPhysicalAddress(vmsavedstatedumphandle, physicaladdress.toLong(), buffer, buffersize.toInt(), bytesread)

public actual fun ReadGuestRawSavedMemory(vmsavedstatedumphandle: Long, rawsavedmemoryoffset: ULong, buffer: Long, buffersize: UInt, bytesread: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ReadGuestRawSavedMemory(vmsavedstatedumphandle, rawsavedmemoryoffset.toLong(), buffer, buffersize.toInt(), bytesread)

public actual fun ReadSavedStateGlobalVariable(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, buffer: Long, buffersize: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ReadSavedStateGlobalVariable(vmsavedstatedumphandle, vpid.toInt(), globalname, buffer, buffersize.toInt())

public actual fun ReleaseSavedStateFiles(vmsavedstatedumphandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ReleaseSavedStateFiles(vmsavedstatedumphandle)

public actual fun ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ReleaseSavedStateSymbolProvider(vmsavedstatedumphandle)

public actual fun ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: Long, vpid: UInt, globalname: PCSTR, virtualaddress: Long, size: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle, vpid.toInt(), globalname, virtualaddress, size)

public actual fun ScanMemoryForDosImages(vmsavedstatedumphandle: Long, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: Long, foundimagecallback: FOUND_IMAGE_CALLBACK, standaloneaddress: Long, standaloneaddresscount: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_ScanMemoryForDosImages(vmsavedstatedumphandle, vpid.toInt(), startaddress.toLong(), endaddress.toLong(), callbackcontext, foundimagecallback.toLong(), standaloneaddress, standaloneaddresscount.toInt())

public actual fun SetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: ULong): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_SetMemoryBlockCacheLimit(vmsavedstatedumphandle, memoryblockcachelimit.toLong())

public actual fun SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: Long, callback: GUEST_SYMBOLS_PROVIDER_DEBUG_INFO_CALLBACK): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_SetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle, callback.toLong())

public actual fun WHvAcceptPartitionMigration(migrationhandle: HANDLE, partition: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvAcceptPartitionMigration(migrationhandle, partition)

public actual fun WHvAdviseGpaRange(partition: WHV_PARTITION_HANDLE, gparanges: Long, gparangescount: UInt, advice: WHV_ADVISE_GPA_RANGE_CODE, advicebuffer: Long, advicebuffersizeinbytes: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvAdviseGpaRange(partition, gparanges, gparangescount.toInt(), advice, advicebuffer, advicebuffersizeinbytes.toInt())

public actual fun WHvAllocateVpciResource(providerid: Long, flags: WHV_ALLOCATE_VPCI_RESOURCE_FLAGS, resourcedescriptor: Long, resourcedescriptorsizeinbytes: UInt, vpciresource: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvAllocateVpciResource(providerid, flags, resourcedescriptor, resourcedescriptorsizeinbytes.toInt(), vpciresource)

public actual fun WHvCancelPartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvCancelPartitionMigration(partition)

public actual fun WHvCancelRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvCancelRunVirtualProcessor(partition, vpindex.toInt(), flags.toInt())

public actual fun WHvCompletePartitionMigration(partition: WHV_PARTITION_HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvCompletePartitionMigration(partition)

public actual fun WHvCreateNotificationPort(partition: WHV_PARTITION_HANDLE, parameters: Long, eventhandle: HANDLE, porthandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvCreateNotificationPort(partition, parameters, eventhandle, porthandle)

public actual fun WHvCreatePartition(partition: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvCreatePartition(partition)

public actual fun WHvCreateTrigger(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long, eventhandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvCreateTrigger(partition, parameters, triggerhandle, eventhandle)

public actual fun WHvCreateVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, flags: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor(partition, vpindex.toInt(), flags.toInt())

public actual fun WHvCreateVirtualProcessor2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, properties: Long, propertycount: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvCreateVirtualProcessor2(partition, vpindex.toInt(), properties, propertycount.toInt())

public actual fun WHvCreateVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, vpciresource: HANDLE, flags: WHV_CREATE_VPCI_DEVICE_FLAGS, notificationeventhandle: HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvCreateVpciDevice(partition, logicaldeviceid.toLong(), vpciresource, flags, notificationeventhandle)

public actual fun WHvDeleteNotificationPort(partition: WHV_PARTITION_HANDLE, porthandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvDeleteNotificationPort(partition, porthandle)

public actual fun WHvDeletePartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvDeletePartition(partition)

public actual fun WHvDeleteTrigger(partition: WHV_PARTITION_HANDLE, triggerhandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvDeleteTrigger(partition, triggerhandle)

public actual fun WHvDeleteVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvDeleteVirtualProcessor(partition, vpindex.toInt())

public actual fun WHvDeleteVpciDevice(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvDeleteVpciDevice(partition, logicaldeviceid.toLong())

public actual fun WHvEmulatorCreateEmulator(callbacks: Long, emulator: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvEmulatorCreateEmulator(callbacks, emulator)

public actual fun WHvEmulatorDestroyEmulator(emulator: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvEmulatorDestroyEmulator(emulator)

public actual fun WHvEmulatorTryIoEmulation(emulator: Long, context: Long, vpcontext: Long, ioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvEmulatorTryIoEmulation(emulator, context, vpcontext, ioinstructioncontext, emulatorreturnstatus)

public actual fun WHvEmulatorTryMmioEmulation(emulator: Long, context: Long, vpcontext: Long, mmioinstructioncontext: Long, emulatorreturnstatus: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvEmulatorTryMmioEmulation(emulator, context, vpcontext, mmioinstructioncontext, emulatorreturnstatus)

public actual fun WHvGetCapability(capabilitycode: WHV_CAPABILITY_CODE, capabilitybuffer: Long, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetCapability(capabilitycode, capabilitybuffer, capabilitybuffersizeinbytes.toInt(), writtensizeinbytes)

public actual fun WHvGetInterruptTargetVpSet(partition: WHV_PARTITION_HANDLE, destination: ULong, destinationmode: WHV_INTERRUPT_DESTINATION_MODE, targetvps: Long, vpcount: UInt, targetvpcount: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetInterruptTargetVpSet(partition, destination.toLong(), destinationmode, targetvps, vpcount.toInt(), targetvpcount)

public actual fun WHvGetPartitionCounters(partition: WHV_PARTITION_HANDLE, counterset: WHV_PARTITION_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetPartitionCounters(partition, counterset, buffer, buffersizeinbytes.toInt(), byteswritten)

public actual fun WHvGetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetPartitionProperty(partition, propertycode, propertybuffer, propertybuffersizeinbytes.toInt(), writtensizeinbytes)

public actual fun WHvGetVirtualProcessorCounters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, counterset: WHV_PROCESSOR_COUNTER_SET, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCounters(partition, vpindex.toInt(), counterset, buffer, buffersizeinbytes.toInt(), byteswritten)

public actual fun WHvGetVirtualProcessorCpuidOutput(partition: WHV_PARTITION_HANDLE, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorCpuidOutput(partition, vpindex.toInt(), eax.toInt(), ecx.toInt(), cpuidoutput)

public actual fun WHvGetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState(partition, vpindex.toInt(), state, statesize.toInt(), writtensize)

public actual fun WHvGetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt, writtensize: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorInterruptControllerState2(partition, vpindex.toInt(), state, statesize.toInt(), writtensize)

public actual fun WHvGetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorRegisters(partition, vpindex.toInt(), registernames, registercount.toInt(), registervalues)

public actual fun WHvGetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorState(partition, vpindex.toInt(), statetype, buffer, buffersizeinbytes.toInt(), byteswritten)

public actual fun WHvGetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt, byteswritten: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVirtualProcessorXsaveState(partition, vpindex.toInt(), buffer, buffersizeinbytes.toInt(), byteswritten)

public actual fun WHvGetVpciDeviceInterruptTarget(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: Long, targetsizeinbytes: UInt, byteswritten: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceInterruptTarget(partition, logicaldeviceid.toLong(), index.toInt(), multimessagenumber.toInt(), target, targetsizeinbytes.toInt(), byteswritten)

public actual fun WHvGetVpciDeviceNotification(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, notification: Long, notificationsizeinbytes: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceNotification(partition, logicaldeviceid.toLong(), notification, notificationsizeinbytes.toInt())

public actual fun WHvGetVpciDeviceProperty(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, propertycode: WHV_VPCI_DEVICE_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt, writtensizeinbytes: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvGetVpciDeviceProperty(partition, logicaldeviceid.toLong(), propertycode, propertybuffer, propertybuffersizeinbytes.toInt(), writtensizeinbytes)

public actual fun WHvMapGpaRange(partition: WHV_PARTITION_HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvMapGpaRange(partition, sourceaddress, guestaddress.toLong(), sizeinbytes.toLong(), flags)

public actual fun WHvMapGpaRange2(partition: WHV_PARTITION_HANDLE, process: HANDLE, sourceaddress: Long, guestaddress: ULong, sizeinbytes: ULong, flags: WHV_MAP_GPA_RANGE_FLAGS): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvMapGpaRange2(partition, process, sourceaddress, guestaddress.toLong(), sizeinbytes.toLong(), flags)

public actual fun WHvMapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: Long, msiaddress: Long, msidata: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), index.toInt(), messagecount.toInt(), target, msiaddress, msidata)

public actual fun WHvMapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, mappingcount: Long, mappings: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvMapVpciDeviceMmioRanges(partition, logicaldeviceid.toLong(), mappingcount, mappings)

public actual fun WHvPostVirtualProcessorSynicMessage(partition: WHV_PARTITION_HANDLE, vpindex: UInt, sintindex: UInt, message: Long, messagesizeinbytes: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvPostVirtualProcessorSynicMessage(partition, vpindex.toInt(), sintindex.toInt(), message, messagesizeinbytes.toInt())

public actual fun WHvQueryGpaRangeDirtyBitmap(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: Long, bitmapsizeinbytes: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvQueryGpaRangeDirtyBitmap(partition, guestaddress.toLong(), rangesizeinbytes.toLong(), bitmap, bitmapsizeinbytes.toInt())

public actual fun WHvReadGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT =
    0

public actual fun WHvReadVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvReadVpciDeviceRegister(partition, logicaldeviceid.toLong(), register, data)

public actual fun WHvRegisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long, eventhandle: HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvRegisterPartitionDoorbellEvent(partition, matchdata, eventhandle)

public actual fun WHvRequestInterrupt(partition: WHV_PARTITION_HANDLE, interrupt: Long, interruptcontrolsize: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvRequestInterrupt(partition, interrupt, interruptcontrolsize.toInt())

public actual fun WHvRequestVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvRequestVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), msiaddress.toLong(), msidata.toInt())

public actual fun WHvResetPartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvResetPartition(partition)

public actual fun WHvResumePartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvResumePartitionTime(partition)

public actual fun WHvRetargetVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvRetargetVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), msiaddress.toLong(), msidata.toInt(), target)

public actual fun WHvRunVirtualProcessor(partition: WHV_PARTITION_HANDLE, vpindex: UInt, exitcontext: Long, exitcontextsizeinbytes: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvRunVirtualProcessor(partition, vpindex.toInt(), exitcontext, exitcontextsizeinbytes.toInt())

public actual fun WHvSetNotificationPortProperty(partition: WHV_PARTITION_HANDLE, porthandle: Long, propertycode: WHV_NOTIFICATION_PORT_PROPERTY_CODE, propertyvalue: ULong): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSetNotificationPortProperty(partition, porthandle, propertycode, propertyvalue.toLong())

public actual fun WHvSetPartitionProperty(partition: WHV_PARTITION_HANDLE, propertycode: WHV_PARTITION_PROPERTY_CODE, propertybuffer: Long, propertybuffersizeinbytes: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSetPartitionProperty(partition, propertycode, propertybuffer, propertybuffersizeinbytes.toInt())

public actual fun WHvSetVirtualProcessorInterruptControllerState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState(partition, vpindex.toInt(), state, statesize.toInt())

public actual fun WHvSetVirtualProcessorInterruptControllerState2(partition: WHV_PARTITION_HANDLE, vpindex: UInt, state: Long, statesize: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorInterruptControllerState2(partition, vpindex.toInt(), state, statesize.toInt())

public actual fun WHvSetVirtualProcessorRegisters(partition: WHV_PARTITION_HANDLE, vpindex: UInt, registernames: Long, registercount: UInt, registervalues: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorRegisters(partition, vpindex.toInt(), registernames, registercount.toInt(), registervalues)

public actual fun WHvSetVirtualProcessorState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, statetype: WHV_VIRTUAL_PROCESSOR_STATE_TYPE, buffer: Long, buffersizeinbytes: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorState(partition, vpindex.toInt(), statetype, buffer, buffersizeinbytes.toInt())

public actual fun WHvSetVirtualProcessorXsaveState(partition: WHV_PARTITION_HANDLE, vpindex: UInt, buffer: Long, buffersizeinbytes: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSetVirtualProcessorXsaveState(partition, vpindex.toInt(), buffer, buffersizeinbytes.toInt())

public actual fun WHvSetVpciDevicePowerState(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, powerstate: DEVICE_POWER_STATE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSetVpciDevicePowerState(partition, logicaldeviceid.toLong(), powerstate)

public actual fun WHvSetupPartition(partition: WHV_PARTITION_HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSetupPartition(partition)

public actual fun WHvSignalVirtualProcessorSynicEvent(partition: WHV_PARTITION_HANDLE, synicevent: WHV_SYNIC_EVENT_PARAMETERS, newlysignaled: Long): HRESULT =
    0

public actual fun WHvStartPartitionMigration(partition: WHV_PARTITION_HANDLE, migrationhandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvStartPartitionMigration(partition, migrationhandle)

public actual fun WHvSuspendPartitionTime(partition: WHV_PARTITION_HANDLE): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvSuspendPartitionTime(partition)

public actual fun WHvTranslateGva(partition: WHV_PARTITION_HANDLE, vpindex: UInt, gva: ULong, translateflags: WHV_TRANSLATE_GVA_FLAGS, translationresult: Long, gpa: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvTranslateGva(partition, vpindex.toInt(), gva.toLong(), translateflags, translationresult, gpa)

public actual fun WHvUnmapGpaRange(partition: WHV_PARTITION_HANDLE, guestaddress: ULong, sizeinbytes: ULong): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvUnmapGpaRange(partition, guestaddress.toLong(), sizeinbytes.toLong())

public actual fun WHvUnmapVpciDeviceInterrupt(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, index: UInt): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), index.toInt())

public actual fun WHvUnmapVpciDeviceMmioRanges(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvUnmapVpciDeviceMmioRanges(partition, logicaldeviceid.toLong())

public actual fun WHvUnregisterPartitionDoorbellEvent(partition: WHV_PARTITION_HANDLE, matchdata: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvUnregisterPartitionDoorbellEvent(partition, matchdata)

public actual fun WHvUpdateTriggerParameters(partition: WHV_PARTITION_HANDLE, parameters: Long, triggerhandle: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvUpdateTriggerParameters(partition, parameters, triggerhandle)

public actual fun WHvWriteGpaRange(partition: WHV_PARTITION_HANDLE, vpindex: UInt, guestaddress: ULong, controls: WHV_ACCESS_GPA_CONTROLS, data: Long, datasizeinbytes: UInt): HRESULT =
    0

public actual fun WHvWriteVpciDeviceRegister(partition: WHV_PARTITION_HANDLE, logicaldeviceid: ULong, register: Long, data: Long): HRESULT =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_WHvWriteVpciDeviceRegister(partition, logicaldeviceid.toLong(), register, data)
