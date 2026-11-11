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

private object WindowsWin32SystemHypervisorJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix(vmsavedstatedumphandle: Long, vpid: Int, virtualaddress: Long, fixbuffer: Long, fixbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog(vmrsfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_callStackUnwind(vmsavedstatedumphandle: Long, vpid: Int, imageinfo: Long, imageinfocount: Int, framecount: Int, callstack: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType(vmsavedstatedumphandle: Long, vpid: Int, typename: Long, fieldname: Long, offset: Long, found: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: Int, virtualtrustlevel: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_forceArchitecture(vmsavedstatedumphandle: Long, vpid: Int, architecture: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_forceNestedHostMode(vmsavedstatedumphandle: Long, vpid: Int, hostmode: Int, oldmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_forcePagingMode(vmsavedstatedumphandle: Long, vpid: Int, pagingmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: Int, virtualtrustlevel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getArchitecture(vmsavedstatedumphandle: Long, vpid: Int, architecture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, vpid: Int, virtualtrustlevels: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, virtualtrustlevels: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getGuestOsInfo(vmsavedstatedumphandle: Long, virtualtrustlevel: Byte, guestosinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: Long, memorychunkpagesize: Long, memorychunks: Long, memorychunkcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize(vmsavedstatedumphandle: Long, guestrawsavedmemorysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode(vmsavedstatedumphandle: Long, vpid: Int, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getPagingMode(vmsavedstatedumphandle: Long, vpid: Int, pagingmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getRegisterValue(vmsavedstatedumphandle: Long, vpid: Int, registerid: Int, registervalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: Long, vpid: Int, typename: Long, typefieldinfomap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize(vmsavedstatedumphandle: Long, vpid: Int, typename: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_getVpCount(vmsavedstatedumphandle: Long, vpcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: Long, physicaladdress: Long, rawsavedmemoryoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: Long, vpid: Int, virtualaddress: Long, physicaladdress: Long, unmappedregionsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance(devicehosthandle: Long, devicetype: Int, deviceclassid: Long, deviceinstanceid: Long, deviceinterface: Long, devicecontext: Long, devicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture(requestor: Long, guestphysicaladdress: Long, bytecount: Int, writeprotected: Int, mappedaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange(requestor: Long, barindex: Int, offsetinpages: Long, lengthinpages: Long, mappingflags: Int, sectionhandle: Long, sectionoffsetinpages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt(requestor: Long, msiaddress: Long, msidata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture(requestor: Long, mappedaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange(requestor: Long, barindex: Int, offsetinpages: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost(computesystem: Long, devicehosthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx(computesystem: Long, flags: Int, devicehosthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory(requestor: Long, guestphysicaladdress: Long, bytecount: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell(requestor: Long, barindex: Int, baroffset: Long, triggervalue: Long, flags: Long, doorbellevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost(devicehosthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell(requestor: Long, barindex: Int, baroffset: Long, triggervalue: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory(requestor: Long, guestphysicaladdress: Long, bytecount: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_inKernelSpace(vmsavedstatedumphandle: Long, vpid: Int, inkernelspace: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: Long, vpid: Int, activevirtualtrustlevelenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled(vmsavedstatedumphandle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_loadSavedStateFile(vmrsfile: Long, vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_loadSavedStateFiles(binfile: Long, vsvfile: Long, vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols(vmsavedstatedumphandle: Long, imagename: Long, modulename: Long, baseaddress: Long, sizeofbase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: Long, imagename: Long, imagetimestamp: Int, modulename: Long, baseaddress: Long, sizeofbase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider(vmsavedstatedumphandle: Long, usersymbols: Long, force: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_locateSavedStateFiles(vmname: Long, snapshotname: Long, binpath: Long, vsvpath: Long, vmrspath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress(vmsavedstatedumphandle: Long, physicaladdress: Long, buffer: Long, buffersize: Int, bytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory(vmsavedstatedumphandle: Long, rawsavedmemoryoffset: Long, buffer: Long, buffersize: Int, bytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable(vmsavedstatedumphandle: Long, vpid: Int, globalname: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles(vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider(vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: Long, vpid: Int, globalname: Long, virtualaddress: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages(vmsavedstatedumphandle: Long, vpid: Int, startaddress: Long, endaddress: Long, callbackcontext: Long, foundimagecallback: Long, standaloneaddress: Long, standaloneaddresscount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration(migrationhandle: Long, partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange(partition: Long, gparanges: Long, gparangescount: Int, advice: Int, advicebuffer: Long, advicebuffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource(providerid: Long, flags: Int, resourcedescriptor: Long, resourcedescriptorsizeinbytes: Int, vpciresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor(partition: Long, vpindex: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort(partition: Long, parameters: Long, eventhandle: Long, porthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvCreatePartition(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvCreateTrigger(partition: Long, parameters: Long, triggerhandle: Long, eventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor(partition: Long, vpindex: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2(partition: Long, vpindex: Int, properties: Long, propertycount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice(partition: Long, logicaldeviceid: Long, vpciresource: Long, flags: Int, notificationeventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort(partition: Long, porthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvDeletePartition(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger(partition: Long, triggerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor(partition: Long, vpindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice(partition: Long, logicaldeviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator(callbacks: Long, emulator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator(emulator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation(emulator: Long, context: Long, vpcontext: Long, ioinstructioncontext: Long, emulatorreturnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation(emulator: Long, context: Long, vpcontext: Long, mmioinstructioncontext: Long, emulatorreturnstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetCapability(capabilitycode: Int, capabilitybuffer: Long, capabilitybuffersizeinbytes: Int, writtensizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet(partition: Long, destination: Long, destinationmode: Int, targetvps: Long, vpcount: Int, targetvpcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters(partition: Long, counterset: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty(partition: Long, propertycode: Int, propertybuffer: Long, propertybuffersizeinbytes: Int, writtensizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters(partition: Long, vpindex: Int, counterset: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput(partition: Long, vpindex: Int, eax: Int, ecx: Int, cpuidoutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState(partition: Long, vpindex: Int, state: Long, statesize: Int, writtensize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2(partition: Long, vpindex: Int, state: Long, statesize: Int, writtensize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters(partition: Long, vpindex: Int, registernames: Long, registercount: Int, registervalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState(partition: Long, vpindex: Int, statetype: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState(partition: Long, vpindex: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget(partition: Long, logicaldeviceid: Long, index: Int, multimessagenumber: Int, target: Long, targetsizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification(partition: Long, logicaldeviceid: Long, notification: Long, notificationsizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty(partition: Long, logicaldeviceid: Long, propertycode: Int, propertybuffer: Long, propertybuffersizeinbytes: Int, writtensizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvMapGpaRange(partition: Long, sourceaddress: Long, guestaddress: Long, sizeinbytes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2(partition: Long, process: Long, sourceaddress: Long, guestaddress: Long, sizeinbytes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, index: Int, messagecount: Int, target: Long, msiaddress: Long, msidata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges(partition: Long, logicaldeviceid: Long, mappingcount: Long, mappings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage(partition: Long, vpindex: Int, sintindex: Int, message: Long, messagesizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap(partition: Long, guestaddress: Long, rangesizeinbytes: Long, bitmap: Long, bitmapsizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister(partition: Long, logicaldeviceid: Long, register: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent(partition: Long, matchdata: Long, eventhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt(partition: Long, interrupt: Long, interruptcontrolsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, msiaddress: Long, msidata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvResetPartition(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, msiaddress: Long, msidata: Int, target: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor(partition: Long, vpindex: Int, exitcontext: Long, exitcontextsizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty(partition: Long, porthandle: Long, propertycode: Int, propertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty(partition: Long, propertycode: Int, propertybuffer: Long, propertybuffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState(partition: Long, vpindex: Int, state: Long, statesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2(partition: Long, vpindex: Int, state: Long, statesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters(partition: Long, vpindex: Int, registernames: Long, registercount: Int, registervalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState(partition: Long, vpindex: Int, statetype: Int, buffer: Long, buffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState(partition: Long, vpindex: Int, buffer: Long, buffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState(partition: Long, logicaldeviceid: Long, powerstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSetupPartition(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration(partition: Long, migrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime(partition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvTranslateGva(partition: Long, vpindex: Int, gva: Long, translateflags: Int, translationresult: Long, gpa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange(partition: Long, guestaddress: Long, sizeinbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges(partition: Long, logicaldeviceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent(partition: Long, matchdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters(partition: Long, parameters: Long, triggerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister(partition: Long, logicaldeviceid: Long, register: Long, data: Long): Int
}

public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, fixbuffer: COpaquePointer?, fixbuffersize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), virtualaddress.toLong(), (fixbuffer?.value ?: 0L), fixbuffersize.toInt())

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog((vmrsfile?.value ?: 0L))

public actual fun callStackUnwind(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, imageinfo: COpaquePointer?, imageinfocount: UInt, framecount: UInt, callstack: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_callStackUnwind((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (imageinfo?.value ?: 0L), imageinfocount.toInt(), framecount.toInt(), (callstack?.value ?: 0L))

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: COpaquePointer?, found: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (typename?.value ?: 0L), (fieldname?.value ?: 0L), (offset?.value ?: 0L), (found?.value ?: 0L))

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), virtualtrustlevel.toByte())

public actual fun forceArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_forceArchitecture((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), architecture)

public actual fun forceNestedHostMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, hostmode: Bool, oldmode: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_forceNestedHostMode((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), hostmode, (oldmode?.value ?: 0L))

public actual fun forcePagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: PagingMode): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_forcePagingMode((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), pagingmode)

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (virtualtrustlevel?.value ?: 0L))

public actual fun getArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getArchitecture((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (architecture?.value ?: 0L))

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevels: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (virtualtrustlevels?.value ?: 0L))

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevels: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels((vmsavedstatedumphandle?.value ?: 0L), (virtualtrustlevels?.value ?: 0L))

public actual fun getGuestOsInfo(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevel: UByte, guestosinfo: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getGuestOsInfo((vmsavedstatedumphandle?.value ?: 0L), virtualtrustlevel.toByte(), (guestosinfo?.value ?: 0L))

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: COpaquePointer?, memorychunkpagesize: COpaquePointer?, memorychunks: COpaquePointer?, memorychunkcount: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks((vmsavedstatedumphandle?.value ?: 0L), (memorychunkpagesize?.value ?: 0L), (memorychunks?.value ?: 0L), (memorychunkcount?.value ?: 0L))

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: COpaquePointer?, guestrawsavedmemorysize: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize((vmsavedstatedumphandle?.value ?: 0L), (guestrawsavedmemorysize?.value ?: 0L))

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit((vmsavedstatedumphandle?.value ?: 0L), (memoryblockcachelimit?.value ?: 0L))

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, enabled: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (enabled?.value ?: 0L))

public actual fun getPagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getPagingMode((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (pagingmode?.value ?: 0L))

public actual fun getRegisterValue(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, registerid: UInt, registervalue: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getRegisterValue((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), registerid.toInt(), (registervalue?.value ?: 0L))

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, typefieldinfomap: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (typename?.value ?: 0L), (typefieldinfomap?.value ?: 0L))

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: COpaquePointer?): Handle =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle((vmsavedstatedumphandle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, size: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (typename?.value ?: 0L), (size?.value ?: 0L))

public actual fun getVpCount(vmsavedstatedumphandle: COpaquePointer?, vpcount: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_getVpCount((vmsavedstatedumphandle?.value ?: 0L), (vpcount?.value ?: 0L))

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, rawsavedmemoryoffset: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset((vmsavedstatedumphandle?.value ?: 0L), physicaladdress.toLong(), (rawsavedmemoryoffset?.value ?: 0L))

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, physicaladdress: COpaquePointer?, unmappedregionsize: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), virtualaddress.toLong(), (physicaladdress?.value ?: 0L), (unmappedregionsize?.value ?: 0L))

public actual fun hdvCreateDeviceInstance(devicehosthandle: COpaquePointer?, devicetype: HdvDeviceType, deviceclassid: COpaquePointer?, deviceinstanceid: COpaquePointer?, deviceinterface: COpaquePointer?, devicecontext: COpaquePointer?, devicehandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance((devicehosthandle?.value ?: 0L), devicetype, (deviceclassid?.value ?: 0L), (deviceinstanceid?.value ?: 0L), (deviceinterface?.value ?: 0L), (devicecontext?.value ?: 0L), (devicehandle?.value ?: 0L))

public actual fun hdvCreateGuestMemoryAperture(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture((requestor?.value ?: 0L), guestphysicaladdress.toLong(), bytecount.toInt(), writeprotected, (mappedaddress?.value ?: 0L))

public actual fun hdvCreateSectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange((requestor?.value ?: 0L), barindex, offsetinpages.toLong(), lengthinpages.toLong(), mappingflags, (sectionhandle?.value ?: 0L), sectionoffsetinpages.toLong())

public actual fun hdvDeliverGuestInterrupt(requestor: COpaquePointer?, msiaddress: ULong, msidata: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt((requestor?.value ?: 0L), msiaddress.toLong(), msidata.toInt())

public actual fun hdvDestroyGuestMemoryAperture(requestor: COpaquePointer?, mappedaddress: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture((requestor?.value ?: 0L), (mappedaddress?.value ?: 0L))

public actual fun hdvDestroySectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange((requestor?.value ?: 0L), barindex, offsetinpages.toLong())

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost((computesystem?.value ?: 0L), (devicehosthandle?.value ?: 0L))

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx((computesystem?.value ?: 0L), flags, (devicehosthandle?.value ?: 0L))

public actual fun hdvReadGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory((requestor?.value ?: 0L), guestphysicaladdress.toLong(), bytecount.toInt(), (buffer?.value ?: 0L))

public actual fun hdvRegisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell((requestor?.value ?: 0L), barindex, baroffset.toLong(), triggervalue.toLong(), flags.toLong(), (doorbellevent?.value ?: 0L))

public actual fun hdvTeardownDeviceHost(devicehosthandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost((devicehosthandle?.value ?: 0L))

public actual fun hdvUnregisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell((requestor?.value ?: 0L), barindex, baroffset.toLong(), triggervalue.toLong(), flags.toLong())

public actual fun hdvWriteGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory((requestor?.value ?: 0L), guestphysicaladdress.toLong(), bytecount.toInt(), (buffer?.value ?: 0L))

public actual fun inKernelSpace(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, inkernelspace: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_inKernelSpace((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (inkernelspace?.value ?: 0L))

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, activevirtualtrustlevelenabled: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (activevirtualtrustlevelenabled?.value ?: 0L))

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: COpaquePointer?, enabled: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled((vmsavedstatedumphandle?.value ?: 0L), (enabled?.value ?: 0L))

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_loadSavedStateFile((vmrsfile?.value ?: 0L), (vmsavedstatedumphandle?.value ?: 0L))

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_loadSavedStateFiles((binfile?.value ?: 0L), (vsvfile?.value ?: 0L), (vmsavedstatedumphandle?.value ?: 0L))

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols((vmsavedstatedumphandle?.value ?: 0L), (imagename?.value ?: 0L), (modulename?.value ?: 0L), baseaddress.toLong(), sizeofbase.toInt())

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx((vmsavedstatedumphandle?.value ?: 0L), (imagename?.value ?: 0L), imagetimestamp.toInt(), (modulename?.value ?: 0L), baseaddress.toLong(), sizeofbase.toInt())

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?, usersymbols: Pcwstr, force: Bool): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider((vmsavedstatedumphandle?.value ?: 0L), (usersymbols?.value ?: 0L), force)

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: COpaquePointer?, vsvpath: COpaquePointer?, vmrspath: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_locateSavedStateFiles((vmname?.value ?: 0L), (snapshotname?.value ?: 0L), (binpath?.value ?: 0L), (vsvpath?.value ?: 0L), (vmrspath?.value ?: 0L))

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress((vmsavedstatedumphandle?.value ?: 0L), physicaladdress.toLong(), (buffer?.value ?: 0L), buffersize.toInt(), (bytesread?.value ?: 0L))

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: COpaquePointer?, rawsavedmemoryoffset: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory((vmsavedstatedumphandle?.value ?: 0L), rawsavedmemoryoffset.toLong(), (buffer?.value ?: 0L), buffersize.toInt(), (bytesread?.value ?: 0L))

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (globalname?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt())

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles((vmsavedstatedumphandle?.value ?: 0L))

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider((vmsavedstatedumphandle?.value ?: 0L))

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, virtualaddress: COpaquePointer?, size: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), (globalname?.value ?: 0L), (virtualaddress?.value ?: 0L), (size?.value ?: 0L))

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: COpaquePointer?, foundimagecallback: FoundImageCallback, standaloneaddress: COpaquePointer?, standaloneaddresscount: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages((vmsavedstatedumphandle?.value ?: 0L), vpid.toInt(), startaddress.toLong(), endaddress.toLong(), (callbackcontext?.value ?: 0L), 0L, (standaloneaddress?.value ?: 0L), standaloneaddresscount.toInt())

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit((vmsavedstatedumphandle?.value ?: 0L), memoryblockcachelimit.toLong())

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: COpaquePointer?, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback((vmsavedstatedumphandle?.value ?: 0L), 0L)

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration((migrationhandle?.value ?: 0L), (partition?.value ?: 0L))

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: COpaquePointer?, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: COpaquePointer?, advicebuffersizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange(partition, (gparanges?.value ?: 0L), gparangescount.toInt(), advice, (advicebuffer?.value ?: 0L), advicebuffersizeinbytes.toInt())

public actual fun wHvAllocateVpciResource(providerid: COpaquePointer?, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: COpaquePointer?, resourcedescriptorsizeinbytes: UInt, vpciresource: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource((providerid?.value ?: 0L), flags, (resourcedescriptor?.value ?: 0L), resourcedescriptorsizeinbytes.toInt(), (vpciresource?.value ?: 0L))

public actual fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration(partition)

public actual fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor(partition, vpindex.toInt(), flags.toInt())

public actual fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration(partition)

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: COpaquePointer?, eventhandle: Handle, porthandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort(partition, (parameters?.value ?: 0L), (eventhandle?.value ?: 0L), (porthandle?.value ?: 0L))

public actual fun wHvCreatePartition(partition: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvCreatePartition((partition?.value ?: 0L))

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?, eventhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvCreateTrigger(partition, (parameters?.value ?: 0L), (triggerhandle?.value ?: 0L), (eventhandle?.value ?: 0L))

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor(partition, vpindex.toInt(), flags.toInt())

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: COpaquePointer?, propertycount: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2(partition, vpindex.toInt(), (properties?.value ?: 0L), propertycount.toInt())

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice(partition, logicaldeviceid.toLong(), (vpciresource?.value ?: 0L), flags, (notificationeventhandle?.value ?: 0L))

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort(partition, (porthandle?.value ?: 0L))

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvDeletePartition(partition)

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger(partition, (triggerhandle?.value ?: 0L))

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor(partition, vpindex.toInt())

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice(partition, logicaldeviceid.toLong())

public actual fun wHvEmulatorCreateEmulator(callbacks: COpaquePointer?, emulator: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator((callbacks?.value ?: 0L), (emulator?.value ?: 0L))

public actual fun wHvEmulatorDestroyEmulator(emulator: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator((emulator?.value ?: 0L))

public actual fun wHvEmulatorTryIoEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, ioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation((emulator?.value ?: 0L), (context?.value ?: 0L), (vpcontext?.value ?: 0L), (ioinstructioncontext?.value ?: 0L), (emulatorreturnstatus?.value ?: 0L))

public actual fun wHvEmulatorTryMmioEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, mmioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation((emulator?.value ?: 0L), (context?.value ?: 0L), (vpcontext?.value ?: 0L), (mmioinstructioncontext?.value ?: 0L), (emulatorreturnstatus?.value ?: 0L))

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: COpaquePointer?, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetCapability(capabilitycode, (capabilitybuffer?.value ?: 0L), capabilitybuffersizeinbytes.toInt(), (writtensizeinbytes?.value ?: 0L))

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: COpaquePointer?, vpcount: UInt, targetvpcount: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet(partition, destination.toLong(), destinationmode, (targetvps?.value ?: 0L), vpcount.toInt(), (targetvpcount?.value ?: 0L))

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters(partition, counterset, (buffer?.value ?: 0L), buffersizeinbytes.toInt(), (byteswritten?.value ?: 0L))

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty(partition, propertycode, (propertybuffer?.value ?: 0L), propertybuffersizeinbytes.toInt(), (writtensizeinbytes?.value ?: 0L))

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters(partition, vpindex.toInt(), counterset, (buffer?.value ?: 0L), buffersizeinbytes.toInt(), (byteswritten?.value ?: 0L))

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput(partition, vpindex.toInt(), eax.toInt(), ecx.toInt(), (cpuidoutput?.value ?: 0L))

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState(partition, vpindex.toInt(), (state?.value ?: 0L), statesize.toInt(), (writtensize?.value ?: 0L))

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2(partition, vpindex.toInt(), (state?.value ?: 0L), statesize.toInt(), (writtensize?.value ?: 0L))

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters(partition, vpindex.toInt(), (registernames?.value ?: 0L), registercount.toInt(), (registervalues?.value ?: 0L))

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState(partition, vpindex.toInt(), statetype, (buffer?.value ?: 0L), buffersizeinbytes.toInt(), (byteswritten?.value ?: 0L))

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState(partition, vpindex.toInt(), (buffer?.value ?: 0L), buffersizeinbytes.toInt(), (byteswritten?.value ?: 0L))

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: COpaquePointer?, targetsizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget(partition, logicaldeviceid.toLong(), index.toInt(), multimessagenumber.toInt(), (target?.value ?: 0L), targetsizeinbytes.toInt(), (byteswritten?.value ?: 0L))

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: COpaquePointer?, notificationsizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification(partition, logicaldeviceid.toLong(), (notification?.value ?: 0L), notificationsizeinbytes.toInt())

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty(partition, logicaldeviceid.toLong(), propertycode, (propertybuffer?.value ?: 0L), propertybuffersizeinbytes.toInt(), (writtensizeinbytes?.value ?: 0L))

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvMapGpaRange(partition, (sourceaddress?.value ?: 0L), guestaddress.toLong(), sizeinbytes.toLong(), flags)

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2(partition, (process?.value ?: 0L), (sourceaddress?.value ?: 0L), guestaddress.toLong(), sizeinbytes.toLong(), flags)

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: COpaquePointer?, msiaddress: COpaquePointer?, msidata: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), index.toInt(), messagecount.toInt(), (target?.value ?: 0L), (msiaddress?.value ?: 0L), (msidata?.value ?: 0L))

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: COpaquePointer?, mappings: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges(partition, logicaldeviceid.toLong(), (mappingcount?.value ?: 0L), (mappings?.value ?: 0L))

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: COpaquePointer?, messagesizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage(partition, vpindex.toInt(), sintindex.toInt(), (message?.value ?: 0L), messagesizeinbytes.toInt())

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: COpaquePointer?, bitmapsizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap(partition, guestaddress.toLong(), rangesizeinbytes.toLong(), (bitmap?.value ?: 0L), bitmapsizeinbytes.toInt())

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult =
    0

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister(partition, logicaldeviceid.toLong(), (register?.value ?: 0L), (data?.value ?: 0L))

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?, eventhandle: Handle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent(partition, (matchdata?.value ?: 0L), (eventhandle?.value ?: 0L))

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: COpaquePointer?, interruptcontrolsize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt(partition, (interrupt?.value ?: 0L), interruptcontrolsize.toInt())

public actual fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), msiaddress.toLong(), msidata.toInt())

public actual fun wHvResetPartition(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvResetPartition(partition)

public actual fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime(partition)

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), msiaddress.toLong(), msidata.toInt(), (target?.value ?: 0L))

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: COpaquePointer?, exitcontextsizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor(partition, vpindex.toInt(), (exitcontext?.value ?: 0L), exitcontextsizeinbytes.toInt())

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: COpaquePointer?, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty(partition, (porthandle?.value ?: 0L), propertycode, propertyvalue.toLong())

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty(partition, propertycode, (propertybuffer?.value ?: 0L), propertybuffersizeinbytes.toInt())

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState(partition, vpindex.toInt(), (state?.value ?: 0L), statesize.toInt())

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2(partition, vpindex.toInt(), (state?.value ?: 0L), statesize.toInt())

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters(partition, vpindex.toInt(), (registernames?.value ?: 0L), registercount.toInt(), (registervalues?.value ?: 0L))

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState(partition, vpindex.toInt(), statetype, (buffer?.value ?: 0L), buffersizeinbytes.toInt())

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState(partition, vpindex.toInt(), (buffer?.value ?: 0L), buffersizeinbytes.toInt())

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState(partition, logicaldeviceid.toLong(), powerstate)

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSetupPartition(partition)

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: COpaquePointer?): Hresult =
    0

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration(partition, (migrationhandle?.value ?: 0L))

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime(partition)

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: COpaquePointer?, gpa: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvTranslateGva(partition, vpindex.toInt(), gva.toLong(), translateflags, (translationresult?.value ?: 0L), (gpa?.value ?: 0L))

public actual fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange(partition, guestaddress.toLong(), sizeinbytes.toLong())

public actual fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), index.toInt())

public actual fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges(partition, logicaldeviceid.toLong())

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent(partition, (matchdata?.value ?: 0L))

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters(partition, (parameters?.value ?: 0L), (triggerhandle?.value ?: 0L))

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult =
    0

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister(partition, logicaldeviceid.toLong(), (register?.value ?: 0L), (data?.value ?: 0L))
