package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

public expect fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus

public expect fun ntCreateKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, disposition: MutPtr<UInt>): Ntstatus

public expect fun ntCreateKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr<UInt>): Ntstatus

public expect fun ntCreateRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt): Ntstatus

public expect fun ntDeleteKey(keyhandle: Handle): Ntstatus

public expect fun ntDeleteValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>): Ntstatus

public expect fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus

public expect fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus

public expect fun ntFlushKey(keyhandle: Handle): Ntstatus

public expect fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr<ObjectAttributes>, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus

public expect fun ntOpenKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntOpenKeyEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt): Ntstatus

public expect fun ntOpenKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, transactionhandle: Handle): Ntstatus

public expect fun ntOpenKeyTransactedEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt, transactionhandle: Handle): Ntstatus

public expect fun ntOpenRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus

public expect fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr<KeyValueEntry>, entrycount: UInt, valuebuffer: MutPtr<CVoid>, bufferlength: MutPtr<UInt>, requiredbufferlength: MutPtr<UInt>): Ntstatus

public expect fun ntQueryValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus

public expect fun ntRenameKey(keyhandle: Handle, newname: ConstPtr<UnicodeString>): Ntstatus

public expect fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus

public expect fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus

public expect fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus

public expect fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus

public expect fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr<CVoid>, keysetinformationlength: UInt): Ntstatus

public expect fun ntSetValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, titleindex: UInt, type: UInt, data: ConstPtr<CVoid>, datasize: UInt): Ntstatus

public expect fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus

public expect fun zwCreateKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, disposition: MutPtr<UInt>): Ntstatus

public expect fun zwCreateKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, titleindex: UInt, cls: ConstPtr<UnicodeString>, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr<UInt>): Ntstatus

public expect fun zwCreateRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt): Ntstatus

public expect fun zwDeleteKey(keyhandle: Handle): Ntstatus

public expect fun zwDeleteValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>): Ntstatus

public expect fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus

public expect fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus

public expect fun zwFlushKey(keyhandle: Handle): Ntstatus

public expect fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr<ObjectAttributes>, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr<CVoid>, buffersize: UInt, asynchronous: Boolean): Ntstatus

public expect fun zwOpenKey(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwOpenKeyEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt): Ntstatus

public expect fun zwOpenKeyTransacted(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, transactionhandle: Handle): Ntstatus

public expect fun zwOpenKeyTransactedEx(keyhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, openoptions: UInt, transactionhandle: Handle): Ntstatus

public expect fun zwOpenRegistryTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus

public expect fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr<KeyValueEntry>, entrycount: UInt, valuebuffer: MutPtr<CVoid>, bufferlength: MutPtr<UInt>, requiredbufferlength: MutPtr<UInt>): Ntstatus

public expect fun zwQueryValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr<CVoid>, length: UInt, resultlength: MutPtr<UInt>): Ntstatus

public expect fun zwRenameKey(keyhandle: Handle, newname: ConstPtr<UnicodeString>): Ntstatus

public expect fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus

public expect fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus

public expect fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus

public expect fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus

public expect fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr<CVoid>, keysetinformationlength: UInt): Ntstatus

public expect fun zwSetValueKey(keyhandle: Handle, valuename: ConstPtr<UnicodeString>, titleindex: UInt, type: UInt, data: ConstPtr<CVoid>, datasize: UInt): Ntstatus
