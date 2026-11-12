@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemHypervisorJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemHypervisorJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix(vmsavedstatedumphandle: Long, vpid: Int, virtualaddress: Long, fixbuffer: Long, fixbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog(vmrsfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorCallStackUnwind(vmsavedstatedumphandle: Long, vpid: Int, imageinfo: Long, imageinfocount: Int, framecount: Int, callstack: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType(vmsavedstatedumphandle: Long, vpid: Int, typename: Long, fieldname: Long, offset: Long, found: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: Int, virtualtrustlevel: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorForceArchitecture(vmsavedstatedumphandle: Long, vpid: Int, architecture: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorForceNestedHostMode(vmsavedstatedumphandle: Long, vpid: Int, hostmode: Int, oldmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorForcePagingMode(vmsavedstatedumphandle: Long, vpid: Int, pagingmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel(vmsavedstatedumphandle: Long, vpid: Int, virtualtrustlevel: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetArchitecture(vmsavedstatedumphandle: Long, vpid: Int, architecture: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, vpid: Int, virtualtrustlevels: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: Long, virtualtrustlevels: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetGuestOsInfo(vmsavedstatedumphandle: Long, virtualtrustlevel: Byte, guestosinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks(vmsavedstatedumphandle: Long, memorychunkpagesize: Long, memorychunks: Long, memorychunkcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize(vmsavedstatedumphandle: Long, guestrawsavedmemorysize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode(vmsavedstatedumphandle: Long, vpid: Int, enabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetPagingMode(vmsavedstatedumphandle: Long, vpid: Int, pagingmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetRegisterValue(vmsavedstatedumphandle: Long, vpid: Int, registerid: Int, registervalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo(vmsavedstatedumphandle: Long, vpid: Int, typename: Long, typefieldinfomap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle(vmsavedstatedumphandle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize(vmsavedstatedumphandle: Long, vpid: Int, typename: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGetVpCount(vmsavedstatedumphandle: Long, vpcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: Long, physicaladdress: Long, rawsavedmemoryoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: Long, vpid: Int, virtualaddress: Long, physicaladdress: Long, unmappedregionsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance(devicehosthandle: Long, devicetype: Int, deviceclassid: Long, deviceinstanceid: Long, deviceinterface: Long, devicecontext: Long, devicehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture(requestor: Long, guestphysicaladdress: Long, bytecount: Int, writeprotected: Int, mappedaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange(requestor: Long, barindex: Int, offsetinpages: Long, lengthinpages: Long, mappingflags: Int, sectionhandle: Long, sectionoffsetinpages: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt(requestor: Long, msiaddress: Long, msidata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture(requestor: Long, mappedaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange(requestor: Long, barindex: Int, offsetinpages: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost(computesystem: Long, devicehosthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx(computesystem: Long, flags: Int, devicehosthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory(requestor: Long, guestphysicaladdress: Long, bytecount: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell(requestor: Long, barindex: Int, baroffset: Long, triggervalue: Long, flags: Long, doorbellevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost(devicehosthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell(requestor: Long, barindex: Int, baroffset: Long, triggervalue: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory(requestor: Long, guestphysicaladdress: Long, bytecount: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorInKernelSpace(vmsavedstatedumphandle: Long, vpid: Int, inkernelspace: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: Long, vpid: Int, activevirtualtrustlevelenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled(vmsavedstatedumphandle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorLoadSavedStateFile(vmrsfile: Long, vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles(binfile: Long, vsvfile: Long, vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols(vmsavedstatedumphandle: Long, imagename: Long, modulename: Long, baseaddress: Long, sizeofbase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: Long, imagename: Long, imagetimestamp: Int, modulename: Long, baseaddress: Long, sizeofbase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider(vmsavedstatedumphandle: Long, usersymbols: Long, force: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles(vmname: Long, snapshotname: Long, binpath: Long, vsvpath: Long, vmrspath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress(vmsavedstatedumphandle: Long, physicaladdress: Long, buffer: Long, buffersize: Int, bytesread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory(vmsavedstatedumphandle: Long, rawsavedmemoryoffset: Long, buffer: Long, buffersize: Int, bytesread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable(vmsavedstatedumphandle: Long, vpid: Int, globalname: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles(vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider(vmsavedstatedumphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: Long, vpid: Int, globalname: Long, virtualaddress: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages(vmsavedstatedumphandle: Long, vpid: Int, startaddress: Long, endaddress: Long, callbackcontext: Long, foundimagecallback: Long, standaloneaddress: Long, standaloneaddresscount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit(vmsavedstatedumphandle: Long, memoryblockcachelimit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: Long, callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration(migrationhandle: Long, partition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange(partition: Long, gparanges: Long, gparangescount: Int, advice: Int, advicebuffer: Long, advicebuffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource(providerid: Long, flags: Int, resourcedescriptor: Long, resourcedescriptorsizeinbytes: Int, vpciresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(partition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(partition: Long, vpindex: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(partition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort(partition: Long, parameters: Long, eventhandle: Long, porthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvCreatePartition(partition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvCreateTrigger(partition: Long, parameters: Long, triggerhandle: Long, eventhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(partition: Long, vpindex: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2(partition: Long, vpindex: Int, properties: Long, propertycount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice(partition: Long, logicaldeviceid: Long, vpciresource: Long, flags: Int, notificationeventhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort(partition: Long, porthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvDeletePartition(partition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger(partition: Long, triggerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(partition: Long, vpindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(partition: Long, logicaldeviceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator(callbacks: Long, emulator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator(emulator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation(emulator: Long, context: Long, vpcontext: Long, ioinstructioncontext: Long, emulatorreturnstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation(emulator: Long, context: Long, vpcontext: Long, mmioinstructioncontext: Long, emulatorreturnstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetCapability(capabilitycode: Int, capabilitybuffer: Long, capabilitybuffersizeinbytes: Int, writtensizeinbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet(partition: Long, destination: Long, destinationmode: Int, targetvps: Long, vpcount: Int, targetvpcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters(partition: Long, counterset: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty(partition: Long, propertycode: Int, propertybuffer: Long, propertybuffersizeinbytes: Int, writtensizeinbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters(partition: Long, vpindex: Int, counterset: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput(partition: Long, vpindex: Int, eax: Int, ecx: Int, cpuidoutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState(partition: Long, vpindex: Int, state: Long, statesize: Int, writtensize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2(partition: Long, vpindex: Int, state: Long, statesize: Int, writtensize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters(partition: Long, vpindex: Int, registernames: Long, registercount: Int, registervalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState(partition: Long, vpindex: Int, statetype: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState(partition: Long, vpindex: Int, buffer: Long, buffersizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget(partition: Long, logicaldeviceid: Long, index: Int, multimessagenumber: Int, target: Long, targetsizeinbytes: Int, byteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification(partition: Long, logicaldeviceid: Long, notification: Long, notificationsizeinbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty(partition: Long, logicaldeviceid: Long, propertycode: Int, propertybuffer: Long, propertybuffersizeinbytes: Int, writtensizeinbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvMapGpaRange(partition: Long, sourceaddress: Long, guestaddress: Long, sizeinbytes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2(partition: Long, process: Long, sourceaddress: Long, guestaddress: Long, sizeinbytes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, index: Int, messagecount: Int, target: Long, msiaddress: Long, msidata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges(partition: Long, logicaldeviceid: Long, mappingcount: Long, mappings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage(partition: Long, vpindex: Int, sintindex: Int, message: Long, messagesizeinbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap(partition: Long, guestaddress: Long, rangesizeinbytes: Long, bitmap: Long, bitmapsizeinbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister(partition: Long, logicaldeviceid: Long, register: Long, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent(partition: Long, matchdata: Long, eventhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt(partition: Long, interrupt: Long, interruptcontrolsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, msiaddress: Long, msidata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvResetPartition(partition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(partition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, msiaddress: Long, msidata: Int, target: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor(partition: Long, vpindex: Int, exitcontext: Long, exitcontextsizeinbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty(partition: Long, porthandle: Long, propertycode: Int, propertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty(partition: Long, propertycode: Int, propertybuffer: Long, propertybuffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState(partition: Long, vpindex: Int, state: Long, statesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2(partition: Long, vpindex: Int, state: Long, statesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters(partition: Long, vpindex: Int, registernames: Long, registercount: Int, registervalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState(partition: Long, vpindex: Int, statetype: Int, buffer: Long, buffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState(partition: Long, vpindex: Int, buffer: Long, buffersizeinbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(partition: Long, logicaldeviceid: Long, powerstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSetupPartition(partition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration(partition: Long, migrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(partition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvTranslateGva(partition: Long, vpindex: Int, gva: Long, translateflags: Int, translationresult: Long, gpa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(partition: Long, guestaddress: Long, sizeinbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(partition: Long, logicaldeviceid: Long, index: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(partition: Long, logicaldeviceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent(partition: Long, matchdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters(partition: Long, parameters: Long, triggerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister(partition: Long, logicaldeviceid: Long, register: Long, data: Long): Int
}

public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualaddress: ULong, fixbuffer: ConstPtr<CVoid>, fixbuffersize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix(vmsavedstatedumphandle.rawAddress, vpid.toInt(), virtualaddress.toLong(), fixbuffer.rawAddress, fixbuffersize.toInt())

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog(vmrsfile.rawAddress)

public actual fun callStackUnwind(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, imageinfo: ConstPtr<ModuleInfo>, imageinfocount: UInt, framecount: UInt, callstack: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorCallStackUnwind(vmsavedstatedumphandle.rawAddress, vpid.toInt(), imageinfo.rawAddress, imageinfocount.toInt(), framecount.toInt(), callstack.rawAddress)

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: MutPtr<UInt>, found: MutPtr<Bool>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType(vmsavedstatedumphandle.rawAddress, vpid.toInt(), typename.rawAddress, fieldname.rawAddress, offset.rawAddress, found.rawAddress)

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel(vmsavedstatedumphandle.rawAddress, vpid.toInt(), virtualtrustlevel.toByte())

public actual fun forceArchitecture(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorForceArchitecture(vmsavedstatedumphandle.rawAddress, vpid.toInt(), architecture)

public actual fun forceNestedHostMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, hostmode: Bool, oldmode: MutPtr<Bool>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorForceNestedHostMode(vmsavedstatedumphandle.rawAddress, vpid.toInt(), hostmode, oldmode.rawAddress)

public actual fun forcePagingMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, pagingmode: PagingMode): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorForcePagingMode(vmsavedstatedumphandle.rawAddress, vpid.toInt(), pagingmode)

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevel: MutPtr<UByte>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel(vmsavedstatedumphandle.rawAddress, vpid.toInt(), virtualtrustlevel.rawAddress)

public actual fun getArchitecture(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, architecture: MutPtr<VirtualProcessorArch>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetArchitecture(vmsavedstatedumphandle.rawAddress, vpid.toInt(), architecture.rawAddress)

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualtrustlevels: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels(vmsavedstatedumphandle.rawAddress, vpid.toInt(), virtualtrustlevels.rawAddress)

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr<CVoid>, virtualtrustlevels: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle.rawAddress, virtualtrustlevels.rawAddress)

public actual fun getGuestOsInfo(vmsavedstatedumphandle: MutPtr<CVoid>, virtualtrustlevel: UByte, guestosinfo: MutPtr<GuestOsInfo>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetGuestOsInfo(vmsavedstatedumphandle.rawAddress, virtualtrustlevel.toByte(), guestosinfo.rawAddress)

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: MutPtr<CVoid>, memorychunkpagesize: MutPtr<ULong>, memorychunks: MutPtr<GpaMemoryChunk>, memorychunkcount: MutPtr<ULong>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks(vmsavedstatedumphandle.rawAddress, memorychunkpagesize.rawAddress, memorychunks.rawAddress, memorychunkcount.rawAddress)

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: MutPtr<CVoid>, guestrawsavedmemorysize: MutPtr<ULong>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize(vmsavedstatedumphandle.rawAddress, guestrawsavedmemorysize.rawAddress)

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr<CVoid>, memoryblockcachelimit: MutPtr<ULong>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit(vmsavedstatedumphandle.rawAddress, memoryblockcachelimit.rawAddress)

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, enabled: MutPtr<Bool>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode(vmsavedstatedumphandle.rawAddress, vpid.toInt(), enabled.rawAddress)

public actual fun getPagingMode(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, pagingmode: MutPtr<PagingMode>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetPagingMode(vmsavedstatedumphandle.rawAddress, vpid.toInt(), pagingmode.rawAddress)

public actual fun getRegisterValue(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, registerid: UInt, registervalue: MutPtr<VirtualProcessorRegister>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetRegisterValue(vmsavedstatedumphandle.rawAddress, vpid.toInt(), registerid.toInt(), registervalue.rawAddress)

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, typefieldinfomap: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo(vmsavedstatedumphandle.rawAddress, vpid.toInt(), typename.rawAddress, typefieldinfomap.rawAddress)

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: MutPtr<CVoid>): Handle =
    MutPtr(WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle(vmsavedstatedumphandle.rawAddress))

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, typename: Pcstr, size: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize(vmsavedstatedumphandle.rawAddress, vpid.toInt(), typename.rawAddress, size.rawAddress)

public actual fun getVpCount(vmsavedstatedumphandle: MutPtr<CVoid>, vpcount: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGetVpCount(vmsavedstatedumphandle.rawAddress, vpcount.rawAddress)

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: MutPtr<CVoid>, physicaladdress: ULong, rawsavedmemoryoffset: MutPtr<ULong>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle.rawAddress, physicaladdress.toLong(), rawsavedmemoryoffset.rawAddress)

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, virtualaddress: ULong, physicaladdress: MutPtr<ULong>, unmappedregionsize: MutPtr<ULong>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle.rawAddress, vpid.toInt(), virtualaddress.toLong(), physicaladdress.rawAddress, unmappedregionsize.rawAddress)

public actual fun hdvCreateDeviceInstance(devicehosthandle: ConstPtr<CVoid>, devicetype: HdvDeviceType, deviceclassid: ConstPtr<Guid>, deviceinstanceid: ConstPtr<Guid>, deviceinterface: ConstPtr<CVoid>, devicecontext: ConstPtr<CVoid>, devicehandle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance(devicehosthandle.rawAddress, devicetype, deviceclassid.rawAddress, deviceinstanceid.rawAddress, deviceinterface.rawAddress, devicecontext.rawAddress, devicehandle.rawAddress)

public actual fun hdvCreateGuestMemoryAperture(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture(requestor.rawAddress, guestphysicaladdress.toLong(), bytecount.toInt(), writeprotected, mappedaddress.rawAddress)

public actual fun hdvCreateSectionBackedMmioRange(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange(requestor.rawAddress, barindex, offsetinpages.toLong(), lengthinpages.toLong(), mappingflags, sectionhandle.rawAddress, sectionoffsetinpages.toLong())

public actual fun hdvDeliverGuestInterrupt(requestor: ConstPtr<CVoid>, msiaddress: ULong, msidata: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt(requestor.rawAddress, msiaddress.toLong(), msidata.toInt())

public actual fun hdvDestroyGuestMemoryAperture(requestor: ConstPtr<CVoid>, mappedaddress: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture(requestor.rawAddress, mappedaddress.rawAddress)

public actual fun hdvDestroySectionBackedMmioRange(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange(requestor.rawAddress, barindex, offsetinpages.toLong())

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost(computesystem.rawAddress, devicehosthandle.rawAddress)

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx(computesystem.rawAddress, flags, devicehosthandle.rawAddress)

public actual fun hdvReadGuestMemory(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, buffer: MutPtr<UByte>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory(requestor.rawAddress, guestphysicaladdress.toLong(), bytecount.toInt(), buffer.rawAddress)

public actual fun hdvRegisterDoorbell(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell(requestor.rawAddress, barindex, baroffset.toLong(), triggervalue.toLong(), flags.toLong(), doorbellevent.rawAddress)

public actual fun hdvTeardownDeviceHost(devicehosthandle: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost(devicehosthandle.rawAddress)

public actual fun hdvUnregisterDoorbell(requestor: ConstPtr<CVoid>, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell(requestor.rawAddress, barindex, baroffset.toLong(), triggervalue.toLong(), flags.toLong())

public actual fun hdvWriteGuestMemory(requestor: ConstPtr<CVoid>, guestphysicaladdress: ULong, bytecount: UInt, buffer: ConstPtr<UByte>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory(requestor.rawAddress, guestphysicaladdress.toLong(), bytecount.toInt(), buffer.rawAddress)

public actual fun inKernelSpace(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, inkernelspace: MutPtr<Bool>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorInKernelSpace(vmsavedstatedumphandle.rawAddress, vpid.toInt(), inkernelspace.rawAddress)

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, activevirtualtrustlevelenabled: MutPtr<Bool>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle.rawAddress, vpid.toInt(), activevirtualtrustlevelenabled.rawAddress)

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: MutPtr<CVoid>, enabled: MutPtr<Bool>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled(vmsavedstatedumphandle.rawAddress, enabled.rawAddress)

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorLoadSavedStateFile(vmrsfile.rawAddress, vmsavedstatedumphandle.rawAddress)

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles(binfile.rawAddress, vsvfile.rawAddress, vmsavedstatedumphandle.rawAddress)

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: MutPtr<CVoid>, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols(vmsavedstatedumphandle.rawAddress, imagename.rawAddress, modulename.rawAddress, baseaddress.toLong(), sizeofbase.toInt())

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: MutPtr<CVoid>, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle.rawAddress, imagename.rawAddress, imagetimestamp.toInt(), modulename.rawAddress, baseaddress.toLong(), sizeofbase.toInt())

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr<CVoid>, usersymbols: Pcwstr, force: Bool): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider(vmsavedstatedumphandle.rawAddress, usersymbols.rawAddress, force)

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: MutPtr<Pwstr>, vsvpath: MutPtr<Pwstr>, vmrspath: MutPtr<Pwstr>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles(vmname.rawAddress, snapshotname.rawAddress, binpath.rawAddress, vsvpath.rawAddress, vmrspath.rawAddress)

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: MutPtr<CVoid>, physicaladdress: ULong, buffer: MutPtr<CVoid>, buffersize: UInt, bytesread: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress(vmsavedstatedumphandle.rawAddress, physicaladdress.toLong(), buffer.rawAddress, buffersize.toInt(), bytesread.rawAddress)

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: MutPtr<CVoid>, rawsavedmemoryoffset: ULong, buffer: MutPtr<CVoid>, buffersize: UInt, bytesread: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory(vmsavedstatedumphandle.rawAddress, rawsavedmemoryoffset.toLong(), buffer.rawAddress, buffersize.toInt(), bytesread.rawAddress)

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, globalname: Pcstr, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable(vmsavedstatedumphandle.rawAddress, vpid.toInt(), globalname.rawAddress, buffer.rawAddress, buffersize.toInt())

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles(vmsavedstatedumphandle.rawAddress)

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider(vmsavedstatedumphandle.rawAddress)

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, globalname: Pcstr, virtualaddress: MutPtr<ULong>, size: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle.rawAddress, vpid.toInt(), globalname.rawAddress, virtualaddress.rawAddress, size.rawAddress)

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: MutPtr<CVoid>, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: MutPtr<CVoid>, foundimagecallback: FoundImageCallback, standaloneaddress: ConstPtr<ULong>, standaloneaddresscount: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages(vmsavedstatedumphandle.rawAddress, vpid.toInt(), startaddress.toLong(), endaddress.toLong(), callbackcontext.rawAddress, 0L, standaloneaddress.rawAddress, standaloneaddresscount.toInt())

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr<CVoid>, memoryblockcachelimit: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit(vmsavedstatedumphandle.rawAddress, memoryblockcachelimit.toLong())

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: MutPtr<CVoid>, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle.rawAddress, 0L)

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: MutPtr<WhvPartitionHandle>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration(migrationhandle.rawAddress, partition.rawAddress)

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: ConstPtr<WhvMemoryRangeEntry>, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: ConstPtr<CVoid>, advicebuffersizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange(partition, gparanges.rawAddress, gparangescount.toInt(), advice, advicebuffer.rawAddress, advicebuffersizeinbytes.toInt())

public actual fun wHvAllocateVpciResource(providerid: ConstPtr<Guid>, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: ConstPtr<CVoid>, resourcedescriptorsizeinbytes: UInt, vpciresource: MutPtr<Handle>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource(providerid.rawAddress, flags, resourcedescriptor.rawAddress, resourcedescriptorsizeinbytes.toInt(), vpciresource.rawAddress)

public actual fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(partition)

public actual fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(partition, vpindex.toInt(), flags.toInt())

public actual fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(partition)

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: ConstPtr<WhvNotificationPortParameters>, eventhandle: Handle, porthandle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort(partition, parameters.rawAddress, eventhandle.rawAddress, porthandle.rawAddress)

public actual fun wHvCreatePartition(partition: MutPtr<WhvPartitionHandle>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvCreatePartition(partition.rawAddress)

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: ConstPtr<WhvTriggerParameters>, triggerhandle: MutPtr<MutPtr<CVoid>>, eventhandle: MutPtr<Handle>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvCreateTrigger(partition, parameters.rawAddress, triggerhandle.rawAddress, eventhandle.rawAddress)

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(partition, vpindex.toInt(), flags.toInt())

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: ConstPtr<WhvVirtualProcessorProperty>, propertycount: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2(partition, vpindex.toInt(), properties.rawAddress, propertycount.toInt())

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice(partition, logicaldeviceid.toLong(), vpciresource.rawAddress, flags, notificationeventhandle.rawAddress)

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort(partition, porthandle.rawAddress)

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvDeletePartition(partition)

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger(partition, triggerhandle.rawAddress)

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(partition, vpindex.toInt())

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(partition, logicaldeviceid.toLong())

public actual fun wHvEmulatorCreateEmulator(callbacks: ConstPtr<WhvEmulatorCallbacks>, emulator: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator(callbacks.rawAddress, emulator.rawAddress)

public actual fun wHvEmulatorDestroyEmulator(emulator: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator(emulator.rawAddress)

public actual fun wHvEmulatorTryIoEmulation(emulator: ConstPtr<CVoid>, context: ConstPtr<CVoid>, vpcontext: ConstPtr<WhvVpExitContext>, ioinstructioncontext: ConstPtr<WhvX64IoPortAccessContext>, emulatorreturnstatus: MutPtr<WhvEmulatorStatus>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation(emulator.rawAddress, context.rawAddress, vpcontext.rawAddress, ioinstructioncontext.rawAddress, emulatorreturnstatus.rawAddress)

public actual fun wHvEmulatorTryMmioEmulation(emulator: ConstPtr<CVoid>, context: ConstPtr<CVoid>, vpcontext: ConstPtr<WhvVpExitContext>, mmioinstructioncontext: ConstPtr<WhvMemoryAccessContext>, emulatorreturnstatus: MutPtr<WhvEmulatorStatus>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation(emulator.rawAddress, context.rawAddress, vpcontext.rawAddress, mmioinstructioncontext.rawAddress, emulatorreturnstatus.rawAddress)

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: MutPtr<CVoid>, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetCapability(capabilitycode, capabilitybuffer.rawAddress, capabilitybuffersizeinbytes.toInt(), writtensizeinbytes.rawAddress)

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: MutPtr<UInt>, vpcount: UInt, targetvpcount: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet(partition, destination.toLong(), destinationmode, targetvps.rawAddress, vpcount.toInt(), targetvpcount.rawAddress)

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters(partition, counterset, buffer.rawAddress, buffersizeinbytes.toInt(), byteswritten.rawAddress)

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: MutPtr<CVoid>, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty(partition, propertycode, propertybuffer.rawAddress, propertybuffersizeinbytes.toInt(), writtensizeinbytes.rawAddress)

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters(partition, vpindex.toInt(), counterset, buffer.rawAddress, buffersizeinbytes.toInt(), byteswritten.rawAddress)

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: MutPtr<WhvCpuidOutput>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput(partition, vpindex.toInt(), eax.toInt(), ecx.toInt(), cpuidoutput.rawAddress)

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr<CVoid>, statesize: UInt, writtensize: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState(partition, vpindex.toInt(), state.rawAddress, statesize.toInt(), writtensize.rawAddress)

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr<CVoid>, statesize: UInt, writtensize: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2(partition, vpindex.toInt(), state.rawAddress, statesize.toInt(), writtensize.rawAddress)

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: MutPtr<WhvRegisterValue>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters(partition, vpindex.toInt(), registernames.rawAddress, registercount.toInt(), registervalues.rawAddress)

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState(partition, vpindex.toInt(), statetype, buffer.rawAddress, buffersizeinbytes.toInt(), byteswritten.rawAddress)

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: MutPtr<CVoid>, buffersizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState(partition, vpindex.toInt(), buffer.rawAddress, buffersizeinbytes.toInt(), byteswritten.rawAddress)

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: MutPtr<WhvVpciInterruptTarget>, targetsizeinbytes: UInt, byteswritten: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget(partition, logicaldeviceid.toLong(), index.toInt(), multimessagenumber.toInt(), target.rawAddress, targetsizeinbytes.toInt(), byteswritten.rawAddress)

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: MutPtr<WhvVpciDeviceNotification>, notificationsizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification(partition, logicaldeviceid.toLong(), notification.rawAddress, notificationsizeinbytes.toInt())

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: MutPtr<CVoid>, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty(partition, logicaldeviceid.toLong(), propertycode, propertybuffer.rawAddress, propertybuffersizeinbytes.toInt(), writtensizeinbytes.rawAddress)

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: ConstPtr<CVoid>, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvMapGpaRange(partition, sourceaddress.rawAddress, guestaddress.toLong(), sizeinbytes.toLong(), flags)

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: ConstPtr<CVoid>, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2(partition, process.rawAddress, sourceaddress.rawAddress, guestaddress.toLong(), sizeinbytes.toLong(), flags)

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: ConstPtr<WhvVpciInterruptTarget>, msiaddress: MutPtr<ULong>, msidata: MutPtr<UInt>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), index.toInt(), messagecount.toInt(), target.rawAddress, msiaddress.rawAddress, msidata.rawAddress)

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: MutPtr<UInt>, mappings: MutPtr<MutPtr<WhvVpciMmioMapping>>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges(partition, logicaldeviceid.toLong(), mappingcount.rawAddress, mappings.rawAddress)

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: ConstPtr<CVoid>, messagesizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage(partition, vpindex.toInt(), sintindex.toInt(), message.rawAddress, messagesizeinbytes.toInt())

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: MutPtr<ULong>, bitmapsizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap(partition, guestaddress.toLong(), rangesizeinbytes.toLong(), bitmap.rawAddress, bitmapsizeinbytes.toInt())

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: MutPtr<CVoid>, datasizeinbytes: UInt): Hresult =
    0

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr<WhvVpciDeviceRegister>, data: MutPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister(partition, logicaldeviceid.toLong(), register.rawAddress, data.rawAddress)

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr<WhvDoorbellMatchData>, eventhandle: Handle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent(partition, matchdata.rawAddress, eventhandle.rawAddress)

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: ConstPtr<WhvInterruptControl>, interruptcontrolsize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt(partition, interrupt.rawAddress, interruptcontrolsize.toInt())

public actual fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), msiaddress.toLong(), msidata.toInt())

public actual fun wHvResetPartition(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvResetPartition(partition)

public actual fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(partition)

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: ConstPtr<WhvVpciInterruptTarget>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), msiaddress.toLong(), msidata.toInt(), target.rawAddress)

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: MutPtr<CVoid>, exitcontextsizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor(partition, vpindex.toInt(), exitcontext.rawAddress, exitcontextsizeinbytes.toInt())

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: ConstPtr<CVoid>, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty(partition, porthandle.rawAddress, propertycode, propertyvalue.toLong())

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: ConstPtr<CVoid>, propertybuffersizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty(partition, propertycode, propertybuffer.rawAddress, propertybuffersizeinbytes.toInt())

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr<CVoid>, statesize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState(partition, vpindex.toInt(), state.rawAddress, statesize.toInt())

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr<CVoid>, statesize: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2(partition, vpindex.toInt(), state.rawAddress, statesize.toInt())

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr<WhvRegisterName>, registercount: UInt, registervalues: ConstPtr<WhvRegisterValue>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters(partition, vpindex.toInt(), registernames.rawAddress, registercount.toInt(), registervalues.rawAddress)

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: ConstPtr<CVoid>, buffersizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState(partition, vpindex.toInt(), statetype, buffer.rawAddress, buffersizeinbytes.toInt())

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: ConstPtr<CVoid>, buffersizeinbytes: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState(partition, vpindex.toInt(), buffer.rawAddress, buffersizeinbytes.toInt())

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(partition, logicaldeviceid.toLong(), powerstate)

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSetupPartition(partition)

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: MutPtr<Bool>): Hresult =
    0

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: MutPtr<Handle>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration(partition, migrationhandle.rawAddress)

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(partition)

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: MutPtr<WhvTranslateGvaResult>, gpa: MutPtr<ULong>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvTranslateGva(partition, vpindex.toInt(), gva.toLong(), translateflags, translationresult.rawAddress, gpa.rawAddress)

public actual fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(partition, guestaddress.toLong(), sizeinbytes.toLong())

public actual fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(partition, logicaldeviceid.toLong(), index.toInt())

public actual fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(partition, logicaldeviceid.toLong())

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr<WhvDoorbellMatchData>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent(partition, matchdata.rawAddress)

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: ConstPtr<WhvTriggerParameters>, triggerhandle: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters(partition, parameters.rawAddress, triggerhandle.rawAddress)

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: ConstPtr<CVoid>, datasizeinbytes: UInt): Hresult =
    0

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr<WhvVpciDeviceRegister>, data: ConstPtr<CVoid>): Hresult =
    WindowsWin32SystemHypervisorJniBridge.windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister(partition, logicaldeviceid.toLong(), register.rawAddress, data.rawAddress)
