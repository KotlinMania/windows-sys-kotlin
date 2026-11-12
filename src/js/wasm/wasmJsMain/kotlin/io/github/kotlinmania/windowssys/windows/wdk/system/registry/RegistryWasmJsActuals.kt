@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkSystemRegistryNapiAddon(): Boolean

private val windowsWdkSystemRegistryNapiAvailable: Boolean = initWindowsWdkSystemRegistryNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtCreateKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtCreateKey(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtDeleteKey(p0)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtDeleteKey(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtDeleteValueKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtDeleteValueKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtEnumerateKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtEnumerateKey(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtEnumerateValueKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtEnumerateValueKey(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtFlushKey(p0)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtFlushKey(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Boolean, p9: String, p10: Int, p11: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtOpenKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtOpenKey(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtOpenKeyEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtOpenKeyEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtQueryKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtQueryKey(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtQueryValueKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtQueryValueKey(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtRenameKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtRenameKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtRestoreKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtRestoreKey(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtSaveKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtSaveKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtSaveKeyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtSaveKeyEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtSetInformationKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtSetInformationKey(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryNtSetValueKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryNtSetValueKey(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwCreateKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwCreateKey(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwDeleteKey(p0)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwDeleteKey(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwDeleteValueKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwDeleteValueKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwEnumerateKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwEnumerateKey(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwEnumerateValueKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwEnumerateValueKey(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwFlushKey(p0)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwFlushKey(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Boolean, p9: String, p10: Int, p11: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwOpenKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwOpenKey(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwOpenKeyEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwOpenKeyEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwQueryKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwQueryKey(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwQueryValueKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwQueryValueKey(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwRenameKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwRenameKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwRestoreKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwRestoreKey(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwSaveKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwSaveKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwSaveKeyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwSaveKeyEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwSetInformationKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwSetInformationKey(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemRegistryZwSetValueKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemRegistryZwSetValueKey(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

public actual fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(transactionhandle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, disposition: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtCreateKey(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), titleindex.toInt(), cls.rawAddress.toString(), createoptions.toInt(), disposition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), titleindex.toInt(), cls.rawAddress.toString(), createoptions.toInt(), transactionhandle.rawAddress.toString(), disposition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteKey(keyhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtDeleteKey(keyhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteValueKey(keyhandle: Handle, valuename: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtDeleteValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtEnumerateKey(keyhandle.rawAddress.toString(), index.toInt(), keyinformationclass, keyinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtEnumerateValueKey(keyhandle.rawAddress.toString(), index.toInt(), keyvalueinformationclass, keyvalueinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushKey(keyhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtFlushKey(keyhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(masterkeyhandle.rawAddress.toString(), count.toInt(), subordinateobjects.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), completionfilter.toInt(), watchtree, buffer.rawAddress.toString(), buffersize.toInt(), asynchronous) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtOpenKey(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKeyEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtOpenKeyEx(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, transactionhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), transactionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKeyTransactedEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), openoptions.toInt(), transactionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtQueryKey(keyhandle.rawAddress.toString(), keyinformationclass, keyinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr, entrycount: UInt, valuebuffer: MutPtr, bufferlength: MutPtr, requiredbufferlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(keyhandle.rawAddress.toString(), valueentries.rawAddress.toString(), entrycount.toInt(), valuebuffer.rawAddress.toString(), bufferlength.rawAddress.toString(), requiredbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryValueKey(keyhandle: Handle, valuename: ConstPtr, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtQueryValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString(), keyvalueinformationclass, keyvalueinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRenameKey(keyhandle: Handle, newname: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtRenameKey(keyhandle.rawAddress.toString(), newname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtRestoreKey(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(transactionhandle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtSaveKey(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtSaveKeyEx(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString(), format.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr, keysetinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtSetInformationKey(keyhandle.rawAddress.toString(), keysetinformationclass, keysetinformation.rawAddress.toString(), keysetinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetValueKey(keyhandle: Handle, valuename: ConstPtr, titleindex: UInt, type: UInt, data: ConstPtr, datasize: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryNtSetValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString(), titleindex.toInt(), type.toInt(), data.rawAddress.toString(), datasize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(transactionhandle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, disposition: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwCreateKey(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), titleindex.toInt(), cls.rawAddress.toString(), createoptions.toInt(), disposition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), titleindex.toInt(), cls.rawAddress.toString(), createoptions.toInt(), transactionhandle.rawAddress.toString(), disposition.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteKey(keyhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwDeleteKey(keyhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteValueKey(keyhandle: Handle, valuename: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwDeleteValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwEnumerateKey(keyhandle.rawAddress.toString(), index.toInt(), keyinformationclass, keyinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwEnumerateValueKey(keyhandle.rawAddress.toString(), index.toInt(), keyvalueinformationclass, keyvalueinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushKey(keyhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwFlushKey(keyhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(masterkeyhandle.rawAddress.toString(), count.toInt(), subordinateobjects.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), completionfilter.toInt(), watchtree, buffer.rawAddress.toString(), buffersize.toInt(), asynchronous) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwOpenKey(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKeyEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwOpenKeyEx(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, transactionhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), transactionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKeyTransactedEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), openoptions.toInt(), transactionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwQueryKey(keyhandle.rawAddress.toString(), keyinformationclass, keyinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr, entrycount: UInt, valuebuffer: MutPtr, bufferlength: MutPtr, requiredbufferlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(keyhandle.rawAddress.toString(), valueentries.rawAddress.toString(), entrycount.toInt(), valuebuffer.rawAddress.toString(), bufferlength.rawAddress.toString(), requiredbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryValueKey(keyhandle: Handle, valuename: ConstPtr, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwQueryValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString(), keyvalueinformationclass, keyvalueinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRenameKey(keyhandle: Handle, newname: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwRenameKey(keyhandle.rawAddress.toString(), newname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwRestoreKey(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(transactionhandle.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwSaveKey(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwSaveKeyEx(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString(), format.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr, keysetinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwSetInformationKey(keyhandle.rawAddress.toString(), keysetinformationclass, keysetinformation.rawAddress.toString(), keysetinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetValueKey(keyhandle: Handle, valuename: ConstPtr, titleindex: UInt, type: UInt, data: ConstPtr, datasize: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAvailable) wasmWindowssysWindowsWdkSystemRegistryZwSetValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString(), titleindex.toInt(), type.toInt(), data.rawAddress.toString(), datasize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
