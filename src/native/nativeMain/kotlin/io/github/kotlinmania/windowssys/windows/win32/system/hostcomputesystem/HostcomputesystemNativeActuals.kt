@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsExportLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsImportLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.cinterop.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun hcsAddResourceToOperation(operation: HcsOperation, type: HcsResourceType, uri: Pcwstr, handle: Handle): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation(operation.rawAddress.toCPointer<ByteVar>(), type, uri.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun hcsAttachLayerStorageFilter(layerpath: Pcwstr, layerdata: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter(layerpath.rawAddress.toCPointer<ByteVar>(), layerdata.rawAddress.toCPointer<ByteVar>())

public actual fun hcsCancelOperation(operation: HcsOperation): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation(operation.rawAddress.toCPointer<ByteVar>())

public actual fun hcsCloseComputeSystem(computesystem: HcsSystem) {
    windowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem(computesystem.rawAddress.toCPointer<ByteVar>())
}

public actual fun hcsCloseOperation(operation: HcsOperation) {
    windowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation(operation.rawAddress.toCPointer<ByteVar>())
}

public actual fun hcsCloseProcess(process: HcsProcess) {
    windowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess(process.rawAddress.toCPointer<ByteVar>())
}

public actual fun hcsCrashComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem(computesystem.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsCreateComputeSystem(id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr<SecurityDescriptor>, computesystem: MutPtr<HcsSystem>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem(id.rawAddress.toCPointer<ByteVar>(), configuration.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), computesystem.rawAddress.toCPointer<ByteVar>())

public actual fun hcsCreateComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, options: ConstPtr<HcsCreateOptions>, computesystem: MutPtr<HcsSystem>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace(idnamespace.rawAddress.toCPointer<ByteVar>(), id.rawAddress.toCPointer<ByteVar>(), configuration.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>(), computesystem.rawAddress.toCPointer<ByteVar>())

public actual fun hcsCreateEmptyGuestStateFile(gueststatefilepath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile(gueststatefilepath.rawAddress.toCPointer<ByteVar>())

public actual fun hcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile(runtimestatefilepath.rawAddress.toCPointer<ByteVar>())

public actual fun hcsCreateOperation(context: ConstPtr<CVoid>, callback: HcsOperationCompletion): HcsOperation =
    MutPtr(windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation(context.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hcsCreateOperationWithNotifications(eventtypes: HcsOperationOptions, context: ConstPtr<CVoid>, callback: HcsEventCallback): HcsOperation =
    MutPtr(windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications(eventtypes, context.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hcsCreateProcess(computesystem: HcsSystem, processparameters: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr<SecurityDescriptor>, process: MutPtr<HcsProcess>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess(computesystem.rawAddress.toCPointer<ByteVar>(), processparameters.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), process.rawAddress.toCPointer<ByteVar>())

public actual fun hcsDestroyLayer(layerpath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer(layerpath.rawAddress.toCPointer<ByteVar>())

public actual fun hcsDetachLayerStorageFilter(layerpath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter(layerpath.rawAddress.toCPointer<ByteVar>())

public actual fun hcsEnumerateComputeSystems(query: Pcwstr, operation: HcsOperation): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems(query.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>())

public actual fun hcsEnumerateComputeSystemsInNamespace(idnamespace: Pcwstr, query: Pcwstr, operation: HcsOperation): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace(idnamespace.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>())

public actual fun hcsExportLayer(layerpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsExportLayer(layerpath.rawAddress.toCPointer<ByteVar>(), exportfolderpath.rawAddress.toCPointer<ByteVar>(), layerdata.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsExportLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer(writablelayermountpath.rawAddress.toCPointer<ByteVar>(), writablelayerfolderpath.rawAddress.toCPointer<ByteVar>(), exportfolderpath.rawAddress.toCPointer<ByteVar>(), layerdata.rawAddress.toCPointer<ByteVar>())

public actual fun hcsFormatWritableLayerVhd(vhdhandle: Handle): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd(vhdhandle.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetComputeSystemFromOperation(operation: HcsOperation): HcsSystem =
    MutPtr(windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation(operation.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hcsGetComputeSystemProperties(computesystem: HcsSystem, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties(computesystem.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), propertyquery.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetLayerVhdMountPath(vhdhandle: Handle, mountpath: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath(vhdhandle.rawAddress.toCPointer<ByteVar>(), mountpath.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetOperationContext(operation: HcsOperation): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext(operation.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hcsGetOperationId(operation: HcsOperation): ULong =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId(operation.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetOperationResult(operation: HcsOperation, resultdocument: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult(operation.rawAddress.toCPointer<ByteVar>(), resultdocument.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetOperationResultAndProcessInfo(operation: HcsOperation, processinformation: MutPtr<HcsProcessInformation>, resultdocument: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo(operation.rawAddress.toCPointer<ByteVar>(), processinformation.rawAddress.toCPointer<ByteVar>(), resultdocument.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetOperationType(operation: HcsOperation): HcsOperationType =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType(operation.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetProcessFromOperation(operation: HcsOperation): HcsProcess =
    MutPtr(windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation(operation.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun hcsGetProcessInfo(process: HcsProcess, operation: HcsOperation): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo(process.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetProcessProperties(process: HcsProcess, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties(process.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), propertyquery.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetProcessorCompatibilityFromSavedState(runtimefilename: Pcwstr, processorfeaturesstring: MutPtr<Pcwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState(runtimefilename.rawAddress.toCPointer<ByteVar>(), processorfeaturesstring.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGetServiceProperties(propertyquery: Pcwstr, result: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties(propertyquery.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGrantVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess(vmid.rawAddress.toCPointer<ByteVar>(), filepath.rawAddress.toCPointer<ByteVar>())

public actual fun hcsGrantVmGroupAccess(filepath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess(filepath.rawAddress.toCPointer<ByteVar>())

public actual fun hcsImportLayer(layerpath: Pcwstr, sourcefolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsImportLayer(layerpath.rawAddress.toCPointer<ByteVar>(), sourcefolderpath.rawAddress.toCPointer<ByteVar>(), layerdata.rawAddress.toCPointer<ByteVar>())

public actual fun hcsInitializeLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer(writablelayermountpath.rawAddress.toCPointer<ByteVar>(), writablelayerfolderpath.rawAddress.toCPointer<ByteVar>(), layerdata.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsInitializeWritableLayer(writablelayerpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer(writablelayerpath.rawAddress.toCPointer<ByteVar>(), layerdata.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsModifyComputeSystem(computesystem: HcsSystem, operation: HcsOperation, configuration: Pcwstr, identity: Handle): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem(computesystem.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), configuration.rawAddress.toCPointer<ByteVar>(), identity.rawAddress.toCPointer<ByteVar>())

public actual fun hcsModifyProcess(process: HcsProcess, operation: HcsOperation, settings: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess(process.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), settings.rawAddress.toCPointer<ByteVar>())

public actual fun hcsModifyServiceSettings(settings: Pcwstr, result: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings(settings.rawAddress.toCPointer<ByteVar>(), result.rawAddress.toCPointer<ByteVar>())

public actual fun hcsOpenComputeSystem(id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr<HcsSystem>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem(id.rawAddress.toCPointer<ByteVar>(), requestedaccess, computesystem.rawAddress.toCPointer<ByteVar>())

public actual fun hcsOpenComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr<HcsSystem>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace(idnamespace.rawAddress.toCPointer<ByteVar>(), id.rawAddress.toCPointer<ByteVar>(), requestedaccess, computesystem.rawAddress.toCPointer<ByteVar>())

public actual fun hcsOpenProcess(computesystem: HcsSystem, processid: UInt, requestedaccess: UInt, process: MutPtr<HcsProcess>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess(computesystem.rawAddress.toCPointer<ByteVar>(), processid, requestedaccess, process.rawAddress.toCPointer<ByteVar>())

public actual fun hcsPauseComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem(computesystem.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsResumeComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem(computesystem.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsRevokeVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess(vmid.rawAddress.toCPointer<ByteVar>(), filepath.rawAddress.toCPointer<ByteVar>())

public actual fun hcsRevokeVmGroupAccess(filepath: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess(filepath.rawAddress.toCPointer<ByteVar>())

public actual fun hcsSaveComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem(computesystem.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsSetComputeSystemCallback(computesystem: HcsSystem, callbackoptions: HcsEventOptions, context: ConstPtr<CVoid>, callback: HcsEventCallback): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback(computesystem.rawAddress.toCPointer<ByteVar>(), callbackoptions, context.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun hcsSetOperationCallback(operation: HcsOperation, context: ConstPtr<CVoid>, callback: HcsOperationCompletion): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback(operation.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun hcsSetOperationContext(operation: HcsOperation, context: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext(operation.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>())

public actual fun hcsSetProcessCallback(process: HcsProcess, callbackoptions: HcsEventOptions, context: ConstPtr<CVoid>, callback: HcsEventCallback): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback(process.rawAddress.toCPointer<ByteVar>(), callbackoptions, context.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun hcsSetupBaseOSLayer(layerpath: Pcwstr, vhdhandle: Handle, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer(layerpath.rawAddress.toCPointer<ByteVar>(), vhdhandle.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsSetupBaseOSVolume(layerpath: Pcwstr, volumepath: Pcwstr, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume(layerpath.rawAddress.toCPointer<ByteVar>(), volumepath.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsShutDownComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem(computesystem.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsSignalProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess(process.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsStartComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem(computesystem.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsSubmitWerReport(settings: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport(settings.rawAddress.toCPointer<ByteVar>())

public actual fun hcsTerminateComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem(computesystem.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsTerminateProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess(process.rawAddress.toCPointer<ByteVar>(), operation.rawAddress.toCPointer<ByteVar>(), options.rawAddress.toCPointer<ByteVar>())

public actual fun hcsWaitForComputeSystemExit(computesystem: HcsSystem, timeoutms: UInt, result: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit(computesystem.rawAddress.toCPointer<ByteVar>(), timeoutms, result.rawAddress.toCPointer<ByteVar>())

public actual fun hcsWaitForOperationResult(operation: HcsOperation, timeoutms: UInt, resultdocument: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult(operation.rawAddress.toCPointer<ByteVar>(), timeoutms, resultdocument.rawAddress.toCPointer<ByteVar>())

public actual fun hcsWaitForOperationResultAndProcessInfo(operation: HcsOperation, timeoutms: UInt, processinformation: MutPtr<HcsProcessInformation>, resultdocument: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo(operation.rawAddress.toCPointer<ByteVar>(), timeoutms, processinformation.rawAddress.toCPointer<ByteVar>(), resultdocument.rawAddress.toCPointer<ByteVar>())

public actual fun hcsWaitForProcessExit(computesystem: HcsProcess, timeoutms: UInt, result: MutPtr<Pwstr>): Hresult =
    windowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit(computesystem.rawAddress.toCPointer<ByteVar>(), timeoutms, result.rawAddress.toCPointer<ByteVar>())
