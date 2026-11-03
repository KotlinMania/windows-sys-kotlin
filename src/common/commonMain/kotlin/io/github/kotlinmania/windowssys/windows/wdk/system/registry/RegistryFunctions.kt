package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.Win32DynamicFfi

public fun NtCommitRegistryTransaction(transactionhandle: Win32.Foundation.HANDLE, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCommitRegistryTransaction", longArrayOf(Win32DynamicFfi.objectSlot(transactionhandle), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCreateKey", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, titleindex.toLong(), cls, createoptions.toLong(), disposition))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: Win32.Foundation.HANDLE, disposition: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCreateKeyTransacted", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, titleindex.toLong(), cls, createoptions.toLong(), Win32DynamicFfi.objectSlot(transactionhandle), disposition))
    return Win32.Foundation.NTSTATUS()
}

public fun NtCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtCreateRegistryTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, createoptions.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtDeleteKey(keyhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtDeleteKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtDeleteValueKey(keyhandle: Win32.Foundation.HANDLE, valuename: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtDeleteValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), valuename))
    return Win32.Foundation.NTSTATUS()
}

public fun NtEnumerateKey(keyhandle: Win32.Foundation.HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtEnumerateKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), index.toLong(), keyinformationclass.toLong(), keyinformation, length.toLong(), resultlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtEnumerateValueKey(keyhandle: Win32.Foundation.HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtEnumerateValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), index.toLong(), keyvalueinformationclass.toLong(), keyvalueinformation, length.toLong(), resultlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtFlushKey(keyhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtFlushKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtNotifyChangeMultipleKeys(masterkeyhandle: Win32.Foundation.HANDLE, count: UInt, subordinateobjects: Long, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtNotifyChangeMultipleKeys", longArrayOf(Win32DynamicFfi.objectSlot(masterkeyhandle), count.toLong(), subordinateobjects, Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, completionfilter.toLong(), if (watchtree) 1L else 0L, buffer, buffersize.toLong(), if (asynchronous) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenKey", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenKeyEx", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, openoptions.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenKeyTransacted", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, Win32DynamicFfi.objectSlot(transactionhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenKeyTransactedEx", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, openoptions.toLong(), Win32DynamicFfi.objectSlot(transactionhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtOpenRegistryTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryKey(keyhandle: Win32.Foundation.HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), keyinformationclass.toLong(), keyinformation, length.toLong(), resultlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryMultipleValueKey(keyhandle: Win32.Foundation.HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryMultipleValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), valueentries, entrycount.toLong(), valuebuffer, bufferlength, requiredbufferlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtQueryValueKey(keyhandle: Win32.Foundation.HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtQueryValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), valuename, keyvalueinformationclass.toLong(), keyvalueinformation, length.toLong(), resultlength))
    return Win32.Foundation.NTSTATUS()
}

public fun NtRenameKey(keyhandle: Win32.Foundation.HANDLE, newname: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtRenameKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), newname))
    return Win32.Foundation.NTSTATUS()
}

public fun NtRestoreKey(keyhandle: Win32.Foundation.HANDLE, filehandle: Win32.Foundation.HANDLE, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtRestoreKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), Win32DynamicFfi.objectSlot(filehandle), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtRollbackRegistryTransaction(transactionhandle: Win32.Foundation.HANDLE, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtRollbackRegistryTransaction", longArrayOf(Win32DynamicFfi.objectSlot(transactionhandle), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSaveKey(keyhandle: Win32.Foundation.HANDLE, filehandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSaveKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), Win32DynamicFfi.objectSlot(filehandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSaveKeyEx(keyhandle: Win32.Foundation.HANDLE, filehandle: Win32.Foundation.HANDLE, format: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSaveKeyEx", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), Win32DynamicFfi.objectSlot(filehandle), format.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetInformationKey(keyhandle: Win32.Foundation.HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetInformationKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), keysetinformationclass.toLong(), keysetinformation, keysetinformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun NtSetValueKey(keyhandle: Win32.Foundation.HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "NtSetValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), valuename, titleindex.toLong(), type.toLong(), data, datasize.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCommitRegistryTransaction(transactionhandle: Win32.Foundation.HANDLE, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCommitRegistryTransaction", longArrayOf(Win32DynamicFfi.objectSlot(transactionhandle), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateKey", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, titleindex.toLong(), cls, createoptions.toLong(), disposition))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: Win32.Foundation.HANDLE, disposition: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateKeyTransacted", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, titleindex.toLong(), cls, createoptions.toLong(), Win32DynamicFfi.objectSlot(transactionhandle), disposition))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwCreateRegistryTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes, createoptions.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwDeleteKey(keyhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwDeleteKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwDeleteValueKey(keyhandle: Win32.Foundation.HANDLE, valuename: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwDeleteValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), valuename))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwEnumerateKey(keyhandle: Win32.Foundation.HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwEnumerateKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), index.toLong(), keyinformationclass.toLong(), keyinformation, length.toLong(), resultlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwEnumerateValueKey(keyhandle: Win32.Foundation.HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwEnumerateValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), index.toLong(), keyvalueinformationclass.toLong(), keyvalueinformation, length.toLong(), resultlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwFlushKey(keyhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwFlushKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwNotifyChangeMultipleKeys(masterkeyhandle: Win32.Foundation.HANDLE, count: UInt, subordinateobjects: Long, event: Win32.Foundation.HANDLE, apcroutine: Win32.System.IO.PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwNotifyChangeMultipleKeys", longArrayOf(Win32DynamicFfi.objectSlot(masterkeyhandle), count.toLong(), subordinateobjects, Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, iostatusblock, completionfilter.toLong(), if (watchtree) 1L else 0L, buffer, buffersize.toLong(), if (asynchronous) 1L else 0L))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenKey", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenKeyEx", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, openoptions.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenKeyTransacted", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, Win32DynamicFfi.objectSlot(transactionhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenKeyTransactedEx", longArrayOf(keyhandle, desiredaccess.toLong(), objectattributes, openoptions.toLong(), Win32DynamicFfi.objectSlot(transactionhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwOpenRegistryTransaction", longArrayOf(transactionhandle, desiredaccess.toLong(), objectattributes))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryKey(keyhandle: Win32.Foundation.HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), keyinformationclass.toLong(), keyinformation, length.toLong(), resultlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryMultipleValueKey(keyhandle: Win32.Foundation.HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryMultipleValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), valueentries, entrycount.toLong(), valuebuffer, bufferlength, requiredbufferlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwQueryValueKey(keyhandle: Win32.Foundation.HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwQueryValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), valuename, keyvalueinformationclass.toLong(), keyvalueinformation, length.toLong(), resultlength))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRenameKey(keyhandle: Win32.Foundation.HANDLE, newname: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRenameKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), newname))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRestoreKey(keyhandle: Win32.Foundation.HANDLE, filehandle: Win32.Foundation.HANDLE, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRestoreKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), Win32DynamicFfi.objectSlot(filehandle), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwRollbackRegistryTransaction(transactionhandle: Win32.Foundation.HANDLE, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwRollbackRegistryTransaction", longArrayOf(Win32DynamicFfi.objectSlot(transactionhandle), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSaveKey(keyhandle: Win32.Foundation.HANDLE, filehandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSaveKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), Win32DynamicFfi.objectSlot(filehandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSaveKeyEx(keyhandle: Win32.Foundation.HANDLE, filehandle: Win32.Foundation.HANDLE, format: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSaveKeyEx", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), Win32DynamicFfi.objectSlot(filehandle), format.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetInformationKey(keyhandle: Win32.Foundation.HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetInformationKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), keysetinformationclass.toLong(), keysetinformation, keysetinformationlength.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun ZwSetValueKey(keyhandle: Win32.Foundation.HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("ntdll.dll", "ZwSetValueKey", longArrayOf(Win32DynamicFfi.objectSlot(keyhandle), valuename, titleindex.toLong(), type.toLong(), data, datasize.toLong()))
    return Win32.Foundation.NTSTATUS()
}
