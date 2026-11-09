@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE

private val _windowsWdkSystemRegistryNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun NtCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtCommitRegistryTransaction(transactionhandle.toString(), flags.toInt()) as Int) else 0

public actual fun NtCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtCreateKey(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), titleindex.toInt(), cls.toString(), createoptions.toInt(), disposition.toString()) as Int) else 0

public actual fun NtCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtCreateKeyTransacted(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), titleindex.toInt(), cls.toString(), createoptions.toInt(), transactionhandle.toString(), disposition.toString()) as Int) else 0

public actual fun NtCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtCreateRegistryTransaction(transactionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), createoptions.toInt()) as Int) else 0

public actual fun NtDeleteKey(keyhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtDeleteKey(keyhandle.toString()) as Int) else 0

public actual fun NtDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtDeleteValueKey(keyhandle.toString(), valuename.toString()) as Int) else 0

public actual fun NtEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtEnumerateKey(keyhandle.toString(), index.toInt(), keyinformationclass, keyinformation.toString(), length.toInt(), resultlength.toString()) as Int) else 0

public actual fun NtEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtEnumerateValueKey(keyhandle.toString(), index.toInt(), keyvalueinformationclass, keyvalueinformation.toString(), length.toInt(), resultlength.toString()) as Int) else 0

public actual fun NtFlushKey(keyhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtFlushKey(keyhandle.toString()) as Int) else 0

public actual fun NtNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun NtOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtOpenKey(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun NtOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtOpenKeyEx(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), openoptions.toInt()) as Int) else 0

public actual fun NtOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtOpenKeyTransacted(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), transactionhandle.toString()) as Int) else 0

public actual fun NtOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtOpenKeyTransactedEx(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), openoptions.toInt(), transactionhandle.toString()) as Int) else 0

public actual fun NtOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtOpenRegistryTransaction(transactionhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun NtQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtQueryKey(keyhandle.toString(), keyinformationclass, keyinformation.toString(), length.toInt(), resultlength.toString()) as Int) else 0

public actual fun NtQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtQueryMultipleValueKey(keyhandle.toString(), valueentries.toString(), entrycount.toInt(), valuebuffer.toString(), bufferlength.toString(), requiredbufferlength.toString()) as Int) else 0

public actual fun NtQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtQueryValueKey(keyhandle.toString(), valuename.toString(), keyvalueinformationclass, keyvalueinformation.toString(), length.toInt(), resultlength.toString()) as Int) else 0

public actual fun NtRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtRenameKey(keyhandle.toString(), newname.toString()) as Int) else 0

public actual fun NtRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtRestoreKey(keyhandle.toString(), filehandle.toString(), flags.toInt()) as Int) else 0

public actual fun NtRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtRollbackRegistryTransaction(transactionhandle.toString(), flags.toInt()) as Int) else 0

public actual fun NtSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtSaveKey(keyhandle.toString(), filehandle.toString()) as Int) else 0

public actual fun NtSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtSaveKeyEx(keyhandle.toString(), filehandle.toString(), format.toInt()) as Int) else 0

public actual fun NtSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtSetInformationKey(keyhandle.toString(), keysetinformationclass, keysetinformation.toString(), keysetinformationlength.toInt()) as Int) else 0

public actual fun NtSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_NtSetValueKey(keyhandle.toString(), valuename.toString(), titleindex.toInt(), type.toInt(), data.toString(), datasize.toInt()) as Int) else 0

public actual fun ZwCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwCommitRegistryTransaction(transactionhandle.toString(), flags.toInt()) as Int) else 0

public actual fun ZwCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwCreateKey(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), titleindex.toInt(), cls.toString(), createoptions.toInt(), disposition.toString()) as Int) else 0

public actual fun ZwCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwCreateKeyTransacted(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), titleindex.toInt(), cls.toString(), createoptions.toInt(), transactionhandle.toString(), disposition.toString()) as Int) else 0

public actual fun ZwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwCreateRegistryTransaction(transactionhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), createoptions.toInt()) as Int) else 0

public actual fun ZwDeleteKey(keyhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwDeleteKey(keyhandle.toString()) as Int) else 0

public actual fun ZwDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwDeleteValueKey(keyhandle.toString(), valuename.toString()) as Int) else 0

public actual fun ZwEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwEnumerateKey(keyhandle.toString(), index.toInt(), keyinformationclass, keyinformation.toString(), length.toInt(), resultlength.toString()) as Int) else 0

public actual fun ZwEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwEnumerateValueKey(keyhandle.toString(), index.toInt(), keyvalueinformationclass, keyvalueinformation.toString(), length.toInt(), resultlength.toString()) as Int) else 0

public actual fun ZwFlushKey(keyhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwFlushKey(keyhandle.toString()) as Int) else 0

public actual fun ZwNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun ZwOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwOpenKey(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun ZwOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwOpenKeyEx(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), openoptions.toInt()) as Int) else 0

public actual fun ZwOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwOpenKeyTransacted(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), transactionhandle.toString()) as Int) else 0

public actual fun ZwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwOpenKeyTransactedEx(keyhandle.toString(), desiredaccess.toInt(), objectattributes.toString(), openoptions.toInt(), transactionhandle.toString()) as Int) else 0

public actual fun ZwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwOpenRegistryTransaction(transactionhandle.toString(), desiredaccess.toInt(), objectattributes.toString()) as Int) else 0

public actual fun ZwQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwQueryKey(keyhandle.toString(), keyinformationclass, keyinformation.toString(), length.toInt(), resultlength.toString()) as Int) else 0

public actual fun ZwQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwQueryMultipleValueKey(keyhandle.toString(), valueentries.toString(), entrycount.toInt(), valuebuffer.toString(), bufferlength.toString(), requiredbufferlength.toString()) as Int) else 0

public actual fun ZwQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwQueryValueKey(keyhandle.toString(), valuename.toString(), keyvalueinformationclass, keyvalueinformation.toString(), length.toInt(), resultlength.toString()) as Int) else 0

public actual fun ZwRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwRenameKey(keyhandle.toString(), newname.toString()) as Int) else 0

public actual fun ZwRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwRestoreKey(keyhandle.toString(), filehandle.toString(), flags.toInt()) as Int) else 0

public actual fun ZwRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwRollbackRegistryTransaction(transactionhandle.toString(), flags.toInt()) as Int) else 0

public actual fun ZwSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwSaveKey(keyhandle.toString(), filehandle.toString()) as Int) else 0

public actual fun ZwSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwSaveKeyEx(keyhandle.toString(), filehandle.toString(), format.toInt()) as Int) else 0

public actual fun ZwSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwSetInformationKey(keyhandle.toString(), keysetinformationclass, keysetinformation.toString(), keysetinformationlength.toInt()) as Int) else 0

public actual fun ZwSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS =
    if (_windowsWdkSystemRegistryNapiAddon != null) (_windowsWdkSystemRegistryNapiAddon.windowssys_windows_wdk_system_registry_ZwSetValueKey(keyhandle.toString(), valuename.toString(), titleindex.toInt(), type.toInt(), data.toString(), datasize.toInt()) as Int) else 0
