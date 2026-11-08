package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun interface FnCallback {
    public operator fun invoke(operation: HCS_OPERATION, context: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(event: Long, context: Long)
}

public fun HcsAddResourceToOperation(operation: HCS_OPERATION, type: HCS_RESOURCE_TYPE, uri: PCWSTR, handle: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsAddResourceToOperation", longArrayOf(operation, type.toLong(), uri, handle)).toInt()
}

public fun HcsAttachLayerStorageFilter(layerpath: PCWSTR, layerdata: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsAttachLayerStorageFilter", longArrayOf(layerpath, layerdata)).toInt()
}

public fun HcsCancelOperation(operation: HCS_OPERATION): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsCancelOperation", longArrayOf(operation)).toInt()
}

public fun HcsCloseComputeSystem(computesystem: HCS_SYSTEM) {
    Win32DynamicFfi.invoke("computecore.dll", "HcsCloseComputeSystem", longArrayOf(computesystem))
}

public fun HcsCloseOperation(operation: HCS_OPERATION) {
    Win32DynamicFfi.invoke("computecore.dll", "HcsCloseOperation", longArrayOf(operation))
}

public fun HcsCloseProcess(process: HCS_PROCESS) {
    Win32DynamicFfi.invoke("computecore.dll", "HcsCloseProcess", longArrayOf(process))
}

public fun HcsCrashComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsCrashComputeSystem", longArrayOf(computesystem, operation, options)).toInt()
}

public fun HcsCreateComputeSystem(id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, computesystem: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsCreateComputeSystem", longArrayOf(id, configuration, operation, securitydescriptor, computesystem)).toInt()
}

public fun HcsCreateComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, options: Long, computesystem: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsCreateComputeSystemInNamespace", longArrayOf(idnamespace, id, configuration, operation, options, computesystem)).toInt()
}

public fun HcsCreateEmptyGuestStateFile(gueststatefilepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsCreateEmptyGuestStateFile", longArrayOf(gueststatefilepath)).toInt()
}

public fun HcsCreateEmptyRuntimeStateFile(runtimestatefilepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsCreateEmptyRuntimeStateFile", longArrayOf(runtimestatefilepath)).toInt()
}

public fun HcsCreateOperation(context: Long, callback: HCS_OPERATION_COMPLETION): HCS_OPERATION {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsCreateOperation", longArrayOf(context, Win32DynamicFfi.objectSlot(callback)))
}

public fun HcsCreateOperationWithNotifications(eventtypes: HCS_OPERATION_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HCS_OPERATION {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsCreateOperationWithNotifications", longArrayOf(eventtypes.toLong(), context, Win32DynamicFfi.objectSlot(callback)))
}

public fun HcsCreateProcess(computesystem: HCS_SYSTEM, processparameters: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, process: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsCreateProcess", longArrayOf(computesystem, processparameters, operation, securitydescriptor, process)).toInt()
}

public fun HcsDestroyLayer(layerpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsDestroyLayer", longArrayOf(layerpath)).toInt()
}

public fun HcsDetachLayerStorageFilter(layerpath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsDetachLayerStorageFilter", longArrayOf(layerpath)).toInt()
}

public fun HcsEnumerateComputeSystems(query: PCWSTR, operation: HCS_OPERATION): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsEnumerateComputeSystems", longArrayOf(query, operation)).toInt()
}

public fun HcsEnumerateComputeSystemsInNamespace(idnamespace: PCWSTR, query: PCWSTR, operation: HCS_OPERATION): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsEnumerateComputeSystemsInNamespace", longArrayOf(idnamespace, query, operation)).toInt()
}

public fun HcsExportLayer(layerpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsExportLayer", longArrayOf(layerpath, exportfolderpath, layerdata, options)).toInt()
}

public fun HcsExportLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsExportLegacyWritableLayer", longArrayOf(writablelayermountpath, writablelayerfolderpath, exportfolderpath, layerdata)).toInt()
}

public fun HcsFormatWritableLayerVhd(vhdhandle: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsFormatWritableLayerVhd", longArrayOf(vhdhandle)).toInt()
}

public fun HcsGetComputeSystemFromOperation(operation: HCS_OPERATION): HCS_SYSTEM {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetComputeSystemFromOperation", longArrayOf(operation))
}

public fun HcsGetComputeSystemProperties(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetComputeSystemProperties", longArrayOf(computesystem, operation, propertyquery)).toInt()
}

public fun HcsGetLayerVhdMountPath(vhdhandle: HANDLE, mountpath: Long): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsGetLayerVhdMountPath", longArrayOf(vhdhandle, mountpath)).toInt()
}

public fun HcsGetOperationContext(operation: HCS_OPERATION): Long {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetOperationContext", longArrayOf(operation))
}

public fun HcsGetOperationId(operation: HCS_OPERATION): ULong {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetOperationId", longArrayOf(operation)).toULong()
}

public fun HcsGetOperationResult(operation: HCS_OPERATION, resultdocument: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetOperationResult", longArrayOf(operation, resultdocument)).toInt()
}

public fun HcsGetOperationResultAndProcessInfo(operation: HCS_OPERATION, processinformation: Long, resultdocument: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetOperationResultAndProcessInfo", longArrayOf(operation, processinformation, resultdocument)).toInt()
}

public fun HcsGetOperationType(operation: HCS_OPERATION): HCS_OPERATION_TYPE {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetOperationType", longArrayOf(operation)).toInt()
}

public fun HcsGetProcessFromOperation(operation: HCS_OPERATION): HCS_PROCESS {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetProcessFromOperation", longArrayOf(operation))
}

public fun HcsGetProcessInfo(process: HCS_PROCESS, operation: HCS_OPERATION): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetProcessInfo", longArrayOf(process, operation)).toInt()
}

public fun HcsGetProcessProperties(process: HCS_PROCESS, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetProcessProperties", longArrayOf(process, operation, propertyquery)).toInt()
}

public fun HcsGetProcessorCompatibilityFromSavedState(runtimefilename: PCWSTR, processorfeaturesstring: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetProcessorCompatibilityFromSavedState", longArrayOf(runtimefilename, processorfeaturesstring)).toInt()
}

public fun HcsGetServiceProperties(propertyquery: PCWSTR, result: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGetServiceProperties", longArrayOf(propertyquery, result)).toInt()
}

public fun HcsGrantVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGrantVmAccess", longArrayOf(vmid, filepath)).toInt()
}

public fun HcsGrantVmGroupAccess(filepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsGrantVmGroupAccess", longArrayOf(filepath)).toInt()
}

public fun HcsImportLayer(layerpath: PCWSTR, sourcefolderpath: PCWSTR, layerdata: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsImportLayer", longArrayOf(layerpath, sourcefolderpath, layerdata)).toInt()
}

public fun HcsInitializeLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsInitializeLegacyWritableLayer", longArrayOf(writablelayermountpath, writablelayerfolderpath, layerdata, options)).toInt()
}

public fun HcsInitializeWritableLayer(writablelayerpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsInitializeWritableLayer", longArrayOf(writablelayerpath, layerdata, options)).toInt()
}

public fun HcsModifyComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, configuration: PCWSTR, identity: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsModifyComputeSystem", longArrayOf(computesystem, operation, configuration, identity)).toInt()
}

public fun HcsModifyProcess(process: HCS_PROCESS, operation: HCS_OPERATION, settings: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsModifyProcess", longArrayOf(process, operation, settings)).toInt()
}

public fun HcsModifyServiceSettings(settings: PCWSTR, result: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsModifyServiceSettings", longArrayOf(settings, result)).toInt()
}

public fun HcsOpenComputeSystem(id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsOpenComputeSystem", longArrayOf(id, requestedaccess.toLong(), computesystem)).toInt()
}

public fun HcsOpenComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsOpenComputeSystemInNamespace", longArrayOf(idnamespace, id, requestedaccess.toLong(), computesystem)).toInt()
}

public fun HcsOpenProcess(computesystem: HCS_SYSTEM, processid: UInt, requestedaccess: UInt, process: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsOpenProcess", longArrayOf(computesystem, processid.toLong(), requestedaccess.toLong(), process)).toInt()
}

public fun HcsPauseComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsPauseComputeSystem", longArrayOf(computesystem, operation, options)).toInt()
}

public fun HcsResumeComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsResumeComputeSystem", longArrayOf(computesystem, operation, options)).toInt()
}

public fun HcsRevokeVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsRevokeVmAccess", longArrayOf(vmid, filepath)).toInt()
}

public fun HcsRevokeVmGroupAccess(filepath: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsRevokeVmGroupAccess", longArrayOf(filepath)).toInt()
}

public fun HcsSaveComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsSaveComputeSystem", longArrayOf(computesystem, operation, options)).toInt()
}

public fun HcsSetComputeSystemCallback(computesystem: HCS_SYSTEM, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsSetComputeSystemCallback", longArrayOf(computesystem, callbackoptions.toLong(), context, Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun HcsSetOperationCallback(operation: HCS_OPERATION, context: Long, callback: HCS_OPERATION_COMPLETION): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsSetOperationCallback", longArrayOf(operation, context, Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun HcsSetOperationContext(operation: HCS_OPERATION, context: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsSetOperationContext", longArrayOf(operation, context)).toInt()
}

public fun HcsSetProcessCallback(process: HCS_PROCESS, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsSetProcessCallback", longArrayOf(process, callbackoptions.toLong(), context, Win32DynamicFfi.objectSlot(callback))).toInt()
}

public fun HcsSetupBaseOSLayer(layerpath: PCWSTR, vhdhandle: HANDLE, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsSetupBaseOSLayer", longArrayOf(layerpath, vhdhandle, options)).toInt()
}

public fun HcsSetupBaseOSVolume(layerpath: PCWSTR, volumepath: PCWSTR, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computestorage.dll", "HcsSetupBaseOSVolume", longArrayOf(layerpath, volumepath, options)).toInt()
}

public fun HcsShutDownComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsShutDownComputeSystem", longArrayOf(computesystem, operation, options)).toInt()
}

public fun HcsSignalProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsSignalProcess", longArrayOf(process, operation, options)).toInt()
}

public fun HcsStartComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsStartComputeSystem", longArrayOf(computesystem, operation, options)).toInt()
}

public fun HcsSubmitWerReport(settings: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsSubmitWerReport", longArrayOf(settings)).toInt()
}

public fun HcsTerminateComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsTerminateComputeSystem", longArrayOf(computesystem, operation, options)).toInt()
}

public fun HcsTerminateProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsTerminateProcess", longArrayOf(process, operation, options)).toInt()
}

public fun HcsWaitForComputeSystemExit(computesystem: HCS_SYSTEM, timeoutms: UInt, result: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsWaitForComputeSystemExit", longArrayOf(computesystem, timeoutms.toLong(), result)).toInt()
}

public fun HcsWaitForOperationResult(operation: HCS_OPERATION, timeoutms: UInt, resultdocument: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsWaitForOperationResult", longArrayOf(operation, timeoutms.toLong(), resultdocument)).toInt()
}

public fun HcsWaitForOperationResultAndProcessInfo(operation: HCS_OPERATION, timeoutms: UInt, processinformation: Long, resultdocument: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsWaitForOperationResultAndProcessInfo", longArrayOf(operation, timeoutms.toLong(), processinformation, resultdocument)).toInt()
}

public fun HcsWaitForProcessExit(computesystem: HCS_PROCESS, timeoutms: UInt, result: Long): HRESULT {
    return Win32DynamicFfi.invoke("computecore.dll", "HcsWaitForProcessExit", longArrayOf(computesystem, timeoutms.toLong(), result)).toInt()
}
