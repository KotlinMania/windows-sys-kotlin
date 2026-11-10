@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemHostcomputesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsAddResourceToOperation(operation: Long, type: Int, uri: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsAttachLayerStorageFilter(layerpath: Long, layerdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCancelOperation(operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCloseComputeSystem(computesystem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCloseOperation(operation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCloseProcess(process: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCrashComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystem(id: Long, configuration: Long, operation: Long, securitydescriptor: Long, computesystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystemInNamespace(idnamespace: Long, id: Long, configuration: Long, operation: Long, options: Long, computesystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyGuestStateFile(gueststatefilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperation(context: Long, callback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperationWithNotifications(eventtypes: Int, context: Long, callback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsCreateProcess(computesystem: Long, processparameters: Long, operation: Long, securitydescriptor: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsDestroyLayer(layerpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsDetachLayerStorageFilter(layerpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystems(query: Long, operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystemsInNamespace(idnamespace: Long, query: Long, operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsExportLayer(layerpath: Long, exportfolderpath: Long, layerdata: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsExportLegacyWritableLayer(writablelayermountpath: Long, writablelayerfolderpath: Long, exportfolderpath: Long, layerdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsFormatWritableLayerVhd(vhdhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemFromOperation(operation: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemProperties(computesystem: Long, operation: Long, propertyquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetLayerVhdMountPath(vhdhandle: Long, mountpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationContext(operation: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationId(operation: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResult(operation: Long, resultdocument: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResultAndProcessInfo(operation: Long, processinformation: Long, resultdocument: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationType(operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessFromOperation(operation: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessInfo(process: Long, operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessProperties(process: Long, operation: Long, propertyquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessorCompatibilityFromSavedState(runtimefilename: Long, processorfeaturesstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGetServiceProperties(propertyquery: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmAccess(vmid: Long, filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmGroupAccess(filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsImportLayer(layerpath: Long, sourcefolderpath: Long, layerdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsInitializeLegacyWritableLayer(writablelayermountpath: Long, writablelayerfolderpath: Long, layerdata: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsInitializeWritableLayer(writablelayerpath: Long, layerdata: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsModifyComputeSystem(computesystem: Long, operation: Long, configuration: Long, identity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsModifyProcess(process: Long, operation: Long, settings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsModifyServiceSettings(settings: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystem(id: Long, requestedaccess: Int, computesystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystemInNamespace(idnamespace: Long, id: Long, requestedaccess: Int, computesystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsOpenProcess(computesystem: Long, processid: Int, requestedaccess: Int, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsPauseComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsResumeComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmAccess(vmid: Long, filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmGroupAccess(filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsSaveComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsSetComputeSystemCallback(computesystem: Long, callbackoptions: Int, context: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationCallback(operation: Long, context: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationContext(operation: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsSetProcessCallback(process: Long, callbackoptions: Int, context: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSLayer(layerpath: Long, vhdhandle: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSVolume(layerpath: Long, volumepath: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsShutDownComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsSignalProcess(process: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsStartComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsSubmitWerReport(settings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsTerminateComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsTerminateProcess(process: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsWaitForComputeSystemExit(computesystem: Long, timeoutms: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResult(operation: Long, timeoutms: Int, resultdocument: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResultAndProcessInfo(operation: Long, timeoutms: Int, processinformation: Long, resultdocument: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_hcsWaitForProcessExit(computesystem: Long, timeoutms: Int, result: Long): Int
}

public actual fun hcsAddResourceToOperation(operation: HcsOperation, type: HcsResourceType, uri: Pcwstr, handle: Handle): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsAddResourceToOperation((operation?.value ?: 0L), type, (uri?.value ?: 0L), (handle?.value ?: 0L))

public actual fun hcsAttachLayerStorageFilter(layerpath: Pcwstr, layerdata: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsAttachLayerStorageFilter((layerpath?.value ?: 0L), (layerdata?.value ?: 0L))

public actual fun hcsCancelOperation(operation: HcsOperation): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCancelOperation((operation?.value ?: 0L))

public actual fun hcsCloseComputeSystem(computesystem: HcsSystem) {
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCloseComputeSystem((computesystem?.value ?: 0L))
}

public actual fun hcsCloseOperation(operation: HcsOperation) {
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCloseOperation((operation?.value ?: 0L))
}

public actual fun hcsCloseProcess(process: HcsProcess) {
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCloseProcess((process?.value ?: 0L))
}

public actual fun hcsCrashComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCrashComputeSystem((computesystem?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsCreateComputeSystem(id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, securitydescriptor: COpaquePointer?, computesystem: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystem((id?.value ?: 0L), (configuration?.value ?: 0L), (operation?.value ?: 0L), (securitydescriptor?.value ?: 0L), (computesystem?.value ?: 0L))

public actual fun hcsCreateComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, options: COpaquePointer?, computesystem: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystemInNamespace((idnamespace?.value ?: 0L), (id?.value ?: 0L), (configuration?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L), (computesystem?.value ?: 0L))

public actual fun hcsCreateEmptyGuestStateFile(gueststatefilepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyGuestStateFile((gueststatefilepath?.value ?: 0L))

public actual fun hcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyRuntimeStateFile((runtimestatefilepath?.value ?: 0L))

public actual fun hcsCreateOperation(context: COpaquePointer?, callback: HcsOperationCompletion): HcsOperation =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperation((context?.value ?: 0L), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcsCreateOperationWithNotifications(eventtypes: HcsOperationOptions, context: COpaquePointer?, callback: HcsEventCallback): HcsOperation =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperationWithNotifications(eventtypes, (context?.value ?: 0L), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcsCreateProcess(computesystem: HcsSystem, processparameters: Pcwstr, operation: HcsOperation, securitydescriptor: COpaquePointer?, process: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsCreateProcess((computesystem?.value ?: 0L), (processparameters?.value ?: 0L), (operation?.value ?: 0L), (securitydescriptor?.value ?: 0L), (process?.value ?: 0L))

public actual fun hcsDestroyLayer(layerpath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsDestroyLayer((layerpath?.value ?: 0L))

public actual fun hcsDetachLayerStorageFilter(layerpath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsDetachLayerStorageFilter((layerpath?.value ?: 0L))

public actual fun hcsEnumerateComputeSystems(query: Pcwstr, operation: HcsOperation): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystems((query?.value ?: 0L), (operation?.value ?: 0L))

public actual fun hcsEnumerateComputeSystemsInNamespace(idnamespace: Pcwstr, query: Pcwstr, operation: HcsOperation): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystemsInNamespace((idnamespace?.value ?: 0L), (query?.value ?: 0L), (operation?.value ?: 0L))

public actual fun hcsExportLayer(layerpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsExportLayer((layerpath?.value ?: 0L), (exportfolderpath?.value ?: 0L), (layerdata?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsExportLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsExportLegacyWritableLayer((writablelayermountpath?.value ?: 0L), (writablelayerfolderpath?.value ?: 0L), (exportfolderpath?.value ?: 0L), (layerdata?.value ?: 0L))

public actual fun hcsFormatWritableLayerVhd(vhdhandle: Handle): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsFormatWritableLayerVhd((vhdhandle?.value ?: 0L))

public actual fun hcsGetComputeSystemFromOperation(operation: HcsOperation): HcsSystem =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemFromOperation((operation?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcsGetComputeSystemProperties(computesystem: HcsSystem, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemProperties((computesystem?.value ?: 0L), (operation?.value ?: 0L), (propertyquery?.value ?: 0L))

public actual fun hcsGetLayerVhdMountPath(vhdhandle: Handle, mountpath: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetLayerVhdMountPath((vhdhandle?.value ?: 0L), (mountpath?.value ?: 0L))

public actual fun hcsGetOperationContext(operation: HcsOperation): COpaquePointer? =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationContext((operation?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcsGetOperationId(operation: HcsOperation): ULong =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationId((operation?.value ?: 0L)).toULong()

public actual fun hcsGetOperationResult(operation: HcsOperation, resultdocument: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResult((operation?.value ?: 0L), (resultdocument?.value ?: 0L))

public actual fun hcsGetOperationResultAndProcessInfo(operation: HcsOperation, processinformation: COpaquePointer?, resultdocument: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResultAndProcessInfo((operation?.value ?: 0L), (processinformation?.value ?: 0L), (resultdocument?.value ?: 0L))

public actual fun hcsGetOperationType(operation: HcsOperation): HcsOperationType =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationType((operation?.value ?: 0L))

public actual fun hcsGetProcessFromOperation(operation: HcsOperation): HcsProcess =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessFromOperation((operation?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcsGetProcessInfo(process: HcsProcess, operation: HcsOperation): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessInfo((process?.value ?: 0L), (operation?.value ?: 0L))

public actual fun hcsGetProcessProperties(process: HcsProcess, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessProperties((process?.value ?: 0L), (operation?.value ?: 0L), (propertyquery?.value ?: 0L))

public actual fun hcsGetProcessorCompatibilityFromSavedState(runtimefilename: Pcwstr, processorfeaturesstring: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessorCompatibilityFromSavedState((runtimefilename?.value ?: 0L), (processorfeaturesstring?.value ?: 0L))

public actual fun hcsGetServiceProperties(propertyquery: Pcwstr, result: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGetServiceProperties((propertyquery?.value ?: 0L), (result?.value ?: 0L))

public actual fun hcsGrantVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmAccess((vmid?.value ?: 0L), (filepath?.value ?: 0L))

public actual fun hcsGrantVmGroupAccess(filepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmGroupAccess((filepath?.value ?: 0L))

public actual fun hcsImportLayer(layerpath: Pcwstr, sourcefolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsImportLayer((layerpath?.value ?: 0L), (sourcefolderpath?.value ?: 0L), (layerdata?.value ?: 0L))

public actual fun hcsInitializeLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsInitializeLegacyWritableLayer((writablelayermountpath?.value ?: 0L), (writablelayerfolderpath?.value ?: 0L), (layerdata?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsInitializeWritableLayer(writablelayerpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsInitializeWritableLayer((writablelayerpath?.value ?: 0L), (layerdata?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsModifyComputeSystem(computesystem: HcsSystem, operation: HcsOperation, configuration: Pcwstr, identity: Handle): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsModifyComputeSystem((computesystem?.value ?: 0L), (operation?.value ?: 0L), (configuration?.value ?: 0L), (identity?.value ?: 0L))

public actual fun hcsModifyProcess(process: HcsProcess, operation: HcsOperation, settings: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsModifyProcess((process?.value ?: 0L), (operation?.value ?: 0L), (settings?.value ?: 0L))

public actual fun hcsModifyServiceSettings(settings: Pcwstr, result: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsModifyServiceSettings((settings?.value ?: 0L), (result?.value ?: 0L))

public actual fun hcsOpenComputeSystem(id: Pcwstr, requestedaccess: UInt, computesystem: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystem((id?.value ?: 0L), requestedaccess.toInt(), (computesystem?.value ?: 0L))

public actual fun hcsOpenComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, requestedaccess: UInt, computesystem: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystemInNamespace((idnamespace?.value ?: 0L), (id?.value ?: 0L), requestedaccess.toInt(), (computesystem?.value ?: 0L))

public actual fun hcsOpenProcess(computesystem: HcsSystem, processid: UInt, requestedaccess: UInt, process: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsOpenProcess((computesystem?.value ?: 0L), processid.toInt(), requestedaccess.toInt(), (process?.value ?: 0L))

public actual fun hcsPauseComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsPauseComputeSystem((computesystem?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsResumeComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsResumeComputeSystem((computesystem?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsRevokeVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmAccess((vmid?.value ?: 0L), (filepath?.value ?: 0L))

public actual fun hcsRevokeVmGroupAccess(filepath: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmGroupAccess((filepath?.value ?: 0L))

public actual fun hcsSaveComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsSaveComputeSystem((computesystem?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsSetComputeSystemCallback(computesystem: HcsSystem, callbackoptions: HcsEventOptions, context: COpaquePointer?, callback: HcsEventCallback): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsSetComputeSystemCallback((computesystem?.value ?: 0L), callbackoptions, (context?.value ?: 0L), 0L)

public actual fun hcsSetOperationCallback(operation: HcsOperation, context: COpaquePointer?, callback: HcsOperationCompletion): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationCallback((operation?.value ?: 0L), (context?.value ?: 0L), 0L)

public actual fun hcsSetOperationContext(operation: HcsOperation, context: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationContext((operation?.value ?: 0L), (context?.value ?: 0L))

public actual fun hcsSetProcessCallback(process: HcsProcess, callbackoptions: HcsEventOptions, context: COpaquePointer?, callback: HcsEventCallback): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsSetProcessCallback((process?.value ?: 0L), callbackoptions, (context?.value ?: 0L), 0L)

public actual fun hcsSetupBaseOSLayer(layerpath: Pcwstr, vhdhandle: Handle, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSLayer((layerpath?.value ?: 0L), (vhdhandle?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsSetupBaseOSVolume(layerpath: Pcwstr, volumepath: Pcwstr, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSVolume((layerpath?.value ?: 0L), (volumepath?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsShutDownComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsShutDownComputeSystem((computesystem?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsSignalProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsSignalProcess((process?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsStartComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsStartComputeSystem((computesystem?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsSubmitWerReport(settings: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsSubmitWerReport((settings?.value ?: 0L))

public actual fun hcsTerminateComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsTerminateComputeSystem((computesystem?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsTerminateProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsTerminateProcess((process?.value ?: 0L), (operation?.value ?: 0L), (options?.value ?: 0L))

public actual fun hcsWaitForComputeSystemExit(computesystem: HcsSystem, timeoutms: UInt, result: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForComputeSystemExit((computesystem?.value ?: 0L), timeoutms.toInt(), (result?.value ?: 0L))

public actual fun hcsWaitForOperationResult(operation: HcsOperation, timeoutms: UInt, resultdocument: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResult((operation?.value ?: 0L), timeoutms.toInt(), (resultdocument?.value ?: 0L))

public actual fun hcsWaitForOperationResultAndProcessInfo(operation: HcsOperation, timeoutms: UInt, processinformation: COpaquePointer?, resultdocument: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResultAndProcessInfo((operation?.value ?: 0L), timeoutms.toInt(), (processinformation?.value ?: 0L), (resultdocument?.value ?: 0L))

public actual fun hcsWaitForProcessExit(computesystem: HcsProcess, timeoutms: UInt, result: COpaquePointer?): Hresult =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForProcessExit((computesystem?.value ?: 0L), timeoutms.toInt(), (result?.value ?: 0L))
