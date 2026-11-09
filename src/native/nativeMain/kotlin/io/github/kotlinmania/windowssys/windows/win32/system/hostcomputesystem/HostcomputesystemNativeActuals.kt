@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun HcsAddResourceToOperation(operation: HCS_OPERATION, type: HCS_RESOURCE_TYPE, uri: PCWSTR, handle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsAddResourceToOperation(operation.toCPointer<ByteVar>(), type, uri.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun HcsAttachLayerStorageFilter(layerpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsAttachLayerStorageFilter(layerpath.toCPointer<ByteVar>(), layerdata.toCPointer<ByteVar>())

public actual fun HcsCancelOperation(operation: HCS_OPERATION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCancelOperation(operation.toCPointer<ByteVar>())

public actual fun HcsCloseComputeSystem(computesystem: HCS_SYSTEM) {
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCloseComputeSystem(computesystem.toCPointer<ByteVar>())
}

public actual fun HcsCloseOperation(operation: HCS_OPERATION) {
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCloseOperation(operation.toCPointer<ByteVar>())
}

public actual fun HcsCloseProcess(process: HCS_PROCESS) {
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCloseProcess(process.toCPointer<ByteVar>())
}

public actual fun HcsCrashComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCrashComputeSystem(computesystem.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsCreateComputeSystem(id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, computesystem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystem(id.toCPointer<ByteVar>(), configuration.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), computesystem.toCPointer<ByteVar>())

public actual fun HcsCreateComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, options: Long, computesystem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystemInNamespace(idnamespace.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), configuration.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>(), computesystem.toCPointer<ByteVar>())

public actual fun HcsCreateEmptyGuestStateFile(gueststatefilepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyGuestStateFile(gueststatefilepath.toCPointer<ByteVar>())

public actual fun HcsCreateEmptyRuntimeStateFile(runtimestatefilepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyRuntimeStateFile(runtimestatefilepath.toCPointer<ByteVar>())

public actual fun HcsCreateOperation(context: Long, callback: HCS_OPERATION_COMPLETION): HCS_OPERATION =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperation(context.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HcsCreateOperationWithNotifications(eventtypes: HCS_OPERATION_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HCS_OPERATION =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperationWithNotifications(eventtypes, context.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HcsCreateProcess(computesystem: HCS_SYSTEM, processparameters: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, process: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsCreateProcess(computesystem.toCPointer<ByteVar>(), processparameters.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), process.toCPointer<ByteVar>())

public actual fun HcsDestroyLayer(layerpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsDestroyLayer(layerpath.toCPointer<ByteVar>())

public actual fun HcsDetachLayerStorageFilter(layerpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsDetachLayerStorageFilter(layerpath.toCPointer<ByteVar>())

public actual fun HcsEnumerateComputeSystems(query: PCWSTR, operation: HCS_OPERATION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystems(query.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>())

public actual fun HcsEnumerateComputeSystemsInNamespace(idnamespace: PCWSTR, query: PCWSTR, operation: HCS_OPERATION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystemsInNamespace(idnamespace.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>())

public actual fun HcsExportLayer(layerpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsExportLayer(layerpath.toCPointer<ByteVar>(), exportfolderpath.toCPointer<ByteVar>(), layerdata.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsExportLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsExportLegacyWritableLayer(writablelayermountpath.toCPointer<ByteVar>(), writablelayerfolderpath.toCPointer<ByteVar>(), exportfolderpath.toCPointer<ByteVar>(), layerdata.toCPointer<ByteVar>())

public actual fun HcsFormatWritableLayerVhd(vhdhandle: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsFormatWritableLayerVhd(vhdhandle.toCPointer<ByteVar>())

public actual fun HcsGetComputeSystemFromOperation(operation: HCS_OPERATION): HCS_SYSTEM =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemFromOperation(operation.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HcsGetComputeSystemProperties(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemProperties(computesystem.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), propertyquery.toCPointer<ByteVar>())

public actual fun HcsGetLayerVhdMountPath(vhdhandle: HANDLE, mountpath: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetLayerVhdMountPath(vhdhandle.toCPointer<ByteVar>(), mountpath.toCPointer<ByteVar>())

public actual fun HcsGetOperationContext(operation: HCS_OPERATION): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationContext(operation.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HcsGetOperationId(operation: HCS_OPERATION): ULong =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationId(operation.toCPointer<ByteVar>())

public actual fun HcsGetOperationResult(operation: HCS_OPERATION, resultdocument: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResult(operation.toCPointer<ByteVar>(), resultdocument.toCPointer<ByteVar>())

public actual fun HcsGetOperationResultAndProcessInfo(operation: HCS_OPERATION, processinformation: Long, resultdocument: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResultAndProcessInfo(operation.toCPointer<ByteVar>(), processinformation.toCPointer<ByteVar>(), resultdocument.toCPointer<ByteVar>())

public actual fun HcsGetOperationType(operation: HCS_OPERATION): HCS_OPERATION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationType(operation.toCPointer<ByteVar>())

public actual fun HcsGetProcessFromOperation(operation: HCS_OPERATION): HCS_PROCESS =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessFromOperation(operation.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun HcsGetProcessInfo(process: HCS_PROCESS, operation: HCS_OPERATION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessInfo(process.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>())

public actual fun HcsGetProcessProperties(process: HCS_PROCESS, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessProperties(process.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), propertyquery.toCPointer<ByteVar>())

public actual fun HcsGetProcessorCompatibilityFromSavedState(runtimefilename: PCWSTR, processorfeaturesstring: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessorCompatibilityFromSavedState(runtimefilename.toCPointer<ByteVar>(), processorfeaturesstring.toCPointer<ByteVar>())

public actual fun HcsGetServiceProperties(propertyquery: PCWSTR, result: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGetServiceProperties(propertyquery.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun HcsGrantVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmAccess(vmid.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>())

public actual fun HcsGrantVmGroupAccess(filepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmGroupAccess(filepath.toCPointer<ByteVar>())

public actual fun HcsImportLayer(layerpath: PCWSTR, sourcefolderpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsImportLayer(layerpath.toCPointer<ByteVar>(), sourcefolderpath.toCPointer<ByteVar>(), layerdata.toCPointer<ByteVar>())

public actual fun HcsInitializeLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsInitializeLegacyWritableLayer(writablelayermountpath.toCPointer<ByteVar>(), writablelayerfolderpath.toCPointer<ByteVar>(), layerdata.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsInitializeWritableLayer(writablelayerpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsInitializeWritableLayer(writablelayerpath.toCPointer<ByteVar>(), layerdata.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsModifyComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, configuration: PCWSTR, identity: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsModifyComputeSystem(computesystem.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), configuration.toCPointer<ByteVar>(), identity.toCPointer<ByteVar>())

public actual fun HcsModifyProcess(process: HCS_PROCESS, operation: HCS_OPERATION, settings: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsModifyProcess(process.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), settings.toCPointer<ByteVar>())

public actual fun HcsModifyServiceSettings(settings: PCWSTR, result: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsModifyServiceSettings(settings.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun HcsOpenComputeSystem(id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystem(id.toCPointer<ByteVar>(), requestedaccess, computesystem.toCPointer<ByteVar>())

public actual fun HcsOpenComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystemInNamespace(idnamespace.toCPointer<ByteVar>(), id.toCPointer<ByteVar>(), requestedaccess, computesystem.toCPointer<ByteVar>())

public actual fun HcsOpenProcess(computesystem: HCS_SYSTEM, processid: UInt, requestedaccess: UInt, process: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsOpenProcess(computesystem.toCPointer<ByteVar>(), processid, requestedaccess, process.toCPointer<ByteVar>())

public actual fun HcsPauseComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsPauseComputeSystem(computesystem.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsResumeComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsResumeComputeSystem(computesystem.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsRevokeVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmAccess(vmid.toCPointer<ByteVar>(), filepath.toCPointer<ByteVar>())

public actual fun HcsRevokeVmGroupAccess(filepath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmGroupAccess(filepath.toCPointer<ByteVar>())

public actual fun HcsSaveComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsSaveComputeSystem(computesystem.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsSetComputeSystemCallback(computesystem: HCS_SYSTEM, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsSetComputeSystemCallback(computesystem.toCPointer<ByteVar>(), callbackoptions, context.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>())

public actual fun HcsSetOperationCallback(operation: HCS_OPERATION, context: Long, callback: HCS_OPERATION_COMPLETION): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationCallback(operation.toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>())

public actual fun HcsSetOperationContext(operation: HCS_OPERATION, context: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationContext(operation.toCPointer<ByteVar>(), context.toCPointer<ByteVar>())

public actual fun HcsSetProcessCallback(process: HCS_PROCESS, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsSetProcessCallback(process.toCPointer<ByteVar>(), callbackoptions, context.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>())

public actual fun HcsSetupBaseOSLayer(layerpath: PCWSTR, vhdhandle: HANDLE, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSLayer(layerpath.toCPointer<ByteVar>(), vhdhandle.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsSetupBaseOSVolume(layerpath: PCWSTR, volumepath: PCWSTR, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSVolume(layerpath.toCPointer<ByteVar>(), volumepath.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsShutDownComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsShutDownComputeSystem(computesystem.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsSignalProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsSignalProcess(process.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsStartComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsStartComputeSystem(computesystem.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsSubmitWerReport(settings: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsSubmitWerReport(settings.toCPointer<ByteVar>())

public actual fun HcsTerminateComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsTerminateComputeSystem(computesystem.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsTerminateProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsTerminateProcess(process.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), options.toCPointer<ByteVar>())

public actual fun HcsWaitForComputeSystemExit(computesystem: HCS_SYSTEM, timeoutms: UInt, result: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForComputeSystemExit(computesystem.toCPointer<ByteVar>(), timeoutms, result.toCPointer<ByteVar>())

public actual fun HcsWaitForOperationResult(operation: HCS_OPERATION, timeoutms: UInt, resultdocument: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResult(operation.toCPointer<ByteVar>(), timeoutms, resultdocument.toCPointer<ByteVar>())

public actual fun HcsWaitForOperationResultAndProcessInfo(operation: HCS_OPERATION, timeoutms: UInt, processinformation: Long, resultdocument: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResultAndProcessInfo(operation.toCPointer<ByteVar>(), timeoutms, processinformation.toCPointer<ByteVar>(), resultdocument.toCPointer<ByteVar>())

public actual fun HcsWaitForProcessExit(computesystem: HCS_PROCESS, timeoutms: UInt, result: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForProcessExit(computesystem.toCPointer<ByteVar>(), timeoutms, result.toCPointer<ByteVar>())
