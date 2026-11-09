@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE

public actual fun NtCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    0

public actual fun NtCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS =
    0

public actual fun NtCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS =
    0

public actual fun NtCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS =
    0

public actual fun NtDeleteKey(keyhandle: HANDLE): NTSTATUS =
    0

public actual fun NtDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS =
    0

public actual fun NtEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    0

public actual fun NtEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    0

public actual fun NtFlushKey(keyhandle: HANDLE): NTSTATUS =
    0

public actual fun NtNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun NtOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun NtOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS =
    0

public actual fun NtOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS =
    0

public actual fun NtOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS =
    0

public actual fun NtOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun NtQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    0

public actual fun NtQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS =
    0

public actual fun NtQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    0

public actual fun NtRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS =
    0

public actual fun NtRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS =
    0

public actual fun NtRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    0

public actual fun NtSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS =
    0

public actual fun NtSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS =
    0

public actual fun NtSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS =
    0

public actual fun NtSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS =
    0

public actual fun ZwCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    0

public actual fun ZwCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS =
    0

public actual fun ZwCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS =
    0

public actual fun ZwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS =
    0

public actual fun ZwDeleteKey(keyhandle: HANDLE): NTSTATUS =
    0

public actual fun ZwDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS =
    0

public actual fun ZwEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    0

public actual fun ZwEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    0

public actual fun ZwFlushKey(keyhandle: HANDLE): NTSTATUS =
    0

public actual fun ZwNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun ZwOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS =
    0

public actual fun ZwOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS =
    0

public actual fun ZwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS =
    0

public actual fun ZwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    0

public actual fun ZwQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    0

public actual fun ZwQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS =
    0

public actual fun ZwQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    0

public actual fun ZwRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS =
    0

public actual fun ZwRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS =
    0

public actual fun ZwRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    0

public actual fun ZwSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS =
    0

public actual fun ZwSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS =
    0

public actual fun ZwSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS =
    0

public actual fun ZwSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS =
    0
