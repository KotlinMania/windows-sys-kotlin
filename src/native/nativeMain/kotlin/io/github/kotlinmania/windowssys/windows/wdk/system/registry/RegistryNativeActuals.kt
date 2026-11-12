@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtCreateKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtDeleteKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtDeleteValueKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtEnumerateKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtEnumerateValueKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtFlushKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtOpenKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtOpenKeyEx
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtQueryKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtQueryValueKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtRenameKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtRestoreKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtSaveKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtSaveKeyEx
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtSetInformationKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryNtSetValueKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwCreateKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwDeleteKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwDeleteValueKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwEnumerateKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwEnumerateValueKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwFlushKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwOpenKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwOpenKeyEx
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwQueryKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwQueryValueKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwRenameKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwRestoreKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwSaveKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwSaveKeyEx
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwSetInformationKey
import io.github.kotlinmania.windowssys.windows.wdk.system.registry.cinterop.windowssysWindowsWdkSystemRegistryZwSetValueKey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction(transactionhandle.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun ntCreateKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, disposition: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtCreateKey(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), titleindex, cls.rawAddress.toCPointer<ByteVar>(), createoptions, disposition.rawAddress.toCPointer<ByteVar>())

public actual fun ntCreateKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), titleindex, cls.rawAddress.toCPointer<ByteVar>(), createoptions, transactionhandle.rawAddress.toCPointer<ByteVar>(), disposition.rawAddress.toCPointer<ByteVar>())

public actual fun ntCreateRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction(transactionhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), createoptions)

public actual fun ntDeleteKey(keyhandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtDeleteKey(keyhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ntDeleteValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtDeleteValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), valuename.rawAddress.toCPointer<ByteVar>())

public actual fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtEnumerateKey(keyhandle.rawAddress.toCPointer<ByteVar>(), index, keyinformationclass, keyinformation.rawAddress.toCPointer<ByteVar>(), length, resultlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtEnumerateValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), index, keyvalueinformationclass, keyvalueinformation.rawAddress.toCPointer<ByteVar>(), length, resultlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntFlushKey(keyhandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtFlushKey(keyhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr<ObjectAttributes>, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys(masterkeyhandle.rawAddress.toCPointer<ByteVar>(), count, subordinateobjects.rawAddress.toCPointer<ByteVar>(), event.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext.rawAddress.toCPointer<ByteVar>(), iostatusblock.rawAddress.toCPointer<ByteVar>(), completionfilter, watchtree, buffer.rawAddress.toCPointer<ByteVar>(), buffersize, asynchronous)

public actual fun ntOpenKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtOpenKey(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun ntOpenKeyEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtOpenKeyEx(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), openoptions)

public actual fun ntOpenKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, transactionhandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), transactionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ntOpenKeyTransactedEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), openoptions, transactionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun ntOpenRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction(transactionhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtQueryKey(keyhandle.rawAddress.toCPointer<ByteVar>(), keyinformationclass, keyinformation.rawAddress.toCPointer<ByteVar>(), length, resultlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr<KeyValueEntry>, entrycount: UInt, valuebuffer: MutPtr<CVoid>, bufferlength: MutPtr<UInt>, requiredbufferlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), valueentries.rawAddress.toCPointer<ByteVar>(), entrycount, valuebuffer.rawAddress.toCPointer<ByteVar>(), bufferlength.rawAddress.toCPointer<ByteVar>(), requiredbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntQueryValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtQueryValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), valuename.rawAddress.toCPointer<ByteVar>(), keyvalueinformationclass, keyvalueinformation.rawAddress.toCPointer<ByteVar>(), length, resultlength.rawAddress.toCPointer<ByteVar>())

public actual fun ntRenameKey(keyhandle: Handle, newname: ConstPtr<UnicodeString>): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtRenameKey(keyhandle.rawAddress.toCPointer<ByteVar>(), newname.rawAddress.toCPointer<ByteVar>())

public actual fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtRestoreKey(keyhandle.rawAddress.toCPointer<ByteVar>(), filehandle.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction(transactionhandle.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtSaveKey(keyhandle.rawAddress.toCPointer<ByteVar>(), filehandle.rawAddress.toCPointer<ByteVar>())

public actual fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtSaveKeyEx(keyhandle.rawAddress.toCPointer<ByteVar>(), filehandle.rawAddress.toCPointer<ByteVar>(), format)

public actual fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr<CVoid>, keysetinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtSetInformationKey(keyhandle.rawAddress.toCPointer<ByteVar>(), keysetinformationclass, keysetinformation.rawAddress.toCPointer<ByteVar>(), keysetinformationlength)

public actual fun ntSetValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, titleindex: UInt, type: UInt, data: ConstPtr<CVoid>, datasize: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryNtSetValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), valuename.rawAddress.toCPointer<ByteVar>(), titleindex, type, data.rawAddress.toCPointer<ByteVar>(), datasize)

public actual fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction(transactionhandle.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun zwCreateKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, disposition: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwCreateKey(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), titleindex, cls.rawAddress.toCPointer<ByteVar>(), createoptions, disposition.rawAddress.toCPointer<ByteVar>())

public actual fun zwCreateKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), titleindex, cls.rawAddress.toCPointer<ByteVar>(), createoptions, transactionhandle.rawAddress.toCPointer<ByteVar>(), disposition.rawAddress.toCPointer<ByteVar>())

public actual fun zwCreateRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction(transactionhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), createoptions)

public actual fun zwDeleteKey(keyhandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwDeleteKey(keyhandle.rawAddress.toCPointer<ByteVar>())

public actual fun zwDeleteValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwDeleteValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), valuename.rawAddress.toCPointer<ByteVar>())

public actual fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwEnumerateKey(keyhandle.rawAddress.toCPointer<ByteVar>(), index, keyinformationclass, keyinformation.rawAddress.toCPointer<ByteVar>(), length, resultlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwEnumerateValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), index, keyvalueinformationclass, keyvalueinformation.rawAddress.toCPointer<ByteVar>(), length, resultlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwFlushKey(keyhandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwFlushKey(keyhandle.rawAddress.toCPointer<ByteVar>())

public actual fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr<ObjectAttributes>, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys(masterkeyhandle.rawAddress.toCPointer<ByteVar>(), count, subordinateobjects.rawAddress.toCPointer<ByteVar>(), event.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext.rawAddress.toCPointer<ByteVar>(), iostatusblock.rawAddress.toCPointer<ByteVar>(), completionfilter, watchtree, buffer.rawAddress.toCPointer<ByteVar>(), buffersize, asynchronous)

public actual fun zwOpenKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwOpenKey(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun zwOpenKeyEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwOpenKeyEx(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), openoptions)

public actual fun zwOpenKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, transactionhandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), transactionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun zwOpenKeyTransactedEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx(keyhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>(), openoptions, transactionhandle.rawAddress.toCPointer<ByteVar>())

public actual fun zwOpenRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction(transactionhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwQueryKey(keyhandle.rawAddress.toCPointer<ByteVar>(), keyinformationclass, keyinformation.rawAddress.toCPointer<ByteVar>(), length, resultlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr<KeyValueEntry>, entrycount: UInt, valuebuffer: MutPtr<CVoid>, bufferlength: MutPtr<UInt>, requiredbufferlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), valueentries.rawAddress.toCPointer<ByteVar>(), entrycount, valuebuffer.rawAddress.toCPointer<ByteVar>(), bufferlength.rawAddress.toCPointer<ByteVar>(), requiredbufferlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwQueryValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwQueryValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), valuename.rawAddress.toCPointer<ByteVar>(), keyvalueinformationclass, keyvalueinformation.rawAddress.toCPointer<ByteVar>(), length, resultlength.rawAddress.toCPointer<ByteVar>())

public actual fun zwRenameKey(keyhandle: Handle, newname: ConstPtr<UnicodeString>): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwRenameKey(keyhandle.rawAddress.toCPointer<ByteVar>(), newname.rawAddress.toCPointer<ByteVar>())

public actual fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwRestoreKey(keyhandle.rawAddress.toCPointer<ByteVar>(), filehandle.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction(transactionhandle.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwSaveKey(keyhandle.rawAddress.toCPointer<ByteVar>(), filehandle.rawAddress.toCPointer<ByteVar>())

public actual fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwSaveKeyEx(keyhandle.rawAddress.toCPointer<ByteVar>(), filehandle.rawAddress.toCPointer<ByteVar>(), format)

public actual fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr<CVoid>, keysetinformationlength: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwSetInformationKey(keyhandle.rawAddress.toCPointer<ByteVar>(), keysetinformationclass, keysetinformation.rawAddress.toCPointer<ByteVar>(), keysetinformationlength)

public actual fun zwSetValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, titleindex: UInt, type: UInt, data: ConstPtr<CVoid>, datasize: UInt): Ntstatus =
    windowssysWindowsWdkSystemRegistryZwSetValueKey(keyhandle.rawAddress.toCPointer<ByteVar>(), valuename.rawAddress.toCPointer<ByteVar>(), titleindex, type, data.rawAddress.toCPointer<ByteVar>(), datasize)
