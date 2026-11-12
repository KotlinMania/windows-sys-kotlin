@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

private val windowsWdkSystemRegistryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(transactionhandle.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, disposition: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtCreateKey(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), titleindex.toInt(), cls.rawAddress.toString(), createoptions.toInt(), disposition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), titleindex.toInt(), cls.rawAddress.toString(), createoptions.toInt(), transactionhandle.rawAddress.toString(), disposition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), createoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteKey(keyhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtDeleteKey(keyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDeleteValueKey(keyhandle: Handle, valuename: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtDeleteValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtEnumerateKey(keyhandle.rawAddress.toString(), index.toInt(), keyinformationclass, keyinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtEnumerateValueKey(keyhandle.rawAddress.toString(), index.toInt(), keyvalueinformationclass, keyvalueinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntFlushKey(keyhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtFlushKey(keyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(masterkeyhandle.rawAddress.toString(), count.toInt(), subordinateobjects.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), completionfilter.toInt(), watchtree, buffer.rawAddress.toString(), buffersize.toInt(), asynchronous) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtOpenKey(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKeyEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtOpenKeyEx(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), openoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, transactionhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), transactionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenKeyTransactedEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), openoptions.toInt(), transactionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtQueryKey(keyhandle.rawAddress.toString(), keyinformationclass, keyinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr, entrycount: UInt, valuebuffer: MutPtr, bufferlength: MutPtr, requiredbufferlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(keyhandle.rawAddress.toString(), valueentries.rawAddress.toString(), entrycount.toInt(), valuebuffer.rawAddress.toString(), bufferlength.rawAddress.toString(), requiredbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryValueKey(keyhandle: Handle, valuename: ConstPtr, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtQueryValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString(), keyvalueinformationclass, keyvalueinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRenameKey(keyhandle: Handle, newname: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtRenameKey(keyhandle.rawAddress.toString(), newname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtRestoreKey(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(transactionhandle.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtSaveKey(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtSaveKeyEx(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString(), format.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr, keysetinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtSetInformationKey(keyhandle.rawAddress.toString(), keysetinformationclass, keysetinformation.rawAddress.toString(), keysetinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetValueKey(keyhandle: Handle, valuename: ConstPtr, titleindex: UInt, type: UInt, data: ConstPtr, datasize: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryNtSetValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString(), titleindex.toInt(), type.toInt(), data.rawAddress.toString(), datasize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(transactionhandle.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, disposition: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwCreateKey(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), titleindex.toInt(), cls.rawAddress.toString(), createoptions.toInt(), disposition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), titleindex.toInt(), cls.rawAddress.toString(), createoptions.toInt(), transactionhandle.rawAddress.toString(), disposition.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), createoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteKey(keyhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwDeleteKey(keyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeleteValueKey(keyhandle: Handle, valuename: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwDeleteValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwEnumerateKey(keyhandle.rawAddress.toString(), index.toInt(), keyinformationclass, keyinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwEnumerateValueKey(keyhandle.rawAddress.toString(), index.toInt(), keyvalueinformationclass, keyvalueinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwFlushKey(keyhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwFlushKey(keyhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(masterkeyhandle.rawAddress.toString(), count.toInt(), subordinateobjects.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), completionfilter.toInt(), watchtree, buffer.rawAddress.toString(), buffersize.toInt(), asynchronous) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwOpenKey(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKeyEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwOpenKeyEx(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), openoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, transactionhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), transactionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenKeyTransactedEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(keyhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), openoptions.toInt(), transactionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwQueryKey(keyhandle.rawAddress.toString(), keyinformationclass, keyinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr, entrycount: UInt, valuebuffer: MutPtr, bufferlength: MutPtr, requiredbufferlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(keyhandle.rawAddress.toString(), valueentries.rawAddress.toString(), entrycount.toInt(), valuebuffer.rawAddress.toString(), bufferlength.rawAddress.toString(), requiredbufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryValueKey(keyhandle: Handle, valuename: ConstPtr, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwQueryValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString(), keyvalueinformationclass, keyvalueinformation.rawAddress.toString(), length.toInt(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRenameKey(keyhandle: Handle, newname: ConstPtr): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwRenameKey(keyhandle.rawAddress.toString(), newname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwRestoreKey(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(transactionhandle.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwSaveKey(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwSaveKeyEx(keyhandle.rawAddress.toString(), filehandle.rawAddress.toString(), format.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr, keysetinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwSetInformationKey(keyhandle.rawAddress.toString(), keysetinformationclass, keysetinformation.rawAddress.toString(), keysetinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetValueKey(keyhandle: Handle, valuename: ConstPtr, titleindex: UInt, type: UInt, data: ConstPtr, datasize: UInt): Ntstatus =
    if (windowsWdkSystemRegistryNapiAddon != null) (windowsWdkSystemRegistryNapiAddon.windowssysWindowsWdkSystemRegistryZwSetValueKey(keyhandle.rawAddress.toString(), valuename.rawAddress.toString(), titleindex.toInt(), type.toInt(), data.rawAddress.toString(), datasize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
