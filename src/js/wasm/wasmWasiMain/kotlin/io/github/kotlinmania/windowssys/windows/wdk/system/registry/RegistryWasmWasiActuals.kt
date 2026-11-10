@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

public actual fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, disposition: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, transactionhandle: Handle, disposition: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntCreateRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntDeleteKey(keyhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntDeleteValueKey(keyhandle: Handle, valuename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntFlushKey(keyhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: COpaquePointer?, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenKeyEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, transactionhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenKeyTransactedEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntOpenRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: COpaquePointer?, entrycount: UInt, valuebuffer: COpaquePointer?, bufferlength: COpaquePointer?, requiredbufferlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntQueryValueKey(keyhandle: Handle, valuename: COpaquePointer?, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRenameKey(keyhandle: Handle, newname: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: COpaquePointer?, keysetinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ntSetValueKey(keyhandle: Handle, valuename: COpaquePointer?, titleindex: UInt, type: UInt, data: COpaquePointer?, datasize: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, disposition: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, titleindex: UInt, cls: COpaquePointer?, createoptions: UInt, transactionhandle: Handle, disposition: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwCreateRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwDeleteKey(keyhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwDeleteValueKey(keyhandle: Handle, valuename: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwFlushKey(keyhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: COpaquePointer?, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, completionfilter: UInt, watchtree: Boolean, buffer: COpaquePointer?, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenKey(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenKeyEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenKeyTransacted(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, transactionhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenKeyTransactedEx(keyhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwOpenRegistryTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: COpaquePointer?, entrycount: UInt, valuebuffer: COpaquePointer?, bufferlength: COpaquePointer?, requiredbufferlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwQueryValueKey(keyhandle: Handle, valuename: COpaquePointer?, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: COpaquePointer?, length: UInt, resultlength: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRenameKey(keyhandle: Handle, newname: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: COpaquePointer?, keysetinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun zwSetValueKey(keyhandle: Handle, valuename: COpaquePointer?, titleindex: UInt, type: UInt, data: COpaquePointer?, datasize: UInt): Ntstatus =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
