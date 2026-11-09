package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun HcsAddResourceToOperation(operation: HCS_OPERATION, type: HCS_RESOURCE_TYPE, uri: PCWSTR, handle: HANDLE): HRESULT

public expect fun HcsAttachLayerStorageFilter(layerpath: PCWSTR, layerdata: PCWSTR): HRESULT

public expect fun HcsCancelOperation(operation: HCS_OPERATION): HRESULT

public expect fun HcsCloseComputeSystem(computesystem: HCS_SYSTEM)

public expect fun HcsCloseOperation(operation: HCS_OPERATION)

public expect fun HcsCloseProcess(process: HCS_PROCESS)

public expect fun HcsCrashComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT

public expect fun HcsCreateComputeSystem(id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, computesystem: Long): HRESULT

public expect fun HcsCreateComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, options: Long, computesystem: Long): HRESULT

public expect fun HcsCreateEmptyGuestStateFile(gueststatefilepath: PCWSTR): HRESULT

public expect fun HcsCreateEmptyRuntimeStateFile(runtimestatefilepath: PCWSTR): HRESULT

public expect fun HcsCreateOperation(context: Long, callback: HCS_OPERATION_COMPLETION): HCS_OPERATION

public expect fun HcsCreateOperationWithNotifications(eventtypes: HCS_OPERATION_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HCS_OPERATION

public expect fun HcsCreateProcess(computesystem: HCS_SYSTEM, processparameters: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, process: Long): HRESULT

public expect fun HcsDestroyLayer(layerpath: PCWSTR): HRESULT

public expect fun HcsDetachLayerStorageFilter(layerpath: PCWSTR): HRESULT

public expect fun HcsEnumerateComputeSystems(query: PCWSTR, operation: HCS_OPERATION): HRESULT

public expect fun HcsEnumerateComputeSystemsInNamespace(idnamespace: PCWSTR, query: PCWSTR, operation: HCS_OPERATION): HRESULT

public expect fun HcsExportLayer(layerpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT

public expect fun HcsExportLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR): HRESULT

public expect fun HcsFormatWritableLayerVhd(vhdhandle: HANDLE): HRESULT

public expect fun HcsGetComputeSystemFromOperation(operation: HCS_OPERATION): HCS_SYSTEM

public expect fun HcsGetComputeSystemProperties(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT

public expect fun HcsGetLayerVhdMountPath(vhdhandle: HANDLE, mountpath: Long): HRESULT

public expect fun HcsGetOperationContext(operation: HCS_OPERATION): Long

public expect fun HcsGetOperationId(operation: HCS_OPERATION): ULong

public expect fun HcsGetOperationResult(operation: HCS_OPERATION, resultdocument: Long): HRESULT

public expect fun HcsGetOperationResultAndProcessInfo(operation: HCS_OPERATION, processinformation: Long, resultdocument: Long): HRESULT

public expect fun HcsGetOperationType(operation: HCS_OPERATION): HCS_OPERATION_TYPE

public expect fun HcsGetProcessFromOperation(operation: HCS_OPERATION): HCS_PROCESS

public expect fun HcsGetProcessInfo(process: HCS_PROCESS, operation: HCS_OPERATION): HRESULT

public expect fun HcsGetProcessProperties(process: HCS_PROCESS, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT

public expect fun HcsGetProcessorCompatibilityFromSavedState(runtimefilename: PCWSTR, processorfeaturesstring: Long): HRESULT

public expect fun HcsGetServiceProperties(propertyquery: PCWSTR, result: Long): HRESULT

public expect fun HcsGrantVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT

public expect fun HcsGrantVmGroupAccess(filepath: PCWSTR): HRESULT

public expect fun HcsImportLayer(layerpath: PCWSTR, sourcefolderpath: PCWSTR, layerdata: PCWSTR): HRESULT

public expect fun HcsInitializeLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT

public expect fun HcsInitializeWritableLayer(writablelayerpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT

public expect fun HcsModifyComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, configuration: PCWSTR, identity: HANDLE): HRESULT

public expect fun HcsModifyProcess(process: HCS_PROCESS, operation: HCS_OPERATION, settings: PCWSTR): HRESULT

public expect fun HcsModifyServiceSettings(settings: PCWSTR, result: Long): HRESULT

public expect fun HcsOpenComputeSystem(id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT

public expect fun HcsOpenComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT

public expect fun HcsOpenProcess(computesystem: HCS_SYSTEM, processid: UInt, requestedaccess: UInt, process: Long): HRESULT

public expect fun HcsPauseComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT

public expect fun HcsResumeComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT

public expect fun HcsRevokeVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT

public expect fun HcsRevokeVmGroupAccess(filepath: PCWSTR): HRESULT

public expect fun HcsSaveComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT

public expect fun HcsSetComputeSystemCallback(computesystem: HCS_SYSTEM, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT

public expect fun HcsSetOperationCallback(operation: HCS_OPERATION, context: Long, callback: HCS_OPERATION_COMPLETION): HRESULT

public expect fun HcsSetOperationContext(operation: HCS_OPERATION, context: Long): HRESULT

public expect fun HcsSetProcessCallback(process: HCS_PROCESS, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT

public expect fun HcsSetupBaseOSLayer(layerpath: PCWSTR, vhdhandle: HANDLE, options: PCWSTR): HRESULT

public expect fun HcsSetupBaseOSVolume(layerpath: PCWSTR, volumepath: PCWSTR, options: PCWSTR): HRESULT

public expect fun HcsShutDownComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT

public expect fun HcsSignalProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT

public expect fun HcsStartComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT

public expect fun HcsSubmitWerReport(settings: PCWSTR): HRESULT

public expect fun HcsTerminateComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT

public expect fun HcsTerminateProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT

public expect fun HcsWaitForComputeSystemExit(computesystem: HCS_SYSTEM, timeoutms: UInt, result: Long): HRESULT

public expect fun HcsWaitForOperationResult(operation: HCS_OPERATION, timeoutms: UInt, resultdocument: Long): HRESULT

public expect fun HcsWaitForOperationResultAndProcessInfo(operation: HCS_OPERATION, timeoutms: UInt, processinformation: Long, resultdocument: Long): HRESULT

public expect fun HcsWaitForProcessExit(computesystem: HCS_PROCESS, timeoutms: UInt, result: Long): HRESULT
