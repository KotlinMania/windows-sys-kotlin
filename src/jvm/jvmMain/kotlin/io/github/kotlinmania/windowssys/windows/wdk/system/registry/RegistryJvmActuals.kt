@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE

private object WindowsWdkSystemRegistryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtCommitRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtCreateKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, disposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtCreateKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, transactionhandle: Long, disposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtCreateRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtDeleteKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtDeleteValueKey(keyhandle: Long, valuename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtEnumerateKey(keyhandle: Long, index: Int, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtEnumerateValueKey(keyhandle: Long, index: Int, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtFlushKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtOpenKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtOpenKeyEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtOpenKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtOpenKeyTransactedEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtOpenRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtQueryKey(keyhandle: Long, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtQueryMultipleValueKey(keyhandle: Long, valueentries: Long, entrycount: Int, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtQueryValueKey(keyhandle: Long, valuename: Long, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtRenameKey(keyhandle: Long, newname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtRestoreKey(keyhandle: Long, filehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtRollbackRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtSaveKey(keyhandle: Long, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtSaveKeyEx(keyhandle: Long, filehandle: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtSetInformationKey(keyhandle: Long, keysetinformationclass: Int, keysetinformation: Long, keysetinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_NtSetValueKey(keyhandle: Long, valuename: Long, titleindex: Int, type: Int, data: Long, datasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwCommitRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwCreateKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, disposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwCreateKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, transactionhandle: Long, disposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwDeleteKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwDeleteValueKey(keyhandle: Long, valuename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwEnumerateKey(keyhandle: Long, index: Int, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwEnumerateValueKey(keyhandle: Long, index: Int, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwFlushKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwOpenKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwOpenKeyEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwOpenKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwQueryKey(keyhandle: Long, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwQueryMultipleValueKey(keyhandle: Long, valueentries: Long, entrycount: Int, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwQueryValueKey(keyhandle: Long, valuename: Long, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwRenameKey(keyhandle: Long, newname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwRestoreKey(keyhandle: Long, filehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwRollbackRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwSaveKey(keyhandle: Long, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwSaveKeyEx(keyhandle: Long, filehandle: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwSetInformationKey(keyhandle: Long, keysetinformationclass: Int, keysetinformation: Long, keysetinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ZwSetValueKey(keyhandle: Long, valuename: Long, titleindex: Int, type: Int, data: Long, datasize: Int): Int
}

public actual fun NtCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtCommitRegistryTransaction(transactionhandle, flags.toInt())

public actual fun NtCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtCreateKey(keyhandle, desiredaccess.toInt(), objectattributes, titleindex.toInt(), cls, createoptions.toInt(), disposition)

public actual fun NtCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtCreateKeyTransacted(keyhandle, desiredaccess.toInt(), objectattributes, titleindex.toInt(), cls, createoptions.toInt(), transactionhandle, disposition)

public actual fun NtCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtCreateRegistryTransaction(transactionhandle, desiredaccess.toInt(), objectattributes, createoptions.toInt())

public actual fun NtDeleteKey(keyhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtDeleteKey(keyhandle)

public actual fun NtDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtDeleteValueKey(keyhandle, valuename)

public actual fun NtEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtEnumerateKey(keyhandle, index.toInt(), keyinformationclass, keyinformation, length.toInt(), resultlength)

public actual fun NtEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtEnumerateValueKey(keyhandle, index.toInt(), keyvalueinformationclass, keyvalueinformation, length.toInt(), resultlength)

public actual fun NtFlushKey(keyhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtFlushKey(keyhandle)

public actual fun NtNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun NtOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtOpenKey(keyhandle, desiredaccess.toInt(), objectattributes)

public actual fun NtOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtOpenKeyEx(keyhandle, desiredaccess.toInt(), objectattributes, openoptions.toInt())

public actual fun NtOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtOpenKeyTransacted(keyhandle, desiredaccess.toInt(), objectattributes, transactionhandle)

public actual fun NtOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtOpenKeyTransactedEx(keyhandle, desiredaccess.toInt(), objectattributes, openoptions.toInt(), transactionhandle)

public actual fun NtOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtOpenRegistryTransaction(transactionhandle, desiredaccess.toInt(), objectattributes)

public actual fun NtQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtQueryKey(keyhandle, keyinformationclass, keyinformation, length.toInt(), resultlength)

public actual fun NtQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtQueryMultipleValueKey(keyhandle, valueentries, entrycount.toInt(), valuebuffer, bufferlength, requiredbufferlength)

public actual fun NtQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtQueryValueKey(keyhandle, valuename, keyvalueinformationclass, keyvalueinformation, length.toInt(), resultlength)

public actual fun NtRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtRenameKey(keyhandle, newname)

public actual fun NtRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtRestoreKey(keyhandle, filehandle, flags.toInt())

public actual fun NtRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtRollbackRegistryTransaction(transactionhandle, flags.toInt())

public actual fun NtSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtSaveKey(keyhandle, filehandle)

public actual fun NtSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtSaveKeyEx(keyhandle, filehandle, format.toInt())

public actual fun NtSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtSetInformationKey(keyhandle, keysetinformationclass, keysetinformation, keysetinformationlength.toInt())

public actual fun NtSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_NtSetValueKey(keyhandle, valuename, titleindex.toInt(), type.toInt(), data, datasize.toInt())

public actual fun ZwCommitRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwCommitRegistryTransaction(transactionhandle, flags.toInt())

public actual fun ZwCreateKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, disposition: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwCreateKey(keyhandle, desiredaccess.toInt(), objectattributes, titleindex.toInt(), cls, createoptions.toInt(), disposition)

public actual fun ZwCreateKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, titleindex: UInt, cls: Long, createoptions: UInt, transactionhandle: HANDLE, disposition: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwCreateKeyTransacted(keyhandle, desiredaccess.toInt(), objectattributes, titleindex.toInt(), cls, createoptions.toInt(), transactionhandle, disposition)

public actual fun ZwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, createoptions: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwCreateRegistryTransaction(transactionhandle, desiredaccess.toInt(), objectattributes, createoptions.toInt())

public actual fun ZwDeleteKey(keyhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwDeleteKey(keyhandle)

public actual fun ZwDeleteValueKey(keyhandle: HANDLE, valuename: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwDeleteValueKey(keyhandle, valuename)

public actual fun ZwEnumerateKey(keyhandle: HANDLE, index: UInt, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwEnumerateKey(keyhandle, index.toInt(), keyinformationclass, keyinformation, length.toInt(), resultlength)

public actual fun ZwEnumerateValueKey(keyhandle: HANDLE, index: UInt, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwEnumerateValueKey(keyhandle, index.toInt(), keyvalueinformationclass, keyvalueinformation, length.toInt(), resultlength)

public actual fun ZwFlushKey(keyhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwFlushKey(keyhandle)

public actual fun ZwNotifyChangeMultipleKeys(masterkeyhandle: HANDLE, count: UInt, subordinateobjects: Long, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, completionfilter: UInt, watchtree: Boolean, buffer: Long, buffersize: UInt, asynchronous: Boolean): NTSTATUS =
    0

public actual fun ZwOpenKey(keyhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwOpenKey(keyhandle, desiredaccess.toInt(), objectattributes)

public actual fun ZwOpenKeyEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwOpenKeyEx(keyhandle, desiredaccess.toInt(), objectattributes, openoptions.toInt())

public actual fun ZwOpenKeyTransacted(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, transactionhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwOpenKeyTransacted(keyhandle, desiredaccess.toInt(), objectattributes, transactionhandle)

public actual fun ZwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: UInt, objectattributes: Long, openoptions: UInt, transactionhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwOpenKeyTransactedEx(keyhandle, desiredaccess.toInt(), objectattributes, openoptions.toInt(), transactionhandle)

public actual fun ZwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwOpenRegistryTransaction(transactionhandle, desiredaccess.toInt(), objectattributes)

public actual fun ZwQueryKey(keyhandle: HANDLE, keyinformationclass: KEY_INFORMATION_CLASS, keyinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwQueryKey(keyhandle, keyinformationclass, keyinformation, length.toInt(), resultlength)

public actual fun ZwQueryMultipleValueKey(keyhandle: HANDLE, valueentries: Long, entrycount: UInt, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwQueryMultipleValueKey(keyhandle, valueentries, entrycount.toInt(), valuebuffer, bufferlength, requiredbufferlength)

public actual fun ZwQueryValueKey(keyhandle: HANDLE, valuename: Long, keyvalueinformationclass: KEY_VALUE_INFORMATION_CLASS, keyvalueinformation: Long, length: UInt, resultlength: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwQueryValueKey(keyhandle, valuename, keyvalueinformationclass, keyvalueinformation, length.toInt(), resultlength)

public actual fun ZwRenameKey(keyhandle: HANDLE, newname: Long): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwRenameKey(keyhandle, newname)

public actual fun ZwRestoreKey(keyhandle: HANDLE, filehandle: HANDLE, flags: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwRestoreKey(keyhandle, filehandle, flags.toInt())

public actual fun ZwRollbackRegistryTransaction(transactionhandle: HANDLE, flags: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwRollbackRegistryTransaction(transactionhandle, flags.toInt())

public actual fun ZwSaveKey(keyhandle: HANDLE, filehandle: HANDLE): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwSaveKey(keyhandle, filehandle)

public actual fun ZwSaveKeyEx(keyhandle: HANDLE, filehandle: HANDLE, format: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwSaveKeyEx(keyhandle, filehandle, format.toInt())

public actual fun ZwSetInformationKey(keyhandle: HANDLE, keysetinformationclass: KEY_SET_INFORMATION_CLASS, keysetinformation: Long, keysetinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwSetInformationKey(keyhandle, keysetinformationclass, keysetinformation, keysetinformationlength.toInt())

public actual fun ZwSetValueKey(keyhandle: HANDLE, valuename: Long, titleindex: UInt, type: UInt, data: Long, datasize: UInt): NTSTATUS =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ZwSetValueKey(keyhandle, valuename, titleindex.toInt(), type.toInt(), data, datasize.toInt())
