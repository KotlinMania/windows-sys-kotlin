package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun hcsAddResourceToOperation(operation: HcsOperation, type: HcsResourceType, uri: Pcwstr, handle: Handle): Hresult

public expect fun hcsAttachLayerStorageFilter(layerpath: Pcwstr, layerdata: Pcwstr): Hresult

public expect fun hcsCancelOperation(operation: HcsOperation): Hresult

public expect fun hcsCloseComputeSystem(computesystem: HcsSystem)

public expect fun hcsCloseOperation(operation: HcsOperation)

public expect fun hcsCloseProcess(process: HcsProcess)

public expect fun hcsCrashComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult

public expect fun hcsCreateComputeSystem(id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr, computesystem: MutPtr): Hresult

public expect fun hcsCreateComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, options: ConstPtr, computesystem: MutPtr): Hresult

public expect fun hcsCreateEmptyGuestStateFile(gueststatefilepath: Pcwstr): Hresult

public expect fun hcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Pcwstr): Hresult

public expect fun hcsCreateOperation(context: ConstPtr, callback: HcsOperationCompletion): HcsOperation

public expect fun hcsCreateOperationWithNotifications(eventtypes: HcsOperationOptions, context: ConstPtr, callback: HcsEventCallback): HcsOperation

public expect fun hcsCreateProcess(computesystem: HcsSystem, processparameters: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr, process: MutPtr): Hresult

public expect fun hcsDestroyLayer(layerpath: Pcwstr): Hresult

public expect fun hcsDetachLayerStorageFilter(layerpath: Pcwstr): Hresult

public expect fun hcsEnumerateComputeSystems(query: Pcwstr, operation: HcsOperation): Hresult

public expect fun hcsEnumerateComputeSystemsInNamespace(idnamespace: Pcwstr, query: Pcwstr, operation: HcsOperation): Hresult

public expect fun hcsExportLayer(layerpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult

public expect fun hcsExportLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr): Hresult

public expect fun hcsFormatWritableLayerVhd(vhdhandle: Handle): Hresult

public expect fun hcsGetComputeSystemFromOperation(operation: HcsOperation): HcsSystem

public expect fun hcsGetComputeSystemProperties(computesystem: HcsSystem, operation: HcsOperation, propertyquery: Pcwstr): Hresult

public expect fun hcsGetLayerVhdMountPath(vhdhandle: Handle, mountpath: MutPtr): Hresult

public expect fun hcsGetOperationContext(operation: HcsOperation): MutPtr

public expect fun hcsGetOperationId(operation: HcsOperation): ULong

public expect fun hcsGetOperationResult(operation: HcsOperation, resultdocument: MutPtr): Hresult

public expect fun hcsGetOperationResultAndProcessInfo(operation: HcsOperation, processinformation: MutPtr, resultdocument: MutPtr): Hresult

public expect fun hcsGetOperationType(operation: HcsOperation): HcsOperationType

public expect fun hcsGetProcessFromOperation(operation: HcsOperation): HcsProcess

public expect fun hcsGetProcessInfo(process: HcsProcess, operation: HcsOperation): Hresult

public expect fun hcsGetProcessProperties(process: HcsProcess, operation: HcsOperation, propertyquery: Pcwstr): Hresult

public expect fun hcsGetProcessorCompatibilityFromSavedState(runtimefilename: Pcwstr, processorfeaturesstring: MutPtr): Hresult

public expect fun hcsGetServiceProperties(propertyquery: Pcwstr, result: MutPtr): Hresult

public expect fun hcsGrantVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult

public expect fun hcsGrantVmGroupAccess(filepath: Pcwstr): Hresult

public expect fun hcsImportLayer(layerpath: Pcwstr, sourcefolderpath: Pcwstr, layerdata: Pcwstr): Hresult

public expect fun hcsInitializeLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult

public expect fun hcsInitializeWritableLayer(writablelayerpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult

public expect fun hcsModifyComputeSystem(computesystem: HcsSystem, operation: HcsOperation, configuration: Pcwstr, identity: Handle): Hresult

public expect fun hcsModifyProcess(process: HcsProcess, operation: HcsOperation, settings: Pcwstr): Hresult

public expect fun hcsModifyServiceSettings(settings: Pcwstr, result: MutPtr): Hresult

public expect fun hcsOpenComputeSystem(id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr): Hresult

public expect fun hcsOpenComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr): Hresult

public expect fun hcsOpenProcess(computesystem: HcsSystem, processid: UInt, requestedaccess: UInt, process: MutPtr): Hresult

public expect fun hcsPauseComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult

public expect fun hcsResumeComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult

public expect fun hcsRevokeVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult

public expect fun hcsRevokeVmGroupAccess(filepath: Pcwstr): Hresult

public expect fun hcsSaveComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult

public expect fun hcsSetComputeSystemCallback(computesystem: HcsSystem, callbackoptions: HcsEventOptions, context: ConstPtr, callback: HcsEventCallback): Hresult

public expect fun hcsSetOperationCallback(operation: HcsOperation, context: ConstPtr, callback: HcsOperationCompletion): Hresult

public expect fun hcsSetOperationContext(operation: HcsOperation, context: ConstPtr): Hresult

public expect fun hcsSetProcessCallback(process: HcsProcess, callbackoptions: HcsEventOptions, context: ConstPtr, callback: HcsEventCallback): Hresult

public expect fun hcsSetupBaseOSLayer(layerpath: Pcwstr, vhdhandle: Handle, options: Pcwstr): Hresult

public expect fun hcsSetupBaseOSVolume(layerpath: Pcwstr, volumepath: Pcwstr, options: Pcwstr): Hresult

public expect fun hcsShutDownComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult

public expect fun hcsSignalProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult

public expect fun hcsStartComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult

public expect fun hcsSubmitWerReport(settings: Pcwstr): Hresult

public expect fun hcsTerminateComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult

public expect fun hcsTerminateProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult

public expect fun hcsWaitForComputeSystemExit(computesystem: HcsSystem, timeoutms: UInt, result: MutPtr): Hresult

public expect fun hcsWaitForOperationResult(operation: HcsOperation, timeoutms: UInt, resultdocument: MutPtr): Hresult

public expect fun hcsWaitForOperationResultAndProcessInfo(operation: HcsOperation, timeoutms: UInt, processinformation: MutPtr, resultdocument: MutPtr): Hresult

public expect fun hcsWaitForProcessExit(computesystem: HcsProcess, timeoutms: UInt, result: MutPtr): Hresult
