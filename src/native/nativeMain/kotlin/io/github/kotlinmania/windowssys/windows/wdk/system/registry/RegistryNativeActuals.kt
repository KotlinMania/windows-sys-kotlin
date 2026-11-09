@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun NtCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtCommitRegistryTransaction(transactionhandle.toCPointer<ByteVar>(), flags)

public actual fun NtCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtCreateKey(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), titleindex, cls.toCPointer<ByteVar>(), createoptions, disposition.toCPointer<ByteVar>())

public actual fun NtCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtCreateKeyTransacted(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), titleindex, cls.toCPointer<ByteVar>(), createoptions, transactionhandle.toCPointer<ByteVar>(), disposition.toCPointer<ByteVar>())

public actual fun NtCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtCreateRegistryTransaction(transactionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), createoptions)

public actual fun NtDeleteKey(keyhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtDeleteKey(keyhandle.toCPointer<ByteVar>())

public actual fun NtDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtDeleteValueKey(keyhandle.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>())

public actual fun NtEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtEnumerateKey(keyhandle.toCPointer<ByteVar>(), index, keyinformationclass, keyinformation.toCPointer<ByteVar>(), length, resultlength.toCPointer<ByteVar>())

public actual fun NtEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtEnumerateValueKey(keyhandle.toCPointer<ByteVar>(), index, keyvalueinformationclass, keyvalueinformation.toCPointer<ByteVar>(), length, resultlength.toCPointer<ByteVar>())

public actual fun NtFlushKey(keyhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtFlushKey(keyhandle.toCPointer<ByteVar>())

public actual fun NtNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun NtOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtOpenKey(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun NtOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtOpenKeyEx(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), openoptions)

public actual fun NtOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtOpenKeyTransacted(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), transactionhandle.toCPointer<ByteVar>())

public actual fun NtOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtOpenKeyTransactedEx(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), openoptions, transactionhandle.toCPointer<ByteVar>())

public actual fun NtOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtOpenRegistryTransaction(transactionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun NtQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtQueryKey(keyhandle.toCPointer<ByteVar>(), keyinformationclass, keyinformation.toCPointer<ByteVar>(), length, resultlength.toCPointer<ByteVar>())

public actual fun NtQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtQueryMultipleValueKey(keyhandle.toCPointer<ByteVar>(), valueentries.toCPointer<ByteVar>(), entrycount, valuebuffer.toCPointer<ByteVar>(), bufferlength.toCPointer<ByteVar>(), requiredbufferlength.toCPointer<ByteVar>())

public actual fun NtQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtQueryValueKey(keyhandle.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>(), keyvalueinformationclass, keyvalueinformation.toCPointer<ByteVar>(), length, resultlength.toCPointer<ByteVar>())

public actual fun NtRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtRenameKey(keyhandle.toCPointer<ByteVar>(), newname.toCPointer<ByteVar>())

public actual fun NtRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtRestoreKey(keyhandle.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>(), flags)

public actual fun NtRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtRollbackRegistryTransaction(transactionhandle.toCPointer<ByteVar>(), flags)

public actual fun NtSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtSaveKey(keyhandle.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>())

public actual fun NtSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtSaveKeyEx(keyhandle.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>(), format)

public actual fun NtSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtSetInformationKey(keyhandle.toCPointer<ByteVar>(), keysetinformationclass, keysetinformation.toCPointer<ByteVar>(), keysetinformationlength)

public actual fun NtSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_NtSetValueKey(keyhandle.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>(), titleindex, type, data.toCPointer<ByteVar>(), datasize)

public actual fun ZwCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwCommitRegistryTransaction(transactionhandle.toCPointer<ByteVar>(), flags)

public actual fun ZwCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwCreateKey(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), titleindex, cls.toCPointer<ByteVar>(), createoptions, disposition.toCPointer<ByteVar>())

public actual fun ZwCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwCreateKeyTransacted(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), titleindex, cls.toCPointer<ByteVar>(), createoptions, transactionhandle.toCPointer<ByteVar>(), disposition.toCPointer<ByteVar>())

public actual fun ZwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwCreateRegistryTransaction(transactionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), createoptions)

public actual fun ZwDeleteKey(keyhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwDeleteKey(keyhandle.toCPointer<ByteVar>())

public actual fun ZwDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwDeleteValueKey(keyhandle.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>())

public actual fun ZwEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwEnumerateKey(keyhandle.toCPointer<ByteVar>(), index, keyinformationclass, keyinformation.toCPointer<ByteVar>(), length, resultlength.toCPointer<ByteVar>())

public actual fun ZwEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwEnumerateValueKey(keyhandle.toCPointer<ByteVar>(), index, keyvalueinformationclass, keyvalueinformation.toCPointer<ByteVar>(), length, resultlength.toCPointer<ByteVar>())

public actual fun ZwFlushKey(keyhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwFlushKey(keyhandle.toCPointer<ByteVar>())

public actual fun ZwNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun ZwOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwOpenKey(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun ZwOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwOpenKeyEx(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), openoptions)

public actual fun ZwOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwOpenKeyTransacted(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), transactionhandle.toCPointer<ByteVar>())

public actual fun ZwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwOpenKeyTransactedEx(keyhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>(), openoptions, transactionhandle.toCPointer<ByteVar>())

public actual fun ZwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwOpenRegistryTransaction(transactionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun ZwQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwQueryKey(keyhandle.toCPointer<ByteVar>(), keyinformationclass, keyinformation.toCPointer<ByteVar>(), length, resultlength.toCPointer<ByteVar>())

public actual fun ZwQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwQueryMultipleValueKey(keyhandle.toCPointer<ByteVar>(), valueentries.toCPointer<ByteVar>(), entrycount, valuebuffer.toCPointer<ByteVar>(), bufferlength.toCPointer<ByteVar>(), requiredbufferlength.toCPointer<ByteVar>())

public actual fun ZwQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwQueryValueKey(keyhandle.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>(), keyvalueinformationclass, keyvalueinformation.toCPointer<ByteVar>(), length, resultlength.toCPointer<ByteVar>())

public actual fun ZwRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwRenameKey(keyhandle.toCPointer<ByteVar>(), newname.toCPointer<ByteVar>())

public actual fun ZwRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwRestoreKey(keyhandle.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>(), flags)

public actual fun ZwRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwRollbackRegistryTransaction(transactionhandle.toCPointer<ByteVar>(), flags)

public actual fun ZwSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwSaveKey(keyhandle.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>())

public actual fun ZwSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwSaveKeyEx(keyhandle.toCPointer<ByteVar>(), filehandle.toCPointer<ByteVar>(), format)

public actual fun ZwSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwSetInformationKey(keyhandle.toCPointer<ByteVar>(), keysetinformationclass, keysetinformation.toCPointer<ByteVar>(), keysetinformationlength)

public actual fun ZwSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ZwSetValueKey(keyhandle.toCPointer<ByteVar>(), valuename.toCPointer<ByteVar>(), titleindex, type, data.toCPointer<ByteVar>(), datasize)
