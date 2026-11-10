@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntCommitRegistryTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun ntCreateKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, disposition: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntCreateKey(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), titleindex, cls?.value?.toCPointer<ByteVar>(), createoptions, disposition?.value?.toCPointer<ByteVar>())

public actual fun ntCreateKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, transactionhandle: Handle, disposition: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntCreateKeyTransacted(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), titleindex, cls?.value?.toCPointer<ByteVar>(), createoptions, transactionhandle?.value?.toCPointer<ByteVar>(), disposition?.value?.toCPointer<ByteVar>())

public actual fun ntCreateRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, createoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntCreateRegistryTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), createoptions)

public actual fun ntDeleteKey(keyhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntDeleteKey(keyhandle?.value?.toCPointer<ByteVar>())

public actual fun ntDeleteValueKey(keyhandle: Handle, valuename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntDeleteValueKey(keyhandle?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>())

public actual fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntEnumerateKey(keyhandle?.value?.toCPointer<ByteVar>(), index, keyinformationclass, keyinformation?.value?.toCPointer<ByteVar>(), length, resultlength?.value?.toCPointer<ByteVar>())

public actual fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntEnumerateValueKey(keyhandle?.value?.toCPointer<ByteVar>(), index, keyvalueinformationclass, keyvalueinformation?.value?.toCPointer<ByteVar>(), length, resultlength?.value?.toCPointer<ByteVar>())

public actual fun ntFlushKey(keyhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntFlushKey(keyhandle?.value?.toCPointer<ByteVar>())

public actual fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: COpaquePointer?, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntNotifyChangeMultipleKeys(masterkeyhandle?.value?.toCPointer<ByteVar>(), count, subordinateobjects?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), completionfilter, watchtree, buffer?.value?.toCPointer<ByteVar>(), buffersize, asynchronous)

public actual fun ntOpenKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntOpenKey(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun ntOpenKeyEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntOpenKeyEx(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), openoptions)

public actual fun ntOpenKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, transactionhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntOpenKeyTransacted(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), transactionhandle?.value?.toCPointer<ByteVar>())

public actual fun ntOpenKeyTransactedEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntOpenKeyTransactedEx(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), openoptions, transactionhandle?.value?.toCPointer<ByteVar>())

public actual fun ntOpenRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntOpenRegistryTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntQueryKey(keyhandle?.value?.toCPointer<ByteVar>(), keyinformationclass, keyinformation?.value?.toCPointer<ByteVar>(), length, resultlength?.value?.toCPointer<ByteVar>())

public actual fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: COpaquePointer?, entrycount: UInt, valuebuffer: COpaquePointer?, bufferlength: COpaquePointer?, requiredbufferlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntQueryMultipleValueKey(keyhandle?.value?.toCPointer<ByteVar>(), valueentries?.value?.toCPointer<ByteVar>(), entrycount, valuebuffer?.value?.toCPointer<ByteVar>(), bufferlength?.value?.toCPointer<ByteVar>(), requiredbufferlength?.value?.toCPointer<ByteVar>())

public actual fun ntQueryValueKey(keyhandle: Handle, valuename: COpaquePointer?, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntQueryValueKey(keyhandle?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>(), keyvalueinformationclass, keyvalueinformation?.value?.toCPointer<ByteVar>(), length, resultlength?.value?.toCPointer<ByteVar>())

public actual fun ntRenameKey(keyhandle: Handle, newname: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntRenameKey(keyhandle?.value?.toCPointer<ByteVar>(), newname?.value?.toCPointer<ByteVar>())

public actual fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntRestoreKey(keyhandle?.value?.toCPointer<ByteVar>(), filehandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntRollbackRegistryTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntSaveKey(keyhandle?.value?.toCPointer<ByteVar>(), filehandle?.value?.toCPointer<ByteVar>())

public actual fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntSaveKeyEx(keyhandle?.value?.toCPointer<ByteVar>(), filehandle?.value?.toCPointer<ByteVar>(), format)

public actual fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: COpaquePointer?, keysetinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntSetInformationKey(keyhandle?.value?.toCPointer<ByteVar>(), keysetinformationclass, keysetinformation?.value?.toCPointer<ByteVar>(), keysetinformationlength)

public actual fun ntSetValueKey(keyhandle: Handle, valuename: COpaquePointer?, titleindex: UInt, type: UInt, data: COpaquePointer?, datasize: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_ntSetValueKey(keyhandle?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>(), titleindex, type, data?.value?.toCPointer<ByteVar>(), datasize)

public actual fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwCommitRegistryTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun zwCreateKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, disposition: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwCreateKey(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), titleindex, cls?.value?.toCPointer<ByteVar>(), createoptions, disposition?.value?.toCPointer<ByteVar>())

public actual fun zwCreateKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, transactionhandle: Handle, disposition: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwCreateKeyTransacted(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), titleindex, cls?.value?.toCPointer<ByteVar>(), createoptions, transactionhandle?.value?.toCPointer<ByteVar>(), disposition?.value?.toCPointer<ByteVar>())

public actual fun zwCreateRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, createoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwCreateRegistryTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), createoptions)

public actual fun zwDeleteKey(keyhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwDeleteKey(keyhandle?.value?.toCPointer<ByteVar>())

public actual fun zwDeleteValueKey(keyhandle: Handle, valuename: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwDeleteValueKey(keyhandle?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>())

public actual fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwEnumerateKey(keyhandle?.value?.toCPointer<ByteVar>(), index, keyinformationclass, keyinformation?.value?.toCPointer<ByteVar>(), length, resultlength?.value?.toCPointer<ByteVar>())

public actual fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwEnumerateValueKey(keyhandle?.value?.toCPointer<ByteVar>(), index, keyvalueinformationclass, keyvalueinformation?.value?.toCPointer<ByteVar>(), length, resultlength?.value?.toCPointer<ByteVar>())

public actual fun zwFlushKey(keyhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwFlushKey(keyhandle?.value?.toCPointer<ByteVar>())

public actual fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: COpaquePointer?, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwNotifyChangeMultipleKeys(masterkeyhandle?.value?.toCPointer<ByteVar>(), count, subordinateobjects?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext?.value?.toCPointer<ByteVar>(), iostatusblock?.value?.toCPointer<ByteVar>(), completionfilter, watchtree, buffer?.value?.toCPointer<ByteVar>(), buffersize, asynchronous)

public actual fun zwOpenKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwOpenKey(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun zwOpenKeyEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwOpenKeyEx(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), openoptions)

public actual fun zwOpenKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, transactionhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwOpenKeyTransacted(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), transactionhandle?.value?.toCPointer<ByteVar>())

public actual fun zwOpenKeyTransactedEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwOpenKeyTransactedEx(keyhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>(), openoptions, transactionhandle?.value?.toCPointer<ByteVar>())

public actual fun zwOpenRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwOpenRegistryTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwQueryKey(keyhandle?.value?.toCPointer<ByteVar>(), keyinformationclass, keyinformation?.value?.toCPointer<ByteVar>(), length, resultlength?.value?.toCPointer<ByteVar>())

public actual fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: COpaquePointer?, entrycount: UInt, valuebuffer: COpaquePointer?, bufferlength: COpaquePointer?, requiredbufferlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwQueryMultipleValueKey(keyhandle?.value?.toCPointer<ByteVar>(), valueentries?.value?.toCPointer<ByteVar>(), entrycount, valuebuffer?.value?.toCPointer<ByteVar>(), bufferlength?.value?.toCPointer<ByteVar>(), requiredbufferlength?.value?.toCPointer<ByteVar>())

public actual fun zwQueryValueKey(keyhandle: Handle, valuename: COpaquePointer?, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwQueryValueKey(keyhandle?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>(), keyvalueinformationclass, keyvalueinformation?.value?.toCPointer<ByteVar>(), length, resultlength?.value?.toCPointer<ByteVar>())

public actual fun zwRenameKey(keyhandle: Handle, newname: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwRenameKey(keyhandle?.value?.toCPointer<ByteVar>(), newname?.value?.toCPointer<ByteVar>())

public actual fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwRestoreKey(keyhandle?.value?.toCPointer<ByteVar>(), filehandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwRollbackRegistryTransaction(transactionhandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwSaveKey(keyhandle?.value?.toCPointer<ByteVar>(), filehandle?.value?.toCPointer<ByteVar>())

public actual fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwSaveKeyEx(keyhandle?.value?.toCPointer<ByteVar>(), filehandle?.value?.toCPointer<ByteVar>(), format)

public actual fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: COpaquePointer?, keysetinformationlength: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwSetInformationKey(keyhandle?.value?.toCPointer<ByteVar>(), keysetinformationclass, keysetinformation?.value?.toCPointer<ByteVar>(), keysetinformationlength)

public actual fun zwSetValueKey(keyhandle: Handle, valuename: COpaquePointer?, titleindex: UInt, type: UInt, data: COpaquePointer?, datasize: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssys_windows_wdk_system_registry_zwSetValueKey(keyhandle?.value?.toCPointer<ByteVar>(), valuename?.value?.toCPointer<ByteVar>(), titleindex, type, data?.value?.toCPointer<ByteVar>(), datasize)
