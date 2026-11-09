package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE

public expect fun NtCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS

public expect fun NtCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS

public expect fun NtCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS

public expect fun NtCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS

public expect fun NtDeleteKey(keyhandle: HANDLE): NTSTATUS

public expect fun NtDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS

public expect fun NtEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS

public expect fun NtEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS

public expect fun NtFlushKey(keyhandle: HANDLE): NTSTATUS

public expect fun NtNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS

public expect fun NtOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun NtOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS

public expect fun NtOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS

public expect fun NtOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS

public expect fun NtOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun NtQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS

public expect fun NtQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS

public expect fun NtQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS

public expect fun NtRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS

public expect fun NtRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS

public expect fun NtRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS

public expect fun NtSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS

public expect fun NtSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS

public expect fun NtSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS

public expect fun NtSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS

public expect fun ZwCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS

public expect fun ZwCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS

public expect fun ZwCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS

public expect fun ZwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS

public expect fun ZwDeleteKey(keyhandle: HANDLE): NTSTATUS

public expect fun ZwDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS

public expect fun ZwEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS

public expect fun ZwEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS

public expect fun ZwFlushKey(keyhandle: HANDLE): NTSTATUS

public expect fun ZwNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS

public expect fun ZwOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun ZwOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS

public expect fun ZwOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS

public expect fun ZwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS

public expect fun ZwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS

public expect fun ZwQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS

public expect fun ZwQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS

public expect fun ZwQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS

public expect fun ZwRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS

public expect fun ZwRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS

public expect fun ZwRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS

public expect fun ZwSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS

public expect fun ZwSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS

public expect fun ZwSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS

public expect fun ZwSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS
