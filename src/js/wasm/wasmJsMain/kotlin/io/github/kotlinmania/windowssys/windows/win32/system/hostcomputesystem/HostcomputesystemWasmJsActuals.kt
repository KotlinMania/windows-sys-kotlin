@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityDescriptor

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemHostcomputesystemNapiAddon(): Boolean

private val windowsWin32SystemHostcomputesystemNapiAvailable: Boolean = initWindowsWin32SystemHostcomputesystemNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsExportLayer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsExportLayer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsImportLayer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsImportLayer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit(p0: String, p1: Int, p2: String): Int

public actual fun hcsAddResourceToOperation(operation: HcsOperation, type: HcsResourceType, uri: Pcwstr, handle: Handle): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsAddResourceToOperation(operation.rawAddress.toString(), type, uri.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsAttachLayerStorageFilter(layerpath: Pcwstr, layerdata: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsAttachLayerStorageFilter(layerpath.rawAddress.toString(), layerdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCancelOperation(operation: HcsOperation): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCancelOperation(operation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCloseComputeSystem(computesystem: HcsSystem) {
    if (windowsWin32SystemHostcomputesystemNapiAvailable) {
        wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCloseComputeSystem(computesystem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcsCloseOperation(operation: HcsOperation) {
    if (windowsWin32SystemHostcomputesystemNapiAvailable) {
        wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCloseOperation(operation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcsCloseProcess(process: HcsProcess) {
    if (windowsWin32SystemHostcomputesystemNapiAvailable) {
        wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCloseProcess(process.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcsCrashComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCrashComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateComputeSystem(id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr<SecurityDescriptor>, computesystem: MutPtr<HcsSystem>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystem(id.rawAddress.toString(), configuration.rawAddress.toString(), operation.rawAddress.toString(), securitydescriptor.rawAddress.toString(), computesystem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, options: ConstPtr<HcsCreateOptions>, computesystem: MutPtr<HcsSystem>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateComputeSystemInNamespace(idnamespace.rawAddress.toString(), id.rawAddress.toString(), configuration.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString(), computesystem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateEmptyGuestStateFile(gueststatefilepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyGuestStateFile(gueststatefilepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateEmptyRuntimeStateFile(runtimestatefilepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateOperation(context: ConstPtr<CVoid>, callback: HcsOperationCompletion): HcsOperation =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateOperation(context.rawAddress.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateOperationWithNotifications(eventtypes: HcsOperationOptions, context: ConstPtr<CVoid>, callback: HcsEventCallback): HcsOperation =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateOperationWithNotifications(eventtypes, context.rawAddress.toString(), 0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateProcess(computesystem: HcsSystem, processparameters: Pcwstr, operation: HcsOperation, securitydescriptor: ConstPtr<SecurityDescriptor>, process: MutPtr<HcsProcess>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsCreateProcess(computesystem.rawAddress.toString(), processparameters.rawAddress.toString(), operation.rawAddress.toString(), securitydescriptor.rawAddress.toString(), process.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsDestroyLayer(layerpath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsDestroyLayer(layerpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsDetachLayerStorageFilter(layerpath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsDetachLayerStorageFilter(layerpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsEnumerateComputeSystems(query: Pcwstr, operation: HcsOperation): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystems(query.rawAddress.toString(), operation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsEnumerateComputeSystemsInNamespace(idnamespace: Pcwstr, query: Pcwstr, operation: HcsOperation): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsEnumerateComputeSystemsInNamespace(idnamespace.rawAddress.toString(), query.rawAddress.toString(), operation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsExportLayer(layerpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsExportLayer(layerpath.rawAddress.toString(), exportfolderpath.rawAddress.toString(), layerdata.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsExportLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsExportLegacyWritableLayer(writablelayermountpath.rawAddress.toString(), writablelayerfolderpath.rawAddress.toString(), exportfolderpath.rawAddress.toString(), layerdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsFormatWritableLayerVhd(vhdhandle: Handle): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsFormatWritableLayerVhd(vhdhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetComputeSystemFromOperation(operation: HcsOperation): HcsSystem =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemFromOperation(operation.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetComputeSystemProperties(computesystem: HcsSystem, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetComputeSystemProperties(computesystem.rawAddress.toString(), operation.rawAddress.toString(), propertyquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetLayerVhdMountPath(vhdhandle: Handle, mountpath: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetLayerVhdMountPath(vhdhandle.rawAddress.toString(), mountpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationContext(operation: HcsOperation): MutPtr<CVoid> =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationContext(operation.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationId(operation: HcsOperation): ULong =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationId(operation.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationResult(operation: HcsOperation, resultdocument: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResult(operation.rawAddress.toString(), resultdocument.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationResultAndProcessInfo(operation: HcsOperation, processinformation: MutPtr<HcsProcessInformation>, resultdocument: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationResultAndProcessInfo(operation.rawAddress.toString(), processinformation.rawAddress.toString(), resultdocument.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationType(operation: HcsOperation): HcsOperationType =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetOperationType(operation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessFromOperation(operation: HcsOperation): HcsProcess =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetProcessFromOperation(operation.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessInfo(process: HcsProcess, operation: HcsOperation): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetProcessInfo(process.rawAddress.toString(), operation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessProperties(process: HcsProcess, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetProcessProperties(process.rawAddress.toString(), operation.rawAddress.toString(), propertyquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessorCompatibilityFromSavedState(runtimefilename: Pcwstr, processorfeaturesstring: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetProcessorCompatibilityFromSavedState(runtimefilename.rawAddress.toString(), processorfeaturesstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetServiceProperties(propertyquery: Pcwstr, result: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGetServiceProperties(propertyquery.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGrantVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGrantVmAccess(vmid.rawAddress.toString(), filepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGrantVmGroupAccess(filepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsGrantVmGroupAccess(filepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsImportLayer(layerpath: Pcwstr, sourcefolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsImportLayer(layerpath.rawAddress.toString(), sourcefolderpath.rawAddress.toString(), layerdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsInitializeLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsInitializeLegacyWritableLayer(writablelayermountpath.rawAddress.toString(), writablelayerfolderpath.rawAddress.toString(), layerdata.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsInitializeWritableLayer(writablelayerpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsInitializeWritableLayer(writablelayerpath.rawAddress.toString(), layerdata.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsModifyComputeSystem(computesystem: HcsSystem, operation: HcsOperation, configuration: Pcwstr, identity: Handle): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsModifyComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), configuration.rawAddress.toString(), identity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsModifyProcess(process: HcsProcess, operation: HcsOperation, settings: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsModifyProcess(process.rawAddress.toString(), operation.rawAddress.toString(), settings.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsModifyServiceSettings(settings: Pcwstr, result: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsModifyServiceSettings(settings.rawAddress.toString(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsOpenComputeSystem(id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr<HcsSystem>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystem(id.rawAddress.toString(), requestedaccess.toInt(), computesystem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsOpenComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, requestedaccess: UInt, computesystem: MutPtr<HcsSystem>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsOpenComputeSystemInNamespace(idnamespace.rawAddress.toString(), id.rawAddress.toString(), requestedaccess.toInt(), computesystem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsOpenProcess(computesystem: HcsSystem, processid: UInt, requestedaccess: UInt, process: MutPtr<HcsProcess>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsOpenProcess(computesystem.rawAddress.toString(), processid.toInt(), requestedaccess.toInt(), process.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsPauseComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsPauseComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsResumeComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsResumeComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsRevokeVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmAccess(vmid.rawAddress.toString(), filepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsRevokeVmGroupAccess(filepath: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsRevokeVmGroupAccess(filepath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSaveComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSaveComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetComputeSystemCallback(computesystem: HcsSystem, callbackoptions: HcsEventOptions, context: ConstPtr<CVoid>, callback: HcsEventCallback): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetComputeSystemCallback(computesystem.rawAddress.toString(), callbackoptions, context.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetOperationCallback(operation: HcsOperation, context: ConstPtr<CVoid>, callback: HcsOperationCompletion): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetOperationCallback(operation.rawAddress.toString(), context.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetOperationContext(operation: HcsOperation, context: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetOperationContext(operation.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetProcessCallback(process: HcsProcess, callbackoptions: HcsEventOptions, context: ConstPtr<CVoid>, callback: HcsEventCallback): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetProcessCallback(process.rawAddress.toString(), callbackoptions, context.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetupBaseOSLayer(layerpath: Pcwstr, vhdhandle: Handle, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSLayer(layerpath.rawAddress.toString(), vhdhandle.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetupBaseOSVolume(layerpath: Pcwstr, volumepath: Pcwstr, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSetupBaseOSVolume(layerpath.rawAddress.toString(), volumepath.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsShutDownComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsShutDownComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSignalProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSignalProcess(process.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsStartComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsStartComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSubmitWerReport(settings: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsSubmitWerReport(settings.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsTerminateComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsTerminateComputeSystem(computesystem.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsTerminateProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsTerminateProcess(process.rawAddress.toString(), operation.rawAddress.toString(), options.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForComputeSystemExit(computesystem: HcsSystem, timeoutms: UInt, result: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsWaitForComputeSystemExit(computesystem.rawAddress.toString(), timeoutms.toInt(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForOperationResult(operation: HcsOperation, timeoutms: UInt, resultdocument: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResult(operation.rawAddress.toString(), timeoutms.toInt(), resultdocument.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForOperationResultAndProcessInfo(operation: HcsOperation, timeoutms: UInt, processinformation: MutPtr<HcsProcessInformation>, resultdocument: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsWaitForOperationResultAndProcessInfo(operation.rawAddress.toString(), timeoutms.toInt(), processinformation.rawAddress.toString(), resultdocument.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForProcessExit(computesystem: HcsProcess, timeoutms: UInt, result: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputesystemNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputesystemHcsWaitForProcessExit(computesystem.rawAddress.toString(), timeoutms.toInt(), result.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
