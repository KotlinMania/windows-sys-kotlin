@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemHostcomputesystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun hcsAddResourceToOperation(operation: HcsOperation, type: HcsResourceType, uri: Pcwstr, handle: Handle): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation(operation.rawAddress.toString(), type, uri.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsAttachLayerStorageFilter(layerpath: Pcwstr, layerdata: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter(layerpath.rawAddress.toString(), layerdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCancelOperation(operation: HcsOperation): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation(operation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCloseComputeSystem(computesystem: HcsSystem) {
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) {
        windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem(computesystem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcsCloseOperation(operation: HcsOperation) {
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) {
        windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation(operation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcsCloseProcess(process: HcsProcess) {
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) {
        windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess(process.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcsCrashComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateComputeSystem(id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr, computesystem: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem(id.rawAddress.toString(), configuration.rawAddress.toString(), operation.rawAddress.toString(), securitydescriptor.rawAddress.toString(), computesystem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, options: ConstPtr, computesystem: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace(idnamespace.rawAddress.toString(), id.rawAddress.toString(), configuration.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString(), computesystem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateEmptyGuestStateFile(gueststatefilepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile(gueststatefilepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile(runtimestatefilepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateOperation(context: ConstPtr, callback: HcsOperationCompletion): HcsOperation =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) MutPtr((windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation(context.rawAddress.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateOperationWithNotifications(eventtypes: HcsOperationOptions, context: ConstPtr, callback: HcsEventCallback): HcsOperation =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) MutPtr((windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications(eventtypes, context.rawAddress.toString(), 0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateProcess(computesystem: HcsSystem, processparameters: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr, process: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess(computesystem.rawAddress.toString(), processparameters.rawAddress.toString(), operation.rawAddress.toString(), securitydescriptor.rawAddress.toString(), process.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsDestroyLayer(layerpath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer(layerpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsDetachLayerStorageFilter(layerpath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter(layerpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsEnumerateComputeSystems(query: Pcwstr, operation: HcsOperation): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems(query.rawAddress.toString(), operation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsEnumerateComputeSystemsInNamespace(idnamespace: Pcwstr, query: Pcwstr, operation: HcsOperation): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace(idnamespace.rawAddress.toString(), query.rawAddress.toString(), operation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsExportLayer(layerpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsExportLayer(layerpath.rawAddress.toString(), exportfolderpath.rawAddress.toString(), layerdata.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsExportLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer(writablelayermountpath.rawAddress.toString(), writablelayerfolderpath.rawAddress.toString(), exportfolderpath.rawAddress.toString(), layerdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsFormatWritableLayerVhd(vhdhandle: Handle): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd(vhdhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetComputeSystemFromOperation(operation: HcsOperation): HcsSystem =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) MutPtr((windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation(operation.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetComputeSystemProperties(computesystem: HcsSystem, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties(computesystem.rawAddress.toString(), operation.rawAddress.toString(), propertyquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetLayerVhdMountPath(vhdhandle: Handle, mountpath: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath(vhdhandle.rawAddress.toString(), mountpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationContext(operation: HcsOperation): MutPtr =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) MutPtr((windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext(operation.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationId(operation: HcsOperation): ULong =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId(operation.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationResult(operation: HcsOperation, resultdocument: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult(operation.rawAddress.toString(), resultdocument.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationResultAndProcessInfo(operation: HcsOperation, processinformation: MutPtr, resultdocument: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo(operation.rawAddress.toString(), processinformation.rawAddress.toString(), resultdocument.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationType(operation: HcsOperation): HcsOperationType =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType(operation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessFromOperation(operation: HcsOperation): HcsProcess =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) MutPtr((windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation(operation.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessInfo(process: HcsProcess, operation: HcsOperation): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo(process.rawAddress.toString(), operation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessProperties(process: HcsProcess, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties(process.rawAddress.toString(), operation.rawAddress.toString(), propertyquery.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessorCompatibilityFromSavedState(runtimefilename: Pcwstr, processorfeaturesstring: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState(runtimefilename.rawAddress.toString(), processorfeaturesstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetServiceProperties(propertyquery: Pcwstr, result: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties(propertyquery.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGrantVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess(vmid.rawAddress.toString(), filepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGrantVmGroupAccess(filepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess(filepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsImportLayer(layerpath: Pcwstr, sourcefolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsImportLayer(layerpath.rawAddress.toString(), sourcefolderpath.rawAddress.toString(), layerdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsInitializeLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer(writablelayermountpath.rawAddress.toString(), writablelayerfolderpath.rawAddress.toString(), layerdata.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsInitializeWritableLayer(writablelayerpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer(writablelayerpath.rawAddress.toString(), layerdata.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsModifyComputeSystem(computesystem: HcsSystem, operation: HcsOperation, configuration: Pcwstr, identity: Handle): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), configuration.rawAddress.toString(), identity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsModifyProcess(process: HcsProcess, operation: HcsOperation, settings: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess(process.rawAddress.toString(), operation.rawAddress.toString(), settings.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsModifyServiceSettings(settings: Pcwstr, result: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings(settings.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsOpenComputeSystem(id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem(id.rawAddress.toString(), requestedaccess.toInt(), computesystem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsOpenComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace(idnamespace.rawAddress.toString(), id.rawAddress.toString(), requestedaccess.toInt(), computesystem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsOpenProcess(computesystem: HcsSystem, processid: UInt, requestedaccess: UInt, process: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess(computesystem.rawAddress.toString(), processid.toInt(), requestedaccess.toInt(), process.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsPauseComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsResumeComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsRevokeVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess(vmid.rawAddress.toString(), filepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsRevokeVmGroupAccess(filepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess(filepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSaveComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetComputeSystemCallback(computesystem: HcsSystem, callbackoptions: HcsEventOptions, context: ConstPtr, callback: HcsEventCallback): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback(computesystem.rawAddress.toString(), callbackoptions, context.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetOperationCallback(operation: HcsOperation, context: ConstPtr, callback: HcsOperationCompletion): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback(operation.rawAddress.toString(), context.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetOperationContext(operation: HcsOperation, context: ConstPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext(operation.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetProcessCallback(process: HcsProcess, callbackoptions: HcsEventOptions, context: ConstPtr, callback: HcsEventCallback): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback(process.rawAddress.toString(), callbackoptions, context.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetupBaseOSLayer(layerpath: Pcwstr, vhdhandle: Handle, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer(layerpath.rawAddress.toString(), vhdhandle.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetupBaseOSVolume(layerpath: Pcwstr, volumepath: Pcwstr, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume(layerpath.rawAddress.toString(), volumepath.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsShutDownComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSignalProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess(process.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsStartComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSubmitWerReport(settings: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport(settings.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsTerminateComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsTerminateProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess(process.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForComputeSystemExit(computesystem: HcsSystem, timeoutms: UInt, result: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit(computesystem.rawAddress.toString(), timeoutms.toInt(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForOperationResult(operation: HcsOperation, timeoutms: UInt, resultdocument: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult(operation.rawAddress.toString(), timeoutms.toInt(), resultdocument.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForOperationResultAndProcessInfo(operation: HcsOperation, timeoutms: UInt, processinformation: MutPtr, resultdocument: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo(operation.rawAddress.toString(), timeoutms.toInt(), processinformation.rawAddress.toString(), resultdocument.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForProcessExit(computesystem: HcsProcess, timeoutms: UInt, result: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAddon != null) (windowsWin32SystemHostcomputesystemNapiAddon.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit(computesystem.rawAddress.toString(), timeoutms.toInt(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
