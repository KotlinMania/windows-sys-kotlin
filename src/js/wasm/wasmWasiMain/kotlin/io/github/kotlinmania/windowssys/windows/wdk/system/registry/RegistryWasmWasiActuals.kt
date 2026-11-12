@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.registry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun ntCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtCommitRegistryTransaction")

public actual fun ntCreateKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, disposition: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtCreateKey")

public actual fun ntCreateKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtCreateKeyTransacted")

public actual fun ntCreateRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtCreateRegistryTransaction")

public actual fun ntDeleteKey(keyhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtDeleteKey")

public actual fun ntDeleteValueKey(keyhandle: Handle, valuename: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtDeleteValueKey")

public actual fun ntEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtEnumerateKey")

public actual fun ntEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtEnumerateValueKey")

public actual fun ntFlushKey(keyhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtFlushKey")

public actual fun ntNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtNotifyChangeMultipleKeys")

public actual fun ntOpenKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtOpenKey")

public actual fun ntOpenKeyEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtOpenKeyEx")

public actual fun ntOpenKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, transactionhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtOpenKeyTransacted")

public actual fun ntOpenKeyTransactedEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtOpenKeyTransactedEx")

public actual fun ntOpenRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtOpenRegistryTransaction")

public actual fun ntQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtQueryKey")

public actual fun ntQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr, entrycount: UInt, valuebuffer: MutPtr, bufferlength: MutPtr, requiredbufferlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtQueryMultipleValueKey")

public actual fun ntQueryValueKey(keyhandle: Handle, valuename: ConstPtr, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtQueryValueKey")

public actual fun ntRenameKey(keyhandle: Handle, newname: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtRenameKey")

public actual fun ntRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtRestoreKey")

public actual fun ntRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtRollbackRegistryTransaction")

public actual fun ntSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtSaveKey")

public actual fun ntSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtSaveKeyEx")

public actual fun ntSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr, keysetinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtSetInformationKey")

public actual fun ntSetValueKey(keyhandle: Handle, valuename: ConstPtr, titleindex: UInt, type: UInt, data: ConstPtr, datasize: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryNtSetValueKey")

public actual fun zwCommitRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwCommitRegistryTransaction")

public actual fun zwCreateKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, disposition: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwCreateKey")

public actual fun zwCreateKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, titleindex: UInt, cls: ConstPtr, createoptions: UInt, transactionhandle: Handle, disposition: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwCreateKeyTransacted")

public actual fun zwCreateRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwCreateRegistryTransaction")

public actual fun zwDeleteKey(keyhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwDeleteKey")

public actual fun zwDeleteValueKey(keyhandle: Handle, valuename: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwDeleteValueKey")

public actual fun zwEnumerateKey(keyhandle: Handle, index: UInt, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwEnumerateKey")

public actual fun zwEnumerateValueKey(keyhandle: Handle, index: UInt, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwEnumerateValueKey")

public actual fun zwFlushKey(keyhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwFlushKey")

public actual fun zwNotifyChangeMultipleKeys(masterkeyhandle: Handle, count: UInt, subordinateobjects: ConstPtr, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, completionfilter: UInt, watchtree: Boolean, buffer: MutPtr, buffersize: UInt, asynchronous: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwNotifyChangeMultipleKeys")

public actual fun zwOpenKey(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwOpenKey")

public actual fun zwOpenKeyEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwOpenKeyEx")

public actual fun zwOpenKeyTransacted(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, transactionhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwOpenKeyTransacted")

public actual fun zwOpenKeyTransactedEx(keyhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, openoptions: UInt, transactionhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwOpenKeyTransactedEx")

public actual fun zwOpenRegistryTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwOpenRegistryTransaction")

public actual fun zwQueryKey(keyhandle: Handle, keyinformationclass: KeyInformationClass, keyinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwQueryKey")

public actual fun zwQueryMultipleValueKey(keyhandle: Handle, valueentries: MutPtr, entrycount: UInt, valuebuffer: MutPtr, bufferlength: MutPtr, requiredbufferlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwQueryMultipleValueKey")

public actual fun zwQueryValueKey(keyhandle: Handle, valuename: ConstPtr, keyvalueinformationclass: KeyValueInformationClass, keyvalueinformation: MutPtr, length: UInt, resultlength: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwQueryValueKey")

public actual fun zwRenameKey(keyhandle: Handle, newname: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwRenameKey")

public actual fun zwRestoreKey(keyhandle: Handle, filehandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwRestoreKey")

public actual fun zwRollbackRegistryTransaction(transactionhandle: Handle, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwRollbackRegistryTransaction")

public actual fun zwSaveKey(keyhandle: Handle, filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwSaveKey")

public actual fun zwSaveKeyEx(keyhandle: Handle, filehandle: Handle, format: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwSaveKeyEx")

public actual fun zwSetInformationKey(keyhandle: Handle, keysetinformationclass: KeySetInformationClass, keysetinformation: ConstPtr, keysetinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwSetInformationKey")

public actual fun zwSetValueKey(keyhandle: Handle, valuename: ConstPtr, titleindex: UInt, type: UInt, data: ConstPtr, datasize: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemRegistryZwSetValueKey")
