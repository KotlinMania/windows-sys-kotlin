@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsAddResourceToOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsAttachLayerStorageFilter
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCancelOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCloseComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCloseOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCloseProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCrashComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystemInNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyGuestStateFile
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyRuntimeStateFile
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperationWithNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsCreateProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsDestroyLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsDetachLayerStorageFilter
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystems
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystemsInNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsExportLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsExportLegacyWritableLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsFormatWritableLayerVhd
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemFromOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetLayerVhdMountPath
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationContext
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationId
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResult
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResultAndProcessInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationType
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessFromOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessorCompatibilityFromSavedState
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGetServiceProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmAccess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmGroupAccess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsImportLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsInitializeLegacyWritableLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsInitializeWritableLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsModifyComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsModifyProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsModifyServiceSettings
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystemInNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsOpenProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsPauseComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsResumeComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmAccess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmGroupAccess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsSaveComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsSetComputeSystemCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationContext
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsSetProcessCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSVolume
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsShutDownComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsSignalProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsStartComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsSubmitWerReport
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsTerminateComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsTerminateProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForComputeSystemExit
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResult
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResultAndProcessInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForProcessExit
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun hcsAddResourceToOperation(operation: HcsOperation, type: HcsResourceType, uri: Pcwstr, handle: Handle): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsAddResourceToOperation(operation?.value?.toCPointer<ByteVar>(), type, uri?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun hcsAttachLayerStorageFilter(layerpath: Pcwstr, layerdata: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsAttachLayerStorageFilter(layerpath?.value?.toCPointer<ByteVar>(), layerdata?.value?.toCPointer<ByteVar>())

public actual fun hcsCancelOperation(operation: HcsOperation): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsCancelOperation(operation?.value?.toCPointer<ByteVar>())

public actual fun hcsCloseComputeSystem(computesystem: HcsSystem) {
    windowssys_windows_win32_system_hostcomputesystem_hcsCloseComputeSystem(computesystem?.value?.toCPointer<ByteVar>())
}

public actual fun hcsCloseOperation(operation: HcsOperation) {
    windowssys_windows_win32_system_hostcomputesystem_hcsCloseOperation(operation?.value?.toCPointer<ByteVar>())
}

public actual fun hcsCloseProcess(process: HcsProcess) {
    windowssys_windows_win32_system_hostcomputesystem_hcsCloseProcess(process?.value?.toCPointer<ByteVar>())
}

public actual fun hcsCrashComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsCrashComputeSystem(computesystem?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsCreateComputeSystem(id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, securitydescriptor: COpaquePointer?, computesystem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystem(id?.value?.toCPointer<ByteVar>(), configuration?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), computesystem?.value?.toCPointer<ByteVar>())

public actual fun hcsCreateComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, options: COpaquePointer?, computesystem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystemInNamespace(idnamespace?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), configuration?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>(), computesystem?.value?.toCPointer<ByteVar>())

public actual fun hcsCreateEmptyGuestStateFile(gueststatefilepath: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyGuestStateFile(gueststatefilepath?.value?.toCPointer<ByteVar>())

public actual fun hcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyRuntimeStateFile(runtimestatefilepath?.value?.toCPointer<ByteVar>())

public actual fun hcsCreateOperation(context: COpaquePointer?, callback: HcsOperationCompletion): HcsOperation =
    windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperation(context?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hcsCreateOperationWithNotifications(eventtypes: HcsOperationOptions, context: COpaquePointer?, callback: HcsEventCallback): HcsOperation =
    windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperationWithNotifications(eventtypes, context?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hcsCreateProcess(computesystem: HcsSystem, processparameters: Pcwstr, operation: HcsOperation, securitydescriptor: COpaquePointer?, process: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsCreateProcess(computesystem?.value?.toCPointer<ByteVar>(), processparameters?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), process?.value?.toCPointer<ByteVar>())

public actual fun hcsDestroyLayer(layerpath: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsDestroyLayer(layerpath?.value?.toCPointer<ByteVar>())

public actual fun hcsDetachLayerStorageFilter(layerpath: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsDetachLayerStorageFilter(layerpath?.value?.toCPointer<ByteVar>())

public actual fun hcsEnumerateComputeSystems(query: Pcwstr, operation: HcsOperation): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystems(query?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>())

public actual fun hcsEnumerateComputeSystemsInNamespace(idnamespace: Pcwstr, query: Pcwstr, operation: HcsOperation): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystemsInNamespace(idnamespace?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>())

public actual fun hcsExportLayer(layerpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsExportLayer(layerpath?.value?.toCPointer<ByteVar>(), exportfolderpath?.value?.toCPointer<ByteVar>(), layerdata?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsExportLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsExportLegacyWritableLayer(writablelayermountpath?.value?.toCPointer<ByteVar>(), writablelayerfolderpath?.value?.toCPointer<ByteVar>(), exportfolderpath?.value?.toCPointer<ByteVar>(), layerdata?.value?.toCPointer<ByteVar>())

public actual fun hcsFormatWritableLayerVhd(vhdhandle: Handle): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsFormatWritableLayerVhd(vhdhandle?.value?.toCPointer<ByteVar>())

public actual fun hcsGetComputeSystemFromOperation(operation: HcsOperation): HcsSystem =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemFromOperation(operation?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hcsGetComputeSystemProperties(computesystem: HcsSystem, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemProperties(computesystem?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), propertyquery?.value?.toCPointer<ByteVar>())

public actual fun hcsGetLayerVhdMountPath(vhdhandle: Handle, mountpath: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetLayerVhdMountPath(vhdhandle?.value?.toCPointer<ByteVar>(), mountpath?.value?.toCPointer<ByteVar>())

public actual fun hcsGetOperationContext(operation: HcsOperation): COpaquePointer? =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationContext(operation?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hcsGetOperationId(operation: HcsOperation): ULong =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationId(operation?.value?.toCPointer<ByteVar>())

public actual fun hcsGetOperationResult(operation: HcsOperation, resultdocument: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResult(operation?.value?.toCPointer<ByteVar>(), resultdocument?.value?.toCPointer<ByteVar>())

public actual fun hcsGetOperationResultAndProcessInfo(operation: HcsOperation, processinformation: COpaquePointer?, resultdocument: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResultAndProcessInfo(operation?.value?.toCPointer<ByteVar>(), processinformation?.value?.toCPointer<ByteVar>(), resultdocument?.value?.toCPointer<ByteVar>())

public actual fun hcsGetOperationType(operation: HcsOperation): HcsOperationType =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationType(operation?.value?.toCPointer<ByteVar>())

public actual fun hcsGetProcessFromOperation(operation: HcsOperation): HcsProcess =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessFromOperation(operation?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun hcsGetProcessInfo(process: HcsProcess, operation: HcsOperation): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessInfo(process?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>())

public actual fun hcsGetProcessProperties(process: HcsProcess, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessProperties(process?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), propertyquery?.value?.toCPointer<ByteVar>())

public actual fun hcsGetProcessorCompatibilityFromSavedState(runtimefilename: Pcwstr, processorfeaturesstring: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessorCompatibilityFromSavedState(runtimefilename?.value?.toCPointer<ByteVar>(), processorfeaturesstring?.value?.toCPointer<ByteVar>())

public actual fun hcsGetServiceProperties(propertyquery: Pcwstr, result: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGetServiceProperties(propertyquery?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun hcsGrantVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmAccess(vmid?.value?.toCPointer<ByteVar>(), filepath?.value?.toCPointer<ByteVar>())

public actual fun hcsGrantVmGroupAccess(filepath: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmGroupAccess(filepath?.value?.toCPointer<ByteVar>())

public actual fun hcsImportLayer(layerpath: Pcwstr, sourcefolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsImportLayer(layerpath?.value?.toCPointer<ByteVar>(), sourcefolderpath?.value?.toCPointer<ByteVar>(), layerdata?.value?.toCPointer<ByteVar>())

public actual fun hcsInitializeLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsInitializeLegacyWritableLayer(writablelayermountpath?.value?.toCPointer<ByteVar>(), writablelayerfolderpath?.value?.toCPointer<ByteVar>(), layerdata?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsInitializeWritableLayer(writablelayerpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsInitializeWritableLayer(writablelayerpath?.value?.toCPointer<ByteVar>(), layerdata?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsModifyComputeSystem(computesystem: HcsSystem, operation: HcsOperation, configuration: Pcwstr, identity: Handle): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsModifyComputeSystem(computesystem?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), configuration?.value?.toCPointer<ByteVar>(), identity?.value?.toCPointer<ByteVar>())

public actual fun hcsModifyProcess(process: HcsProcess, operation: HcsOperation, settings: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsModifyProcess(process?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), settings?.value?.toCPointer<ByteVar>())

public actual fun hcsModifyServiceSettings(settings: Pcwstr, result: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsModifyServiceSettings(settings?.value?.toCPointer<ByteVar>(), result?.value?.toCPointer<ByteVar>())

public actual fun hcsOpenComputeSystem(id: Pcwstr, requestedaccess: UInt, computesystem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystem(id?.value?.toCPointer<ByteVar>(), requestedaccess, computesystem?.value?.toCPointer<ByteVar>())

public actual fun hcsOpenComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, requestedaccess: UInt, computesystem: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystemInNamespace(idnamespace?.value?.toCPointer<ByteVar>(), id?.value?.toCPointer<ByteVar>(), requestedaccess, computesystem?.value?.toCPointer<ByteVar>())

public actual fun hcsOpenProcess(computesystem: HcsSystem, processid: UInt, requestedaccess: UInt, process: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsOpenProcess(computesystem?.value?.toCPointer<ByteVar>(), processid, requestedaccess, process?.value?.toCPointer<ByteVar>())

public actual fun hcsPauseComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsPauseComputeSystem(computesystem?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsResumeComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsResumeComputeSystem(computesystem?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsRevokeVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmAccess(vmid?.value?.toCPointer<ByteVar>(), filepath?.value?.toCPointer<ByteVar>())

public actual fun hcsRevokeVmGroupAccess(filepath: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmGroupAccess(filepath?.value?.toCPointer<ByteVar>())

public actual fun hcsSaveComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsSaveComputeSystem(computesystem?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsSetComputeSystemCallback(computesystem: HcsSystem, callbackoptions: HcsEventOptions, context: COpaquePointer?, callback: HcsEventCallback): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsSetComputeSystemCallback(computesystem?.value?.toCPointer<ByteVar>(), callbackoptions, context?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun hcsSetOperationCallback(operation: HcsOperation, context: COpaquePointer?, callback: HcsOperationCompletion): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationCallback(operation?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun hcsSetOperationContext(operation: HcsOperation, context: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationContext(operation?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>())

public actual fun hcsSetProcessCallback(process: HcsProcess, callbackoptions: HcsEventOptions, context: COpaquePointer?, callback: HcsEventCallback): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsSetProcessCallback(process?.value?.toCPointer<ByteVar>(), callbackoptions, context?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun hcsSetupBaseOSLayer(layerpath: Pcwstr, vhdhandle: Handle, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSLayer(layerpath?.value?.toCPointer<ByteVar>(), vhdhandle?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsSetupBaseOSVolume(layerpath: Pcwstr, volumepath: Pcwstr, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSVolume(layerpath?.value?.toCPointer<ByteVar>(), volumepath?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsShutDownComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsShutDownComputeSystem(computesystem?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsSignalProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsSignalProcess(process?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsStartComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsStartComputeSystem(computesystem?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsSubmitWerReport(settings: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsSubmitWerReport(settings?.value?.toCPointer<ByteVar>())

public actual fun hcsTerminateComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsTerminateComputeSystem(computesystem?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsTerminateProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsTerminateProcess(process?.value?.toCPointer<ByteVar>(), operation?.value?.toCPointer<ByteVar>(), options?.value?.toCPointer<ByteVar>())

public actual fun hcsWaitForComputeSystemExit(computesystem: HcsSystem, timeoutms: UInt, result: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsWaitForComputeSystemExit(computesystem?.value?.toCPointer<ByteVar>(), timeoutms, result?.value?.toCPointer<ByteVar>())

public actual fun hcsWaitForOperationResult(operation: HcsOperation, timeoutms: UInt, resultdocument: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResult(operation?.value?.toCPointer<ByteVar>(), timeoutms, resultdocument?.value?.toCPointer<ByteVar>())

public actual fun hcsWaitForOperationResultAndProcessInfo(operation: HcsOperation, timeoutms: UInt, processinformation: COpaquePointer?, resultdocument: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResultAndProcessInfo(operation?.value?.toCPointer<ByteVar>(), timeoutms, processinformation?.value?.toCPointer<ByteVar>(), resultdocument?.value?.toCPointer<ByteVar>())

public actual fun hcsWaitForProcessExit(computesystem: HcsProcess, timeoutms: UInt, result: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hostcomputesystem_hcsWaitForProcessExit(computesystem?.value?.toCPointer<ByteVar>(), timeoutms, result?.value?.toCPointer<ByteVar>())
