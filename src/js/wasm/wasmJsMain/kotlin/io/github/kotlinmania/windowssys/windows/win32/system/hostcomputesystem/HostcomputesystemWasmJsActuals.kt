@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemHostcomputesystemNapiAddon(): Boolean

private val _windowsWin32SystemHostcomputesystemNapiAvailable: Boolean = _initWindowsWin32SystemHostcomputesystemNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsAddResourceToOperation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsAddResourceToOperation(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsAttachLayerStorageFilter(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsAttachLayerStorageFilter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCancelOperation(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCancelOperation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCloseComputeSystem(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCloseComputeSystem(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCloseOperation(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCloseOperation(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCloseProcess(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCloseProcess(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCrashComputeSystem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCrashComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystem(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystem(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystemInNamespace(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystemInNamespace(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyGuestStateFile(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyGuestStateFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyRuntimeStateFile(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyRuntimeStateFile(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperation(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperationWithNotifications(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperationWithNotifications(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsCreateProcess(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateProcess(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsDestroyLayer(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsDestroyLayer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsDetachLayerStorageFilter(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsDetachLayerStorageFilter(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystems(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystems(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystemsInNamespace(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystemsInNamespace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsExportLayer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsExportLayer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsExportLegacyWritableLayer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsExportLegacyWritableLayer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsFormatWritableLayerVhd(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsFormatWritableLayerVhd(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemFromOperation(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemFromOperation(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemProperties(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemProperties(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetLayerVhdMountPath(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetLayerVhdMountPath(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationContext(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationId(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationId(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResult(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResult(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResultAndProcessInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResultAndProcessInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationType(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationType(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessFromOperation(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessFromOperation(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessProperties(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessProperties(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessorCompatibilityFromSavedState(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessorCompatibilityFromSavedState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGetServiceProperties(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetServiceProperties(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmAccess(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmAccess(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmGroupAccess(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmGroupAccess(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsImportLayer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsImportLayer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsInitializeLegacyWritableLayer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsInitializeLegacyWritableLayer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsInitializeWritableLayer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsInitializeWritableLayer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsModifyComputeSystem(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsModifyComputeSystem(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsModifyProcess(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsModifyProcess(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsModifyServiceSettings(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsModifyServiceSettings(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystem(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystemInNamespace(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystemInNamespace(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsOpenProcess(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsOpenProcess(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsPauseComputeSystem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsPauseComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsResumeComputeSystem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsResumeComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmAccess(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmAccess(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmGroupAccess(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmGroupAccess(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsSaveComputeSystem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSaveComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsSetComputeSystemCallback(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetComputeSystemCallback(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationContext(p0, p1)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsSetProcessCallback(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetProcessCallback(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSLayer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSLayer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSVolume(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSVolume(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsShutDownComputeSystem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsShutDownComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsSignalProcess(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSignalProcess(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsStartComputeSystem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsStartComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsSubmitWerReport(p0)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSubmitWerReport(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsTerminateComputeSystem(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsTerminateComputeSystem(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsTerminateProcess(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsTerminateProcess(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForComputeSystemExit(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsWaitForComputeSystemExit(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResult(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResult(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResultAndProcessInfo(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResultAndProcessInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_hostcomputesystem_hcsWaitForProcessExit(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsWaitForProcessExit(p0: String, p1: Int, p2: String): Int

public actual fun hcsAddResourceToOperation(operation: HcsOperation, type: HcsResourceType, uri: Pcwstr, handle: Handle): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsAddResourceToOperation((operation?.value ?: 0L).toString(), type, (uri?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsAttachLayerStorageFilter(layerpath: Pcwstr, layerdata: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsAttachLayerStorageFilter((layerpath?.value ?: 0L).toString(), (layerdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCancelOperation(operation: HcsOperation): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCancelOperation((operation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCloseComputeSystem(computesystem: HcsSystem) {
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCloseComputeSystem((computesystem?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcsCloseOperation(operation: HcsOperation) {
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCloseOperation((operation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcsCloseProcess(process: HcsProcess) {
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) {
        _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCloseProcess((process?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcsCrashComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCrashComputeSystem((computesystem?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateComputeSystem(id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, securitydescriptor: COpaquePointer?, computesystem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystem((id?.value ?: 0L).toString(), (configuration?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (computesystem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, configuration: Pcwstr, operation: HcsOperation, options: COpaquePointer?, computesystem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateComputeSystemInNamespace((idnamespace?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), (configuration?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString(), (computesystem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateEmptyGuestStateFile(gueststatefilepath: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyGuestStateFile((gueststatefilepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateEmptyRuntimeStateFile(runtimestatefilepath: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateEmptyRuntimeStateFile((runtimestatefilepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateOperation(context: COpaquePointer?, callback: HcsOperationCompletion): HcsOperation =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperation((context?.value ?: 0L).toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateOperationWithNotifications(eventtypes: HcsOperationOptions, context: COpaquePointer?, callback: HcsEventCallback): HcsOperation =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateOperationWithNotifications(eventtypes, (context?.value ?: 0L).toString(), 0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsCreateProcess(computesystem: HcsSystem, processparameters: Pcwstr, operation: HcsOperation, securitydescriptor: COpaquePointer?, process: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsCreateProcess((computesystem?.value ?: 0L).toString(), (processparameters?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (process?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsDestroyLayer(layerpath: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsDestroyLayer((layerpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsDetachLayerStorageFilter(layerpath: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsDetachLayerStorageFilter((layerpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsEnumerateComputeSystems(query: Pcwstr, operation: HcsOperation): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystems((query?.value ?: 0L).toString(), (operation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsEnumerateComputeSystemsInNamespace(idnamespace: Pcwstr, query: Pcwstr, operation: HcsOperation): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsEnumerateComputeSystemsInNamespace((idnamespace?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), (operation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsExportLayer(layerpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsExportLayer((layerpath?.value ?: 0L).toString(), (exportfolderpath?.value ?: 0L).toString(), (layerdata?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsExportLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, exportfolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsExportLegacyWritableLayer((writablelayermountpath?.value ?: 0L).toString(), (writablelayerfolderpath?.value ?: 0L).toString(), (exportfolderpath?.value ?: 0L).toString(), (layerdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsFormatWritableLayerVhd(vhdhandle: Handle): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsFormatWritableLayerVhd((vhdhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetComputeSystemFromOperation(operation: HcsOperation): HcsSystem =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemFromOperation((operation?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetComputeSystemProperties(computesystem: HcsSystem, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetComputeSystemProperties((computesystem?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (propertyquery?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetLayerVhdMountPath(vhdhandle: Handle, mountpath: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetLayerVhdMountPath((vhdhandle?.value ?: 0L).toString(), (mountpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationContext(operation: HcsOperation): COpaquePointer? =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationContext((operation?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationId(operation: HcsOperation): ULong =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationId((operation?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationResult(operation: HcsOperation, resultdocument: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResult((operation?.value ?: 0L).toString(), (resultdocument?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationResultAndProcessInfo(operation: HcsOperation, processinformation: COpaquePointer?, resultdocument: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationResultAndProcessInfo((operation?.value ?: 0L).toString(), (processinformation?.value ?: 0L).toString(), (resultdocument?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetOperationType(operation: HcsOperation): HcsOperationType =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetOperationType((operation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessFromOperation(operation: HcsOperation): HcsProcess =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessFromOperation((operation?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessInfo(process: HcsProcess, operation: HcsOperation): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessInfo((process?.value ?: 0L).toString(), (operation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessProperties(process: HcsProcess, operation: HcsOperation, propertyquery: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessProperties((process?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (propertyquery?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetProcessorCompatibilityFromSavedState(runtimefilename: Pcwstr, processorfeaturesstring: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetProcessorCompatibilityFromSavedState((runtimefilename?.value ?: 0L).toString(), (processorfeaturesstring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGetServiceProperties(propertyquery: Pcwstr, result: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGetServiceProperties((propertyquery?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGrantVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmAccess((vmid?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsGrantVmGroupAccess(filepath: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsGrantVmGroupAccess((filepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsImportLayer(layerpath: Pcwstr, sourcefolderpath: Pcwstr, layerdata: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsImportLayer((layerpath?.value ?: 0L).toString(), (sourcefolderpath?.value ?: 0L).toString(), (layerdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsInitializeLegacyWritableLayer(writablelayermountpath: Pcwstr, writablelayerfolderpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsInitializeLegacyWritableLayer((writablelayermountpath?.value ?: 0L).toString(), (writablelayerfolderpath?.value ?: 0L).toString(), (layerdata?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsInitializeWritableLayer(writablelayerpath: Pcwstr, layerdata: Pcwstr, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsInitializeWritableLayer((writablelayerpath?.value ?: 0L).toString(), (layerdata?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsModifyComputeSystem(computesystem: HcsSystem, operation: HcsOperation, configuration: Pcwstr, identity: Handle): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsModifyComputeSystem((computesystem?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (configuration?.value ?: 0L).toString(), (identity?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsModifyProcess(process: HcsProcess, operation: HcsOperation, settings: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsModifyProcess((process?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (settings?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsModifyServiceSettings(settings: Pcwstr, result: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsModifyServiceSettings((settings?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsOpenComputeSystem(id: Pcwstr, requestedaccess: UInt, computesystem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystem((id?.value ?: 0L).toString(), requestedaccess.toInt(), (computesystem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsOpenComputeSystemInNamespace(idnamespace: Pcwstr, id: Pcwstr, requestedaccess: UInt, computesystem: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsOpenComputeSystemInNamespace((idnamespace?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), requestedaccess.toInt(), (computesystem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsOpenProcess(computesystem: HcsSystem, processid: UInt, requestedaccess: UInt, process: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsOpenProcess((computesystem?.value ?: 0L).toString(), processid.toInt(), requestedaccess.toInt(), (process?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsPauseComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsPauseComputeSystem((computesystem?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsResumeComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsResumeComputeSystem((computesystem?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsRevokeVmAccess(vmid: Pcwstr, filepath: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmAccess((vmid?.value ?: 0L).toString(), (filepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsRevokeVmGroupAccess(filepath: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsRevokeVmGroupAccess((filepath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSaveComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSaveComputeSystem((computesystem?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetComputeSystemCallback(computesystem: HcsSystem, callbackoptions: HcsEventOptions, context: COpaquePointer?, callback: HcsEventCallback): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetComputeSystemCallback((computesystem?.value ?: 0L).toString(), callbackoptions, (context?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetOperationCallback(operation: HcsOperation, context: COpaquePointer?, callback: HcsOperationCompletion): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationCallback((operation?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetOperationContext(operation: HcsOperation, context: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetOperationContext((operation?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetProcessCallback(process: HcsProcess, callbackoptions: HcsEventOptions, context: COpaquePointer?, callback: HcsEventCallback): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetProcessCallback((process?.value ?: 0L).toString(), callbackoptions, (context?.value ?: 0L).toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetupBaseOSLayer(layerpath: Pcwstr, vhdhandle: Handle, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSLayer((layerpath?.value ?: 0L).toString(), (vhdhandle?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSetupBaseOSVolume(layerpath: Pcwstr, volumepath: Pcwstr, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSetupBaseOSVolume((layerpath?.value ?: 0L).toString(), (volumepath?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsShutDownComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsShutDownComputeSystem((computesystem?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSignalProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSignalProcess((process?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsStartComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsStartComputeSystem((computesystem?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsSubmitWerReport(settings: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsSubmitWerReport((settings?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsTerminateComputeSystem(computesystem: HcsSystem, operation: HcsOperation, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsTerminateComputeSystem((computesystem?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsTerminateProcess(process: HcsProcess, operation: HcsOperation, options: Pcwstr): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsTerminateProcess((process?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (options?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForComputeSystemExit(computesystem: HcsSystem, timeoutms: UInt, result: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsWaitForComputeSystemExit((computesystem?.value ?: 0L).toString(), timeoutms.toInt(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForOperationResult(operation: HcsOperation, timeoutms: UInt, resultdocument: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResult((operation?.value ?: 0L).toString(), timeoutms.toInt(), (resultdocument?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForOperationResultAndProcessInfo(operation: HcsOperation, timeoutms: UInt, processinformation: COpaquePointer?, resultdocument: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsWaitForOperationResultAndProcessInfo((operation?.value ?: 0L).toString(), timeoutms.toInt(), (processinformation?.value ?: 0L).toString(), (resultdocument?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcsWaitForProcessExit(computesystem: HcsProcess, timeoutms: UInt, result: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputesystemNapiAvailable) _wasm_windowssys_windows_win32_system_hostcomputesystem_hcsWaitForProcessExit((computesystem?.value ?: 0L).toString(), timeoutms.toInt(), (result?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
