@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemHostcomputesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsAddResourceToOperation(operation: Long, type: Int, uri: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsAttachLayerStorageFilter(layerpath: Long, layerdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCancelOperation(operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCloseComputeSystem(computesystem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCloseOperation(operation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCloseProcess(process: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCrashComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystem(id: Long, configuration: Long, operation: Long, securitydescriptor: Long, computesystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystemInNamespace(idnamespace: Long, id: Long, configuration: Long, operation: Long, options: Long, computesystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyGuestStateFile(gueststatefilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperation(context: Long, callback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperationWithNotifications(eventtypes: Int, context: Long, callback: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsCreateProcess(computesystem: Long, processparameters: Long, operation: Long, securitydescriptor: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsDestroyLayer(layerpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsDetachLayerStorageFilter(layerpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystems(query: Long, operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystemsInNamespace(idnamespace: Long, query: Long, operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsExportLayer(layerpath: Long, exportfolderpath: Long, layerdata: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsExportLegacyWritableLayer(writablelayermountpath: Long, writablelayerfolderpath: Long, exportfolderpath: Long, layerdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsFormatWritableLayerVhd(vhdhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemFromOperation(operation: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemProperties(computesystem: Long, operation: Long, propertyquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetLayerVhdMountPath(vhdhandle: Long, mountpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationContext(operation: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationId(operation: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResult(operation: Long, resultdocument: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResultAndProcessInfo(operation: Long, processinformation: Long, resultdocument: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationType(operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessFromOperation(operation: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessInfo(process: Long, operation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessProperties(process: Long, operation: Long, propertyquery: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessorCompatibilityFromSavedState(runtimefilename: Long, processorfeaturesstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGetServiceProperties(propertyquery: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmAccess(vmid: Long, filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmGroupAccess(filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsImportLayer(layerpath: Long, sourcefolderpath: Long, layerdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsInitializeLegacyWritableLayer(writablelayermountpath: Long, writablelayerfolderpath: Long, layerdata: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsInitializeWritableLayer(writablelayerpath: Long, layerdata: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsModifyComputeSystem(computesystem: Long, operation: Long, configuration: Long, identity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsModifyProcess(process: Long, operation: Long, settings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsModifyServiceSettings(settings: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystem(id: Long, requestedaccess: Int, computesystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystemInNamespace(idnamespace: Long, id: Long, requestedaccess: Int, computesystem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsOpenProcess(computesystem: Long, processid: Int, requestedaccess: Int, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsPauseComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsResumeComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmAccess(vmid: Long, filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmGroupAccess(filepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsSaveComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsSetComputeSystemCallback(computesystem: Long, callbackoptions: Int, context: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationCallback(operation: Long, context: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationContext(operation: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsSetProcessCallback(process: Long, callbackoptions: Int, context: Long, callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSLayer(layerpath: Long, vhdhandle: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSVolume(layerpath: Long, volumepath: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsShutDownComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsSignalProcess(process: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsStartComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsSubmitWerReport(settings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsTerminateComputeSystem(computesystem: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsTerminateProcess(process: Long, operation: Long, options: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsWaitForComputeSystemExit(computesystem: Long, timeoutms: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResult(operation: Long, timeoutms: Int, resultdocument: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResultAndProcessInfo(operation: Long, timeoutms: Int, processinformation: Long, resultdocument: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_hostcomputesystem_HcsWaitForProcessExit(computesystem: Long, timeoutms: Int, result: Long): Int
}

public actual fun HcsAddResourceToOperation(operation: HCS_OPERATION, type: HCS_RESOURCE_TYPE, uri: PCWSTR, handle: HANDLE): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsAddResourceToOperation(operation, type, uri, handle)

public actual fun HcsAttachLayerStorageFilter(layerpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsAttachLayerStorageFilter(layerpath, layerdata)

public actual fun HcsCancelOperation(operation: HCS_OPERATION): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCancelOperation(operation)

public actual fun HcsCloseComputeSystem(computesystem: HCS_SYSTEM) {
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCloseComputeSystem(computesystem)
}

public actual fun HcsCloseOperation(operation: HCS_OPERATION) {
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCloseOperation(operation)
}

public actual fun HcsCloseProcess(process: HCS_PROCESS) {
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCloseProcess(process)
}

public actual fun HcsCrashComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCrashComputeSystem(computesystem, operation, options)

public actual fun HcsCreateComputeSystem(id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, computesystem: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystem(id, configuration, operation, securitydescriptor, computesystem)

public actual fun HcsCreateComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, options: Long, computesystem: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystemInNamespace(idnamespace, id, configuration, operation, options, computesystem)

public actual fun HcsCreateEmptyGuestStateFile(gueststatefilepath: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyGuestStateFile(gueststatefilepath)

public actual fun HcsCreateEmptyRuntimeStateFile(runtimestatefilepath: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyRuntimeStateFile(runtimestatefilepath)

public actual fun HcsCreateOperation(context: Long, callback: HCS_OPERATION_COMPLETION): HCS_OPERATION =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperation(context, callback.toLong())

public actual fun HcsCreateOperationWithNotifications(eventtypes: HCS_OPERATION_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HCS_OPERATION =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperationWithNotifications(eventtypes, context, callback.toLong())

public actual fun HcsCreateProcess(computesystem: HCS_SYSTEM, processparameters: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, process: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsCreateProcess(computesystem, processparameters, operation, securitydescriptor, process)

public actual fun HcsDestroyLayer(layerpath: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsDestroyLayer(layerpath)

public actual fun HcsDetachLayerStorageFilter(layerpath: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsDetachLayerStorageFilter(layerpath)

public actual fun HcsEnumerateComputeSystems(query: PCWSTR, operation: HCS_OPERATION): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystems(query, operation)

public actual fun HcsEnumerateComputeSystemsInNamespace(idnamespace: PCWSTR, query: PCWSTR, operation: HCS_OPERATION): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystemsInNamespace(idnamespace, query, operation)

public actual fun HcsExportLayer(layerpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsExportLayer(layerpath, exportfolderpath, layerdata, options)

public actual fun HcsExportLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsExportLegacyWritableLayer(writablelayermountpath, writablelayerfolderpath, exportfolderpath, layerdata)

public actual fun HcsFormatWritableLayerVhd(vhdhandle: HANDLE): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsFormatWritableLayerVhd(vhdhandle)

public actual fun HcsGetComputeSystemFromOperation(operation: HCS_OPERATION): HCS_SYSTEM =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemFromOperation(operation)

public actual fun HcsGetComputeSystemProperties(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemProperties(computesystem, operation, propertyquery)

public actual fun HcsGetLayerVhdMountPath(vhdhandle: HANDLE, mountpath: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetLayerVhdMountPath(vhdhandle, mountpath)

public actual fun HcsGetOperationContext(operation: HCS_OPERATION): Long =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationContext(operation)

public actual fun HcsGetOperationId(operation: HCS_OPERATION): ULong =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationId(operation).toULong()

public actual fun HcsGetOperationResult(operation: HCS_OPERATION, resultdocument: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResult(operation, resultdocument)

public actual fun HcsGetOperationResultAndProcessInfo(operation: HCS_OPERATION, processinformation: Long, resultdocument: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResultAndProcessInfo(operation, processinformation, resultdocument)

public actual fun HcsGetOperationType(operation: HCS_OPERATION): HCS_OPERATION_TYPE =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationType(operation)

public actual fun HcsGetProcessFromOperation(operation: HCS_OPERATION): HCS_PROCESS =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessFromOperation(operation)

public actual fun HcsGetProcessInfo(process: HCS_PROCESS, operation: HCS_OPERATION): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessInfo(process, operation)

public actual fun HcsGetProcessProperties(process: HCS_PROCESS, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessProperties(process, operation, propertyquery)

public actual fun HcsGetProcessorCompatibilityFromSavedState(runtimefilename: PCWSTR, processorfeaturesstring: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessorCompatibilityFromSavedState(runtimefilename, processorfeaturesstring)

public actual fun HcsGetServiceProperties(propertyquery: PCWSTR, result: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGetServiceProperties(propertyquery, result)

public actual fun HcsGrantVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmAccess(vmid, filepath)

public actual fun HcsGrantVmGroupAccess(filepath: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmGroupAccess(filepath)

public actual fun HcsImportLayer(layerpath: PCWSTR, sourcefolderpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsImportLayer(layerpath, sourcefolderpath, layerdata)

public actual fun HcsInitializeLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsInitializeLegacyWritableLayer(writablelayermountpath, writablelayerfolderpath, layerdata, options)

public actual fun HcsInitializeWritableLayer(writablelayerpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsInitializeWritableLayer(writablelayerpath, layerdata, options)

public actual fun HcsModifyComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, configuration: PCWSTR, identity: HANDLE): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsModifyComputeSystem(computesystem, operation, configuration, identity)

public actual fun HcsModifyProcess(process: HCS_PROCESS, operation: HCS_OPERATION, settings: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsModifyProcess(process, operation, settings)

public actual fun HcsModifyServiceSettings(settings: PCWSTR, result: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsModifyServiceSettings(settings, result)

public actual fun HcsOpenComputeSystem(id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystem(id, requestedaccess.toInt(), computesystem)

public actual fun HcsOpenComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystemInNamespace(idnamespace, id, requestedaccess.toInt(), computesystem)

public actual fun HcsOpenProcess(computesystem: HCS_SYSTEM, processid: UInt, requestedaccess: UInt, process: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsOpenProcess(computesystem, processid.toInt(), requestedaccess.toInt(), process)

public actual fun HcsPauseComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsPauseComputeSystem(computesystem, operation, options)

public actual fun HcsResumeComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsResumeComputeSystem(computesystem, operation, options)

public actual fun HcsRevokeVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmAccess(vmid, filepath)

public actual fun HcsRevokeVmGroupAccess(filepath: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmGroupAccess(filepath)

public actual fun HcsSaveComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsSaveComputeSystem(computesystem, operation, options)

public actual fun HcsSetComputeSystemCallback(computesystem: HCS_SYSTEM, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsSetComputeSystemCallback(computesystem, callbackoptions, context, callback.toLong())

public actual fun HcsSetOperationCallback(operation: HCS_OPERATION, context: Long, callback: HCS_OPERATION_COMPLETION): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationCallback(operation, context, callback.toLong())

public actual fun HcsSetOperationContext(operation: HCS_OPERATION, context: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationContext(operation, context)

public actual fun HcsSetProcessCallback(process: HCS_PROCESS, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsSetProcessCallback(process, callbackoptions, context, callback.toLong())

public actual fun HcsSetupBaseOSLayer(layerpath: PCWSTR, vhdhandle: HANDLE, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSLayer(layerpath, vhdhandle, options)

public actual fun HcsSetupBaseOSVolume(layerpath: PCWSTR, volumepath: PCWSTR, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSVolume(layerpath, volumepath, options)

public actual fun HcsShutDownComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsShutDownComputeSystem(computesystem, operation, options)

public actual fun HcsSignalProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsSignalProcess(process, operation, options)

public actual fun HcsStartComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsStartComputeSystem(computesystem, operation, options)

public actual fun HcsSubmitWerReport(settings: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsSubmitWerReport(settings)

public actual fun HcsTerminateComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsTerminateComputeSystem(computesystem, operation, options)

public actual fun HcsTerminateProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsTerminateProcess(process, operation, options)

public actual fun HcsWaitForComputeSystemExit(computesystem: HCS_SYSTEM, timeoutms: UInt, result: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForComputeSystemExit(computesystem, timeoutms.toInt(), result)

public actual fun HcsWaitForOperationResult(operation: HCS_OPERATION, timeoutms: UInt, resultdocument: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResult(operation, timeoutms.toInt(), resultdocument)

public actual fun HcsWaitForOperationResultAndProcessInfo(operation: HCS_OPERATION, timeoutms: UInt, processinformation: Long, resultdocument: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResultAndProcessInfo(operation, timeoutms.toInt(), processinformation, resultdocument)

public actual fun HcsWaitForProcessExit(computesystem: HCS_PROCESS, timeoutms: UInt, result: Long): HRESULT =
    WindowsWin32SystemHostcomputesystemJniBridge.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForProcessExit(computesystem, timeoutms.toInt(), result)
