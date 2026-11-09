@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun HcsAddResourceToOperation(operation: HCS_OPERATION, type: HCS_RESOURCE_TYPE, uri: PCWSTR, handle: HANDLE): HRESULT =
    0

public actual fun HcsAttachLayerStorageFilter(layerpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    0

public actual fun HcsCancelOperation(operation: HCS_OPERATION): HRESULT =
    0

public actual fun HcsCloseComputeSystem(computesystem: HCS_SYSTEM) {
}

public actual fun HcsCloseOperation(operation: HCS_OPERATION) {
}

public actual fun HcsCloseProcess(process: HCS_PROCESS) {
}

public actual fun HcsCrashComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    0

public actual fun HcsCreateComputeSystem(id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, computesystem: Long): HRESULT =
    0

public actual fun HcsCreateComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, options: Long, computesystem: Long): HRESULT =
    0

public actual fun HcsCreateEmptyGuestStateFile(gueststatefilepath: PCWSTR): HRESULT =
    0

public actual fun HcsCreateEmptyRuntimeStateFile(runtimestatefilepath: PCWSTR): HRESULT =
    0

public actual fun HcsCreateOperation(context: Long, callback: HCS_OPERATION_COMPLETION): HCS_OPERATION =
    0L

public actual fun HcsCreateOperationWithNotifications(eventtypes: HCS_OPERATION_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HCS_OPERATION =
    0L

public actual fun HcsCreateProcess(computesystem: HCS_SYSTEM, processparameters: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, process: Long): HRESULT =
    0

public actual fun HcsDestroyLayer(layerpath: PCWSTR): HRESULT =
    0

public actual fun HcsDetachLayerStorageFilter(layerpath: PCWSTR): HRESULT =
    0

public actual fun HcsEnumerateComputeSystems(query: PCWSTR, operation: HCS_OPERATION): HRESULT =
    0

public actual fun HcsEnumerateComputeSystemsInNamespace(idnamespace: PCWSTR, query: PCWSTR, operation: HCS_OPERATION): HRESULT =
    0

public actual fun HcsExportLayer(layerpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    0

public actual fun HcsExportLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    0

public actual fun HcsFormatWritableLayerVhd(vhdhandle: HANDLE): HRESULT =
    0

public actual fun HcsGetComputeSystemFromOperation(operation: HCS_OPERATION): HCS_SYSTEM =
    0L

public actual fun HcsGetComputeSystemProperties(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT =
    0

public actual fun HcsGetLayerVhdMountPath(vhdhandle: HANDLE, mountpath: Long): HRESULT =
    0

public actual fun HcsGetOperationContext(operation: HCS_OPERATION): Long =
    0L

public actual fun HcsGetOperationId(operation: HCS_OPERATION): ULong =
    0uL

public actual fun HcsGetOperationResult(operation: HCS_OPERATION, resultdocument: Long): HRESULT =
    0

public actual fun HcsGetOperationResultAndProcessInfo(operation: HCS_OPERATION, processinformation: Long, resultdocument: Long): HRESULT =
    0

public actual fun HcsGetOperationType(operation: HCS_OPERATION): HCS_OPERATION_TYPE =
    0

public actual fun HcsGetProcessFromOperation(operation: HCS_OPERATION): HCS_PROCESS =
    0L

public actual fun HcsGetProcessInfo(process: HCS_PROCESS, operation: HCS_OPERATION): HRESULT =
    0

public actual fun HcsGetProcessProperties(process: HCS_PROCESS, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT =
    0

public actual fun HcsGetProcessorCompatibilityFromSavedState(runtimefilename: PCWSTR, processorfeaturesstring: Long): HRESULT =
    0

public actual fun HcsGetServiceProperties(propertyquery: PCWSTR, result: Long): HRESULT =
    0

public actual fun HcsGrantVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT =
    0

public actual fun HcsGrantVmGroupAccess(filepath: PCWSTR): HRESULT =
    0

public actual fun HcsImportLayer(layerpath: PCWSTR, sourcefolderpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    0

public actual fun HcsInitializeLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    0

public actual fun HcsInitializeWritableLayer(writablelayerpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    0

public actual fun HcsModifyComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, configuration: PCWSTR, identity: HANDLE): HRESULT =
    0

public actual fun HcsModifyProcess(process: HCS_PROCESS, operation: HCS_OPERATION, settings: PCWSTR): HRESULT =
    0

public actual fun HcsModifyServiceSettings(settings: PCWSTR, result: Long): HRESULT =
    0

public actual fun HcsOpenComputeSystem(id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT =
    0

public actual fun HcsOpenComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT =
    0

public actual fun HcsOpenProcess(computesystem: HCS_SYSTEM, processid: UInt, requestedaccess: UInt, process: Long): HRESULT =
    0

public actual fun HcsPauseComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    0

public actual fun HcsResumeComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    0

public actual fun HcsRevokeVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT =
    0

public actual fun HcsRevokeVmGroupAccess(filepath: PCWSTR): HRESULT =
    0

public actual fun HcsSaveComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    0

public actual fun HcsSetComputeSystemCallback(computesystem: HCS_SYSTEM, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT =
    0

public actual fun HcsSetOperationCallback(operation: HCS_OPERATION, context: Long, callback: HCS_OPERATION_COMPLETION): HRESULT =
    0

public actual fun HcsSetOperationContext(operation: HCS_OPERATION, context: Long): HRESULT =
    0

public actual fun HcsSetProcessCallback(process: HCS_PROCESS, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT =
    0

public actual fun HcsSetupBaseOSLayer(layerpath: PCWSTR, vhdhandle: HANDLE, options: PCWSTR): HRESULT =
    0

public actual fun HcsSetupBaseOSVolume(layerpath: PCWSTR, volumepath: PCWSTR, options: PCWSTR): HRESULT =
    0

public actual fun HcsShutDownComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    0

public actual fun HcsSignalProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    0

public actual fun HcsStartComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    0

public actual fun HcsSubmitWerReport(settings: PCWSTR): HRESULT =
    0

public actual fun HcsTerminateComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    0

public actual fun HcsTerminateProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    0

public actual fun HcsWaitForComputeSystemExit(computesystem: HCS_SYSTEM, timeoutms: UInt, result: Long): HRESULT =
    0

public actual fun HcsWaitForOperationResult(operation: HCS_OPERATION, timeoutms: UInt, resultdocument: Long): HRESULT =
    0

public actual fun HcsWaitForOperationResultAndProcessInfo(operation: HCS_OPERATION, timeoutms: UInt, processinformation: Long, resultdocument: Long): HRESULT =
    0

public actual fun HcsWaitForProcessExit(computesystem: HCS_PROCESS, timeoutms: UInt, result: Long): HRESULT =
    0
