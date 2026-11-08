package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE

public fun NtCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCommitRegistryTransaction", longArrayOf(transactionhandle, flags.toLong())).toInt()
}

public fun NtCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateKey", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, titleindex.toLong(), cls, createoptions.toLong(), disposition)).toInt()
}

public fun NtCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateKeyTransacted", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, titleindex.toLong(), cls, createoptions.toLong(), transactionhandle, disposition)).toInt()
}

public fun NtCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtCreateRegistryTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, createoptions.toLong())).toInt()
}

public fun NtDeleteKey(keyhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtDeleteKey", longArrayOf(keyhandle)).toInt()
}

public fun NtDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtDeleteValueKey", longArrayOf(keyhandle, valuename)).toInt()
}

public fun NtEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtEnumerateKey", longArrayOf(keyhandle, index.toLong(), keyinformationclass.toLong(), keyinformation, length.toLong(), resultlength)).toInt()
}

public fun NtEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtEnumerateValueKey", longArrayOf(keyhandle, index.toLong(), keyvalueinformationclass.toLong(), keyvalueinformation, length.toLong(), resultlength)).toInt()
}

public fun NtFlushKey(keyhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtFlushKey", longArrayOf(keyhandle)).toInt()
}

public fun NtNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtNotifyChangeMultipleKeys", longArrayOf(masterkeyhandle, count.toLong(), subordinateobjects, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, completionfilter.toLong(), if (watchtree) 1L else 0L, buffer, buffersize.toLong(), if (asynchronous) 1L else 0L)).toInt()
}

public fun NtOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenKey", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun NtOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenKeyEx", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, openoptions.toLong())).toInt()
}

public fun NtOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenKeyTransacted", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, transactionhandle)).toInt()
}

public fun NtOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenKeyTransactedEx", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, openoptions.toLong(), transactionhandle)).toInt()
}

public fun NtOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtOpenRegistryTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun NtQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryKey", longArrayOf(keyhandle, keyinformationclass.toLong(), keyinformation, length.toLong(), resultlength)).toInt()
}

public fun NtQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryMultipleValueKey", longArrayOf(keyhandle, valueentries, entrycount.toLong(), valuebuffer, bufferlength, requiredbufferlength)).toInt()
}

public fun NtQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtQueryValueKey", longArrayOf(keyhandle, valuename, keyvalueinformationclass.toLong(), keyvalueinformation, length.toLong(), resultlength)).toInt()
}

public fun NtRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRenameKey", longArrayOf(keyhandle, newname)).toInt()
}

public fun NtRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRestoreKey", longArrayOf(keyhandle, filehandle, flags.toLong())).toInt()
}

public fun NtRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtRollbackRegistryTransaction", longArrayOf(transactionhandle, flags.toLong())).toInt()
}

public fun NtSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSaveKey", longArrayOf(keyhandle, filehandle)).toInt()
}

public fun NtSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSaveKeyEx", longArrayOf(keyhandle, filehandle, format.toLong())).toInt()
}

public fun NtSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationKey", longArrayOf(keyhandle, keysetinformationclass.toLong(), keysetinformation, keysetinformationlength.toLong())).toInt()
}

public fun NtSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "NtSetValueKey", longArrayOf(keyhandle, valuename, titleindex.toLong(), type.toLong(), data, datasize.toLong())).toInt()
}

public fun ZwCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCommitRegistryTransaction", longArrayOf(transactionhandle, flags.toLong())).toInt()
}

public fun ZwCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateKey", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, titleindex.toLong(), cls, createoptions.toLong(), disposition)).toInt()
}

public fun ZwCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateKeyTransacted", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, titleindex.toLong(), cls, createoptions.toLong(), transactionhandle, disposition)).toInt()
}

public fun ZwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateRegistryTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, createoptions.toLong())).toInt()
}

public fun ZwDeleteKey(keyhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwDeleteKey", longArrayOf(keyhandle)).toInt()
}

public fun ZwDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwDeleteValueKey", longArrayOf(keyhandle, valuename)).toInt()
}

public fun ZwEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwEnumerateKey", longArrayOf(keyhandle, index.toLong(), keyinformationclass.toLong(), keyinformation, length.toLong(), resultlength)).toInt()
}

public fun ZwEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwEnumerateValueKey", longArrayOf(keyhandle, index.toLong(), keyvalueinformationclass.toLong(), keyvalueinformation, length.toLong(), resultlength)).toInt()
}

public fun ZwFlushKey(keyhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwFlushKey", longArrayOf(keyhandle)).toInt()
}

public fun ZwNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwNotifyChangeMultipleKeys", longArrayOf(masterkeyhandle, count.toLong(), subordinateobjects, event, Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, completionfilter.toLong(), if (watchtree) 1L else 0L, buffer, buffersize.toLong(), if (asynchronous) 1L else 0L)).toInt()
}

public fun ZwOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenKey", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun ZwOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenKeyEx", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, openoptions.toLong())).toInt()
}

public fun ZwOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenKeyTransacted", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, transactionhandle)).toInt()
}

public fun ZwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenKeyTransactedEx", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, openoptions.toLong(), transactionhandle)).toInt()
}

public fun ZwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenRegistryTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes)).toInt()
}

public fun ZwQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryKey", longArrayOf(keyhandle, keyinformationclass.toLong(), keyinformation, length.toLong(), resultlength)).toInt()
}

public fun ZwQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryMultipleValueKey", longArrayOf(keyhandle, valueentries, entrycount.toLong(), valuebuffer, bufferlength, requiredbufferlength)).toInt()
}

public fun ZwQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryValueKey", longArrayOf(keyhandle, valuename, keyvalueinformationclass.toLong(), keyvalueinformation, length.toLong(), resultlength)).toInt()
}

public fun ZwRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRenameKey", longArrayOf(keyhandle, newname)).toInt()
}

public fun ZwRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRestoreKey", longArrayOf(keyhandle, filehandle, flags.toLong())).toInt()
}

public fun ZwRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwRollbackRegistryTransaction", longArrayOf(transactionhandle, flags.toLong())).toInt()
}

public fun ZwSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSaveKey", longArrayOf(keyhandle, filehandle)).toInt()
}

public fun ZwSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSaveKeyEx", longArrayOf(keyhandle, filehandle, format.toLong())).toInt()
}

public fun ZwSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationKey", longArrayOf(keyhandle, keysetinformationclass.toLong(), keysetinformation, keysetinformationlength.toLong())).toInt()
}

public fun ZwSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("ntdll.dll", "ZwSetValueKey", longArrayOf(keyhandle, valuename, titleindex.toLong(), type.toLong(), data, datasize.toLong())).toInt()
}
