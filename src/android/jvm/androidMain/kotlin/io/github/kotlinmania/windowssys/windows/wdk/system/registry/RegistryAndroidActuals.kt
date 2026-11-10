@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

private object WindowsWdkSystemRegistryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntCommitRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntCreateKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, disposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntCreateKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, transactionhandle: Long, disposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntCreateRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntDeleteKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntDeleteValueKey(keyhandle: Long, valuename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntEnumerateKey(keyhandle: Long, index: Int, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntEnumerateValueKey(keyhandle: Long, index: Int, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntFlushKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntNotifyChangeMultipleKeys(masterkeyhandle: Long, count: Int, subordinateobjects: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, completionfilter: Int, watchtree: Boolean, buffer: Long, buffersize: Int, asynchronous: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntOpenKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntOpenKeyEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntOpenKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntOpenKeyTransactedEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntOpenRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntQueryKey(keyhandle: Long, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntQueryMultipleValueKey(keyhandle: Long, valueentries: Long, entrycount: Int, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntQueryValueKey(keyhandle: Long, valuename: Long, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntRenameKey(keyhandle: Long, newname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntRestoreKey(keyhandle: Long, filehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntRollbackRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntSaveKey(keyhandle: Long, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntSaveKeyEx(keyhandle: Long, filehandle: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntSetInformationKey(keyhandle: Long, keysetinformationclass: Int, keysetinformation: Long, keysetinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_ntSetValueKey(keyhandle: Long, valuename: Long, titleindex: Int, type: Int, data: Long, datasize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwCommitRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwCreateKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, disposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwCreateKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, titleindex: Int, cls: Long, createoptions: Int, transactionhandle: Long, disposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwCreateRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwDeleteKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwDeleteValueKey(keyhandle: Long, valuename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwEnumerateKey(keyhandle: Long, index: Int, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwEnumerateValueKey(keyhandle: Long, index: Int, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwFlushKey(keyhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwNotifyChangeMultipleKeys(masterkeyhandle: Long, count: Int, subordinateobjects: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, completionfilter: Int, watchtree: Boolean, buffer: Long, buffersize: Int, asynchronous: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwOpenKey(keyhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwOpenKeyEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwOpenKeyTransacted(keyhandle: Long, desiredaccess: Int, objectattributes: Long, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwOpenKeyTransactedEx(keyhandle: Long, desiredaccess: Int, objectattributes: Long, openoptions: Int, transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwOpenRegistryTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwQueryKey(keyhandle: Long, keyinformationclass: Int, keyinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwQueryMultipleValueKey(keyhandle: Long, valueentries: Long, entrycount: Int, valuebuffer: Long, bufferlength: Long, requiredbufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwQueryValueKey(keyhandle: Long, valuename: Long, keyvalueinformationclass: Int, keyvalueinformation: Long, length: Int, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwRenameKey(keyhandle: Long, newname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwRestoreKey(keyhandle: Long, filehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwRollbackRegistryTransaction(transactionhandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwSaveKey(keyhandle: Long, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwSaveKeyEx(keyhandle: Long, filehandle: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwSetInformationKey(keyhandle: Long, keysetinformationclass: Int, keysetinformation: Long, keysetinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_registry_zwSetValueKey(keyhandle: Long, valuename: Long, titleindex: Int, type: Int, data: Long, datasize: Int): Int
}

public actual fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntCommitRegistryTransaction((transactionhandle?.value ?: 0L), flags.toInt())

public actual fun ntCreateKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, disposition: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntCreateKey((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), titleindex.toInt(), (cls?.value ?: 0L), createoptions.toInt(), (disposition?.value ?: 0L))

public actual fun ntCreateKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, transactionhandle: Handle, disposition: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntCreateKeyTransacted((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), titleindex.toInt(), (cls?.value ?: 0L), createoptions.toInt(), (transactionhandle?.value ?: 0L), (disposition?.value ?: 0L))

public actual fun ntCreateRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, createoptions: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntCreateRegistryTransaction((transactionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), createoptions.toInt())

public actual fun ntDeleteKey(keyhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntDeleteKey((keyhandle?.value ?: 0L))

public actual fun ntDeleteValueKey(keyhandle: Handle, valuename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntDeleteValueKey((keyhandle?.value ?: 0L), (valuename?.value ?: 0L))

public actual fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntEnumerateKey((keyhandle?.value ?: 0L), index.toInt(), keyinformationclass, (keyinformation?.value ?: 0L), length.toInt(), (resultlength?.value ?: 0L))

public actual fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntEnumerateValueKey((keyhandle?.value ?: 0L), index.toInt(), keyvalueinformationclass, (keyvalueinformation?.value ?: 0L), length.toInt(), (resultlength?.value ?: 0L))

public actual fun ntFlushKey(keyhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntFlushKey((keyhandle?.value ?: 0L))

public actual fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: COpaquePointer?, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntNotifyChangeMultipleKeys((masterkeyhandle?.value ?: 0L), count.toInt(), (subordinateobjects?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), completionfilter.toInt(), watchtree, (buffer?.value ?: 0L), buffersize.toInt(), asynchronous)

public actual fun ntOpenKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntOpenKey((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun ntOpenKeyEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntOpenKeyEx((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), openoptions.toInt())

public actual fun ntOpenKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, transactionhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntOpenKeyTransacted((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (transactionhandle?.value ?: 0L))

public actual fun ntOpenKeyTransactedEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntOpenKeyTransactedEx((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), openoptions.toInt(), (transactionhandle?.value ?: 0L))

public actual fun ntOpenRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntOpenRegistryTransaction((transactionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntQueryKey((keyhandle?.value ?: 0L), keyinformationclass, (keyinformation?.value ?: 0L), length.toInt(), (resultlength?.value ?: 0L))

public actual fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: COpaquePointer?, entrycount: UInt, valuebuffer: COpaquePointer?, bufferlength: COpaquePointer?, requiredbufferlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntQueryMultipleValueKey((keyhandle?.value ?: 0L), (valueentries?.value ?: 0L), entrycount.toInt(), (valuebuffer?.value ?: 0L), (bufferlength?.value ?: 0L), (requiredbufferlength?.value ?: 0L))

public actual fun ntQueryValueKey(keyhandle: Handle, valuename: COpaquePointer?, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntQueryValueKey((keyhandle?.value ?: 0L), (valuename?.value ?: 0L), keyvalueinformationclass, (keyvalueinformation?.value ?: 0L), length.toInt(), (resultlength?.value ?: 0L))

public actual fun ntRenameKey(keyhandle: Handle, newname: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntRenameKey((keyhandle?.value ?: 0L), (newname?.value ?: 0L))

public actual fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntRestoreKey((keyhandle?.value ?: 0L), (filehandle?.value ?: 0L), flags.toInt())

public actual fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntRollbackRegistryTransaction((transactionhandle?.value ?: 0L), flags.toInt())

public actual fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntSaveKey((keyhandle?.value ?: 0L), (filehandle?.value ?: 0L))

public actual fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntSaveKeyEx((keyhandle?.value ?: 0L), (filehandle?.value ?: 0L), format.toInt())

public actual fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: COpaquePointer?, keysetinformationlength: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntSetInformationKey((keyhandle?.value ?: 0L), keysetinformationclass, (keysetinformation?.value ?: 0L), keysetinformationlength.toInt())

public actual fun ntSetValueKey(keyhandle: Handle, valuename: COpaquePointer?, titleindex: UInt, type: UInt, data: COpaquePointer?, datasize: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_ntSetValueKey((keyhandle?.value ?: 0L), (valuename?.value ?: 0L), titleindex.toInt(), type.toInt(), (data?.value ?: 0L), datasize.toInt())

public actual fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwCommitRegistryTransaction((transactionhandle?.value ?: 0L), flags.toInt())

public actual fun zwCreateKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, disposition: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwCreateKey((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), titleindex.toInt(), (cls?.value ?: 0L), createoptions.toInt(), (disposition?.value ?: 0L))

public actual fun zwCreateKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, transactionhandle: Handle, disposition: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwCreateKeyTransacted((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), titleindex.toInt(), (cls?.value ?: 0L), createoptions.toInt(), (transactionhandle?.value ?: 0L), (disposition?.value ?: 0L))

public actual fun zwCreateRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, createoptions: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwCreateRegistryTransaction((transactionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), createoptions.toInt())

public actual fun zwDeleteKey(keyhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwDeleteKey((keyhandle?.value ?: 0L))

public actual fun zwDeleteValueKey(keyhandle: Handle, valuename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwDeleteValueKey((keyhandle?.value ?: 0L), (valuename?.value ?: 0L))

public actual fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwEnumerateKey((keyhandle?.value ?: 0L), index.toInt(), keyinformationclass, (keyinformation?.value ?: 0L), length.toInt(), (resultlength?.value ?: 0L))

public actual fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwEnumerateValueKey((keyhandle?.value ?: 0L), index.toInt(), keyvalueinformationclass, (keyvalueinformation?.value ?: 0L), length.toInt(), (resultlength?.value ?: 0L))

public actual fun zwFlushKey(keyhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwFlushKey((keyhandle?.value ?: 0L))

public actual fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: COpaquePointer?, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwNotifyChangeMultipleKeys((masterkeyhandle?.value ?: 0L), count.toInt(), (subordinateobjects?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), completionfilter.toInt(), watchtree, (buffer?.value ?: 0L), buffersize.toInt(), asynchronous)

public actual fun zwOpenKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwOpenKey((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun zwOpenKeyEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwOpenKeyEx((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), openoptions.toInt())

public actual fun zwOpenKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, transactionhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwOpenKeyTransacted((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (transactionhandle?.value ?: 0L))

public actual fun zwOpenKeyTransactedEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwOpenKeyTransactedEx((keyhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), openoptions.toInt(), (transactionhandle?.value ?: 0L))

public actual fun zwOpenRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwOpenRegistryTransaction((transactionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwQueryKey((keyhandle?.value ?: 0L), keyinformationclass, (keyinformation?.value ?: 0L), length.toInt(), (resultlength?.value ?: 0L))

public actual fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: COpaquePointer?, entrycount: UInt, valuebuffer: COpaquePointer?, bufferlength: COpaquePointer?, requiredbufferlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwQueryMultipleValueKey((keyhandle?.value ?: 0L), (valueentries?.value ?: 0L), entrycount.toInt(), (valuebuffer?.value ?: 0L), (bufferlength?.value ?: 0L), (requiredbufferlength?.value ?: 0L))

public actual fun zwQueryValueKey(keyhandle: Handle, valuename: COpaquePointer?, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwQueryValueKey((keyhandle?.value ?: 0L), (valuename?.value ?: 0L), keyvalueinformationclass, (keyvalueinformation?.value ?: 0L), length.toInt(), (resultlength?.value ?: 0L))

public actual fun zwRenameKey(keyhandle: Handle, newname: COpaquePointer?): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwRenameKey((keyhandle?.value ?: 0L), (newname?.value ?: 0L))

public actual fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwRestoreKey((keyhandle?.value ?: 0L), (filehandle?.value ?: 0L), flags.toInt())

public actual fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwRollbackRegistryTransaction((transactionhandle?.value ?: 0L), flags.toInt())

public actual fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwSaveKey((keyhandle?.value ?: 0L), (filehandle?.value ?: 0L))

public actual fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwSaveKeyEx((keyhandle?.value ?: 0L), (filehandle?.value ?: 0L), format.toInt())

public actual fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: COpaquePointer?, keysetinformationlength: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwSetInformationKey((keyhandle?.value ?: 0L), keysetinformationclass, (keysetinformation?.value ?: 0L), keysetinformationlength.toInt())

public actual fun zwSetValueKey(keyhandle: Handle, valuename: COpaquePointer?, titleindex: UInt, type: UInt, data: COpaquePointer?, datasize: UInt): Ntstatus =
    WindowsWdkSystemRegistryJniBridge.windowssys_windows_wdk_system_registry_zwSetValueKey((keyhandle?.value ?: 0L), (valuename?.value ?: 0L), titleindex.toInt(), type.toInt(), (data?.value ?: 0L), datasize.toInt())
