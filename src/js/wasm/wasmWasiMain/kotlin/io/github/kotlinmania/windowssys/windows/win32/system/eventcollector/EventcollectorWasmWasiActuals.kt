@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventcollector

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

// The host must provide the C companion wrapper exports in import module windowssys.
@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventcollectorEcClose")
private external fun wasiWindowssysWindowsWin32SystemEventcollectorEcClose(obj: Long): Int

public actual fun ecClose(obj: Long): Bool =
    wasiWindowssysWindowsWin32SystemEventcollectorEcClose(obj).toInt()

public actual fun ecDeleteSubscription(subscriptionname: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcDeleteSubscription")

public actual fun ecEnumNextSubscription(subscriptionenum: Long, subscriptionnamebuffersize: UInt, subscriptionnamebuffer: Pwstr, subscriptionnamebufferused: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcEnumNextSubscription")

public actual fun ecGetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EcVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcGetObjectArrayProperty")

public actual fun ecGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcGetObjectArraySize")

public actual fun ecGetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EcVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionProperty")

public actual fun ecGetSubscriptionRunTimeStatus(subscriptionname: Pcwstr, statusinfoid: EcSubscriptionRuntimeStatusInfoId, eventsourcename: Pcwstr, flags: UInt, statusvaluebuffersize: UInt, statusvaluebuffer: MutPtr<EcVariant>, statusvaluebufferused: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcGetSubscriptionRunTimeStatus")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement")
private external fun wasiWindowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(objectarray: Long, arrayindex: Int): Int

public actual fun ecInsertObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    wasiWindowssysWindowsWin32SystemEventcollectorEcInsertObjectArrayElement(objectarray, arrayindex.toInt()).toInt()

public actual fun ecOpenSubscription(subscriptionname: Pcwstr, accessmask: UInt, flags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcOpenSubscription")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum")
private external fun wasiWindowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(flags: Int): Long

public actual fun ecOpenSubscriptionEnum(flags: UInt): Long =
    wasiWindowssysWindowsWin32SystemEventcollectorEcOpenSubscriptionEnum(flags.toInt()).toLong()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement")
private external fun wasiWindowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(objectarray: Long, arrayindex: Int): Int

public actual fun ecRemoveObjectArrayElement(objectarray: Long, arrayindex: UInt): Bool =
    wasiWindowssysWindowsWin32SystemEventcollectorEcRemoveObjectArrayElement(objectarray, arrayindex.toInt()).toInt()

public actual fun ecRetrySubscription(subscriptionname: Pcwstr, eventsourcename: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcRetrySubscription")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventcollectorEcSaveSubscription")
private external fun wasiWindowssysWindowsWin32SystemEventcollectorEcSaveSubscription(subscription: Long, flags: Int): Int

public actual fun ecSaveSubscription(subscription: Long, flags: UInt): Bool =
    wasiWindowssysWindowsWin32SystemEventcollectorEcSaveSubscription(subscription, flags.toInt()).toInt()

public actual fun ecSetObjectArrayProperty(objectarray: Long, propertyid: EcSubscriptionPropertyId, arrayindex: UInt, flags: UInt, propertyvalue: MutPtr<EcVariant>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcSetObjectArrayProperty")

public actual fun ecSetSubscriptionProperty(subscription: Long, propertyid: EcSubscriptionPropertyId, flags: UInt, propertyvalue: MutPtr<EcVariant>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventcollectorEcSetSubscriptionProperty")
