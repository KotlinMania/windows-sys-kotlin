@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemHostcomputesystemNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun HcsAddResourceToOperation(operation: HCS_OPERATION, type: HCS_RESOURCE_TYPE, uri: PCWSTR, handle: HANDLE): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsAddResourceToOperation(operation.toString(), type, uri.toString(), handle.toString()) as Int) else 0

public actual fun HcsAttachLayerStorageFilter(layerpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsAttachLayerStorageFilter(layerpath.toString(), layerdata.toString()) as Int) else 0

public actual fun HcsCancelOperation(operation: HCS_OPERATION): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCancelOperation(operation.toString()) as Int) else 0

public actual fun HcsCloseComputeSystem(computesystem: HCS_SYSTEM) {
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) {
        _windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCloseComputeSystem(computesystem.toString())
    }
}

public actual fun HcsCloseOperation(operation: HCS_OPERATION) {
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) {
        _windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCloseOperation(operation.toString())
    }
}

public actual fun HcsCloseProcess(process: HCS_PROCESS) {
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) {
        _windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCloseProcess(process.toString())
    }
}

public actual fun HcsCrashComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCrashComputeSystem(computesystem.toString(), operation.toString(), options.toString()) as Int) else 0

public actual fun HcsCreateComputeSystem(id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, computesystem: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystem(id.toString(), configuration.toString(), operation.toString(), securitydescriptor.toString(), computesystem.toString()) as Int) else 0

public actual fun HcsCreateComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, configuration: PCWSTR, operation: HCS_OPERATION, options: Long, computesystem: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCreateComputeSystemInNamespace(idnamespace.toString(), id.toString(), configuration.toString(), operation.toString(), options.toString(), computesystem.toString()) as Int) else 0

public actual fun HcsCreateEmptyGuestStateFile(gueststatefilepath: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyGuestStateFile(gueststatefilepath.toString()) as Int) else 0

public actual fun HcsCreateEmptyRuntimeStateFile(runtimestatefilepath: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCreateEmptyRuntimeStateFile(runtimestatefilepath.toString()) as Int) else 0

public actual fun HcsCreateOperation(context: Long, callback: HCS_OPERATION_COMPLETION): HCS_OPERATION =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperation(context.toString(), callback.toLong().toString()) as String).toLong() else 0L

public actual fun HcsCreateOperationWithNotifications(eventtypes: HCS_OPERATION_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HCS_OPERATION =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCreateOperationWithNotifications(eventtypes, context.toString(), callback.toLong().toString()) as String).toLong() else 0L

public actual fun HcsCreateProcess(computesystem: HCS_SYSTEM, processparameters: PCWSTR, operation: HCS_OPERATION, securitydescriptor: Long, process: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsCreateProcess(computesystem.toString(), processparameters.toString(), operation.toString(), securitydescriptor.toString(), process.toString()) as Int) else 0

public actual fun HcsDestroyLayer(layerpath: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsDestroyLayer(layerpath.toString()) as Int) else 0

public actual fun HcsDetachLayerStorageFilter(layerpath: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsDetachLayerStorageFilter(layerpath.toString()) as Int) else 0

public actual fun HcsEnumerateComputeSystems(query: PCWSTR, operation: HCS_OPERATION): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystems(query.toString(), operation.toString()) as Int) else 0

public actual fun HcsEnumerateComputeSystemsInNamespace(idnamespace: PCWSTR, query: PCWSTR, operation: HCS_OPERATION): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsEnumerateComputeSystemsInNamespace(idnamespace.toString(), query.toString(), operation.toString()) as Int) else 0

public actual fun HcsExportLayer(layerpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsExportLayer(layerpath.toString(), exportfolderpath.toString(), layerdata.toString(), options.toString()) as Int) else 0

public actual fun HcsExportLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, exportfolderpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsExportLegacyWritableLayer(writablelayermountpath.toString(), writablelayerfolderpath.toString(), exportfolderpath.toString(), layerdata.toString()) as Int) else 0

public actual fun HcsFormatWritableLayerVhd(vhdhandle: HANDLE): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsFormatWritableLayerVhd(vhdhandle.toString()) as Int) else 0

public actual fun HcsGetComputeSystemFromOperation(operation: HCS_OPERATION): HCS_SYSTEM =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemFromOperation(operation.toString()) as String).toLong() else 0L

public actual fun HcsGetComputeSystemProperties(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetComputeSystemProperties(computesystem.toString(), operation.toString(), propertyquery.toString()) as Int) else 0

public actual fun HcsGetLayerVhdMountPath(vhdhandle: HANDLE, mountpath: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetLayerVhdMountPath(vhdhandle.toString(), mountpath.toString()) as Int) else 0

public actual fun HcsGetOperationContext(operation: HCS_OPERATION): Long =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationContext(operation.toString()) as String).toLong() else 0L

public actual fun HcsGetOperationId(operation: HCS_OPERATION): ULong =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationId(operation.toString()) as String).toULong() else 0uL

public actual fun HcsGetOperationResult(operation: HCS_OPERATION, resultdocument: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResult(operation.toString(), resultdocument.toString()) as Int) else 0

public actual fun HcsGetOperationResultAndProcessInfo(operation: HCS_OPERATION, processinformation: Long, resultdocument: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationResultAndProcessInfo(operation.toString(), processinformation.toString(), resultdocument.toString()) as Int) else 0

public actual fun HcsGetOperationType(operation: HCS_OPERATION): HCS_OPERATION_TYPE =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetOperationType(operation.toString()) as Int) else 0

public actual fun HcsGetProcessFromOperation(operation: HCS_OPERATION): HCS_PROCESS =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessFromOperation(operation.toString()) as String).toLong() else 0L

public actual fun HcsGetProcessInfo(process: HCS_PROCESS, operation: HCS_OPERATION): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessInfo(process.toString(), operation.toString()) as Int) else 0

public actual fun HcsGetProcessProperties(process: HCS_PROCESS, operation: HCS_OPERATION, propertyquery: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessProperties(process.toString(), operation.toString(), propertyquery.toString()) as Int) else 0

public actual fun HcsGetProcessorCompatibilityFromSavedState(runtimefilename: PCWSTR, processorfeaturesstring: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetProcessorCompatibilityFromSavedState(runtimefilename.toString(), processorfeaturesstring.toString()) as Int) else 0

public actual fun HcsGetServiceProperties(propertyquery: PCWSTR, result: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGetServiceProperties(propertyquery.toString(), result.toString()) as Int) else 0

public actual fun HcsGrantVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmAccess(vmid.toString(), filepath.toString()) as Int) else 0

public actual fun HcsGrantVmGroupAccess(filepath: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsGrantVmGroupAccess(filepath.toString()) as Int) else 0

public actual fun HcsImportLayer(layerpath: PCWSTR, sourcefolderpath: PCWSTR, layerdata: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsImportLayer(layerpath.toString(), sourcefolderpath.toString(), layerdata.toString()) as Int) else 0

public actual fun HcsInitializeLegacyWritableLayer(writablelayermountpath: PCWSTR, writablelayerfolderpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsInitializeLegacyWritableLayer(writablelayermountpath.toString(), writablelayerfolderpath.toString(), layerdata.toString(), options.toString()) as Int) else 0

public actual fun HcsInitializeWritableLayer(writablelayerpath: PCWSTR, layerdata: PCWSTR, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsInitializeWritableLayer(writablelayerpath.toString(), layerdata.toString(), options.toString()) as Int) else 0

public actual fun HcsModifyComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, configuration: PCWSTR, identity: HANDLE): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsModifyComputeSystem(computesystem.toString(), operation.toString(), configuration.toString(), identity.toString()) as Int) else 0

public actual fun HcsModifyProcess(process: HCS_PROCESS, operation: HCS_OPERATION, settings: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsModifyProcess(process.toString(), operation.toString(), settings.toString()) as Int) else 0

public actual fun HcsModifyServiceSettings(settings: PCWSTR, result: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsModifyServiceSettings(settings.toString(), result.toString()) as Int) else 0

public actual fun HcsOpenComputeSystem(id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystem(id.toString(), requestedaccess.toInt(), computesystem.toString()) as Int) else 0

public actual fun HcsOpenComputeSystemInNamespace(idnamespace: PCWSTR, id: PCWSTR, requestedaccess: UInt, computesystem: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsOpenComputeSystemInNamespace(idnamespace.toString(), id.toString(), requestedaccess.toInt(), computesystem.toString()) as Int) else 0

public actual fun HcsOpenProcess(computesystem: HCS_SYSTEM, processid: UInt, requestedaccess: UInt, process: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsOpenProcess(computesystem.toString(), processid.toInt(), requestedaccess.toInt(), process.toString()) as Int) else 0

public actual fun HcsPauseComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsPauseComputeSystem(computesystem.toString(), operation.toString(), options.toString()) as Int) else 0

public actual fun HcsResumeComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsResumeComputeSystem(computesystem.toString(), operation.toString(), options.toString()) as Int) else 0

public actual fun HcsRevokeVmAccess(vmid: PCWSTR, filepath: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmAccess(vmid.toString(), filepath.toString()) as Int) else 0

public actual fun HcsRevokeVmGroupAccess(filepath: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsRevokeVmGroupAccess(filepath.toString()) as Int) else 0

public actual fun HcsSaveComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsSaveComputeSystem(computesystem.toString(), operation.toString(), options.toString()) as Int) else 0

public actual fun HcsSetComputeSystemCallback(computesystem: HCS_SYSTEM, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsSetComputeSystemCallback(computesystem.toString(), callbackoptions, context.toString(), callback.toLong().toString()) as Int) else 0

public actual fun HcsSetOperationCallback(operation: HCS_OPERATION, context: Long, callback: HCS_OPERATION_COMPLETION): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationCallback(operation.toString(), context.toString(), callback.toLong().toString()) as Int) else 0

public actual fun HcsSetOperationContext(operation: HCS_OPERATION, context: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsSetOperationContext(operation.toString(), context.toString()) as Int) else 0

public actual fun HcsSetProcessCallback(process: HCS_PROCESS, callbackoptions: HCS_EVENT_OPTIONS, context: Long, callback: HCS_EVENT_CALLBACK): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsSetProcessCallback(process.toString(), callbackoptions, context.toString(), callback.toLong().toString()) as Int) else 0

public actual fun HcsSetupBaseOSLayer(layerpath: PCWSTR, vhdhandle: HANDLE, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSLayer(layerpath.toString(), vhdhandle.toString(), options.toString()) as Int) else 0

public actual fun HcsSetupBaseOSVolume(layerpath: PCWSTR, volumepath: PCWSTR, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsSetupBaseOSVolume(layerpath.toString(), volumepath.toString(), options.toString()) as Int) else 0

public actual fun HcsShutDownComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsShutDownComputeSystem(computesystem.toString(), operation.toString(), options.toString()) as Int) else 0

public actual fun HcsSignalProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsSignalProcess(process.toString(), operation.toString(), options.toString()) as Int) else 0

public actual fun HcsStartComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsStartComputeSystem(computesystem.toString(), operation.toString(), options.toString()) as Int) else 0

public actual fun HcsSubmitWerReport(settings: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsSubmitWerReport(settings.toString()) as Int) else 0

public actual fun HcsTerminateComputeSystem(computesystem: HCS_SYSTEM, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsTerminateComputeSystem(computesystem.toString(), operation.toString(), options.toString()) as Int) else 0

public actual fun HcsTerminateProcess(process: HCS_PROCESS, operation: HCS_OPERATION, options: PCWSTR): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsTerminateProcess(process.toString(), operation.toString(), options.toString()) as Int) else 0

public actual fun HcsWaitForComputeSystemExit(computesystem: HCS_SYSTEM, timeoutms: UInt, result: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForComputeSystemExit(computesystem.toString(), timeoutms.toInt(), result.toString()) as Int) else 0

public actual fun HcsWaitForOperationResult(operation: HCS_OPERATION, timeoutms: UInt, resultdocument: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResult(operation.toString(), timeoutms.toInt(), resultdocument.toString()) as Int) else 0

public actual fun HcsWaitForOperationResultAndProcessInfo(operation: HCS_OPERATION, timeoutms: UInt, processinformation: Long, resultdocument: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForOperationResultAndProcessInfo(operation.toString(), timeoutms.toInt(), processinformation.toString(), resultdocument.toString()) as Int) else 0

public actual fun HcsWaitForProcessExit(computesystem: HCS_PROCESS, timeoutms: UInt, result: Long): HRESULT =
    if (_windowsWin32SystemHostcomputesystemNapiAddon != null) (_windowsWin32SystemHostcomputesystemNapiAddon.windowssys_windows_win32_system_hostcomputesystem_HcsWaitForProcessExit(computesystem.toString(), timeoutms.toInt(), result.toString()) as Int) else 0
