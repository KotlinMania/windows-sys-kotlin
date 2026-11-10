@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWdkSystemRegistryNapiAddon(): Boolean

private val _windowsWdkSystemRegistryNapiAvailable: Boolean = _initWindowsWdkSystemRegistryNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntCommitRegistryTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntCommitRegistryTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntCreateKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntCreateKey(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntCreateKeyTransacted(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntCreateKeyTransacted(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntCreateRegistryTransaction(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntCreateRegistryTransaction(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntDeleteKey(p0)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntDeleteKey(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntDeleteValueKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntDeleteValueKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntEnumerateKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntEnumerateKey(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntEnumerateValueKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntEnumerateValueKey(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntFlushKey(p0)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntFlushKey(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntNotifyChangeMultipleKeys(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntNotifyChangeMultipleKeys(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Boolean, p9: String, p10: Int, p11: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntOpenKey(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntOpenKey(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntOpenKeyEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntOpenKeyEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntOpenKeyTransacted(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntOpenKeyTransacted(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntOpenKeyTransactedEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntOpenKeyTransactedEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntOpenRegistryTransaction(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntOpenRegistryTransaction(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntQueryKey(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntQueryKey(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntQueryMultipleValueKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntQueryMultipleValueKey(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntQueryValueKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntQueryValueKey(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntRenameKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntRenameKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntRestoreKey(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntRestoreKey(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntRollbackRegistryTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntRollbackRegistryTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntSaveKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntSaveKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntSaveKeyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntSaveKeyEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntSetInformationKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntSetInformationKey(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_ntSetValueKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_ntSetValueKey(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwCommitRegistryTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwCommitRegistryTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwCreateKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwCreateKey(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwCreateKeyTransacted(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwCreateKeyTransacted(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwCreateRegistryTransaction(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwCreateRegistryTransaction(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwDeleteKey(p0)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwDeleteKey(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwDeleteValueKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwDeleteValueKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwEnumerateKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwEnumerateKey(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwEnumerateValueKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwEnumerateValueKey(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwFlushKey(p0)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwFlushKey(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwNotifyChangeMultipleKeys(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwNotifyChangeMultipleKeys(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Boolean, p9: String, p10: Int, p11: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwOpenKey(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwOpenKey(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwOpenKeyEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwOpenKeyEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwOpenKeyTransacted(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwOpenKeyTransacted(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwOpenKeyTransactedEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwOpenKeyTransactedEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwOpenRegistryTransaction(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwOpenRegistryTransaction(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwQueryKey(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwQueryKey(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwQueryMultipleValueKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwQueryMultipleValueKey(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwQueryValueKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwQueryValueKey(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwRenameKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwRenameKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwRestoreKey(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwRestoreKey(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwRollbackRegistryTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwRollbackRegistryTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwSaveKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwSaveKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwSaveKeyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwSaveKeyEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwSetInformationKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwSetInformationKey(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_registry_zwSetValueKey(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_registry_zwSetValueKey(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

public actual fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntCommitRegistryTransaction((transactionhandle?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, disposition: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntCreateKey((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), titleindex.toInt(), (cls?.value ?: 0L).toString(), createoptions.toInt(), (disposition?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, transactionhandle: Handle, disposition: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntCreateKeyTransacted((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), titleindex.toInt(), (cls?.value ?: 0L).toString(), createoptions.toInt(), (transactionhandle?.value ?: 0L).toString(), (disposition?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, createoptions: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntCreateRegistryTransaction((transactionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteKey(keyhandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntDeleteKey((keyhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteValueKey(keyhandle: Handle, valuename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntDeleteValueKey((keyhandle?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntEnumerateKey((keyhandle?.value ?: 0L).toString(), index.toInt(), keyinformationclass, (keyinformation?.value ?: 0L).toString(), length.toInt(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntEnumerateValueKey((keyhandle?.value ?: 0L).toString(), index.toInt(), keyvalueinformationclass, (keyvalueinformation?.value ?: 0L).toString(), length.toInt(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushKey(keyhandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntFlushKey((keyhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: COpaquePointer?, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntNotifyChangeMultipleKeys((masterkeyhandle?.value ?: 0L).toString(), count.toInt(), (subordinateobjects?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), completionfilter.toInt(), watchtree, (buffer?.value ?: 0L).toString(), buffersize.toInt(), asynchronous) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntOpenKey((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKeyEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntOpenKeyEx((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, transactionhandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntOpenKeyTransacted((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (transactionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKeyTransactedEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntOpenKeyTransactedEx((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), openoptions.toInt(), (transactionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntOpenRegistryTransaction((transactionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntQueryKey((keyhandle?.value ?: 0L).toString(), keyinformationclass, (keyinformation?.value ?: 0L).toString(), length.toInt(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: COpaquePointer?, entrycount: UInt, valuebuffer: COpaquePointer?, bufferlength: COpaquePointer?, requiredbufferlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntQueryMultipleValueKey((keyhandle?.value ?: 0L).toString(), (valueentries?.value ?: 0L).toString(), entrycount.toInt(), (valuebuffer?.value ?: 0L).toString(), (bufferlength?.value ?: 0L).toString(), (requiredbufferlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryValueKey(keyhandle: Handle, valuename: COpaquePointer?, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntQueryValueKey((keyhandle?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString(), keyvalueinformationclass, (keyvalueinformation?.value ?: 0L).toString(), length.toInt(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRenameKey(keyhandle: Handle, newname: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntRenameKey((keyhandle?.value ?: 0L).toString(), (newname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntRestoreKey((keyhandle?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntRollbackRegistryTransaction((transactionhandle?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntSaveKey((keyhandle?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntSaveKeyEx((keyhandle?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString(), format.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: COpaquePointer?, keysetinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntSetInformationKey((keyhandle?.value ?: 0L).toString(), keysetinformationclass, (keysetinformation?.value ?: 0L).toString(), keysetinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetValueKey(keyhandle: Handle, valuename: COpaquePointer?, titleindex: UInt, type: UInt, data: COpaquePointer?, datasize: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_ntSetValueKey((keyhandle?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString(), titleindex.toInt(), type.toInt(), (data?.value ?: 0L).toString(), datasize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwCommitRegistryTransaction((transactionhandle?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, disposition: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwCreateKey((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), titleindex.toInt(), (cls?.value ?: 0L).toString(), createoptions.toInt(), (disposition?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, transactionhandle: Handle, disposition: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwCreateKeyTransacted((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), titleindex.toInt(), (cls?.value ?: 0L).toString(), createoptions.toInt(), (transactionhandle?.value ?: 0L).toString(), (disposition?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, createoptions: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwCreateRegistryTransaction((transactionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteKey(keyhandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwDeleteKey((keyhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteValueKey(keyhandle: Handle, valuename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwDeleteValueKey((keyhandle?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwEnumerateKey((keyhandle?.value ?: 0L).toString(), index.toInt(), keyinformationclass, (keyinformation?.value ?: 0L).toString(), length.toInt(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwEnumerateValueKey((keyhandle?.value ?: 0L).toString(), index.toInt(), keyvalueinformationclass, (keyvalueinformation?.value ?: 0L).toString(), length.toInt(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushKey(keyhandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwFlushKey((keyhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: COpaquePointer?, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwNotifyChangeMultipleKeys((masterkeyhandle?.value ?: 0L).toString(), count.toInt(), (subordinateobjects?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), completionfilter.toInt(), watchtree, (buffer?.value ?: 0L).toString(), buffersize.toInt(), asynchronous) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwOpenKey((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKeyEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwOpenKeyEx((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, transactionhandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwOpenKeyTransacted((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (transactionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKeyTransactedEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwOpenKeyTransactedEx((keyhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), openoptions.toInt(), (transactionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwOpenRegistryTransaction((transactionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwQueryKey((keyhandle?.value ?: 0L).toString(), keyinformationclass, (keyinformation?.value ?: 0L).toString(), length.toInt(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: COpaquePointer?, entrycount: UInt, valuebuffer: COpaquePointer?, bufferlength: COpaquePointer?, requiredbufferlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwQueryMultipleValueKey((keyhandle?.value ?: 0L).toString(), (valueentries?.value ?: 0L).toString(), entrycount.toInt(), (valuebuffer?.value ?: 0L).toString(), (bufferlength?.value ?: 0L).toString(), (requiredbufferlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryValueKey(keyhandle: Handle, valuename: COpaquePointer?, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwQueryValueKey((keyhandle?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString(), keyvalueinformationclass, (keyvalueinformation?.value ?: 0L).toString(), length.toInt(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRenameKey(keyhandle: Handle, newname: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwRenameKey((keyhandle?.value ?: 0L).toString(), (newname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwRestoreKey((keyhandle?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwRollbackRegistryTransaction((transactionhandle?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwSaveKey((keyhandle?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwSaveKeyEx((keyhandle?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString(), format.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: COpaquePointer?, keysetinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwSetInformationKey((keyhandle?.value ?: 0L).toString(), keysetinformationclass, (keysetinformation?.value ?: 0L).toString(), keysetinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetValueKey(keyhandle: Handle, valuename: COpaquePointer?, titleindex: UInt, type: UInt, data: COpaquePointer?, datasize: UInt): Ntstatus =
    if (_windowsWdkSystemRegistryNapiAvailable) _wasm_windowssys_windows_wdk_system_registry_zwSetValueKey((keyhandle?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString(), titleindex.toInt(), type.toInt(), (data?.value ?: 0L).toString(), datasize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
