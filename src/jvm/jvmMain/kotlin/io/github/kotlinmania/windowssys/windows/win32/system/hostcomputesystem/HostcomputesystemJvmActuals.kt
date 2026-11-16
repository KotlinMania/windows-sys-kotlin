@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemHostcomputesystemJniBridge {
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
        val stream = WindowsWin32SystemHostcomputesystemJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation(operation: Long, type: Int, uri: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter(layerpath: Long, layerdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation(operation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem(computesystem: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation(operation: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess(process: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem(id: Long, configuration: Long, operation: Long, securitydescriptor: Long, computesystem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace(idnamespace: Long, id: Long, configuration: Long, operation: Long, options: Long, computesystem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile(gueststatefilepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation(context: Long, callback: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications(eventtypes: Int, context: Long, callback: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess(computesystem: Long, processparameters: Long, operation: Long, securitydescriptor: Long, process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer(layerpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter(layerpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems(query: Long, operation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace(idnamespace: Long, query: Long, operation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsExportLayer(layerpath: Long, exportfolderpath: Long, layerdata: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer(writablelayermountpath: Long, writablelayerfolderpath: Long, exportfolderpath: Long, layerdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd(vhdhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation(operation: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties(computesystem: Long, operation: Long, propertyquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath(vhdhandle: Long, mountpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext(operation: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId(operation: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult(operation: Long, resultdocument: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo(operation: Long, processinformation: Long, resultdocument: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType(operation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation(operation: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo(process: Long, operation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties(process: Long, operation: Long, propertyquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState(runtimefilename: Long, processorfeaturesstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties(propertyquery: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess(vmid: Long, filepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess(filepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsImportLayer(layerpath: Long, sourcefolderpath: Long, layerdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer(writablelayermountpath: Long, writablelayerfolderpath: Long, layerdata: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer(writablelayerpath: Long, layerdata: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem(computesystem: Long, operation: Long, configuration: Long, identity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess(process: Long, operation: Long, settings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings(settings: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem(id: Long, requestedaccess: Int, computesystem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace(idnamespace: Long, id: Long, requestedaccess: Int, computesystem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess(computesystem: Long, processid: Int, requestedaccess: Int, process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess(vmid: Long, filepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess(filepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback(computesystem: Long, callbackoptions: Int, context: Long, callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback(operation: Long, context: Long, callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext(operation: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback(process: Long, callbackoptions: Int, context: Long, callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer(layerpath: Long, vhdhandle: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume(layerpath: Long, volumepath: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess(process: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport(settings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess(process: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit(computesystem: Long, timeoutms: Int, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult(operation: Long, timeoutms: Int, resultdocument: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo(operation: Long, timeoutms: Int, processinformation: Long, resultdocument: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit(computesystem: Long, timeoutms: Int, result: Long): Int
}

public actual fun hcsAddResourceToOperation(operation: HcsOperation, type: HcsResourceType, uri: Pcwstr, handle: Handle): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation(operation.rawAddress, type, uri.rawAddress, handle.rawAddress)

public actual fun hcsAttachLayerStorageFilter(layerpath: Pcwstr, layerdata: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter(layerpath.rawAddress, layerdata.rawAddress)

public actual fun hcsCancelOperation(operation: HcsOperation): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation(operation.rawAddress)

public actual fun hcsCloseComputeSystem(computesystem: HcsSystem) {
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem(computesystem.rawAddress)
}

public actual fun hcsCloseOperation(operation: HcsOperation) {
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation(operation.rawAddress)
}

public actual fun hcsCloseProcess(process: HcsProcess) {
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess(process.rawAddress)
}

public actual fun hcsCrashComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem(computesystem.rawAddress, operation.rawAddress, options.rawAddress)

public actual fun hcsCreateComputeSystem(id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr, computesystem: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem(id.rawAddress, configuration.rawAddress, operation.rawAddress, securitydescriptor.rawAddress, computesystem.rawAddress)

public actual fun hcsCreateComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, options: ConstPtr, computesystem: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace(idnamespace.rawAddress, id.rawAddress, configuration.rawAddress, operation.rawAddress, options.rawAddress, computesystem.rawAddress)

public actual fun hcsCreateEmptyGuestStateFile(gueststatefilepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile(gueststatefilepath.rawAddress)

public actual fun hcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile(runtimestatefilepath.rawAddress)

public actual fun hcsCreateOperation(context: ConstPtr, callback: HcsOperationCompletion): HcsOperation =
    MutPtr(WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation(context.rawAddress, 0L))

public actual fun hcsCreateOperationWithNotifications(eventtypes: HcsOperationOptions, context: ConstPtr, callback: HcsEventCallback): HcsOperation =
    MutPtr(WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications(eventtypes, context.rawAddress, 0L))

public actual fun hcsCreateProcess(computesystem: HcsSystem, processparameters: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr, process: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess(computesystem.rawAddress, processparameters.rawAddress, operation.rawAddress, securitydescriptor.rawAddress, process.rawAddress)

public actual fun hcsDestroyLayer(layerpath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer(layerpath.rawAddress)

public actual fun hcsDetachLayerStorageFilter(layerpath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter(layerpath.rawAddress)

public actual fun hcsEnumerateComputeSystems(query: Pcwstr, operation: HcsOperation): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems(query.rawAddress, operation.rawAddress)

public actual fun hcsEnumerateComputeSystemsInNamespace(idnamespace: Pcwstr, query: Pcwstr, operation: HcsOperation): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace(idnamespace.rawAddress, query.rawAddress, operation.rawAddress)

public actual fun hcsExportLayer(layerpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsExportLayer(layerpath.rawAddress, exportfolderpath.rawAddress, layerdata.rawAddress, options.rawAddress)

public actual fun hcsExportLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer(writablelayermountpath.rawAddress, writablelayerfolderpath.rawAddress, exportfolderpath.rawAddress, layerdata.rawAddress)

public actual fun hcsFormatWritableLayerVhd(vhdhandle: Handle): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd(vhdhandle.rawAddress)

public actual fun hcsGetComputeSystemFromOperation(operation: HcsOperation): HcsSystem =
    MutPtr(WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation(operation.rawAddress))

public actual fun hcsGetComputeSystemProperties(computesystem: HcsSystem, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties(computesystem.rawAddress, operation.rawAddress, propertyquery.rawAddress)

public actual fun hcsGetLayerVhdMountPath(vhdhandle: Handle, mountpath: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath(vhdhandle.rawAddress, mountpath.rawAddress)

public actual fun hcsGetOperationContext(operation: HcsOperation): MutPtr =
    MutPtr(WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext(operation.rawAddress))

public actual fun hcsGetOperationId(operation: HcsOperation): ULong =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId(operation.rawAddress).toULong()

public actual fun hcsGetOperationResult(operation: HcsOperation, resultdocument: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult(operation.rawAddress, resultdocument.rawAddress)

public actual fun hcsGetOperationResultAndProcessInfo(operation: HcsOperation, processinformation: MutPtr, resultdocument: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo(operation.rawAddress, processinformation.rawAddress, resultdocument.rawAddress)

public actual fun hcsGetOperationType(operation: HcsOperation): HcsOperationType =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType(operation.rawAddress)

public actual fun hcsGetProcessFromOperation(operation: HcsOperation): HcsProcess =
    MutPtr(WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation(operation.rawAddress))

public actual fun hcsGetProcessInfo(process: HcsProcess, operation: HcsOperation): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo(process.rawAddress, operation.rawAddress)

public actual fun hcsGetProcessProperties(process: HcsProcess, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties(process.rawAddress, operation.rawAddress, propertyquery.rawAddress)

public actual fun hcsGetProcessorCompatibilityFromSavedState(runtimefilename: Pcwstr, processorfeaturesstring: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState(runtimefilename.rawAddress, processorfeaturesstring.rawAddress)

public actual fun hcsGetServiceProperties(propertyquery: Pcwstr, result: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties(propertyquery.rawAddress, result.rawAddress)

public actual fun hcsGrantVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess(vmid.rawAddress, filepath.rawAddress)

public actual fun hcsGrantVmGroupAccess(filepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess(filepath.rawAddress)

public actual fun hcsImportLayer(layerpath: Pcwstr, sourcefolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsImportLayer(layerpath.rawAddress, sourcefolderpath.rawAddress, layerdata.rawAddress)

public actual fun hcsInitializeLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer(writablelayermountpath.rawAddress, writablelayerfolderpath.rawAddress, layerdata.rawAddress, options.rawAddress)

public actual fun hcsInitializeWritableLayer(writablelayerpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer(writablelayerpath.rawAddress, layerdata.rawAddress, options.rawAddress)

public actual fun hcsModifyComputeSystem(computesystem: HcsSystem, operation: HcsOperation, configuration: Pcwstr, identity: Handle): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem(computesystem.rawAddress, operation.rawAddress, configuration.rawAddress, identity.rawAddress)

public actual fun hcsModifyProcess(process: HcsProcess, operation: HcsOperation, settings: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess(process.rawAddress, operation.rawAddress, settings.rawAddress)

public actual fun hcsModifyServiceSettings(settings: Pcwstr, result: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings(settings.rawAddress, result.rawAddress)

public actual fun hcsOpenComputeSystem(id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem(id.rawAddress, requestedaccess.toInt(), computesystem.rawAddress)

public actual fun hcsOpenComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace(idnamespace.rawAddress, id.rawAddress, requestedaccess.toInt(), computesystem.rawAddress)

public actual fun hcsOpenProcess(computesystem: HcsSystem, processid: UInt, requestedaccess: UInt, process: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess(computesystem.rawAddress, processid.toInt(), requestedaccess.toInt(), process.rawAddress)

public actual fun hcsPauseComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem(computesystem.rawAddress, operation.rawAddress, options.rawAddress)

public actual fun hcsResumeComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem(computesystem.rawAddress, operation.rawAddress, options.rawAddress)

public actual fun hcsRevokeVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess(vmid.rawAddress, filepath.rawAddress)

public actual fun hcsRevokeVmGroupAccess(filepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess(filepath.rawAddress)

public actual fun hcsSaveComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem(computesystem.rawAddress, operation.rawAddress, options.rawAddress)

public actual fun hcsSetComputeSystemCallback(computesystem: HcsSystem, callbackoptions: HcsEventOptions, context: ConstPtr, callback: HcsEventCallback): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback(computesystem.rawAddress, callbackoptions, context.rawAddress, 0L)

public actual fun hcsSetOperationCallback(operation: HcsOperation, context: ConstPtr, callback: HcsOperationCompletion): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback(operation.rawAddress, context.rawAddress, 0L)

public actual fun hcsSetOperationContext(operation: HcsOperation, context: ConstPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext(operation.rawAddress, context.rawAddress)

public actual fun hcsSetProcessCallback(process: HcsProcess, callbackoptions: HcsEventOptions, context: ConstPtr, callback: HcsEventCallback): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback(process.rawAddress, callbackoptions, context.rawAddress, 0L)

public actual fun hcsSetupBaseOSLayer(layerpath: Pcwstr, vhdhandle: Handle, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer(layerpath.rawAddress, vhdhandle.rawAddress, options.rawAddress)

public actual fun hcsSetupBaseOSVolume(layerpath: Pcwstr, volumepath: Pcwstr, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume(layerpath.rawAddress, volumepath.rawAddress, options.rawAddress)

public actual fun hcsShutDownComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem(computesystem.rawAddress, operation.rawAddress, options.rawAddress)

public actual fun hcsSignalProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess(process.rawAddress, operation.rawAddress, options.rawAddress)

public actual fun hcsStartComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem(computesystem.rawAddress, operation.rawAddress, options.rawAddress)

public actual fun hcsSubmitWerReport(settings: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport(settings.rawAddress)

public actual fun hcsTerminateComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem(computesystem.rawAddress, operation.rawAddress, options.rawAddress)

public actual fun hcsTerminateProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess(process.rawAddress, operation.rawAddress, options.rawAddress)

public actual fun hcsWaitForComputeSystemExit(computesystem: HcsSystem, timeoutms: UInt, result: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit(computesystem.rawAddress, timeoutms.toInt(), result.rawAddress)

public actual fun hcsWaitForOperationResult(operation: HcsOperation, timeoutms: UInt, resultdocument: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult(operation.rawAddress, timeoutms.toInt(), resultdocument.rawAddress)

public actual fun hcsWaitForOperationResultAndProcessInfo(operation: HcsOperation, timeoutms: UInt, processinformation: MutPtr, resultdocument: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo(operation.rawAddress, timeoutms.toInt(), processinformation.rawAddress, resultdocument.rawAddress)

public actual fun hcsWaitForProcessExit(computesystem: HcsProcess, timeoutms: UInt, result: MutPtr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit(computesystem.rawAddress, timeoutms.toInt(), result.rawAddress)
